; 25. Definir una función que cuente las apariciones de cada palabra en una frase.
(defn apariciones-palaba [cad]
  (frequencies (seq (.split "una dos tres una cuatro cinco tres cuatro cuatro" " "))))

(apariciones-palaba "una dos tres una cuatro cinco tres cuatro")