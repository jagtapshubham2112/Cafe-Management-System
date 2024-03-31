/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author jagta
 */
public class OpenPdf {
    public static void OpenById(String id){
    try{
        if((new File("E:\\Project\\"+id+".pdf")).exists()){
            Process p = Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FileProtocolHandler E:\\Project\\"+id+".pdf");
    }
        else
            JOptionPane.showMessageDialog(null, "File Does Not Exist");
    }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
