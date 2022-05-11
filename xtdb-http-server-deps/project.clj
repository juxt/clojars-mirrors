(defproject pro.juxt.clojars-mirrors.xtdb/xtdb-http-server-deps "0.0.2"
  :description "XTDB's http-server deps mirrored from Clojars. See individual projects for licenses."
  :url "https://github.com/juxt/clojars-mirrors"
  :licenses [{:name "Eclipse Public License"
              :url "http://www.eclipse.org/legal/epl-v10.html"}]
  :scm {:dir ".."}

  :dependencies [[org.clojure/clojure "1.10.3" :scope "provided"]
                 ^:inline-dep [ring/ring-core "1.9.4"
                               :exclusions [commons-fileupload
                                            commons-io
                                            commons-codec
                                            crypto-equality
                                            crypto-random]]
                 ^:inline-dep [info.sunng/ring-jetty9-adapter "0.14.2"
                               :exclusions [org.eclipse.jetty.http2/http2-server
                                            org.eclipse.jetty.websocket/websocket-server
                                            org.eclipse.jetty.websocket/websocket-servlet
                                            org.eclipse.jetty/jetty-alpn-server
                                            org.eclipse.jetty/jetty-server]]
                 ^:inline-dep [ring-cors "0.1.13"]
                 ^:inline-dep [metosin/muuntaja "0.6.8"
                               :exclusions [com.cognitect/transit-clj]]
                 ^:inline-dep [metosin/jsonista "0.3.5"
                               :exclusions [com.fasterxml.jackson.datatype/jackson-datatype-jsr310
                                            com.fasterxml.jackson.core/jackson-core
                                            com.fasterxml.jackson.core/jackson-databind]]
                 ^:inline-dep [metosin/reitit-core "0.5.15"]
                 ^:inline-dep [metosin/reitit-swagger "0.5.15"]
                 ^:inline-dep [metosin/reitit-middleware "0.5.15"
                               :exclusions [org.clojure/spec.alpha
                                            org.clojure/core.rrb-vector]]
                 ^:inline-dep [metosin/reitit-ring "0.5.15"]
                 ^:inline-dep [metosin/reitit-spec "0.5.15"]


                 ;; transitive deps from the above
                 [org.eclipse.jetty.http2/http2-server "9.4.43.v20210629"]
                 [org.eclipse.jetty.websocket/websocket-server "9.4.43.v20210629"]
                 [org.eclipse.jetty.websocket/websocket-servlet "9.4.43.v20210629"]
                 [org.eclipse.jetty/jetty-alpn-server "9.4.43.v20210629"]
                 [org.eclipse.jetty/jetty-alpn-openjdk8-server "9.4.43.v20210629"]
                 [org.eclipse.jetty/jetty-server "9.4.43.v20210629"]
                 [com.cognitect/transit-clj "1.0.324"]
                 [com.fasterxml.jackson.datatype/jackson-datatype-jsr310 "2.12.5"]
                 [com.fasterxml.jackson.core/jackson-core "2.12.5"]
                 [com.fasterxml.jackson.core/jackson-databind "2.12.5"]
                 [org.clojure/core.rrb-vector "0.1.2"]
                 [org.clojure/spec.alpha "0.2.194"]
                 [commons-fileupload "1.4"]
                 [commons-io "2.11.0"]
                 [commons-codec "1.15"]
                 [crypto-equality "1.0.0"]
                 [crypto-random "1.2.1"]]

  :exclusions [org.clojure/clojure]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"}

  ;; empty JARs to keep Maven Central happy
  :classifiers {:sources {:jar-exclusions [#""]}
                :javadoc {:jar-exclusions [#""]}}

  :pom-addition ([:developers
                  [:developer
                   [:id "juxt"]
                   [:name "JUXT"]
                   [:roles [:role "packager"]]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
