

def call() {
    echo "building the docker image..."
    sh "docker build -t ${FULL_IMAGE_NAME} ."

    // flag to determine whether the build goes as expected or not.
    IS_IMAGE_BUILT = true
}
