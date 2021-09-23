// This file allows to open just optics libraries

rootProject.name = "arrow-optics-libs"

include("arrow-optics")
include("arrow-optics-test")

// To allow the use of local projects from ../core:

include("arrow-core")
include("arrow-core-test")
include("arrow-annotations")
include("arrow-continuations")
include("arrow-meta")
include("arrow-core-retrofit")

project(":arrow-core").projectDir = file("../core/arrow-core")
project(":arrow-core-test").projectDir = file("../core/arrow-core-test")
project(":arrow-annotations").projectDir = file("../core/arrow-annotations")
project(":arrow-continuations").projectDir = file("../core/arrow-continuations")
project(":arrow-meta").projectDir = file("../core/arrow-meta")
project(":arrow-core-retrofit").projectDir = file("../core/arrow-core-retrofit")

include("jekyll")
project(":jekyll").projectDir = file("dokka/jekyll")