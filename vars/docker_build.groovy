// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
    sh "pwd"
    sh "ls -l"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
