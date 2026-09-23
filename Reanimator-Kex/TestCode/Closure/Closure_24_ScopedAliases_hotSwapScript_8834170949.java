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

public class ScopedAliases_hotSwapScript_8834170949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56479;
     Object term56629;
     Object term56930;
     Object term56932;

    public ScopedAliases_hotSwapScript_8834170949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56479 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term56559 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term56479, term56479.getClass(), "compiler", term56559);
        term56629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56629, term56629.getClass(), "type", 105);
        setField(term56629, term56629.getClass(), "parent", null);
        term56930 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term56931 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term56931, term56931.getClass(), "options", null);
        setField(term56931, term56931.getClass(), "passes", null);
        setField(term56931, term56931.getClass(), "externs", null);
        setField(term56931, term56931.getClass(), "modules", null);
        setField(term56931, term56931.getClass(), "moduleGraph", null);
        setField(term56931, term56931.getClass(), "inputs", null);
        setField(term56931, term56931.getClass(), "errorManager", null);
        setField(term56931, term56931.getClass(), "warningsGuard", null);
        setField(term56931, term56931.getClass(), "injectedLibraries", null);
        setField(term56931, term56931.getClass(), "externsRoot", null);
        setField(term56931, term56931.getClass(), "jsRoot", null);
        setField(term56931, term56931.getClass(), "externAndJsRoot", null);
        setField(term56931, term56931.getClass(), "inputsById", null);
        setField(term56931, term56931.getClass(), "sourceMap", null);
        setField(term56931, term56931.getClass(), "externExports", null);
        setIntField(term56931, term56931.getClass(), "uniqueNameId", 0);
        setBooleanField(term56931, term56931.getClass(), "useThreads", false);
        setBooleanField(term56931, term56931.getClass(), "hasRegExpGlobalReferences", false);
        setField(term56931, term56931.getClass(), "functionInformationMap", null);
        setField(term56931, term56931.getClass(), "debugLog", null);
        setField(term56931, term56931.getClass(), "defaultCodingConvention", null);
        setField(term56931, term56931.getClass(), "typeRegistry", null);
        setField(term56931, term56931.getClass(), "parserConfig", null);
        setField(term56931, term56931.getClass(), "abstractInterpreter", null);
        setField(term56931, term56931.getClass(), "typeValidator", null);
        setField(term56931, term56931.getClass(), "tracker", null);
        setField(term56931, term56931.getClass(), "oldErrorReporter", null);
        setField(term56931, term56931.getClass(), "defaultErrorReporter", null);
        setField(term56931, term56931.getClass(), "outStream", null);
        setField(term56931, term56931.getClass(), "globalRefMap", null);
        setDoubleField(term56931, term56931.getClass(), "progress", 0.0);
        setField(term56931, term56931.getClass(), "sanityCheck", null);
        setField(term56931, term56931.getClass(), "currentTracer", null);
        setField(term56931, term56931.getClass(), "currentPassName", null);
        setIntField(term56931, term56931.getClass(), "syntheticCodeId", 0);
        setField(term56931, term56931.getClass(), "recentChange", null);
        setField(term56931, term56931.getClass(), "codeChangeHandlers", null);
        setField(term56931, term56931.getClass(), "synthesizedExternsInput", null);
        setField(term56931, term56931.getClass(), "stage", null);
        setField(term56930, term56930.getClass(), "compiler", term56931);
        setField(term56930, term56930.getClass(), "preprocessorSymbolTable", null);
        setField(term56930, term56930.getClass(), "transformationHandler", null);
        term56932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56932, term56932.getClass(), "type", 105);
        setField(term56932, term56932.getClass(), "next", null);
        setField(term56932, term56932.getClass(), "first", null);
        setField(term56932, term56932.getClass(), "last", null);
        setField(term56932, term56932.getClass(), "propListHead", null);
        setIntField(term56932, term56932.getClass(), "sourcePosition", 0);
        setField(term56932, term56932.getClass(), "jsType", null);
        setField(term56932, term56932.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term56629;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term56479, args);
        assertTrue(recursiveEquals(term56479, term56930));
        assertTrue(recursiveEquals(term56629, term56932));
    }

};


