/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ljones
 */
class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);

    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
