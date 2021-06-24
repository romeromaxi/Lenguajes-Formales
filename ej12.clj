; 12. Definir la función repartir que, llamada sin argumentos, devuelva la cadena "Uno para vos, uno para mí". 
; De lo contrario, se devolverá una lista, en la que habrá una cadena "Uno para X, uno para mí" por cada argumento X.
(defn repartir
  ([] (println "Uno para vos, uno para mi"))
  ([& more] (map #(printf "Uno para %s, uno para mi" %) more))
)
