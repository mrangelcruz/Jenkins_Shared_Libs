libraries{
    artifactRepo
    buildSteps
    deploy_to_qa
}

application_environments{
    merge = true
        dev{
            server_ip = "10.10.3.208"
            branch = "master"
            artifact_repo = "nexus"
        }
        qa{
            server_ip = "10.10.3.209"
            branch = "qa"
            artifact_repo = "folder"
        }
}