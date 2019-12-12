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

;;Vetors and lists are both ordered, sequential data structures...
;;We have both because internally they're very different.
;;A vector is similar to an array, a big chunk of continuous memory, the first item in the first slot and so on...
;;Vector: https://www.oreilly.com/library/view/getting-clojure/9781680506082/images/vector.png

;;Btw, lists are implemented as linked lists, you can think of a list as series of two-slot objects.
;;List: https://www.oreilly.com/library/view/getting-clojure/9781680506082/images/list.png
;;One slot contains a reference to some data item while the second slot points at the next object in the list.

;;So, don't forget about immutability, when you create a vector like this:

(def languages ["Scala" "Haskell" "Clojure"])

;;Then you try to add an element to it like this:

(conj languages "Agda")

;;It would be returned a new vector, in the case above, it will return to no one.
;;Let's do something useful with it;

(def more-languages (conj languages "Agda"))

;;more-languages will be a new vector with four elements, "Scala" "Haskell" "Clojure" "Agda"
;;The same logic applies to most other data structures in Clojure, like lists:

(def languages-again '("Scala" "Elixir" "Erlang"))

(conj languages-again "Lisp")

;;OMG, but what if a have a huge vector and need to add a series of values to it? It will create a new one?
;;What about performance?

;;vectors store their data in chunks and organize them in a shallow tree, breaking the data up into chunks means
;;that when we need to make an almost same copy, Clojure can minimize the amount of copying by reusing most of the
;;chunk as is.
;;Accessing an element of a vector involves traversing the tree, is not quite fast as getting an element of a simple
;;array, but it's still fast.
;;AAAAAAAAAAAAND, all of Clojure's data structures are carefully designed to support fast creation of similar ones.

;;hint: lists are better when you need to append new items to the front

;;Cya
