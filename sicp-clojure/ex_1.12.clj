; Write a procedure that computes elements of Pascal's triangle by means of a recursive process
(ns pascal_triangle)

(defn pascal [row, col]

  (defn on-edge? []
    (cond
      (= row 1) true
      (= col row) true
      :else false))

  (defn outside? []
    (cond
      (< row 1) true
      (< col 1) true
      (> col row) true
      :else false))

  (cond 
    (outside?) 0
    (on-edge?) 1
    :else 
      (+ 
      		(pascal (- row 1) (- col 1)) 
      		(pascal (- row 1) col))))


; TODO chnage to for-loop construction
(defn print-row [row]

  (defn print-iter [row col]
    (print (str (pascal row col) " "))
    (cond 
      (< col row) (print-iter row (+ col 1))
      :else (println)))

  (print-iter row 1))


(print-row 4)
(print-row 5)