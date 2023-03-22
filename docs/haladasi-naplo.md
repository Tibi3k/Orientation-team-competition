# 1.hét
Először is azzal kezdtem a hetet, hogy utánnanéztem a tájékozódási csapatversenyeknek,
hogyan is zajlanak a valóságban az ilyen versenyek.

Ezután elkezdtem kidolgozni az alkalmazás funkcionális követelményeit amellyel nagyjából elkészültem

A funkcionális követelmények ismeretében bár lehetőségem volt arra, hogy elkezdjek a konkrét megvalósítási technológiákon és megoldásokon gondolkodni,
ennek eredményeként meg is született a specifikáció technológiai részének alapja.

Megcsináltam egy kezdetleges vázat arról is hogy milyen képernyőkből fog állni az alakalmazás. 
Ez valószínüleg még nem teljes, jövő héten a képernyőtervek rajzolása közben biztosan előjön valamilyen képernyő amellyel nem számoltam.

Végül kerestem egy képernyőszerkeztő eszközt, a [Mockflowt](https://www.mockflow.com/) választottam,
ezzel a landing paget már meg is rajzoltam ez a screens mappába került.


# 2.hét
Azon gondolkodtam hogyan lenne érdemes elindulni az alkalmazás megvalósításával és úgy döntöttem a legegyszerűbbb módja az API design first approach lenne.

Ehhez létre kellett hoznom az [alkalmazás APIjának leíróját](https://github.com/Tibi3k/Orientation-team-competition/tree/dev/docs/datamodels/openAPI.yaml), ehhez az OpenAPI API leírót használtam.

Ahhoz hogy ezt létrehozhassam szükségem volt először az alkalmazáshoz tartozó adatmodellek létrehozására, ezek leírása az OpenAPI leíró schemas szekciójában található.

A továbbiakban a leíró segítségével le szeretném generálni az Angular alkalmazás service rétegének vázát valamint a spring alkalmazás API rétegének vázát is, ezzel megkönnyítve az implementációt.

Szeretném még a későbbiekben tovább frissíteni az OpenAPI dokumentációt ha maga az API változik vagy ha esetleg új elemek jelennek meg mint az authorizáció.

# 3.hét
Először is elkészítettem a haladási tevet a félévre, ez [itt](https://docs.google.com/spreadsheets/d/1Lb5Jis3mx3fcaNGse7oVrjR6BBoOEuw7Z8uxoDg3Ve8/edit?usp=sharing) érhető el

Ezután elkezdtem kidolgozni a képernyőterveket egy figma projektben, ez [itt](https://www.figma.com/file/WoH698ejQnfcTMaumpJUYI/Untitled?node-id=0%3A1&t=nrwNWCSTjWmsbac0-1) követhető nyomon

