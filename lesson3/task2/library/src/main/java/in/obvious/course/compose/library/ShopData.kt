package `in`.obvious.course.compose.library

data class Shop(
    val placeholderId: Int,
    val heading: String,
    val subText: String,
    val descriptionOne: String,
    val descriptionTwo: String,
    val location: String
)

val shopList = listOf(
    Shop(
        placeholderId = R.drawable.wall_cafe,
        heading = "Wall Cafe",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    ),
    Shop(
        placeholderId = R.drawable.tbc,
        heading = "TBC",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    ),
    Shop(
        placeholderId = R.drawable.starbucks,
        heading = "Starbucks",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    ),
    Shop(
        placeholderId = R.drawable.srilankan_bistro,
        heading = "Srilankan Bistra",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    ),
    Shop(
        placeholderId = R.drawable.potful,
        heading = "Potful",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    ),
    Shop(
        placeholderId = R.drawable.paradise,
        heading = "Paradise",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    ),
    Shop(
        placeholderId = R.drawable.mia_cucina,
        heading = "Mia Cucina",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    ),
    Shop(
        placeholderId = R.drawable.mainland,
        heading = "Mainland",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    ),
    Shop(
        placeholderId = R.drawable.a2b,
        heading = "A2B",
        subText = "Subtext • Subtext",
        descriptionOne = "Special Text | Cuisine",
        descriptionTwo = "Description 2",
        location = "Koramangala"
    )
)