package org.ashim.ksoap.action;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

public class Main {
	public static void main(String[] args) {
		try{
		ServiceController controller = new ServiceController();
		System.out.println(controller.getPost(1));
		for (int i = 0; i < 5; i++) {
			System.out.println(controller.getPosts()[i].getContent());
		}
		} catch (IOException | XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
