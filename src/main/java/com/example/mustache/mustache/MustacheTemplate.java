package com.example.mustache.mustache;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MustacheTemplate {

    private String basePath = "src/main/resources/templates";

    public void compileAndSsaveTemplate(String templatePath, String targetFilePath, String targetFileName) throws IOException {
        MustacheFactory mustacheFactory = new DefaultMustacheFactory();
        Mustache mustache = mustacheFactory.compile(basePath + templatePath);

        File file = new File(targetFilePath.concat("\\").concat(targetFileName));

        createDirectoriesIfNeeded(targetFilePath, targetFileName);

        FileWriter writer = new FileWriter(file);


        mustache.execute(writer, this).flush();

        writer.close();
    }

    public void createDirectoriesIfNeeded(String filePath, String fileName){
        File path = new File(filePath);
        File file = new File(filePath.concat("\\").concat(fileName));

        if (!path.exists()) {
            path.mkdirs();
        }

        if (file.exists()) {
            file.delete();
        }
    }

}

