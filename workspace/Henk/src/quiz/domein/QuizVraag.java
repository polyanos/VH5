package quiz.domein;

/**
 *
 * @author Gregor
 */
public class QuizVraag
{

    String shownaam, hoofdpersoon;

    public QuizVraag(String shownaam, String hoofdpersoon)
    {
        this.shownaam = shownaam;
        this.hoofdpersoon = hoofdpersoon;
    }

    public String getShow()
    {
        return shownaam;
    }

    public String getNaam()
    {
        return hoofdpersoon;
    }
}
