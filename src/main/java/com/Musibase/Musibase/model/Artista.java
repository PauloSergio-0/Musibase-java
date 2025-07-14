package com.Musibase.Musibase.model;

import jakarta.persistence.*;


@Entity
@Table(name = "artistas ")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Nome_Artista")
    private String nome;
    @Column(name = "Tipo_Artista")
    private String tipoArtista;

}
