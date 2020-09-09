; Rework good-enough? so that it stops when the change is small

(defn square [x] (* x x))

(defn abs [x] 
	(if (> x 0) x (- x))
)

(defn average [x y]
	(/ (+ x y) 2)
)


(defn sqrt [x]
	(defn sqrt-iter [guess]

		(defn improve []
			(average guess (/ x guess))
		)

		(defn good-enough? []
			(< (abs (- (square guess) x)) 0.001)
		)

		(if (good-enough?)
			guess
			(sqrt-iter (improve))
		)
	)

	(sqrt-iter 1.0)
)

(println (sqrt 2.0))