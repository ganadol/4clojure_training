;; 10일차
;; 트리인가 아닌가 (To Tree, or not to Tree)
;; url https://www.4clojure.com/problem/95
;; 원문

;; 한글
;; 해당 시퀀스가 이진트리인지 확인하는 진위 함수를 작성하라.
;; 트리의 각 노드는 값과 왼쪽 자식, 그리고 오른쪽 자식을 모두 가져야한다.
;; (= (__ '(:a (:b nil nil) nil))
;;    true)
;; (= (__ '(:a (:b nil nil)))
;;    false)
;; (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]])
;;    true)
;; (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]])
;;    false)
;; (= (__ [1 [2 [3 [4 nil nil] nil] nil] nil])
;;    true)
;; (= (__ [1 [2 [3 [4 false nil] nil] nil] nil])
;;    false)
;; (= (__ '(:a nil ()))
;;    false)

;; answer
(fn [l]
  (loop [a l b false]
    (if (empty? a)
      b
      (if (false? (= (count a) 3))
        false
        (recur (second a) (= (count a) 3))))))

;; answer 2
(fn [l]
  (let [pred (fn [f l]
               (= true
                  (= (count l) 3)
                  (not= '() (f (rest l)))
                  (not (false? (f (rest l)))))
               )]
    (loop [a l b false]
      (if (empty? a)
        b
        (if (and (true? (pred first a)) (true? (pred second a)))
          (if (not (nil? (second a)))
            (recur (second a) true)
            (recur (second (rest a)) true))
          false)))))
  

;; answer other
(fn istree? [root]
  (or (nil? root)
      (and (sequential? root)
           (= 3 (count root))
           (every? istree? (rest root)))))

(= ((fn [l]
  (let [pred (fn [f l]
               (= true
                  (= (count l) 3)
                  (not= '() (f (rest l)))
                  (not (false? (f (rest l)))))
               )]
    (loop [a l b false]
      (if (empty? a)
        b
        (if (and (true? (pred first a)) (true? (pred second a)))
          (if (not (nil? (second a)))
            (recur (second a) true)
            (recur (second (rest a)) true))
          false))))) '(:a (:b nil nil) nil))
   true)

(= ((fn [l]
  (let [pred (fn [f l]
               (= true
                  (= (count l) 3)
                  (not= '() (f (rest l)))
                  (not (false? (f (rest l)))))
               )]
    (loop [a l b false]
      (if (empty? a)
        b
        (if (and (true? (pred first a)) (true? (pred second a)))
          (if (not (nil? (second a)))
            (recur (second a) true)
            (recur (second (rest a)) true))
          false))))) '(:a (:b nil nil)))
   false)

(= ((fn [l]
  (let [pred (fn [f l]
               (= true
                  (= (count l) 3)
                  (not= '() (f (rest l)))
                  (not (false? (f (rest l)))))
               )]
    (loop [a l b false]
      (if (empty? a)
        b
        (if (and (true? (pred first a)) (true? (pred second a)))
          (if (not (nil? (second a)))
            (recur (second a) true)
            (recur (second (rest a)) true))
          false))))) [1 nil [2 [3 nil nil] [4 nil nil]]])
   true)

(= ((fn [l]
  (let [pred (fn [f l]
               (= true
                  (= (count l) 3)
                  (not= '() (f (rest l)))
                  (not (false? (f (rest l)))))
               )]
    (loop [a l b false]
      (if (empty? a)
        b
        (if (and (true? (pred first a)) (true? (pred second a)))
          (if (not (nil? (second a)))
            (recur (second a) true)
            (recur (second (rest a)) true))
          false))))) [1 [2 nil nil] [3 nil nil] [4 nil nil]])
   false)

(= ((fn [l]
  (let [pred (fn [f l]
               (= true
                  (= (count l) 3)
                  (not= '() (f (rest l)))
                  (not (false? (f (rest l)))))
               )]
    (loop [a l b false]
      (if (empty? a)
        b
        (if (and (true? (pred first a)) (true? (pred second a)))
          (if (not (nil? (second a)))
            (recur (second a) true)
            (recur (second (rest a)) true))
          false))))) [1 [2 [3 [4 nil nil] nil] nil] nil])
   true)

(= ((fn [l]
  (let [pred (fn [f l]
               (= true
                  (= (count l) 3)
                  (not= '() (f (rest l)))
                  (not (false? (f (rest l)))))
               )]
    (loop [a l b false]
      (if (empty? a)
        b
        (if (and (true? (pred first a)) (true? (pred second a)))
          (if (not (nil? (second a)))
            (recur (second a) true)
            (recur (second (rest a)) true))
          false))))) [1 [2 [3 [4 false nil] nil] nil] nil])
   false)

(= ((fn [l]
  (let [pred (fn [f l]
               (= true
                  (= (count l) 3)
                  (not= '() (f (rest l)))
                  (not (false? (f (rest l)))))
               )]
    (loop [a l b false]
      (if (empty? a)
        b
        (if (and (true? (pred first a)) (true? (pred second a)))
          (if (not (nil? (second a)))
            (recur (second a) true)
            (recur (second (rest a)) true))
          false))))) '(:a nil ()))
   false)


