; 18. Definir una función para eliminar los elementos repetidos de una lista simple.

;(defn eliminar-repetidos 
;  ([lst] (eliminar-repetidos lst []))
;  ([lst finalLst] 
;   (cond
;     (empty? lst) finalLst
;     (some #(= % (first lst)) finalLst) (eliminar-repetidos (rest lst) finalLst)
;     :else (eliminar-repetidos (rest lst) (conj finalLst (first lst))))
;   )
;)

(defn eliminar-repetidos 
  ([lst] (eliminar-repetidos lst []))
  ([lst finalLst] 
   (cond
     (empty? lst) finalLst
     (some (partial = (first lst)) finalLst) (eliminar-repetidos (rest lst) finalLst)
     :else (eliminar-repetidos (rest lst) (conj finalLst (first lst))))
   )
)

(eliminar-repetidos '(1 2 4 1 6 4 7 1 7 9 10 6 99))