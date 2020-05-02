package org.ggf;

/**
 *[简要描述]: 
 * @Author guoge
 * @Date 2020/5/2 12:55
 **/
public class JavaStackTrace {
	public static void getStackTrace() {
		java.lang.StackTraceElement[] classArray = new Exception().getStackTrace();
		for (int i = 0; i < classArray.length && !classArray[i].getClassName().contains("junit"); i++) {
			String classname = classArray[i].getClassName();
			String methodname = classArray[i].getMethodName();
			System.out.println("调用数据源的类名：【" + classname + "】，方法名：【" + methodname + "】");
		}
	}
}
