ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"
val dependencies = Seq(

  "org.apache.logging.log4j"     % "log4j-api"            % "2.17.1",
  "org.apache.logging.log4j"     % "log4j-core"           % "2.17.1",
  "org.apache.logging.log4j"     % "log4j-slf4j-impl"     % "2.17.1",

  "org.apache.commons"           % "commons-lang3"        % "3.1",
  "org.apache.commons"           % "commons-exec"         % "1.3",
  "com.googlecode.json-simple"   % "json-simple"          % "1.1.1",
  "io.spray"                     %% "spray-json"          % "1.3.5",
  "commons-io"                   % "commons-io"           % "2.5",
  "org.apache.httpcomponents"    % "httpclient"           % "4.5.10",
  "com.fasterxml.jackson.module" %% "jackson-module-scala"% "2.13.2",
  "org.projectlombok"            % "lombok"               % "1.18.2",

  "org.mockito"                  % "mockito-all"          % "1.10.19"       % Test,
  "junit"                        % "junit"                % "4.12"          % Test
)
lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-poc1",
    libraryDependencies ++= dependencies
  )
