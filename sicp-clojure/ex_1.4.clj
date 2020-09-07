(defn a-plus-abs-b [a b]
	(
		(if (> b 0) + -) ; the result is an operator + or -
		a 
		b)
)

(println (a-plus-abs-b 3 -3))