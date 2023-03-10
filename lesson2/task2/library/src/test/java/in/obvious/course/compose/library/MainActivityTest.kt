package `in`.obvious.course.compose.library

import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_4A
import app.cash.paparazzi.Paparazzi
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class MainActivityTest{

  @get:Rule
  val paparazzi = Paparazzi(
    deviceConfig = PIXEL_4A,
    theme = "ComposePlayground",
    maxPercentDifference = 0.0
  )


  @Test
  fun launchComposable() {
    paparazzi.snapshot {
      MainLayout()
    }
  }
}
