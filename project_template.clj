(defproject pro.juxt.clojars-mirrors.<groupId>/<artifactId> "<version>-SNAPSHOT"
  ;; TODO copy :description, :url and :license from library's `project.clj`
  :scm {:dir "../.."}

  :dependencies [^:inline-dep [<groupId>/<artifactId> "<version>"
                               ;; TODO exclude everything already on Central
                               :exclusions []]
                 ;; and depend on it here (without `^:inline-dep`)
                 ]

  :exclusions [org.clojure/clojure]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"}

  :pom-addition ([:developers
                  [:developer
                   ;; TODO
                   [:id "<github-id>"]
                   [:name "<name>"]]
                  [:developer
                   [:id "juxt"]
                   [:name "JUXT"]
                   [:roles [:role "packager"]]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
