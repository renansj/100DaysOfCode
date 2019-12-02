(defn hello-world[]
  (println "Hello, world!"))

(defn average [a b]
  (println "Function called")
  (println "** first argument:" a)
  (println "** second argument:" b)
  (/ (+ a b) 2.0))

(hello-world)

(average 5 5)
