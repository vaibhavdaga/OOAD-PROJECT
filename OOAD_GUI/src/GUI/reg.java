package GUI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import java.awt.Choice;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Control;
 
public class reg
{
	private static Text fNametxt;
	private static Text lNametxt;
	private static Text logintxt;
	private static Text passtxt;
	private static Text repasstxt;
	private static Text dpttxt;
	private static Text enryrtxt;
	private static Text addresstxt;
	public static void main (String [] args) {
		Display display = new Display ();
		Shell shlPutIdHere = new Shell(display);
		shlPutIdHere.setSize(478, 748);
		shlPutIdHere.setText("put id here");
 
		FillLayout fl_shlPutIdHere = new FillLayout();
		shlPutIdHere.setLayout(fl_shlPutIdHere);
		Group profileGroup = new Group(shlPutIdHere, SWT.BORDER | SWT.SHADOW_IN);
		profileGroup.setFont(SWTResourceManager.getFont("Times New Roman", 9, SWT.NORMAL));
		
		
		final Label namF = new Label(profileGroup, SWT.NONE);
		namF.setBounds(21, 97, 149, 35);
		namF.setText("First Name");
		
		Label namL = new Label(profileGroup, SWT.NONE);
		namL.setText("Last Name");
		namL.setBounds(21, 138, 149, 35);
		
		Label gen = new Label(profileGroup, SWT.NONE);
		gen.setText("Gender");
		gen.setBounds(21, 179, 149, 35);
		
		Label dob = new Label(profileGroup, SWT.NONE);
		dob.setText("Date Of Birth");
		dob.setBounds(21, 220, 149, 35);
		
		Label dept = new Label(profileGroup, SWT.NONE);
		dept.setText("Department");
		dept.setBounds(21, 384, 149, 35);
		
		Label enrYr = new Label(profileGroup, SWT.NONE);
		enrYr.setText("Enrolled Year");
		enrYr.setBounds(21, 606, 149, 35);
		
		Label addr = new Label(profileGroup, SWT.NONE);
		addr.setText("Address");
		addr.setBounds(21, 425, 149, 35);
		
		Button btnRegister = new Button(profileGroup, SWT.NONE);
		btnRegister.setBounds(154, 647, 105, 35);
		btnRegister.setText("Register");
		
		Label LoginIDL = new Label(profileGroup, SWT.NONE);
		LoginIDL.setText("ID");
		LoginIDL.setBounds(21, 261, 149, 35);
		
		Label passL = new Label(profileGroup, SWT.NONE);
		passL.setText("Password");
		passL.setBounds(21, 302, 149, 35);
		
		Label repassL = new Label(profileGroup, SWT.NONE);
		repassL.setText("Re-enter password");
		repassL.setBounds(21, 343, 149, 35);
		
		fNametxt = new Text(profileGroup, SWT.NONE);
		fNametxt.setBounds(176, 94, 264, 31);
		
		lNametxt = new Text(profileGroup, SWT.NONE);
		lNametxt.setBounds(176, 130, 264, 31);
		
		logintxt = new Text(profileGroup, SWT.NONE);
		logintxt.setBounds(176, 258, 264, 31);
		
		passtxt = new Text(profileGroup, SWT.NONE);
		passtxt.setBounds(176, 299, 264, 31);
		passtxt.setEchoChar('*');
		
		repasstxt = new Text(profileGroup, SWT.NONE);
		repasstxt.setBounds(176, 340, 264, 31);
		repasstxt.setEchoChar('*');
		
		dpttxt = new Text(profileGroup, SWT.NONE);
		dpttxt.setBounds(176, 381, 264, 31);
		
		enryrtxt = new Text(profileGroup, SWT.NONE);
		enryrtxt.setBounds(176, 603, 264, 31);
		
		addresstxt = new Text(profileGroup, SWT.V_SCROLL | SWT.MULTI);
		addresstxt.setBounds(176, 425, 264, 162);
		
		Button RBmale = new Button(profileGroup, SWT.RADIO);
		RBmale.setBounds(176, 179, 67, 25);
		RBmale.setText("Male");
		
		Button RBfemale = new Button(profileGroup, SWT.RADIO);
		RBfemale.setText("Female");
		RBfemale.setBounds(249, 179, 140, 25);
		
		Label welcm = new Label(profileGroup, SWT.NONE);
		welcm.setAlignment(SWT.CENTER);
		welcm.setBounds(178, 27, 105, 25);
		welcm.setText("WELCOME");
		
		CCombo ddCombo = new CCombo(profileGroup, SWT.BORDER);
		ddCombo.setItems(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"});
		ddCombo.setText("DD");
		ddCombo.setBounds(176, 220, 67, 30);
		
		CCombo mmCombo = new CCombo(profileGroup, SWT.BORDER);
		mmCombo.setItems(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"});
		mmCombo.setText("MM");
		mmCombo.setBounds(249, 220, 76, 30);
		
		CCombo yyCombo = new CCombo(profileGroup, SWT.BORDER);
		yyCombo.setItems(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000"});
		yyCombo.setText("YY");
		yyCombo.setBounds(331, 220, 95, 30);
		
		Label errorLabel = new Label(profileGroup, SWT.HORIZONTAL | SWT.CENTER);
		errorLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		errorLabel.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
		errorLabel.setAlignment(SWT.CENTER);
		errorLabel.setBounds(55, 66, 334, 25);
		errorLabel.setText("Error!!!!!!  your passwords didnot match..");
		profileGroup.setTabList(new Control[]{btnRegister, fNametxt, lNametxt, logintxt, passtxt, repasstxt, dpttxt, enryrtxt, addresstxt, RBmale, RBfemale, ddCombo, mmCombo, yyCombo});
		
		shlPutIdHere.open();
 
		while (!shlPutIdHere.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	}
}