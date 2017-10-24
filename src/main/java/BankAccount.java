import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * Specifies the type of bank account.
     */
    public enum BankAccountType {

        /**
         * A checking account.
         */
        CHECKINGS,

        /**
         * A savings account.
         */
        SAVINGS,

        /**
         * A student account.
         */
        STUDENT,

        /**
         * A workplace account.
         */
        WORKPLACE
    }

    /**
     * The number of the account.
     */
    private int accountNumber;

    /**
     * The type of bank account.
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public BankAccountType accountType;

    /**
     * The amount of money in the account.
     */
    private double accountBalance;

    /**
     * The name of the owner.
     */
    private String ownerName;

    /**
     * The interest rate.
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public double interestRate;

    /**
     * The amount of interest earned.
     */
    private double interestEarned;

    /**
     * Creates a new bank account with a given owner name and bank account type.
     * @param name The name of the owner.
     * @param accountCategory The type of account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        /*
         * Implement this function
         */
    }


    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @return accountBalance;
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param newBalance the new balance of the account.
     */
    public void setAccountBalance(final double newBalance) {
        this.accountBalance = newBalance;
    }

    /**
     *
     * @return ownerName.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param name The new name for the owner of the account.
     */
    public void setOwnerName(final String name) {
        this.ownerName = name;
    }

    /**
     *
     * @return interestEarned.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Set the interested earned.
     * @param newInterest the new interest.
     */
    public void setInterestEarned(final double newInterest) {
        this.interestEarned = newInterest;
    }
}