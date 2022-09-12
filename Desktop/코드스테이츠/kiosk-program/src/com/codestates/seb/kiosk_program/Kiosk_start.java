package com.codestates.seb.kiosk_program;
import com.codestates.seb.kiosk_program.Kiosk_Program;


public class Kiosk_start {
    public static void main(String[] args) {
        //TODO:
        Kiosk_Program.input_print();
        int menu_cost = Kiosk_Program.count();
        Kiosk_Program.cost(menu_cost);
        Kiosk_Program.output_print(Kiosk_Program.menu_count * menu_cost);

    }
}
