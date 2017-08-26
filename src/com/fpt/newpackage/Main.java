/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.newpackage;

/**
 *
 * @author Ducdongpro
 */
public class Main {

    public static void main(String[] args) {
        String names = "Nam, Trường, Dũng, Danh, Tùng, Khánh, Linh, Đông, Chiến, Trường, Ngọc, Toàn, Toản";
        // Cắt chuỗi 
        String[] array = names.split(",");
        // In ra chuỗi
        for (int j = 0; j < array.length; j++) {
            System.out.println((j + 1) + ". " + array[j].trim());
            System.out.println(" git");
        }
        Student stud = new Student();
        
    }
}
