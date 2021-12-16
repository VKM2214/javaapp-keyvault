package com.keyvault.secrets.quickstart;

import java.io.Console;

import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.security.keyvault.secrets.models.DeletedSecret;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;

public class App {
    public static void main(String[] args) throws InterruptedException, IllegalArgumentException {
        String keyVaultUri = "https://readsecretvault.vault.azure.net/";
        String myurl = "StorrageAccontName";
        System.out.printf("key vault URI = %s \n", keyVaultUri);
        KeyVaultSecret retrievedSecret = secretClient.getSecret(myurl);

        System.out.println("Your secret's value is '" + retrievedSecret.getValue() + "'.");

        System.out.println("done.");
    }
}
