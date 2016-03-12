package bassintag.buildmything.common;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

public class LanguageUtil {
	
	private final BuildMyThing instance;
	
	
	public LanguageUtil(BuildMyThing plugin){
		instance = plugin;
	}
	
	public String get(String path){
		FileConfiguration config = this.instance.getConfig();
		String truePath = "language." + path;
		if(config.contains(truePath.trim())){
			return config.getString(truePath.trim());
		}	else {
			return "null";
		}
	}
	
	public void setLanguage(String language){
		FileConfiguration config = this.instance.getConfig();
		if(language.toLowerCase().startsWith("en")){
			config.set("language.p1-set", "Punkt 1 gesetzt an deiner aktuellen Position");
			config.set("language.p2-set", "Punkt 2 gesetzt an deiner aktuellen Position");
			config.set("language.spawn-set", "Raum Spawn gesetzt an deiner aktuellen Position");
			config.set("language.room-created", "Raum erstellt!");
			config.set("language.room-cannot-create", "Vergewissere dich ob du beide Punke für den Raum und den Spawn Punkt gesetzt hast!");
			config.set("language.room-precize", "Du musst einen preziesen Raum Name angeben");
			config.set("language.room-doesnt-exist", "Dieser Raum existiert nicht!");
			config.set("language.player-not-ingame", "Du bist in keinem Spiel Raum");
			config.set("language.player-already-ingame", "Du bist bereits in einem Spiel Raum");
			config.set("language.player-not-online", "Dieser Spieler ist nicht online");
			config.set("language.player-not-playing", "Dieser Spieler spielt gerade kein Build My Thing");
			config.set("language.wrong-command", "Unbekanntes Komando, nutze\"" + ChatColor.YELLOW + "/bmt help" + ChatColor.RESET + "\"fuer eine Komando Liste");
			config.set("language.no-command", "Kein Sub-Komando, nutze\"" + ChatColor.YELLOW + "/bmt help" + ChatColor.RESET + "\"fuer eine Komando Liste");
			config.set("language.room-list", "Raum Liste:");
			config.set("language.no-command-while-ingame", "Komando ist im Spiel deaktiviert");
			config.set("language.no-chat-while-builder", "Du kannst nicht mit dem Builder Chatten");
			config.set("language.word-already-found", "Du hast das richtige Wort gefunden");
			config.set("language.player-find-word-3points", ChatColor.BOLD + "$player" + ChatColor.RESET + ChatColor.GREEN + " hat das richtige Wort gefunden! " + ChatColor.RESET + "[+3]");
			config.set("language.player-find-word-1point", ChatColor.BOLD + "$player" + ChatColor.RESET + ChatColor.GREEN + " hat das richtige Wort gefunden! " + ChatColor.RESET + "[+1]");
			config.set("language.builder-get-points", ChatColor.BOLD + "$player" + ChatColor.RESET + ChatColor.GREEN + " bekommt 2 Punkte!");
			config.set("language.everyone-found", "Alle haben das richtige Wort gefunden, sehr gut!");
			config.set("language.next-round", "Die naechste Runde startet in 5 Sekunden");
			config.set("language.builder", "$player is building this time!");
			config.set("language.time", "Du hast" + ChatColor.BOLD +  " 90 Sekunden" + ChatColor.RESET + " um das richtige Wort zu finden!");
			config.set("language.word", ChatColor.RED + "Das richtige Wort lautet: " + ChatColor.BOLD + "$word");
			config.set("language.ready", "$player ist bereit!");
			config.set("language.not-ready", "$player ist nicht laenger bereit!");
			config.set("language.everyone-ready", "Alle sind bereit, das Spiel wird gestartet!");
			config.set("language.game-over", ChatColor.BOLD + "Spiel ist zuende");
			config.set("language.winner", ChatColor.GREEN + "Gewinner: " + ChatColor.BOLD + "$player" + ChatColor.RESET + " [$score]");
			config.set("language.60sec", "60 bis zum Spiel!");
			config.set("language.30sec", "30 bis zum Spiel!");
			config.set("language.10sec", "10 bis zum Spiel!");
			config.set("language.time-out", ChatColor.RED + "Zeit abgelaufen! Das naechste Spiel startet in 5 Sekunden!");
			config.set("language.word-reveal", ChatColor.GREEN + "Das Wort lautet: " + ChatColor.BOLD + "$word");
			config.set("language.score", ChatColor.GREEN + "Score:");
			config.set("language.score-player", ChatColor.GREEN +"$player" + ChatColor.WHITE + " [$score]");
			config.set("language.invite", "$player moechte mit dir Build My Thing, nutze \"" + ChatColor.YELLOW + "/bmt playwith $player" + ChatColor.RESET + "\" um mit dem Spieler zu spielen");
			config.set("language.join", "$player betritt das Spiel ($currentplayers / $maxplayers)");
			config.set("language.room-starting", "Raum ist voll, Spiel startet in 5 Sekunden");
			config.set("language.room-started", "Raum ist bereits gestartet!");
			config.set("language.room-full", "Raum ist voll!");
			config.set("language.player-left", "Du hast das Spiel verlassen!");
			config.set("language.room-player-left", "$player verlaesst das Spiel");
			config.set("language.room-deleted", "Raum geloescht!");
			config.set("language.already-reported", "Du hast diesen Spieler bereits gemeldet!");
			config.set("language.room-updated", "Raum aktualisiert!");
			config.set("language.builder-abondon", "Der Builder hat aufgegeben!");
			config.set("language.player-penalty", "$player strafe erhalten! " + ChatColor.RED + "[-$penalty]");
			config.set("language.reload", "Configuration neu geladen, alle laufende Spiele wurden gestopt!");
			config.set("language.broadcast-win", "$player hat ein Build My Thing Spiel gewonnen $room!");
		} else if(language.toLowerCase().startsWith("fr")){
			config.set("language.p1-set", "Le point 1 se trouve maintenant � votre position");
			config.set("language.p2-set", "Le point 2 se trouve maintenant � votre position");
			config.set("language.spawn-set", "Le point de spawn se trouve maintenant � votre position");
			config.set("language.room-created", "La salle a �t� cr�e!");
			config.set("language.room-cannot-create", "Assurez vous d'avoir choisi les point 1 et 2 ainsi qu'un point de spawn");
			config.set("language.room-precize", "Vous devez choisir une salle");
			config.set("language.room-doesnt-exist", "Cette salle n'existe pas");
			config.set("language.player-not-ingame", "Vous n'�tes pas dans une salle");
			config.set("language.player-already-ingame", "Vous �tes d�j� dans une salle");
			config.set("language.player-not-online", "Ce joueur n'est pas en ligne");
			config.set("language.player-not-playing", "Ce joueur ne joue pas � Build My Thing");
			config.set("language.wrong-command", "Sous-commande inconnue, tapez\"" + ChatColor.YELLOW + "/bmt help" + ChatColor.RESET + "\"pour avoir une liste des commandes");
			config.set("language.no-command", "Aucune sous-commande pr�cis�e, tapez\"" + ChatColor.YELLOW + "/bmt help" + ChatColor.RESET + "\"pour avoir une liste des commandes");
			config.set("language.room-list", "Liste des salles:");
			config.set("language.no-command-while-ingame", "Les commandes sont d�sactiv�es en jeu");
			config.set("language.no-chat-while-builder", "Vous ne pouvez pas parler en tant que constructeur");
			config.set("language.word-already-found", "Vous avez d�j� trouv� le mot");
			config.set("language.player-find-word-3points", ChatColor.BOLD + "$player" + ChatColor.RESET + ChatColor.GREEN + " a trouv� le mot! " + ChatColor.RESET + "[+3]");
			config.set("language.player-find-word-1point", ChatColor.BOLD + "$player" + ChatColor.RESET + ChatColor.GREEN + " a trouv� le mot! " + ChatColor.RESET + "[+1]");
			config.set("language.builder-get-points", ChatColor.BOLD + "$player" + ChatColor.RESET + ChatColor.GREEN + " gagne aussi 2 points!");
			config.set("language.everyone-found", "Tout le monde a trouv� le mot!");
			config.set("language.next-round", "le prochain round commence dans 5sec");
			config.set("language.builder", "$player construit cette fois!");
			config.set("language.time", "Vous avez" + ChatColor.BOLD +  " 90sec" + ChatColor.RESET + " pour deviner le mot!");
			config.set("language.word", ChatColor.RED + "Le mot � trouver est: " + ChatColor.BOLD + "$word");
			config.set("language.ready", "$player est pr�t!");
			config.set("language.not-ready", "$player n'est plus pr�t!");
			config.set("language.everyone-ready", "Tout le mond est pr�t, le jeu peut commencer");
			config.set("language.game-over", ChatColor.BOLD + "GAME OVER");
			config.set("language.winner", ChatColor.GREEN + "GAGNANT: " + ChatColor.BOLD + "$player" + ChatColor.RESET + " [$score]");
			config.set("language.60sec", "Il reste 60sec!");
			config.set("language.30sec", "Il reste 30sec!");
			config.set("language.10sec", "Il reste 10sec!");
			config.set("language.time-out", ChatColor.RED + "Temps �coul�, le prochain round d�butera dans 5sec!");
			config.set("language.word-reveal", ChatColor.GREEN + "Le mot �tait: " + ChatColor.BOLD + "$word");
			config.set("language.score", ChatColor.GREEN + "Score:");
			config.set("language.score-player", ChatColor.GREEN +"$player" + ChatColor.WHITE + " [$score]");
			config.set("language.invite", "$player voudrait jouer � Build My Thing, tapez \"" + ChatColor.YELLOW + "/bmt playwith $player" + ChatColor.RESET + "\" pour participer!");
			config.set("language.join", "$player a rejoint la partie ($currentplayers / $maxplayers)");
			config.set("language.room-starting", "La salle est pleine, la partie va commencer dans 5sec");
			config.set("language.room-started", "La partie a d�j� commenc�e!");
			config.set("language.room-full", "La salle est pleine!");
			config.set("language.player-left", "Vous avez quitt� la partie");
			config.set("language.room-player-left", "$player a quitt� la partie");
			config.set("language.room-deleted", "Salle supprim�e!");
			config.set("language.already-reported", "Vous avez d�j� signal� ce joueur!");
			config.set("language.room-updated", "Salle mise � jour!");
			config.set("language.builder-abondon", "Le constructeur abandonne!");
			config.set("language.reload", "Rechargement de la configuration, toutes les salles vont s'arr�ter!");
			config.set("language.broadcast-win", "$player vient de gagner une partie de Build My Thing dans $room!");
		}
	}

}
