def call(){
  sh "which trivy || echo 'Trivy not found in PATH'"
  sh "trivy --version || echo 'No version found'"
  sh "trivy fs ."
}
