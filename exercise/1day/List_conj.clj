;; 1 일차
;; 리스트: conj (Lists: conj)
;; url https://www.4clojure.com/problem/5
;; 원문

;; 한글
;; conj 함수는 하나의 리스를 받아 하나 이상의 요소들을 그앞부에 추가한 새 리스트를 반환한다.
;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))
(ns .....................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.1day-exercise.List-conj)
;; answer
;; case 1
(= '(1 2 3 4) (conj '(2 3 4) 1))
(= '(1 2 3 4) (conj '(3 4) 2 1))
;; case 2
(= (list 1 2 3 4) (conj '(2 3 4) 1))
(= (list 1 2 3 4) (conj '(3 4) 2 1))
;; case 3
(= (cons 1 '(2 3 4)) (conj '(2 3 4) 1))
(= (cons 1 '(2 3 4)) (conj '(3 4) 2 1))
