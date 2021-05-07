;; 5일차
;; 시퀀스 반복하기(Replicate a Sequence)
;; url https://www.4clojure.com/problem/33
;; 원문

;; 한글
;; 시퀀스의 각 요소를 주어진 수만큼 반복하는 함수를 작성하라.
;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;; (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;; (= (__ [4 5 6] 1) '(4 5 6))
;; (= (__ [[1 2] [3 4]] 3) '([1 2] [1 2] [1 2] [3 4] [3 4] [3 4]))
;; (= (__ [44 33] 2) [44 44 33 33])
;; answer (fn [x y] (apply concat (#(map (partial repeat y) x))))
;; answer other #(mapcat (partial repeat %2) %1)
(= ((fn [x y] (apply concat (#(map (partial repeat y) x)))) [1 2 3] 2) '(1 1 2 2 3 3))
(= ((fn [x y] (apply concat (#(map (partial repeat y) x)))) [:a :b] 4) '(:a :a :a :a :b :b :b :b))
(= ((fn [x y] (apply concat (#(map (partial repeat y) x)))) [4 5 6] 1) '(4 5 6))
(= ((fn [x y] (apply concat (#(map (partial repeat y) x)))) [[1 2] [3 4]] 3) '([1 2] [1 2] [1 2] [3 4] [3 4] [3 4]))
(= ((fn [x y] (apply concat (#(map (partial repeat y) x)))) [44 33] 2) [44 44 33 33])
