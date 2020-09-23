node {
    echo 'Gathering code from version control'
    git branch: '${branch}', url: 'https://github.com/mrangelcruz/Jenkins_Shared_Libs'
}
stage('Build'){
    try{
        echo "Building..."
    }catch(ex){
        echo 'something went wrong'
        echo ex.toString
        currentBuild.result = 'FAILURE'
    }
    finally{
        echo "cleanup..."
    }
}
stage('Test'){
    echo 'Testing...'
}
stage('Deploy'){
    echo 'Deploying'
}