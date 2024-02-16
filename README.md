# Car-Dealership-JAVA
Questo programma Java definisce un semplice modello per una concessionaria di auto, includendo classi per diversi tipi di automobili, oltre a una classe che rappresenta la concessionaria stessa.
La struttura e le funzionalità:

Classe Automobile: È una classe astratta che rappresenta una generica automobile. Ha un attributo targa e sovrascrive i metodi toString() e equals(). Il metodo equals() confronta le automobili in base alle loro targhe.

Classe Panda: Questa classe estende Automobile e rappresenta un tipo specifico di automobile, la Fiat Panda. Ha un attributo aggiuntivo hasTomTom, che indica se l'auto è dotata di un sistema di navigazione TomTom. Sovrascrive i metodi toString(), equals() e clone().

Classe Punto: Simile alla Panda, questa classe rappresenta una Fiat Punto. Ha un attributo aggiuntivo cilindrata (cilindrata). Sovrascrive i metodi toString(), equals() e clone().

Classe Concessionaria: Questa classe rappresenta una concessionaria di auto. Ha due ArrayList per memorizzare le auto nuove e usate. Fornisce metodi per aggiungere una nuova auto alla concessionaria e metodi per acquistare auto usate (Panda o Punto):
- Il metodo aggiungiAutomobile() aggiunge una nuova automobile alla concessionaria, controllando che non ci siano duplicati in base alla targa.
- I metodi compraUsata() cercano di acquistare un'auto usata del tipo specificato, in base a determinati criteri. Questi metodi utilizzano un predicato per filtrare il tipo di auto appropriato dall'elenco delle auto usate.
Nel complesso, questo programma modella un semplice sistema di concessionaria di auto, con supporto per l'aggiunta di nuove auto e l'acquisto di auto usate di tipo specifico. Dimostra concetti come l'ereditarietà, l'overriding dei metodi, i generici e le espressioni lambda in Java.
