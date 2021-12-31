package com.library.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.library.connection.*;
import com.library.dao.impl.*;
import com.library.exception.NumberFormatException1;
import com.library.model.*;

public class FinesTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		Connection con=ConnectionUtil.getDBConnect();
		System.out.println("Connection established");
		FinesDaoImpl fDao = new FinesDaoImpl();
		//System.out.println("Enter your choice");
		boolean flag=true;
		String choice2=null;
		do {
		try {
			System.out.println("Enter your choice");
		choice2=sc.nextLine();
		if (!choice2.matches("([0-9])")) {
			flag=false;
			throw new NumberFormatException1();
		}else if(choice2.matches("([0-9])")) {
			flag=true;
		}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			
		//	System.out.println(e);
		
				
		}
		
		}while(flag==false);
		
		int choice=Integer.parseInt(choice2);
		System.out.println("Enter Fine_range");
		int fine_range=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Fine_amount");
		int fine_amount=Integer.parseInt(sc.nextLine());
		System.out.println(fine_range);
		switch(choice){
			
		case 1:
			Fines p1=new Fines(fine_range,fine_amount);
			fDao.insert(p1);
			break;
			
		case 2:
						
			Fines p2=new Fines(fine_range,fine_amount);
				
			fDao.update(p2);
		    break;
			
		case 3:            
				Fines p3=new Fines(fine_range);
				fDao.delete(p3);
				break;
		}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
		

	}

}