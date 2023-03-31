def call(FULL_IMAGE_NAME){
    echo "Pushing ${FULL_IMAGE_NAME}"

    def fullTag = sh(script: "docker tag $FULL_IMAGE_NAME omarsater/private-repo:$FULL_IMAGE_NAME", returnStdout: true).trim()

    sh "docker push ${fullTag}"
}
