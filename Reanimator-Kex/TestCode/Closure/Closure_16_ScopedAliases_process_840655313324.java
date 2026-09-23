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

public class ScopedAliases_process_840655313324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215822;
     Object term215994;
     Object term217197;
     Object term217199;

    public ScopedAliases_process_840655313324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215822 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term215902 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term215822, term215822.getClass(), "compiler", term215902);
        term215994 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term216086 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term215994, term215994.getClass(), "type", 0);
        setIntField(term216086, term216086.getClass(), "type", 0);
        setField(term216086, term216086.getClass(), "parent", null);
        setField(term215994, term215994.getClass(), "parent", term216086);
        setField(term215994, term215994.getClass(), "first", null);
        term217197 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term217198 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term217198, term217198.getClass(), "options", null);
        setField(term217198, term217198.getClass(), "passes", null);
        setField(term217198, term217198.getClass(), "externs", null);
        setField(term217198, term217198.getClass(), "modules", null);
        setField(term217198, term217198.getClass(), "moduleGraph", null);
        setField(term217198, term217198.getClass(), "inputs", null);
        setField(term217198, term217198.getClass(), "errorManager", null);
        setField(term217198, term217198.getClass(), "warningsGuard", null);
        setField(term217198, term217198.getClass(), "injectedLibraries", null);
        setField(term217198, term217198.getClass(), "externsRoot", null);
        setField(term217198, term217198.getClass(), "jsRoot", null);
        setField(term217198, term217198.getClass(), "externAndJsRoot", null);
        setField(term217198, term217198.getClass(), "inputsById", null);
        setField(term217198, term217198.getClass(), "sourceMap", null);
        setField(term217198, term217198.getClass(), "externExports", null);
        setIntField(term217198, term217198.getClass(), "uniqueNameId", 0);
        setBooleanField(term217198, term217198.getClass(), "useThreads", false);
        setBooleanField(term217198, term217198.getClass(), "hasRegExpGlobalReferences", false);
        setField(term217198, term217198.getClass(), "functionInformationMap", null);
        setField(term217198, term217198.getClass(), "debugLog", null);
        setField(term217198, term217198.getClass(), "defaultCodingConvention", null);
        setField(term217198, term217198.getClass(), "typeRegistry", null);
        setField(term217198, term217198.getClass(), "parserConfig", null);
        setField(term217198, term217198.getClass(), "abstractInterpreter", null);
        setField(term217198, term217198.getClass(), "typeValidator", null);
        setField(term217198, term217198.getClass(), "tracker", null);
        setField(term217198, term217198.getClass(), "oldErrorReporter", null);
        setField(term217198, term217198.getClass(), "defaultErrorReporter", null);
        setField(term217198, term217198.getClass(), "outStream", null);
        setField(term217198, term217198.getClass(), "globalRefMap", null);
        setDoubleField(term217198, term217198.getClass(), "progress", 0.0);
        setField(term217198, term217198.getClass(), "sanityCheck", null);
        setField(term217198, term217198.getClass(), "currentTracer", null);
        setField(term217198, term217198.getClass(), "currentPassName", null);
        setIntField(term217198, term217198.getClass(), "syntheticCodeId", 0);
        setField(term217198, term217198.getClass(), "recentChange", null);
        setField(term217198, term217198.getClass(), "codeChangeHandlers", null);
        setField(term217198, term217198.getClass(), "synthesizedExternsInput", null);
        setField(term217198, term217198.getClass(), "stage", null);
        setField(term217197, term217197.getClass(), "compiler", term217198);
        setField(term217197, term217197.getClass(), "preprocessorSymbolTable", null);
        setField(term217197, term217197.getClass(), "transformationHandler", null);
        term217199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term217200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term217199, term217199.getClass(), "str", null);
        setIntField(term217199, term217199.getClass(), "type", 0);
        setField(term217199, term217199.getClass(), "next", null);
        setField(term217199, term217199.getClass(), "first", null);
        setField(term217199, term217199.getClass(), "last", null);
        setField(term217199, term217199.getClass(), "propListHead", null);
        setIntField(term217199, term217199.getClass(), "sourcePosition", 0);
        setField(term217199, term217199.getClass(), "jsType", null);
        setDoubleField(term217200, term217200.getClass(), "number", 0.0);
        setIntField(term217200, term217200.getClass(), "type", 0);
        setField(term217200, term217200.getClass(), "next", null);
        setField(term217200, term217200.getClass(), "first", null);
        setField(term217200, term217200.getClass(), "last", null);
        setField(term217200, term217200.getClass(), "propListHead", null);
        setIntField(term217200, term217200.getClass(), "sourcePosition", 0);
        setField(term217200, term217200.getClass(), "jsType", null);
        setField(term217200, term217200.getClass(), "parent", null);
        setField(term217199, term217199.getClass(), "parent", term217200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term215994;
        callMethod(klass, "process", argTypes, term215822, args);
        assertTrue(recursiveEquals(term215822, term217197));
        assertTrue(recursiveEquals(term215994, null));
    }

};


