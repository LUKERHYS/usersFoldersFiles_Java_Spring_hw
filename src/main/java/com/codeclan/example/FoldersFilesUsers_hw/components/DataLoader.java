package com.codeclan.example.FoldersFilesUsers_hw.components;

import com.codeclan.example.FoldersFilesUsers_hw.models.Folder;
import com.codeclan.example.FoldersFilesUsers_hw.models.User;
import com.codeclan.example.FoldersFilesUsers_hw.repositories.FileRepository;
import com.codeclan.example.FoldersFilesUsers_hw.repositories.FolderRepository;
import com.codeclan.example.FoldersFilesUsers_hw.repositories.UserRepository;
import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        userRepository.deleteAll();
        folderRepository.deleteAll();
        fileRepository.deleteAll();

        User luke = new User("Luke Melvin");
        userRepository.save(luke);

        Folder photos = new Folder("Photos", luke);

    }

}
