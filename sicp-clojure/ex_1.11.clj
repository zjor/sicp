; f(n) = n if n < 3 else f(n - 1) + 2 * f(n - 2) + 3 * f(n - 3)
; write a procedure f by means of a recursive process
; write a procedure f by means of an iterative process

(ns ex_1.11)

; recursive implementation
(defn f [n] 
	(if (< n 3)
	  n
	  (+ 
	    (f (- n 1))
	    (* 2 (f (- n 2)))
	    (* 3 (f (- n 3)))))
)

; interative implementation
(defn f_iter [n]

		(defn next [f1 f2 f3]
		  (+ f1 (* 2 f2) (* 3 f3)))

		(defn iter [n f1 f2 f3]
		  (if (< n 0) 
			   f1
			   (iter (- n 1) (next f1 f2 f3) f1 f2)))

	(if (< n 3) n (iter (- n 3) 2 1 0)))


; TODO: add unit tests
(println (f 1))
(println (f 2))
(println (f 3))
(println (f 4))

(println (f_iter 4))