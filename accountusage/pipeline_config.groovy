libraries{
    artifactRepo
    buildSteps
}

application_environments{
    merge = true
        server{
            server_ip = "10.10.3.209"
            branch = "qa"
            artifact_repo = "folder"
        }
}