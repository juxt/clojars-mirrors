(defproject pro.juxt.clojars-mirrors.cheshire/cheshire "5.10.0"
  :description "JSON and JSON SMILE encoding, fast (mirrored from Clojars by JUXT)"
  :url "https://github.com/dakrone/cheshire"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"
            :distribution :repo}
  :scm {:dir "../.."}

  :dependencies [^:inline-dep [cheshire/cheshire "5.10.0"
                               :exclusions [com.fasterxml.jackson.core/jackson-core
                                            com.fasterxml.jackson.dataformat/jackson-dataformat-cbor
                                            com.fasterxml.jackson.dataformat/jackson-dataformat-smile]]
                 [com.fasterxml.jackson.core/jackson-core "2.10.2"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-cbor "2.10.2"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-smile "2.10.2"]]

  :exclusions [org.clojure/clojure]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"}

  ;; empty JARs to keep Maven Central happy
  :classifiers {:sources {:jar-exclusions [#""]}
                :javadoc {:jar-exclusions [#""]}}

  :pom-addition ([:developers
                  [:developer
                   ;; TODO
                   [:id "dakrone"]
                   [:name "Lee Hinman"]]
                  [:developer
                   [:id "juxt"]
                   [:name "JUXT"]
                   [:roles [:role "packager"]]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
