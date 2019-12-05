[1 "two" 3 true] ;Theres no need that all the items in the vector be of the same typea

[1 [true 3 "four 5"] 6] ; You can even nest vectors and do it again n times u need

;;To manufacture vectors you can use vector function like this:

(vector true 3 "four" 5) ; Will be the same as [true 3 "four" 5]

;;To count how many items are inside the vector you could use count, like this:

(def languages ["Haskell" "Clojure" "Elixir" "Coq"])

(count languages) ; returns 4

;;To get the first item of vector we can use first

(first languages) ; returns Haskell

;;If you want to ignore just the first item of your vector you can use the rest function:

(rest languages) ; returns ("Clojure" "Elixir" "Coq")

;;You may be wondering why it returned rounded by parentheses, actually rest returns a sort of generic collection
;;called sequence https://clojure.org/reference/sequences

;;Btw if you use rest function in a one element vector will return an empty collection

;;But what we do if we want to access a especific item in the vector?
;;We can use nth which takes a vector and a (zero-based) index:

(nth languages 2) ; returns "Elixir"

;;You can also call the vector itself like a function just supplying the index as an argument:

(languages 1) ; returns "Clojure"

;;NONE O F THESE OPERATIONS CHANGE THE ORIGINAL VECTOR, JUST RETURN A NEW ONE.
;;YES UPPERCASE

;;Clojure works with the concept of immutability, once you create a Clojure data structure there's no way to modify it.

;;You can't change an existing vector, but u can make a new one, to get a bigger vector you can use the conf function
;;It's a short name for conjunction

(conj languages "Erlang") ; Instead of add a new language in the languages vector, return a new one with Erlang at last
;;position. Conj doesn't returns a sequence, it returns a new vector, them it's rounded-brackets

;;You can also use the cons function (short name for construct) to add an item to the front of the vector

(cons "Lisp" languages) ; returns ("Lisp" "Haskell" "Clojure" "Elixir" "Coq")









;;There's another type of collection like vector, the list...
;;The list is an ordered collection of items, you can make a list like this:

'(1 2 3)

;;We need the quote in the beginning cause a very prosaic reason, with their round parentheses it looks like Clojure
;;Code, then syntactically it's hard to see the difference between (1 2 3) and (def x 1)

;;Like vectors list can hold whatever data care to throw at them, so the following are perfectly good lists:

'(1 2 3 "four" 5 "six")
'(1 2.0 2.9999 "four" 5.001 "six")
'([1 2 ("a list" "inside" "a vector")] "inside" "a" "list")

;;And we also have a function that create a list from the arguments you pass in:

(list 1 2 3 "four" 5 "six")

;;And you can do many of the things that you can do with a vector, like count, first, rest and nth:

(def languages '("Imperative language :(" "Functional language yay"))

(count languages) ; returns 3
(first language) ; returns "Imperative language :("
(rest language) ; returns "Functional language yay"
(nth language 1) ; returns "Functional language yay"


