package quiz.businesslogic;

import java.util.ArrayList;
import java.util.Random;
import quiz.datastorage.QuizVraagDAO;
import quiz.domein.QuizVraag;

/**
 *
 * @author Gregor
 */
public class QuizManager
{

    private QuizVraagDAO quizVraagDAO;
    private ArrayList<QuizVraag> quizVragen;
    private Random randomGenerator;
    private int geselecteerdeVraagNummer;

    public QuizManager(QuizVraagDAO quizVraagDAO)
    {
        quizVragen = new ArrayList<>();
        randomGenerator = new Random();
        quizVragen.add(new QuizVraag("Shakugan no Shana", "Shana"));
        quizVragen.add(new QuizVraag("Magical Girl Lyrical Nanoha", "Takamachi Nanoha"));
        quizVragen.add(new QuizVraag("Pokemon (eerste seizoen)", "Ash"));
    }

    public String getVraag()
    {
        geselecteerdeVraagNummer = randomGenerator.nextInt(quizVragen.size());
        return quizVragen.get(geselecteerdeVraagNummer).getShow();
    }

    public ArrayList<String> getAndwoorden()
    {
        ArrayList<String> andwoordlijst= new ArrayList<String>();
        for (QuizVraag quizvraag : quizVragen)
        {
            andwoordlijst.add (quizvraag.getNaam());
        }

        return andwoordlijst;
    }

    public String getCorrectAndwoord()
    {
        return quizVragen.get(geselecteerdeVraagNummer).getNaam();
    }

    public boolean checkAndwoord(String andwoord)
    {
        boolean resultaat;
        if (andwoord.equals(getCorrectAndwoord()))
        {
            resultaat = true;
        }
        else
        {
            resultaat = false;
        }
        return resultaat;
    }
}
