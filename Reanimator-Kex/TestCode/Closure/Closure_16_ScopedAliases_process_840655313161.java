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

public class ScopedAliases_process_840655313161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97667;
     Object term97839;
     Object term98826;
     Object term98828;

    public ScopedAliases_process_840655313161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97667 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term97747 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term97667, term97667.getClass(), "compiler", term97747);
        term97839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98115 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97839, term97839.getClass(), "type", 0);
        setField(term97839, term97839.getClass(), "parent", null);
        setField(term98023, term98023.getClass(), "next", null);
        setIntField(term98023, term98023.getClass(), "type", 0);
        setField(term98023, term98023.getClass(), "first", null);
        setField(term97931, term97931.getClass(), "next", term98023);
        setIntField(term97931, term97931.getClass(), "type", 0);
        setField(term98115, term98115.getClass(), "next", null);
        setIntField(term98115, term98115.getClass(), "type", 0);
        setField(term98115, term98115.getClass(), "first", null);
        setField(term97931, term97931.getClass(), "first", term98115);
        setField(term97839, term97839.getClass(), "first", term97931);
        term98826 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term98827 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term98827, term98827.getClass(), "options", null);
        setField(term98827, term98827.getClass(), "passes", null);
        setField(term98827, term98827.getClass(), "externs", null);
        setField(term98827, term98827.getClass(), "modules", null);
        setField(term98827, term98827.getClass(), "moduleGraph", null);
        setField(term98827, term98827.getClass(), "inputs", null);
        setField(term98827, term98827.getClass(), "errorManager", null);
        setField(term98827, term98827.getClass(), "warningsGuard", null);
        setField(term98827, term98827.getClass(), "injectedLibraries", null);
        setField(term98827, term98827.getClass(), "externsRoot", null);
        setField(term98827, term98827.getClass(), "jsRoot", null);
        setField(term98827, term98827.getClass(), "externAndJsRoot", null);
        setField(term98827, term98827.getClass(), "inputsById", null);
        setField(term98827, term98827.getClass(), "sourceMap", null);
        setField(term98827, term98827.getClass(), "externExports", null);
        setIntField(term98827, term98827.getClass(), "uniqueNameId", 0);
        setBooleanField(term98827, term98827.getClass(), "useThreads", false);
        setBooleanField(term98827, term98827.getClass(), "hasRegExpGlobalReferences", false);
        setField(term98827, term98827.getClass(), "functionInformationMap", null);
        setField(term98827, term98827.getClass(), "debugLog", null);
        setField(term98827, term98827.getClass(), "defaultCodingConvention", null);
        setField(term98827, term98827.getClass(), "typeRegistry", null);
        setField(term98827, term98827.getClass(), "parserConfig", null);
        setField(term98827, term98827.getClass(), "abstractInterpreter", null);
        setField(term98827, term98827.getClass(), "typeValidator", null);
        setField(term98827, term98827.getClass(), "tracker", null);
        setField(term98827, term98827.getClass(), "oldErrorReporter", null);
        setField(term98827, term98827.getClass(), "defaultErrorReporter", null);
        setField(term98827, term98827.getClass(), "outStream", null);
        setField(term98827, term98827.getClass(), "globalRefMap", null);
        setDoubleField(term98827, term98827.getClass(), "progress", 0.0);
        setField(term98827, term98827.getClass(), "sanityCheck", null);
        setField(term98827, term98827.getClass(), "currentTracer", null);
        setField(term98827, term98827.getClass(), "currentPassName", null);
        setIntField(term98827, term98827.getClass(), "syntheticCodeId", 0);
        setField(term98827, term98827.getClass(), "recentChange", null);
        setField(term98827, term98827.getClass(), "codeChangeHandlers", null);
        setField(term98827, term98827.getClass(), "synthesizedExternsInput", null);
        setField(term98827, term98827.getClass(), "stage", null);
        setField(term98826, term98826.getClass(), "compiler", term98827);
        setField(term98826, term98826.getClass(), "preprocessorSymbolTable", null);
        setField(term98826, term98826.getClass(), "transformationHandler", null);
        term98828 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98829 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term98828, term98828.getClass(), "number", 0.0);
        setIntField(term98828, term98828.getClass(), "type", 0);
        setField(term98828, term98828.getClass(), "next", null);
        setDoubleField(term98829, term98829.getClass(), "number", 0.0);
        setIntField(term98829, term98829.getClass(), "type", 0);
        setDoubleField(term98830, term98830.getClass(), "number", 0.0);
        setIntField(term98830, term98830.getClass(), "type", 0);
        setField(term98830, term98830.getClass(), "next", null);
        setField(term98830, term98830.getClass(), "first", null);
        setField(term98830, term98830.getClass(), "last", null);
        setField(term98830, term98830.getClass(), "propListHead", null);
        setIntField(term98830, term98830.getClass(), "sourcePosition", 0);
        setField(term98830, term98830.getClass(), "jsType", null);
        setField(term98830, term98830.getClass(), "parent", null);
        setField(term98829, term98829.getClass(), "next", term98830);
        setDoubleField(term98831, term98831.getClass(), "number", 0.0);
        setIntField(term98831, term98831.getClass(), "type", 0);
        setField(term98831, term98831.getClass(), "next", null);
        setField(term98831, term98831.getClass(), "first", null);
        setField(term98831, term98831.getClass(), "last", null);
        setField(term98831, term98831.getClass(), "propListHead", null);
        setIntField(term98831, term98831.getClass(), "sourcePosition", 0);
        setField(term98831, term98831.getClass(), "jsType", null);
        setField(term98831, term98831.getClass(), "parent", null);
        setField(term98829, term98829.getClass(), "first", term98831);
        setField(term98829, term98829.getClass(), "last", null);
        setField(term98829, term98829.getClass(), "propListHead", null);
        setIntField(term98829, term98829.getClass(), "sourcePosition", 0);
        setField(term98829, term98829.getClass(), "jsType", null);
        setField(term98829, term98829.getClass(), "parent", null);
        setField(term98828, term98828.getClass(), "first", term98829);
        setField(term98828, term98828.getClass(), "last", null);
        setField(term98828, term98828.getClass(), "propListHead", null);
        setIntField(term98828, term98828.getClass(), "sourcePosition", 0);
        setField(term98828, term98828.getClass(), "jsType", null);
        setField(term98828, term98828.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term97839;
        callMethod(klass, "process", argTypes, term97667, args);
        assertTrue(recursiveEquals(term97667, term98826));
        assertTrue(recursiveEquals(term97839, null));
    }

};


