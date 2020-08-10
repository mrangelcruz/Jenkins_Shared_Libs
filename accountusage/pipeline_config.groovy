libraries{
    artifactRepo
    buildSteps
}

application_environments{
    merge = true
        server{
            server_ip = "10.10.3.208"
            branch = "master"
            artifact_repo = "folder"
        }
}