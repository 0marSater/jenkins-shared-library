

def call() {
    echo "Building the docker image..."

    // change directory to project dir where Dockerfile exit && build the image
    sh "cd /var/jenkins_home/workspace/${JOB_NAME} && docker build -t ${FULL_IMAGE_NAME} ."

    echo"Image ${FULL_IMAGE_NAME} built successfully."

    // flag to determine whether the build goes as expected or not.
    IS_IMAGE_BUILT = true
}
