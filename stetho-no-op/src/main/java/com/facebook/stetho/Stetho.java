package com.facebook.stetho;

import android.content.Context;

public class Stetho {
    public static InitializerBuilder newInitializerBuilder(Context context) {
        return new InitializerBuilder();
    }

    public static class Initializer {

    }

    public static void initialize(Initializer initializer) {

    }

    public static void initializeWithDefaults(final Context context) {

    }

    public static DumperPluginsProvider defaultDumperPluginsProvider(Context context) {
        return null;
    }

    public static InspectorModulesProvider defaultInspectorModulesProvider(Context context) {
        return null;
    }

    public static class DumperPluginsProvider {

    }

    public static class InspectorModulesProvider {

    }

    public static class InitializerBuilder {

        public InitializerBuilder enableDumpapp(DumperPluginsProvider provider) {
            return this;
        }

        public InitializerBuilder enableWebKitInspector(InspectorModulesProvider provider) {
            return this;
        }

        public Initializer build() {
            return new Initializer();
        }
    }
}
