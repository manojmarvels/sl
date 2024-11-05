
def download(repo)
{
  git "https://github.com/manojmarvels/${repo}.git"
}
def build()
{
  sh 'mvn package'
}
def deploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def test(jobame)
{
  sh "java -jar /var/lib/jenkins/${jobame}/testing.jar"
}
