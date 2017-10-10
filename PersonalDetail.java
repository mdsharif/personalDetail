import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
class PersonalDetail
{
	JFrame f;
	Font label,textField,head;
	JLabel heading;
	//FOR 1st nd 2nd ROW
	Choice title;
	JTextField f_name,l_name,p_first_name,p_last_name;
	//FOR 2ND ROW
	Choice p_title,pt_title;
	// 3RD ROW
	JLabel day,month,year;
	Choice y,m,d;
	// 4th ROW
	CheckboxGroup gender,m_status;
	Checkbox male,female,married,unmarried;
	//5th ROW
	Choice b_group,rel;
	// 6th ROW
	JTextField mobile,email;
	Choice email_suffix;
	//7th ROW
	Checkbox music,reading,study,cricket,other,programming,football;
	//8th ND 9th 
	JTextField state_tf2,dist_tf2,block_tf2,house_tf2;
	JLabel same;
	CheckboxGroup copy;
	Checkbox yes,no;
	JTextField state_tf1,dist_tf1,block_tf1,house_tf1;
	JButton submit;
	//for Listener
	JTextArea other_hobby;
	PersonalDetail()
	{
//		month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		f = new JFrame("Personal Detail");
		head = new Font("Sans Serif",Font.BOLD,18);
		heading = new JLabel("#*#*#*#*#*#*#*#*#Personal Detail#*#*#*#*#*#*#*#*#");
		heading.setBounds(180,30,600,30);
//		setFont(heading);
		f.add(heading);
		// INPUTTING NAME
		JLabel first_name,last_name,name,nameOf,t_title,dob;
		name = new JLabel("Name");
		name.setBounds(15,90,60,15);
		title = new Choice();
		t_title = new JLabel("Title");
		t_title.setBounds(180,75,45,15);
		title.add("Mr.");
		title.add("Mrs.");
		title.add("Ms.");
		title.setBounds(180,90,60,15);
		first_name = new JLabel("First Name");
		first_name.setBounds(270,75,120,15);
		last_name  = new JLabel("Last Name");
		last_name.setBounds(420,75,120,15);
		f_name = new JTextField();
		f_name.setBounds(270,90,120,25);
		l_name = new JTextField();
		l_name.setBounds(420,90,120,25);
		//
		// SECOND ROW
		nameOf = new JLabel("Name of");
		nameOf.setBounds(15,120,60,15);
		p_title = new Choice();//parent title
		p_title.add("Father");
		p_title.add("Husband");
		p_title.setBounds(75,120,75,15);
		pt_title = new Choice();
		pt_title.add("Mr.");
		pt_title.setBounds(180,120,60,15);
		p_first_name = new JTextField();
		p_first_name.setBounds(270,120,120,25);
		p_last_name = new JTextField();
		p_last_name.setBounds(420,120,120,25);
		
		////THIRD ROW
		year = new JLabel("Year");
		year.setBounds(180,150,45,15);
		month = new JLabel("Month");
		month.setBounds(270,150,45,15);
		day = new JLabel("Day");
		day.setBounds(420,150,45,15);
		dob = new JLabel("Date of Birth");
		dob.setBounds(15,165,90,50);
		y = new Choice();
		for(int i=2015;i>1900;i--)
			y.add(Integer.toString(i));
		y.setBounds(180,175,60,20);
		m = new Choice();
		m.add("Jan");m.add("Feb");m.add("Mar");m.add("Apr");
		m.add("May");m.add("Jun");m.add("Jul");m.add("Aug");
		m.add("Sep");m.add("Oct");m.add("Nov");m.add("Dec");
		m.setBounds(270,175,60,20);
		d = new Choice();
		for(int i=1;i<31;i++)
			d.add(Integer.toString(i));		
		d.setBounds(420,175,60,20);
		
		///FOURTH
		JLabel sex,marital_status;		
		sex = new JLabel("Sex");
		sex.setBounds(15,210,30,30);
		gender = new CheckboxGroup();
		male = new Checkbox("Male",gender,true);
		male.setBounds(110,210,60,30);
		female = new Checkbox("Female",gender,false);
		female.setBounds(180,210,60,30);
		marital_status = new JLabel("Marital Status");
		marital_status.setBounds(270,210,90,30);
		m_status = new CheckboxGroup();
		married =new Checkbox("Married",m_status,true);
		married.setBounds(420,210,60,30);
		unmarried = new Checkbox("Unmarried",m_status,false);
		unmarried.setBounds(500,210,90,30);
		
		/// FIFTH
		JLabel blood,religion;
		
		
		blood= new JLabel("Blood Group");
		blood.setBounds(15,260,90,20);
		b_group = new Choice();
		b_group.add("O+");b_group.add("O-");
		b_group.add("A+");b_group.add("A-");
		b_group.add("B+");b_group.add("B-");
		b_group.add("AB-");b_group.add("AB+");
		b_group.setBounds(180,260,60,15);
		religion = new JLabel("Religion");
		religion.setBounds(270,260,60,20);
		rel = new Choice();
		rel.add("Muslim");rel.add("Hindu");rel.add("Christian");
		rel.add("Sikh");rel.add("Jain");rel.add("Budhist");
		rel.add("Others");
		rel.setBounds(420,260,90,20);
		
		
		//// SIXTH CONTACT DETAILS
		JLabel contact,mob,mail;
		

		contact = new JLabel("Contact");
		contact.setBounds(15,300,75,20);
		mob = new JLabel("Mob :");
		mob.setBounds(120,300,30,20);
		mobile = new JTextField();
		mobile.setBounds(155,300,90,20);
		mail = new JLabel("Email :");
		mail.setBounds(270,300,90,20);
		email = new JTextField();
		email.setBounds(420,300,120,20);
		email_suffix = new Choice();
		email_suffix.add("@gmail.com");
		email_suffix.add("@yahoo.com");
		email_suffix.add("@hotmail.com");
		email_suffix.add("@live.com");
		email_suffix.setBounds(545,300,100,30);
		
		///SEVENTH
		JLabel hobby = new JLabel("Hobbies");
		hobby.setBounds(15,340,60,20);
		music = new Checkbox("Music");
		music.setBounds(180,340,70,20);
		reading = new Checkbox("Reading");
		reading.setBounds(270,340,70,20);
		cricket = new Checkbox("Cricket");
		cricket.setBounds(360,340,70,20);
		football = new Checkbox("Football");
		football.setBounds(450,340,70,20);
		other = new Checkbox("Other");
		other.setBounds(540,340,70,20);
		other_hobby = new JTextArea(3,20);
		other_hobby.setBounds(180,370,430,20);
		/*if(otherOn==1)
			f.add(other_hobby);
		*/

		//EIGHTth ROW LOCAL ADDRESS
		JLabel loc_add,state1,dist1,block1,house1;
		

		loc_add = new JLabel("Local Address");
		loc_add.setBounds(15,410,100,15);
		state1 = new JLabel("State");
		state1.setBounds(180,395,100,15);
		dist1 = new JLabel("Dist");
		dist1.setBounds(290,395,90,15);
		block1 = new JLabel("Block");
		block1.setBounds(400,395,90,15);
		house1 = new JLabel("House No./street");
		house1.setBounds(500,395,120,15);
		state_tf1 = new JTextField();
		state_tf1.setBounds(180,410,100,25);
		dist_tf1 = new JTextField();
		dist_tf1.setBounds(290,410,90,25);
		block_tf1 = new JTextField();
		block_tf1.setBounds(400,410,90,25);
		house_tf1 = new JTextField();
		house_tf1.setBounds(500,410,145,25);
		same = new JLabel("Same as Local");
		same.setBounds(290,445,90,15);
		copy = new CheckboxGroup();
		yes = new Checkbox("yes",copy,false);
		yes.setBounds(400,445,90,15);
		no = new Checkbox("no",copy,true);
		no.setBounds(500,445,90,15);

		////PERMANENT ADDRESS
		JLabel perm_add,state2,dist2,block2,house2;
		perm_add = new JLabel("Permanent Address");
		perm_add.setBounds(15,485,100,15);
		state2 = new JLabel("State");
		state2.setBounds(180,470,100,15);
		dist2 = new JLabel("Dist");
		dist2.setBounds(290,470,90,15);
		block2 = new JLabel("Block");
		block2.setBounds(400,470,90,15);
		house2 = new JLabel("House No./street");
		house2.setBounds(500,470,120,15);
		state_tf2 = new JTextField();
		state_tf2.setBounds(180,485,100,25);
		dist_tf2 = new JTextField();
		dist_tf2.setBounds(290,485,90,25);
		block_tf2 = new JTextField();
		block_tf2.setBounds(400,485,90,25);
		house_tf2 = new JTextField();
		house_tf2.setBounds(500,485,145,25);

		submit = new JButton("Create My Bio-Data");
		submit.setBounds(290,540,200,30);
		submit.setBackground(Color.pink);


		//ADDING FIRST ROW//
		f.add(t_title);f.add(heading);f.add(name);
		f.add(title);f.add(first_name);f.add(last_name);
		f.add(f_name);f.add(l_name);
		////////SECOND ROW//
		f.add(nameOf);f.add(p_title);f.add(pt_title);
		f.add(p_first_name);f.add(p_last_name);
		//THIRD ROW//
		f.add(dob);f.add(day);f.add(month);f.add(year);
		f.add(d);f.add(m);f.add(y);
		// FOURTH//
		f.add(sex);f.add(male);f.add(female);
		f.add(marital_status);f.add(married);f.add(unmarried);
		//FIFTH//
		f.add(b_group);f.add(blood);f.add(religion);f.add(rel);
		// SIXTH//
		f.add(contact);f.add(mob);f.add(mobile);f.add(mail);
		f.add(email);f.add(email_suffix);
		// SEVENTH
		f.add(hobby);f.add(music);f.add(reading);f.add(cricket);
		f.add(football);f.add(other);
		// FINAL
		f.add(loc_add);f.add(state1);f.add(dist1);f.add(block1);
		f.add(house1);f.add(state_tf1);f.add(dist_tf1);f.add(block_tf1);
		f.add(house_tf1);f.add(same);f.add(yes);f.add(no);f.add(perm_add);
		f.add(state2);f.add(dist2);f.add(block2);f.add(house2);f.add(state_tf2);
		f.add(dist_tf2);f.add(block_tf2);f.add(house_tf2);f.add(submit);
		//ADDING LISTENER
		ItemListenerHandler ilh = new ItemListenerHandler(this);
		title.addItemListener(ilh);
		y.addItemListener(ilh);
		m.addItemListener(ilh);
		d.addItemListener(ilh);
		other.addItemListener(ilh);
		yes.addItemListener(ilh);
		no.addItemListener(ilh);
		ActionListenerHandler alh = new ActionListenerHandler(this);
		submit.addActionListener(alh);
		MouseListenerHandler mlh = new MouseListenerHandler(this);
		f.addMouseListener(mlh);
//		f.addWindowListener(this);
		f.setSize(720,620);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new PersonalDetail();		
	}
}




