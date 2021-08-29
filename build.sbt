import Dependencies._

name := "csvtojson"

version := "0.1"

scalaVersion := "2.13.6"

organization := "com.qbrainx"

organizationName := "QBrainX Inc."
organizationHomepage := Some(url("https://www.qbrainx.com/"))

startYear := Some(2021)
description := "A project to Convert Command Line  to JSON"

libraryDependencies ++= compileDependencies ++ testDependencies.map(_%Test)

