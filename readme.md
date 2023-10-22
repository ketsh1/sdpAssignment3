# CPU Socket Adapter Pattern Implementation

## Overview

This Java project demonstrates the implementation of the Adapter Pattern for CPU sockets, allowing an AM4 CPU to be used with an AM3 socket. The Adapter Pattern is used to bridge the gap between two incompatible interfaces, making it possible for them to work together seamlessly.

## Project Structure

- `Main.java`: Contains the main class with the program's entry point.
- `Motherboard.java`: Represents the client code that interacts with the adapter.
- `AM4CPU.java`: Defines the `AM4CPU` interface representing the adaptee.
- `AM4CPUImpl.java`: Implements the `AM4CPU` interface to provide the concrete adaptee functionality.
- `AM4toAM3Adapter.java`: Implements the adapter class that makes the AM4 CPU compatible with the AM3 socket.

## Usage

1. Compile the Java code:

   ```shell
   javac Main.java
