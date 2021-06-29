; 9. Definir la función cant-dig que reciba un número entero y devuelva la cantidad de dígitos que este tiene.
(defn cant-dig [x]
  (count (str x))
)

(cant-dig 531243425)

