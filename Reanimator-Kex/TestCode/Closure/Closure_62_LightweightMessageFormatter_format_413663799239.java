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
import java.util.HashMap;
import java.lang.String;

public class LightweightMessageFormatter_format_413663799239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208498;
     Object term208984;
     Object term210385;
     Object term210391;

    public LightweightMessageFormatter_format_413663799239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term208626 = new HashMap();
        Class<? extends Object> term210395 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term210394 = ((Class) term210395).getDeclaredField((String) "REGION");
        ((Field) term210394).setAccessible(true);
        Object enum249 = ((Field) term210394).get((Object) null);
        term208498 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term208578 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term208578, term208578.getClass(), "inputsByName", term208626);
        setField(term208498, term208498.getClass(), "source", term208578);
        setField(term208498, term208498.getClass(), "excerpt", enum249);
        term208984 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term208984, term208984.getClass(), "sourceName", "");
        setIntField(term208984, term208984.getClass(), "lineNumber", 2);
        Class<? extends Object> term210740 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term210739 = ((Class) term210740).getDeclaredField((String) "REGION");
        ((Field) term210739).setAccessible(true);
        Object enum250 = ((Field) term210739).get((Object) null);
        HashMap term210390 = new HashMap();
        term210385 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term210389 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term210385, term210385.getClass(), "excerpt", enum250);
        setField(term210389, term210389.getClass(), "options", null);
        setField(term210389, term210389.getClass(), "passes", null);
        setField(term210389, term210389.getClass(), "externs", null);
        setField(term210389, term210389.getClass(), "modules", null);
        setField(term210389, term210389.getClass(), "moduleGraph", null);
        setField(term210389, term210389.getClass(), "inputs", null);
        setField(term210389, term210389.getClass(), "errorManager", null);
        setField(term210389, term210389.getClass(), "warningsGuard", null);
        setField(term210389, term210389.getClass(), "externsRoot", null);
        setField(term210389, term210389.getClass(), "jsRoot", null);
        setField(term210389, term210389.getClass(), "externAndJsRoot", null);
        setField(term210389, term210389.getClass(), "inputsByName", term210390);
        setField(term210389, term210389.getClass(), "sourceMap", null);
        setField(term210389, term210389.getClass(), "externExports", null);
        setIntField(term210389, term210389.getClass(), "uniqueNameId", 0);
        setBooleanField(term210389, term210389.getClass(), "useThreads", false);
        setBooleanField(term210389, term210389.getClass(), "hasRegExpGlobalReferences", false);
        setField(term210389, term210389.getClass(), "functionInformationMap", null);
        setField(term210389, term210389.getClass(), "debugLog", null);
        setField(term210389, term210389.getClass(), "defaultCodingConvention", null);
        setField(term210389, term210389.getClass(), "typeRegistry", null);
        setField(term210389, term210389.getClass(), "parserConfig", null);
        setField(term210389, term210389.getClass(), "abstractInterpreter", null);
        setField(term210389, term210389.getClass(), "typeValidator", null);
        setField(term210389, term210389.getClass(), "tracker", null);
        setField(term210389, term210389.getClass(), "oldErrorReporter", null);
        setField(term210389, term210389.getClass(), "defaultErrorReporter", null);
        setField(term210389, term210389.getClass(), "outStream", null);
        setField(term210389, term210389.getClass(), "globalRefMap", null);
        setField(term210389, term210389.getClass(), "sanityCheck", null);
        setField(term210389, term210389.getClass(), "currentTracer", null);
        setField(term210389, term210389.getClass(), "currentPassName", null);
        setField(term210389, term210389.getClass(), "recentChange", null);
        setField(term210389, term210389.getClass(), "codeChangeHandlers", null);
        setField(term210389, term210389.getClass(), "stage", null);
        setField(term210385, term210385.getClass(), "source", term210389);
        setBooleanField(term210385, term210385.getClass(), "colorize", false);
        term210391 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term210391, term210391.getClass(), "type", null);
        setField(term210391, term210391.getClass(), "description", null);
        setField(term210391, term210391.getClass(), "sourceName", "");
        setField(term210391, term210391.getClass(), "node", null);
        setIntField(term210391, term210391.getClass(), "lineNumber", 2);
        setField(term210391, term210391.getClass(), "level", null);
        setIntField(term210391, term210391.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term208984;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term208498, args);
        assertTrue(recursiveEquals(term208498, term210385));
        assertTrue(recursiveEquals(term208984, term210391));
        assertTrue(recursiveEquals(retValue, ":2: WARNING - null\n"));
    }

};


