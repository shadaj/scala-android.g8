A giter8 template for creating Android-Eclipse-Scala projects
=============================================================

# Prerequisites
* Eclipse (I use Juno, but let me know if you can get the project working on other versions)
* Sbt (0.12) http://www.scala-sbt.org/release/docs/Getting-Started/Setup#installing-sbt
* Giter8 (0.5.3) https://github.com/n8han/giter8#installation
* Android plugin for Eclipse http://developer.android.com/sdk/installing/installing-adt.html
* Scala Ide Plugin (2.1.0 m3) http://scala-ide.org/download/milestone.html
* Android Proguard Scala https://github.com/banshee/AndroidProguardScala#using-the-plugin

# Setup
* Use the template to create a new project (g8 shadaj/scala-android)
* Import the project into Eclipse
* Clean the project (this generates the neccesary files)
* Launch the emulator

Now you can run!

# Things to remember
* NEVER run sbt eclipse, it will mess up the project
* Make sure all the widgets are lazy, as they first need to be initialized