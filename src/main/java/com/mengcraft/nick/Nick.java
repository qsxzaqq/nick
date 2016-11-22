package com.mengcraft.nick;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created on 16-5-6.
 */
@Entity
public class Nick {

    @Id
    private UUID id;

    @Column(length = 16)
    private String name;

    @Column(unique = true)
    private String nick;

    @Column(length = 2)
    private String color;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getColor() {
        return color;
    }

    public boolean hasColor() {
        return getColor() != null;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public boolean hasNick() {
        return getNick() != null;
    }

}
