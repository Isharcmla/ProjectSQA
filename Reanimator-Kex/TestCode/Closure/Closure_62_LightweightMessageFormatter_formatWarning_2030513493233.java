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

public class LightweightMessageFormatter_formatWarning_2030513493233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204146;
     Object term204480;
     Object term204963;
     Object term204968;

    public LightweightMessageFormatter_formatWarning_2030513493233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204970 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term204969 = ((Class) term204970).getDeclaredField((String) "REGION");
        ((Field) term204969).setAccessible(true);
        Object enum243 = ((Field) term204969).get((Object) null);
        term204146 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term204226 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term204146, term204146.getClass(), "source", term204226);
        setField(term204146, term204146.getClass(), "excerpt", enum243);
        term204480 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term204480, term204480.getClass(), "sourceName", null);
        setIntField(term204480, term204480.getClass(), "lineNumber", 0);
        Class<? extends Object> term205315 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term205314 = ((Class) term205315).getDeclaredField((String) "REGION");
        ((Field) term205314).setAccessible(true);
        Object enum244 = ((Field) term205314).get((Object) null);
        term204963 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term204967 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term204963, term204963.getClass(), "excerpt", enum244);
        setField(term204967, term204967.getClass(), "options", null);
        setField(term204967, term204967.getClass(), "passes", null);
        setField(term204967, term204967.getClass(), "externs", null);
        setField(term204967, term204967.getClass(), "modules", null);
        setField(term204967, term204967.getClass(), "moduleGraph", null);
        setField(term204967, term204967.getClass(), "inputs", null);
        setField(term204967, term204967.getClass(), "errorManager", null);
        setField(term204967, term204967.getClass(), "warningsGuard", null);
        setField(term204967, term204967.getClass(), "externsRoot", null);
        setField(term204967, term204967.getClass(), "jsRoot", null);
        setField(term204967, term204967.getClass(), "externAndJsRoot", null);
        setField(term204967, term204967.getClass(), "inputsByName", null);
        setField(term204967, term204967.getClass(), "sourceMap", null);
        setField(term204967, term204967.getClass(), "externExports", null);
        setIntField(term204967, term204967.getClass(), "uniqueNameId", 0);
        setBooleanField(term204967, term204967.getClass(), "useThreads", false);
        setBooleanField(term204967, term204967.getClass(), "hasRegExpGlobalReferences", false);
        setField(term204967, term204967.getClass(), "functionInformationMap", null);
        setField(term204967, term204967.getClass(), "debugLog", null);
        setField(term204967, term204967.getClass(), "defaultCodingConvention", null);
        setField(term204967, term204967.getClass(), "typeRegistry", null);
        setField(term204967, term204967.getClass(), "parserConfig", null);
        setField(term204967, term204967.getClass(), "abstractInterpreter", null);
        setField(term204967, term204967.getClass(), "typeValidator", null);
        setField(term204967, term204967.getClass(), "tracker", null);
        setField(term204967, term204967.getClass(), "oldErrorReporter", null);
        setField(term204967, term204967.getClass(), "defaultErrorReporter", null);
        setField(term204967, term204967.getClass(), "outStream", null);
        setField(term204967, term204967.getClass(), "globalRefMap", null);
        setField(term204967, term204967.getClass(), "sanityCheck", null);
        setField(term204967, term204967.getClass(), "currentTracer", null);
        setField(term204967, term204967.getClass(), "currentPassName", null);
        setField(term204967, term204967.getClass(), "recentChange", null);
        setField(term204967, term204967.getClass(), "codeChangeHandlers", null);
        setField(term204967, term204967.getClass(), "stage", null);
        setField(term204963, term204963.getClass(), "source", term204967);
        setBooleanField(term204963, term204963.getClass(), "colorize", false);
        term204968 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term204968, term204968.getClass(), "type", null);
        setField(term204968, term204968.getClass(), "description", null);
        setField(term204968, term204968.getClass(), "sourceName", null);
        setField(term204968, term204968.getClass(), "node", null);
        setIntField(term204968, term204968.getClass(), "lineNumber", 0);
        setField(term204968, term204968.getClass(), "level", null);
        setIntField(term204968, term204968.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term204480;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term204146, args);
        assertTrue(recursiveEquals(term204146, term204963));
        assertTrue(recursiveEquals(term204480, term204968));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


