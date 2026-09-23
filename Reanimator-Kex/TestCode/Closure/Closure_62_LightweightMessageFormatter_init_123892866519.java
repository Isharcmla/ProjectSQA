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

public class LightweightMessageFormatter_init_123892866519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11970;
     Object term13316;
     Object term13321;

    public LightweightMessageFormatter_init_123892866519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11890 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term11890, term11890.getClass(), "source", null);
        term11970 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Class<? extends Object> term13323 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term13322 = ((Class) term13323).getDeclaredField((String) "LINE");
        ((Field) term13322).setAccessible(true);
        Object enum34 = ((Field) term13322).get((Object) null);
        term13316 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term13320 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13316, term13316.getClass(), "excerpt", enum34);
        setField(term13320, term13320.getClass(), "options", null);
        setField(term13320, term13320.getClass(), "passes", null);
        setField(term13320, term13320.getClass(), "externs", null);
        setField(term13320, term13320.getClass(), "modules", null);
        setField(term13320, term13320.getClass(), "moduleGraph", null);
        setField(term13320, term13320.getClass(), "inputs", null);
        setField(term13320, term13320.getClass(), "errorManager", null);
        setField(term13320, term13320.getClass(), "warningsGuard", null);
        setField(term13320, term13320.getClass(), "externsRoot", null);
        setField(term13320, term13320.getClass(), "jsRoot", null);
        setField(term13320, term13320.getClass(), "externAndJsRoot", null);
        setField(term13320, term13320.getClass(), "inputsByName", null);
        setField(term13320, term13320.getClass(), "sourceMap", null);
        setField(term13320, term13320.getClass(), "externExports", null);
        setIntField(term13320, term13320.getClass(), "uniqueNameId", 0);
        setBooleanField(term13320, term13320.getClass(), "useThreads", false);
        setBooleanField(term13320, term13320.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13320, term13320.getClass(), "functionInformationMap", null);
        setField(term13320, term13320.getClass(), "debugLog", null);
        setField(term13320, term13320.getClass(), "defaultCodingConvention", null);
        setField(term13320, term13320.getClass(), "typeRegistry", null);
        setField(term13320, term13320.getClass(), "parserConfig", null);
        setField(term13320, term13320.getClass(), "abstractInterpreter", null);
        setField(term13320, term13320.getClass(), "typeValidator", null);
        setField(term13320, term13320.getClass(), "tracker", null);
        setField(term13320, term13320.getClass(), "oldErrorReporter", null);
        setField(term13320, term13320.getClass(), "defaultErrorReporter", null);
        setField(term13320, term13320.getClass(), "outStream", null);
        setField(term13320, term13320.getClass(), "globalRefMap", null);
        setField(term13320, term13320.getClass(), "sanityCheck", null);
        setField(term13320, term13320.getClass(), "currentTracer", null);
        setField(term13320, term13320.getClass(), "currentPassName", null);
        setField(term13320, term13320.getClass(), "recentChange", null);
        setField(term13320, term13320.getClass(), "codeChangeHandlers", null);
        setField(term13320, term13320.getClass(), "stage", null);
        setField(term13316, term13316.getClass(), "source", term13320);
        setBooleanField(term13316, term13316.getClass(), "colorize", false);
        term13321 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13321, term13321.getClass(), "options", null);
        setField(term13321, term13321.getClass(), "passes", null);
        setField(term13321, term13321.getClass(), "externs", null);
        setField(term13321, term13321.getClass(), "modules", null);
        setField(term13321, term13321.getClass(), "moduleGraph", null);
        setField(term13321, term13321.getClass(), "inputs", null);
        setField(term13321, term13321.getClass(), "errorManager", null);
        setField(term13321, term13321.getClass(), "warningsGuard", null);
        setField(term13321, term13321.getClass(), "externsRoot", null);
        setField(term13321, term13321.getClass(), "jsRoot", null);
        setField(term13321, term13321.getClass(), "externAndJsRoot", null);
        setField(term13321, term13321.getClass(), "inputsByName", null);
        setField(term13321, term13321.getClass(), "sourceMap", null);
        setField(term13321, term13321.getClass(), "externExports", null);
        setIntField(term13321, term13321.getClass(), "uniqueNameId", 0);
        setBooleanField(term13321, term13321.getClass(), "useThreads", false);
        setBooleanField(term13321, term13321.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13321, term13321.getClass(), "functionInformationMap", null);
        setField(term13321, term13321.getClass(), "debugLog", null);
        setField(term13321, term13321.getClass(), "defaultCodingConvention", null);
        setField(term13321, term13321.getClass(), "typeRegistry", null);
        setField(term13321, term13321.getClass(), "parserConfig", null);
        setField(term13321, term13321.getClass(), "abstractInterpreter", null);
        setField(term13321, term13321.getClass(), "typeValidator", null);
        setField(term13321, term13321.getClass(), "tracker", null);
        setField(term13321, term13321.getClass(), "oldErrorReporter", null);
        setField(term13321, term13321.getClass(), "defaultErrorReporter", null);
        setField(term13321, term13321.getClass(), "outStream", null);
        setField(term13321, term13321.getClass(), "globalRefMap", null);
        setField(term13321, term13321.getClass(), "sanityCheck", null);
        setField(term13321, term13321.getClass(), "currentTracer", null);
        setField(term13321, term13321.getClass(), "currentPassName", null);
        setField(term13321, term13321.getClass(), "recentChange", null);
        setField(term13321, term13321.getClass(), "codeChangeHandlers", null);
        setField(term13321, term13321.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider");
        Object[] args = new Object[1];
        args[0] = term11970;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13316));
        assertTrue(recursiveEquals(term11970, term13321));
    }

};


