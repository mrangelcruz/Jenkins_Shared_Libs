def call(Map config=[:], Closure body) {
    node {
        stage("check repo") {
            bat label: '', script: '''echo [INFO] --- CHECK REPO ---'''
        }
        stage("build") {
            bat label: '', script: '''echo [INFO] --- BUILD ---'''
        }
        stage("Deploy") {
            if (config.deploy) {
                bat label: '', script: '''echo [INFO] --- DEPLOY ---'''
            }
        }
        body()
    }
}
