(defproject pro.juxt.clojars-mirrors.edn-query-language/eql "2021.02.28"
  :description "EDN Query Language support library (mirrored from Clojars by JUXT)"
  :url "https://github.com/edn-query-language/eql"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :scm {:dir "../.."}

  :dependencies [^:inline-dep [edn-query-language/eql "2021.02.28"
                               :exclusions [org.clojure/core.specs.alpha
                                            org.clojure/spec.alpha]]
                 [org.clojure/core.specs.alpha "0.2.44"]
                 [org.clojure/spec.alpha "0.2.176"]]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"}

  :pom-addition ([:developers
                  [:developer
                   [:id "wilkerlucio"]
                   [:name "Wilker Lúcio"]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
