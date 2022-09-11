package com.codestates.seb.lol_program;

public class LOL_Program {
  public static void main(String[] args) {
    //TODO:
    LoL_char user = new LoL_char();
    System.out.println("자신의 유닛 정보를 입력해주세요.");
   int[] my_data = user.user_info_int(user.user_create());
    System.out.println("상대 유닛 정보를 입력해주세요.");
    LoL_char enemy = new LoL_char();
    int[] enemy_data = enemy.user_info_int(enemy.user_create());
    user.attack(my_data,enemy_data);

  }

  }
