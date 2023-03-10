# UI/UX with Compose

### Prerequisites for taking the course

- Have the latest stable Android Studio
- Install the "Jetbrains Academy (EduTools)" plugin and restart Android Studio

### Accessing the course materials

- Once you have cloned the repository, open the project in Android Studio and select "Course"
  preview from "Project" panel.
- Double click on a "task" from "lesson" to open the task related files in Android Studio.

### FAQ

#### How to verify the task implementation?

- You can run the app by selecting appropriate run configuration from the "Run" panel.
  Eg `lesson1-task1`
- From the "Task" panel, click on "Check" button to run pre-defined tests (if present) and verify
  your implementation.
- Run the tests manually from terminal
  ```
  # replace '*' with appropriate lesson and task numbers
  ./gradlew lesson*-task*-library:testDebugUnitTest
  
  # eg. for lesson 2, task 1
  ./gradlew lesson2-task1-library:testDebugUnitTest 
  ```

