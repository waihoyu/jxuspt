package com.jxuspt;

/**
 * 
 * 
 * 
 * 
 * 1、 边界布局（BorderLayout）

2、流式布局（FlowLayout）

3、网格布局（GridLayout）

4、盒子布局（BoxLaYout）

5、空布局（null）

还有其他两种布局，分别是GridBagLayout（网格包布局）、CardLayout（卡片布局）

注意：JFrame和JDialog默认布局为BorderLayout，JPanel和Applet默认布局为FlowLayout

边界布局示例代码：
 */
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class BorderLayoutExample extends JFrame{
	
  JButton btn1=new JButton("江西");
  JButton btn2=new JButton("软件");
  JButton btn3=new JButton("职业");
  JButton btn4=new JButton("技术");
  JButton btn5=new JButton("大学");
  
  BorderLayoutExample(){
    init();
    this.setTitle("边界布局");
    this.setResizable(true);
    this.setSize(200, 200);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }
  void init(){
    this.setLayout(new BorderLayout(10,5));
    //默认为0，0；水平间距10，垂直间距5
    this.add(btn1,BorderLayout.EAST);
    this.add(btn2,BorderLayout.SOUTH);
    this.add(btn3,BorderLayout.WEST);
    this.add(btn4,BorderLayout.NORTH);
    this.add(btn5,BorderLayout.CENTER);
  }
  public static void main(String args[]){
    new BorderLayoutExample();
  }
}