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

public class ScopedAliases_process_840655313282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182016;
     Object term182188;
     Object term183760;
     Object term183762;

    public ScopedAliases_process_840655313282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182016 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term182096 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term182016, term182016.getClass(), "compiler", term182096);
        term182188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term182280 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term182350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term182512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term182188, term182188.getClass(), "type", 0);
        setField(term182188, term182188.getClass(), "parent", null);
        setField(term182280, term182280.getClass(), "next", term182350);
        setIntField(term182280, term182280.getClass(), "type", 0);
        setField(term182442, term182442.getClass(), "next", term182512);
        setIntField(term182442, term182442.getClass(), "type", 0);
        setField(term182442, term182442.getClass(), "first", null);
        setField(term182280, term182280.getClass(), "first", term182442);
        setField(term182188, term182188.getClass(), "first", term182280);
        term183760 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term183761 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term183761, term183761.getClass(), "options", null);
        setField(term183761, term183761.getClass(), "passes", null);
        setField(term183761, term183761.getClass(), "externs", null);
        setField(term183761, term183761.getClass(), "modules", null);
        setField(term183761, term183761.getClass(), "moduleGraph", null);
        setField(term183761, term183761.getClass(), "inputs", null);
        setField(term183761, term183761.getClass(), "errorManager", null);
        setField(term183761, term183761.getClass(), "warningsGuard", null);
        setField(term183761, term183761.getClass(), "injectedLibraries", null);
        setField(term183761, term183761.getClass(), "externsRoot", null);
        setField(term183761, term183761.getClass(), "jsRoot", null);
        setField(term183761, term183761.getClass(), "externAndJsRoot", null);
        setField(term183761, term183761.getClass(), "inputsById", null);
        setField(term183761, term183761.getClass(), "sourceMap", null);
        setField(term183761, term183761.getClass(), "externExports", null);
        setIntField(term183761, term183761.getClass(), "uniqueNameId", 0);
        setBooleanField(term183761, term183761.getClass(), "useThreads", false);
        setBooleanField(term183761, term183761.getClass(), "hasRegExpGlobalReferences", false);
        setField(term183761, term183761.getClass(), "functionInformationMap", null);
        setField(term183761, term183761.getClass(), "debugLog", null);
        setField(term183761, term183761.getClass(), "defaultCodingConvention", null);
        setField(term183761, term183761.getClass(), "typeRegistry", null);
        setField(term183761, term183761.getClass(), "parserConfig", null);
        setField(term183761, term183761.getClass(), "abstractInterpreter", null);
        setField(term183761, term183761.getClass(), "typeValidator", null);
        setField(term183761, term183761.getClass(), "tracker", null);
        setField(term183761, term183761.getClass(), "oldErrorReporter", null);
        setField(term183761, term183761.getClass(), "defaultErrorReporter", null);
        setField(term183761, term183761.getClass(), "outStream", null);
        setField(term183761, term183761.getClass(), "globalRefMap", null);
        setDoubleField(term183761, term183761.getClass(), "progress", 0.0);
        setField(term183761, term183761.getClass(), "sanityCheck", null);
        setField(term183761, term183761.getClass(), "currentTracer", null);
        setField(term183761, term183761.getClass(), "currentPassName", null);
        setIntField(term183761, term183761.getClass(), "syntheticCodeId", 0);
        setField(term183761, term183761.getClass(), "recentChange", null);
        setField(term183761, term183761.getClass(), "codeChangeHandlers", null);
        setField(term183761, term183761.getClass(), "synthesizedExternsInput", null);
        setField(term183761, term183761.getClass(), "stage", null);
        setField(term183760, term183760.getClass(), "compiler", term183761);
        setField(term183760, term183760.getClass(), "preprocessorSymbolTable", null);
        setField(term183760, term183760.getClass(), "transformationHandler", null);
        term183762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term183765 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term183762, term183762.getClass(), "number", 0.0);
        setIntField(term183762, term183762.getClass(), "type", 0);
        setField(term183762, term183762.getClass(), "next", null);
        setDoubleField(term183763, term183763.getClass(), "number", 0.0);
        setIntField(term183763, term183763.getClass(), "type", 0);
        setIntField(term183764, term183764.getClass(), "type", 0);
        setField(term183764, term183764.getClass(), "next", null);
        setField(term183764, term183764.getClass(), "first", null);
        setField(term183764, term183764.getClass(), "last", null);
        setField(term183764, term183764.getClass(), "propListHead", null);
        setIntField(term183764, term183764.getClass(), "sourcePosition", 0);
        setField(term183764, term183764.getClass(), "jsType", null);
        setField(term183764, term183764.getClass(), "parent", null);
        setField(term183763, term183763.getClass(), "next", term183764);
        setDoubleField(term183765, term183765.getClass(), "number", 0.0);
        setIntField(term183765, term183765.getClass(), "type", 0);
        setIntField(term183766, term183766.getClass(), "type", 0);
        setField(term183766, term183766.getClass(), "next", null);
        setField(term183766, term183766.getClass(), "first", null);
        setField(term183766, term183766.getClass(), "last", null);
        setField(term183766, term183766.getClass(), "propListHead", null);
        setIntField(term183766, term183766.getClass(), "sourcePosition", 0);
        setField(term183766, term183766.getClass(), "jsType", null);
        setField(term183766, term183766.getClass(), "parent", null);
        setField(term183765, term183765.getClass(), "next", term183766);
        setField(term183765, term183765.getClass(), "first", null);
        setField(term183765, term183765.getClass(), "last", null);
        setField(term183765, term183765.getClass(), "propListHead", null);
        setIntField(term183765, term183765.getClass(), "sourcePosition", 0);
        setField(term183765, term183765.getClass(), "jsType", null);
        setField(term183765, term183765.getClass(), "parent", null);
        setField(term183763, term183763.getClass(), "first", term183765);
        setField(term183763, term183763.getClass(), "last", null);
        setField(term183763, term183763.getClass(), "propListHead", null);
        setIntField(term183763, term183763.getClass(), "sourcePosition", 0);
        setField(term183763, term183763.getClass(), "jsType", null);
        setField(term183763, term183763.getClass(), "parent", null);
        setField(term183762, term183762.getClass(), "first", term183763);
        setField(term183762, term183762.getClass(), "last", null);
        setField(term183762, term183762.getClass(), "propListHead", null);
        setIntField(term183762, term183762.getClass(), "sourcePosition", 0);
        setField(term183762, term183762.getClass(), "jsType", null);
        setField(term183762, term183762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term182188;
        callMethod(klass, "process", argTypes, term182016, args);
        assertTrue(recursiveEquals(term182016, term183760));
        assertTrue(recursiveEquals(term182188, null));
    }

};


