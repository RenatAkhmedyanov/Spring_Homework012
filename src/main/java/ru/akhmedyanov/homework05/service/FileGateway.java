package ru.akhmedyanov.homework05.service;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.file.FileHeaders;
import org.springframework.messaging.handler.annotation.Header;

@MessagingGateway(defaultRequestChannel = "textInputChannel")
public interface FileGateway {
    void writeToFile(@Header(FileHeaders.FILENAME) String filename, String data);
}
