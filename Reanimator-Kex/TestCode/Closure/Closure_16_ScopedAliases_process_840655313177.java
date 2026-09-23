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

public class ScopedAliases_process_840655313177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106924;
     Object term107096;
     Object term108452;
     Object term108454;

    public ScopedAliases_process_840655313177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106924 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term107004 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term106924, term106924.getClass(), "compiler", term107004);
        term107096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107280 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term107096, term107096.getClass(), "type", 0);
        setField(term107096, term107096.getClass(), "parent", null);
        setField(term107280, term107280.getClass(), "next", null);
        setIntField(term107280, term107280.getClass(), "type", 0);
        setField(term107280, term107280.getClass(), "first", null);
        setField(term107188, term107188.getClass(), "next", term107280);
        setIntField(term107188, term107188.getClass(), "type", 0);
        setField(term107372, term107372.getClass(), "next", null);
        setIntField(term107372, term107372.getClass(), "type", 0);
        setField(term107372, term107372.getClass(), "first", null);
        setField(term107188, term107188.getClass(), "first", term107372);
        setField(term107096, term107096.getClass(), "first", term107188);
        term108452 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term108453 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term108453, term108453.getClass(), "options", null);
        setField(term108453, term108453.getClass(), "passes", null);
        setField(term108453, term108453.getClass(), "externs", null);
        setField(term108453, term108453.getClass(), "modules", null);
        setField(term108453, term108453.getClass(), "moduleGraph", null);
        setField(term108453, term108453.getClass(), "inputs", null);
        setField(term108453, term108453.getClass(), "errorManager", null);
        setField(term108453, term108453.getClass(), "warningsGuard", null);
        setField(term108453, term108453.getClass(), "injectedLibraries", null);
        setField(term108453, term108453.getClass(), "externsRoot", null);
        setField(term108453, term108453.getClass(), "jsRoot", null);
        setField(term108453, term108453.getClass(), "externAndJsRoot", null);
        setField(term108453, term108453.getClass(), "inputsById", null);
        setField(term108453, term108453.getClass(), "sourceMap", null);
        setField(term108453, term108453.getClass(), "externExports", null);
        setIntField(term108453, term108453.getClass(), "uniqueNameId", 0);
        setBooleanField(term108453, term108453.getClass(), "useThreads", false);
        setBooleanField(term108453, term108453.getClass(), "hasRegExpGlobalReferences", false);
        setField(term108453, term108453.getClass(), "functionInformationMap", null);
        setField(term108453, term108453.getClass(), "debugLog", null);
        setField(term108453, term108453.getClass(), "defaultCodingConvention", null);
        setField(term108453, term108453.getClass(), "typeRegistry", null);
        setField(term108453, term108453.getClass(), "parserConfig", null);
        setField(term108453, term108453.getClass(), "abstractInterpreter", null);
        setField(term108453, term108453.getClass(), "typeValidator", null);
        setField(term108453, term108453.getClass(), "tracker", null);
        setField(term108453, term108453.getClass(), "oldErrorReporter", null);
        setField(term108453, term108453.getClass(), "defaultErrorReporter", null);
        setField(term108453, term108453.getClass(), "outStream", null);
        setField(term108453, term108453.getClass(), "globalRefMap", null);
        setDoubleField(term108453, term108453.getClass(), "progress", 0.0);
        setField(term108453, term108453.getClass(), "sanityCheck", null);
        setField(term108453, term108453.getClass(), "currentTracer", null);
        setField(term108453, term108453.getClass(), "currentPassName", null);
        setIntField(term108453, term108453.getClass(), "syntheticCodeId", 0);
        setField(term108453, term108453.getClass(), "recentChange", null);
        setField(term108453, term108453.getClass(), "codeChangeHandlers", null);
        setField(term108453, term108453.getClass(), "synthesizedExternsInput", null);
        setField(term108453, term108453.getClass(), "stage", null);
        setField(term108452, term108452.getClass(), "compiler", term108453);
        setField(term108452, term108452.getClass(), "preprocessorSymbolTable", null);
        setField(term108452, term108452.getClass(), "transformationHandler", null);
        term108454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108456 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term108454, term108454.getClass(), "number", 0.0);
        setIntField(term108454, term108454.getClass(), "type", 0);
        setField(term108454, term108454.getClass(), "next", null);
        setDoubleField(term108455, term108455.getClass(), "number", 0.0);
        setIntField(term108455, term108455.getClass(), "type", 0);
        setDoubleField(term108456, term108456.getClass(), "number", 0.0);
        setIntField(term108456, term108456.getClass(), "type", 0);
        setField(term108456, term108456.getClass(), "next", null);
        setField(term108456, term108456.getClass(), "first", null);
        setField(term108456, term108456.getClass(), "last", null);
        setField(term108456, term108456.getClass(), "propListHead", null);
        setIntField(term108456, term108456.getClass(), "sourcePosition", 0);
        setField(term108456, term108456.getClass(), "jsType", null);
        setField(term108456, term108456.getClass(), "parent", null);
        setField(term108455, term108455.getClass(), "next", term108456);
        setDoubleField(term108457, term108457.getClass(), "number", 0.0);
        setIntField(term108457, term108457.getClass(), "type", 0);
        setField(term108457, term108457.getClass(), "next", null);
        setField(term108457, term108457.getClass(), "first", null);
        setField(term108457, term108457.getClass(), "last", null);
        setField(term108457, term108457.getClass(), "propListHead", null);
        setIntField(term108457, term108457.getClass(), "sourcePosition", 0);
        setField(term108457, term108457.getClass(), "jsType", null);
        setField(term108457, term108457.getClass(), "parent", null);
        setField(term108455, term108455.getClass(), "first", term108457);
        setField(term108455, term108455.getClass(), "last", null);
        setField(term108455, term108455.getClass(), "propListHead", null);
        setIntField(term108455, term108455.getClass(), "sourcePosition", 0);
        setField(term108455, term108455.getClass(), "jsType", null);
        setField(term108455, term108455.getClass(), "parent", null);
        setField(term108454, term108454.getClass(), "first", term108455);
        setField(term108454, term108454.getClass(), "last", null);
        setField(term108454, term108454.getClass(), "propListHead", null);
        setIntField(term108454, term108454.getClass(), "sourcePosition", 0);
        setField(term108454, term108454.getClass(), "jsType", null);
        setField(term108454, term108454.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term107096;
        callMethod(klass, "process", argTypes, term106924, args);
        assertTrue(recursiveEquals(term106924, term108452));
        assertTrue(recursiveEquals(term107096, null));
    }

};


