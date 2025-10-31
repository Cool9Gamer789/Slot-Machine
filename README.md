# 🎰 Slot Machine Game (Java 8 Console Edition)

A simple **console-based slot machine game** written in **Java 8**!
Players start with a $50 balance and can place bets to spin the slot reels.
If the symbols match, the player wins a payout based on the symbol type — otherwise, they lose their bet.

---

## 🧩 How It Works

1. **Starting Balance:**
   You begin with **$50**.

2. **Placing a Bet:**

   * Enter any **positive number** as your bet.
   * You **cannot bet more than your current balance**.
   * Invalid bets (like negative numbers or zero) are rejected.

3. **Spinning the Reels:**
   The slot machine randomly picks **3 symbols** from the list:

   * 😁 (Smile)
   * 🍎 (Apple)
   * 🍍 (Pineapple)
   * 🌽 (Corn)
   * 🍰 (Cake)

4. **Winning Conditions:**
   You win if **all three symbols match**.
   Each symbol has a **different payout multiplier**.

---

## 💰 Payout Table

| Symbol | Description | Multiplier | Example (Bet = $10) |
| :----: | ----------- | ---------- | ------------------- |
|   😁   | Smile       | ×3         | Win $30             |
|   🍎   | Apple       | ×4         | Win $40             |
|   🍍   | Pineapple   | ×5         | Win $50             |
|   🌽   | Corn        | ×10        | Win $100            |
|   🍰   | Cake        | ×20        | Win $200            |

* If no symbols match, you lose your bet.
* The payout is **added to your balance**, and you can continue playing until your balance reaches $0.

---

## 🕹️ Example Gameplay

```
*************************
SLOT MACHINE
Symbols: 😁 🍎 🍍 🌽 🍰
*************************
Current balance: $50
Enter a bet amount: 10
Spinning...
🍎 | 🍎 | 🍎
You won $40
Current balance: $80
```

---

## 🧠 Features

* Built with **Java 8**
* Randomized spin results using Java’s `Random` class
* Input validation for bet amounts
* Simple console UI with emojis
* Progressive balance system
* Multiple symbol types and tiered payouts

---

## ⚙️ How to Run

1. Copy the code into a file named `Main.java`.
2. Compile the program using **Java 8**:

   ```bash
   javac Main.java
   ```
3. Run it:

   ```bash
   java Main
   ```

---
Enjoy your spins — and may the 🍰 be with you! 🎰
---
