#!/usr/bin/env bash

set -e

[ $# -gt 1 ] || (echo 'Usage: build.sh <jar|install|deploy> <dir>' && exit 1)

(
    CMD=$1; shift;
    cd $1
    shift;

    set -x

    lein do clean, inline-deps
    lein with-profile +plugin.mranderson/config $CMD $@
)
