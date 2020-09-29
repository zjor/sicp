; Calculate number of ways to change given amount using coins of type [1, 5, 10, 25, 50]
; Estimate order of growth in space and number of steps as the amount grows

(ns coin-change)

(defn denomination [kind]
  (cond 
    (= kind 1) 1
    (= kind 2) 5
    (= kind 3) 10
    (= kind 4) 25
    (= kind 5) 50))

(defn count-change-iter [amount kinds]
  (cond
    (= amount 0) 1
    (or (< amount 0) (= kinds 0)) 0
    :else (+
      (count-change-iter amount (- kinds 1))
      (count-change-iter (- amount (denomination kinds)) kinds))))

(defn count-change [amount]
  (count-change-iter amount 5))

(println (count-change 100))