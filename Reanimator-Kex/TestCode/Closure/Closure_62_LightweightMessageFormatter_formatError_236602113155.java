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

public class LightweightMessageFormatter_formatError_236602113155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119262;
     Object term119596;
     Object term120919;
     Object term120924;

    public LightweightMessageFormatter_formatError_236602113155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term120926 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term120925 = ((Class) term120926).getDeclaredField((String) "REGION");
        ((Field) term120925).setAccessible(true);
        Object enum135 = ((Field) term120925).get((Object) null);
        term119262 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term119342 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term119262, term119262.getClass(), "source", term119342);
        setField(term119262, term119262.getClass(), "excerpt", enum135);
        setBooleanField(term119262, term119262.getClass(), "colorize", false);
        term119596 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term119596, term119596.getClass(), "sourceName", null);
        setIntField(term119596, term119596.getClass(), "lineNumber", 0);
        Class<? extends Object> term121271 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term121270 = ((Class) term121271).getDeclaredField((String) "REGION");
        ((Field) term121270).setAccessible(true);
        Object enum136 = ((Field) term121270).get((Object) null);
        term120919 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term120923 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term120919, term120919.getClass(), "excerpt", enum136);
        setField(term120923, term120923.getClass(), "options", null);
        setField(term120923, term120923.getClass(), "passes", null);
        setField(term120923, term120923.getClass(), "externs", null);
        setField(term120923, term120923.getClass(), "modules", null);
        setField(term120923, term120923.getClass(), "moduleGraph", null);
        setField(term120923, term120923.getClass(), "inputs", null);
        setField(term120923, term120923.getClass(), "errorManager", null);
        setField(term120923, term120923.getClass(), "warningsGuard", null);
        setField(term120923, term120923.getClass(), "externsRoot", null);
        setField(term120923, term120923.getClass(), "jsRoot", null);
        setField(term120923, term120923.getClass(), "externAndJsRoot", null);
        setField(term120923, term120923.getClass(), "inputsByName", null);
        setField(term120923, term120923.getClass(), "sourceMap", null);
        setField(term120923, term120923.getClass(), "externExports", null);
        setIntField(term120923, term120923.getClass(), "uniqueNameId", 0);
        setBooleanField(term120923, term120923.getClass(), "useThreads", false);
        setBooleanField(term120923, term120923.getClass(), "hasRegExpGlobalReferences", false);
        setField(term120923, term120923.getClass(), "functionInformationMap", null);
        setField(term120923, term120923.getClass(), "debugLog", null);
        setField(term120923, term120923.getClass(), "defaultCodingConvention", null);
        setField(term120923, term120923.getClass(), "typeRegistry", null);
        setField(term120923, term120923.getClass(), "parserConfig", null);
        setField(term120923, term120923.getClass(), "abstractInterpreter", null);
        setField(term120923, term120923.getClass(), "typeValidator", null);
        setField(term120923, term120923.getClass(), "tracker", null);
        setField(term120923, term120923.getClass(), "oldErrorReporter", null);
        setField(term120923, term120923.getClass(), "defaultErrorReporter", null);
        setField(term120923, term120923.getClass(), "outStream", null);
        setField(term120923, term120923.getClass(), "globalRefMap", null);
        setField(term120923, term120923.getClass(), "sanityCheck", null);
        setField(term120923, term120923.getClass(), "currentTracer", null);
        setField(term120923, term120923.getClass(), "currentPassName", null);
        setField(term120923, term120923.getClass(), "recentChange", null);
        setField(term120923, term120923.getClass(), "codeChangeHandlers", null);
        setField(term120923, term120923.getClass(), "stage", null);
        setField(term120919, term120919.getClass(), "source", term120923);
        setBooleanField(term120919, term120919.getClass(), "colorize", false);
        term120924 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term120924, term120924.getClass(), "type", null);
        setField(term120924, term120924.getClass(), "description", null);
        setField(term120924, term120924.getClass(), "sourceName", null);
        setField(term120924, term120924.getClass(), "node", null);
        setIntField(term120924, term120924.getClass(), "lineNumber", 0);
        setField(term120924, term120924.getClass(), "level", null);
        setIntField(term120924, term120924.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term119596;
        Object retValue = callMethod(klass, "formatError", argTypes, term119262, args);
        assertTrue(recursiveEquals(term119262, term120919));
        assertTrue(recursiveEquals(term119596, term120924));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


