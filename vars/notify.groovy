import org.example.Constants
def call(Map config=[:]) {
    if (config.type == "slack") {
        echo Constants.SLACK_MESSAGE
        echo config.message
        echo 'Branch:'
        echo config.BRANCH
    } else {
        echo Constants.EMAIL_MESSAGE
        echo config.message
    }
}
