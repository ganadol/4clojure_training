;; 3 일차
;; 코드 재배열 (Rearranging Code)
;; url https://www.4clojure.com/problem/71
;; 원문

;; 한글
;; 이문제는 스레드 퍼스트(thread-first)매크로(->)를 사용한다.
;; 이 매크로는 식을 실행 순서대로 나열해서 코드의 가독성을 높여준다.
;; 함수를 여러번 중첩하는 대신 이것을 사용하면 정말로 유용하다.
;; 예를 들어 리스트에서 첫번째 요소를 가져온후,
;; 그것을 문자열로 바꾸고 그결과를 다시 대문자로 바꾸는 경우 다음과 같이 할 수 있다.
;; (.toUpperCase (str (first '[:cat :dog :fish])))
;; => ":CAT"
;; 스레드 퍼스트 매크로를 사용하면 다음과 같이 다시 쓸 수 있다.
;; (-> '[:cat :dog :fish] first str .toUpperCase)
;; => ":CAT"
;; 이 매크로를 사용하면 코드의 가독성이 높아지고 간결해진다.
;; 스레드 퍼스트 매크로 -> 는 식 x를 그뒤 형식들에 연속해서 통과 시킨다.
;; x가 그 뒤의 첫번째 형식의 두번째 요소로 삽입되는데,
;; 그 형식이 리스트가 아니면 리스트로 만든후 삽입된다.
;; 그다음 첫번째 형식 두번째 요소로 삽입되는데,
;; 마찬가지로 필요하면 리스트로 만든다.
;; 이 과정이 모든 형식들을 대상으로 계속 된다.
;; 이 스레드 퍼스트 매크로를 사용하면 코드 가독성이 높아진다.
;; (= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
;;    (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (__))
;;    5)
;; answer last
(= (last (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (last))
   5)
