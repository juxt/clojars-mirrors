#!/usr/bin/env bash

set -e

[ $# -eq 3 ] || (echo 'Usage: create.sh <groupId> <artifactId> <version>' && exit 1)

(
    cd $(dirname $0)/..
    mkdir -p "$1"/"$2"

    cat project_template.clj \
        | sed "s/<groupId>/$1/g" \
        | sed "s/<artifactId>/$2/g" \
        | sed "s/<version>/$3/g" \
        > "$1/$2/project.clj"

    echo "Created $1/$2/project.clj for you to finish off. Deps as follows:"

    cd "$1/$2"
    lein with-profile -dev,-user,-base deps :tree
)
