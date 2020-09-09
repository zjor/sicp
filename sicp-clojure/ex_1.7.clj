; Rework good-enough? so that it stops when the change is small

(defn square [x] (* x x))

(defn abs [x] 
	(if (> x 0) x (- x))
)

(defn good-enough? [guess x]
	(< (abs (- (square guess) x)) 0.001)
)

(defn average [x y]
	(/ (+ x y) 2)
)

(defn improve [guess x]
	(average guess (/ x guess))
)

(defn sqrt [x]

	(defn sqrt-iter [guess]
		(if (good-enough? guess x)
			guess
			(sqrt-iter (improve guess x) x)
		)
	)

	(sqrt-iter 1.0 x)
)

(println (sqrt 2.0))