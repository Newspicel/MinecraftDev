/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2016 Kyle Wood (DemonWav)
 *
 * MIT License
 */

package com.demonwav.mcdev.asset;

import com.intellij.openapi.util.IconLoader;

import javax.swing.Icon;

public abstract class Assets {

    protected Assets() {}

    protected static Icon loadIcon(String path) {
        return IconLoader.getIcon(path, PlatformAssets.class);
    }
}