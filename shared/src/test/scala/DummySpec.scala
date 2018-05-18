import org.scalatest.WordSpec

class DummySpec extends WordSpec {

  "A succeeding dummy test" should {
    "pass" in {
      succeed
    }
  }

  "A failing dummy test" should {
    "fail" in {
      fail("Should fail")
    }
  }

}
