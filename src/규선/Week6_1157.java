package 규선;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Week6_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = 0;
        }
        for (int i = 0; i < str1.length(); i++) {
            switch (str1.charAt(i)) {
                case 'a':
                case 'A':
                    alphabet[0]++;
                    break;
                case 'b':
                case 'B':
                    alphabet[1]++;
                    break;
                case 'c':
                case 'C':
                    alphabet[2]++;
                    break;
                case 'd':
                case 'D':
                    alphabet[3]++;
                    break;
                case 'e':
                case 'E':
                    alphabet[4]++;
                    break;
                case 'f':
                case 'F':
                    alphabet[5]++;
                    break;
                case 'g':
                case 'G':
                    alphabet[6]++;
                    break;
                case 'h':
                case 'H':
                    alphabet[7]++;
                    break;
                case 'i':
                case 'I':
                    alphabet[8]++;
                    break;
                case 'j':
                case 'J':
                    alphabet[9]++;
                    break;
                case 'k':
                case 'K':
                    alphabet[10]++;
                    break;
                case 'l':
                case 'L':
                    alphabet[11]++;
                    break;
                case 'm':
                case 'M':
                    alphabet[12]++;
                    break;
                case 'n':
                case 'N':
                    alphabet[13]++;
                    break;
                case 'o':
                case 'O':
                    alphabet[14]++;
                    break;
                case 'p':
                case 'P':
                    alphabet[15]++;
                    break;
                case 'q':
                case 'Q':
                    alphabet[16]++;
                    break;
                case 'r':
                case 'R':
                    alphabet[17]++;
                    break;
                case 's':
                case 'S':
                    alphabet[18]++;
                    break;
                case 't':
                case 'T':
                    alphabet[19]++;
                    break;
                case 'u':
                case 'U':
                    alphabet[20]++;
                    break;
                case 'v':
                case 'V':
                    alphabet[21]++;
                    break;
                case 'w':
                case 'W':
                    alphabet[22]++;
                    break;
                case 'x':
                case 'X':
                    alphabet[23]++;
                    break;
                case 'y':
                case 'Y':
                    alphabet[24]++;
                    break;
                case 'z':
                case 'Z':
                    alphabet[25]++;
                    break;
            }
        }
        int maxValue = alphabet[0];
        int maxIndex = 0;
        int count = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] >= maxValue) {
                maxValue = alphabet[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (i == maxIndex)
                continue;
            if (alphabet[i] == maxValue)
                count++;
        }

        if (count == 0) {
            System.out.printf("%c\n", maxIndex + 65);
        } else {
            System.out.println("?");
        }

    }

}
