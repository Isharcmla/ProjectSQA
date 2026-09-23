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

public class ScopedAliases_hotSwapScript_8834170989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53188;
     Object term53338;
     Object term53655;
     Object term53657;

    public ScopedAliases_hotSwapScript_8834170989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53188 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term53268 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term53188, term53188.getClass(), "compiler", term53268);
        term53338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53338, term53338.getClass(), "type", 105);
        setField(term53338, term53338.getClass(), "parent", null);
        term53655 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term53656 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term53656, term53656.getClass(), "options", null);
        setField(term53656, term53656.getClass(), "passes", null);
        setField(term53656, term53656.getClass(), "externs", null);
        setField(term53656, term53656.getClass(), "modules", null);
        setField(term53656, term53656.getClass(), "moduleGraph", null);
        setField(term53656, term53656.getClass(), "inputs", null);
        setField(term53656, term53656.getClass(), "errorManager", null);
        setField(term53656, term53656.getClass(), "warningsGuard", null);
        setField(term53656, term53656.getClass(), "injectedLibraries", null);
        setField(term53656, term53656.getClass(), "externsRoot", null);
        setField(term53656, term53656.getClass(), "jsRoot", null);
        setField(term53656, term53656.getClass(), "externAndJsRoot", null);
        setField(term53656, term53656.getClass(), "inputsById", null);
        setField(term53656, term53656.getClass(), "sourceMap", null);
        setField(term53656, term53656.getClass(), "externExports", null);
        setIntField(term53656, term53656.getClass(), "uniqueNameId", 0);
        setBooleanField(term53656, term53656.getClass(), "useThreads", false);
        setBooleanField(term53656, term53656.getClass(), "hasRegExpGlobalReferences", false);
        setField(term53656, term53656.getClass(), "functionInformationMap", null);
        setField(term53656, term53656.getClass(), "debugLog", null);
        setField(term53656, term53656.getClass(), "defaultCodingConvention", null);
        setField(term53656, term53656.getClass(), "typeRegistry", null);
        setField(term53656, term53656.getClass(), "parserConfig", null);
        setField(term53656, term53656.getClass(), "abstractInterpreter", null);
        setField(term53656, term53656.getClass(), "typeValidator", null);
        setField(term53656, term53656.getClass(), "tracker", null);
        setField(term53656, term53656.getClass(), "oldErrorReporter", null);
        setField(term53656, term53656.getClass(), "defaultErrorReporter", null);
        setField(term53656, term53656.getClass(), "outStream", null);
        setField(term53656, term53656.getClass(), "globalRefMap", null);
        setDoubleField(term53656, term53656.getClass(), "progress", 0.0);
        setField(term53656, term53656.getClass(), "sanityCheck", null);
        setField(term53656, term53656.getClass(), "currentTracer", null);
        setField(term53656, term53656.getClass(), "currentPassName", null);
        setIntField(term53656, term53656.getClass(), "syntheticCodeId", 0);
        setField(term53656, term53656.getClass(), "recentChange", null);
        setField(term53656, term53656.getClass(), "codeChangeHandlers", null);
        setField(term53656, term53656.getClass(), "synthesizedExternsInput", null);
        setField(term53656, term53656.getClass(), "stage", null);
        setField(term53655, term53655.getClass(), "compiler", term53656);
        setField(term53655, term53655.getClass(), "preprocessorSymbolTable", null);
        setField(term53655, term53655.getClass(), "transformationHandler", null);
        term53657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53657, term53657.getClass(), "type", 105);
        setField(term53657, term53657.getClass(), "next", null);
        setField(term53657, term53657.getClass(), "first", null);
        setField(term53657, term53657.getClass(), "last", null);
        setField(term53657, term53657.getClass(), "propListHead", null);
        setIntField(term53657, term53657.getClass(), "sourcePosition", 0);
        setField(term53657, term53657.getClass(), "jsType", null);
        setField(term53657, term53657.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term53338;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term53188, args);
        assertTrue(recursiveEquals(term53188, term53655));
        assertTrue(recursiveEquals(term53338, term53657));
    }

};


