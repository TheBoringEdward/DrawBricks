# DrawBricks

Alle Klassen und deren Funktionen:

**DrwasOG (Hauptklasse):**  
Zeichnet die Backsteintextur. Alle Befehle wurden hierbei "von Hand" gezeichnet.  
(Entspricht Aufgabe Nr.1)

**DrwasOG2 (Hauptklasse):**  
Ähnlich wie Drwas, jedoch wurden hierbei die for-Schleifen eher ineffizient aufgebaut.  
(Entspricht Aufgabe Nr.2)

**Drwas (Hauptklasse):**  
Zeichnet die Backstein-Textur mithilfe von for-Schleifen.  
(Entspricht Aufgabe Nr.4)

**Mapping/DrwasPart:**  
Beinhaltet die nötigen Befehle zum Zeichnen der Backstein-Textur.  
(Entspricht zur Hälfte Aufgabe Nr.5)

**Mapping/Map1 (Hauptklasse):**  
Zeichnet mithilfe von `DrwasPart` eine einzige Mauer.  
(Entspricht zur Hälfte Aufgabe Nr.5)

**Mapping/Map2 (Hauptklasse):**  
Zeichnet mithilfe von `DrwasPart` ein vorgegebenes Bild aus den Mauern.  

Innerhalb der Klasse kann die folgende Linie an Code gefunden werden:  
`map[i][j] = Character.getNumericValue(smM.map_House(j).charAt(i));`  
Der String `map_House` kann mit jeglich anderem String ersetzt werden, welcher in `MapDir` gefunden werden kann.  
Dies impliziert, daß man eigene Strings, bzw. Maps erstellen kann in `MapDir`.

(Entspricht Aufgabe Nr.6)

**Mapping/MapDir:**  
Beinhaltet die "Dateien" für die Bilder die in `Map2` gezeichnet werden.  
(Überschießt den Anforderungen von Aufgabe Nr.6)

---

Jegliche Klasse markiert als Hauptklasse kann eigens außgeführt werden. (Ich bin mir bewusst, daß dies unnötig war niederzuschreiben, aber man kann ja nie wissen.)

---

**Anmerkung:**
Aus irgend einem Grund zeichnen die Programme `Map1` und `Map2` immer eine Mauer links oben. Ich habe keine Ahnung wie dies vorkommt. Muß wohl verhext sein.

---

-Eddy
