## Assignments for Java Boot Camp
* [Week 1 :: Design and Develop RESTful API with Spring Boot](https://github.com/up1/assignment-java-boot-camp/wiki/Week-01)

#How to run test


#Sequence Diagram for Shopping

```mermaid
sequenceDiagram
    actor User
    participant A as App
    participant P as Product
    participant B as Bucket
    participant M as Member
    participant PM as Payment
    participant S as Summary
    User->>+A: Search product name
    A->>+P: Get product lists
    P-->>-A: Return list of product
    A-->>-User: Show list of product
    User->>+A: Click product detail
    A->>+P: Get product detail
    P->>A: Return Product detail
    A->>User: Show Product detail
    User->>A: Add product to bucket
    A->>+B: Add item to bucket
    B-->>-A: Return items list in bucket
    User->>A: Remove product to bucket
    A->>+B: Remove item to bucket
    B-->>-A: Return items list in bucket
    User->>A: Check out items
    A->>+M: Check User data
    alt is not member
        M-->>-A: Return Member not found
        A-->>User: Show register form
        User->>A: Fill Data to form
        A->>M: Save user data
        M-->>A: Return Member data
    else is member
        M-->>A: Return Member data
    end
    A->>PM: Get Payment Channel
    PM-->>A: Return payment Channel
    A-->>User: Show Payment Page
    User->>A: Fill data
    A->>PM: Check out
    PM-->>A: Return Summary
    A-->>User: Show Summary
```

#API Endpoint List
