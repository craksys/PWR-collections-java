package tb.soft;

import java.util.Arrays;
import java.util.Collections;


public class PersonConsoleApp {
	private int selected_collection1;
	private int selected_collection2;

	private static final String GREETING_MESSAGE = 
			"Program Person - wersja konsolowa\n" +
			"Data:  listopad 2021 r.\n";

	private static final String MENU = 
			"    M E N U   G Ł Ó W N E  \n" +
			"1 - Podaj dane nowej osoby \n" +
			"2 - Usuń dane osoby        \n" +
			"3 - Modyfikuj dane osoby   \n" +
			"4 - Wczytaj dane z pliku   \n" +
			"5 - Zapisz dane do pliku   \n" +
			"6 - Wybierz kolekcje do porównania   \n" +
			"7 - Dodaj 10 standardowych elementów do kolekcji   \n" +
			"0 - Zakończ program        \n";
	
	private static final String CHANGE_MENU = 
			"   Co zmienić?     \n" + 
	        "1 - Imię           \n" + 
			"2 - Nazwisko       \n" + 
	        "3 - Rok urodzenia  \n" + 
			"4 - Stanowisko     \n" +
	        "0 - Powrót do menu głównego\n";

	private static final String CHOOSE_COLLECTION =
					"1 - HashSet           \n" +
					"2 - TreeSet       \n" +
					"3 - ArrayList  \n" +
					"4 - LinkedList     \n" +
					"5 - HashMap\n" +
					"6 - TreeMap\n";


	
	/**
	 * ConsoleUserDialog to pomocnicza klasa zawierająca zestaw
	 * prostych metod do realizacji dialogu z użytkownikiem
	 * w oknie konsoli tekstowej.
	 */
	private static final ConsoleUserDialog UI = new ConsoleUserDialog();
	
	
	public static void main(String[] args) {
		// Utworzenie obiektu aplikacji konsolowej
		// oraz uruchomienie głównej pętli aplikacji.
		PersonConsoleApp application = new PersonConsoleApp();
		application.runMainLoop();
	} 

	
	/*
	 *  Referencja do obiektu, który zawiera dane aktualnej osoby.
	 */
	private Person currentPerson = null;
	
	
	/*
	 *  Metoda runMainLoop wykonuje główną pętlę aplikacji.
	 *  UWAGA: Ta metoda zawiera nieskończoną pętlę,
	 *         w której program się zatrzymuje aż do zakończenia
	 *         działania za pomocą metody System.exit(0); 
	 */
	public void runMainLoop() {
		UI.printMessage(GREETING_MESSAGE);
		Colections colections = new Colections();

		while (true) {
			UI.clearConsole();
			showCurrentPerson();

			try {
				switch (UI.enterInt(MENU + "==>> ")) {
				case 1:
					// utworzenie nowej osoby
					currentPerson = createNewPerson();
					colections.savetocollection(currentPerson,selected_collection1,selected_collection2);
					break;
				case 2:
					// usunięcie danych aktualnej osoby.
					currentPerson = null;
					UI.printInfoMessage("Dane aktualnej osoby zostały usunięte");
					break;
				case 3:
					// zmiana danych dla aktualnej osoby
					if (currentPerson == null) throw new PersonException("Żadna osoba nie została utworzona.");
					changePersonData(currentPerson);
					break;
				case 4: {
					// odczyt danych z pliku tekstowego.
					String file_name = UI.enterString("Podaj nazwę pliku: ");
					currentPerson = Person.readFromFile(file_name);
					UI.printInfoMessage("Dane aktualnej osoby zostały wczytane z pliku " + file_name);
				}
					break;
				case 5: {
					// zapis danych aktualnej osoby do pliku tekstowego 
					String file_name = UI.enterString("Podaj nazwę pliku: ");
					Person.printToFile(file_name, currentPerson);
					UI.printInfoMessage("Dane aktualnej osoby zostały zapisane do pliku " + file_name);
				}
					break;
					case 6: {
						System.out.println("Wybierz kolekcje nr 1: ");
						UI.printMessage(CHOOSE_COLLECTION);
						selected_collection1 = UI.enterInt("");
						System.out.println("Wybierz kolekcje nr 2: ");
						UI.printMessage(CHOOSE_COLLECTION);
						selected_collection2 = UI.enterInt("");
						if(selected_collection2 == selected_collection1 ){
							System.out.println("WYBRANO 2 IDENTYCZNE KOELEKCJE!");
							selected_collection2=0;
							selected_collection1=0;
						} else if(selected_collection1 == 0 || selected_collection2==0) {
							System.out.println("NIE WYBRANO KOLEKCJI!");
							selected_collection2=0;
							selected_collection1=0;
						}



					}
					break;
					case 7:
					{
						Person a = new Person("Kamil","Kochan");
						a.setBirthYear(2001);
						a.setJob("Student");
						colections.savetocollection(a,selected_collection1,selected_collection2);
						colections.savetocollection(a,selected_collection1,selected_collection2);
						Person b = new Person("Kamil","Kochan");
						b.setBirthYear(2001);
						b.setJob("Student");
						colections.savetocollection(b,selected_collection1,selected_collection2);
						Person c = new Person("Kornel","Kochan");
						c.setBirthYear(2001);
						c.setJob("Nauczyciel");
						colections.savetocollection(c,selected_collection1,selected_collection2);
						Person d = new Person("Kamil","Madryt");
						d.setBirthYear(2001);
						d.setJob("Gość");
						colections.savetocollection(d,selected_collection1,selected_collection2);
						Person e = new Person("Klaudiusz","Maten");
						e.setBirthYear(2003);
						e.setJob("Gość");
						colections.savetocollection(e,selected_collection1,selected_collection2);
						Person f = new Person("Mateusz","Morawski");
						f.setBirthYear(2000);
						f.setJob("Nauczyciel");
						colections.savetocollection(f,selected_collection1,selected_collection2);
						Person g = new Person("Andrzej","Duda");
						g.setBirthYear(2001);
						g.setJob("Kierownik");
						colections.savetocollection(g,selected_collection1,selected_collection2);
						Person h = new Person("Mateusz","Morawiecki");
						h.setBirthYear(2001);
						h.setJob("Student");
						colections.savetocollection(h,selected_collection1,selected_collection2);
						Person i = new Person("Jarosław","Kaczyski");
						i.setBirthYear(2001);
						i.setJob("Dyrektor");
						colections.savetocollection(i,selected_collection1,selected_collection2);
						Person j = new Person("Andrzenj","Michalski");
						j.setBirthYear(2001);
						j.setJob("Student");
						colections.savetocollection(j,selected_collection1,selected_collection2);
					}
					break;
					case 8: {
						switch(selected_collection1){
							case 1: colections.displayhashset();
							break;
							case 2: colections.displaytreeset();
							break;
							case 3: colections.disarraylist();
							break;
							case 4: colections.dislinkedlist();
							break;
							case 5: colections.dishashmap();
							break;
							case 6: colections.distreemap();
							break;
						}
						System.out.println("---------------");
						switch(selected_collection2){
							case 1: colections.displayhashset();
								break;
							case 2: colections.displaytreeset();
								break;
							case 3: colections.displayhashset();
								break;
							case 4: colections.displayhashset();
								break;
							case 5: colections.displayhashset();
								break;
							case 6: colections.displayhashset();
								break;
						}

					}
					break;
				case 0:
					// zakończenie działania programu
					UI.printInfoMessage("\nProgram zakończył działanie!");
					System.exit(0);
				} // koniec instrukcji switch
			} catch (PersonException e) { 
				// Tu są wychwytywane wyjątki zgłaszane przez metody klasy Person,
				// gdy nie są spełnione ograniczenia nałożone na dopuszczalne wartości
				// poszczególnych atrybutów.
				// Drukowanie komunikatu o błędzie zgłoszonym za pomocą wyjątku PersonException.
				UI.printErrorMessage(e.getMessage());
			}
		} // koniec pętli while
	}
	
	
	/*
	 *  Metoda wyświetla w oknie konsoli dane aktualnej osoby 
	 *  pamiętanej w zmiennej currentPerson.
	 */
	void showCurrentPerson() {
		showPerson(currentPerson);
	}

	
	/* 
	 * Metoda wyświetla w oknie konsoli dane osoby reprezentowanej 
	 * przez obiekt klasy Person
	 */ 
	static void showPerson(Person person) {
		StringBuilder sb = new StringBuilder();
		
		if (person != null) {
			sb.append("Aktualna osoba: \n")
			  .append("      Imię: ").append(person.getFirstName()).append("\n")
			  .append("  Nazwisko: ").append(person.getLastName()).append("\n")
			  .append("   Rok ur.: ").append(person.getBirthYear()).append("\n")
			  .append("Stanowisko: ").append(person.getJob()).append("\n");
		} else
			sb.append( "Brak danych osoby\n" );
		UI.printMessage( sb.toString() );
	}

	
	/* 
	 * Metoda wczytuje w konsoli dane nowej osoby, tworzy nowy obiekt
	 * klasy Person i wypełnia atrybuty wczytanymi danymi.
	 * Walidacja poprawności danych odbywa się w konstruktorze i setterach
	 * klasy Person. Jeśli zostaną wykryte niepoprawne dane,
	 * to zostanie zgłoszony wyjątek, który zawiera komunikat o błędzie.
	 */
	static Person createNewPerson(){
		String first_name = UI.enterString("Podaj imię: ");
		String last_name = UI.enterString("Podaj nazwisko: ");
		String birth_year = UI.enterString("Podaj rok ur.: ");
		UI.printMessage("Dozwolone stanowiska:" + Arrays.deepToString(PersonJob.values()));
		String job_name = UI.enterString("Podaj stanowisko: ");
		Person person;
		try { 
			// Utworzenie nowego obiektu klasy Person oraz
			// ustawienie wartości wszystkich atrybutów.
			person = new Person(first_name, last_name);
			person.setBirthYear(birth_year);
			person.setJob(job_name);
		} catch (PersonException e) {    
			// Tu są wychwytywane wyjątki zgłaszane przez metody klasy Person,
			// gdy nie są spełnione ograniczenia nałożone na dopuszczalne wartości
			// poszczególnych atrybutów.
			// Drukowanie komunikatu o błędzie zgłoszonym za pomocą wyjątku PersonException.
			UI.printErrorMessage(e.getMessage());
			return null;
		}
		return person;
	}
	
	
	/* 
	 * Metoda pozwala wczytać nowe dane dla poszczególnych atrybutów 
	 * obiekty person i zmienia je poprzez wywołanie odpowiednich setterów z klasy Person.
	 * Walidacja poprawności wczytanych danych odbywa się w setterach
	 * klasy Person. Jeśli zostaną wykryte niepoprawne dane,
	 * to zostanie zgłoszony wyjątek, który zawiera komunikat o błędzie.
	 */
	static void changePersonData(Person person)
	{
		while (true) {
			UI.clearConsole();
			showPerson(person);

			try {		
				switch (UI.enterInt(CHANGE_MENU + "==>> ")) {
				case 1:
					person.setFirstName(UI.enterString("Podaj imię: "));
					break;
				case 2:
					person.setLastName(UI.enterString("Podaj nazwisko: "));
					break;
				case 3:
					person.setBirthYear(UI.enterString("Podaj rok ur.: "));
					break;
				case 4:
					UI.printMessage("Dozwolone stanowiska:" + Arrays.deepToString(PersonJob.values()));
					person.setJob(UI.enterString("Podaj stanowisko: "));
					break;
				case 0: return;
				}  // koniec instrukcji switch
			} catch (PersonException e) {     
				// Tu są wychwytywane wyjątki zgłaszane przez metody klasy Person,
				// gdy nie są spełnione ograniczenia nałożone na dopuszczalne wartości
				// poszczególnych atrybutów.
				// Drukowanie komunikatu o błędzie zgłoszonym za pomocą wyjątku PersonException.
				UI.printErrorMessage(e.getMessage());
			}
		}
	}
	
	
}  // koniec klasy PersonConsoleApp
