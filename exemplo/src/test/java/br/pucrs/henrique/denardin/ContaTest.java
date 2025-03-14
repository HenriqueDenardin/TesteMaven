package br.pucrs.henrique.denardin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {
    @Test
 public void depositarTest() {
 Conta c = new Conta(); // Cria um objeto de teste Conta
 c.depositar(1000.00); // Deposita 1000 na conta
 assertEquals(1000.00, c.getSaldo()); // Verifica se o saldo da conta é 1000.00
 }
 @Test
 public void sacarTest(){
    Conta c = new Conta();
    c.depositar(2000);
    c.sacar(1000.00);
    assertEquals(1000.00, c.getSaldo());

 }

}
