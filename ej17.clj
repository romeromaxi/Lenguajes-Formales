; 17. Definir una función para obtener el elemento central de una lista.
(defn elemento-central [lst]
  (if
   (even? (count lst))
    (list (nth lst (- (quot (count lst) 2) 1)) (nth lst (quot (count lst) 2)))
    (nth lst (quot (count lst) 2))
    )
)

(elemento-central '(1 2 3 4 5 6 7 8 9))
(elemento-central '(1 2 3 4 5 6 7 8 9 10))
