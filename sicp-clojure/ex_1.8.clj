; Implement Newton's method for cube-root using approximation
; y' = (x / y^2 + 2 * y) / 3

(defn square [x] (* x x))

(defn abs [x] 
	(if (> x 0) x (- x))
)

(defn average [x y]
	(/ (+ x y) 2)
)


(defn cube-root [x]
	(defn iter [guess]

		(defn improve []
			(/ 
				(
					+
					(/ x (* guess guess))
					(* 2.0 guess)
				) 
				3.0)
		)
		
		; considers current guess and an improvement (consecutive value)
		(defn good-enough? []
			(< (abs (- (improve) guess)) 0.001)
		)

		(if (good-enough?)
			guess
			(iter (improve))
		)
	)

	(iter 1.0)
)

(println (cube-root 27.0))

; TODO: use namespaces and reuse methods