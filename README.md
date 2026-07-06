<p align="center">
  <img src="docs/assets/logo.png" alt="LittleFrames Standalone logo" width="160">
</p>

<h1 align="center">LittleFrames Standalone</h1>

<p align="center">
  Unofficial standalone fork of LittleFrames for Minecraft Forge 1.12.2.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Minecraft-1.12.2-62B47A?style=for-the-badge" alt="Minecraft 1.12.2">
  <img src="https://img.shields.io/badge/Forge-14.23.5.2860-F16436?style=for-the-badge" alt="Forge 14.23.5.2860">
  <img src="https://img.shields.io/badge/Java-8-007396?style=for-the-badge" alt="Java 8">
  <img src="https://img.shields.io/badge/License-GPLv3-blue?style=for-the-badge" alt="License GPLv3">
  <img src="https://img.shields.io/badge/Status-Standalone-purple?style=for-the-badge" alt="Status Standalone">
</p>

## About

LittleFrames Standalone is an unofficial Forge 1.12.2 fork of LittleFrames focused on the normal `creative_frame` block.

This fork removes the required LittleTiles structure integration from the 1.12 branch while keeping the URL-based picture/video frame functionality. It is intended for players and modpacks that only need normal image/video frames and prefer not to install LittleTiles, including setups using rendering/performance mods such as Nothirium.

## Requirements

- Minecraft 1.12.2
- Forge 14.23.5.2860 or compatible Cleanroom environment
- CreativeCore for Minecraft 1.12.2
- Java 8

LittleTiles is not required.

## Features

- Keeps the normal `littleframes:creative_frame` block.
- Keeps the creative frame item, tile entity, GUI, renderer, and URL image/video system.
- Supports direct image URLs through the existing LittleFrames frame GUI.
- Keeps the original image/video cache and render behavior from the 1.12 branch.
- Works in singleplayer and on dedicated servers.
- Removes the required LittleTiles structure integration from the standalone build.
- Does not require LittleTiles to be installed.

## Installation

1. Install Minecraft 1.12.2 with Forge 14.23.5.2860 or a compatible Cleanroom environment.
2. Install CreativeCore for Minecraft 1.12.2.
3. Place `LittleFrames-Standalone-1.12.2-1.0.0.jar` in your `mods` folder.
4. Do not install LittleTiles unless another modpack component requires it.
5. Launch the game.

## Credits

- Original LittleFrames mod by CreativeMD: https://github.com/CreativeMD/LittleFrames
- Standalone fork modifications by Shadow-Dickinson.
- Built for Minecraft 1.12.2 Forge.
- Requires CreativeCore.

## License

This project is based on the LittleFrames 1.12 branch, which is licensed under the GNU General Public License v3.0.

This standalone fork is distributed under the same GPLv3 license. See [LICENSE](LICENSE).
