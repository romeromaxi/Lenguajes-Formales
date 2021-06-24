; 11. Definir la función digs que reciba un número y devuelva una lista con sus dígitos.
(defn digs
  ([n] (digs n []))
  ([n lst]
   (if 
    (zero? n) 
     (seq (reverse lst))
     (digs (quot n 10) (conj lst (rem n 10))))
   )
)


(digs 54645747)