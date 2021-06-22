(defproject pro.juxt.clojars-mirrors.camel-snake-kebab/camel-snake-kebab "0.4.2"
  :description "A library for word case conversions (mirrored from Clojars by JUXT)"
  :url "https://clj-commons.org/camel-snake-kebab/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:dir "../.."}

  :dependencies [^:inline-dep [camel-snake-kebab/camel-snake-kebab "0.4.2"]]

  :exclusions [org.clojure/clojure]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"}

  :pom-addition ([:developers
                  [:developer
                   [:id "clj-commons"]
                   [:name "Clojure Commons"]]
                  [:developer
                   [:id "juxt"]
                   [:name "JUXT"]
                   [:roles [:role "packager"]]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
