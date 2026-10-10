# HoriMap

[![Build Status](https://github.com/hauchdev/HoriMap/actions/workflows/build.yml/badge.svg)](https://github.com/hauchdev/HoriMap/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.20.1-blue.svg)](https://minecraft.net)

A JourneyMap-inspired minimap and world map mod for Minecraft, built with [Architectury](https://docs.architectury.dev) to support both Fabric and Forge from a single codebase.

## Features

- **Minimap** — Real-time minimap with configurable size, zoom, and position
- **World Map** — Full world map with chunk rendering
- **Waypoints** — Create, manage, and navigate to waypoints
- **Entity Radar** — See nearby entities on the minimap
- **Cave Map** — Underground mapping *(planned)*
- **Coordinates Display** — Show XYZ coordinates on screen
- **Biome Display** — Show current biome *(planned)*

## Platforms

| Platform | Status | Versions |
|----------|--------|----------|
| Forge   | ✅ Supported | 1.20.1 |
| Fabric  | ✅ Supported | 1.20.1 |

## Building from Source

### Prerequisites

- [JDK 17+](https://adoptium.net/)
- [Git](https://git-scm.com/)

### Steps

```bash
git clone https://github.com/hauchdev/HoriMap.git
cd HoriMap
./gradlew build
```

Artifacts will be in `build/libs/`.

## Development

### Setup

1. Clone the repository
2. Open in IntelliJ IDEA (recommended) or your preferred IDE
3. Run `./gradlew genSources` to generate Minecraft sources
4. Import the Gradle project

### Running

```bash
# Fabric
./gradlew fabric:runClient

# Forge
./gradlew forge:runClient
```

## Project Structure

```
horimap/
├── common/          # Shared code between platforms
│   └── src/main/java/dev/hauch/horimap/
│       ├── Horimap.java
│       ├── config/
│       ├── map/
│       └── waypoint/
├── fabric/          # Fabric-specific implementation
│   └── src/main/java/dev/hauch/horimap/fabric/
├── forge/           # Forge-specific implementation
│   └── src/main/java/dev/hauch/horimap/forge/
├── gradle/
└── build.gradle
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License — see [LICENSE](LICENSE) for details.
