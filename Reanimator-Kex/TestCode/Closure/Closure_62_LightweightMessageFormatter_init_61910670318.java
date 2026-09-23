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

public class LightweightMessageFormatter_init_61910670318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11726;
     Object term13282;
     Object term13284;

    public LightweightMessageFormatter_init_61910670318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11566 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term11646 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11566, term11566.getClass(), "source", term11646);
        term11726 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term13282 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term13283 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13282, term13282.getClass(), "excerpt", null);
        setField(term13283, term13283.getClass(), "options", null);
        setField(term13283, term13283.getClass(), "passes", null);
        setField(term13283, term13283.getClass(), "externs", null);
        setField(term13283, term13283.getClass(), "modules", null);
        setField(term13283, term13283.getClass(), "moduleGraph", null);
        setField(term13283, term13283.getClass(), "inputs", null);
        setField(term13283, term13283.getClass(), "errorManager", null);
        setField(term13283, term13283.getClass(), "warningsGuard", null);
        setField(term13283, term13283.getClass(), "externsRoot", null);
        setField(term13283, term13283.getClass(), "jsRoot", null);
        setField(term13283, term13283.getClass(), "externAndJsRoot", null);
        setField(term13283, term13283.getClass(), "inputsByName", null);
        setField(term13283, term13283.getClass(), "sourceMap", null);
        setField(term13283, term13283.getClass(), "externExports", null);
        setIntField(term13283, term13283.getClass(), "uniqueNameId", 0);
        setBooleanField(term13283, term13283.getClass(), "useThreads", false);
        setBooleanField(term13283, term13283.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13283, term13283.getClass(), "functionInformationMap", null);
        setField(term13283, term13283.getClass(), "debugLog", null);
        setField(term13283, term13283.getClass(), "defaultCodingConvention", null);
        setField(term13283, term13283.getClass(), "typeRegistry", null);
        setField(term13283, term13283.getClass(), "parserConfig", null);
        setField(term13283, term13283.getClass(), "abstractInterpreter", null);
        setField(term13283, term13283.getClass(), "typeValidator", null);
        setField(term13283, term13283.getClass(), "tracker", null);
        setField(term13283, term13283.getClass(), "oldErrorReporter", null);
        setField(term13283, term13283.getClass(), "defaultErrorReporter", null);
        setField(term13283, term13283.getClass(), "outStream", null);
        setField(term13283, term13283.getClass(), "globalRefMap", null);
        setField(term13283, term13283.getClass(), "sanityCheck", null);
        setField(term13283, term13283.getClass(), "currentTracer", null);
        setField(term13283, term13283.getClass(), "currentPassName", null);
        setField(term13283, term13283.getClass(), "recentChange", null);
        setField(term13283, term13283.getClass(), "codeChangeHandlers", null);
        setField(term13283, term13283.getClass(), "stage", null);
        setField(term13282, term13282.getClass(), "source", term13283);
        setBooleanField(term13282, term13282.getClass(), "colorize", false);
        term13284 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13284, term13284.getClass(), "options", null);
        setField(term13284, term13284.getClass(), "passes", null);
        setField(term13284, term13284.getClass(), "externs", null);
        setField(term13284, term13284.getClass(), "modules", null);
        setField(term13284, term13284.getClass(), "moduleGraph", null);
        setField(term13284, term13284.getClass(), "inputs", null);
        setField(term13284, term13284.getClass(), "errorManager", null);
        setField(term13284, term13284.getClass(), "warningsGuard", null);
        setField(term13284, term13284.getClass(), "externsRoot", null);
        setField(term13284, term13284.getClass(), "jsRoot", null);
        setField(term13284, term13284.getClass(), "externAndJsRoot", null);
        setField(term13284, term13284.getClass(), "inputsByName", null);
        setField(term13284, term13284.getClass(), "sourceMap", null);
        setField(term13284, term13284.getClass(), "externExports", null);
        setIntField(term13284, term13284.getClass(), "uniqueNameId", 0);
        setBooleanField(term13284, term13284.getClass(), "useThreads", false);
        setBooleanField(term13284, term13284.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13284, term13284.getClass(), "functionInformationMap", null);
        setField(term13284, term13284.getClass(), "debugLog", null);
        setField(term13284, term13284.getClass(), "defaultCodingConvention", null);
        setField(term13284, term13284.getClass(), "typeRegistry", null);
        setField(term13284, term13284.getClass(), "parserConfig", null);
        setField(term13284, term13284.getClass(), "abstractInterpreter", null);
        setField(term13284, term13284.getClass(), "typeValidator", null);
        setField(term13284, term13284.getClass(), "tracker", null);
        setField(term13284, term13284.getClass(), "oldErrorReporter", null);
        setField(term13284, term13284.getClass(), "defaultErrorReporter", null);
        setField(term13284, term13284.getClass(), "outStream", null);
        setField(term13284, term13284.getClass(), "globalRefMap", null);
        setField(term13284, term13284.getClass(), "sanityCheck", null);
        setField(term13284, term13284.getClass(), "currentTracer", null);
        setField(term13284, term13284.getClass(), "currentPassName", null);
        setField(term13284, term13284.getClass(), "recentChange", null);
        setField(term13284, term13284.getClass(), "codeChangeHandlers", null);
        setField(term13284, term13284.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Object[] args = new Object[2];
        args[0] = term11726;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13282));
        assertTrue(recursiveEquals(term11726, term13284));
    }

};


