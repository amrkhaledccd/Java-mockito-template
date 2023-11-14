package com.template.javaproject.util;

import com.template.javaproject.model.ApplicationInfo;

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