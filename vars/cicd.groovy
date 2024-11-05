
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
  sh "scp /var/lib/Jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
