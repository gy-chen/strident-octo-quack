package tw.edu.nutc.s13023047.config;

import java.io.File;
import java.io.IOException;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	private static String PATH_TMP_FILES;

	static {
		File tmpDir;
		try {
			tmpDir = File.createTempFile("test", null);
			PATH_TMP_FILES = tmpDir.getParentFile().getAbsolutePath();
			tmpDir.delete();
		} catch (IOException e) {
			PATH_TMP_FILES = "";
			e.printStackTrace();
		} 
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		registration.setMultipartConfig(new MultipartConfigElement(PATH_TMP_FILES));
	}
}