class MouseListenerHandler extends MouseAdapter
{
	PersonalDetail obj;
	MouseListenerHandler(PersonalDetail obj)
	{
		this.obj = obj;
	}
	public void mouseClicked(MouseEvent me)
	{
			
	}
}
class ActionListenerHandler implements ActionListener
{
	PersonalDetail obj;
	ActionListenerHandler(PersonalDetail obj)
	{
		this.obj = obj;
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			new Generate(obj);
		}
		catch (Exception e)
		{
		}
	}
}
class ItemListenerHandler implements ItemListener
{
	PersonalDetail obj;
	ItemListenerHandler(PersonalDetail obj)
	{
		this.obj=obj;
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(obj.title.getSelectedItem().equals("Mr."))
		{
			obj.male.setState(true);
		}
		else
		{
			obj.female.setState(true);
		}
		if(obj.title.getSelectedItem().equals("Ms."))
		{
			obj.unmarried.setState(true);
		}
		
		if(obj.yes.getState())
		{
			obj.state_tf2.setText(obj.state_tf1.getText());
			obj.dist_tf2.setText(obj.dist_tf1.getText());
			obj.block_tf2.setText(obj.block_tf1.getText());
			obj.house_tf2.setText(obj.house_tf1.getText());
		}
		if(obj.no.getState())
		{
			obj.state_tf2.setText("");
			obj.dist_tf2.setText("");
			obj.block_tf2.setText("");
			obj.house_tf2.setText("");
		}
		System.out.println("item event");	
	}
}

