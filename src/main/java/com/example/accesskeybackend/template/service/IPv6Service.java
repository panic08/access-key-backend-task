package com.example.accesskeybackend.template.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class IPv6Service {
    public boolean checkOnValide(String URI) throws IOException {
        Document doc = Jsoup.connect("https://ready.chair6.net/?url=" + URI).get();
        Elements links = doc.getElementsByClass("two columns");
        if (links.get(3).text().equals("PASS")){
            return true;
        }else {
            return false;
        }
    }
}
