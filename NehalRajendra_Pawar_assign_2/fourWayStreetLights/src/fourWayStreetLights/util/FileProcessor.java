package fourWayStreetLights.util;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileProcessor
{
    FileReader F = null;
    BufferedReader BR = null;
    List<String> zoom = new ArrayList<>();
    public List<String> openFile(String InputFileName)
    {
        try
        {
            F = new FileReader(InputFileName);
            BR = new BufferedReader(F);
            String number = "";
            while (number != null)
            {
                number = readLine();
                if (number == null) break;
                zoom.add(number);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found at location: " + InputFileName);
            System.exit(1);
        }
        return zoom;
    }
    public String readLine()
    {
        String line = null;
        try
        {
            line = BR.readLine();
        }
        catch (Exception e)
        {
            System.out.println("Error while reading file");
            System.exit(1);
        }
        return line;
    }
}
