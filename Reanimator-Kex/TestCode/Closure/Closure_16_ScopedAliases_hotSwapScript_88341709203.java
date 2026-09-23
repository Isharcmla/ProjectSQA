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

public class ScopedAliases_hotSwapScript_88341709203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123382;
     Object term123532;
     Object term125008;
     Object term125010;

    public ScopedAliases_hotSwapScript_88341709203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123382 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term123462 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term123382, term123382.getClass(), "compiler", term123462);
        term123532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123532, term123532.getClass(), "type", 0);
        setField(term123532, term123532.getClass(), "parent", null);
        setField(term123602, term123602.getClass(), "next", term123672);
        setIntField(term123602, term123602.getClass(), "type", 0);
        setField(term123812, term123812.getClass(), "next", term123882);
        setIntField(term123812, term123812.getClass(), "type", 132);
        setField(term123742, term123742.getClass(), "next", term123812);
        setIntField(term123742, term123742.getClass(), "type", 0);
        setField(term123952, term123952.getClass(), "next", null);
        setIntField(term123952, term123952.getClass(), "type", 0);
        setField(term123952, term123952.getClass(), "first", null);
        setField(term123742, term123742.getClass(), "first", term123952);
        setField(term123602, term123602.getClass(), "first", term123742);
        setField(term123532, term123532.getClass(), "first", term123602);
        term125008 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term125009 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term125009, term125009.getClass(), "options", null);
        setField(term125009, term125009.getClass(), "passes", null);
        setField(term125009, term125009.getClass(), "externs", null);
        setField(term125009, term125009.getClass(), "modules", null);
        setField(term125009, term125009.getClass(), "moduleGraph", null);
        setField(term125009, term125009.getClass(), "inputs", null);
        setField(term125009, term125009.getClass(), "errorManager", null);
        setField(term125009, term125009.getClass(), "warningsGuard", null);
        setField(term125009, term125009.getClass(), "injectedLibraries", null);
        setField(term125009, term125009.getClass(), "externsRoot", null);
        setField(term125009, term125009.getClass(), "jsRoot", null);
        setField(term125009, term125009.getClass(), "externAndJsRoot", null);
        setField(term125009, term125009.getClass(), "inputsById", null);
        setField(term125009, term125009.getClass(), "sourceMap", null);
        setField(term125009, term125009.getClass(), "externExports", null);
        setIntField(term125009, term125009.getClass(), "uniqueNameId", 0);
        setBooleanField(term125009, term125009.getClass(), "useThreads", false);
        setBooleanField(term125009, term125009.getClass(), "hasRegExpGlobalReferences", false);
        setField(term125009, term125009.getClass(), "functionInformationMap", null);
        setField(term125009, term125009.getClass(), "debugLog", null);
        setField(term125009, term125009.getClass(), "defaultCodingConvention", null);
        setField(term125009, term125009.getClass(), "typeRegistry", null);
        setField(term125009, term125009.getClass(), "parserConfig", null);
        setField(term125009, term125009.getClass(), "abstractInterpreter", null);
        setField(term125009, term125009.getClass(), "typeValidator", null);
        setField(term125009, term125009.getClass(), "tracker", null);
        setField(term125009, term125009.getClass(), "oldErrorReporter", null);
        setField(term125009, term125009.getClass(), "defaultErrorReporter", null);
        setField(term125009, term125009.getClass(), "outStream", null);
        setField(term125009, term125009.getClass(), "globalRefMap", null);
        setDoubleField(term125009, term125009.getClass(), "progress", 0.0);
        setField(term125009, term125009.getClass(), "sanityCheck", null);
        setField(term125009, term125009.getClass(), "currentTracer", null);
        setField(term125009, term125009.getClass(), "currentPassName", null);
        setIntField(term125009, term125009.getClass(), "syntheticCodeId", 0);
        setField(term125009, term125009.getClass(), "recentChange", null);
        setField(term125009, term125009.getClass(), "codeChangeHandlers", null);
        setField(term125009, term125009.getClass(), "synthesizedExternsInput", null);
        setField(term125009, term125009.getClass(), "stage", null);
        setField(term125008, term125008.getClass(), "compiler", term125009);
        setField(term125008, term125008.getClass(), "preprocessorSymbolTable", null);
        setField(term125008, term125008.getClass(), "transformationHandler", null);
        term125010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125010, term125010.getClass(), "type", 0);
        setField(term125010, term125010.getClass(), "next", null);
        setIntField(term125011, term125011.getClass(), "type", 0);
        setIntField(term125012, term125012.getClass(), "type", 0);
        setField(term125012, term125012.getClass(), "next", null);
        setField(term125012, term125012.getClass(), "first", null);
        setField(term125012, term125012.getClass(), "last", null);
        setField(term125012, term125012.getClass(), "propListHead", null);
        setIntField(term125012, term125012.getClass(), "sourcePosition", 0);
        setField(term125012, term125012.getClass(), "jsType", null);
        setField(term125012, term125012.getClass(), "parent", null);
        setField(term125011, term125011.getClass(), "next", term125012);
        setIntField(term125013, term125013.getClass(), "type", 0);
        setIntField(term125014, term125014.getClass(), "type", 132);
        setIntField(term125015, term125015.getClass(), "type", 0);
        setField(term125015, term125015.getClass(), "next", null);
        setField(term125015, term125015.getClass(), "first", null);
        setField(term125015, term125015.getClass(), "last", null);
        setField(term125015, term125015.getClass(), "propListHead", null);
        setIntField(term125015, term125015.getClass(), "sourcePosition", 0);
        setField(term125015, term125015.getClass(), "jsType", null);
        setField(term125015, term125015.getClass(), "parent", null);
        setField(term125014, term125014.getClass(), "next", term125015);
        setField(term125014, term125014.getClass(), "first", null);
        setField(term125014, term125014.getClass(), "last", null);
        setField(term125014, term125014.getClass(), "propListHead", null);
        setIntField(term125014, term125014.getClass(), "sourcePosition", 0);
        setField(term125014, term125014.getClass(), "jsType", null);
        setField(term125014, term125014.getClass(), "parent", null);
        setField(term125013, term125013.getClass(), "next", term125014);
        setIntField(term125016, term125016.getClass(), "type", 0);
        setField(term125016, term125016.getClass(), "next", null);
        setField(term125016, term125016.getClass(), "first", null);
        setField(term125016, term125016.getClass(), "last", null);
        setField(term125016, term125016.getClass(), "propListHead", null);
        setIntField(term125016, term125016.getClass(), "sourcePosition", 0);
        setField(term125016, term125016.getClass(), "jsType", null);
        setField(term125016, term125016.getClass(), "parent", null);
        setField(term125013, term125013.getClass(), "first", term125016);
        setField(term125013, term125013.getClass(), "last", null);
        setField(term125013, term125013.getClass(), "propListHead", null);
        setIntField(term125013, term125013.getClass(), "sourcePosition", 0);
        setField(term125013, term125013.getClass(), "jsType", null);
        setField(term125013, term125013.getClass(), "parent", null);
        setField(term125011, term125011.getClass(), "first", term125013);
        setField(term125011, term125011.getClass(), "last", null);
        setField(term125011, term125011.getClass(), "propListHead", null);
        setIntField(term125011, term125011.getClass(), "sourcePosition", 0);
        setField(term125011, term125011.getClass(), "jsType", null);
        setField(term125011, term125011.getClass(), "parent", null);
        setField(term125010, term125010.getClass(), "first", term125011);
        setField(term125010, term125010.getClass(), "last", null);
        setField(term125010, term125010.getClass(), "propListHead", null);
        setIntField(term125010, term125010.getClass(), "sourcePosition", 0);
        setField(term125010, term125010.getClass(), "jsType", null);
        setField(term125010, term125010.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term123532;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term123382, args);
        assertTrue(recursiveEquals(term123382, term125008));
        assertTrue(recursiveEquals(term123532, term125010));
    }

};


