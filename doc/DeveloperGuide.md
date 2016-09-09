# Developer Guide

* [Setting Up](#setting-up)
* [Design](#design)
* [Testing](#testing)
* [Appendix A: User Stories](#appendix-a--user-stories)
* [Appendix B: Use Cases](#appendix-b--use-cases)
* [Appendix C: Non Functional Requirements](#appendix-c--non-functional-requirements)
* [Appendix D: Gloassary](#appendix-d--glossary)

## Setting up

#### Prerequisites

1. **JDK 8** or later 
2. **Eclipse** IDE
3. **e(fx)clipse** plugin for Eclipse (Do the steps 2 onwards given in 
   [this page](http://www.eclipse.org/efxclipse/install.html#for-the-ambitious))


#### Importing the project into Eclipse

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse (Note: Ensure you have installed the **e(fx)clipse plugin** as given in the prerequisites above)
2. Click `File` > `Import`
3. Click `General` > `Existing Projects into Workspace` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

## Design
<img src="images/mainClassDiagram.png"/>

## Testing

* In Eclipse, right-click on the `test/java` folder and choose `Run as` > `JUnit Test`

## Appendix A : User Stories

Priorities: High (must have) - `* * *`, Medium (nice to have)  - `* *`,  Low (unlikely to have) - `*`
  As a busy businessman, I can change my tags, so that they stay updated. 
  As a student, I can mass add contacts, so that I don't have to manually type every single one of my contacts.
  As a student, I can see a list of my contacts sorted according to how frequently I search for them, so that it is more convenient for me to find people I frequently connect with.



Priority | As a ... | I want to ... | So that I can...
-------- | :-------- | :--------- | :-----------
`* * *` | new user | see usage instructions | refer to instructions when I forget how to use the App
`* * *` | user | add a new person | 
`* * *` | user | delete a person | can remove entries that I no longer need
`* * *` | user | find a person by name | locate details of persons without having to go through the entire list
`* *` | user | see a list of my contacts sorted according to how frequently I search for them | it is more convenient for me to find people I frequently connect with.
`* *` | user | mass add contacts | don't have to manually type every single one of my contacts.
`* *` | user | change my tags | they stay updated.
`* *` | user | hide [private contact details](#private-contact-detail) by default | to minimize chance of someone else seeing them by accident
`*` | user with many persons in the address book | sort persons by name | locate a person easily


## Appendix B : Use Cases

(For all use cases below, the **System** is the `AddressBook` and the **Actor** is the `user`, unless specified otherwise)

1 
  System: Edit existing tag
  Use case: UC01
  Actor: User
  MSS: 
      1. User chooses to edit tag of existing person.
      2. System requests for which tag of person to change.
      3. User selects tag to be changed.
      4. System requests for details of the changed tag.
      5. User inputs details for changed tag.
      6. System requests for confirmation.
      7. User confirms.
      8. System changes tag and display new information of user.
      		Use case ends.
  Extensions:
  	  3a. System detects invalid tag selected.
  	  	3a1. System requests for valid data.
  	  	3a2. User selects valid data.
  	  Steps 3a1-3a2 are repeated until tag selected is valid.
  	  Use case resumes from step 4.
  	  
  	  *a. At any time user chooses to cancel edit
  	  	  Use case ends.

#### Use case: Delete person

**MSS**

1. User requests to list persons
2. AddressBook shows a list of persons
3. User requests to delete a specific person in the list
4. AddressBook deletes the person <br>
Use case ends.



**Extensions**

2a. The list is empty

> Use case ends

3a. The given index is invalid

> 3a1. AddressBook shows an error message <br>
  Use case resumes at step 2

## Appendix C : Non Functional Requirements

1. Should work on any [mainstream OS](#mainstream-os) as long as it has Java 8 or higher installed.
2. Should be able to hold up to 1000 persons.
3. Should come with automated unit tests and open source code.
4. Should favor DOS style commands over Unix-style commands.
5. Should be able to work on any OS.
6. Users should be able to access their own contacts.
7. Search times for contacts or contacts listing should be quick.

## Appendix D : Glossary

##### Mainstream OS

> Windows, Linux, Unix, OS-X

##### Private contact detail

> A contact detail that is not meant to be shared with others

