package top.secret.secret.Sevices;

import org.springframework.stereotype.Service;

@Service
public class Converter {

    public String converter(String text){
        String[] textList = text.split(" ");
        for(String word : textList){
            if(word.contains("а") || word.contains("е") || word.contains("у") || word.contains("о") || word.contains("р") || word.contains("х") || word.contains("с") || word.contains("А") || word.contains("Е") || word.contains("Т") || word.contains("О") || word.contains("Р") || word.contains("Н") || word.contains("К") || word.contains("Х") || word.contains("С") || word.contains("В") || word.contains("М")){
                char[] chars = word.toCharArray();
                int index = 0;
                for(char i : chars){
                    if(i == 'а'){
                        chars[index] = 'a';
                    }

                    else if(i == 'е'){
                        chars[index] = 'e';
                    }
                    else if(i == 'у'){
                        chars[index] = 'y';
                    }
                    else if(i == 'о'){
                        chars[index] = 'o';
                    }
                    else if(i == 'р'){
                        chars[index] = 'p';
                    }
                    else if(i == 'х'){
                        chars[index] = 'x';
                    }
                    else if(i == 'с'){
                        chars[index] = 'c';
                    }
                    else if(i == 'А'){
                        chars[index] = 'A';
                    }
                    else if(i == 'Е'){
                        chars[index] = 'E';
                    }
                    else if(i == 'Т'){
                        chars[index] = 'T';
                    }
                    else if(i == 'О'){
                        chars[index] = 'O';
                    }
                    else if(i == 'Р'){
                        chars[index] = 'P';
                    }
                    else if(i == 'Н'){
                        chars[index] = 'H';
                    }
                    else if(i == 'К'){
                        chars[index] = 'K';
                    }
                    else if(i == 'Х'){
                        chars[index] = 'X';
                    }
                    else if(i == 'С'){
                        chars[index] = 'C';
                    }
                    else if(i == 'В'){
                        chars[index] = 'B';
                    }
                    else if(i == 'М'){
                        chars[index] = 'M';
                    }


                    index++;

                }
                word = "";
                for (char i : chars){
                    word+= i;
                }
            }
        }
        text = "";
        for (String word : textList){
            text += word;
        }

        return text;
    }

}
