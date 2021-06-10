package com.example.tabletopplatform.bootstrap;

import com.example.tabletopplatform.domain.Game;
import com.example.tabletopplatform.domain.Publisher;
import com.example.tabletopplatform.repositories.GameRepository;
import com.example.tabletopplatform.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Bootstrap implements CommandLineRunner {

    private final PublisherRepository publisherRepository;
    private final GameRepository gameRepository;

    public Bootstrap(PublisherRepository publisherRepository, GameRepository gameRepository) {
        this.publisherRepository = publisherRepository;
        this.gameRepository = gameRepository;
    }

    @Override
    public void run(String... args) {
        loadPublishers();
        loadGames();
    }

    private void loadGames() {
        Set<Game> gameSet = new HashSet<>();

        Publisher daysOfWonder = publisherRepository.findByName("Days of Wonder");

        Game fiveTribes = new Game();
        fiveTribes.setTitle("Five Tribes");
        fiveTribes.setMinPlayers(2);
        fiveTribes.setMaxPlayers(4);
        fiveTribes.setMinAge(13);
        fiveTribes.setPublisher(daysOfWonder);
        gameSet.add(fiveTribes);

        Game ticketToRideEurope = new Game();
        ticketToRideEurope.setTitle("Ticket to Ride: Europe");
        ticketToRideEurope.setMinPlayers(2);
        ticketToRideEurope.setMaxPlayers(5);
        ticketToRideEurope.setMinAge(8);
        ticketToRideEurope.setPublisher(daysOfWonder);
        gameSet.add(ticketToRideEurope);

        Game memoir44 = new Game();
        memoir44.setTitle("Memoir '44");
        memoir44.setMinPlayers(2);
        memoir44.setMaxPlayers(8);
        memoir44.setMinAge(8);
        memoir44.setPublisher(daysOfWonder);
        gameSet.add(memoir44);

        Game ticketToRideNordic = new Game();
        ticketToRideNordic.setTitle("Ticket to Ride: Nordic Countries");
        ticketToRideNordic.setMinPlayers(2);
        ticketToRideNordic.setMaxPlayers(3);
        ticketToRideNordic.setMinAge(8);
        ticketToRideNordic.setPublisher(daysOfWonder);
        gameSet.add(ticketToRideNordic);

        Game splendor = new Game();
        splendor.setTitle("Splendor");
        splendor.setMinPlayers(2);
        splendor.setMaxPlayers(4);
        splendor.setMinAge(10);
        splendor.setPublisher(daysOfWonder);
        gameSet.add(splendor);


        Publisher zMan = publisherRepository.findByName("Z-Man Games");

        Game pandemicLegacy1 = new Game();
        pandemicLegacy1.setTitle("Pandemic Legacy: Season 1");
        pandemicLegacy1.setMinPlayers(2);
        pandemicLegacy1.setMaxPlayers(4);
        pandemicLegacy1.setMinAge(13);
        pandemicLegacy1.setPublisher(zMan);
        gameSet.add(pandemicLegacy1);

        Game gaia = new Game();
        gaia.setTitle("Gaia Project");
        gaia.setMinPlayers(1);
        gaia.setMaxPlayers(4);
        gaia.setMinAge(12);
        gaia.setPublisher(zMan);
        gameSet.add(gaia);

        Game terraMystica = new Game();
        terraMystica.setTitle("Terra Mystica");
        terraMystica.setMinPlayers(2);
        terraMystica.setMaxPlayers(5);
        terraMystica.setMinAge(12);
        terraMystica.setPublisher(zMan);
        gameSet.add(terraMystica);

        Game feastForOdin = new Game();
        feastForOdin.setTitle("A Feast for Odin");
        feastForOdin.setMinPlayers(1);
        feastForOdin.setMaxPlayers(4);
        feastForOdin.setMinAge(12);
        feastForOdin.setPublisher(zMan);
        gameSet.add(feastForOdin);

        Game agricola = new Game();
        agricola.setTitle("Agricola");
        agricola.setMinPlayers(1);
        agricola.setMaxPlayers(4);
        agricola.setMinAge(12);
        agricola.setPublisher(zMan);
        gameSet.add(agricola);


        Publisher cephalofairGames = publisherRepository.findByName("Cephalofair Games");

        Game gloomhaven = new Game();
        gloomhaven.setTitle("Gloomhaven");
        gloomhaven.setMinPlayers(1);
        gloomhaven.setMaxPlayers(4);
        gloomhaven.setMinAge(14);
        gloomhaven.setPublisher(cephalofairGames);
        gameSet.add(gloomhaven);

        Game gloomhavenJaws = new Game();
        gloomhavenJaws.setTitle("Gloomhaven: Jaws of the Lion");
        gloomhavenJaws.setMinPlayers(1);
        gloomhavenJaws.setMaxPlayers(4);
        gloomhavenJaws.setMinAge(14);
        gloomhavenJaws.setPublisher(cephalofairGames);
        gameSet.add(gloomhavenJaws);

        Game forgeWar = new Game();
        forgeWar.setTitle("Forge War");
        forgeWar.setMinPlayers(1);
        forgeWar.setMaxPlayers(4);
        forgeWar.setMinAge(12);
        forgeWar.setPublisher(cephalofairGames);
        gameSet.add(forgeWar);

        Game founders = new Game();
        founders.setTitle("Founders of Gloomhaven");
        founders.setMinPlayers(1);
        founders.setMaxPlayers(4);
        founders.setMinAge(12);
        founders.setPublisher(cephalofairGames);
        gameSet.add(founders);

        Game frosthaven = new Game();
        frosthaven.setTitle("Frosthaven");
        frosthaven.setMinPlayers(2);
        frosthaven.setMaxPlayers(4);
        frosthaven.setMinAge(13);
        frosthaven.setPublisher(cephalofairGames);
        gameSet.add(frosthaven);


        Publisher roxley = publisherRepository.findByName("Roxley");

        Game brassBirmingham = new Game();
        brassBirmingham.setTitle("Brass: Birmingham");
        brassBirmingham.setMinPlayers(2);
        brassBirmingham.setMaxPlayers(4);
        brassBirmingham.setMinAge(14);
        brassBirmingham.setPublisher(roxley);
        gameSet.add(brassBirmingham);

        Game brassLancashire = new Game();
        brassLancashire.setTitle("Brass: Lancashire");
        brassLancashire.setMinPlayers(2);
        brassLancashire.setMaxPlayers(4);
        brassLancashire.setMinAge(14);
        brassLancashire.setPublisher(roxley);
        gameSet.add(brassLancashire);

        Game santorini = new Game();
        santorini.setTitle("Santorini");
        santorini.setMinPlayers(2);
        santorini.setMaxPlayers(4);
        santorini.setMinAge(8);
        santorini.setPublisher(roxley);
        gameSet.add(santorini);

        Game diceThrone2 = new Game();
        diceThrone2.setTitle("Dice Throne: Season Two – Battle Chest");
        diceThrone2.setMinPlayers(2);
        diceThrone2.setMaxPlayers(6);
        diceThrone2.setMinAge(8);
        diceThrone2.setPublisher(roxley);
        gameSet.add(diceThrone2);

        Game diceThrone = new Game();
        diceThrone.setTitle("Dice Throne: Season One");
        diceThrone.setMinPlayers(2);
        diceThrone.setMaxPlayers(6);
        diceThrone.setMinAge(8);
        diceThrone.setPublisher(roxley);
        gameSet.add(diceThrone);


        Publisher fryxGames = publisherRepository.findByName("FryxGames");

        Game mars = new Game();
        mars.setTitle("Terraforming Mars");
        mars.setMinPlayers(1);
        mars.setMaxPlayers(5);
        mars.setMinAge(12);
        mars.setPublisher(fryxGames);
        gameSet.add(mars);

        Game virus = new Game();
        virus.setTitle("After The Virus");
        virus.setMinPlayers(1);
        virus.setMaxPlayers(3);
        virus.setMinAge(10);
        virus.setPublisher(fryxGames);
        gameSet.add(virus);

        Game wilderness = new Game();
        wilderness.setTitle("Wilderness");
        wilderness.setMinPlayers(2);
        wilderness.setMaxPlayers(8);
        wilderness.setMinAge(13);
        wilderness.setPublisher(fryxGames);
        gameSet.add(wilderness);

        Game spaceStation = new Game();
        spaceStation.setTitle("Space Station");
        spaceStation.setMinPlayers(2);
        spaceStation.setMaxPlayers(6);
        spaceStation.setMinAge(12);
        spaceStation.setPublisher(fryxGames);
        gameSet.add(spaceStation);

        Game fleets = new Game();
        fleets.setTitle("Fleets: The Pleiad Conflict");
        fleets.setMinPlayers(2);
        fleets.setMaxPlayers(4);
        fleets.setMinAge(12);
        fleets.setPublisher(fryxGames);
        gameSet.add(fleets);


        Publisher fantasyFlightGames = publisherRepository.findByName("Fantasy Flight Games");

        Game twilightImperium = new Game();
        twilightImperium.setTitle("Twilight Imperium: Fourth Edition");
        twilightImperium.setMinPlayers(3);
        twilightImperium.setMaxPlayers(6);
        twilightImperium.setMinAge(14);
        twilightImperium.setPublisher(fantasyFlightGames);
        gameSet.add(twilightImperium);

        Game starWars = new Game();
        starWars.setTitle("Star Wars: Rebellion");
        starWars.setMinPlayers(2);
        starWars.setMaxPlayers(4);
        starWars.setMinAge(14);
        starWars.setPublisher(fantasyFlightGames);
        gameSet.add(starWars);

        Game arkhamHorror = new Game();
        arkhamHorror.setTitle("Arkham Horror: The Card Game");
        arkhamHorror.setMinPlayers(1);
        arkhamHorror.setMaxPlayers(2);
        arkhamHorror.setMinAge(14);
        arkhamHorror.setPublisher(fantasyFlightGames);
        gameSet.add(arkhamHorror);

        Game mansions = new Game();
        mansions.setTitle("Mansions of Madness: Second Edition");
        mansions.setMinPlayers(1);
        mansions.setMaxPlayers(5);
        mansions.setMinAge(14);
        mansions.setPublisher(fantasyFlightGames);
        gameSet.add(mansions);

        Game marvelChampions = new Game();
        marvelChampions.setTitle("Marvel Champions: The Card Game");
        marvelChampions.setMinPlayers(1);
        marvelChampions.setMaxPlayers(4);
        marvelChampions.setMinAge(14);
        marvelChampions.setPublisher(fantasyFlightGames);
        gameSet.add(marvelChampions);


        Publisher czechGamesEdition = publisherRepository.findByName("Czech Games Edition");

        Game agesNew = new Game();
        agesNew.setTitle("Through the Ages: A New Story of Civilization");
        agesNew.setMinPlayers(2);
        agesNew.setMaxPlayers(4);
        agesNew.setMinAge(14);
        agesNew.setPublisher(czechGamesEdition);
        gameSet.add(agesNew);

        Game tzolkin = new Game();
        tzolkin.setTitle("Tzolk'in: The Mayan Calendar");
        tzolkin.setMinPlayers(2);
        tzolkin.setMaxPlayers(4);
        tzolkin.setMinAge(13);
        tzolkin.setPublisher(czechGamesEdition);
        gameSet.add(tzolkin);

        Game ages = new Game();
        ages.setTitle("Through the Ages: A Story of Civilization");
        ages.setMinPlayers(2);
        ages.setMaxPlayers(4);
        ages.setMinAge(12);
        ages.setPublisher(czechGamesEdition);
        gameSet.add(ages);

        Game lostRuins = new Game();
        lostRuins.setTitle("Lost Ruins of Arnak");
        lostRuins.setMinPlayers(1);
        lostRuins.setMaxPlayers(4);
        lostRuins.setMinAge(12);
        lostRuins.setPublisher(czechGamesEdition);
        gameSet.add(lostRuins);

        Game codenames = new Game();
        codenames.setTitle("Codenames");
        codenames.setMinPlayers(2);
        codenames.setMaxPlayers(8);
        codenames.setMinAge(14);
        codenames.setPublisher(czechGamesEdition);
        gameSet.add(codenames);


        Publisher gmtGames = publisherRepository.findByName("GMT Games");

        Game twilightStruggle = new Game();
        twilightStruggle.setTitle("Twilight Struggle");
        twilightStruggle.setMinPlayers(2);
        twilightStruggle.setMaxPlayers(2);
        twilightStruggle.setMinAge(13);
        twilightStruggle.setPublisher(gmtGames);
        gameSet.add(twilightStruggle);

        Game dominantSpecies = new Game();
        dominantSpecies.setTitle("Dominant Species");
        dominantSpecies.setMinPlayers(2);
        dominantSpecies.setMaxPlayers(6);
        dominantSpecies.setMinAge(14);
        dominantSpecies.setPublisher(gmtGames);
        gameSet.add(dominantSpecies);

        Game commandsColors = new Game();
        commandsColors.setTitle("Commands & Colors: Ancients");
        commandsColors.setMinPlayers(2);
        commandsColors.setMaxPlayers(2);
        commandsColors.setMinAge(12);
        commandsColors.setPublisher(gmtGames);
        gameSet.add(commandsColors);

        Game combatCommander = new Game();
        combatCommander.setTitle("Combat Commander: Europe");
        combatCommander.setMinPlayers(2);
        combatCommander.setMaxPlayers(2);
        combatCommander.setMinAge(12);
        combatCommander.setPublisher(gmtGames);
        gameSet.add(combatCommander);

        Game pathsOfGlory = new Game();
        pathsOfGlory.setTitle("Paths of Glory");
        pathsOfGlory.setMinPlayers(2);
        pathsOfGlory.setMaxPlayers(2);
        pathsOfGlory.setMinAge(14);
        pathsOfGlory.setPublisher(gmtGames);
        gameSet.add(pathsOfGlory);


        Publisher eggertspiele = publisherRepository.findByName("eggertspiele");

        Game greatWesternTrail = new Game();
        greatWesternTrail.setTitle("Great Western Trail");
        greatWesternTrail.setMinPlayers(1);
        greatWesternTrail.setMaxPlayers(4);
        greatWesternTrail.setMinAge(12);
        greatWesternTrail.setPublisher(eggertspiele);
        gameSet.add(greatWesternTrail);

        Game mombasa = new Game();
        mombasa.setTitle("Mombasa");
        mombasa.setMinPlayers(2);
        mombasa.setMaxPlayers(4);
        mombasa.setMinAge(12);
        mombasa.setPublisher(eggertspiele);
        gameSet.add(mombasa);

        Game village = new Game();
        village.setTitle("Village");
        village.setMinPlayers(2);
        village.setMaxPlayers(4);
        village.setMinAge(12);
        village.setPublisher(eggertspiele);
        gameSet.add(village);

        Game coimbra = new Game();
        coimbra.setTitle("Coimbra");
        coimbra.setMinPlayers(2);
        coimbra.setMaxPlayers(4);
        coimbra.setMinAge(14);
        coimbra.setPublisher(eggertspiele);
        gameSet.add(coimbra);

        Game imperial = new Game();
        imperial.setTitle("Imperial");
        imperial.setMinPlayers(2);
        imperial.setMaxPlayers(6);
        imperial.setMinAge(13);
        imperial.setPublisher(eggertspiele);
        gameSet.add(imperial);


        Publisher greaterThanGames = publisherRepository.findByName("Greater Than Games");

        Game spiritIsland = new Game();
        spiritIsland.setTitle("Spirit Island");
        spiritIsland.setMinPlayers(1);
        spiritIsland.setMaxPlayers(4);
        spiritIsland.setMinAge(13);
        spiritIsland.setPublisher(greaterThanGames);
        gameSet.add(spiritIsland);

        Game sentinels = new Game();
        sentinels.setTitle("Sentinels of the Multiverse");
        sentinels.setMinPlayers(2);
        sentinels.setMaxPlayers(4);
        sentinels.setMinAge(13);
        sentinels.setPublisher(greaterThanGames);
        gameSet.add(sentinels);

        Game tak = new Game();
        tak.setTitle("Tak");
        tak.setMinPlayers(2);
        tak.setMaxPlayers(2);
        tak.setMinAge(12);
        tak.setPublisher(greaterThanGames);
        gameSet.add(tak);

        Game fateElderGods = new Game();
        fateElderGods.setTitle("Fate of the Elder Gods");
        fateElderGods.setMinPlayers(1);
        fateElderGods.setMaxPlayers(4);
        fateElderGods.setMinAge(13);
        fateElderGods.setPublisher(greaterThanGames);
        gameSet.add(fateElderGods);

        Game medium = new Game();
        medium.setTitle("Medium");
        medium.setMinPlayers(2);
        medium.setMaxPlayers(8);
        medium.setMinAge(14);
        medium.setPublisher(greaterThanGames);
        gameSet.add(medium);


        Publisher aresGames = publisherRepository.findByName("Ares Games");

        Game warOfTheRing2 = new Game();
        warOfTheRing2.setTitle("War of the Ring: Second Edition");
        warOfTheRing2.setMinPlayers(2);
        warOfTheRing2.setMaxPlayers(4);
        warOfTheRing2.setMinAge(13);
        warOfTheRing2.setPublisher(aresGames);
        gameSet.add(warOfTheRing2);

        Game warOfTheRing = new Game();
        warOfTheRing.setTitle("War of the Ring");
        warOfTheRing.setMinPlayers(2);
        warOfTheRing.setMaxPlayers(4);
        warOfTheRing.setMinAge(12);
        warOfTheRing.setPublisher(aresGames);
        gameSet.add(warOfTheRing);

        Game thisWarOfMine = new Game();
        thisWarOfMine.setTitle("This War of Mine: The Board Game");
        thisWarOfMine.setMinPlayers(1);
        thisWarOfMine.setMaxPlayers(6);
        thisWarOfMine.setMinAge(18);
        thisWarOfMine.setPublisher(aresGames);
        gameSet.add(thisWarOfMine);

        Game swordSorcery = new Game();
        swordSorcery.setTitle("Sword & Sorcery");
        swordSorcery.setMinPlayers(1);
        swordSorcery.setMaxPlayers(5);
        swordSorcery.setMinAge(12);
        swordSorcery.setPublisher(aresGames);
        gameSet.add(swordSorcery);

        Game battleOfFive = new Game();
        battleOfFive.setTitle("The Battle of Five Armies");
        battleOfFive.setMinPlayers(2);
        battleOfFive.setMaxPlayers(2);
        battleOfFive.setMinAge(13);
        battleOfFive.setPublisher(aresGames);
        gameSet.add(battleOfFive);


        Publisher stonemaierGames = publisherRepository.findByName("Stonemaier Games");

        Game scythe = new Game();
        scythe.setTitle("Scythe");
        scythe.setMinPlayers(1);
        scythe.setMaxPlayers(5);
        scythe.setMinAge(14);
        scythe.setPublisher(stonemaierGames);
        gameSet.add(scythe);

        Game wingspan = new Game();
        wingspan.setTitle("Wingspan");
        wingspan.setMinPlayers(1);
        wingspan.setMaxPlayers(5);
        wingspan.setMinAge(10);
        wingspan.setPublisher(stonemaierGames);
        gameSet.add(wingspan);

        Game viticultureEssential = new Game();
        viticultureEssential.setTitle("Viticulture Essential Edition");
        viticultureEssential.setMinPlayers(1);
        viticultureEssential.setMaxPlayers(6);
        viticultureEssential.setMinAge(13);
        viticultureEssential.setPublisher(stonemaierGames);
        gameSet.add(viticultureEssential);

        Game viticulture = new Game();
        viticulture.setTitle("Viticulture");
        viticulture.setMinPlayers(2);
        viticulture.setMaxPlayers(6);
        viticulture.setMinAge(13);
        viticulture.setPublisher(stonemaierGames);
        gameSet.add(viticulture);

        Game tapestry = new Game();
        tapestry.setTitle("Tapestry");
        tapestry.setMinPlayers(1);
        tapestry.setMaxPlayers(5);
        tapestry.setMinAge(12);
        tapestry.setPublisher(stonemaierGames);
        gameSet.add(tapestry);


        Publisher alea = publisherRepository.findByName("alea");

        Game burgundy = new Game();
        burgundy.setTitle("The Castles of Burgundy");
        burgundy.setMinPlayers(2);
        burgundy.setMaxPlayers(4);
        burgundy.setMinAge(12);
        burgundy.setPublisher(alea);
        gameSet.add(burgundy);

        Game puertoRico = new Game();
        puertoRico.setTitle("Puerto Rico");
        puertoRico.setMinPlayers(3);
        puertoRico.setMaxPlayers(5);
        puertoRico.setMinAge(12);
        puertoRico.setPublisher(alea);
        gameSet.add(puertoRico);

        Game ra = new Game();
        ra.setTitle("Ra");
        ra.setMinPlayers(2);
        ra.setMaxPlayers(5);
        ra.setMinAge(12);
        ra.setPublisher(alea);
        gameSet.add(ra);

        Game thePrincesOfFlorence = new Game();
        thePrincesOfFlorence.setTitle("The Princes of Florence");
        thePrincesOfFlorence.setMinPlayers(2);
        thePrincesOfFlorence.setMaxPlayers(5);
        thePrincesOfFlorence.setMinAge(12);
        thePrincesOfFlorence.setPublisher(alea);
        gameSet.add(thePrincesOfFlorence);

        Game boraBora = new Game();
        boraBora.setTitle("Bora Bora");
        boraBora.setMinPlayers(2);
        boraBora.setMaxPlayers(4);
        boraBora.setMinAge(12);
        boraBora.setPublisher(alea);
        gameSet.add(boraBora);


        Publisher reposProduction = publisherRepository.findByName("Repos Production");

        Game wondersDuel = new Game();
        wondersDuel.setTitle("7 Wonders Duel");
        wondersDuel.setMinPlayers(2);
        wondersDuel.setMaxPlayers(2);
        wondersDuel.setMinAge(10);
        wondersDuel.setPublisher(reposProduction);
        gameSet.add(wondersDuel);

        Game wonders = new Game();
        wonders.setTitle("7 Wonders");
        wonders.setMinPlayers(2);
        wonders.setMaxPlayers(7);
        wonders.setMinAge(10);
        wonders.setPublisher(reposProduction);
        gameSet.add(wonders);

        Game justOne = new Game();
        justOne.setTitle("Just One");
        justOne.setMinPlayers(3);
        justOne.setMaxPlayers(7);
        justOne.setMinAge(8);
        justOne.setPublisher(reposProduction);
        gameSet.add(justOne);

        Game ghostStories = new Game();
        ghostStories.setTitle("Ghost Stories");
        ghostStories.setMinPlayers(1);
        ghostStories.setMaxPlayers(4);
        ghostStories.setMinAge(12);
        ghostStories.setPublisher(reposProduction);
        gameSet.add(ghostStories);

        Game timesUp = new Game();
        timesUp.setTitle("Time's Up!");
        timesUp.setMinPlayers(4);
        timesUp.setMaxPlayers(18);
        timesUp.setMinAge(12);
        timesUp.setPublisher(reposProduction);
        gameSet.add(timesUp);


        Publisher pdVerlag = publisherRepository.findByName("PD-Verlag");

        Game concordia = new Game();
        concordia.setTitle("Concordia");
        concordia.setMinPlayers(2);
        concordia.setMaxPlayers(5);
        concordia.setMinAge(13);
        concordia.setPublisher(pdVerlag);
        gameSet.add(concordia);

        Game granja = new Game();
        granja.setTitle("La Granja");
        granja.setMinPlayers(1);
        granja.setMaxPlayers(4);
        granja.setMinAge(12);
        granja.setPublisher(pdVerlag);
        gameSet.add(granja);

        Game concordiaVenus = new Game();
        concordiaVenus.setTitle("Concordia Venus");
        concordiaVenus.setMinPlayers(2);
        concordiaVenus.setMaxPlayers(6);
        concordiaVenus.setMinAge(12);
        concordiaVenus.setPublisher(pdVerlag);
        gameSet.add(concordiaVenus);

        Game imperial2030 = new Game();
        imperial2030.setTitle("Imperial 2030");
        imperial2030.setMinPlayers(2);
        imperial2030.setMaxPlayers(6);
        imperial2030.setMinAge(12);
        imperial2030.setPublisher(pdVerlag);
        gameSet.add(imperial2030);

        Game navegador = new Game();
        navegador.setTitle("Navegador");
        navegador.setMinPlayers(2);
        navegador.setMaxPlayers(5);
        navegador.setMinAge(12);
        navegador.setPublisher(pdVerlag);
        gameSet.add(navegador);


        gameRepository.saveAll(gameSet);

        System.out.println("Games loaded = " + gameRepository.count());
    }

    private void loadPublishers() {
        Set<Publisher> publisherSet = new HashSet<>();

        // https://boardgamegeek.com/boardgamepublisher/1027/days-wonder/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/538/z-man-games-inc/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/27425/cephalofair-games/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/21765/roxley/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/18575/fryxgames/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/17/fantasy-flight-games/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/22380/feuerland-spiele/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/7345/czech-games-edition/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/52/gmt-games/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/1015/eggertspiele/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/17543/greater-games/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/17917/ares-games/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/23202/stonemaier-games/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/9/alea/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/4384/repos-production/linkeditems/boardgamepublisher?pageid=1&sort=rank
        // https://boardgamegeek.com/boardgamepublisher/8401/pd-verlag/linkeditems/boardgamepublisher?pageid=1&sort=rank
        Publisher daysOfWonder = new Publisher();
        daysOfWonder.setName("Days of Wonder");
        publisherSet.add(daysOfWonder);

        Publisher zMan = new Publisher();
        zMan.setName("Z-Man Games");
        publisherSet.add(zMan);

        Publisher cephalofairGames = new Publisher();
        cephalofairGames.setName("Cephalofair Games");
        publisherSet.add(cephalofairGames);

        Publisher roxley = new Publisher();
        roxley.setName("Roxley");
        publisherSet.add(roxley);

        Publisher fryxGames = new Publisher();
        fryxGames.setName("FryxGames");
        publisherSet.add(fryxGames);

        Publisher fantasyFlightGames = new Publisher();
        fantasyFlightGames.setName("Fantasy Flight Games");
        publisherSet.add(fantasyFlightGames);

        Publisher czechGamesEdition = new Publisher();
        czechGamesEdition.setName("Czech Games Edition");
        publisherSet.add(czechGamesEdition);

        Publisher gmtGames = new Publisher();
        gmtGames.setName("GMT Games");
        publisherSet.add(gmtGames);

        Publisher eggertspiele = new Publisher();
        eggertspiele.setName("eggertspiele");
        publisherSet.add(eggertspiele);

        Publisher greaterThanGames = new Publisher();
        greaterThanGames.setName("Greater Than Games");
        publisherSet.add(greaterThanGames);

        Publisher aresGames = new Publisher();
        aresGames.setName("Ares Games");
        publisherSet.add(aresGames);

        Publisher stonemaierGames = new Publisher();
        stonemaierGames.setName("Stonemaier Games");
        publisherSet.add(stonemaierGames);

        Publisher alea = new Publisher();
        alea.setName("alea");
        publisherSet.add(alea);

        Publisher reposProduction = new Publisher();
        reposProduction.setName("Repos Production");
        publisherSet.add(reposProduction);

        Publisher pdVerlag = new Publisher();
        pdVerlag.setName("PD-Verlag");
        publisherSet.add(pdVerlag);

        publisherRepository.saveAll(publisherSet);

        System.out.println("Publishers loaded = " + publisherRepository.count());
    }
}
