package com.template.javaproject.commons.util;

import com.template.javaproject.commons.model.ApplicationInfo;

public  class JavaProjectHelper {
    private static ApplicationInfo info = new ApplicationInfo(
        "java-project",
        "Java Project",
        "1.0.0"
    );

    public ApplicationInfo getAppInfo() {
        return info;
    }
}