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
