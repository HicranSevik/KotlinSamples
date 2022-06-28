# Class in Kotlin
- Classes in Kotlin are final by default. So other classes can not inherit from an final classes. Check `open` keyword later.
- A class can implement multiple interface.
- A class can inherit only from one abstract class.
- A class contains functions and variables, if it is not `empty class`.
- A class can have a primary constructor ond one and more secondary constructor.
- The default modifier of class/variable/function is `public`.
- The `init` block will execute immediately after the primary constructor. Initializer blocks effectively become part of the primary constructor. The constructor is the secondary constructor. Delegation to the primary constructor happens as the first statement of a secondary constructor, so the code in all initializer blocks is executed before the secondary constructor body.
- 