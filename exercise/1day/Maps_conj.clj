;; 1 일차
;; 맵: conj (Maps: conj)
;; url https://www.4clojure.com/problem/11
;; 원문

;; 한글
;; conj 함수는 하나의 맵을 받아서 하나 이상의 키-값 쌍을 추가한 새 맵을 반환한다.
(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
(ns ........................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.exercise.1day.Maps-conj)
;; answer
(= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3]))
