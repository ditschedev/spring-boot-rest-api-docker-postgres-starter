## expection/advice
Place you exception handling advices here. An example for a `UserNotFoundException`:

```java
/**
 * Handles the case when the requested user cannot be found
 * in the database.
 *
 * @author Tobias Dittmann
 */
@ControllerAdvice
public class UserNotFoundAdvice {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    public ResponseEntity<?> handleUserNotFound(UserNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false, ex.getMessage());
    }

}
```