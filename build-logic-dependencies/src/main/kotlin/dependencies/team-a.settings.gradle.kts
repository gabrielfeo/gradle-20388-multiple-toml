package dependencies

dependencyResolutionManagement.versionCatalogs.named("libs") {
    // Versions
    val junit5 = "5.7.1"

    // Libraries
    library("junit-api", "org.junit.jupiter:junit-jupiter-api:$junit5")
    library("junit-engine", "org.junit.jupiter:junit-jupiter-engine:$junit5")
}
