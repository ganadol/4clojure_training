;; 10일차
;; 대칭의 아름다 (Beauty is Symmetry)
;; url https://www.4clojure.com/problem/96
;; 원문

;; 한글
;; 트리의 왼쪽과 오른쪽 거울상이면 이진 트리가 대칭이라고 하자.
;; 주어진 이진 트리가 대칭인지 아닌지를 결정하는 진위함수를 작성하라.
;; (트리를 어떻게 표현 했는지는 트리인가 아닌 문제를 보라)
;; (= (__ '(:a (:b nil nil) (:b nil nil))) true)

;; (= (__ '(:a (:b nil nil) nil)) false)

;; (= (__ '(:a (:b nil nil) (:c nil nil))) false)

;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;         [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
;;    true)

;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;         [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
;;    false)

;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;         [2 [3 nil [4 [6 nil nil] nil]] nil]])
;;    false)
;; answer 
(fn [t]
  (let [in-order (fn f[t] 
                   (if (nil? t)
                     []
                     (concat (f (second t)) (vector (first t)) (f (nth t 2)))))
        t1 (in-order t)
        t2 (reverse t1)]
    (= t1 t2)))



(= ((fn [t]
  (let [in-order (fn f[t] 
                   (if (nil? t)
                     []
                     (concat (f (second t)) (vector (first t)) (f (nth t 2)))))
        t1 (in-order t)
        t2 (reverse t1)]
    (= t1 t2))) '(:a (:b nil nil) (:b nil nil))) true)

(= ((fn [t]
  (let [in-order (fn f[t] 
                   (if (nil? t)
                     []
                     (concat (f (second t)) (vector (first t)) (f (nth t 2)))))
        t1 (in-order t)
        t2 (reverse t1)]
    (= t1 t2))) '(:a (:b nil nil) nil)) false)

(= ((fn [t]
  (let [in-order (fn f[t] 
                   (if (nil? t)
                     []
                     (concat (f (second t)) (vector (first t)) (f (nth t 2)))))
        t1 (in-order t)
        t2 (reverse t1)]
    (= t1 t2))) '(:a (:b nil nil) (:c nil nil))) false)

(= ((fn [t]
  (let [in-order (fn f[t] 
                   (if (nil? t)
                     []
                     (concat (f (second t)) (vector (first t)) (f (nth t 2)))))
        t1 (in-order t)
        t2 (reverse t1)]
    (= t1 t2))) [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
        [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
   true)

(= ((fn [t]
  (let [in-order (fn f[t] 
                   (if (nil? t)
                     []
                     (concat (f (second t)) (vector (first t)) (f (nth t 2)))))
        t1 (in-order t)
        t2 (reverse t1)]
    (= t1 t2))) [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
        [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
   false)

(= ((fn [t]
  (let [in-order (fn f[t] 
                   (if (nil? t)
                     []
                     (concat (f (second t)) (vector (first t)) (f (nth t 2)))))
        t1 (in-order t)
        t2 (reverse t1)]
    (= t1 t2))) [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
        [2 [3 nil [4 [6 nil nil] nil]] nil]])
   false)
