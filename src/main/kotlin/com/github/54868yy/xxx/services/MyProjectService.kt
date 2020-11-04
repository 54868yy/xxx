package com.github.54868yy.xxx.services

import com.intellij.openapi.project.Project
import com.github.54868yy.xxx.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
