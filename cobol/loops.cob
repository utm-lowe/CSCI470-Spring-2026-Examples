       IDENTIFICATION DIVISION.
           PROGRAM-ID. LOOPS.
    
       PROCEDURE DIVISION.
           PERFORM DO-SOMETHING THRU ANOTHER-THING 5 TIMES.
           DISPLAY "DONE".
           STOP RUN.

       DO-SOMETHING.
           DISPLAY "Hey, I'm working here.".
           DISPLAY "Watch It!".
        
       DO-SOMETHING-ELSE.
           DISPLAY "Something Else".           

       ANOTHER-THING.
           DISPLAY "BUT WAIT, THERE'S MORE".