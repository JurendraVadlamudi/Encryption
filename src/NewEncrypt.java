import java.util.HashMap;

public class NewEncrypt extends Encrypt {

    private static HashMap<Character,Integer> asciitonum = new HashMap<Character,Integer>();
    private static HashMap<Integer, Character> ascii = new HashMap<Integer, Character>();


    public NewEncrypt(){
        asciitonum.put('ㄱ', 32 );
        asciitonum.put('ㄲ', 33 );
        asciitonum.put('ㄴ', 34 );
        asciitonum.put('ㄷ', 35 );
        asciitonum.put('ㄸ', 36 );
        asciitonum.put('ㄹ', 37 );
        asciitonum.put('ㅁ', 38 );
        asciitonum.put('ㅂ', 39 );
        asciitonum.put('ㅃ', 40 );
        asciitonum.put('ㅅ', 41 );
        asciitonum.put('ㅆ', 42 );
        asciitonum.put('ㅇ', 43 );
        asciitonum.put('ㅈ', 44 );
        asciitonum.put('ㅉ', 45 );
        asciitonum.put('ㅊ', 46 );
        asciitonum.put('ㅋ', 47 );
        asciitonum.put('ᚁ', 48 );
        asciitonum.put('ᚂ', 49 );
        asciitonum.put('ᚃ', 50 );
        asciitonum.put('ᚄ', 51 );
        asciitonum.put('ᚅ', 52 );
        asciitonum.put('ᚆ', 53 );
        asciitonum.put('ᚇ', 54 );
        asciitonum.put('ᚈ', 55 );
        asciitonum.put('ᚉ', 56 );
        asciitonum.put('ᚊ', 57 );
        asciitonum.put('ㅌ', 58 );
        asciitonum.put('ㅍ', 59 );
        asciitonum.put('ㅎ', 60 );
        asciitonum.put('ㅏ', 61 );
        asciitonum.put('ㅐ', 62 );
        asciitonum.put('ㅑ', 63 );
        asciitonum.put('ㅒ', 64 );
        asciitonum.put('α', 65 );
        asciitonum.put('β', 66 );
        asciitonum.put('γ', 67 );
        asciitonum.put('δ', 68 );
        asciitonum.put('ε', 69 );
        asciitonum.put('ζ', 70 );
        asciitonum.put('η', 71 );
        asciitonum.put('θ', 72 );
        asciitonum.put('ι', 73 );
        asciitonum.put('κ', 74 );
        asciitonum.put('λ', 75 );
        asciitonum.put('μ', 76 );
        asciitonum.put('ν', 77 );
        asciitonum.put('ξ', 78 );
        asciitonum.put('ο', 79 );
        asciitonum.put('π', 80 );
        asciitonum.put('ρ', 81 );
        asciitonum.put('σ', 82 );
        asciitonum.put('ς', 83 );
        asciitonum.put('τ', 84 );
        asciitonum.put('υ', 85 );
        asciitonum.put('φ', 86 );
        asciitonum.put('χ', 87 );
        asciitonum.put('ψ', 88 );
        asciitonum.put('Ω', 89 );
        asciitonum.put('ω', 90 );
        asciitonum.put('ㅓ', 91 );
        asciitonum.put('ㅔ', 92 );
        asciitonum.put('ㅕ', 93 );
        asciitonum.put('诶', 94 );
        asciitonum.put('ㅗ', 95 );
        asciitonum.put('ㅛ', 96 );
        asciitonum.put('ሀ', 97 );
        asciitonum.put('ለ', 98 );
        asciitonum.put('ሐ', 99 );
        asciitonum.put( 'መ', 100);
        asciitonum.put( 'ሠ', 101);
        asciitonum.put( 'ረ', 102);
        asciitonum.put( 'ሰ', 103);
        asciitonum.put( 'ሸ', 104);
        asciitonum.put( 'ቀ', 105);
        asciitonum.put( 'በ', 106);
        asciitonum.put( 'ተ', 107);
        asciitonum.put( 'ቸ', 108);
        asciitonum.put( 'ኀ', 109);
        asciitonum.put( 'ነ', 110);
        asciitonum.put( 'ኘ', 111);
        asciitonum.put( 'አ', 112);
        asciitonum.put( 'ከ', 113);
        asciitonum.put( 'ኸ', 114);
        asciitonum.put( 'ወ', 115);
        asciitonum.put( 'ዐ', 116);
        asciitonum.put( 'ዘ', 117);
        asciitonum.put( 'ዠ', 118);
        asciitonum.put( 'የ', 119);
        asciitonum.put( 'ደ', 120);
        asciitonum.put( 'ጀ', 121);
        asciitonum.put( 'ገ', 122);
        asciitonum.put( 'ጠ', 123);
        asciitonum.put( 'ጨ', 124);
        asciitonum.put( 'ጰ', 125);
        asciitonum.put( 'ጸ', 126);
        asciitonum.put( 'ፈ', 127);

        ascii.put(32, 'ㄱ');
        ascii.put(33, 'ㄲ');
        ascii.put(34, 'ㄴ');
        ascii.put(35, 'ㄷ');
        ascii.put(36, 'ㄸ');
        ascii.put(37, 'ㄹ');
        ascii.put(38, 'ㅁ');
        ascii.put(39, 'ㅂ');
        ascii.put(40, 'ㅃ');
        ascii.put(41, 'ㅅ');
        ascii.put(42, 'ㅆ');
        ascii.put(43, 'ㅇ');
        ascii.put(44, 'ㅈ');
        ascii.put(45, 'ㅉ');
        ascii.put(46, 'ㅊ');
        ascii.put(47, 'ㅋ');
        ascii.put(48, 'ᚁ');
        ascii.put(49, 'ᚂ');
        ascii.put(50, 'ᚃ');
        ascii.put(51, 'ᚄ');
        ascii.put(52, 'ᚅ');
        ascii.put(53, 'ᚆ');
        ascii.put(54, 'ᚇ');
        ascii.put(55, 'ᚈ');
        ascii.put(56, 'ᚉ');
        ascii.put(57, 'ᚊ');
        ascii.put(58, 'ㅌ');
        ascii.put(59, 'ㅍ');
        ascii.put(60, 'ㅎ');
        ascii.put(61, 'ㅏ');
        ascii.put(62, 'ㅐ');
        ascii.put(63, 'ㅑ');
        ascii.put(64, 'ㅒ');
        ascii.put(65, 'α');
        ascii.put(66, 'β');
        ascii.put(67, 'γ');
        ascii.put(68, 'δ');
        ascii.put(69, 'ε');
        ascii.put(70, 'ζ');
        ascii.put(71, 'η');
        ascii.put(72, 'θ');
        ascii.put(73, 'ι');
        ascii.put(74, 'κ');
        ascii.put(75, 'λ');
        ascii.put(76, 'μ');
        ascii.put(77, 'ν');
        ascii.put(78, 'ξ');
        ascii.put(79, 'ο');
        ascii.put(80, 'π');
        ascii.put(81, 'ρ');
        ascii.put(82, 'σ');
        ascii.put(83, 'ς');
        ascii.put(84, 'τ');
        ascii.put(85, 'υ');
        ascii.put(86, 'φ');
        ascii.put(87, 'χ');
        ascii.put(88, 'ψ');
        ascii.put(89, 'Ω');
        ascii.put(90, 'ω');
        ascii.put(91, 'ㅓ');
        ascii.put(92, 'ㅔ');
        ascii.put(93, 'ㅕ');
        ascii.put(94, '诶');
        ascii.put(95, 'ㅗ');
        ascii.put(96, 'ㅛ');
        ascii.put(97, 'ሀ');
        ascii.put(98, 'ለ');
        ascii.put(99, 'ሐ');
        ascii.put(100, 'መ');
        ascii.put(101, 'ሠ');
        ascii.put(102, 'ረ');
        ascii.put(103, 'ሰ');
        ascii.put(104, 'ሸ');
        ascii.put(105, 'ቀ');
        ascii.put(106, 'በ');
        ascii.put(107, 'ተ');
        ascii.put(108, 'ቸ');
        ascii.put(109, 'ኀ');
        ascii.put(110, 'ነ');
        ascii.put(111, 'ኘ');
        ascii.put(112, 'አ');
        ascii.put(113, 'ከ');
        ascii.put(114, 'ኸ');
        ascii.put(115, 'ወ');
        ascii.put(116, 'ዐ');
        ascii.put(117, 'ዘ');
        ascii.put(118, 'ዠ');
        ascii.put(119, 'የ');
        ascii.put(120, 'ደ');
        ascii.put(121, 'ጀ');
        ascii.put(122, 'ገ');
        ascii.put(123, 'ጠ');
        ascii.put(124, 'ጨ');
        ascii.put(125, 'ጰ');
        ascii.put(126, 'ጸ');
        ascii.put(127, 'ፈ');
    }


    public String encrypt(String msg, String key){
        int n=msg.length();
        String cp="";
        for(int i=n-1;i>=0;i--){
            int t=msg.charAt(i);
            cp=cp+""+ascii.get(t);
        }
        return cp;
    }
    public String decrypt(String cipher, String key){
        int n=cipher.length();
        String msg="";
        for(int i=n-1;i>=0;i--){
            char c=cipher.charAt(i);
            //System.out.println("cipher "+c);
            int t=asciitonum.get(c);
            char s=(char) t;
            msg=msg+""+s;
        }
        return msg;

    }
}



