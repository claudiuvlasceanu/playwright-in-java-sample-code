package com.serenitydojo.playwright.toolshop.fixtures;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;

import java.util.Arrays;

public class ChromeHeadlessOptions implements OptionsFactory {
    private static final String DEFAULT_BASE_URL = "https://practicesoftwaretesting.com";

    @Override
    public Options getOptions() {
        String baseUrl = System.getProperty("baseUrl", DEFAULT_BASE_URL);

        return new Options().setLaunchOptions(
                        new BrowserType.LaunchOptions()
                                .setArgs(Arrays.asList("--no-sandbox", "--disable-extensions", "--disable-gpu"))
                ).setHeadless(false)
                .setBaseUrl(baseUrl)
                .setTestIdAttribute("data-test");
    }
}
