//Coded by Trevor
//More information to be added
//search your country

import java.util.*;
import java.io.*;

class Countries{

private String countryNameS;
private String countryNameP;
private String capitalCity;
private String president;
private int province;


public Countries(String nameS,String nameP,String prsdnt, String cptlCity, int prvnc) {   
 

this.countryNameS = nameS;
this.countryNameP  = nameP;
this.capitalCity  = cptlCity;
this.president = prsdnt;
this.province = prvnc;

}

public void displayCountries() {
    
    System.out.println("Country Name      : "+this.countryNameP);
    System.out.println("Head of State     : "+this.president);
    System.out.println("Capital City      : "+this.capitalCity);
    
    
    System.out.println("Province/District : "+this.province+ "\n");   
}

public String getCountry(){

    return this.countryNameS;
    }   
}

class CountryData 
 {
    private Countries[] a;
    private String[] s;
    private int nElement;

public CountryData(int max) {    
    a = new Countries[max];
    s = new String[max];
    nElement=0;
}

//character input
public char[] getCharInput(String input, int leng){

   
    char[] ch = new char[leng];
    for(int i=0; i< 3; i++)
    {
     ch[i] = input.charAt(i);
     
  }   
    return ch;
}

//character to search
public char[] characterS(String name, int leng){
    
    char[] nameChar = new char[leng];
    for(int i=0; i< 3;i++){
        nameChar[i] = name.charAt(i);
    }
    return nameChar;   
}

// character to print
public char[] characterP(String name, int leng){
    
    char[] nameCharPr = new char[leng];
    for(int i=0; i< name.length();i++){
        nameCharPr[i] = name.charAt(i);
    }
    return nameCharPr;   
}

// Arranged array
public void insert(String nameS  ,String nameP , String prsdnt,String cptlCity,  int prvnc)
 {
 
    a[nElement] = new Countries(nameS, nameP, prsdnt, cptlCity, prvnc);
    nElement++;
}


//Method for String of country names

public String getString(char[] countryN){
    
    String cn;
    cn = String.valueOf(countryN);
    
    return cn;
}

//Method to search a country
public Countries find(String searchName) {

    int i;
    for(i = 0; i < nElement; i++)
    if(a[i].getCountry().equalsIgnoreCase(searchName))
    break;
    
    if(i == nElement){
        return null;
    }
    
    else {
        return a[i];
    }     
}

String[] flN = {
      "Country not found",
      "Afghanistan",
      "Albania",
      "Algeria",
      "Andorra",
      "Angola",
      "Antigua and Barbuda",
      "Argentina",
      "Armenia",
      "Australia",
      "Austria",
      "Azerbaijan",
      "Bahrain",
      "Bangladesh",
      "Barbados",
      "Belarus",
      "Belgium",
      "Belize",
      "Benin",
      "Bhutan",
      "Bolivia",
      "Bosnia and Herzegovina",
      "Botswana",
      "Brazil",
      "Brunei",
      "Bulgaria",
      "Burkina Faso",
      "Burundi",
      "Cambodia",
      "Cameroon",
      "Canada",
      "Cape Verde",
      "Cayman Islands",
      "Central African",
      "Chad",
      "Chile",//ChiliChileWestern South America
      "China", //ChineZhong GuoEastern Asia

      "Christmas", //IslandIle ChristmasChristmas IslandSoutheast Asia

      "Cocos", //(Keeling) IslandsIles Cocos (Keeling)Cocos (Keeling) IslandsSouth-East Asia, Australia

      "Colombia", //ColombieColombiaNorth West South America

       "Comoros", //ComoresComoresEastern Africa

       "Democratic", //Republic of the Congo Kinshasa Congo, La Republique Democratique duRepublique Democratique du CongoCentral Africa

        "Congo", //Republic of Brazzaville Republique du CongoRepublique du CongoCentral Africa

        "Cook", //IslandsIles CookCook IslandsPolynesia, Oceania

        "Costa Rica", //Costa RicaCosta RicaCentral America

    "Cote divore",

        "Croatia", //CroatieHrvatskaSouthern Europe

         "Cuba", //CubaCubaGreater Antilles, Caribbean

          "Cyprus", //ChypreKibris, KyprosMediterranean, Western Asia

           "Czech", //RepublicRepublique                                   TchequeCeska
           "RepublikaEastern", // Europe

            "Denmark", //DanemarkDanmarkNorthern Europe

"Djibouti",  //DjiboutiDjiboutiEastern Africa

"Dominica", //DominiqueDominicaLesser Antilles, Caribbean

//Dominican RepublicDominicaine, RepubliqueDominicana, RepublicaGreater Antilles, Caribbean E

"East Timor", //Timor-Leste Timor-Leste (Timor Oriental)TimorSouth-East Asia

"Ecuador", //EquateurEcuadorNorth West South America

"Egypt", //EgypteMisrAfrica, Middle East

"El Salvador", //El SalvadorEl SalvadorCentral America

"Equatorial GuineaGuinee", //EquatorialeGuinea EcuatorialCentral Africa

"Eritrea", //ErythreeHagere ErtraEastern Africa

"EstoniaEstonieEesti", // VabariikNorthern Europe

"Ethiopia", //EthiopieItyop'iyaEastern Africa F

"Falkland", //IslandsFalkland", Iles (Malvinas)Islas MalvinasSouthern South America

"Faroe", //IslandsÎles FeroeForoyarNorthern Europe

"Fiji", //FidjiFijiMelanesia, Oceania

"FinlandFinlandeSuomen", //TasavaltaNorthern Europe

"France", //FranceFranceWestern Europe

"French ",  //GuianaGuyane FrancaiseGuyaneNorthern South America

"French PolynesiaPolynésie", //4 FrancaisePolynesie FrancaisePolynesia, Oceania

"French Southern", //TerritoriesTerres Australes FrancaisesTerres Australes et Antarctiques FrancaisesSouthern South America, Antarctic G

"Gabon", //GabonGabonCentral Africa

"Gambia", //GambieThe GambiaWest Africa

"Georgia", //GeorgieSak'art'veloWestern Asia

"Germany", //AllemagneDeutschlandWestern Europe

"Ghana", //GhanaGhanaWest Africa

"Gibraltar", //GibraltarGibraltarSouthern Europe

"Great Britain", //Grande-BretagneGreat BritainNorthern Europe

"Greece", //GreceEllas or ElladaSouthern Europe

"Greenland", //GroenlandKalaallit NunaatNorth America

"Grenada", //GrenadeGrenadaLesser Antilles, Caribbean

"Guadeloupe", //GuadeloupeGuadeloupeLesser Antilles, Caribbean

"Guam", //GuamGuamMicronesia, Oceania

"Guatemala", //GuatemalaGuatemalaCentral America

"Guinea", //GuineeeGuineeWest Africa

"Guinea-Bissau", //Guinee-BissauGuine-BissauWest Africa

"Guyana", //Guyana


"Haiti",  //HaitiHaitiGreater Antilles, Caribbean

"Holy See", //Saint-Siege (Etat de la Cite du Vatican)Status Civitatis VaticanaeSouthern Europe within Italy

"Honduras", //HondurasHondurasCentral America

"Hong Kong", //Hong-KongXianggangEastern Asia

"Hungary", //HongrieMagyarorszagEastern Europe 

"Iceland", //IslandeLyoveldio IslandNorthern Europe

"India", //IndeBharatSouth-Central Asia

"Indonesia", //IndonésieIndonesiaMaritime South-East Asia

"Iran", //(Islamic Republic of)Republique Islamique d' IranIranSouth-Central Asia

"Iraq", //IraqIraqMiddle East, Western Asia

"Ireland", //IrlandeÉireNorthern Europe

"Israel", //IsraëlYisra'elMiddle East, Western Asia

"Italy", //ItalieItaliaSouthern Europe

"Ivory Coast", //Cote D'ivoireCote d'IvoireWest Africa J

"Jamaica", //JamaïqueJamaicaGreater Antilles, Caribbean

"Japan", //JaponNipponEastern Asia

"Jordan", //JordanieAl UrdunMiddle East, Western Asia 


"Kazakhstan", //KazakstanQazaqstanCentral Asia

"Kenya", //KenyaKenyaEastern Africa

"Kiribati", //KiribatiKiribati, KiribasMicronesia, Oceania

"Korea", // Democratic People's Rep. (North Korea)Corée, République Populaire Démocratique deChosonEastern Asia

"Korea", //Republic of (South Korea)Corée, République deHan-gukEastern Asia KosovoKosovoAlbanian: : Kosova ou Kosovë,
"Serbian", //: Kosovo, КосовоSouthern Europe

"KuwaitKoweitAl", //KuwaytMiddle East, Western Asia

"Kyrgyzstan", //KirghizistanKyrgyz RespublikasyCentral Asia L

"Lao", //People's Democratic RepublicLao, République Démocratique PopulaireLaoSouth-East Asia

"Latvia", //LettonieLatvijaNorthern Europe

"Lebanon", //LibanLubnanMiddle East, Western Asia

"Lesotho", //LesothoLesothoSouthern Africa

"Liberia", //LibériaLiberiaWest Africa

"Libya", //LibyeLibiyahNorthern Africa

"Liechtenstein",  // LiechtensteinLiechtensteinWestern Europe

"Lithuania", //LituanieLietuvaNorthern Europe

"Luxembourg", //LuxembourgLuxembourg, LetzebuergWestern Europe M

"Macau", //MacaoAomenEastern Asia

"Macedonia", //Rep. ofMacédoine, l'ex-République Yougoslave deMakedonijaSouthern Europe

//Madagascar", MadagascarMadagascarEastern Africa

"Malawi", //MalawiMalawiEastern Africa

"Malaysia", //MalaisieMalaysiaSoutheast Asia

"Maldives",   //MaldivesDhivehi RaajjeSouth-Central Asia

"Mali", //MaliMaliWest Africa

"Malta", //MalteMaltaSouthern Europe

"Marshall", // IslandsÎles MarshallMarshall IslandsMicronesia, Oceania

"Martinique", //MartiniqueMartiniqueLesser Antilles, Caribbean

"Mauritania", //MauritanieMuritaniyahWest Africa

"Mauritiusile", // MauriceMauritiusEastern Africa

"Mayotte", //MayotteMayotteEastern Africa

"Mexico", //MexiqueEstados Unidos MexicanosNorth America

"Micronesia", //Federal States ofÉtats Fédérés de MicronésieMicronesiaMicronesia, Oceania

"Moldova", //Republic ofMoldova, République deMoldovaEastern Europe

"Monaco", //MonacoMonacoSouthern Europe

"Mongolia", //MongolieMongol UlsEastern Asia

"Montenegro", //MontenegroCrna GoraSouthern Europe

"Montserrat", //MontserratMontserratLesser Antilles, Caribbean

"Morocco", //MarocAl MaghribNorthern Africa

"Mozambique", //MozambiqueMocambiqueEastern Africa

"Myanmar", //BurmaMyanmar, BirmanieMyanma NaingngandawSoutheast Asia

"Namibia", //NamibieNamibiaSouthern Africa

"Nauru", //NauruNauruMicronesia, Oceania

"Nepal", //NepalNepalSouth-Central Asia

"Netherlands", //Pays-BasNederland/HollandWestern Europe

//Netherlands AntillesAntilles NeerlandaisesNederlandse AntillenCaribbean

"New Caledonia", //Nouvelle-CalédonieNouvelle-CalédonieMelanesia, Oceania

"New Zealand", //Nouvelle-ZélandeAotearoaOceania; Australia

"Nica", //raguaNicaraguaNicaraguaCentral America

"Niger", //NigerNigerWest Africa

"Nigeria", //NigériaNigeriaWest Africa

"Niue", //NiouéNiuePolynesia, Oceania

"Northern Mariana", //IslandsÎles Mariannes du NordNorthern Mariana IslandsMicronesia, Oceania

"Norway", //NorvègeNorgeNorthern Europe O

"Oman", //OmanSaltanat UmanMiddle East P

"Pakistan", //PakistanPakistanSouth-Central Asia

"Palau", //PalaosBelauMicronesia, Oceania

"Palestinian", // territoriesAutorité Nationale PalestinienneFilastinMiddle East, Western Asia

"Panama", //PanamaPanamaCentral America

"Papua", // New GuineaPapouasie-Nouvelle-GuinéePapua Niu GiniMaritime Southeast Asia, Melanesia, Oceania

"Paraguay", //ParaguayParaguayCentral South America

"Peru", //PérouPeruWestern South America

"Philippines", //PhilippinesPilipinasSoutheast Asia

"Pitcairn", //IslandPitcairnPitcairn IslandPolynesia, Oceania

"Poland", //PolognePolskaEastern Europe

"Portugal", //PortugalPortugalSouthern Europe

"Puerto Rico", //Porto RicoPuerto RicoGreater Antilles, Caribbean Q

"Qatar", //QatarDawlat QatarArabian Peninsula, Middle East R

"Reunion", //IslandIle de la RéunionIle de la RéunionEastern Africa

"Romania", //RoumanieRomaniaEastern Europe

"Russian", // FederationRussie, Fédération deRossiyaEastern Europe - Northern Asia

"Rwanda", //RwandaRwandaEastern Africa, African Great Lakes S

"Saint Kitts", // and NevisSaint-Kitts-et-Nevis Lesser Antilles, Caribbean

"Saint Lucia", //Sainte-LucieSaint LuciaLesser Antilles, Caribbean

"Saint Vincent", //and the GrenadinesSaint-Vincent-et-les Grenadines Lesser Antilles, Caribbean

"Samoa", //SamoaSamoaPolynesia, Oceania

"San MarinoSaint", //MarinSan MarinoSouthern Europe within Italy

"Sao", //Tome and PrincipeSao Tomé-et-PrincipeSao Tome e PrincipeCentral Africa

"Saudi", //ArabiaArabie SaouditeAl Arabiyah as SuudiyahArabian Peninsula, Middle East

"Senegal", //SenegalSenegalWest Africa

"Serbia", //SerbieSrbijaSouthern Europe

"Seychelles", //SeychellesSeychellesEastern Africa

"Sierra", //LeoneSierra LeoneSierra LeoneWest Africa

"Singapore", //SingapourSingaporeSoutheast Asia

"Slovakia", // (Slovak Republic)SlovaquieSlovenskoEastern Europe

"Slovenia", //SlovénieSlovenijaSouthern Europe

"Solomon", //IslandsSalomon, ÎlesSolomon IslandsMelanesia, Oceania

"Somalia", //SomalieSomaliaEastern Africa

"South Africa", //Afrique du SudSouth AfricaSouthern Africa

"South Sudan", //Soudan du SudSouth SudanEast-Central Africa

"Spain", //EspagneEspañaSouthern Europe

"Sri", // LankaSri LankaSri LankaSouth-Central Asia

"Sudan", //SoudanAs-SudanNorthern Africa

"Suriname", //SurinameSurinameNorth-Eastern South America

"Swaziland", //SwazilandSwazilandSouthern Africa

"Sweden", //SuedeSverigeNorthern Europe

"Switzerland", //SuisseSchweiz (German), Suisse (French), Svizzera (Italian)Western Europe

"Syria", //Syrian Arab RepublicSyrienne, République ArabeSuriyahMiddle East, Western Asia T ￼ English Name

"Taiwan", // (Republic of China)Taïwan, Province de ChineT'ai-wanEastern Asia

"Tajikistan", //TadjikistanJumhurii TojikistonCentral Asia

"Tanzania", //officially the United Republic of TanzaniaTanzanie, République-Unie deJamhuri ya Muungano wa TanzaniaEastern Africa

"Thailand", //ThaïlandePrathet ThaiSouth-East Asia

"Tibet", //TibetBodSouth-Central Asia

"Timor Leste",// South East Asia

"Togo", //TogoRepublique TogolaiseWest Africa

"Tokelau", //TokelauTokelauOceania/Australia

"Tonga", //TongaTongaPolynesia, Oceania

"Trinidad", //and TobagoTrinité-et-TobagoTrinidad, TobagoNorthern South America, Caribbean

"Tunisia", //TunisieTunisNorthern Africa

"Turkey", //TurquieTurkiyeSoutheastern Europe, Western Asia

"Turkmenistan", //TurkménistanTurkmenistanCentral Asia

"Turks and Caicos", //IslandsTurks et Caïques, ÎlesTurks and Caicos IslandsCaribbean, parts of the Bahamas island chain.

"Tuvalu", //TuvaluTuvaluPolynesia, Oceania U

"Uganda", //OugandaUgandaEastern Africa

"Ukraine", //UkraineUkrayinaEastern Europe

"United Arab Emirates", //Emirats Arabes UnisAl Imarat al Arabiyah al MuttahidahArabian Peninsula, Middle East

"United Kingdom", //Royaume-UniUnited KingdomNorthern Europe

"United States", //Etats-UnisUnited StatesNorth America

"Uruguay", //UruguayRepublica Oriental del UruguayCentral East South America

"Uzbekistan", //OuzbékistanUzbekiston RespublikasiCentral Asia 


"Vanuatu", //VanuatuVanuatuMelanesia, Oceania

"Vatican City State", // (Holy See)Saint-Siège (État de la Cité du Vatican)Status Civitatis VaticanæSouthern Europe within Italy

"Venezuela", //VenezuelaVenezuelaNorthern South America

"Vietnam", //Viêt NamViet NamSouth-East Asia

"Virgin Islands", //(British)Îles Vierges Britanniques Lesser Antilles, Caribbean

"Virgin Islands ", //(U.S.)Îles Vierges des États-UnisVirgin IslandsLesser Antilles, Caribbean W

"Wallis and FutunaWallis", // IslandsWallis et FutunaWallis et FutunaPolynesia, Oceania

"Western Sahara", //Sahara OccidentalAṣ-Ṣaḥrā’ al-GharbīyahNorthern Africa Y

"Yemen", //YémenAl YamanArabian Peninsula, Middle East Z

"Zambia", //ZambieZambiaEastern Africa

"Zimbabwe"

};


public String findCntrn(String searchName) {

    int i;
    for(i = 0; i < flN.length; i++)
    if(flN[i].equalsIgnoreCase(searchName))
    break;
    
    if(i == flN.length){
        return flN[0];
    }
    
    else {
        return flN[i];
    }     
}

/* find country aindex */
public int fcIndex(String searchName) {

    int i;
    for(i = 0; i < flN.length; i++)
    if(flN[i].equalsIgnoreCase(searchName))
    break;
    
    if(i == flN.length){
        return 0;
    }
    
    else {
        return i;
    }     
}

String[] prsdnt = {
    "not found",
    "Ashraf Ghani",
    "Bujar Nishani",
    "Abdelmadjid tebboune",
    "Xavier Espot Zamora",
    "Joao Lourenco",
    "Gaston Alfonso Browne",
    "Alberto Fernandez",
    "Armen Sarkissian",
    "Scott John Morrison",
    "Alexander Van der Bellen",
    "Ilham Aliyev",
    "Hamad bin Isa bin Salman al-Khalifa",    
    "Mohammad Abdul Hamid (born 1 January 1944)",
    "Mia Amor Mottley, QC, MP (born 1 October 1965)",
    "Alexander Lukashenko",
    "Charles Michel",
    "Dean Barrow", 
    "Patrice Talon",
    "Lotay Tshering",
    "Jeanine Anez",
    "Donald Tusk",
    "Mokgweetsi Masisi",
    "Jair Bolsonaro",
    "Hassanal Bolkiah",
    "Rumen Radev",
    "Roch Mark Chritian Kaboré",
    "Pierre Nkurunziza",
    "Hun Sen",
    "Paul Biya",
    "Justin Pierre James Trudeau",
    "Jorge Carlos Fonseca",
    "Martyn Roper",
    "David Dacko",
    "Idriss Déby",
    "Sebastian Piñera",
    "Xi Jinping",
    "Hage Geingob"
    
};

public String findPr(int cIndex) {

    int i;
    for(i = 0; i < prsdnt.length; i++)
    if(i == cIndex)
    break;
    
    if(i == prsdnt.length){
        return prsdnt[0];
    }
    
    else {
        return prsdnt[i];
    }     
}

String[] cptlCt = {
    "not found",
    "Kabul",
    "Tirana",
    "Algiers",
    "Andora la vella",
    "Luanda",
    "Saint John's",
    "Buenos Aires",
    "Yerevan",
    "Canberra",
    "Vienna",
    "Baku", 
    "Manama",
    "Dhaka",
    "Bridgetown",
    "Minsk",
    "Brussels",
    "Belmopan",
    "Porto-Novo",
    "Thimphu",
    "Sucre",
    "Sarajevo",
    "Gabarone",
    "Brasilia",
    "Bandar Seri Begawan",
    "Sofia",
    "Ouagadougou",
    "Gitega", 
    "Phnom Penh",
    "Yaounde",
    "Ottawa",
    "Praia",
    "Jorge Town",
    "Bangui",
    "N'Djamena",
    "Santiago",
    "Beijing"
};

public String findCptlct(int cIndex) {

    int i;
    for(i = 0; i < cptlCt.length; i++)
    if(i == cIndex)
    break;
    
    if(i == cptlCt.length){
        return cptlCt[0];
    }
    
    else {
        return cptlCt[i];
    }     
}

int[] prvnce = {
    0, 34, 12, 48, 7, 8, 7, 23, 10, 6, 9, 9, 4, 8, 11, 6, 10, 6, 12, 9, 112, 0, 17, 26, 4, 28, 45, 18, 25, 10, 10, 32, 24, 25, 23, 54, 25
    
};



public int findPrvnc(int cIndex) {


    int i;
    for(i = 0; i < prvnce.length; i++)
    if(i == cIndex)
    break;
    
    if(i == prvnce.length){
        return prvnce[0];
    }
    
    else {
        return prvnce[i];
    }     
}


public void ans() {
    
}

public void displayA(){
    int j;
    for(j=0;j<nElement;j++){
        a[j].displayCountries();
      }    
   }        
}


