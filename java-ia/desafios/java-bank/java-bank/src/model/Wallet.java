package model;

import lombok.Getter;
import lombok.ToString;


@ToString
public class Wallet {

    @Getter
    private final BankService bankService;
    
}
