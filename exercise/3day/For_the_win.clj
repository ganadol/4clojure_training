;; 3 일차
;; 코드 재배열 (Rearranging Code)
;; url https://www.4clojure.com/problem/145
;; 원문

;; 한글
;; 클로저의 for 매크로는 한 개 이상의 시퀀스에서 새로운 시퀀스를 만들때 엄청나게 다양한 기능을 가진다.
;; 이 매크로를 제대로 사용하는 법을 이해하기까지 시간이 걸릴수 있지만
;; 원하는 시퀀스를 명확하고 간결하게 만들 수 있어 시간을 투자한 보람이 있을 것이다.
;; 이점을 염두에 두고 다음의 식들이 어떻게 동일한 결과를 반환하는지 알아 보자.
;; (= __ (for [x (range 40)
;;             :when (= 1 (rem x 4))]
;;         x))
;; (= __ (for [x (iterate #(+ % 4) 0)
;;             :let [z (inc x)]
;;             :while (< z 40)]
;;         z))
;; (= __ (for [[x y] (partition 2 (range 20))]
;;         (+ x y)))
;; answer '(1 5 9 13 17 21 25 29 33 37)
(= '(1 5 9 13 17 21 25 29 33 37)
   (for [x (range 40)
         :when (= 1 (rem x 4))]
     x))
(= '(1 5 9 13 17 21 25 29 33 37)
   (for [x (iterate #(+ % 4) 0)
       :let [z (inc x)]
       :while (< z 40)]
   z))
(= '(1 5 9 13 17 21 25 29 33 37)
   (for [[x y] (partition 2 (range 20))]
     (+ x y)))
