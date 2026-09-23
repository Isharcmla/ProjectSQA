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

public class ScopedAliases_process_84065531339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18873;
     Object term19023;
     Object term19486;
     Object term19488;

    public ScopedAliases_process_84065531339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18873 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term18953 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18873, term18873.getClass(), "compiler", term18953);
        term19023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19023, term19023.getClass(), "type", 37);
        setField(term19023, term19023.getClass(), "parent", null);
        setField(term19093, term19093.getClass(), "next", null);
        setIntField(term19093, term19093.getClass(), "type", 42);
        setField(term19093, term19093.getClass(), "first", null);
        setField(term19023, term19023.getClass(), "first", term19093);
        term19486 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term19487 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19487, term19487.getClass(), "options", null);
        setField(term19487, term19487.getClass(), "passes", null);
        setField(term19487, term19487.getClass(), "externs", null);
        setField(term19487, term19487.getClass(), "modules", null);
        setField(term19487, term19487.getClass(), "moduleGraph", null);
        setField(term19487, term19487.getClass(), "inputs", null);
        setField(term19487, term19487.getClass(), "errorManager", null);
        setField(term19487, term19487.getClass(), "warningsGuard", null);
        setField(term19487, term19487.getClass(), "externsRoot", null);
        setField(term19487, term19487.getClass(), "jsRoot", null);
        setField(term19487, term19487.getClass(), "externAndJsRoot", null);
        setField(term19487, term19487.getClass(), "inputsById", null);
        setField(term19487, term19487.getClass(), "sourceMap", null);
        setField(term19487, term19487.getClass(), "externExports", null);
        setIntField(term19487, term19487.getClass(), "uniqueNameId", 0);
        setBooleanField(term19487, term19487.getClass(), "useThreads", false);
        setBooleanField(term19487, term19487.getClass(), "hasRegExpGlobalReferences", false);
        setField(term19487, term19487.getClass(), "functionInformationMap", null);
        setField(term19487, term19487.getClass(), "debugLog", null);
        setField(term19487, term19487.getClass(), "defaultCodingConvention", null);
        setField(term19487, term19487.getClass(), "typeRegistry", null);
        setField(term19487, term19487.getClass(), "parserConfig", null);
        setField(term19487, term19487.getClass(), "abstractInterpreter", null);
        setField(term19487, term19487.getClass(), "typeValidator", null);
        setField(term19487, term19487.getClass(), "tracker", null);
        setField(term19487, term19487.getClass(), "oldErrorReporter", null);
        setField(term19487, term19487.getClass(), "defaultErrorReporter", null);
        setField(term19487, term19487.getClass(), "outStream", null);
        setField(term19487, term19487.getClass(), "globalRefMap", null);
        setField(term19487, term19487.getClass(), "sanityCheck", null);
        setField(term19487, term19487.getClass(), "currentTracer", null);
        setField(term19487, term19487.getClass(), "currentPassName", null);
        setIntField(term19487, term19487.getClass(), "syntheticCodeId", 0);
        setField(term19487, term19487.getClass(), "recentChange", null);
        setField(term19487, term19487.getClass(), "codeChangeHandlers", null);
        setField(term19487, term19487.getClass(), "stage", null);
        setField(term19486, term19486.getClass(), "compiler", term19487);
        setField(term19486, term19486.getClass(), "preprocessorSymbolTable", null);
        setField(term19486, term19486.getClass(), "transformationHandler", null);
        term19488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19488, term19488.getClass(), "type", 37);
        setField(term19488, term19488.getClass(), "next", null);
        setIntField(term19489, term19489.getClass(), "type", 42);
        setField(term19489, term19489.getClass(), "next", null);
        setField(term19489, term19489.getClass(), "first", null);
        setField(term19489, term19489.getClass(), "last", null);
        setField(term19489, term19489.getClass(), "propListHead", null);
        setIntField(term19489, term19489.getClass(), "sourcePosition", 0);
        setField(term19489, term19489.getClass(), "jsType", null);
        setField(term19489, term19489.getClass(), "parent", null);
        setField(term19488, term19488.getClass(), "first", term19489);
        setField(term19488, term19488.getClass(), "last", null);
        setField(term19488, term19488.getClass(), "propListHead", null);
        setIntField(term19488, term19488.getClass(), "sourcePosition", 0);
        setField(term19488, term19488.getClass(), "jsType", null);
        setField(term19488, term19488.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19023;
        callMethod(klass, "process", argTypes, term18873, args);
        assertTrue(recursiveEquals(term18873, term19486));
        assertTrue(recursiveEquals(term19023, null));
    }

};


