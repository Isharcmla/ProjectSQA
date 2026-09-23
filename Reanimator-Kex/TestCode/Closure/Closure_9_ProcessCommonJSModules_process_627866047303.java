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

public class ProcessCommonJSModules_process_627866047303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155174;
     Object term155346;
     Object term156123;
     Object term156125;

    public ProcessCommonJSModules_process_627866047303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155174 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term155254 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term155174, term155174.getClass(), "compiler", term155254);
        term155346 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term155438 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term155346, term155346.getClass(), "type", 0);
        setField(term155346, term155346.getClass(), "parent", null);
        setField(term155438, term155438.getClass(), "next", null);
        setIntField(term155438, term155438.getClass(), "type", 37);
        setField(term155438, term155438.getClass(), "first", null);
        setField(term155346, term155346.getClass(), "first", term155438);
        term156123 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term156124 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term156124, term156124.getClass(), "options", null);
        setField(term156124, term156124.getClass(), "passes", null);
        setField(term156124, term156124.getClass(), "externs", null);
        setField(term156124, term156124.getClass(), "modules", null);
        setField(term156124, term156124.getClass(), "moduleGraph", null);
        setField(term156124, term156124.getClass(), "inputs", null);
        setField(term156124, term156124.getClass(), "errorManager", null);
        setField(term156124, term156124.getClass(), "warningsGuard", null);
        setField(term156124, term156124.getClass(), "injectedLibraries", null);
        setField(term156124, term156124.getClass(), "externsRoot", null);
        setField(term156124, term156124.getClass(), "jsRoot", null);
        setField(term156124, term156124.getClass(), "externAndJsRoot", null);
        setField(term156124, term156124.getClass(), "inputsById", null);
        setField(term156124, term156124.getClass(), "sourceMap", null);
        setField(term156124, term156124.getClass(), "externExports", null);
        setIntField(term156124, term156124.getClass(), "uniqueNameId", 0);
        setBooleanField(term156124, term156124.getClass(), "hasRegExpGlobalReferences", false);
        setField(term156124, term156124.getClass(), "functionInformationMap", null);
        setField(term156124, term156124.getClass(), "debugLog", null);
        setField(term156124, term156124.getClass(), "defaultCodingConvention", null);
        setField(term156124, term156124.getClass(), "typeRegistry", null);
        setField(term156124, term156124.getClass(), "parserConfig", null);
        setField(term156124, term156124.getClass(), "abstractInterpreter", null);
        setField(term156124, term156124.getClass(), "typeValidator", null);
        setField(term156124, term156124.getClass(), "tracker", null);
        setField(term156124, term156124.getClass(), "oldErrorReporter", null);
        setField(term156124, term156124.getClass(), "defaultErrorReporter", null);
        setField(term156124, term156124.getClass(), "compilerThread", null);
        setBooleanField(term156124, term156124.getClass(), "useThreads", false);
        setField(term156124, term156124.getClass(), "outStream", null);
        setField(term156124, term156124.getClass(), "globalRefMap", null);
        setDoubleField(term156124, term156124.getClass(), "progress", 0.0);
        setField(term156124, term156124.getClass(), "lastPassName", null);
        setField(term156124, term156124.getClass(), "sanityCheck", null);
        setField(term156124, term156124.getClass(), "currentTracer", null);
        setField(term156124, term156124.getClass(), "currentPassName", null);
        setIntField(term156124, term156124.getClass(), "syntheticCodeId", 0);
        setField(term156124, term156124.getClass(), "recentChange", null);
        setField(term156124, term156124.getClass(), "codeChangeHandlers", null);
        setField(term156124, term156124.getClass(), "synthesizedExternsInput", null);
        setField(term156124, term156124.getClass(), "stage", null);
        setField(term156123, term156123.getClass(), "compiler", term156124);
        setField(term156123, term156123.getClass(), "filenamePrefix", null);
        setBooleanField(term156123, term156123.getClass(), "reportDependencies", false);
        setField(term156123, term156123.getClass(), "module", null);
        term156125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term156125, term156125.getClass(), "number", 0.0);
        setIntField(term156125, term156125.getClass(), "type", 0);
        setField(term156125, term156125.getClass(), "next", null);
        setDoubleField(term156126, term156126.getClass(), "number", 0.0);
        setIntField(term156126, term156126.getClass(), "type", 37);
        setField(term156126, term156126.getClass(), "next", null);
        setField(term156126, term156126.getClass(), "first", null);
        setField(term156126, term156126.getClass(), "last", null);
        setField(term156126, term156126.getClass(), "propListHead", null);
        setIntField(term156126, term156126.getClass(), "sourcePosition", 0);
        setField(term156126, term156126.getClass(), "jsType", null);
        setField(term156126, term156126.getClass(), "parent", null);
        setField(term156125, term156125.getClass(), "first", term156126);
        setField(term156125, term156125.getClass(), "last", null);
        setField(term156125, term156125.getClass(), "propListHead", null);
        setIntField(term156125, term156125.getClass(), "sourcePosition", 0);
        setField(term156125, term156125.getClass(), "jsType", null);
        setField(term156125, term156125.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term155346;
        callMethod(klass, "process", argTypes, term155174, args);
        assertTrue(recursiveEquals(term155174, term156123));
        assertTrue(recursiveEquals(term155346, null));
    }

};


