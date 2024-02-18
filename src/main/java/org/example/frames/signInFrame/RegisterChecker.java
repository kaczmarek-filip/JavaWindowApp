package org.example.frames.signInFrame;

import lombok.Getter;
import org.example.database.DatabaseConnection;

public class RegisterChecker {
    private String login;
    private String firstPassword;
    private String secondPassword;

    @Getter
    public final int passwordLength = 4;

    public RegisterChecker(String login, String firstPassword, String secondPassword) {
        this.login = login;
        this.firstPassword = firstPassword;
        this.secondPassword = secondPassword;
    }

    public String isCorrect(){

        if (!isDifferent()){
            return "Hasła są różne od siebie";
        } else if (!isEnoughLength()){
            return "Hasło jest krótsze niż " + passwordLength + " znaki";
        } else if (isLoginExists()) {
            return "Podany login już istnieje";
        } else {
            return "correct";
        }
    }

    private boolean isLoginExists(){

        DatabaseConnection databaseConnection = new DatabaseConnection();
        return databaseConnection.isLoginExists(login);
    }

    private boolean isDifferent(){

        if(firstPassword.equals(secondPassword)){
            return true;
        }

        return false;
    }
    private boolean isEnoughLength(){

        if(firstPassword.length() > passwordLength){
            return true;
        }

        return false;
    }
}
