(reduce + (map #(Integer/parseInt %)
               (clojure.string/split-lines
                (slurp "./input.txt"))))
