package org.example.frames.signInFrame;

import lombok.Getter;

public class PasswordChecker {
    private String firstPassword;
    private String secondPassword;

    @Getter
    public final int passwordLength = 4;

    public PasswordChecker(String firstPassword, String secondPassword) {
        this.firstPassword = firstPassword;
        this.secondPassword = secondPassword;
    }
    public boolean isCorrect(){

        if(isDifferent() && isEnoughLength()){

            return true;
        } else if (!isDifferent()){

            //TODO: Hasła nie są takie same
        } else if (!isEnoughLength()){

            //TODO: Hasło jest krótsze niż
            System.out.println(passwordLength);
        }

        return false;
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
