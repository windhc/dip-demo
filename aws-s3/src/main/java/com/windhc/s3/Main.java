package com.windhc.s3;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author HC
 */
public class Main {

    private static final String BUCKET_NAME = "dip.doc-classification.indico.pdf-normal";

    private static final AmazonS3 s3 = AmazonS3ClientBuilder.standard()
            .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
            .withRegion(Regions.US_EAST_1)
            .build();

    public static void main(String[] args) {
        uploadFile();
    }

    private static void uploadFile() {
        File file = createTestFile();
        System.out.format("Uploading %s to S3 bucket %s...\n", file.getPath(), BUCKET_NAME);
        try {
            s3.putObject(BUCKET_NAME, file.getName(), file);
            System.out.println("uploadFile Done!");
        } catch (AmazonServiceException e) {
            e.printStackTrace();
        }
    }

    private static File createTestFile() {
        String fileName = "test.txt";
        File file = new File(fileName);
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("123");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
