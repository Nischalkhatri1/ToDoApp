
# TODO.
---

<p align="center">
  Welcome To my todo app
</p>



---


## Features
Tabswap          |  Register                      | Login            |  AddTaskstodo
:----------------------------:|:--------------------------------------:|:----------------------:|:-----------------
<img src = "https://imgur.com/zekHDBX.gif" width="200" height="360">  |  <img src = "https://imgur.com/7Xg3fOz.gif" width="200" height="360">        |  <img src = "https://imgur.com/D0qel0W.gif" width="200" height="360">  | <img src = "https://imgur.com/BYoCNeH.gif" width="200" height="360">
#
calenderview          |  update tasks                   | delete tasks              |  NavigationMenu
:----------------------------:|:--------------------------------------:|:----------------------:|:-----------------
 <img src = "https://imgur.com/EDAjrQc.gif" width="200" height="360"> |   <img src = "https://imgur.com/U6MQUA8.gif" width="200" height="360">        | <img src = "https://imgur.com/s5sbVVk.gif" width="200" height="360">   | <img src = "https://imgur.com/JJfkzmR.gif" width="200" height="360">



---


---

## How to use app (Installing and using the App)
#### ***1 Register/ Login:*** : Fill the Required Information and Sign Up.
#### ***2 Login:*** : After Signing Up Login with the same credentials.
##### ***3 Todo List:*** : Click on the floating Add icon and create the Todo List

#### ***4 You can update/edit the todolists tasks:*** : Click on the Todo Item and edit it.
#### ***5 Deleting the todo items and list:***. : You can delete Todolist by swipping left or right.
#### ***6 clicking on more on menu option you can see more :***.


---

### Design Architecture of app
# MODEL
* `adapter`  consists of recyclerviews adapters.<br>
-`TasksAdapter` <br>
-`TabsAdapter` <br>



* `Database` consists of dao(class for room database) ,UserAuthentication,db..<br>
-`DataAccessObject`<br>
-`AppDatabase`<br>
-`Dateconvert`<br>
-`UserDatabase`<br>


-`TodoListsTtasks`<br>


# VIEW
* `Activity`  consists of main activity<br>
-`MainActivity` <br>
-`RegsterActivity` <br>
-`LoginActivity` <br>
-`TabsActivity` <br>
* `Fragments` consists of all fragments<br>
-`AboutFragments`<br>
-`ContactFragments`<br>


# ViewModel
* `MainActivityVieModel`  <br>


---

# Branches ScreenShots


---

<p align="center">
<img src="https://imgur.com/AvdtCvN.png" alt="" width="700" height="720">
</p>

---

## Documentation (Model–view–viewmodel architecture in a nutshell) 
Model–view–viewmodel (MVVM) is a software architectural pattern that facilitates the separation of the development of the graphical user interface (the view) be it via a markup language or GUI code from the development of the business logic or back-end logic (the model) so that the view is not dependent on any specific model platform. The view model of MVVM is a value converter,meaning the view model is responsible for exposing (converting) the data objects from the model in such a way that objects are easily managed and presented. In this respect, the view model is more model than view, and handles most if not all of the view's display logic.The view model may implement a mediator pattern, organizing access to the back-end logic around the set of use cases supported by the view.
#
![](https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/img/a7da8f5ea91bac52.png)

---

# `References`
### `Resources used to create this App`
#### List of all modules , libraries & Repo-references to create this App:

1. Room persistance library: [https://developer.android.com/topic/libraries/architecture/room]
2. Paint class holds the style and color information about how to draw geometries, text and bitmaps.: [https://developer.android.com/reference/android/graphics/Paint]
3. LayoutInflater: It Instantiates a layout XML file into its corresponding View objects[https://developer.android.com/reference/android/view/LayoutInflater]
5. Handling Lifecycles with Lifecycle-Aware Components: [https://developer.android.com/topic/libraries/architecture/lifecycle]
6. Navigation Components: [https://developer.android.com/guide/navigation/navigation-getting-started]
10. TypeConverter: [https://developer.android.com/reference/android/arch/persistence/room/TypeConverter]
11. android.widget:[https://developer.android.com/reference/android/widget/package-summary]
12. Creating Task Room: [https://github.com/ebbi/TaskRoom]
13. Creating Task Fragment:[https://github.com/ebbi/TaskFragment]
14. TodoViewModel:[https://github.com/ebbi/TodoViewModel]
16. Todo app Model View ViewModel architecture:[https://developer.android.com/s/results?q=todoviewmodel]

---
