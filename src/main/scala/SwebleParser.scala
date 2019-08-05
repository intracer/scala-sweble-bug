import org.sweble.wikitext.engine.{PageId, PageTitle, WtEngineImpl}
import org.sweble.wikitext.engine.config.WikiConfig
import org.sweble.wikitext.engine.nodes.EngProcessedPage
import org.sweble.wikitext.engine.utils.DefaultConfigEnWp

object SwebleParser {
  val config: WikiConfig = DefaultConfigEnWp.generate

  def parsePage(title: String, text: String): EngProcessedPage = {
    val engine = new WtEngineImpl(config)
    engine.postprocess(getPageId(title), text, null)
  }

  def getPageId(title: String): PageId = {
    new PageId(PageTitle.make(config, title), -1)
  }

  def main(args: Array[String]): Unit = {
    parsePage("title", "text")
  }

}
