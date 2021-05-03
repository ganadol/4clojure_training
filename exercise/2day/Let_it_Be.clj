;; 2 일차
;; Let 사용하기 (Let it Be)
;; url https://www.4clojure.com/problem/35
;; 원문

;; 한글
;; 지역심볼 x,y,z에 값을 바인딩해 다음 식들이 모두 참이 되도록 만들어라.
;; (= 10 (let __ (+ x y)))
;; (= 4 (let __ (+ y z)))
;; (= 1 (let __ z)))

;; answer [x 7 y 3 z 1]
(= 10 (let [x 7 y 3 z 1] (+ x y)))
(= 4 (let [x 7 y 3 z 1] (+ y z)))
(= 1 (let [x 7 y 3 z 1] z))
