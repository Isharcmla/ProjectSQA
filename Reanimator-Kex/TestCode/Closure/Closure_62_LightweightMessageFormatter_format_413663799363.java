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

public class LightweightMessageFormatter_format_413663799363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307622;
     Object term307956;
     Object term308410;
     Object term308415;

    public LightweightMessageFormatter_format_413663799363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term308417 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term308416 = ((Class) term308417).getDeclaredField((String) "REGION");
        ((Field) term308416).setAccessible(true);
        Object enum366 = ((Field) term308416).get((Object) null);
        term307622 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term307702 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term307622, term307622.getClass(), "source", term307702);
        setField(term307622, term307622.getClass(), "excerpt", enum366);
        term307956 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term307956, term307956.getClass(), "sourceName", null);
        setIntField(term307956, term307956.getClass(), "lineNumber", 0);
        Class<? extends Object> term308762 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term308761 = ((Class) term308762).getDeclaredField((String) "REGION");
        ((Field) term308761).setAccessible(true);
        Object enum367 = ((Field) term308761).get((Object) null);
        term308410 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term308414 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term308410, term308410.getClass(), "excerpt", enum367);
        setField(term308414, term308414.getClass(), "options", null);
        setField(term308414, term308414.getClass(), "passes", null);
        setField(term308414, term308414.getClass(), "externs", null);
        setField(term308414, term308414.getClass(), "modules", null);
        setField(term308414, term308414.getClass(), "moduleGraph", null);
        setField(term308414, term308414.getClass(), "inputs", null);
        setField(term308414, term308414.getClass(), "errorManager", null);
        setField(term308414, term308414.getClass(), "warningsGuard", null);
        setField(term308414, term308414.getClass(), "externsRoot", null);
        setField(term308414, term308414.getClass(), "jsRoot", null);
        setField(term308414, term308414.getClass(), "externAndJsRoot", null);
        setField(term308414, term308414.getClass(), "inputsByName", null);
        setField(term308414, term308414.getClass(), "sourceMap", null);
        setField(term308414, term308414.getClass(), "externExports", null);
        setIntField(term308414, term308414.getClass(), "uniqueNameId", 0);
        setBooleanField(term308414, term308414.getClass(), "useThreads", false);
        setBooleanField(term308414, term308414.getClass(), "hasRegExpGlobalReferences", false);
        setField(term308414, term308414.getClass(), "functionInformationMap", null);
        setField(term308414, term308414.getClass(), "debugLog", null);
        setField(term308414, term308414.getClass(), "defaultCodingConvention", null);
        setField(term308414, term308414.getClass(), "typeRegistry", null);
        setField(term308414, term308414.getClass(), "parserConfig", null);
        setField(term308414, term308414.getClass(), "abstractInterpreter", null);
        setField(term308414, term308414.getClass(), "typeValidator", null);
        setField(term308414, term308414.getClass(), "tracker", null);
        setField(term308414, term308414.getClass(), "oldErrorReporter", null);
        setField(term308414, term308414.getClass(), "defaultErrorReporter", null);
        setField(term308414, term308414.getClass(), "outStream", null);
        setField(term308414, term308414.getClass(), "globalRefMap", null);
        setField(term308414, term308414.getClass(), "sanityCheck", null);
        setField(term308414, term308414.getClass(), "currentTracer", null);
        setField(term308414, term308414.getClass(), "currentPassName", null);
        setField(term308414, term308414.getClass(), "recentChange", null);
        setField(term308414, term308414.getClass(), "codeChangeHandlers", null);
        setField(term308414, term308414.getClass(), "stage", null);
        setField(term308410, term308410.getClass(), "source", term308414);
        setBooleanField(term308410, term308410.getClass(), "colorize", false);
        term308415 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term308415, term308415.getClass(), "type", null);
        setField(term308415, term308415.getClass(), "description", null);
        setField(term308415, term308415.getClass(), "sourceName", null);
        setField(term308415, term308415.getClass(), "node", null);
        setIntField(term308415, term308415.getClass(), "lineNumber", 0);
        setField(term308415, term308415.getClass(), "level", null);
        setIntField(term308415, term308415.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term307956;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term307622, args);
        assertTrue(recursiveEquals(term307622, term308410));
        assertTrue(recursiveEquals(term307956, term308415));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


