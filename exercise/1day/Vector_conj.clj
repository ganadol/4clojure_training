;; 1 일차
;; 벡터: conj (Vector: conj)
;; url https://www.4clojure.com/problem/7
;; 원문

;; 한글
;; conj함수는 하나의 벡터를 받아서 하나 이상의 요소를 뒷부분에 추가한 새 벡터를 반환한다.
;; (= __ (conj [1 2 3] 4)
;; (= __ (conj [1 2] 3 4)
(ns .....................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.1day-exercise.Vector-conj)

;; answer
;; case 1
(= [1 2 3 4] (conj [1 2 3] 4))
(= [1 2 3 4] (conj [1 2] 3 4))
;; case 2
(= (vec '(1 2 3 4)) (conj [1 2 3] 4))
(= (vec '(1 2 3 4)) (conj [1 2] 3 4))
;; case 3
(= (vector 1 2 3 4) (conj [1 2 3] 4))
(= (vector 1 2 3 4) (conj [1 2] 3 4))
;; case 4
(= '(1 2 3 4) (conj [1 2 3] 4))
(= '(1 2 3 4) (conj [1 2] 3 4))
;; case 5
(= (list 1 2 3 4) (conj [1 2 3] 4))
(= (list 1 2 3 4) (conj [1 2] 3 4))
