package com.windhc.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

/**
 * @author HC
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("pdf to image");
        String pdfPath = "pdf文件路径";
        //根据pdf文件路径取得pdf文件
        File invoiceFile = new File(pdfPath);
        // 新建pdf文件的路径
        String path = "test";
        PDDocument doc = PDDocument.load(invoiceFile);
        PDFRenderer renderer = new PDFRenderer(doc);
        int pageCount = doc.getNumberOfPages();
        System.out.println("pageCount: " + pageCount);
        for (int i = 0; i < pageCount; i++) {
            // 第二个参数是设置缩放比(即像素)
            BufferedImage image = renderer.renderImage(i, 2.5f);
            ImageIO.write(image, "PNG", new File(path + LocalDate.now() + "-" + i + ".png"));
        }
    }
}
