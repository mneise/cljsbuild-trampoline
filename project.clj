(defproject cljsbuild-trampoline "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target"
  :plugins [[lein-cljsbuild "1.1.2"]]
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :compiler {:main cljsbuild-trampoline.core
                                   :output-to "out/main.js"
                                   :output-dir "out"
                                   :verbose true
                                   :pretty-print true }}]})
