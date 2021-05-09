;; 7일차
;; 반쪽 진실  (A Half-Truth)
;; url https://www.4clojure.com/problem/83
;; 원문

;; 한글
;; 여러 개의 불린을 인수로 받는 함수를 작성하라.
;; 이 함수는 인수중 일부만 true이고 모두는 아닌 경우에만 true를 반환해야한다.
;; 그 이외의 경우에는 false를 반환해야 한다.
;; (= false (__ false false))
;; (= true (__ true false))
;; (= false (__ true))
;; (= true (__ false true false))
;; (= false (__ true true true))
;; (= true (__ true true true false))

;; answer 
(fn [& x]                               
  (loop [lst x t 0 f 0]
    (if (empty? lst)
      (= t f)
      (if (true? (first lst))
        (recur (rest lst) true f)
        (recur (rest lst) t true)))))

;; answer other not=


(= false ((fn [& x]                               
  (loop [lst x t 0 f 0]
    (if (empty? lst)
      (= t f)
      (if (true? (first lst))
        (recur (rest lst) true f)
        (recur (rest lst) t true))))) false false))

(= true ((fn [& x]                               
  (loop [lst x t 0 f 0]
    (if (empty? lst)
      (= t f)
      (if (true? (first lst))
        (recur (rest lst) true f)
        (recur (rest lst) t true))))) true false))

(= false ((fn [& x]                               
  (loop [lst x t 0 f 0]
    (if (empty? lst)
      (= t f)
      (if (true? (first lst))
        (recur (rest lst) true f)
        (recur (rest lst) t true))))) true))

(= true ((fn [& x]                               
  (loop [lst x t 0 f 0]
    (if (empty? lst)
      (= t f)
      (if (true? (first lst))
        (recur (rest lst) true f)
        (recur (rest lst) t true))))) false true false))

(= false ((fn [& x]                               
  (loop [lst x t 0 f 0]
    (if (empty? lst)
      (= t f)
      (if (true? (first lst))
        (recur (rest lst) true f)
        (recur (rest lst) t true))))) true true true))

(= true ((fn [& x]                               
  (loop [lst x t 0 f 0]
    (if (empty? lst)
      (= t f)
      (if (true? (first lst))
        (recur (rest lst) true f)
        (recur (rest lst) t true))))) true true true false))
