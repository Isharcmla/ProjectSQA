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

public class LightweightMessageFormatter_formatWarning_2030513493117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83878;
     Object term84212;
     Object term84695;
     Object term84700;

    public LightweightMessageFormatter_formatWarning_2030513493117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84702 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term84701 = ((Class) term84702).getDeclaredField((String) "REGION");
        ((Field) term84701).setAccessible(true);
        Object enum96 = ((Field) term84701).get((Object) null);
        term83878 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term83958 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term83878, term83878.getClass(), "source", term83958);
        setField(term83878, term83878.getClass(), "excerpt", enum96);
        term84212 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term84212, term84212.getClass(), "sourceName", null);
        setIntField(term84212, term84212.getClass(), "lineNumber", 0);
        Class<? extends Object> term85047 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term85046 = ((Class) term85047).getDeclaredField((String) "REGION");
        ((Field) term85046).setAccessible(true);
        Object enum97 = ((Field) term85046).get((Object) null);
        term84695 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term84699 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term84695, term84695.getClass(), "excerpt", enum97);
        setField(term84699, term84699.getClass(), "options", null);
        setField(term84699, term84699.getClass(), "passes", null);
        setField(term84699, term84699.getClass(), "externs", null);
        setField(term84699, term84699.getClass(), "modules", null);
        setField(term84699, term84699.getClass(), "moduleGraph", null);
        setField(term84699, term84699.getClass(), "inputs", null);
        setField(term84699, term84699.getClass(), "errorManager", null);
        setField(term84699, term84699.getClass(), "warningsGuard", null);
        setField(term84699, term84699.getClass(), "externsRoot", null);
        setField(term84699, term84699.getClass(), "jsRoot", null);
        setField(term84699, term84699.getClass(), "externAndJsRoot", null);
        setField(term84699, term84699.getClass(), "inputsByName", null);
        setField(term84699, term84699.getClass(), "sourceMap", null);
        setField(term84699, term84699.getClass(), "externExports", null);
        setIntField(term84699, term84699.getClass(), "uniqueNameId", 0);
        setBooleanField(term84699, term84699.getClass(), "useThreads", false);
        setBooleanField(term84699, term84699.getClass(), "hasRegExpGlobalReferences", false);
        setField(term84699, term84699.getClass(), "functionInformationMap", null);
        setField(term84699, term84699.getClass(), "debugLog", null);
        setField(term84699, term84699.getClass(), "defaultCodingConvention", null);
        setField(term84699, term84699.getClass(), "typeRegistry", null);
        setField(term84699, term84699.getClass(), "parserConfig", null);
        setField(term84699, term84699.getClass(), "abstractInterpreter", null);
        setField(term84699, term84699.getClass(), "typeValidator", null);
        setField(term84699, term84699.getClass(), "tracker", null);
        setField(term84699, term84699.getClass(), "oldErrorReporter", null);
        setField(term84699, term84699.getClass(), "defaultErrorReporter", null);
        setField(term84699, term84699.getClass(), "outStream", null);
        setField(term84699, term84699.getClass(), "globalRefMap", null);
        setField(term84699, term84699.getClass(), "sanityCheck", null);
        setField(term84699, term84699.getClass(), "currentTracer", null);
        setField(term84699, term84699.getClass(), "currentPassName", null);
        setField(term84699, term84699.getClass(), "recentChange", null);
        setField(term84699, term84699.getClass(), "codeChangeHandlers", null);
        setField(term84699, term84699.getClass(), "stage", null);
        setField(term84695, term84695.getClass(), "source", term84699);
        setBooleanField(term84695, term84695.getClass(), "colorize", false);
        term84700 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term84700, term84700.getClass(), "type", null);
        setField(term84700, term84700.getClass(), "description", null);
        setField(term84700, term84700.getClass(), "sourceName", null);
        setField(term84700, term84700.getClass(), "node", null);
        setIntField(term84700, term84700.getClass(), "lineNumber", 0);
        setField(term84700, term84700.getClass(), "level", null);
        setIntField(term84700, term84700.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term84212;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term83878, args);
        assertTrue(recursiveEquals(term83878, term84695));
        assertTrue(recursiveEquals(term84212, term84700));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


