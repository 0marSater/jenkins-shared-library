def call(){
    echo "Pushing ${FULL_IMAGE_NAME}"
    sh "docker push ${FULL_IMAGE_NAME}"
}
