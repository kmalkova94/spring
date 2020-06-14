package org.example.bookshop.enums;

public enum Genre {
    COMEDY ("Comedy"),
    TRAGEDY ("Tragedy"),
    BIOGRAPHY ("Biography"),
    FOLKLORE ("Folklore"),
    HISTORICAL ("Historical"),
    LYRIC ("Lyric"),
    ROMANCE ("Romance"),
    NARRATIVE ("Narrative"),
    PERIODICALS ("Periodicals"),
    DRAMATIC ("Dramatic");

    private String genreName;
    Genre (String genreName) {
        this.genreName=genreName;
    }

    public String getGenreName() {
        return genreName;
    }

    @Override
    public String toString() {
        return genreName;
    }
}
