- Do the following operations inside the [PalindromeChecker](course://lesson6/task1/library/src/main/java/in/obvious/course/compose/library/MainActivity.kt) composable
1. When the initial composition happens request focus on the `OutlinedTextField` and show the keyboard.
2. On the click of the `Check button` take the input from the `OutlinedTextField` and show a toast if the text
is a palindrome or not
3. The palindrome check should happen inside the `onTimerEnd` callback of the `timer` suspend function provided
4. While the check is happening hide the `Check button` and show the `CircularProgressIndicator`
5. On pausing the activity clear the inputs in `OutlinedTextField` if there are any.