; Exercise 1.3
; 
; Define a procedure that takes three numbers as arguments and returns the sum of the squares of the two larger numbers

(defn square [x] (* x x))

(defn sum-of-squares [x y] (+ (square x) (square y)))
 
(defn first-max [a b c]
	(cond
		(and (> a b) (> a c)) a
		(and (> b a) (> b c)) b
		:else c
	)
)

(defn second-max [a b c]
	(let [x (first-max a b c)]
		(cond
			(= x a) (max b c)
			(= x b) (max a c)
			:else (max a b)
		)	
	)
)

(defn sum-of-two-larger-of-three [a b c]
	(let [[x y] [(first-max a b c) (second-max a b c)]]
		(sum-of-squares x y)
	)
)

(println (sum-of-two-larger-of-three 3 4 1))
(println (sum-of-two-larger-of-three 3 1 4))
(println (sum-of-two-larger-of-three 1 3 4))

; TODO: write unit tests