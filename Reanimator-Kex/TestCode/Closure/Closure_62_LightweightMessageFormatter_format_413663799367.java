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

public class LightweightMessageFormatter_format_413663799367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312561;
     Object term312895;
     Object term313394;
     Object term313399;

    public LightweightMessageFormatter_format_413663799367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term313403 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term313402 = ((Class) term313403).getDeclaredField((String) "REGION");
        ((Field) term313402).setAccessible(true);
        Object enum372 = ((Field) term313402).get((Object) null);
        term312561 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term312641 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term312561, term312561.getClass(), "source", term312641);
        setField(term312561, term312561.getClass(), "excerpt", enum372);
        term312895 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term312895, term312895.getClass(), "sourceName", "");
        setIntField(term312895, term312895.getClass(), "lineNumber", 0);
        Class<? extends Object> term313748 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term313747 = ((Class) term313748).getDeclaredField((String) "REGION");
        ((Field) term313747).setAccessible(true);
        Object enum373 = ((Field) term313747).get((Object) null);
        term313394 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term313398 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term313394, term313394.getClass(), "excerpt", enum373);
        setField(term313398, term313398.getClass(), "options", null);
        setField(term313398, term313398.getClass(), "passes", null);
        setField(term313398, term313398.getClass(), "externs", null);
        setField(term313398, term313398.getClass(), "modules", null);
        setField(term313398, term313398.getClass(), "moduleGraph", null);
        setField(term313398, term313398.getClass(), "inputs", null);
        setField(term313398, term313398.getClass(), "errorManager", null);
        setField(term313398, term313398.getClass(), "warningsGuard", null);
        setField(term313398, term313398.getClass(), "externsRoot", null);
        setField(term313398, term313398.getClass(), "jsRoot", null);
        setField(term313398, term313398.getClass(), "externAndJsRoot", null);
        setField(term313398, term313398.getClass(), "inputsByName", null);
        setField(term313398, term313398.getClass(), "sourceMap", null);
        setField(term313398, term313398.getClass(), "externExports", null);
        setIntField(term313398, term313398.getClass(), "uniqueNameId", 0);
        setBooleanField(term313398, term313398.getClass(), "useThreads", false);
        setBooleanField(term313398, term313398.getClass(), "hasRegExpGlobalReferences", false);
        setField(term313398, term313398.getClass(), "functionInformationMap", null);
        setField(term313398, term313398.getClass(), "debugLog", null);
        setField(term313398, term313398.getClass(), "defaultCodingConvention", null);
        setField(term313398, term313398.getClass(), "typeRegistry", null);
        setField(term313398, term313398.getClass(), "parserConfig", null);
        setField(term313398, term313398.getClass(), "abstractInterpreter", null);
        setField(term313398, term313398.getClass(), "typeValidator", null);
        setField(term313398, term313398.getClass(), "tracker", null);
        setField(term313398, term313398.getClass(), "oldErrorReporter", null);
        setField(term313398, term313398.getClass(), "defaultErrorReporter", null);
        setField(term313398, term313398.getClass(), "outStream", null);
        setField(term313398, term313398.getClass(), "globalRefMap", null);
        setField(term313398, term313398.getClass(), "sanityCheck", null);
        setField(term313398, term313398.getClass(), "currentTracer", null);
        setField(term313398, term313398.getClass(), "currentPassName", null);
        setField(term313398, term313398.getClass(), "recentChange", null);
        setField(term313398, term313398.getClass(), "codeChangeHandlers", null);
        setField(term313398, term313398.getClass(), "stage", null);
        setField(term313394, term313394.getClass(), "source", term313398);
        setBooleanField(term313394, term313394.getClass(), "colorize", false);
        term313399 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term313399, term313399.getClass(), "type", null);
        setField(term313399, term313399.getClass(), "description", null);
        setField(term313399, term313399.getClass(), "sourceName", "");
        setField(term313399, term313399.getClass(), "node", null);
        setIntField(term313399, term313399.getClass(), "lineNumber", 0);
        setField(term313399, term313399.getClass(), "level", null);
        setIntField(term313399, term313399.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term312895;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term312561, args);
        assertTrue(recursiveEquals(term312561, term313394));
        assertTrue(recursiveEquals(term312895, term313399));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


