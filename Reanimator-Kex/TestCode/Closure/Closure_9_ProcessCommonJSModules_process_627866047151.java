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

public class ProcessCommonJSModules_process_627866047151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71546;
     Object term71718;
     Object term73082;
     Object term73084;

    public ProcessCommonJSModules_process_627866047151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71546 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term71626 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71546, term71546.getClass(), "compiler", term71626);
        term71718 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71810 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71902 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term71718, term71718.getClass(), "type", 0);
        setField(term71718, term71718.getClass(), "parent", null);
        setField(term71902, term71902.getClass(), "next", term71972);
        setIntField(term71902, term71902.getClass(), "type", 37);
        setField(term71902, term71902.getClass(), "first", null);
        setField(term71810, term71810.getClass(), "next", term71902);
        setIntField(term71810, term71810.getClass(), "type", 0);
        setField(term72064, term72064.getClass(), "next", null);
        setIntField(term72064, term72064.getClass(), "type", 37);
        setField(term72064, term72064.getClass(), "first", null);
        setField(term71810, term71810.getClass(), "first", term72064);
        setField(term71718, term71718.getClass(), "first", term71810);
        term73082 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term73083 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term73083, term73083.getClass(), "options", null);
        setField(term73083, term73083.getClass(), "passes", null);
        setField(term73083, term73083.getClass(), "externs", null);
        setField(term73083, term73083.getClass(), "modules", null);
        setField(term73083, term73083.getClass(), "moduleGraph", null);
        setField(term73083, term73083.getClass(), "inputs", null);
        setField(term73083, term73083.getClass(), "errorManager", null);
        setField(term73083, term73083.getClass(), "warningsGuard", null);
        setField(term73083, term73083.getClass(), "injectedLibraries", null);
        setField(term73083, term73083.getClass(), "externsRoot", null);
        setField(term73083, term73083.getClass(), "jsRoot", null);
        setField(term73083, term73083.getClass(), "externAndJsRoot", null);
        setField(term73083, term73083.getClass(), "inputsById", null);
        setField(term73083, term73083.getClass(), "sourceMap", null);
        setField(term73083, term73083.getClass(), "externExports", null);
        setIntField(term73083, term73083.getClass(), "uniqueNameId", 0);
        setBooleanField(term73083, term73083.getClass(), "hasRegExpGlobalReferences", false);
        setField(term73083, term73083.getClass(), "functionInformationMap", null);
        setField(term73083, term73083.getClass(), "debugLog", null);
        setField(term73083, term73083.getClass(), "defaultCodingConvention", null);
        setField(term73083, term73083.getClass(), "typeRegistry", null);
        setField(term73083, term73083.getClass(), "parserConfig", null);
        setField(term73083, term73083.getClass(), "abstractInterpreter", null);
        setField(term73083, term73083.getClass(), "typeValidator", null);
        setField(term73083, term73083.getClass(), "tracker", null);
        setField(term73083, term73083.getClass(), "oldErrorReporter", null);
        setField(term73083, term73083.getClass(), "defaultErrorReporter", null);
        setField(term73083, term73083.getClass(), "compilerThread", null);
        setBooleanField(term73083, term73083.getClass(), "useThreads", false);
        setField(term73083, term73083.getClass(), "outStream", null);
        setField(term73083, term73083.getClass(), "globalRefMap", null);
        setDoubleField(term73083, term73083.getClass(), "progress", 0.0);
        setField(term73083, term73083.getClass(), "lastPassName", null);
        setField(term73083, term73083.getClass(), "sanityCheck", null);
        setField(term73083, term73083.getClass(), "currentTracer", null);
        setField(term73083, term73083.getClass(), "currentPassName", null);
        setIntField(term73083, term73083.getClass(), "syntheticCodeId", 0);
        setField(term73083, term73083.getClass(), "recentChange", null);
        setField(term73083, term73083.getClass(), "codeChangeHandlers", null);
        setField(term73083, term73083.getClass(), "synthesizedExternsInput", null);
        setField(term73083, term73083.getClass(), "stage", null);
        setField(term73082, term73082.getClass(), "compiler", term73083);
        setField(term73082, term73082.getClass(), "filenamePrefix", null);
        setBooleanField(term73082, term73082.getClass(), "reportDependencies", false);
        setField(term73082, term73082.getClass(), "module", null);
        term73084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73086 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term73084, term73084.getClass(), "number", 0.0);
        setIntField(term73084, term73084.getClass(), "type", 0);
        setField(term73084, term73084.getClass(), "next", null);
        setDoubleField(term73085, term73085.getClass(), "number", 0.0);
        setIntField(term73085, term73085.getClass(), "type", 0);
        setDoubleField(term73086, term73086.getClass(), "number", 0.0);
        setIntField(term73086, term73086.getClass(), "type", 37);
        setIntField(term73087, term73087.getClass(), "type", 0);
        setField(term73087, term73087.getClass(), "next", null);
        setField(term73087, term73087.getClass(), "first", null);
        setField(term73087, term73087.getClass(), "last", null);
        setField(term73087, term73087.getClass(), "propListHead", null);
        setIntField(term73087, term73087.getClass(), "sourcePosition", 0);
        setField(term73087, term73087.getClass(), "jsType", null);
        setField(term73087, term73087.getClass(), "parent", null);
        setField(term73086, term73086.getClass(), "next", term73087);
        setField(term73086, term73086.getClass(), "first", null);
        setField(term73086, term73086.getClass(), "last", null);
        setField(term73086, term73086.getClass(), "propListHead", null);
        setIntField(term73086, term73086.getClass(), "sourcePosition", 0);
        setField(term73086, term73086.getClass(), "jsType", null);
        setField(term73086, term73086.getClass(), "parent", null);
        setField(term73085, term73085.getClass(), "next", term73086);
        setDoubleField(term73088, term73088.getClass(), "number", 0.0);
        setIntField(term73088, term73088.getClass(), "type", 37);
        setField(term73088, term73088.getClass(), "next", null);
        setField(term73088, term73088.getClass(), "first", null);
        setField(term73088, term73088.getClass(), "last", null);
        setField(term73088, term73088.getClass(), "propListHead", null);
        setIntField(term73088, term73088.getClass(), "sourcePosition", 0);
        setField(term73088, term73088.getClass(), "jsType", null);
        setField(term73088, term73088.getClass(), "parent", null);
        setField(term73085, term73085.getClass(), "first", term73088);
        setField(term73085, term73085.getClass(), "last", null);
        setField(term73085, term73085.getClass(), "propListHead", null);
        setIntField(term73085, term73085.getClass(), "sourcePosition", 0);
        setField(term73085, term73085.getClass(), "jsType", null);
        setField(term73085, term73085.getClass(), "parent", null);
        setField(term73084, term73084.getClass(), "first", term73085);
        setField(term73084, term73084.getClass(), "last", null);
        setField(term73084, term73084.getClass(), "propListHead", null);
        setIntField(term73084, term73084.getClass(), "sourcePosition", 0);
        setField(term73084, term73084.getClass(), "jsType", null);
        setField(term73084, term73084.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term71718;
        callMethod(klass, "process", argTypes, term71546, args);
        assertTrue(recursiveEquals(term71546, term73082));
        assertTrue(recursiveEquals(term71718, null));
    }

};


