; 36. Definir la función sublist que devuelva la sublista correspondiente a una lista, una posición inicial y una longitud dadas. 
; Por ejemplo: (sublist '(A B C D E F G) 3 2) → (C D)

(defn sublist [lst posIni longitud]
  (take longitud (nthrest lst (- posIni 1)) ))

(sublist '(A B C D E F G) 3 2)
(sublist '(A B C D E F G) 1 8)
(sublist '(A B C D E F G) 5 1)