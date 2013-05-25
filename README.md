A giter8 template for creating Android-Eclipse-Scala projects
=============================================================

BASICS
------
# Prerequisites
* Eclipse (I use Juno, but let me know if you can get the project working on other versions)
* [Sbt (0.12)](http://www.scala-sbt.org/release/docs/Getting-Started/Setup#installing-sbt)
* [Giter8 (0.5.3)](https://github.com/n8han/giter8#installation)
* [Android plugin for Eclipse](http://developer.android.com/sdk/installing/installing-adt.html)
* [Scala Ide Plugin (3.0 Release)](http://scala-ide.org/download/current.html)
* [Android Proguard Scala](https://github.com/banshee/AndroidProguardScala#using-the-plugin)

# Setup
* Use the template to create a new project `g8 shadaj/scala-android`
* Import the project into Eclipse
* Clean the project (this generates the neccesary files)
* Launch the emulator

Now you can run!

# Things to remember
* You will get errors when running g8. This is caused by the *.png. Ignoring it doesn't seem to be a problem, but if you can fix it, make a pull request.
* NEVER run sbt eclipse, it will mess up the project.
* Make sure all the widgets are lazy, as they first need to be initialized.

BUILDING WITH SBT
-----------------
* Launch sbt
* Run `android:package-debug`
* To start an emulator use `android:emulator-start <your emulator name>`
* To run on the emulator use `android:start-emulator`