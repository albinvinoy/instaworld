package com.social.instagram.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@Slf4j
public class ProfilePictureService {

    public void uploadUserProfilePicture(String userId, MultipartFile file) {
        // check if image is not empty
        // if file is an image
            // check if user is in db
            // grab from metadata from file if any
        //Store the image in S3 and update database with s3 image link
    }
}
