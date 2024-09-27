package com.algaworks.algafood.util;

<<<<<<< HEAD
import org.springframework.util.StreamUtils;

=======
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

<<<<<<< HEAD
=======
import org.springframework.util.StreamUtils;

>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
public class ResourceUtils {

	public static String getContentFromResource(String resourceName) {
		try {
			InputStream stream = ResourceUtils.class.getResourceAsStream(resourceName);
			return StreamUtils.copyToString(stream, Charset.forName("UTF-8"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}