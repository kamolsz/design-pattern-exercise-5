package main;

import model.Auction;
import model.AuctionService;
import model.Customer;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Customer seller = new Customer("Jan Kowalski");
        Auction auction = new Auction(1,"Coffee",null,
                LocalDateTime.now().plusDays(2L),seller,0,null);

        AuctionService auctionService = AuctionService.getInstance();
        auctionService.bid(auction,new Customer("Anna Kowalik"),20);

        auctionService.bid(auction,new Customer("Krzysztof Adamowicz"),25);


        System.out.println("Auction with id: " + auction.getId()+ " finished. Highest bid: " + auction.getHighestBid() + " PLN.");
    }
}
