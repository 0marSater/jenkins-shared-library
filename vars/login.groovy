
def call(){
    echo "login to docker hub..."
    echo '$DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
}

