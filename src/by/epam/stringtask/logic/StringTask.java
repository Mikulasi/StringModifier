package by.epam.stringtask.logic;

public class StringTask {

    public static String translationChars(String text){
        char[] cyrillic = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ы','ъ','э','ю','я'};
        char[] engChars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z','_','.'};
        String[] russianSpellingToEnglish = {"a","b","v","g","d","e","jo","zh","z","i","i","k","l","m","n","o","p","r","s","t","u","f","h","ts","ch","sh","sch","i","'","e","ju","ja"};
        StringBuilder english = new StringBuilder();
        for (int textChar = 0; textChar < text.length(); textChar++) {
            for(int cyrillicChar = 0; cyrillicChar < cyrillic.length; cyrillicChar++ )
                try {
                    if (text.charAt(textChar) == cyrillic[cyrillicChar] ) {
                        english.append(russianSpellingToEnglish[cyrillicChar]);
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Uuuuuppps...ArrayIndexOutOfBoundsException: -> " + e);
                }

            for (char symbol : engChars)
                if (text.charAt(textChar) == symbol) {
                    english.append(symbol);
                }
        }
        return english.toString();
    }

    public static String lastDot (String text){
        int counter = 0;
        int countOfDel = 0;
        StringBuilder lastDotText = new StringBuilder(text);

        for( int i=0; i<text.length(); i++ ) {
            if( text.charAt(i) == '.' ) {
                counter++;
            }
        }
        for( int i=0; i<text.length(); i++ ) {
            if( text.charAt(i) == '.' ) {
                if(counter - countOfDel == 1){break;}
                lastDotText.setCharAt(i,'_');
                countOfDel++;
            }
        }

        return lastDotText.toString();
    }


    public static String controlLength(String text){
        StringBuilder resizeText = new StringBuilder(text);
        while (text.length() > 200 ){
            for( int i=0; i<text.length(); i++ ) {
                if( text.charAt(i) == '.' ) {
                    resizeText.deleteCharAt(i--);
                }
            }
        }
        return resizeText.toString();
    }

}
