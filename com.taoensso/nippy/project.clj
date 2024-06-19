(defproject pro.juxt.clojars-mirrors.com.taoensso/nippy "3.4.2-1"
  :description "High-performance serialization library for Clojure (mirrored from Clojars by JUXT)"
  :url "https://github.com/ptaoussanis/nippy"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:dir "../.."}

  :dependencies [[org.clojure/clojure "1.11.1"]
                 ^:inline-dep
                 [com.taoensso/nippy "3.4.2" :exclusions [org.clojure/tools.reader
                                                          org.iq80.snappy/snappy
                                                          org.lz4/lz4-java
                                                          org.tukaani/xz
                                                          io.airlift/aircompressor]]

                 ^:inline-dep
                 [com.taoensso/encore "3.112.0" :exclusions [org.clojure/tools.reader
                                                             org.iq80.snappy/snappy
                                                             org.lz4/lz4-java
                                                             org.tukaani/xz]]

                 [org.clojure/tools.reader "1.3.4"]
                 [org.iq80.snappy/snappy "0.4"]
                 [org.lz4/lz4-java "1.7.1"]
                 [org.tukaani/xz "1.8"]
                 [io.airlift/aircompressor "0.27"]]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars.mirrors"}

  :jar-exclusions [#".cljx$"]

  :pom-addition ([:developers
                  [:developer
                   [:id "ptaoussanis"]
                   [:name "Peter Taoussanis"]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
