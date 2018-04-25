// Matric Number    : 240842
// Name             : Nur Diyana binti Zaidi
// Course           : STIW3054 RealTime Programming
// Task             : Asignment 1
// Submission Date  : 18/03/2018
package com.mycompany.rtasignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Thread.sleep;

/**
 *
 * @author Diyana
 */
public class gitHub {

    public void openGitbash() throws IOException {
        String[] command = {"C:/Program Files/Git/git-bash.exe",
            "/c", "cd && cd STIW3054_Asg1.wiki && git add * && git commit -m \"Test\" && git push"};
        Runtime.getRuntime().exec(command);
    }

    public void runTerminal() throws IOException {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "cd && cd \"C:\\Users\\User\\240842-STIW3054-A172-A1.wiki\" && git add * && git commit -m \"Test\" && git pull && git push");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            System.out.println("\nCMD result : \n");
            while (true) {
                line = r.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
            sleep(5000);
        } catch (Exception e) {
            System.out.println("Terminal cannot run");
        }
    }
}
