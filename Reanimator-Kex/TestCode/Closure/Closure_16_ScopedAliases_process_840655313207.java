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

public class ScopedAliases_process_840655313207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126213;
     Object term126363;
     Object term127509;
     Object term127511;

    public ScopedAliases_process_840655313207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126213 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term126293 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term126213, term126213.getClass(), "compiler", term126293);
        term126363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term126363, term126363.getClass(), "type", 0);
        setIntField(term126433, term126433.getClass(), "type", 0);
        setField(term126433, term126433.getClass(), "parent", null);
        setField(term126433, term126433.getClass(), "next", null);
        setField(term126503, term126503.getClass(), "next", null);
        setIntField(term126503, term126503.getClass(), "type", 0);
        setField(term126503, term126503.getClass(), "first", null);
        setField(term126433, term126433.getClass(), "first", term126503);
        setField(term126363, term126363.getClass(), "parent", term126433);
        setField(term126363, term126363.getClass(), "first", term126433);
        term127509 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term127510 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term127510, term127510.getClass(), "options", null);
        setField(term127510, term127510.getClass(), "passes", null);
        setField(term127510, term127510.getClass(), "externs", null);
        setField(term127510, term127510.getClass(), "modules", null);
        setField(term127510, term127510.getClass(), "moduleGraph", null);
        setField(term127510, term127510.getClass(), "inputs", null);
        setField(term127510, term127510.getClass(), "errorManager", null);
        setField(term127510, term127510.getClass(), "warningsGuard", null);
        setField(term127510, term127510.getClass(), "injectedLibraries", null);
        setField(term127510, term127510.getClass(), "externsRoot", null);
        setField(term127510, term127510.getClass(), "jsRoot", null);
        setField(term127510, term127510.getClass(), "externAndJsRoot", null);
        setField(term127510, term127510.getClass(), "inputsById", null);
        setField(term127510, term127510.getClass(), "sourceMap", null);
        setField(term127510, term127510.getClass(), "externExports", null);
        setIntField(term127510, term127510.getClass(), "uniqueNameId", 0);
        setBooleanField(term127510, term127510.getClass(), "useThreads", false);
        setBooleanField(term127510, term127510.getClass(), "hasRegExpGlobalReferences", false);
        setField(term127510, term127510.getClass(), "functionInformationMap", null);
        setField(term127510, term127510.getClass(), "debugLog", null);
        setField(term127510, term127510.getClass(), "defaultCodingConvention", null);
        setField(term127510, term127510.getClass(), "typeRegistry", null);
        setField(term127510, term127510.getClass(), "parserConfig", null);
        setField(term127510, term127510.getClass(), "abstractInterpreter", null);
        setField(term127510, term127510.getClass(), "typeValidator", null);
        setField(term127510, term127510.getClass(), "tracker", null);
        setField(term127510, term127510.getClass(), "oldErrorReporter", null);
        setField(term127510, term127510.getClass(), "defaultErrorReporter", null);
        setField(term127510, term127510.getClass(), "outStream", null);
        setField(term127510, term127510.getClass(), "globalRefMap", null);
        setDoubleField(term127510, term127510.getClass(), "progress", 0.0);
        setField(term127510, term127510.getClass(), "sanityCheck", null);
        setField(term127510, term127510.getClass(), "currentTracer", null);
        setField(term127510, term127510.getClass(), "currentPassName", null);
        setIntField(term127510, term127510.getClass(), "syntheticCodeId", 0);
        setField(term127510, term127510.getClass(), "recentChange", null);
        setField(term127510, term127510.getClass(), "codeChangeHandlers", null);
        setField(term127510, term127510.getClass(), "synthesizedExternsInput", null);
        setField(term127510, term127510.getClass(), "stage", null);
        setField(term127509, term127509.getClass(), "compiler", term127510);
        setField(term127509, term127509.getClass(), "preprocessorSymbolTable", null);
        setField(term127509, term127509.getClass(), "transformationHandler", null);
        term127511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127511, term127511.getClass(), "type", 0);
        setField(term127511, term127511.getClass(), "next", null);
        setIntField(term127512, term127512.getClass(), "type", 0);
        setField(term127512, term127512.getClass(), "next", null);
        setIntField(term127513, term127513.getClass(), "type", 0);
        setField(term127513, term127513.getClass(), "next", null);
        setField(term127513, term127513.getClass(), "first", null);
        setField(term127513, term127513.getClass(), "last", null);
        setField(term127513, term127513.getClass(), "propListHead", null);
        setIntField(term127513, term127513.getClass(), "sourcePosition", 0);
        setField(term127513, term127513.getClass(), "jsType", null);
        setField(term127513, term127513.getClass(), "parent", null);
        setField(term127512, term127512.getClass(), "first", term127513);
        setField(term127512, term127512.getClass(), "last", null);
        setField(term127512, term127512.getClass(), "propListHead", null);
        setIntField(term127512, term127512.getClass(), "sourcePosition", 0);
        setField(term127512, term127512.getClass(), "jsType", null);
        setField(term127512, term127512.getClass(), "parent", null);
        setField(term127511, term127511.getClass(), "first", term127512);
        setField(term127511, term127511.getClass(), "last", null);
        setField(term127511, term127511.getClass(), "propListHead", null);
        setIntField(term127511, term127511.getClass(), "sourcePosition", 0);
        setField(term127511, term127511.getClass(), "jsType", null);
        setField(term127511, term127511.getClass(), "parent", term127512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term126363;
        callMethod(klass, "process", argTypes, term126213, args);
        assertTrue(recursiveEquals(term126213, term127509));
        assertTrue(recursiveEquals(term126363, null));
    }

};


