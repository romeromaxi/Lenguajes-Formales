;34. Definir la función narcissistic? que devuelva true si un número dado es igual a la suma de cada uno de sus dígitos 
; elevado a la cantidad de dígitos; si no, false. Por ej: (narcissistic? 153) → true

(defn cant-digitos [x]
  (count (str x)))

(defn digs
  ([n] (digs n []))
  ([n lst]
   (if 
    (zero? n) 
     (seq (reverse lst))
     (digs (quot n 10) (conj lst (rem n 10))))
   )
)

(defn pot [potencia x] (apply * (repeat potencia x)))

(defn narcissistic? [x]
  (= (apply + (map (partial pot (cant-digitos x)) (digs x))) x))

(narcissistic? 153)
(narcissistic? 132)
(narcissistic? 1)
(narcissistic? 407)