package com.zyxj.aopplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class TestExtensionPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        MyTestExtension create = project.getExtensions()
                .create("mTestExtension", MyTestExtension.class)

        project.afterEvaluate {
            def code = create.mTestVersionCode
            def name = create.mTestVersionName
            println("------>>>>>> versionCode = $code  versionName = $name")
        }

    }
}