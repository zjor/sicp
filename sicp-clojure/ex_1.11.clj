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

(println (f 1))
(println (f 2))
(println (f 3))
(println (f 4))