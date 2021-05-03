;; 2 일차
;; 두배로 만들기 (Double Down)
;; url https://www.4clojure.com/problem/15
;; 원문

;; 한글
;; 두배의 숫자를 반환하는 함수를 작성하라.
;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)
(ns ........................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.exercise.2day.Double-Down)
;; answer (fn [x] (* x 2))
(= ((fn [x] (* x 2)) 2) 4)
(= ((fn [x] (* x 2)) 3) 6) 
(= ((fn [x] (* x 2)) 11) 22)
(= ((fn [x] (* x 2)) 7) 14)
