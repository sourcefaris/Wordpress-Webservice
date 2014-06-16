package org.ashim.ksoap.action;

import java.io.IOException;

import org.ashim.ksoap.model.Post;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;
import org.xmlpull.v1.XmlPullParserException;

public class ServiceController {
	private static final String NAME_SPACE = "http://wpws.bkahlert.com";
	private static final String WSDL = "http://localhost/wordpress/index.php?/wpws";
	private String NAME_METHOD;
	private String NAME_ACTION = NAME_SPACE+"/"+NAME_METHOD;
	
	public Post getPost(int postId) throws IOException, XmlPullParserException{
		NAME_METHOD = "getPost";
		SoapObject request = new SoapObject(NAME_SPACE, NAME_METHOD);
		request.addProperty("postId",postId);
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.dotNet = true;
		envelope.setOutputSoapObject(request);
		AndroidHttpTransport httpTransport = new AndroidHttpTransport(WSDL);
		
		httpTransport.call(NAME_ACTION, envelope);
		SoapObject resultRequestSOAP = (SoapObject) envelope.bodyIn;
		SoapObject nameResult = (SoapObject) resultRequestSOAP.getProperty(0);
		Post post = new Post(
				nameResult.getProperty(0).toString(), 
				nameResult.getProperty(1).toString() , 
				nameResult.getProperty(2).toString(),
				nameResult.getProperty(3).toString(), 
				nameResult.getProperty(4).toString(), 
				nameResult.getProperty(5).toString(), 
				nameResult.getProperty(6).toString(), 
				nameResult.getProperty(7).toString(), 
				nameResult.getProperty(8).toString(), 
				nameResult.getProperty(9).toString(), 
				nameResult.getProperty(10).toString(), 
				nameResult.getProperty(11).toString(), 
				nameResult.getProperty(12).toString(), 
				nameResult.getProperty(13).toString(), 
				nameResult.getProperty(14).toString(), 
				nameResult.getProperty(15).toString(), 
				nameResult.getProperty(16).toString(), 
				nameResult.getProperty(17).toString(), 
				nameResult.getProperty(18).toString(), 
				nameResult.getProperty(19).toString(), 
				nameResult.getProperty(20).toString(), 
				nameResult.getProperty(21).toString(), 
				nameResult.getProperty(22).toString(), 
				nameResult.getProperty(23).toString());
		return post;
	}
	
	public Post[] getPosts() throws IOException, XmlPullParserException{
		NAME_METHOD = "getPosts";
		SoapObject request = new SoapObject(NAME_SPACE, NAME_METHOD);
		request.addProperty("args2",0);
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.dotNet = true;
		envelope.setOutputSoapObject(request);
		AndroidHttpTransport httpTransport = new AndroidHttpTransport(WSDL);
		
		httpTransport.call(NAME_ACTION, envelope);
		SoapObject resultRequestSOAP = (SoapObject) envelope.bodyIn;
		SoapObject nameResult = (SoapObject) resultRequestSOAP.getProperty(0);
		
//		nameResult.getPropertyCont() max size = 5
		Post[] posts = new Post[nameResult.getPropertyCount()];
		for (int i = 0; i < nameResult.getPropertyCount(); i++) {
			SoapObject subResult = (SoapObject) nameResult.getProperty(i);
			posts[i] = new Post(
					subResult.getProperty(0).toString(), 
					subResult.getProperty(1).toString() , 
					subResult.getProperty(2).toString(),
					subResult.getProperty(3).toString(), 
					subResult.getProperty(4).toString(), 
					subResult.getProperty(5).toString(), 
					subResult.getProperty(6).toString(), 
					subResult.getProperty(7).toString(), 
					subResult.getProperty(8).toString(), 
					subResult.getProperty(9).toString(), 
					subResult.getProperty(10).toString(), 
					subResult.getProperty(11).toString(), 
					subResult.getProperty(12).toString(), 
					subResult.getProperty(13).toString(), 
					subResult.getProperty(14).toString(), 
					subResult.getProperty(15).toString(), 
					subResult.getProperty(16).toString(), 
					subResult.getProperty(17).toString(), 
					subResult.getProperty(18).toString(), 
					subResult.getProperty(19).toString(), 
					subResult.getProperty(20).toString(), 
					subResult.getProperty(21).toString(), 
					subResult.getProperty(22).toString(), 
					subResult.getProperty(23).toString());
		}
		return posts;
	}

}
