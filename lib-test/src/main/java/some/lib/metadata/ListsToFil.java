package some.lib.metadata;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ConfigurationProperties(prefix = "app.lists-to-fill")
public class ListsToFil {

  private final List<String> list1;
  private final List<String> list2;
  private final List<String> list3;

  @ConstructorBinding
  public ListsToFil(
          List<String> list1, List<String> list2, List<String> list3) {
    this.list1 = list1;
    this.list2 = list2;
    this.list3 = list3;
  }

  /**
   * some getters
   */
}
