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

public class ScopedAliases_process_840655313127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76887;
     Object term77059;
     Object term77381;
     Object term77383;

    public ScopedAliases_process_840655313127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76887 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term76967 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76887, term76887.getClass(), "compiler", term76967);
        term77059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term77059, term77059.getClass(), "type", 105);
        setField(term77059, term77059.getClass(), "parent", null);
        term77381 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term77382 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term77382, term77382.getClass(), "options", null);
        setField(term77382, term77382.getClass(), "passes", null);
        setField(term77382, term77382.getClass(), "externs", null);
        setField(term77382, term77382.getClass(), "modules", null);
        setField(term77382, term77382.getClass(), "moduleGraph", null);
        setField(term77382, term77382.getClass(), "inputs", null);
        setField(term77382, term77382.getClass(), "errorManager", null);
        setField(term77382, term77382.getClass(), "warningsGuard", null);
        setField(term77382, term77382.getClass(), "injectedLibraries", null);
        setField(term77382, term77382.getClass(), "externsRoot", null);
        setField(term77382, term77382.getClass(), "jsRoot", null);
        setField(term77382, term77382.getClass(), "externAndJsRoot", null);
        setField(term77382, term77382.getClass(), "inputsById", null);
        setField(term77382, term77382.getClass(), "sourceMap", null);
        setField(term77382, term77382.getClass(), "externExports", null);
        setIntField(term77382, term77382.getClass(), "uniqueNameId", 0);
        setBooleanField(term77382, term77382.getClass(), "useThreads", false);
        setBooleanField(term77382, term77382.getClass(), "hasRegExpGlobalReferences", false);
        setField(term77382, term77382.getClass(), "functionInformationMap", null);
        setField(term77382, term77382.getClass(), "debugLog", null);
        setField(term77382, term77382.getClass(), "defaultCodingConvention", null);
        setField(term77382, term77382.getClass(), "typeRegistry", null);
        setField(term77382, term77382.getClass(), "parserConfig", null);
        setField(term77382, term77382.getClass(), "abstractInterpreter", null);
        setField(term77382, term77382.getClass(), "typeValidator", null);
        setField(term77382, term77382.getClass(), "tracker", null);
        setField(term77382, term77382.getClass(), "oldErrorReporter", null);
        setField(term77382, term77382.getClass(), "defaultErrorReporter", null);
        setField(term77382, term77382.getClass(), "outStream", null);
        setField(term77382, term77382.getClass(), "globalRefMap", null);
        setDoubleField(term77382, term77382.getClass(), "progress", 0.0);
        setField(term77382, term77382.getClass(), "sanityCheck", null);
        setField(term77382, term77382.getClass(), "currentTracer", null);
        setField(term77382, term77382.getClass(), "currentPassName", null);
        setIntField(term77382, term77382.getClass(), "syntheticCodeId", 0);
        setField(term77382, term77382.getClass(), "recentChange", null);
        setField(term77382, term77382.getClass(), "codeChangeHandlers", null);
        setField(term77382, term77382.getClass(), "synthesizedExternsInput", null);
        setField(term77382, term77382.getClass(), "stage", null);
        setField(term77381, term77381.getClass(), "compiler", term77382);
        setField(term77381, term77381.getClass(), "preprocessorSymbolTable", null);
        setField(term77381, term77381.getClass(), "transformationHandler", null);
        term77383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term77383, term77383.getClass(), "number", 0.0);
        setIntField(term77383, term77383.getClass(), "type", 105);
        setField(term77383, term77383.getClass(), "next", null);
        setField(term77383, term77383.getClass(), "first", null);
        setField(term77383, term77383.getClass(), "last", null);
        setField(term77383, term77383.getClass(), "propListHead", null);
        setIntField(term77383, term77383.getClass(), "sourcePosition", 0);
        setField(term77383, term77383.getClass(), "jsType", null);
        setField(term77383, term77383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term77059;
        callMethod(klass, "process", argTypes, term76887, args);
        assertTrue(recursiveEquals(term76887, term77381));
        assertTrue(recursiveEquals(term77059, null));
    }

};


