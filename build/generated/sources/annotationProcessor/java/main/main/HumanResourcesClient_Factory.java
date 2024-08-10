package main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HumanResourcesClient_Factory implements Factory<HumanResourcesClient> {
  @Override
  public HumanResourcesClient get() {
    return newInstance();
  }

  public static HumanResourcesClient_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HumanResourcesClient newInstance() {
    return new HumanResourcesClient();
  }

  private static final class InstanceHolder {
    private static final HumanResourcesClient_Factory INSTANCE = new HumanResourcesClient_Factory();
  }
}
