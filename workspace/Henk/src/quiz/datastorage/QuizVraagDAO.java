package quiz.datastorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import quiz.domein.QuizVraag;

/**
 *
 * @author Gregor
 */
public class QuizVraagDAO
{

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public QuizVraagDAO()
    {
        try
        {
            //Connectie innitializeren.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "");
            //Statement object aanmaken.
            statement = connection.createStatement();
        }
        catch (SQLException ex)
        {
            System.out.println("Er kon geen connectie gemaakt worden met de database");
        }
    }

    public ArrayList<QuizVraag> getQuizVragen()
    {
        ArrayList<QuizVraag> quizVragen = new ArrayList<>();
        try
        {
            resultSet = statement.executeQuery("SELECT Spelnaam, Hoofdcaracter FROM Vragen");

            while (resultSet.next())
            {
                QuizVraag vraag = new QuizVraag("Shakugan no Shana", "Shana");
                quizVragen.add(vraag);
            }

            return quizVragen;

        }
        catch (SQLException ex)
        {
            Logger.getLogger(QuizVraagDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
}
