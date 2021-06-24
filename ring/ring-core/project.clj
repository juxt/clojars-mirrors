(defproject pro.juxt.clojars-mirrors.ring/ring-core "1.9.2"
  :description "Ring core libraries (mirrored from Clojars by JUXT)"
  :url "https://github.com/ring-clojure/ring"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :scm {:dir "../.."}

  :dependencies [^:inline-dep [ring/ring-core "1.9.2"
                               :exclusions [commons-fileupload
                                            commons-io
                                            crypto-equality
                                            crypto-random
                                            commons-codec]]
                 [commons-fileupload "1.4"]
                 [commons-io "2.6"]
                 [crypto-equality "1.0.0"]
                 [crypto-random "1.2.0"]
                 [commons-codec "1.15"]]

  :exclusions [org.clojure/clojure]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"}

  :pom-addition ([:developers
                  [:developer
                   [:id "weavejester"]
                   [:name "James Reeves"]]
                  [:developer
                   [:id "juxt"]
                   [:name "JUXT"]
                   [:roles [:role "packager"]]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