class Generate
{
	String hobby="";
	Generate(PersonalDetail obj) throws IOException
	{
		PrintWriter pw = new PrintWriter(obj.f_name.getText()+"'s Bio-data.txt");
		pw.println("************BIO - DATA************");
		pw.println();
		pw.write("Name          :\t");
		pw.println(obj.title.getSelectedItem()+" "+obj.f_name.getText()+" "+obj.l_name.getText());
		pw.print("Father's Name :\t");
		pw.println(obj.pt_title.getSelectedItem()+" "+obj.p_first_name.getText()+" "+obj.p_last_name.getText());
		pw.print("Date of Birth :\t");
		pw.println(obj.d.getSelectedItem()+" - "+obj.m.getSelectedItem()+" - "+obj.y.getSelectedItem());
		pw.write("Marital Status:\t");
		pw.println(obj.m_status.getSelectedCheckbox().getLabel());
		pw.write("Gender        :\t");
		pw.println(obj.gender.getSelectedCheckbox().getLabel());
		pw.write("Religion      :\t");
		pw.println(obj.rel.getSelectedItem());
		pw.write("Blood Group   :\t");
		pw.println(obj.b_group.getSelectedItem());
		pw.write("Contact No.   :\t");
		pw.println(obj.mobile.getText());
		pw.write("E-mail        :\t");
		pw.println(obj.email.getText()+obj.email_suffix.getSelectedItem());
		pw.write("Hobbies       :\t");
		if(obj.music.getState())
			hobby+="Listening to Music,";
		if(obj.reading.getState())
			hobby+="Reading books,";
		if(obj.cricket.getState())
			hobby+="Playing Cricket,";
		if(obj.football.getState())
			hobby+="Playing Football,";
		pw.println(hobby);
		pw.print("Local Address :\t");
		pw.println("House No./Street : "+obj.house_tf1.getText()+"\tBlock - "+obj.block_tf1.getText());
		pw.println("\t\tDist :"+obj.dist_tf1.getText()+"\tState "+obj.state_tf1.getText());
		pw.print("Pemanent Add  :\t");
		pw.println("House No./Street : "+obj.house_tf2.getText()+"\tBlock - "+obj.block_tf2.getText());
		pw.println("\t\tDist :"+obj.dist_tf2.getText()+"\tState "+obj.state_tf2.getText());
		pw.flush();
		pw.close();
	}
}