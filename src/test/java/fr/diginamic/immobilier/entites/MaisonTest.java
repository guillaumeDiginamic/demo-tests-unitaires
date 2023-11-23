package fr.diginamic.immobilier.entites;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class MaisonTest extends TestCase {

    @Test
    public void testNbPieces() {
        System.out.println("testNbPieces: test nbPieces + ajouterPiece");
        Maison maison= new Maison();

        // test aucune piece
        assertEquals(0,maison.nbPieces());

        //test 1 piece
        maison.ajouterPiece(new Chambre(2,14));
        assertEquals(1,maison.nbPieces());
    }

    @Test
    public void testSuperficieEtage() {
        System.out.println("testSuperficieEtage");
        Maison maison= new Maison();

        // test aucune piece
        assertEquals(0.0,maison.superficieEtage(1));

        //ajout 2 pieces
        maison.ajouterPiece(new Chambre(1,14));
        maison.ajouterPiece(new Cuisine(0,15));

        //test 1 piece etage 1 superficie 14
        assertEquals(14.0,maison.superficieEtage(1));

        //test 1 piece etage 0 superficie 15
        assertEquals(15.0,maison.superficieEtage(0));

     }

    @Test
    public void testSuperficieTypePiece() {
        System.out.println("testSuperficieTypePiece");
        Maison maison= new Maison();

        // test aucune piece
        assertEquals(0.0,maison.superficieTypePiece("Cuisine"));

        //ajout 2 pieces
        maison.ajouterPiece(new Chambre(1,14));
        maison.ajouterPiece(new Cuisine(0,15));

        //test 1 piece type Chambre
        assertEquals(14.0,maison.superficieTypePiece("Chambre"));

        //test 1 piece type Cuisine
        assertEquals(15.0,maison.superficieTypePiece("Cuisine"));

    }

    @Test
    public void testCalculerSurface() {
        System.out.println("testCalculerSurface");
        Maison maison= new Maison();

        // test aucune piece
        assertEquals(0.0,maison.calculerSurface());

        //ajout 2 pieces
        maison.ajouterPiece(new Chambre(1,14));
        maison.ajouterPiece(new Cuisine(0,15));

        //test 2 pieces superficie 29
        assertEquals(29.0,maison.calculerSurface());
    }

    public void testGetPieces() {
        System.out.println("testGetPieces");
        Maison maison= new Maison();

        // test aucune piece
        assertEquals(0,maison.getPieces().length);

        //ajout 2 pieces
        maison.ajouterPiece(new Chambre(1,14));
        maison.ajouterPiece(new Cuisine(0,15));

        //test 2 pieces
        assertEquals(2,maison.getPieces().length);


    }
}