package dependencies

dependencyResolutionManagement.versionCatalogs.named("libs") {
    // Versions
    val groovy = "3.0.5"

    // Libraries
    library("groovy-core", "org.codehaus.groovy:groovy:$groovy")
}
