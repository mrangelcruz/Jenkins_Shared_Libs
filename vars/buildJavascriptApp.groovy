def call(Map config=[:], Closure body) {
    node {
        stage("Install") {
            bat label: '', script: '''npm install'''
        }
        stage("Test") {
            bat label: '', script: '''npm test'''
        }
        stage("Deploy") {
            if (config.deploy) {
                bat label: '', script: '''npm publish'''
            }
        }
        body()
    }
}