class Second{

    public static void main(String [] args){

String fullName;
String cntrn;
String prsdnt;
String searchKey;
String countryS;
String cptlCity;
int prvnc;
 
 int length = 5;     
      int max =100; 
       CountryData arr;
       arr = new CountryData(max); 
       
Scanner scn = new Scanner(System.in);
String input = scn.nextLine();
       
       int leng = 1000;
       
//calling methods
cntrn = arr.findCntrn(input);
prsdnt = arr.findPr(arr.fcIndex(input));
cptlCity = arr.findCptlct(arr.fcIndex(input));
prvnc = arr.findPrvnc(arr.fcIndex(input));
         
       arr.insert(cntrn , cntrn, prsdnt, cptlCity, prvnc);
    System.out.println(input+" is number: "+arr.fcIndex(input)+" from the list.");
                   
       Countries found;
         
       found = arr.find(cntrn);
       if(found != null)
    {
    System.out.println("You entered '"+input+"'");
           System.out.println("Are you trying to search "+cntrn+"?"+"\n");
           found.displayCountries();                     
       }
       
       else {
           System.out.println("Country "+input+" not found"+"\n");
           }
           System.out.println("Please note: i haven't add all information yet."+"\n"+ "Enter only first 36 countries from the list."+"\r\n"+"If you like it give it a like👍");
            
    }
}

