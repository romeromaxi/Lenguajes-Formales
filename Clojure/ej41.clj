; 41. Definir una función que devuelva la lista que resulta al intercalar los elementos de otras dos listas que recibe como parámetros. 
; Por ejemplo: (intercalar '(1 2 3) '(4 5 6)) → (1 4 2 5 3 6)

(defn intercalar [lstA lstB]
  (flatten (map list lstA lstB)))

(intercalar '(1 2 3) '(4 5 6))
(intercalar '(A C E G I) '(B D F H J))