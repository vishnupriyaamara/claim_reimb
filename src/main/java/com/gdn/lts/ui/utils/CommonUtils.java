/*
 * Copyright (C) 2018 PT Global Digital Niaga - All Rights Reserved
 *
 * NOTICE:  All information contained herein is, and remains the property of PT Global Digital Niaga.
 *
 * Dissemination of this information or reproduction of this material is strictly forbidden.
 */

package com.gdn.lts.ui.utils;

import com.gdn.lts.ui.model.constants.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by jugalkishorsahu on Feb, 2018
 */
@Slf4j
public class CommonUtils {

    public static String getUserName() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth.getPrincipal() != null && auth
            .getPrincipal() instanceof UserDetails) {
            return ((UserDetails) auth.getPrincipal()).getUsername();
        }
        return null;
    }

    public static String getMaxAllowedFileSize(String fileSizeInMb) {
        try {
            return fileSizeInMb.substring(0, fileSizeInMb.length() - 2);
        } catch (StringIndexOutOfBoundsException e) {
            log.error("fileSizeInMb is in invalid format, fileSizeInMb :{}", fileSizeInMb, e);
            return Constants.DEFAULT_MAX_ALLOWED_FILE_SIZE_IN_MB;
        }
    }
}
