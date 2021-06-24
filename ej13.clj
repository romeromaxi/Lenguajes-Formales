; 13. Definir una función para producir una lista con los elementos en las posiciones pares de dos listas dadas.
(defn producir-pares [lstA lstB]
  (concat (map second (partition 2 lstA)) (map second (partition 2 lstB)))
)

(producir-pares '(A B C D E F) '(1 2 3 4 5 6 7 8))