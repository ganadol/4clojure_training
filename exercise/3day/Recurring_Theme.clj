;; 3 일차
;; 단순재귀 (Simple Recursions)
;; url https://www.4clojure.com/problem/68
;; 원문

;; 한글
;; 클로저는 반복(loop) 구문을 한개만 제공하는데, 그것은 스택을 소모하지 않는 recur이다.
;; 함수나 loop구문이 recur의 재귀 지점으로 사용된다.
;; 어떤 방식이든 recur는 재귀 지점의 심볼들에 전달받은 값을 다시 바인딩한다.
;; recur는 꼬리 위치(tail-position) 에서 호출되어야 하며, 그외의 지점에서 호출하면 에러가 난다.
;; (= __
;;    (loop [x 5
;;           result []]
;;      (if (> x 0)
;;        (recur (dec x) (conj result (+ 2 x)))
;;        result)))

;; answer [7 6 5 4 3]
(= [7 6 5 4 3]
   (loop [x 5
          result []]
     (if (> x 0)
       (recur (dec x) (conj result (+ 2 x)))
       result)))
