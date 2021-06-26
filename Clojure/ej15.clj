; 15. Definir una función para eliminar las ocurrencias de un dato escalar en una lista (a todo nivel).
(defn eliminar-ocurrencias [lst dato]
 (cond 
   (empty? lst) lst
   (list? (first lst)) (cons (eliminar-ocurrencias (first lst) dato) (eliminar-ocurrencias (rest lst) dato))
   (= (first lst) dato) (eliminar-ocurrencias (rest lst) dato)
   :else (cons (first lst) (eliminar-ocurrencias (rest lst) dato))
   )
)

(eliminar-ocurrencias '(3 (3 5 (6 8 9 3)) 2 3 (4 3)) 3)
