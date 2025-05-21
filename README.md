This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

# Profile Screen - Compose Multiplatform

This package `org.example.assignment` contains a Jetpack Compose screen that displays a user's profile information. It is designed to be part of a Compose Multiplatform application.

## Features

*   **User Profile Display:** Shows the user's avatar, name, and membership date.
*   **Editable Profile:** Includes an edit icon, suggesting profile information can be modified (implementation not included in this snippet).
*   **"CRED Garage" Section:** A card promoting a feature related to vehicle information.
*   **Key Information Rows:** Displays user-specific data such as:
    *   Credit Score (with a "refresh available" indicator)
    *   Lifetime Cashback
    *   Bank Balance (with a "check" action)
*   **Rewards & Benefits Section:**
    *   Cashback Balance
    *   Coins
    *   Refer and Earn promotion
*   **Transactions & Support Section:**
    *   Link to "All Transactions"
*   **Theming:** Uses a dark theme with white and gray text.
*   **Navigation Elements:** Includes a back arrow and a "support" button in the top bar.
*   **Resource Handling:** Utilizes `org.jetbrains.compose.resources` for image and drawable resources.

## Structure

The main Composable function is `App()`, which sets up the `MaterialTheme` and calls `ProfileScreen()`.

*   **`ProfileScreen()`**: This is the core Composable function that builds the entire profile UI.
    *   It uses a `Column` for the main layout, allowing vertical scrolling.
    *   It's structured with `Row` and `Column` Composables for arranging elements.
    *   `Spacer` Composables are used for managing spacing.
    *   `Card` is used for the "CRED Garage" section.
    *   `HorizontalDivider` separates different sections of information.
    *   Icons are loaded using `painterResource` from `Res.drawable`.
*   **`ProfileInfoRow()`**: A reusable Composable function to display a label, an optional value, and an optional refresh indicator, along with a right arrow icon.

## Dependencies

This UI is built using Jetpack Compose and relies on the following key components:

*   `androidx.compose.material3`: For Material Design 3 components like `Scaffold`, `TopAppBar`, `Text`, `Button`, `Card`, `Icon`, `HorizontalDivider`.
*   `androidx.compose.foundation`: For basic layout components like `Column`, `Row`, `Box`, `Image`, `Spacer`, and modifiers for background, border, padding, etc.
*   `androidx.compose.runtime`: For Composable state management (`remember`, `mutableStateOf`).
*   `androidx.compose.ui`: For core UI elements, modifiers, graphics, and units.
*   `org.jetbrains.compose.resources`: For accessing resources in a Compose Multiplatform project.

## How to Use

1.  Ensure you have a Compose Multiplatform project set up.
2.  Make sure the necessary image resources (e.g., `arroe_left`, `arrow_right`, `car`, `edit_2`, `compose_multiplatform`) are available in your `generated.resources` drawable directory.
3.  Call the `App()` Composable function from your main application entry point.

## Preview

The `@Preview` annotation on the `App()` function allows you to preview the UI in Android Studio.

## Customization

*   **Theme:** Modify the `MaterialTheme` in `App()` or the `Color` values used directly in `ProfileScreen()` and `ProfileInfoRow()` to change the appearance.
*   **Data:** Replace placeholder text and image resources with actual user data and assets.
*   **Navigation:** Implement the actual navigation logic for the back arrow, support button, and other interactive elements.
*   **Functionality:** Add logic for profile editing, refreshing data, and handling clicks on various sections.
