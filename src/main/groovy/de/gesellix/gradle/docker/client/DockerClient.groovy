package de.gesellix.gradle.docker.client

interface DockerClient {

  def build(InputStream buildContext)

  def tag()

  def push()

  def pull(imageName)

  def stop()

  def rm()

  def rmi()

  def run()

  def ps()

  def images()
}