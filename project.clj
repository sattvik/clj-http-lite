(defproject clj-http-lite "0.2.1-SNAPSHOT"
  :description "A Clojure HTTP library similar to clj-http, but more lightweight."
  :url "https://github.com/hiredman/clj-http-lite/"
  :repositories {"sona" "http://oss.sonatype.org/content/repositories/snapshots"}
  :warn-on-reflection false
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [slingshot "0.10.3"]]
  :profiles {:dev {:dependencies [[ring/ring-jetty-adapter "1.2.1"]
                                  [ring/ring-devel "1.2.1"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0-alpha2"]]}}
  :dev-dependencies [[ring/ring-jetty-adapter "1.0.2"]
                     [ring/ring-devel "1.0.2"]
                     [lein-multi "1.1.0"]]
  :test-selectors {:default  #(not (:integration %))
                   :integration :integration
                   :all (constantly true)}
  :aliases {"all" ["with-profile" "dev,1.3:dev,1.4:dev:dev,1.6"]}
  :checksum-deps true)
