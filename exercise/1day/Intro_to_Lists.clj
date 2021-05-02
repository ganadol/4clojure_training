;; 1 일차
;; 리스트 소개 (Intro to Lists)
;; url https://www.4clojure.com/problem/4
;; 원문

;; 한글
;; 리스트는 함수나 인용(') 기호로 생성할 수 있다.
;; (= (list __) '(:a :b :c))
(ns .....................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.1day-exercise.Intro-to-Lists)
;; answer
;; case 1
(= (list :a :b :c) '(:a :b :c))
;; case 2
(= (conj '(:c) :b :a) '(:a :b :c))
;; case 3
(= (cons :a (cons :b '(:c))) '(:a :b :c))
