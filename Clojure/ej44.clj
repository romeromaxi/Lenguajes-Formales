;44. Definir una función que reciba un número n y devuelva un vector de vectores que tenga la siguiente forma:
; [[1] [1 2] [1 2 3] [1 2 3 4] ... [1 2 3 4 ... n]]

(defn n-vector 
  ([n] (n-vector n (- n 1) []))
  ([n acum tachito] 
   (if 
    (neg? acum) tachito
     (recur n (dec acum) (conj tachito (mapv inc (range (- n acum)))))))
  )

(n-vector 3)
(n-vector 8)