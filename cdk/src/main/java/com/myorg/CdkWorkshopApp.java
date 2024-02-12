package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class CdkWorkshopApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkWorkshopStack(app, "CdkWorkshopStack-<YOURNAMEGOESHERE>", StackProps.builder()
                .env(Environment.builder()
                        .account("303090068351")
                        .region("eu-central-1")
                        .build())
                .build());
        app.synth();
    }
}

