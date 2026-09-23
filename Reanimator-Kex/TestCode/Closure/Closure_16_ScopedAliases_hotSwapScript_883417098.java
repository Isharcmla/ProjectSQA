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

public class ScopedAliases_hotSwapScript_883417098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2809;
     Object term2959;
     Object term4627;
     Object term4629;

    public ScopedAliases_hotSwapScript_883417098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2809 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term2889 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2809, term2809.getClass(), "compiler", term2889);
        term2959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2959, term2959.getClass(), "type", 0);
        setField(term2959, term2959.getClass(), "parent", null);
        setField(term3099, term3099.getClass(), "next", null);
        setIntField(term3099, term3099.getClass(), "type", 0);
        setField(term3099, term3099.getClass(), "first", null);
        setField(term3029, term3029.getClass(), "next", term3099);
        setIntField(term3029, term3029.getClass(), "type", 0);
        setField(term3169, term3169.getClass(), "next", null);
        setIntField(term3169, term3169.getClass(), "type", 0);
        setField(term3169, term3169.getClass(), "first", null);
        setField(term3029, term3029.getClass(), "first", term3169);
        setField(term2959, term2959.getClass(), "first", term3029);
        term4627 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term4628 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term4628, term4628.getClass(), "options", null);
        setField(term4628, term4628.getClass(), "passes", null);
        setField(term4628, term4628.getClass(), "externs", null);
        setField(term4628, term4628.getClass(), "modules", null);
        setField(term4628, term4628.getClass(), "moduleGraph", null);
        setField(term4628, term4628.getClass(), "inputs", null);
        setField(term4628, term4628.getClass(), "errorManager", null);
        setField(term4628, term4628.getClass(), "warningsGuard", null);
        setField(term4628, term4628.getClass(), "injectedLibraries", null);
        setField(term4628, term4628.getClass(), "externsRoot", null);
        setField(term4628, term4628.getClass(), "jsRoot", null);
        setField(term4628, term4628.getClass(), "externAndJsRoot", null);
        setField(term4628, term4628.getClass(), "inputsById", null);
        setField(term4628, term4628.getClass(), "sourceMap", null);
        setField(term4628, term4628.getClass(), "externExports", null);
        setIntField(term4628, term4628.getClass(), "uniqueNameId", 0);
        setBooleanField(term4628, term4628.getClass(), "useThreads", false);
        setBooleanField(term4628, term4628.getClass(), "hasRegExpGlobalReferences", false);
        setField(term4628, term4628.getClass(), "functionInformationMap", null);
        setField(term4628, term4628.getClass(), "debugLog", null);
        setField(term4628, term4628.getClass(), "defaultCodingConvention", null);
        setField(term4628, term4628.getClass(), "typeRegistry", null);
        setField(term4628, term4628.getClass(), "parserConfig", null);
        setField(term4628, term4628.getClass(), "abstractInterpreter", null);
        setField(term4628, term4628.getClass(), "typeValidator", null);
        setField(term4628, term4628.getClass(), "tracker", null);
        setField(term4628, term4628.getClass(), "oldErrorReporter", null);
        setField(term4628, term4628.getClass(), "defaultErrorReporter", null);
        setField(term4628, term4628.getClass(), "outStream", null);
        setField(term4628, term4628.getClass(), "globalRefMap", null);
        setDoubleField(term4628, term4628.getClass(), "progress", 0.0);
        setField(term4628, term4628.getClass(), "sanityCheck", null);
        setField(term4628, term4628.getClass(), "currentTracer", null);
        setField(term4628, term4628.getClass(), "currentPassName", null);
        setIntField(term4628, term4628.getClass(), "syntheticCodeId", 0);
        setField(term4628, term4628.getClass(), "recentChange", null);
        setField(term4628, term4628.getClass(), "codeChangeHandlers", null);
        setField(term4628, term4628.getClass(), "synthesizedExternsInput", null);
        setField(term4628, term4628.getClass(), "stage", null);
        setField(term4627, term4627.getClass(), "compiler", term4628);
        setField(term4627, term4627.getClass(), "preprocessorSymbolTable", null);
        setField(term4627, term4627.getClass(), "transformationHandler", null);
        term4629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4629, term4629.getClass(), "type", 0);
        setField(term4629, term4629.getClass(), "next", null);
        setIntField(term4630, term4630.getClass(), "type", 0);
        setIntField(term4631, term4631.getClass(), "type", 0);
        setField(term4631, term4631.getClass(), "next", null);
        setField(term4631, term4631.getClass(), "first", null);
        setField(term4631, term4631.getClass(), "last", null);
        setField(term4631, term4631.getClass(), "propListHead", null);
        setIntField(term4631, term4631.getClass(), "sourcePosition", 0);
        setField(term4631, term4631.getClass(), "jsType", null);
        setField(term4631, term4631.getClass(), "parent", null);
        setField(term4630, term4630.getClass(), "next", term4631);
        setIntField(term4632, term4632.getClass(), "type", 0);
        setField(term4632, term4632.getClass(), "next", null);
        setField(term4632, term4632.getClass(), "first", null);
        setField(term4632, term4632.getClass(), "last", null);
        setField(term4632, term4632.getClass(), "propListHead", null);
        setIntField(term4632, term4632.getClass(), "sourcePosition", 0);
        setField(term4632, term4632.getClass(), "jsType", null);
        setField(term4632, term4632.getClass(), "parent", null);
        setField(term4630, term4630.getClass(), "first", term4632);
        setField(term4630, term4630.getClass(), "last", null);
        setField(term4630, term4630.getClass(), "propListHead", null);
        setIntField(term4630, term4630.getClass(), "sourcePosition", 0);
        setField(term4630, term4630.getClass(), "jsType", null);
        setField(term4630, term4630.getClass(), "parent", null);
        setField(term4629, term4629.getClass(), "first", term4630);
        setField(term4629, term4629.getClass(), "last", null);
        setField(term4629, term4629.getClass(), "propListHead", null);
        setIntField(term4629, term4629.getClass(), "sourcePosition", 0);
        setField(term4629, term4629.getClass(), "jsType", null);
        setField(term4629, term4629.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2959;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term2809, args);
        assertTrue(recursiveEquals(term2809, term4627));
        assertTrue(recursiveEquals(term2959, term4629));
    }

};


