package dependencies

dependencyResolutionManagement.versionCatalogs.named("libs") {
    // Versions
    val groovy = "3.0.23"

    // Libraries
    library("groovy-core", "org.codehaus.groovy:groovy:$groovy")
}
