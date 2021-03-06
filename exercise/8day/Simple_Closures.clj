;; 8일차
;; 간단한 클로저 (Simple Closures)
;; url https://www.4clojure.com/problem/107
;; 원문

;; 한글
;; 렉시컬 스코프(Lexical scope)와 일급 함수는 클로저 같은 함수형 언어의 가장 기본적인
;; 구성요소이다. 이 두요소를 결합하면 렉시컬 클로저(Lexical Closure)라는 매우 강력한
;; 도구를 갖게 된다. 이것을 이용하면 지역 바인딩의 수명을 마음대로 제어할 수 있다.
;; 즉, 코드의 실행이 끝난 뒤에도 바인딩된 값을 사용할 수 있다.
;; 추상적으로 이해하는 것은 어려울 수 있으니 간단한 클로저(closure)를 만들어 보자.
;; 만들 함수는 양의 정수 n을 인수로 받은 후 x의 n승을 계산하는 함수 (fx)를 반환해야 한다.
;; 클로저(closure)로 인해 n이 정의된 영역 바깥에서도 n의 값이 보존된다는 점을 눈여겨 보자.
;; (= 256 ((__ 2) 16) ((__ 8) 2))
;; (= [1 8 27 64] (map (__ 3) [1 2 3 4]))
;; (= [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4]))

;; answer
(fn [a]
  (partial (fn [x y]
             (loop [result 1 cnt x n y]
               (if (zero? cnt)
                 result
                 (recur (* result n) (dec cnt) n)))) a))
;; answer 2 : partial (fn [x y] (reduce * (repeat x y)))

;; answer other #(fn [x] (int (Math/pow x %)))
  
(= 256
   (((fn [a]
       (partial (fn [x y]
                  (loop [result 1 cnt x n y]
                    (if (zero? cnt)
                      result
                      (recur (* result n) (dec cnt) n)))) a)) 2) 16)
   (((fn [a]
       (partial (fn [x y]
                  (loop [result 1 cnt x n y]
                    (if (zero? cnt)
                      result
                      (recur (* result n) (dec cnt) n)))) a)) 8) 2))


(= [1 8 27 64]
   (map ((fn [a]
           (partial (fn [x y]
                      (loop [result 1 cnt x n y]
                        (if (zero? cnt)
                          result
                          (recur (* result n) (dec cnt) n)))) a)) 3) [1 2 3 4]))

(= [1 2 4 8 16]
   (map #(((fn [a]
             (partial (fn [x y]
                        (loop [result 1 cnt x n y]
                          (if (zero? cnt)
                            result
                            (recur (* result n) (dec cnt) n)))) a)) %) 2) [0 1 2 3 4]))

(= 256 ((partial (fn [x y] (reduce * (repeat x y)))  2) 16) ((partial (fn [x y] (reduce * (repeat x y)))  8) 2))
(= [1 8 27 64] (map (partial (fn [x y] (reduce * (repeat x y)))  3) [1 2 3 4]))
(= [1 2 4 8 16] (map #((partial (fn [x y] (reduce * (repeat x y)))  %) 2) [0 1 2 3 4]))
