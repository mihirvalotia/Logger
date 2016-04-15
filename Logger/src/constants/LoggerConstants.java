package constants;

import java.lang.reflect.Field;

public final class LoggerConstants {

	public static final String LOCAL_FULL_LOG_FILE_PATH = "C:/logs/log.txt";
	public static final String LOCAL_QUOTE_LOG_FILE_PATH = "C:/logs/quote_log.txt";
	public static final String SERVER_FILE_NAME = "quoteservicePA.log";
	public static final String MY_LOCAL_ARPA_LOG_FILE_PATH = "C:/logs/QuoteRateAR/quoteserviceAR.log";
	public static final String MY_LOCAL_MRPA_LOG_FILE_PATH = "C:/logs/QuoteRatePA/quoteservicePA.log";
	
	public static final String SERVER_USERNAME = "mvalotia";
	public static final String SERVER_PASSWORD = "Aquafina678";
	public static final int SERVER_PORT = 22;
	
	//PROD
	public static final String PROD_NAME="brprlmur006";
	public static String PROD_REMOTE_DIR = "/logs/WebSphere/70/was70_node06/mur_prd_quoteservice_clone3/";

	//MRPA_QA1
	public static final String MRPA_QA1_NAME="brqalmur002";
	public static final String MRPA_QA1_REMOTE_DIR = "/logs/WebSphere/was70_node02/mur_qa1_quoteservice_clone1/";

	//MRPA_QA2
	public static final String MRPA_QA2_NAME="brqalmur003";
	public static final String MRPA_QA2_REMOTE_DIR = "/logs/WebSphere/was70_node02/mur_qa1_quoteservice_clone1/";
	
	//ARPA_QA1_clone1
	public static final String ARPA_QA1_clone1_NAME="brqalmur001";
	public static final String ARPA_QA1_clone1_REMOTE_DIR = "/logs/WebSphere/70/was70_node01/mur_qa1_ar_clone01/";
	
	//ARPA_QA1_clone2
	public static final String ARPA_QA1_clone2_NAME="brqalmur002";
	public static final String ARPA_QA1_clone2_REMOTE_DIR = "/logs/WebSphere/was70_node02/mur_qa1_ar_clone02";
		
	//ARPA_QA2_clone1
	public static final String ARPA_QA2_clone1_NAME="brqalmur001";
	public static final String ARPA_QA2_clone1_REMOTE_DIR = "/logs/WebSphere/70/was70_node01/mur_qa2_ar_clone01";
	
	//ARPA_QA2_clone2
	public static final String ARPA_QA2_clone2_NAME="brqalmur002";
	public static final String ARPA_QA2_clone2_REMOTE_DIR = "/logs/WebSphere/was70_node02/mur_qa2_ar_clone02";

	public static String getStringValue(String string) throws IllegalArgumentException, IllegalAccessException{
		LoggerConstants loggerConstants = new LoggerConstants();
		Object value = null;
		for (Field field : loggerConstants.getClass().getDeclaredFields()){
			if((field.getName()).equals(string)){
				value = field.get(loggerConstants);
				break;
			}
		}
		return value.toString();
	}

}
