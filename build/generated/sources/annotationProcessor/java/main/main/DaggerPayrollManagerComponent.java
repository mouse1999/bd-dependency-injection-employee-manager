package main;

import com.banking.business.payroll.client.BankClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
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
final class DaggerPayrollManagerComponent implements PayrollManagerComponent {
  private final DaggerPayrollManagerComponent payrollManagerComponent = this;

  private Provider<BankClient> provideBankClientProvider;

  private Provider<HumanResourcesClient> humanResourcesClientProvider;

  private DaggerPayrollManagerComponent(BankClientModule bankClientModuleParam) {

    initialize(bankClientModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  public static PayrollManagerComponent create() {
    return new Builder().build();
  }

  private PayrollTracker payrollTracker() {
    return new PayrollTracker(provideBankClientProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final BankClientModule bankClientModuleParam) {
    this.provideBankClientProvider = DoubleCheck.provider(BankClientModule_ProvideBankClientFactory.create(bankClientModuleParam));
    this.humanResourcesClientProvider = DoubleCheck.provider(HumanResourcesClient_Factory.create());
  }

  @Override
  public EmployeePaymentDistributor provideEmployeePaymentDistributor() {
    return new EmployeePaymentDistributor(payrollTracker());
  }

  @Override
  public HumanResourcesClient provideHumanResourcesClient() {
    return humanResourcesClientProvider.get();
  }

  static final class Builder {
    private BankClientModule bankClientModule;

    private Builder() {
    }

    public Builder bankClientModule(BankClientModule bankClientModule) {
      this.bankClientModule = Preconditions.checkNotNull(bankClientModule);
      return this;
    }

    public PayrollManagerComponent build() {
      if (bankClientModule == null) {
        this.bankClientModule = new BankClientModule();
      }
      return new DaggerPayrollManagerComponent(bankClientModule);
    }
  }
}
