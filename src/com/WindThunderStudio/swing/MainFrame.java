package com.WindThunderStudio.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MainFrame {

	private JFrame frame;
	private JSplitPane splitPane;
	private JScrollPane topScrollPane;
	private JEditorPane bottomEditorPane;
	private JTree xmlTree;
	private JMenuBar menuBar;
	private JMenu menuFile;
	private JMenuItem mntmSelectXml;
	private JSeparator separator;
	private JMenuItem menuItem_Exit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getSplitPane());
	}
	private JSplitPane getSplitPane() {
		if (splitPane == null) {
			splitPane = new JSplitPane();
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane.setBounds(0, 0, 637, 571);
			splitPane.setLeftComponent(getTopScrollPane());
			splitPane.setRightComponent(getBottomEditorPane());
		}
		return splitPane;
	}
	private JScrollPane getTopScrollPane() {
		if (topScrollPane == null) {
			topScrollPane = new JScrollPane();
			topScrollPane.setViewportView(getXmlTree());
			topScrollPane.setColumnHeaderView(getMenuBar());
		}
		return topScrollPane;
	}
	private JEditorPane getBottomEditorPane() {
		if (bottomEditorPane == null) {
			bottomEditorPane = new JEditorPane();
		}
		return bottomEditorPane;
	}
	private JTree getXmlTree() {
		if (xmlTree == null) {
			xmlTree = new JTree();
		}
		return xmlTree;
	}
	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMenuFile());
		}
		return menuBar;
	}
	private JMenu getMenuFile() {
		if (menuFile == null) {
			menuFile = new JMenu("File");
			menuFile.add(getMntmSelectXml());
			menuFile.add(getSeparator());
			menuFile.add(getMenuItem_Exit());
		}
		return menuFile;
	}
	private JMenuItem getMntmSelectXml() {
		if (mntmSelectXml == null) {
			mntmSelectXml = new JMenuItem("Select XML...");
		}
		return mntmSelectXml;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	private JMenuItem getMenuItem_Exit() {
		if (menuItem_Exit == null) {
			menuItem_Exit = new JMenuItem("Exit");
		}
		return menuItem_Exit;
	}
}
