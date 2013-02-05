# Android Example Maven Project

[![Build Status](https://travis-ci.org/embarkmobile/android-maven-example.png?branch=master)](https://travis-ci.org/embarkmobile/android-maven-example)

## Running tests locally

To run on a device connected via USB:

    mvn install -Pintegration-tests -Dandroid.device=usb

To run on an emulator, start up an emulator, and set `android.device` to the name of that emulator.
