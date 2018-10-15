/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaaticketsapplication;

/**
 *
 * @author grahamfarrell
 * @author richard schmidt de almeida
 * @author boris figeczky
 * 
 */
public class Tickets {

    String name, email, action, ticketType;
    int numAdultFootballTickets, numChildFootballTickets, numAdultHurlingTickets, numChildHurlingTickets;
    int adultTicketPrice, childTicketPrice;
    String ticketDetails;

    public Tickets(String name, String email, String action, String ticketType, int numAdultFootballTickets, int numChildFootballTickets, int adultTicketPrice, int childTicketPrice, String ticketDetails) {
        
        this.name = name;
        this.email = email;
        this.action = action;
        this.ticketType = ticketType;
        this.numAdultFootballTickets = numAdultFootballTickets;
        this.numChildFootballTickets = numChildFootballTickets;
        this.adultTicketPrice = adultTicketPrice;
        this.childTicketPrice = childTicketPrice;
        this.ticketDetails = ticketDetails;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getNumAdultFootballTickets() {
        return numAdultFootballTickets;
    }

    public void setNumAdultFootballTickets(int numAdultFootballTickets) {
        this.numAdultFootballTickets = numAdultFootballTickets;
    }

    public int getNumChildFootballTickets() {
        return numChildFootballTickets;
    }

    public void setNumChildFootballTickets(int numChildFootballTickets) {
        this.numChildFootballTickets = numChildFootballTickets;
    }

    public int getNumAdultHurlingTickets() {
        return numAdultHurlingTickets;
    }

    public void setNumAdultHurlingTickets(int numAdultHurlingTickets) {
        this.numAdultHurlingTickets = numAdultHurlingTickets;
    }

    public int getNumChildHurlingTickets() {
        return numChildHurlingTickets;
    }

    public void setNumChildHurlingTickets(int numChildHurlingTickets) {
        this.numChildHurlingTickets = numChildHurlingTickets;
    }

    public int getAdultTicketPrice() {
        return adultTicketPrice;
    }

    public void setAdultTicketPrice(int adultTicketPrice) {
        this.adultTicketPrice = adultTicketPrice;
    }

    public int getChildTicketPrice() {
        return childTicketPrice;
    }

    public void setChildTicketPrice(int childTicketPrice) {
        this.childTicketPrice = childTicketPrice;
    }

    public String getTicketDetails() {
        return ticketDetails;
    }

    public void setTicketDetails(String ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

}