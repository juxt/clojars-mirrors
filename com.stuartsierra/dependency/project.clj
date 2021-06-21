(defproject pro.juxt.clojars-mirrors.com.stuartsierra/dependency "1.0.0"
  :description "A data structure for representing dependency graphs (mirrored from Clojars by JUXT)"
  :url "https://github.com/stuartsierra/dependency"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:dir "../.."}

  :dependencies [^:inline-dep [com.stuartsierra/dependency "1.0.0"]]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"}

  :pom-addition ([:developers
                  [:developer
                   [:id "stuartsierra"]
                   [:name "Stuart Sierra"]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
