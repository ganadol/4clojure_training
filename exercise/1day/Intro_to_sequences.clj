;; 1 일차
;; 집합 소개 (Intro to Sequences)
;; url https://www.4clojure.com/problem/12
;; 원문

;; 한글
;; 클로저의 모든 컬렉션은 시퀀스 연산을 지원한다.
;; 시퀀스에 second나 last같은 연산을 적용할 수 있다.
;; (= __ (first '(3 2 1)))
;; (= __ (second '[2 3 4]))
;; (= __ (last (list 1 2 3)))
(ns ........................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.exercise.1day.Intro-to-sequences)
;; answer
(= 3 (first '(3 2 1)))
(= 3 (second '[2 3 4]))
(= 3 (last (list 1 2 3)))
