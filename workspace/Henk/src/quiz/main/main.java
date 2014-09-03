/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import quiz.businesslogic.QuizManager;
import quiz.datastorage.QuizVraagDAO;
import quiz.presentation.QuizGUI;

/**
 *
 * @author Gregor
 */
public class main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception ex)
        {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        QuizVraagDAO quizVraagDAO = new QuizVraagDAO();
        QuizManager quizManager = new QuizManager(quizVraagDAO);
        QuizGUI QuizGui = new QuizGUI(quizManager);
    }

}
