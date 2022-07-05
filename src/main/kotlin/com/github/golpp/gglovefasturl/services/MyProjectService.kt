package com.github.golpp.gglovefasturl.services

import com.intellij.openapi.project.Project
import com.github.golpp.gglovefasturl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
