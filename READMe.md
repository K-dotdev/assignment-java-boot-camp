# Assignments for Java Boot Camp
* [Week 1 :: Design and Develop RESTful API with Spring Boot](https://github.com/up1/assignment-java-boot-camp/wiki/Week-01)

## API Endpoint List (In progress)
|Endpoint|Method|Description|Example JSON valid|Example JSON invalid|
|-|-|-|-|-|
|[/member/register](https://github.com/K-dotdev/assignment-java-boot-camp/wiki/API-Endpoint#sign-up)|POST|Register Member|||
|/member/login|POST|Login member|||
|/product/list|GET|Get product list|||
|/product/id|GET|Get product detail|||
|/bucket/add|POST|Create product bucket|||
|/bucket/id|GET|Get product in bucket|||
|/bucket/id|PUT|Add product to bucket|||
|/bucket/id|DELETE|Delete product in bucket|||
|/payment/channel|GET|Get payment channel in list|||
|/payment/register|GET|Add payment by bucket|||
|/payment/add|GET|Add payment by bucket|||


## Sequence Diagram for Shopping

```mermaid
sequenceDiagram
    actor User
    participant A as App
    participant P as Product
    participant B as Bucket
    participant M as Member
    participant PM as Payment
    User->>+A: Search product name
    A->>+P: Get product lists
    P-->>-A: Return list of product
    A-->>-User: Show list of product
    User->>A: Click product detail
    activate A
    A->>P: Get product detail
    activate P
    P->>A: Return Product detail
    deactivate P
    A-->>User: Show Product detail
    deactivate A
    User->>A: Add product to bucket
    activate A
    A->>+B: Add item to bucket
    B-->>-A: Return items list in bucket
    A-->>User: Show items list in bucket
    User->>A: Remove product to bucket
    A->>+B: Remove item to bucket
    B-->>-A: Return items list in bucket
    A-->>User: Show items list in bucket
    deactivate A
    
    User->>A: Check out items
    activate A
    A->>+M: Check User data
    alt is not member
        M-->>-A: Return Member not found
        A-->>User: Show register form
        User->>A: Fill Data to form
        A->>M: Save user data
        activate M
        M-->>A: Return Member data
        deactivate M
    else is member
        M-->>A: Return Member data
    end
    A-->>User: Show Member data
    deactivate A
    User->>A: Go to payment page
    activate A
    A->>PM: Get Payment Channel
    activate PM
    PM-->>A: Return payment Channel
    deactivate PM
    A-->>User: Show Payment Page
    deactivate A
    User->>A: Fill data and check out
    activate A
    A->>PM: Check out
    activate PM
    PM-->>A: Return Summary
    deactivate PM
    A-->>User: Show Summary
    deactivate A
```
