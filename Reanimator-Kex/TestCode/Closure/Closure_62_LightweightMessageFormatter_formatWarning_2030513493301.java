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

public class LightweightMessageFormatter_formatWarning_2030513493301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255068;
     Object term255402;
     Object term255885;
     Object term255890;

    public LightweightMessageFormatter_formatWarning_2030513493301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term255892 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term255891 = ((Class) term255892).getDeclaredField((String) "REGION");
        ((Field) term255891).setAccessible(true);
        Object enum303 = ((Field) term255891).get((Object) null);
        term255068 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term255148 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term255068, term255068.getClass(), "source", term255148);
        setField(term255068, term255068.getClass(), "excerpt", enum303);
        term255402 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term255402, term255402.getClass(), "sourceName", null);
        setIntField(term255402, term255402.getClass(), "lineNumber", 0);
        Class<? extends Object> term256237 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term256236 = ((Class) term256237).getDeclaredField((String) "REGION");
        ((Field) term256236).setAccessible(true);
        Object enum304 = ((Field) term256236).get((Object) null);
        term255885 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term255889 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term255885, term255885.getClass(), "excerpt", enum304);
        setField(term255889, term255889.getClass(), "options", null);
        setField(term255889, term255889.getClass(), "passes", null);
        setField(term255889, term255889.getClass(), "externs", null);
        setField(term255889, term255889.getClass(), "modules", null);
        setField(term255889, term255889.getClass(), "moduleGraph", null);
        setField(term255889, term255889.getClass(), "inputs", null);
        setField(term255889, term255889.getClass(), "errorManager", null);
        setField(term255889, term255889.getClass(), "warningsGuard", null);
        setField(term255889, term255889.getClass(), "externsRoot", null);
        setField(term255889, term255889.getClass(), "jsRoot", null);
        setField(term255889, term255889.getClass(), "externAndJsRoot", null);
        setField(term255889, term255889.getClass(), "inputsByName", null);
        setField(term255889, term255889.getClass(), "sourceMap", null);
        setField(term255889, term255889.getClass(), "externExports", null);
        setIntField(term255889, term255889.getClass(), "uniqueNameId", 0);
        setBooleanField(term255889, term255889.getClass(), "useThreads", false);
        setBooleanField(term255889, term255889.getClass(), "hasRegExpGlobalReferences", false);
        setField(term255889, term255889.getClass(), "functionInformationMap", null);
        setField(term255889, term255889.getClass(), "debugLog", null);
        setField(term255889, term255889.getClass(), "defaultCodingConvention", null);
        setField(term255889, term255889.getClass(), "typeRegistry", null);
        setField(term255889, term255889.getClass(), "parserConfig", null);
        setField(term255889, term255889.getClass(), "abstractInterpreter", null);
        setField(term255889, term255889.getClass(), "typeValidator", null);
        setField(term255889, term255889.getClass(), "tracker", null);
        setField(term255889, term255889.getClass(), "oldErrorReporter", null);
        setField(term255889, term255889.getClass(), "defaultErrorReporter", null);
        setField(term255889, term255889.getClass(), "outStream", null);
        setField(term255889, term255889.getClass(), "globalRefMap", null);
        setField(term255889, term255889.getClass(), "sanityCheck", null);
        setField(term255889, term255889.getClass(), "currentTracer", null);
        setField(term255889, term255889.getClass(), "currentPassName", null);
        setField(term255889, term255889.getClass(), "recentChange", null);
        setField(term255889, term255889.getClass(), "codeChangeHandlers", null);
        setField(term255889, term255889.getClass(), "stage", null);
        setField(term255885, term255885.getClass(), "source", term255889);
        setBooleanField(term255885, term255885.getClass(), "colorize", false);
        term255890 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term255890, term255890.getClass(), "type", null);
        setField(term255890, term255890.getClass(), "description", null);
        setField(term255890, term255890.getClass(), "sourceName", null);
        setField(term255890, term255890.getClass(), "node", null);
        setIntField(term255890, term255890.getClass(), "lineNumber", 0);
        setField(term255890, term255890.getClass(), "level", null);
        setIntField(term255890, term255890.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term255402;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term255068, args);
        assertTrue(recursiveEquals(term255068, term255885));
        assertTrue(recursiveEquals(term255402, term255890));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


