javacOptions ++= Seq("-source", "11", "-target", "11")
scalacOptions ++= Seq("-explain", "-print-lines")
compileOrder := CompileOrder.Mixed
name := "dotty-stack-overflow-example"
version := "0.1"
scalaVersion := "3.0.2"
