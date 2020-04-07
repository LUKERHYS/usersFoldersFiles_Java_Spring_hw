package com.codeclan.example.FoldersFilesUsers_hw.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private ArrayList<String> extension;

    @Column(name = "size")
    private int size;

    @ManyToOne
    @JoinColumn(name = "folder_id")
    private Folder folder;

    public File(){}

    public File(String name, int size, Folder folder){
        this.name = name;
        this.size = size;
        this.folder = folder;
        this.extension = new ArrayList<>();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getExtension() {
        return extension;
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
