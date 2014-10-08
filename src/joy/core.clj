(ns joy.core)
(require '[clojure.java.jdbc :as j])

(defn -main 
  "I don't do a whole lot."
  [username password]
  (def db2-db {:subprotocol "db2"
                 :subname "//127.0.0.1:50000/SAMPLE"
                 :user username
                 :password password})

  (println
    (j/query db2-db
             ["select * from syscat.tables"])))
