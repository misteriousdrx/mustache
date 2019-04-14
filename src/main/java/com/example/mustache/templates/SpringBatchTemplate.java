package com.example.mustache.templates;

import com.example.mustache.mustache.MustacheTemplate;

import java.io.IOException;

public class SpringBatchTemplate extends MustacheTemplate {
    private String projectPackage;
    private String projectName;

    public SpringBatchTemplate() {
    }

    public SpringBatchTemplate(String projectPackage, String projectName) {
        this.projectPackage = projectPackage;
        this.projectName = projectName;
    }


    public void generateTemplates() throws IOException {
        this.compileAndSsaveTemplate("/SpringBatch/business/Person.mustache", "C:\\Users\\Paulo\\Desktop\\compiled\\business", "Person.java");
    }


    public String getProjectPackage() {
        return projectPackage;
    }

    public void setProjectPackage(String projectPackage) {
        this.projectPackage = projectPackage;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
