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

public class LightweightMessageFormatter_format_413663799178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143351;
     Object term143685;
     Object term146304;
     Object term146309;

    public LightweightMessageFormatter_format_413663799178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146313 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term146312 = ((Class) term146313).getDeclaredField((String) "REGION");
        ((Field) term146312).setAccessible(true);
        Object enum163 = ((Field) term146312).get((Object) null);
        term143351 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term143431 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term143351, term143351.getClass(), "source", term143431);
        setField(term143351, term143351.getClass(), "excerpt", enum163);
        setBooleanField(term143351, term143351.getClass(), "colorize", true);
        term143685 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term143685, term143685.getClass(), "sourceName", "");
        setIntField(term143685, term143685.getClass(), "lineNumber", -2147483646);
        Class<? extends Object> term146658 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term146657 = ((Class) term146658).getDeclaredField((String) "REGION");
        ((Field) term146657).setAccessible(true);
        Object enum164 = ((Field) term146657).get((Object) null);
        term146304 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term146308 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term146304, term146304.getClass(), "excerpt", enum164);
        setField(term146308, term146308.getClass(), "options", null);
        setField(term146308, term146308.getClass(), "passes", null);
        setField(term146308, term146308.getClass(), "externs", null);
        setField(term146308, term146308.getClass(), "modules", null);
        setField(term146308, term146308.getClass(), "moduleGraph", null);
        setField(term146308, term146308.getClass(), "inputs", null);
        setField(term146308, term146308.getClass(), "errorManager", null);
        setField(term146308, term146308.getClass(), "warningsGuard", null);
        setField(term146308, term146308.getClass(), "externsRoot", null);
        setField(term146308, term146308.getClass(), "jsRoot", null);
        setField(term146308, term146308.getClass(), "externAndJsRoot", null);
        setField(term146308, term146308.getClass(), "inputsByName", null);
        setField(term146308, term146308.getClass(), "sourceMap", null);
        setField(term146308, term146308.getClass(), "externExports", null);
        setIntField(term146308, term146308.getClass(), "uniqueNameId", 0);
        setBooleanField(term146308, term146308.getClass(), "useThreads", false);
        setBooleanField(term146308, term146308.getClass(), "hasRegExpGlobalReferences", false);
        setField(term146308, term146308.getClass(), "functionInformationMap", null);
        setField(term146308, term146308.getClass(), "debugLog", null);
        setField(term146308, term146308.getClass(), "defaultCodingConvention", null);
        setField(term146308, term146308.getClass(), "typeRegistry", null);
        setField(term146308, term146308.getClass(), "parserConfig", null);
        setField(term146308, term146308.getClass(), "abstractInterpreter", null);
        setField(term146308, term146308.getClass(), "typeValidator", null);
        setField(term146308, term146308.getClass(), "tracker", null);
        setField(term146308, term146308.getClass(), "oldErrorReporter", null);
        setField(term146308, term146308.getClass(), "defaultErrorReporter", null);
        setField(term146308, term146308.getClass(), "outStream", null);
        setField(term146308, term146308.getClass(), "globalRefMap", null);
        setField(term146308, term146308.getClass(), "sanityCheck", null);
        setField(term146308, term146308.getClass(), "currentTracer", null);
        setField(term146308, term146308.getClass(), "currentPassName", null);
        setField(term146308, term146308.getClass(), "recentChange", null);
        setField(term146308, term146308.getClass(), "codeChangeHandlers", null);
        setField(term146308, term146308.getClass(), "stage", null);
        setField(term146304, term146304.getClass(), "source", term146308);
        setBooleanField(term146304, term146304.getClass(), "colorize", true);
        term146309 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term146309, term146309.getClass(), "type", null);
        setField(term146309, term146309.getClass(), "description", null);
        setField(term146309, term146309.getClass(), "sourceName", "");
        setField(term146309, term146309.getClass(), "node", null);
        setIntField(term146309, term146309.getClass(), "lineNumber", -2147483646);
        setField(term146309, term146309.getClass(), "level", null);
        setIntField(term146309, term146309.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term143685;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term143351, args);
        assertTrue(recursiveEquals(term143351, term146304));
        assertTrue(recursiveEquals(term143685, term146309));
        assertTrue(recursiveEquals(retValue, ": \u001B[35mWARNING\u001B[39m - null\n"));
    }

};


