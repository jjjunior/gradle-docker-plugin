package de.gesellix.gradle.docker.tasks

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class DockerUnpauseTask extends DockerTask {

    @Input
    def containerId

    def result

    DockerUnpauseTask() {
        description = "Unpause a paused container"
        group = "Docker"
    }

    @TaskAction
    def unpause() {
        logger.info "docker unpause"
        result = getDockerClient().unpause(getContainerId())
        return result
    }
}
