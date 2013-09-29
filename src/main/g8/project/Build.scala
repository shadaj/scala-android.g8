import sbt._

import Keys._
import AndroidKeys._

object General {
  val settings = Defaults.defaultSettings ++ Seq (
    name := "$name;format="camel"$",
    version := "$version$",
    versionCode := 0,
    scalaVersion := "2.10.0",
    platformName in Android := "android-4"
  )

  val proguardSettings = Seq (
    useProguard in Android := true
  )

  lazy val fullAndroidSettings =
    General.settings ++
    AndroidProject.androidSettings ++
    TypedResources.settings ++
    proguardSettings ++
    AndroidManifestGenerator.settings ++
    AndroidMarketPublish.settings ++ Seq (
      keyalias in Android := "change-me",
      manifestPath in Android := Seq(file("AndroidManifest.xml")),
      mainResPath in Android := file("res"),
      mainAssetsPath in Android := file("assets")
    )
}

object AndroidBuild extends Build {
  lazy val main = Project (
    "$name;format="camel"$",
    file("."),
    settings = General.fullAndroidSettings
  )
}