package com.devcourse.eggmarket.domain.model.image;

import org.springframework.web.multipart.MultipartFile;

public interface Image {

    byte[] getContents();

    String pathTobeStored(String basePath);

    ImageType getType();

    static boolean isImageContentType(String contentType) {
        if (contentType == null) {
            return false;
        }

        return contentType.startsWith("image");
    }

    static boolean isNotImage(MultipartFile file) {
        if (file == null) {
            return false;
        }
        return !isImageContentType(file.getContentType());
    }
}
