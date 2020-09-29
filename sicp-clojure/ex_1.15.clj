; sin(x) = 3 * sin(x / 3) - 4 * sin^3(x / 3)
(ns sine-approximation)

(defn abs [x] (if (> x 0) x (- x)))

(defn cube [x] (* x x x))

(defn p [x] (- (* 3 x) (* 4 (cube x))))

(defn sine [angle]
  (cond
    (< (abs angle) 0.1) angle
    :else (p (sine (/ angle 3)))))

(println (sine 1.5))