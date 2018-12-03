(def fileReader (slurp "./input.txt"))
(def input (clojure.string/split-lines fileReader))
(def numbers (map #(Integer/parseInt %) input))
(reduce + numbers)
