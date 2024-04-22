/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author DELL
 */
public class Endgame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("Black Panter grr","Ser el rey de todo wakanda","Garras de Vibranium");
        Villano galactus=new Villano("Galactus el devorador de mundos","Devorador mundos", "Silver Surfer");
        Avenger ironMan=new Avenger("Tony Stark","Filantropo, multimillonario, Genio, Playboy","Mark 42","Prime");
        Thanos thanos=new Thanos("Thanos","El titan loco","Ejercito Chitaury","Gemas del infinito");
    
    Personaje[] personajes = {blackPanter,galactus,ironMan,thanos};
    for(Personaje personaje:personajes){
        personaje.atacar();
    }
        
    ((Avenger)ironMan).reunirse();
    
    thanos.chasquearDedos();
    
    }
        
       
}
