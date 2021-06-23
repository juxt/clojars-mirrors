(defproject pro.juxt.clojars-mirrors.hiccup/hiccup "2.0.0-alpha2"
  :description "A fast library for rendering HTML in Clojure (mirrored to Clojars by JUXT)"
  :url "http://github.com/weavejester/hiccup"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:dir "../.."}

  :dependencies [^:inline-dep [hiccup/hiccup "2.0.0-alpha2"]]

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
