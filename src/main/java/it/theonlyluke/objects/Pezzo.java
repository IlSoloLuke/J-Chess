package it.theonlyluke.objects;

import it.theonlyluke.builders.ImageIconBuilder;
import it.theonlyluke.enums.Colore;
import it.theonlyluke.enums.pezzi.ColorePezzi;
import it.theonlyluke.enums.pezzi.Pezzi;
import it.theonlyluke.utils.ScreenUtils;

import javax.swing.*;

public class Pezzo {
    public final String nome;
    public final ImageIcon icon;
    public final Pezzi pezzo;
    public final ColorePezzi colore;

    public Pezzo(Pezzi pezzo, ColorePezzi colore) {
        String stringaColore = colore.nome + pezzo.sesso.articolo;
        this.nome = pezzo.nome + " " + stringaColore;
        this.icon = ImageIconBuilder.builderFromResource("/images/" + pezzo.id + stringaColore + ".png")
                .size(ScreenUtils.SQUARE_SIZE, ScreenUtils.SQUARE_SIZE)
                .build();
        this.pezzo = pezzo;
        this.colore = colore;
    }
}
