# Software Engineering im Studiengang Media Engineering

## Assignment "TDD Einführung"  

### Ausgangssituation

#### Test Driven Development (TDD)

Bei TDD gilt die Regel: Produktivcode darf erst geschrieben werden, wenn
ein Test vorliegt, der scheitert. Und auch dann soll nur gerade so
viel Code geschrieben werden, um den Testfall (und alle anderen Tests)
erfolgreich ausführen zu können.

#### Struktur des Assignments

Das Assignment besteht aus zwei Java-Klassen:

- <code>TriangleChecker</code> enthält den Produktivcode
- <code>TriangleCheckerTest</code> enthält die Tests

Mit Hilfe von TDD soll insbesondere die Methode

<code>
checkTriangle(float a, float b, float c)
</code>

entwickelt werden. Diese Methode hat die Aufgabe, anhand
der übergebenen drei Seitenlängen zu entscheiden, ob es
sich um ein normales, ein gleichschenkliges, ein
gleichseitiges oder gar kein Dreieck handelt.


### Aufgabenstellung

#### Normales Dreieck

Mit dem Assignment kommt ein erster Testfall,
der überprüft, ob ein normales Dreieck richtig erkannt
wird. Sorgen Sie dafür, dass der Testfall nicht mehr scheitert.
Achten Sie darauf, dass Sie nicht mehr implementieren, als
zur Lösung dieses Testfalls notwendig ist. Weitere
Fälle müssen noch nicht erkannt werden.

#### Gleichseitiges Dreieck

Erstellen Sie nun einen Testfall, der überprüft, 
ob ein gleichseitiges Dreieck erkannt wird. 
Da Sie bisher nur normale Dreiecke identifizieren,
wird dieser Testfall zunächst scheitern.

Nehmen Sie nun minimale Änderungen am Produktivcode vor, 
so dass beide Testfälle fehlerfrei ausgeführt werden.

#### Kein Dreieck

Es gibt Zahlenkombinationen, die nicht zu einem 
Dreieck passen (z.B. negative Zahlen oder 
eine überlange Seite, so dass die anderen beiden
Seiten das Dreieck nicht abschließen können).

Erstellen Sie jeweils eigene Testfälle für diese
Art von Zahlenkombinationen. Das sind mindestens 
6 weitere Testfälle (warum?).

Korrigieren Sie anschließend den Produktivcode,
so dass alle Tests durchlaufen.

#### Gleichschenkliges Dreieck

Schließlich sollen noch gleichschenklige Dreiecke
erkannt werden. Dabei soll die
Methode stets die genaueste Information 
zurückliefern, d.h.
- bei einem gleichseitigen Dreieck *EQUILATERAL*, auch wenn 
  ein gleichseitiges Dreieck natürlich auch gleichschenklig
  ist.
- bei einem gleichschenkligem Dreieck *ISOSCELES*, auch wenn
  ein gleichschenkliges Dreieck natürlich auch ein
  normales Dreieck ist.

Verwenden Sie auch hier die TDD-Vorgehensweise.
