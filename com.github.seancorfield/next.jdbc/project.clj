(defproject pro.juxt.clojars-mirrors.com.github.seancorfield/next.jdbc "1.2.674"
  :description "A modern low-level Clojure wrapper for JDBC-based access to databases (mirrored from Clojars by JUXT)"
  :url "https://github.com/seancorfield/next.jdbc"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:dir "../.."}

  :dependencies [^:inline-dep [com.github.seancorfield/next.jdbc "1.2.674"
                               :exclusions [org.clojure/java.data]]
                 [org.clojure/java.data "1.0.86"]]

  :exclusions [org.clojure/clojure]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"}

  :pom-addition ([:developers
                  [:developer
                   [:id "seancorfield"]
                   [:name "Sean Corfield"]]
                  [:developer
                   [:id "juxt"]
                   [:name "JUXT"]
                   [:roles [:role "packager"]]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
