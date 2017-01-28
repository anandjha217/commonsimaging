package commonsimaging;

import java.io.File;
import java.io.IOException;
import org.apache.commons.imaging.*;
import org.apache.commons.imaging.common.ImageMetadata;

public class StringOperation {

	public String convertToUpperCase(String print){
		return print.toUpperCase();
	}
	
	public static void metadataExample(final File file) throws ImageReadException,
        IOException {
		
		// get all metadata stored in EXIF format (ie. from JPEG or TIFF).
		final ImageMetadata metadata = Imaging.getMetadata(file);

	}
}
