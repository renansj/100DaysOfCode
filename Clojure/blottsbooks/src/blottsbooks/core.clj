(ns blottsbooks.core
  (:gen-class))

(defn say-welcome [what]
  (println "Welcome to" what "!"))

(defn author [name]
  (println "Hey," name "is writing a book"))

(defn -main []
  (say-welcome "Blotts Books")
  (author "Renan"))
