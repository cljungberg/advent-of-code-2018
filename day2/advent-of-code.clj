(def input (clojure.string/split-lines
            (slurp "./input.txt")))

(defn count-letters [number boxId]
  (def found-letters (count (filter #(= number (second %)) (frequencies boxId))))
  (if (> found-letters 0) 1 0))

(def two-letters (map #(count-letters 2 %) input))
(def three-letters (map #(count-letters 3 %) input))

(* (reduce + two-letters) (reduce + three-letters))

