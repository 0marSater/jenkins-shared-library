

def call(FULL_IMAGE_NAME) {
    echo "building the docker image: ${FULL_IMAGE_NAME}"
    sh "cd ${WORKSPACE} && sudo docker build -t ${FULL_IMAGE_NAME} ."


    // flag to determine whether the build goes as expected or not.
    IS_IMAGE_BUILT = true
}
