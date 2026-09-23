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

public class ScopedAliases_hotSwapScript_8834170919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7463;
     Object term7613;
     Object term8386;
     Object term8388;

    public ScopedAliases_hotSwapScript_8834170919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7463 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term7543 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term7463, term7463.getClass(), "compiler", term7543);
        term7613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7613, term7613.getClass(), "type", 0);
        setField(term7613, term7613.getClass(), "parent", null);
        setField(term7683, term7683.getClass(), "next", term7753);
        setIntField(term7683, term7683.getClass(), "type", 0);
        setField(term7683, term7683.getClass(), "first", term7823);
        setField(term7613, term7613.getClass(), "first", term7683);
        term8386 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term8387 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8387, term8387.getClass(), "options", null);
        setField(term8387, term8387.getClass(), "passes", null);
        setField(term8387, term8387.getClass(), "externs", null);
        setField(term8387, term8387.getClass(), "modules", null);
        setField(term8387, term8387.getClass(), "moduleGraph", null);
        setField(term8387, term8387.getClass(), "inputs", null);
        setField(term8387, term8387.getClass(), "errorManager", null);
        setField(term8387, term8387.getClass(), "warningsGuard", null);
        setField(term8387, term8387.getClass(), "externsRoot", null);
        setField(term8387, term8387.getClass(), "jsRoot", null);
        setField(term8387, term8387.getClass(), "externAndJsRoot", null);
        setField(term8387, term8387.getClass(), "inputsById", null);
        setField(term8387, term8387.getClass(), "sourceMap", null);
        setField(term8387, term8387.getClass(), "externExports", null);
        setIntField(term8387, term8387.getClass(), "uniqueNameId", 0);
        setBooleanField(term8387, term8387.getClass(), "useThreads", false);
        setBooleanField(term8387, term8387.getClass(), "hasRegExpGlobalReferences", false);
        setField(term8387, term8387.getClass(), "functionInformationMap", null);
        setField(term8387, term8387.getClass(), "debugLog", null);
        setField(term8387, term8387.getClass(), "defaultCodingConvention", null);
        setField(term8387, term8387.getClass(), "typeRegistry", null);
        setField(term8387, term8387.getClass(), "parserConfig", null);
        setField(term8387, term8387.getClass(), "abstractInterpreter", null);
        setField(term8387, term8387.getClass(), "typeValidator", null);
        setField(term8387, term8387.getClass(), "tracker", null);
        setField(term8387, term8387.getClass(), "oldErrorReporter", null);
        setField(term8387, term8387.getClass(), "defaultErrorReporter", null);
        setField(term8387, term8387.getClass(), "outStream", null);
        setField(term8387, term8387.getClass(), "globalRefMap", null);
        setField(term8387, term8387.getClass(), "sanityCheck", null);
        setField(term8387, term8387.getClass(), "currentTracer", null);
        setField(term8387, term8387.getClass(), "currentPassName", null);
        setIntField(term8387, term8387.getClass(), "syntheticCodeId", 0);
        setField(term8387, term8387.getClass(), "recentChange", null);
        setField(term8387, term8387.getClass(), "codeChangeHandlers", null);
        setField(term8387, term8387.getClass(), "stage", null);
        setField(term8386, term8386.getClass(), "compiler", term8387);
        setField(term8386, term8386.getClass(), "preprocessorSymbolTable", null);
        setField(term8386, term8386.getClass(), "transformationHandler", null);
        term8388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8388, term8388.getClass(), "type", 0);
        setField(term8388, term8388.getClass(), "next", null);
        setIntField(term8389, term8389.getClass(), "type", 0);
        setIntField(term8390, term8390.getClass(), "type", 0);
        setField(term8390, term8390.getClass(), "next", null);
        setField(term8390, term8390.getClass(), "first", null);
        setField(term8390, term8390.getClass(), "last", null);
        setField(term8390, term8390.getClass(), "propListHead", null);
        setIntField(term8390, term8390.getClass(), "sourcePosition", 0);
        setField(term8390, term8390.getClass(), "jsType", null);
        setField(term8390, term8390.getClass(), "parent", null);
        setField(term8389, term8389.getClass(), "next", term8390);
        setIntField(term8391, term8391.getClass(), "type", 0);
        setField(term8391, term8391.getClass(), "next", null);
        setField(term8391, term8391.getClass(), "first", null);
        setField(term8391, term8391.getClass(), "last", null);
        setField(term8391, term8391.getClass(), "propListHead", null);
        setIntField(term8391, term8391.getClass(), "sourcePosition", 0);
        setField(term8391, term8391.getClass(), "jsType", null);
        setField(term8391, term8391.getClass(), "parent", null);
        setField(term8389, term8389.getClass(), "first", term8391);
        setField(term8389, term8389.getClass(), "last", null);
        setField(term8389, term8389.getClass(), "propListHead", null);
        setIntField(term8389, term8389.getClass(), "sourcePosition", 0);
        setField(term8389, term8389.getClass(), "jsType", null);
        setField(term8389, term8389.getClass(), "parent", null);
        setField(term8388, term8388.getClass(), "first", term8389);
        setField(term8388, term8388.getClass(), "last", null);
        setField(term8388, term8388.getClass(), "propListHead", null);
        setIntField(term8388, term8388.getClass(), "sourcePosition", 0);
        setField(term8388, term8388.getClass(), "jsType", null);
        setField(term8388, term8388.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term7613;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term7463, args);
        assertTrue(recursiveEquals(term7463, term8386));
        assertTrue(recursiveEquals(term7613, term8388));
    }

};


