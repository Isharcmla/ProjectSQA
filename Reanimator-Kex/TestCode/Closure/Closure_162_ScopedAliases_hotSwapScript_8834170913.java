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

public class ScopedAliases_hotSwapScript_8834170913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4705;
     Object term4855;
     Object term5302;
     Object term5304;

    public ScopedAliases_hotSwapScript_8834170913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4705 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term4785 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term4705, term4705.getClass(), "compiler", term4785);
        term4855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4855, term4855.getClass(), "type", 0);
        setField(term4855, term4855.getClass(), "parent", null);
        setField(term4925, term4925.getClass(), "next", null);
        setIntField(term4925, term4925.getClass(), "type", 0);
        setField(term4925, term4925.getClass(), "first", null);
        setField(term4855, term4855.getClass(), "first", term4925);
        term5302 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term5303 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term5303, term5303.getClass(), "options", null);
        setField(term5303, term5303.getClass(), "passes", null);
        setField(term5303, term5303.getClass(), "externs", null);
        setField(term5303, term5303.getClass(), "modules", null);
        setField(term5303, term5303.getClass(), "moduleGraph", null);
        setField(term5303, term5303.getClass(), "inputs", null);
        setField(term5303, term5303.getClass(), "errorManager", null);
        setField(term5303, term5303.getClass(), "warningsGuard", null);
        setField(term5303, term5303.getClass(), "externsRoot", null);
        setField(term5303, term5303.getClass(), "jsRoot", null);
        setField(term5303, term5303.getClass(), "externAndJsRoot", null);
        setField(term5303, term5303.getClass(), "inputsById", null);
        setField(term5303, term5303.getClass(), "sourceMap", null);
        setField(term5303, term5303.getClass(), "externExports", null);
        setIntField(term5303, term5303.getClass(), "uniqueNameId", 0);
        setBooleanField(term5303, term5303.getClass(), "useThreads", false);
        setBooleanField(term5303, term5303.getClass(), "hasRegExpGlobalReferences", false);
        setField(term5303, term5303.getClass(), "functionInformationMap", null);
        setField(term5303, term5303.getClass(), "debugLog", null);
        setField(term5303, term5303.getClass(), "defaultCodingConvention", null);
        setField(term5303, term5303.getClass(), "typeRegistry", null);
        setField(term5303, term5303.getClass(), "parserConfig", null);
        setField(term5303, term5303.getClass(), "abstractInterpreter", null);
        setField(term5303, term5303.getClass(), "typeValidator", null);
        setField(term5303, term5303.getClass(), "tracker", null);
        setField(term5303, term5303.getClass(), "oldErrorReporter", null);
        setField(term5303, term5303.getClass(), "defaultErrorReporter", null);
        setField(term5303, term5303.getClass(), "outStream", null);
        setField(term5303, term5303.getClass(), "globalRefMap", null);
        setField(term5303, term5303.getClass(), "sanityCheck", null);
        setField(term5303, term5303.getClass(), "currentTracer", null);
        setField(term5303, term5303.getClass(), "currentPassName", null);
        setIntField(term5303, term5303.getClass(), "syntheticCodeId", 0);
        setField(term5303, term5303.getClass(), "recentChange", null);
        setField(term5303, term5303.getClass(), "codeChangeHandlers", null);
        setField(term5303, term5303.getClass(), "stage", null);
        setField(term5302, term5302.getClass(), "compiler", term5303);
        setField(term5302, term5302.getClass(), "preprocessorSymbolTable", null);
        setField(term5302, term5302.getClass(), "transformationHandler", null);
        term5304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5304, term5304.getClass(), "type", 0);
        setField(term5304, term5304.getClass(), "next", null);
        setIntField(term5305, term5305.getClass(), "type", 0);
        setField(term5305, term5305.getClass(), "next", null);
        setField(term5305, term5305.getClass(), "first", null);
        setField(term5305, term5305.getClass(), "last", null);
        setField(term5305, term5305.getClass(), "propListHead", null);
        setIntField(term5305, term5305.getClass(), "sourcePosition", 0);
        setField(term5305, term5305.getClass(), "jsType", null);
        setField(term5305, term5305.getClass(), "parent", null);
        setField(term5304, term5304.getClass(), "first", term5305);
        setField(term5304, term5304.getClass(), "last", null);
        setField(term5304, term5304.getClass(), "propListHead", null);
        setIntField(term5304, term5304.getClass(), "sourcePosition", 0);
        setField(term5304, term5304.getClass(), "jsType", null);
        setField(term5304, term5304.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term4855;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term4705, args);
        assertTrue(recursiveEquals(term4705, term5302));
        assertTrue(recursiveEquals(term4855, term5304));
    }

};


