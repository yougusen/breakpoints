package com.github.yougusen.breakpoints.services

import com.github.yougusen.breakpoints.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
