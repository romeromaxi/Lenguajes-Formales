; 16. Definir una función para obtener el último símbolo de una lista (a todo nivel).
(defn obtener-ultimo [lst]
  (if 
   (list? (last lst)) 
    (obtener-ultimo (last lst))
    (last lst)
    )
)

(obtener-ultimo '(A B C D F (G H (I J K (L M)))))