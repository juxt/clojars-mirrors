(defproject pro.juxt.clojars-mirrors.weavejester/dependency "0.2.1"
  :description "A data structure for representing dependency graphs (mirrored from Clojars by JUXT)"
  :url "https://github.com/weavejester/dependency"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :scm {:dir "../.."}

  :dependencies [^:inline-dep [weavejester/dependency "0.2.1"
                               :exclusions []]]

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
