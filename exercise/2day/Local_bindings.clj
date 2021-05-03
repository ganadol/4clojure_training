;; 2 일차
;; Local bindings(Local bindings)
;; url https://www.4clojure.com/problem/35
;; 원문

;; 한글
;; 클로저에서 특수 형식(special form)인 let을 이용하면 값을 지역 심볼에 바인딩할 수 있다.
;; (= __ (let [x 5] (+ 2 x)))
;; (= __ (let [x 3, y 10] (- y x)))
;; (= __ (let [x 21] (let [y 3] (/ x y))))

;; answer 7
(= 7 (let [x 5] (+ 2 x)))
(= 7 (let [x 3, y 10] (- y x)))
(= 7 (let [x 21] (let [y 3] (/ x y))))
