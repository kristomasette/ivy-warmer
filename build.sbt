
resolvers += "spray" at "http://repo.spray.io/"
resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Softprops Maven" at "http://dl.bintray.com/content/softprops/maven"
resolvers += "Spy" at "http://files.couchbase.com/maven2/"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-Xmax-classfile-name",
  "242",
  "-unchecked",
  "-deprecation",
  "-feature",
  "-language:existentials",
  "-language:postfixOps",
  "-language:reflectiveCalls")

libraryDependencies ++= {
  val akkaV = "2.3.11"
  val sprayV = "1.3.3"
  val scalatestV = "2.2.4"
  val scalamockV = "3.2.2"
  Seq(
    "io.spray"                  %%  "spray-can"                   % sprayV,
    "io.spray"                  %%  "spray-routing"               % sprayV,
    "io.spray"                  %%  "spray-json"                  % "1.2.6",
    "io.spray"                  %%  "spray-client"                % sprayV,
    "com.netaporter"            %% "pre-canned"                   % "0.0.6" % "test",
    "com.typesafe.akka"         %%  "akka-actor"                  % akkaV,
    "com.typesafe.akka"         %%  "akka-stream-experimental"    % "2.0.3",
    "com.typesafe.akka"         %%  "akka-slf4j"                  % akkaV,
    "org.slf4j"                 %   "slf4j-api"                   % "1.7.7",
    "ch.qos.logback"            %   "logback-classic"             % "1.0.7",
    "org.codehaus.janino"       %   "janino"                      % "2.6.1",
    "io.spray"                  %%  "spray-testkit"               % sprayV     % "test",
    "org.scalatest"             %%  "scalatest"                   % scalatestV % "test",
    "org.scalamock"             %%  "scalamock-scalatest-support" % scalamockV % "test",
    "org.mockito"               %   "mockito-all"                 % "1.9.0" % "test",
    "org.scalaj"                %%  "scalaj-http"                 % "1.1.5",
    "joda-time"                 %   "joda-time"                   % "2.8.1",
    "org.json4s"                %%  "json4s-jackson"              % "3.2.11",
    "org.json4s"                %%  "json4s-ext"                  % "3.2.11",
    "org.scalaz"                %%  "scalaz-core"                 % "7.1.3",
    "com.bionicspirit"          %%  "shade"                       % "1.7.2",
    "org.scala-lang.modules"    %%  "scala-pickling"              % "0.10.1"

  )
}

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")




