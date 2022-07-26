package Calculator;
package Calculator;
import java.awt.Cursor;
import java.awt.Font;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.*;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

Public class Graph extends JPanel
{
String input;
Color color;
public Graph()
{
set.background(color.white);
setPreferredSize(newDimension(400,400));
repaint();
public void paintComponent(Graphics page)
{
super.paintComponent(page);
page.setColor(color.black);
page.drawLine(200,400,200,0);
page.drawLine(0,200,400,200);
for(int i = 0; i <=400; i = i + 20){page.drawLine(190,i,210,i);page.drawLine(i,190,i,210);} 
page.setColor(color);
}
public void graphs(int x1, int x2, int y1, int y2, Color color1, String t2)
{
paintComponent(this.getGraphics());
color = color1;
for(int i = 0; i<=8000;i++)
{
double translation=(i/200.0)-20;
double a = number(Operation(t2,translation),translation)*(-20)+200;
this.getGraphics().drawLine(i/20,(int)a,i/20,(int)a);
}
}
public double number(String function,double variable)           
{
try{
double now=0;
char sine = 's';
char tangent ='t';                                
char cosi = 'c';
char varia = 'x';
char current = function.charAt(0);
if(current=='-') retun(-1) *
number(function.substring(1,function.length()),variable);
if(current ==' -
'||current=='1'||current==cosi||current==sine||current==tangent||current==varia)
{
if(current == 'l' && function.charAt(3) !='x')return 
Math.log(number(function.substring(3,function.length()-1),variable));
if(current == 'l' && function.charAt(3)=='x')now = 
Math.log(variable);
if(current == cosi && function.charAt(4) !='x')return 
Math.cos(number(function.substring(4,function.length()-1),variable));
if(current == cosi && function.charAt(4)=='x')now = 
Math.cos(variable);
if(current == sine && function.charAt(4) !='x')return 
Math.sin(number(function.substring(4,function.length()-1),variable));
if(current == sine && function.charAt(4)=='x')now =
Math.sin(variable);
if(current == tangent && function.charAt(4) !='x')return
Math.tan(number(function.substring(4,function.length()-1),variable));
if(current == tangent && function.charAt(4)=='x')now = 
Math.tan(variable);
if(current == varia)now = variable;
}
else now = Double.parseDouble(String.valueOf(function));
return now;
}
catch(exception e){return 0;}
}
Public String Operation(String inputString,double position)
{
if(inputString.charAt(0)=='-')inputString = "0+" + inputString; 
JOptionPane msg = new JOptionPane();
DecimalFormat dcm= new DeciamlFormat("0.#######)
char addition = '+';
char subtraction = '-';
char multiplication = '*';
char division = '/';
char root = '√';
char exponent = '^';
char operators[] = {addition,subtraction,multiplication,division,root,exponent};
if(inputString.indexof("[")>=0)
for(int i = inputSting.length()-1;i>=0;i--)
{
int start = 0
int end = 0
if(inputString.charAt(i)=='('){start=i;
end = inputString.indexOf(")",i);
StringBuffer buff = new StingBuffer(inputString);
buff.delete(start,end+1);
buff.insert(start,Operation(inputString.substring(substring(start+1,end),position));
inputString = buff.toString();i=inputString.length-1;}
for(int count = 0; count<=4;count++)
String t1 = new String();
String t2 = new String();
for(int i = 1; i<inputString.length();i++)
{
if(inputString.charAt(i) == Operators[count])
{
int begin = 0;
int start = i
int end = inputString.length
for(int j = start-1; j>0; j--)
if(inputString.charAt(j) == addition || inputString.charAt(j) == subtraction || inputString.charAt(j) == multiplication || inputString.charAt(j) == division ||
inputString.charAt(j) == root || inputString.charAt(j) == exponent)
{begin = j+1;j=0;}
for(int p = star+2;p<inputString.length();p++)
if(inputString.charAt(p) == addition || inputString.charAt(p) == subtraction || inputString.charAt(p) == multiplication || inputString.charAt(p) == division ||
inputString.charAt(p) == root || inputString.charAt(p) == exponent)
{end = p; p=inputString.length();}
t1 = inputString.substring(begin,star);
t2 = inputString.substring(star+1,end);
StringBuffer = new StringBuffer(inputString);
biff.delete(begin.end);
String answer = newString();
if(count == 0) answer =
String.valueOf(Math.pow(number(t1,position),number(t2,position)));
if(count == 0 && answer.compareTo("NaN")==0)return"?";
if(count == 0 && answer.compareTo("NaN")!=0)buff.insert(begin,String.valueOf(dcm.format(number(t1,position)/number(t2,position)));
}
if(t2.charAt(0)=='x' && count==2)
{
if(position!=0)buff.insert(begin,String.valueOf(dcm.format(number(t1,position)/number(t2,position)));
if(position==0)buff.insert(begin,String.valueOf(number(number(t1,position)/number(t2,position)));
}
if(count == 1)buff.insert(begin,String.valueOf(dcm.format(number(t1,position)*number(t2,position)));
if(count == 2)buff.insert(begin,String.valueOf(dcm.format(number(t1,position)/number(t2,position)));
if(count == 3)buff.insert(begin,String.valueOf(dcm.format(number(t1,position)+number(t2,position)));
if(count == 4)buff.insert(begin,String.valueOf(dcm.format(number(t1,position)-number(t2,position)));
if(count == 5)buff.insert(begin,String.valueOf(dcm.format(number(t1,position)^number(t2,position)));
if(count == 6)buff.insert(begin,String.valueOf(dcm.format(√number(t1,position));
inputString = buff.toString();i=0;
}
}
}
return inputString;
)
}
