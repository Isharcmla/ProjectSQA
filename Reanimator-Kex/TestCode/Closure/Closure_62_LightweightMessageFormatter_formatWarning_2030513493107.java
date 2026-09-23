package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class LightweightMessageFormatter_formatWarning_2030513493107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72616;
     Object term72950;
     Object term73480;
     Object term73485;

    public LightweightMessageFormatter_formatWarning_2030513493107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73489 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term73488 = ((Class) term73489).getDeclaredField((String) "REGION");
        ((Field) term73488).setAccessible(true);
        Object enum87 = ((Field) term73488).get((Object) null);
        term72616 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term72696 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term72616, term72616.getClass(), "source", term72696);
        setField(term72616, term72616.getClass(), "excerpt", enum87);
        term72950 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term72950, term72950.getClass(), "sourceName", "");
        setIntField(term72950, term72950.getClass(), "lineNumber", 0);
        Class<? extends Object> term73834 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term73833 = ((Class) term73834).getDeclaredField((String) "REGION");
        ((Field) term73833).setAccessible(true);
        Object enum88 = ((Field) term73833).get((Object) null);
        term73480 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term73484 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term73480, term73480.getClass(), "excerpt", enum88);
        setField(term73484, term73484.getClass(), "options", null);
        setField(term73484, term73484.getClass(), "passes", null);
        setField(term73484, term73484.getClass(), "externs", null);
        setField(term73484, term73484.getClass(), "modules", null);
        setField(term73484, term73484.getClass(), "moduleGraph", null);
        setField(term73484, term73484.getClass(), "inputs", null);
        setField(term73484, term73484.getClass(), "errorManager", null);
        setField(term73484, term73484.getClass(), "warningsGuard", null);
        setField(term73484, term73484.getClass(), "externsRoot", null);
        setField(term73484, term73484.getClass(), "jsRoot", null);
        setField(term73484, term73484.getClass(), "externAndJsRoot", null);
        setField(term73484, term73484.getClass(), "inputsByName", null);
        setField(term73484, term73484.getClass(), "sourceMap", null);
        setField(term73484, term73484.getClass(), "externExports", null);
        setIntField(term73484, term73484.getClass(), "uniqueNameId", 0);
        setBooleanField(term73484, term73484.getClass(), "useThreads", false);
        setBooleanField(term73484, term73484.getClass(), "hasRegExpGlobalReferences", false);
        setField(term73484, term73484.getClass(), "functionInformationMap", null);
        setField(term73484, term73484.getClass(), "debugLog", null);
        setField(term73484, term73484.getClass(), "defaultCodingConvention", null);
        setField(term73484, term73484.getClass(), "typeRegistry", null);
        setField(term73484, term73484.getClass(), "parserConfig", null);
        setField(term73484, term73484.getClass(), "abstractInterpreter", null);
        setField(term73484, term73484.getClass(), "typeValidator", null);
        setField(term73484, term73484.getClass(), "tracker", null);
        setField(term73484, term73484.getClass(), "oldErrorReporter", null);
        setField(term73484, term73484.getClass(), "defaultErrorReporter", null);
        setField(term73484, term73484.getClass(), "outStream", null);
        setField(term73484, term73484.getClass(), "globalRefMap", null);
        setField(term73484, term73484.getClass(), "sanityCheck", null);
        setField(term73484, term73484.getClass(), "currentTracer", null);
        setField(term73484, term73484.getClass(), "currentPassName", null);
        setField(term73484, term73484.getClass(), "recentChange", null);
        setField(term73484, term73484.getClass(), "codeChangeHandlers", null);
        setField(term73484, term73484.getClass(), "stage", null);
        setField(term73480, term73480.getClass(), "source", term73484);
        setBooleanField(term73480, term73480.getClass(), "colorize", false);
        term73485 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term73485, term73485.getClass(), "type", null);
        setField(term73485, term73485.getClass(), "description", null);
        setField(term73485, term73485.getClass(), "sourceName", "");
        setField(term73485, term73485.getClass(), "node", null);
        setIntField(term73485, term73485.getClass(), "lineNumber", 0);
        setField(term73485, term73485.getClass(), "level", null);
        setIntField(term73485, term73485.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term72950;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term72616, args);
        assertTrue(recursiveEquals(term72616, term73480));
        assertTrue(recursiveEquals(term72950, term73485));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


