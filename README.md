# HoriMap

A JourneyMap-inspired minimap and world map mod for Minecraft.

**Author:** hauchdev  
**License:** MIT

## Features

- **Minimap** - Real-time minimap with configurable size, zoom, and position
- **World Map** - Full world map with chunk rendering
- **Waypoints** - Create, manage, and navigate to waypoints
- **Entity Radar** - See nearby entities on the minimap
- **Cave Map** - Underground mapping (planned)
- **Coordinates Display** - Show XYZ coordinates on screen
- **Biome Display** - Show current biome (planned)

## Platforms

| Platform | Status | Versions |
|----------|--------|----------|
| Forge   | ✅ Supported | 1.16.5+ |
| Fabric  | ✅ Supported | 1.16.5+ |

## Development

### Prerequisites

- Java 17+
- Gradle 8.x

### Building

```bash
./gradlew build
```

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
│   └── src/main/java/com/horimap/
│       ├── HoriMap.java
│       ├── config/
│       ├── map/
│       └── waypoint/
├── fabric/          # Fabric-specific implementation
│   └── src/main/java/com/horimap/fabric/
├── forge/           # Forge-specific implementation
│   └── src/main/java/com/horimap/forge/
├── gradle/
└── build.gradle
```

## Configuration

HoriMap settings can be configured in-game via:
- **Mod Menu** (Fabric)
- **Mod Options** (Forge)
- **Config file**: `config/horimap.json`

## Key Bindings

| Key | Action |
|-----|--------|
| J | Toggle Minimap |
| M | Open World Map |
| P | Open Waypoint Manager |
| O | Open Settings |
| B | Create Waypoint |

## License

MIT License - See [LICENSE](LICENSE) for details.
