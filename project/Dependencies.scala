import sbt._
object Dependencies{
  lazy val sprayJsonversion = "1.3.6"
  lazy val sprayJson = "io.spray" %% "spray-json" % sprayJsonversion
  def compileDependencies: Seq[ModuleID] = Seq(sprayJson)
  def testDependencies: Seq[ModuleID] = Seq.empty

}
