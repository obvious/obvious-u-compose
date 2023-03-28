package `in`.obvious.course.compose

import androidx.annotation.DrawableRes

data class Movie(
    val id: Int,
    val name: String,
    val plot: String,
    @DrawableRes
    val thumbnail: Int,
    val year: String,
    val director : String,
    val writer : String
)

val movieList = listOf(
    Movie(
        id = 0,
        name = "The Batman",
        plot = "When a sadistic serial killer begins murdering key political figures in Gotham, Batman is forced to investigate the city's hidden corruption and question his family's involvement.",
        thumbnail = R.drawable.batman,
        year = "2022",
        director = "Matt Reaves",
        writer = "Matt Reaves, Peter Craig"
    ),
    Movie(
        id = 1,
        name = "Everything Everywhere All at Once",
        plot = "A middle-aged Chinese immigrant is swept up into an insane adventure in which she alone can save existence by exploring other universes and connecting with the lives she could have led.",
        thumbnail = R.drawable.everything,
        year = "2022",
        director = "Daniel Kwan, Daniel Scheinert",
        writer = "Daniel Kwan, Daniel Scheinert"
    ), Movie(
        id = 2,
        name = "Top Gun: Maverick",
        plot = "After thirty years, Maverick is still pushing the envelope as a top naval aviator, but must confront ghosts of his past when he leads TOP GUN's elite graduates on a mission that demands the ultimate sacrifice from those chosen to fly it.",
        thumbnail = R.drawable.maverick,
        year = "2022",
        director = "Joseph Kosinski",
        writer = "Jim Cash, Jack Epps Jr, Peter Craig"
    ), Movie(
        id = 3,
        name = "Alita: Battle Angel",
        plot = "A deactivated cyborg's revived, but can't remember anything of her past and goes on a quest to find out who she is.",
        thumbnail = R.drawable.alita,
        year = "2019",
        director = "Robert Rodriguez",
        writer = "James Cameron, Laeta Kalogridis, Yukito Kishiro"
    )

)