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

public class ScopedAliases_process_840655313169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102021;
     Object term102193;
     Object term103110;
     Object term103112;

    public ScopedAliases_process_840655313169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102021 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term102101 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term102021, term102021.getClass(), "compiler", term102101);
        term102193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term102285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term102193, term102193.getClass(), "type", 0);
        setIntField(term102285, term102285.getClass(), "type", 0);
        setField(term102285, term102285.getClass(), "parent", null);
        setField(term102193, term102193.getClass(), "parent", term102285);
        setField(term102193, term102193.getClass(), "first", null);
        term103110 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term103111 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term103111, term103111.getClass(), "options", null);
        setField(term103111, term103111.getClass(), "passes", null);
        setField(term103111, term103111.getClass(), "externs", null);
        setField(term103111, term103111.getClass(), "modules", null);
        setField(term103111, term103111.getClass(), "moduleGraph", null);
        setField(term103111, term103111.getClass(), "inputs", null);
        setField(term103111, term103111.getClass(), "errorManager", null);
        setField(term103111, term103111.getClass(), "warningsGuard", null);
        setField(term103111, term103111.getClass(), "injectedLibraries", null);
        setField(term103111, term103111.getClass(), "externsRoot", null);
        setField(term103111, term103111.getClass(), "jsRoot", null);
        setField(term103111, term103111.getClass(), "externAndJsRoot", null);
        setField(term103111, term103111.getClass(), "inputsById", null);
        setField(term103111, term103111.getClass(), "sourceMap", null);
        setField(term103111, term103111.getClass(), "externExports", null);
        setIntField(term103111, term103111.getClass(), "uniqueNameId", 0);
        setBooleanField(term103111, term103111.getClass(), "useThreads", false);
        setBooleanField(term103111, term103111.getClass(), "hasRegExpGlobalReferences", false);
        setField(term103111, term103111.getClass(), "functionInformationMap", null);
        setField(term103111, term103111.getClass(), "debugLog", null);
        setField(term103111, term103111.getClass(), "defaultCodingConvention", null);
        setField(term103111, term103111.getClass(), "typeRegistry", null);
        setField(term103111, term103111.getClass(), "parserConfig", null);
        setField(term103111, term103111.getClass(), "abstractInterpreter", null);
        setField(term103111, term103111.getClass(), "typeValidator", null);
        setField(term103111, term103111.getClass(), "tracker", null);
        setField(term103111, term103111.getClass(), "oldErrorReporter", null);
        setField(term103111, term103111.getClass(), "defaultErrorReporter", null);
        setField(term103111, term103111.getClass(), "outStream", null);
        setField(term103111, term103111.getClass(), "globalRefMap", null);
        setDoubleField(term103111, term103111.getClass(), "progress", 0.0);
        setField(term103111, term103111.getClass(), "sanityCheck", null);
        setField(term103111, term103111.getClass(), "currentTracer", null);
        setField(term103111, term103111.getClass(), "currentPassName", null);
        setIntField(term103111, term103111.getClass(), "syntheticCodeId", 0);
        setField(term103111, term103111.getClass(), "recentChange", null);
        setField(term103111, term103111.getClass(), "codeChangeHandlers", null);
        setField(term103111, term103111.getClass(), "synthesizedExternsInput", null);
        setField(term103111, term103111.getClass(), "stage", null);
        setField(term103110, term103110.getClass(), "compiler", term103111);
        setField(term103110, term103110.getClass(), "preprocessorSymbolTable", null);
        setField(term103110, term103110.getClass(), "transformationHandler", null);
        term103112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term103113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term103112, term103112.getClass(), "number", 0.0);
        setIntField(term103112, term103112.getClass(), "type", 0);
        setField(term103112, term103112.getClass(), "next", null);
        setField(term103112, term103112.getClass(), "first", null);
        setField(term103112, term103112.getClass(), "last", null);
        setField(term103112, term103112.getClass(), "propListHead", null);
        setIntField(term103112, term103112.getClass(), "sourcePosition", 0);
        setField(term103112, term103112.getClass(), "jsType", null);
        setDoubleField(term103113, term103113.getClass(), "number", 0.0);
        setIntField(term103113, term103113.getClass(), "type", 0);
        setField(term103113, term103113.getClass(), "next", null);
        setField(term103113, term103113.getClass(), "first", null);
        setField(term103113, term103113.getClass(), "last", null);
        setField(term103113, term103113.getClass(), "propListHead", null);
        setIntField(term103113, term103113.getClass(), "sourcePosition", 0);
        setField(term103113, term103113.getClass(), "jsType", null);
        setField(term103113, term103113.getClass(), "parent", null);
        setField(term103112, term103112.getClass(), "parent", term103113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term102193;
        callMethod(klass, "process", argTypes, term102021, args);
        assertTrue(recursiveEquals(term102021, term103110));
        assertTrue(recursiveEquals(term102193, null));
    }

};


