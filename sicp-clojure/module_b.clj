(ns module-b
	(:require [module-a :as a]))



(println (a/square 10))
; clojure -i module_a.clj module_b.clj
; https://www.braveclojure.com/organization/
; https://gist.github.com/ghoseb/287710/