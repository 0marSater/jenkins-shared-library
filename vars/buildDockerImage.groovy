

def call() {
    echo "building the docker image: ${FULL_IMAGE_NAME}"
    sh "cd /var/jenkins_home/workspace/${JOB_NAME} && docker build -t ${FULL_IMAGE_NAME} ."
    // or replace ${PIPELINE_NAME} with implicit variable JOB_NAME.

    // flag to determine whether the build goes as expected or not.
    IS_IMAGE_BUILT = true
}
