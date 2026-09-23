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

public class ScopedAliases_hotSwapScript_88341709156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94689;
     Object term94861;
     Object term95689;
     Object term95691;

    public ScopedAliases_hotSwapScript_88341709156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94689 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term94769 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term94689, term94689.getClass(), "compiler", term94769);
        term94861 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term94861, term94861.getClass(), "type", 0);
        setField(term94861, term94861.getClass(), "parent", null);
        setField(term94861, term94861.getClass(), "first", null);
        term95689 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term95690 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term95690, term95690.getClass(), "options", null);
        setField(term95690, term95690.getClass(), "passes", null);
        setField(term95690, term95690.getClass(), "externs", null);
        setField(term95690, term95690.getClass(), "modules", null);
        setField(term95690, term95690.getClass(), "moduleGraph", null);
        setField(term95690, term95690.getClass(), "inputs", null);
        setField(term95690, term95690.getClass(), "errorManager", null);
        setField(term95690, term95690.getClass(), "warningsGuard", null);
        setField(term95690, term95690.getClass(), "injectedLibraries", null);
        setField(term95690, term95690.getClass(), "externsRoot", null);
        setField(term95690, term95690.getClass(), "jsRoot", null);
        setField(term95690, term95690.getClass(), "externAndJsRoot", null);
        setField(term95690, term95690.getClass(), "inputsById", null);
        setField(term95690, term95690.getClass(), "sourceMap", null);
        setField(term95690, term95690.getClass(), "externExports", null);
        setIntField(term95690, term95690.getClass(), "uniqueNameId", 0);
        setBooleanField(term95690, term95690.getClass(), "useThreads", false);
        setBooleanField(term95690, term95690.getClass(), "hasRegExpGlobalReferences", false);
        setField(term95690, term95690.getClass(), "functionInformationMap", null);
        setField(term95690, term95690.getClass(), "debugLog", null);
        setField(term95690, term95690.getClass(), "defaultCodingConvention", null);
        setField(term95690, term95690.getClass(), "typeRegistry", null);
        setField(term95690, term95690.getClass(), "parserConfig", null);
        setField(term95690, term95690.getClass(), "abstractInterpreter", null);
        setField(term95690, term95690.getClass(), "typeValidator", null);
        setField(term95690, term95690.getClass(), "tracker", null);
        setField(term95690, term95690.getClass(), "oldErrorReporter", null);
        setField(term95690, term95690.getClass(), "defaultErrorReporter", null);
        setField(term95690, term95690.getClass(), "outStream", null);
        setField(term95690, term95690.getClass(), "globalRefMap", null);
        setDoubleField(term95690, term95690.getClass(), "progress", 0.0);
        setField(term95690, term95690.getClass(), "sanityCheck", null);
        setField(term95690, term95690.getClass(), "currentTracer", null);
        setField(term95690, term95690.getClass(), "currentPassName", null);
        setIntField(term95690, term95690.getClass(), "syntheticCodeId", 0);
        setField(term95690, term95690.getClass(), "recentChange", null);
        setField(term95690, term95690.getClass(), "codeChangeHandlers", null);
        setField(term95690, term95690.getClass(), "synthesizedExternsInput", null);
        setField(term95690, term95690.getClass(), "stage", null);
        setField(term95689, term95689.getClass(), "compiler", term95690);
        setField(term95689, term95689.getClass(), "preprocessorSymbolTable", null);
        setField(term95689, term95689.getClass(), "transformationHandler", null);
        term95691 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term95691, term95691.getClass(), "number", 0.0);
        setIntField(term95691, term95691.getClass(), "type", 0);
        setField(term95691, term95691.getClass(), "next", null);
        setField(term95691, term95691.getClass(), "first", null);
        setField(term95691, term95691.getClass(), "last", null);
        setField(term95691, term95691.getClass(), "propListHead", null);
        setIntField(term95691, term95691.getClass(), "sourcePosition", 0);
        setField(term95691, term95691.getClass(), "jsType", null);
        setField(term95691, term95691.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term94861;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term94689, args);
        assertTrue(recursiveEquals(term94689, term95689));
        assertTrue(recursiveEquals(term94861, term95691));
    }

};


