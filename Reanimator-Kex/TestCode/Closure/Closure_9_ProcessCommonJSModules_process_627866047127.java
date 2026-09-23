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

public class ProcessCommonJSModules_process_627866047127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58007;
     Object term58157;
     Object term59288;
     Object term59290;

    public ProcessCommonJSModules_process_627866047127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58007 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term58087 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58007, term58007.getClass(), "compiler", term58087);
        term58157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58433 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58157, term58157.getClass(), "type", 0);
        setField(term58157, term58157.getClass(), "parent", null);
        setField(term58249, term58249.getClass(), "next", null);
        setIntField(term58249, term58249.getClass(), "type", 0);
        setField(term58433, term58433.getClass(), "next", term58503);
        setIntField(term58433, term58433.getClass(), "type", 37);
        setField(term58433, term58433.getClass(), "first", null);
        setField(term58341, term58341.getClass(), "next", term58433);
        setIntField(term58341, term58341.getClass(), "type", 37);
        setField(term58341, term58341.getClass(), "first", null);
        setField(term58249, term58249.getClass(), "first", term58341);
        setField(term58157, term58157.getClass(), "first", term58249);
        term59288 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term59289 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term59289, term59289.getClass(), "options", null);
        setField(term59289, term59289.getClass(), "passes", null);
        setField(term59289, term59289.getClass(), "externs", null);
        setField(term59289, term59289.getClass(), "modules", null);
        setField(term59289, term59289.getClass(), "moduleGraph", null);
        setField(term59289, term59289.getClass(), "inputs", null);
        setField(term59289, term59289.getClass(), "errorManager", null);
        setField(term59289, term59289.getClass(), "warningsGuard", null);
        setField(term59289, term59289.getClass(), "injectedLibraries", null);
        setField(term59289, term59289.getClass(), "externsRoot", null);
        setField(term59289, term59289.getClass(), "jsRoot", null);
        setField(term59289, term59289.getClass(), "externAndJsRoot", null);
        setField(term59289, term59289.getClass(), "inputsById", null);
        setField(term59289, term59289.getClass(), "sourceMap", null);
        setField(term59289, term59289.getClass(), "externExports", null);
        setIntField(term59289, term59289.getClass(), "uniqueNameId", 0);
        setBooleanField(term59289, term59289.getClass(), "hasRegExpGlobalReferences", false);
        setField(term59289, term59289.getClass(), "functionInformationMap", null);
        setField(term59289, term59289.getClass(), "debugLog", null);
        setField(term59289, term59289.getClass(), "defaultCodingConvention", null);
        setField(term59289, term59289.getClass(), "typeRegistry", null);
        setField(term59289, term59289.getClass(), "parserConfig", null);
        setField(term59289, term59289.getClass(), "abstractInterpreter", null);
        setField(term59289, term59289.getClass(), "typeValidator", null);
        setField(term59289, term59289.getClass(), "tracker", null);
        setField(term59289, term59289.getClass(), "oldErrorReporter", null);
        setField(term59289, term59289.getClass(), "defaultErrorReporter", null);
        setField(term59289, term59289.getClass(), "compilerThread", null);
        setBooleanField(term59289, term59289.getClass(), "useThreads", false);
        setField(term59289, term59289.getClass(), "outStream", null);
        setField(term59289, term59289.getClass(), "globalRefMap", null);
        setDoubleField(term59289, term59289.getClass(), "progress", 0.0);
        setField(term59289, term59289.getClass(), "lastPassName", null);
        setField(term59289, term59289.getClass(), "sanityCheck", null);
        setField(term59289, term59289.getClass(), "currentTracer", null);
        setField(term59289, term59289.getClass(), "currentPassName", null);
        setIntField(term59289, term59289.getClass(), "syntheticCodeId", 0);
        setField(term59289, term59289.getClass(), "recentChange", null);
        setField(term59289, term59289.getClass(), "codeChangeHandlers", null);
        setField(term59289, term59289.getClass(), "synthesizedExternsInput", null);
        setField(term59289, term59289.getClass(), "stage", null);
        setField(term59288, term59288.getClass(), "compiler", term59289);
        setField(term59288, term59288.getClass(), "filenamePrefix", null);
        setBooleanField(term59288, term59288.getClass(), "reportDependencies", false);
        setField(term59288, term59288.getClass(), "module", null);
        term59290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59292 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59293 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59290, term59290.getClass(), "type", 0);
        setField(term59290, term59290.getClass(), "next", null);
        setDoubleField(term59291, term59291.getClass(), "number", 0.0);
        setIntField(term59291, term59291.getClass(), "type", 0);
        setField(term59291, term59291.getClass(), "next", null);
        setDoubleField(term59292, term59292.getClass(), "number", 0.0);
        setIntField(term59292, term59292.getClass(), "type", 37);
        setDoubleField(term59293, term59293.getClass(), "number", 0.0);
        setIntField(term59293, term59293.getClass(), "type", 37);
        setIntField(term59294, term59294.getClass(), "type", 0);
        setField(term59294, term59294.getClass(), "next", null);
        setField(term59294, term59294.getClass(), "first", null);
        setField(term59294, term59294.getClass(), "last", null);
        setField(term59294, term59294.getClass(), "propListHead", null);
        setIntField(term59294, term59294.getClass(), "sourcePosition", 0);
        setField(term59294, term59294.getClass(), "jsType", null);
        setField(term59294, term59294.getClass(), "parent", null);
        setField(term59293, term59293.getClass(), "next", term59294);
        setField(term59293, term59293.getClass(), "first", null);
        setField(term59293, term59293.getClass(), "last", null);
        setField(term59293, term59293.getClass(), "propListHead", null);
        setIntField(term59293, term59293.getClass(), "sourcePosition", 0);
        setField(term59293, term59293.getClass(), "jsType", null);
        setField(term59293, term59293.getClass(), "parent", null);
        setField(term59292, term59292.getClass(), "next", term59293);
        setField(term59292, term59292.getClass(), "first", null);
        setField(term59292, term59292.getClass(), "last", null);
        setField(term59292, term59292.getClass(), "propListHead", null);
        setIntField(term59292, term59292.getClass(), "sourcePosition", 0);
        setField(term59292, term59292.getClass(), "jsType", null);
        setField(term59292, term59292.getClass(), "parent", null);
        setField(term59291, term59291.getClass(), "first", term59292);
        setField(term59291, term59291.getClass(), "last", null);
        setField(term59291, term59291.getClass(), "propListHead", null);
        setIntField(term59291, term59291.getClass(), "sourcePosition", 0);
        setField(term59291, term59291.getClass(), "jsType", null);
        setField(term59291, term59291.getClass(), "parent", null);
        setField(term59290, term59290.getClass(), "first", term59291);
        setField(term59290, term59290.getClass(), "last", null);
        setField(term59290, term59290.getClass(), "propListHead", null);
        setIntField(term59290, term59290.getClass(), "sourcePosition", 0);
        setField(term59290, term59290.getClass(), "jsType", null);
        setField(term59290, term59290.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term58157;
        callMethod(klass, "process", argTypes, term58007, args);
        assertTrue(recursiveEquals(term58007, term59288));
        assertTrue(recursiveEquals(term58157, null));
    }

};


