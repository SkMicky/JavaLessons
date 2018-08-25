package entity;

import java.util.Date;

public class Terminal {
    private long id;
    private TerminalAdress terminalAdress;
    private String nameOfService;
    private Client client;
    private Date dateOfMadenService;
    private long amount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TerminalAdress getTerminalAdress() {
        return terminalAdress;
    }

    public void setAdress(TerminalAdress adress) {
        this.terminalAdress = adress;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateOfMadenService() {
        return dateOfMadenService;
    }

    public void setDateOfMadenService(Date dateOfMadenService) {
        this.dateOfMadenService = dateOfMadenService;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "entity.Terminal{" +
                "id=" + id +
                ", adress=" + terminalAdress +
                ", nameOfService='" + nameOfService + '\'' +
                ", client=" + client +
                ", dateOfMadenService=" + dateOfMadenService +
                ", amount=" + amount +
                '}';
    }
}
