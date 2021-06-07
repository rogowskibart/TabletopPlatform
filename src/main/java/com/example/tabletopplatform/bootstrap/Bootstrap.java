package com.example.tabletopplatform.bootstrap;

import com.example.tabletopplatform.domain.Publisher;
import com.example.tabletopplatform.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Bootstrap implements CommandLineRunner {

    private PublisherRepository publisherRepository;

    public Bootstrap(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Set<Publisher> publisherSet = new HashSet<>();

        // https://boardgamegeek.com/boardgamepublisher/1027/days-wonder
        Publisher daysOfWonder = new Publisher();
        daysOfWonder.setName("Days of Wonder");
        publisherSet.add(daysOfWonder);

        // https://boardgamegeek.com/boardgamepublisher/538/z-man-games-inc
        Publisher zMan = new Publisher();
        zMan.setName("Z-Man Games");
        publisherSet.add(zMan);

        // https://boardgamegeek.com/boardgamepublisher/27425/cephalofair-games
        Publisher cephalofairGames = new Publisher();
        cephalofairGames.setName("Cephalofair Games");
        publisherSet.add(cephalofairGames);

        // https://boardgamegeek.com/boardgamepublisher/21765/roxley
        Publisher roxley = new Publisher();
        roxley.setName("Roxley");
        publisherSet.add(roxley);

        // https://boardgamegeek.com/boardgamepublisher/18575/fryxgames
        Publisher fryxGames = new Publisher();
        fryxGames.setName("FryxGames");
        publisherSet.add(fryxGames);

        // https://boardgamegeek.com/boardgamepublisher/17/fantasy-flight-games
        Publisher fantasyFlightGames = new Publisher();
        fantasyFlightGames.setName("Fantasy Flight Games");
        publisherSet.add(fantasyFlightGames);

        // https://boardgamegeek.com/boardgamepublisher/22380/feuerland-spiele
        Publisher feuerlandSpiele = new Publisher();
        feuerlandSpiele.setName("Feuerland Spiele");
        publisherSet.add(feuerlandSpiele);

        // https://boardgamegeek.com/boardgamepublisher/7345/czech-games-edition
        Publisher czechGamesEdition = new Publisher();
        czechGamesEdition.setName("Czech Games Edition");
        publisherSet.add(czechGamesEdition);

        // https://boardgamegeek.com/boardgamepublisher/52/gmt-games
        Publisher gmtGames = new Publisher();
        gmtGames.setName("GMT Games");
        publisherSet.add(gmtGames);

        // https://boardgamegeek.com/boardgamepublisher/1015/eggertspiele
        Publisher eggertspiele = new Publisher();
        eggertspiele.setName("eggertspiele");
        publisherSet.add(eggertspiele);

        // https://boardgamegeek.com/boardgamepublisher/17543/greater-games
        Publisher greaterThanGames = new Publisher();
        greaterThanGames.setName("Greater Than Games");
        publisherSet.add(greaterThanGames);

        // https://boardgamegeek.com/boardgamepublisher/17917/ares-games
        Publisher aresGames = new Publisher();
        aresGames.setName("Ares Games");
        publisherSet.add(aresGames);

        // https://boardgamegeek.com/boardgamepublisher/23202/stonemaier-games
        Publisher stonemaierGames = new Publisher();
        stonemaierGames.setName("Stonemaier Games");
        publisherSet.add(stonemaierGames);

        // https://boardgamegeek.com/boardgamepublisher/9/alea
        Publisher alea = new Publisher();
        alea.setName("alea");
        publisherSet.add(alea);

        // https://boardgamegeek.com/boardgamepublisher/4384/repos-production
        Publisher reposProduction = new Publisher();
        reposProduction.setName("Repos Production");
        publisherSet.add(reposProduction);

        // https://boardgamegeek.com/boardgamepublisher/8401/pd-verlag
        Publisher pdVerlag = new Publisher();
        pdVerlag.setName("PD-Verlag");
        publisherSet.add(pdVerlag);

        publisherRepository.saveAll(publisherSet);

        System.out.println("Data loaded = " + publisherRepository.count());
    }
}
