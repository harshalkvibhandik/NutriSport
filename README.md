# NutriSport - Multi-Modular KMP E-commerce App

<p align="center">
  <a href="https://stevdza-san.com/p/ecommerce-kmp-app-firebase-masterclass" align="center">
    <img src="https://img.shields.io/badge/Course-Masterclass-blue?style=for-the-badge&logo=appveyor" alt="Online Course">
  </a>
</p>

<p align="center">
  <img src="ASSETS/thumbnail.png" alt="NutriSport Thumbnail" width="600">
</p>

NutriSport is a production-ready, multi-modular **Kotlin Multiplatform (KMP)** and **Compose Multiplatform (CMP)** e-commerce application designed for both **Android** and **iOS**. It leverages modern Android development practices and a robust tech stack to deliver a seamless shopping experience.

---

## 🚀 Key Features

- **Multi-Modular Architecture**: Scalable and maintainable structure with dedicated modules for features, data, navigation, and DI.
- **Compose Multiplatform**: Shared UI code across Android and iOS using Material 3.
- **Firebase Integration**: Real-time database (Firestore), Storage, and Authentication.
- **Authentication**: Secure Google and Firebase sign-in using KMP Auth.
- **Push Notifications**: Cross-platform notifications with KMP Notifier.
- **Modern Navigation**: Type-safe navigation using Compose Navigation.
- **Offline Support & Settings**: Local storage with Multiplatform Settings.
- **Image Loading**: Efficient image fetching and caching with Coil 3.
- **Admin Panel**: Dedicated feature for managing products and orders.

---

## 🛠 Tech Stack

| Category | Technology |
| :--- | :--- |
| **Language** | [Kotlin](https://kotlinlang.org/) (2.4.10) |
| **UI Framework** | [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/) (1.11.1) |
| **Design System** | Material 3 |
| **DI** | [Koin](https://insert-koin.io/) (4.2.2) |
| **Networking** | [Ktor](https://ktor.io/) (3.5.1) |
| **Database/Backend** | [Firebase](https://firebase.google.com/) (GitLive KMP SDK) |
| **Navigation** | [Compose Navigation](https://developer.android.com/jetpack/compose/navigation) |
| **Serialization** | [Kotlinx Serialization](https://github.com/Kotlin/kotlinx.serialization) |
| **Image Loading** | [Coil 3](https://coil-kt.github.io/coil/) |
| **Local Storage** | [Multiplatform Settings](https://github.com/russhwolf/multiplatform-settings) |
| **Remote Config** | [Kotzilla](https://kotzilla.io/) |

---

## 📂 Project Structure

The project follows a modular approach to separate concerns and improve build times:

```text
.
├── composeApp               # Main application module (Shared UI entry & Android app)
│   ├── src
│   │   ├── androidMain      # Android specific implementation (MainActivity, Manifest)
│   │   └── commonMain       # Shared UI entry point (App.kt)
│   └── build.gradle.kts
├── data                     # Data layer (Repositories, Networking, Firebase, Models)
│   ├── src
│   │   └── commonMain
│   └── build.gradle.kts
├── di                       # Dependency Injection (Koin modules)
│   ├── src
│   │   └── commonMain
│   └── build.gradle.kts
├── feature                  # Feature-based modules
│   ├── admin_panel          # Product & order management (Admin only)
│   │   └── manage_product
│   ├── auth                 # Authentication (Login, Register, Social Auth)
│   ├── details              # Product detail views
│   ├── home                 # Dashboard and product discovery
│   │   ├── cart             # Shopping cart logic
│   │   │   └── checkout     # Payment processing
│   │   ├── categories       # Category browsing
│   │   │   └── category_search
│   │   └── products_overview
│   ├── payment_completed    # Post-purchase confirmation
│   └── profile              # User account management
├── navigation               # Type-safe navigation graph and routes
│   ├── src
│   │   └── commonMain
│   └── build.gradle.kts
├── shared                   # Core UI components, themes, and utility classes
│   ├── src
│   │   ├── androidMain
│   │   ├── commonMain       # Design system (Colors, Fonts), Reusable Components
│   │   └── iosMain
│   └── build.gradle.kts
├── iosApp                   # Native iOS Xcode project
├── gradle
│   └── libs.versions.toml   # Centralized dependency management
├── build.gradle.kts         # Root build script
└── settings.gradle.kts      # Module orchestration
```

### Module Responsibilities:

---

## ⚙️ Setup Instructions

### Prerequisites
- **Android Studio** (Latest Canary/Stable)
- **Xcode** (For iOS development)
- **Kotlin Multiplatform Plugin** for Android Studio

### Steps
1. **Clone the repository**:
   ```bash
   git clone https://github.com/harshalkvibhandik/NutriSport.git
   ```
2. **Firebase Setup**:
   - Create a Firebase project.
   - Add Android and iOS apps.
   - Download `google-services.json` (Android) and `GoogleService-Info.plist` (iOS).
   - Place `google-services.json` in `/composeApp/`.
   - Add `GoogleService-Info.plist` to the `iosApp` project in Xcode.
3. **Run the App**:
   - **Android**: Select `composeApp` and run it on an emulator or device.
   - **iOS**: Open `iosApp/iosApp.xcworkspace` in Xcode and run it.

---

## 📝 Credits & Course

This project was developed as part of the **[Ecommerce KMP App + Firebase Masterclass](https://stevdza-san.com/p/ecommerce-kmp-app-firebase-masterclass)** by **Stevdza-San**.

---

<p align="center">Made with ❤️ using Kotlin Multiplatform</p>
