; 38. Definir una función que actúe como la instrucción distl de FP. Por ejemplo:
; (distl 'a '(b c d)) → ((a b)(a c)(a d))

(defn distl [x lst]
 (map list (repeat (count lst) x) lst))

(distl 'a '(b c d))

(distl '1 '(2 3 4 5))