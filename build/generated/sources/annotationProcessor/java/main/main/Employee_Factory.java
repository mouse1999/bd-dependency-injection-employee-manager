package main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Employee_Factory implements Factory<Employee> {
  private final Provider<BigDecimal> salaryProvider;

  public Employee_Factory(Provider<BigDecimal> salaryProvider) {
    this.salaryProvider = salaryProvider;
  }

  @Override
  public Employee get() {
    return newInstance(salaryProvider.get());
  }

  public static Employee_Factory create(Provider<BigDecimal> salaryProvider) {
    return new Employee_Factory(salaryProvider);
  }

  public static Employee newInstance(BigDecimal salary) {
    return new Employee(salary);
  }
}
