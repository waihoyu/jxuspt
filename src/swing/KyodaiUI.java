package swing;

import java.awt.*;
import javax.swing.*;

public class KyodaiUI extends JFrame {
	/**
	 *   上课测试用例
	 */
	private static final long serialVersionUID = 1L;

	public KyodaiUI() {
		this.setSize(780, 500);// 将窗体的大小设定为780*500
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);// 窗体不能改变大小
		this.setTitle("连连看");// 设置标题

		JPanel toolBar = new JPanel();
		toolBar.setBackground(Color.white);
		toolBar.setPreferredSize(new Dimension(780, 48));
		
		JPanel actionPanel = new JPanel();// 新建JPanel型的控件
		actionPanel.setBackground(Color.yellow);// 设置背景色
		actionPanel.setPreferredSize(new Dimension(160, 380));// 设置大小
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBackground(Color.blue);
		contentPanel.setPreferredSize(new Dimension(620, 380));

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.red);
		bottomPanel.setPreferredSize(new Dimension(220, 80));

		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.green);
		leftPanel.setPreferredSize(new Dimension(220, 80));
		
		this.getContentPane().add(toolBar, BorderLayout.NORTH);
		this.getContentPane().add(actionPanel, BorderLayout.EAST);
		this.getContentPane().add(contentPanel, BorderLayout.CENTER);
		this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		this.getContentPane().add(leftPanel, BorderLayout.WEST);		
		
	}

	public static void main(String[] args) throws HeadlessException {
		KyodaiUI kyodaiUI = new KyodaiUI();
		kyodaiUI.show();
	}
}
