def call(Map config=[:]){
    sh "echo hello ${config.name} to the world of Jenkins as a ${config.post}"
}
