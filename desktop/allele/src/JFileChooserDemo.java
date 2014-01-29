import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import java.io.FilenameFilter;

public class JFileChooserDemo{
	JFrame frame;
	String ret = "";
 public void showChooser(){
    frame = new JFrame("JFileChooser Popup");
    Container contentPane = frame.getContentPane();

    final JLabel directoryLabel = new JLabel(" ");
    directoryLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 36));
    contentPane.add(directoryLabel, BorderLayout.NORTH);

    final JLabel filenameLabel = new JLabel(" ");
    filenameLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 36));
    contentPane.add(filenameLabel, BorderLayout.SOUTH);

    JFileChooser fileChooser = new JFileChooser(".");
    contentPane.add(fileChooser, BorderLayout.CENTER);

    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser theFileChooser = (JFileChooser) actionEvent
            .getSource();
        String command = actionEvent.getActionCommand();
		String ext2 = "java";
        if (command.equals(JFileChooser.APPROVE_SELECTION)) {
          File selectedFile = theFileChooser.getSelectedFile();
		  String name = selectedFile.toString();
		  if(name.toLowerCase().endsWith(".csv") || name.toLowerCase().endsWith(".txt") || name.toLowerCase().endsWith(".dat")){
			ret = name;
			//Call TRNADatabase Function
			frame.hide();
			}
		  else{
			JOptionPane.showMessageDialog(null, "Invalid File!", "Invalid File!", JOptionPane.ERROR_MESSAGE);
		  }
        } else if (command.equals(JFileChooser.CANCEL_SELECTION)) {
			frame.hide();
		}
      }
    };
    fileChooser.addActionListener(actionListener);
	System.out.println("RET3:" + ret);
    frame.pack();
    frame.setVisible(true);
  }
  public void ShowSaver(){
  
	frame = new JFrame("JFileChooser Popup");
    Container contentPane = frame.getContentPane();

    final JLabel directoryLabel = new JLabel(" ");
    directoryLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 36));
    contentPane.add(directoryLabel, BorderLayout.NORTH);

    final JLabel filenameLabel = new JLabel(" ");
    filenameLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 36));
    contentPane.add(filenameLabel, BorderLayout.SOUTH);

    JFileChooser fileChooser = new JFileChooser(".");
    contentPane.add(fileChooser, BorderLayout.CENTER);

    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser theFileChooser = (JFileChooser) actionEvent
            .getSource();
        String command = actionEvent.getActionCommand();
		String ext2 = "java";
        if (command.equals(JFileChooser.APPROVE_SELECTION)) {
          File selectedFile = theFileChooser.getSelectedFile();
		  String name = selectedFile.toString();
		  if(name.toLowerCase().endsWith(".csv") || name.toLowerCase().endsWith(".txt") || name.toLowerCase().endsWith(".dat")){
			ret = name;
			//Call TRNADatabase Function
			frame.hide();
			}
		  else{
			JOptionPane.showMessageDialog(null, "Invalid File!", "Invalid File!", JOptionPane.ERROR_MESSAGE);
		  }
        } else if (command.equals(JFileChooser.CANCEL_SELECTION)) {
			frame.hide();
		}
      }
    };
    fileChooser.addActionListener(actionListener);
	System.out.println("RET3:" + ret);
    frame.pack();
    frame.setVisible(true);
  
  }
  
  
}
