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

public class ScopedAliases_hotSwapScript_88341709173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104463;
     Object term104635;
     Object term105739;
     Object term105741;

    public ScopedAliases_hotSwapScript_88341709173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104463 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term104543 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term104463, term104463.getClass(), "compiler", term104543);
        term104635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term104635, term104635.getClass(), "type", 0);
        setField(term104635, term104635.getClass(), "parent", null);
        setField(term104635, term104635.getClass(), "first", null);
        term105739 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term105740 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term105740, term105740.getClass(), "options", null);
        setField(term105740, term105740.getClass(), "passes", null);
        setField(term105740, term105740.getClass(), "externs", null);
        setField(term105740, term105740.getClass(), "modules", null);
        setField(term105740, term105740.getClass(), "moduleGraph", null);
        setField(term105740, term105740.getClass(), "inputs", null);
        setField(term105740, term105740.getClass(), "errorManager", null);
        setField(term105740, term105740.getClass(), "warningsGuard", null);
        setField(term105740, term105740.getClass(), "injectedLibraries", null);
        setField(term105740, term105740.getClass(), "externsRoot", null);
        setField(term105740, term105740.getClass(), "jsRoot", null);
        setField(term105740, term105740.getClass(), "externAndJsRoot", null);
        setField(term105740, term105740.getClass(), "inputsById", null);
        setField(term105740, term105740.getClass(), "sourceMap", null);
        setField(term105740, term105740.getClass(), "externExports", null);
        setIntField(term105740, term105740.getClass(), "uniqueNameId", 0);
        setBooleanField(term105740, term105740.getClass(), "useThreads", false);
        setBooleanField(term105740, term105740.getClass(), "hasRegExpGlobalReferences", false);
        setField(term105740, term105740.getClass(), "functionInformationMap", null);
        setField(term105740, term105740.getClass(), "debugLog", null);
        setField(term105740, term105740.getClass(), "defaultCodingConvention", null);
        setField(term105740, term105740.getClass(), "typeRegistry", null);
        setField(term105740, term105740.getClass(), "parserConfig", null);
        setField(term105740, term105740.getClass(), "abstractInterpreter", null);
        setField(term105740, term105740.getClass(), "typeValidator", null);
        setField(term105740, term105740.getClass(), "tracker", null);
        setField(term105740, term105740.getClass(), "oldErrorReporter", null);
        setField(term105740, term105740.getClass(), "defaultErrorReporter", null);
        setField(term105740, term105740.getClass(), "outStream", null);
        setField(term105740, term105740.getClass(), "globalRefMap", null);
        setDoubleField(term105740, term105740.getClass(), "progress", 0.0);
        setField(term105740, term105740.getClass(), "sanityCheck", null);
        setField(term105740, term105740.getClass(), "currentTracer", null);
        setField(term105740, term105740.getClass(), "currentPassName", null);
        setIntField(term105740, term105740.getClass(), "syntheticCodeId", 0);
        setField(term105740, term105740.getClass(), "recentChange", null);
        setField(term105740, term105740.getClass(), "codeChangeHandlers", null);
        setField(term105740, term105740.getClass(), "synthesizedExternsInput", null);
        setField(term105740, term105740.getClass(), "stage", null);
        setField(term105739, term105739.getClass(), "compiler", term105740);
        setField(term105739, term105739.getClass(), "preprocessorSymbolTable", null);
        setField(term105739, term105739.getClass(), "transformationHandler", null);
        term105741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term105741, term105741.getClass(), "number", 0.0);
        setIntField(term105741, term105741.getClass(), "type", 0);
        setField(term105741, term105741.getClass(), "next", null);
        setField(term105741, term105741.getClass(), "first", null);
        setField(term105741, term105741.getClass(), "last", null);
        setField(term105741, term105741.getClass(), "propListHead", null);
        setIntField(term105741, term105741.getClass(), "sourcePosition", 0);
        setField(term105741, term105741.getClass(), "jsType", null);
        setField(term105741, term105741.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term104635;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term104463, args);
        assertTrue(recursiveEquals(term104463, term105739));
        assertTrue(recursiveEquals(term104635, term105741));
    }

};


