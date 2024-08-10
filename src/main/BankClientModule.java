package main;

import com.banking.business.payroll.client.BankClient;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class BankClientModule {
    @Singleton
    @Provides
    public BankClient provideBankClient() {
        return new BankClient();
    }

}
