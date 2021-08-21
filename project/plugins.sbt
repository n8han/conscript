addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.9")
addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.10.0")
addSbtPlugin("com.github.xuwei-k" % "sbt-proguard" % "0.5.1")
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
