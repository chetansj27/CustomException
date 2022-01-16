# CustomException
In SpringBoot we have inbuilt exception handler. So whenever an exception occurs, a default response containing some information is returned. 
But the main problem with this information is that it is not sufficient for user to deal with the exception properly. 
To overcome this problem we can implement custom exception handler.

## Annotations Required:
### @ControllerAdvice:
This allows us to handle the exceptions globally.
### @ExceptionHandler:
This is used to handle the specific exceptions and sending the custom responses to the client.

## To create Custom Exception Handler:
- Create a new class for example CustomExceptionHandler and add @ControllerAdvice annotaion top of it.
- Create another class which extend Runtime Exception and generate constructor for it.
- Create another class with all field which we want to show in exception response.
- Create a method in CustomExceptionHandler and add @ExceptionHandler(value=Name of exception class).

Now we can use this Custom Exception Handler globally in our application.

### Output without Custom Exception Handler
![](https://github.com/csj5483/CustomException/blob/main/output/image1.png)
### Output with Custom Exception Handler
![](https://github.com/csj5483/CustomException/blob/main/output/image2.png)
