# game-simulation-oa-swiggy
# Magical Arena

Welcome to the **Magical Arena project!** This is a simple Spring Boot application that simulates a battle between two combatants with different attributes.

## Algorithm

1. Each player is defined by health, strength, and attack power.
2. Players take turns attacking each other.
3. The player with the lower health attacks first.
4. Attack damage is calculated by rolling a six-sided die and multiplying the result by the attack power.
5. Defense is calculated by rolling a six-sided die and multiplying the result by the strength.
6. The actual damage taken by the defender is the attack damage minus the defense.
7. The game continues until one player's health reaches zero.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Maven**

## Running the Application

To run the application, use the following Maven command:

```
mvn spring-boot:run
```

The application will start on port `8081`.

## API Usage

### Endpoint

`POST /fight`

### Sample Request Body

```
[
  {
    "name": "Priya",
    "health": 50,
    "strength": 5,
    "attack": 10
  },
  {
    "name": "Kriti",
    "health": 100,
    "strength": 10,
    "attack": 5
  }
]
```

### Sample Curl Call

Save the request body in a file named `combatants.json` and use the following command to make the API call:

```
--header 'Content-Type: application/json' \
--header 'Cookie: device=desktop; platform=Desktop; device=desktop; platform=Desktop' \
--data '[
  {
    "name": "Priya",
    "health": 50,
    "strength": 5,
    "attack": 10
  },
  {
    "name": "Kriti",
    "health": 100,
    "strength": 10,
    "attack": 5
  }
]'

```

### Sample Response

The response will be a simple message indicating the winner, for example:

```
"Kriti  wins....yeeeeee!"
```
