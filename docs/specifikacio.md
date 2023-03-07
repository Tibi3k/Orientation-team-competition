# MOTIONCLASH
(* új technológia)

### Alap technológiák
	Kotlin spring *
	Angular
		Angular Material (más UI lib?)
### Deployment: AWS
	AWS Elastic Beanstalk *
	Amazon RDS *
	valamilyen pipeline (Github Workflow v. Jenkins *)
### Egyéb technológiák:
	Google maps
	GPS követés *
	ImgBB kép hostolásra a feltöltéshez (Amazon blob?)

### Felhasználók:
	Szervező / Résztvevő
	Admin

### Támogatott nyelvek:
	Angol
	Magyar

### Funkcionális követelmények:
	Bejelentkezés nélkül is elérhető a jelenlegi és korábbi versenyek listája, bárki böngészheti őket
	A végeredmények és a hozzá tartozó képek is publikusan megtekinthetők.
	Felhasználók regisztrálhatnak a rendszervbe
	Regisztrált felhasználók jelentkezhetnek versenyekre
	Egy felhasználó egy versenyen csak egy csapatban lehet ha az adott verseny csapatverseny
	Bármely felhasználó létrehozhat egy csapatot bármely versenyen
	Csapatba csak a csapatvezető hívhat meg embereket, ő el is távolíthat embereket
	Minden felhasználó kiléphet a jelenlegi csapatából a verseny kezdetéig
	Ha a csapatvezető kilép a csapatból egy véletlenszerű felhasználó lesz a csapatvezető amég van valaki a csapatban
	A verseny elindítása után a verseny paraméterei (információk, helyek) már nem módosíthatóak
	Regisztrált felhasználók létrehozhatnak új versenyeket
	Adminnak engedélyeznie kell egy új versenyt
	Rendezők feltölthetnek képeket a rendezvény előtt alatt és után is.
	Adott verseny lehet egyéni vagy csapatverseny
    Az alkalmazás angol és magyar nyelven is használható

### Képernyők
	Landing
	Regisztráció + bejelentkezés
	Korábbi versenyek
	verseny jelentkezés form
		csapat létrehozása / másik meghívása
	verseny készítés form (form + térkép ahol meg lehet adni a pontokat)
	verseny részlet
		kapcsolódó képek
		élő térképes mód ha aktív a verseny
		állások és végeredmény

		

		