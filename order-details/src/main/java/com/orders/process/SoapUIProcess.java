package com.orders.process;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestSuiteRunner;


public class SoapUIProcess {
	
	
	public String executeSoap() {
		
		String projectLoc = "CAE.xml";
		File file = new File(this.getClass().getClassLoader().getResource(projectLoc).getFile());
		projectLoc = file.getAbsolutePath();
		System.out.println("filePath >> "+projectLoc);
		String env=null;
		try {
			if (projectLoc != null) {
				//String wsdlFile = xlsFile.substring(0, xlsFile.lastIndexOf("."));
				WsdlProject project = null;
				try{
					project = new WsdlProject(projectLoc);
				}catch(Exception ee){
					ee.printStackTrace();
				}
				/*project.setPropertyValue("dataSheetName", xlsFile);
				project.setPropertyValue("env", "" );
				project.setPropertyValue("uploadFileLocation", uploadFileLocation);
				project.setPropertyValue("outputFilePath", uploadFileLocation+"reports/");
				project.setPropertyValue("responseType", responseType);
				//set all endpoints values
				project.setPropertyValue("endpoint1", fileDetail.getEndpoint1()==null? "":fileDetail.getEndpoint1());
				project.setPropertyValue("endpoint2", fileDetail.getEndpoint2()==null? "":fileDetail.getEndpoint2());*/
				
				WsdlTestSuite testSuite = project.getTestSuiteByName("Comparative Analysis Engine SOAP");
				//WsdlTestSuiteRunner runner = testSuite.run(null, false);
				
				String soapUIResponse 	=	testSuite.getPropertyValue("soapUIResponse");
				env =project.getPropertyValue("uploadFileLocation");
				System.out.println("executeSoapResponseList"+soapUIResponse+":::env::"+env);
								
			}
		} catch (Exception e) {
			System.out.println((new StringBuilder("Exception - ")).append(
					e.toString()).toString());
		}
		return env ;
	}
	
	

}
