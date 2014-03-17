prosjekt6-uke12, PG6100
===============
Denne øvingen handler om å få litt innsikt i sikkerhet api-et til JEE. Importer prosjektet som Maven prosjekt til IDEA (husk Auto-import flagget ved importering, ref oppslag på Its Learning). For gradle, bruk `gradle idea` kommando som genererer `IDEA` filene.

Bruk `F5_Sikkerhet` foiler som hjelpemidler.

Fra prosjektets mappe bør man gjøre følgende (set riktig `JAVA_HOME` og `DERBY_HOME`).

Start Derby[1] (ignorer warnings om ``tabellen allerede eksisterer``):

``Mac/Linux:``

    export JAVA_HOME=/opt/java/7.0/
    export DERBY_HOME=/opt/glassfish/4.0/javadb
    java -Djava.security.manager -Djava.security.policy=src/main/resources/1010_server.policy -Dderby.security.port=1527 -Dderby.install.url=file:$DERBY_HOME/lib/ -jar $DERBY_HOME/lib/derbyrun.jar server start

``Windows:``

    set JAVA_HOME=c:\Program\ Files\Java
    set DERBY_HOME=c:\glassfish\4.0\javadb
    java -Djava.security.manager -Djava.security.policy=src/main/resources/1010_server.policy -Dderby.security.port=1527 -Dderby.install.url=file:%DERBY_HOME%/lib/ -jar %DERBY_HOME%/lib/derbyrun.jar server start

Se for [2] for eksempel oppsett.

1. Implementer metodene i `EJB`.
2. Bygg prosjektet: `mvn package` eller `gradle jar`
3. Deploy via admin-consollet: `http://localhost:4848/common/index.jsf` => `Applications` => `Deploy`. Velg `target/prosjekt6-uke12-0.1.jar` og `Force redeploy`.

Tips: sjekk manuelt innholdet i derby databasen (for Windows bytt `$DERBY_HOME` med `%DERBY_HOME%`):

Sett opp sikkerhet i "Configurations => server-config => Security => file". Bruk samme brukernavn/passord i clienten

**Deklarativ sikkerhetsstyring**

Deklarer default rolle for ``OrderEJB``. Bruk spesiell rolle for ``deleteOrder()``.

**Programmatisk**

Hvordan endrer vi koden til å være programmatisk sikkerhetsstyring?