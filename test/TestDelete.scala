import controllers.TestBean
import org.junit.Assert._
import org.junit.{After, Before, Test}
import play.test.WithApplication

/**
  * Created by shashank on 7/6/16.
  */
class TestDelete extends  WithApplication{

  private var exprService: TestBean = null


  @Before
  def setup() {
    exprService= app.injector().instanceOf(classOf[TestBean])
  }

  @Test
  @throws[Exception]
  def simpleColumnExpressionTest {
    assertEquals('u', exprService.printMethod())
  }

  @After
  def tearDown() {

  }

}
