(def p (p))

(defn text [x y]
	(if (= x 0) 0 y)
)

(test 0 p)
; the line above results in "Attempting to call unbound fn: #'user/p" error
; meaning that Clojure uses applicative-order evaluation