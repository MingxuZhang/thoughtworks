import javax.net.ssl.ExtendedSSLSession;

public class BowlingGame {

    public int getBowlingScore(String bowlingCode) {
        int score = 0;
        int idx = 0;
        int tmpScore;
        for(int i=0; i<9; i++){
            tmpScore = 0;
            if(bowlingCode.charAt(idx)=='X'){
                tmpScore += 10;
                if(bowlingCode.charAt(idx+2)=='X'){
                    tmpScore += 10;
                    if(i<8){
                        if(bowlingCode.charAt(idx+4)=='X'){
                            tmpScore += 10; 
                        }
                        else{
                            if(bowlingCode.charAt(idx+4)!='-'){
                                tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+4));
                            }
                        }
                    }
                    else{
                        if(bowlingCode.charAt(idx+5)=='X'){
                            tmpScore += 10; 
                        }
                        else{
                            if(bowlingCode.charAt(idx+5)!='-'){
                                tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+5));
                            }
                        }
                    }
                }
                else if(bowlingCode.charAt(idx+3)=='/'){
                    tmpScore += 10;
                }
                else{
                    if(bowlingCode.charAt(idx+2)!='-'){
                        tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+2)); 
                    }
                    if(bowlingCode.charAt(idx+3)!='-'){
                        tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+3)); 
                    }
                }
                idx += 2;
            }
            else if(bowlingCode.charAt(idx+1)=='/'){
                tmpScore += 10;
                if(bowlingCode.charAt(idx+3)=='X'){
                    tmpScore += 10;
                }
                else{
                    if(bowlingCode.charAt(idx+3)!='-'){
                        tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+3)); 
                    }
                }
                idx += 3;
            }
            else{
                if(bowlingCode.charAt(idx)!='-'){
                    tmpScore += Character.getNumericValue(bowlingCode.charAt(idx)); 
                }
                if(bowlingCode.charAt(idx+1)!='-'){
                    tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+1)); 
                }
                idx += 3;
            }
            score += tmpScore;
        }

        tmpScore = 0;
        if(bowlingCode.charAt(idx)=='X'){
            tmpScore += 10;
            if(bowlingCode.charAt(idx+4)=='/'){
                tmpScore += 10;
            }
            else{
                if(bowlingCode.charAt(idx+3)=='X'){
                    tmpScore += 10;
                }
                else{
                    if(bowlingCode.charAt(idx+3)!='-'){
                        tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+3));
                    }
                }
                if(bowlingCode.charAt(idx+4)=='X'){
                    tmpScore += 10;
                }
                else{
                    if(bowlingCode.charAt(idx+4)!='-'){
                        tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+4));
                    }
                }
            }
        }
        else if(bowlingCode.charAt(idx+1)=='/'){
            tmpScore += 10;
            if(bowlingCode.charAt(idx+4)=='X'){
                tmpScore += 10;
            }
            else{
                if(bowlingCode.charAt(idx+4)!='-'){
                    tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+4)); 
                }
            }
        }
        else{
            if(bowlingCode.charAt(idx)!='-'){
                tmpScore += Character.getNumericValue(bowlingCode.charAt(idx)); 
            }
            if(bowlingCode.charAt(idx+1)!='-'){
                tmpScore += Character.getNumericValue(bowlingCode.charAt(idx+1)); 
            }
        }
        score += tmpScore;

        return score;
    }
}
