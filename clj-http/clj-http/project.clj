(defproject pro.juxt.clojars-mirrors.clj-http/clj-http "3.12.2"
  :description "A Clojure HTTP library wrapping the Apache HttpComponents client (mirrored from Clojars by JUXT)"
  :url "https://github.com/dakrone/clj-http/"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/mit-license.php"}
  :scm {:dir "../.."}

  :dependencies [[org.clojure/clojure "1.10.3"]
                 ^:inline-dep [clj-http "3.12.2"
                               :exclusions [org.clojure/clojure
                                            commons-codec
                                            commons-io
                                            org.apache.httpcomponents/httpasyncclient
                                            org.apache.httpcomponents/httpclient-cache
                                            org.apache.httpcomponents/httpclient
                                            org.apache.httpcomponents/httpcore
                                            org.apache.httpcomponents/httpmime
                                            potemkin]]
                 [commons-codec "1.15"]
                 [commons-io "2.8.0"]

                 [pro.juxt.clojars-mirrors.clj-commons/potemkin "0.4.5"]

                 [org.apache.httpcomponents/httpasyncclient "4.1.4"]
                 [org.apache.httpcomponents/httpclient-cache "4.5.13"]
                 [org.apache.httpcomponents/httpclient "4.5.13"]
                 [org.apache.httpcomponents/httpcore "4.4.14"]
                 [org.apache.httpcomponents/httpmime "4.5.13"]]

  :exclusions [org.clojure/clojure]

  :plugins [[io.github.jarohen/mranderson "0.5.4-SNAPSHOT"]]

  :mranderson {:project-prefix "juxt.clojars-mirrors"
               :prefix-exclusions ["juxt.clojars-mirrors"
                                   "clojure.lang"]}

  :java-source-paths ["target/generated-java"]

  :pom-addition ([:developers
                  [:developer
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
