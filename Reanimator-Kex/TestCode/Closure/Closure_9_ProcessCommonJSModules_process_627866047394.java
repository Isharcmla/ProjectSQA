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

public class ProcessCommonJSModules_process_627866047394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214351;
     Object term214523;
     Object term216197;
     Object term216199;

    public ProcessCommonJSModules_process_627866047394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214351 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term214431 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term214351, term214351.getClass(), "compiler", term214431);
        term214523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term214777 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term214523, term214523.getClass(), "type", 0);
        setField(term214523, term214523.getClass(), "parent", null);
        setField(term214615, term214615.getClass(), "next", term214685);
        setIntField(term214615, term214615.getClass(), "type", 33);
        setField(term214869, term214869.getClass(), "next", null);
        setIntField(term214869, term214869.getClass(), "type", 0);
        setField(term214869, term214869.getClass(), "first", null);
        setField(term214777, term214777.getClass(), "next", term214869);
        setIntField(term214777, term214777.getClass(), "type", 0);
        setField(term214777, term214777.getClass(), "first", null);
        setField(term214615, term214615.getClass(), "first", term214777);
        setField(term214523, term214523.getClass(), "first", term214615);
        term216197 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term216198 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term216198, term216198.getClass(), "options", null);
        setField(term216198, term216198.getClass(), "passes", null);
        setField(term216198, term216198.getClass(), "externs", null);
        setField(term216198, term216198.getClass(), "modules", null);
        setField(term216198, term216198.getClass(), "moduleGraph", null);
        setField(term216198, term216198.getClass(), "inputs", null);
        setField(term216198, term216198.getClass(), "errorManager", null);
        setField(term216198, term216198.getClass(), "warningsGuard", null);
        setField(term216198, term216198.getClass(), "injectedLibraries", null);
        setField(term216198, term216198.getClass(), "externsRoot", null);
        setField(term216198, term216198.getClass(), "jsRoot", null);
        setField(term216198, term216198.getClass(), "externAndJsRoot", null);
        setField(term216198, term216198.getClass(), "inputsById", null);
        setField(term216198, term216198.getClass(), "sourceMap", null);
        setField(term216198, term216198.getClass(), "externExports", null);
        setIntField(term216198, term216198.getClass(), "uniqueNameId", 0);
        setBooleanField(term216198, term216198.getClass(), "hasRegExpGlobalReferences", false);
        setField(term216198, term216198.getClass(), "functionInformationMap", null);
        setField(term216198, term216198.getClass(), "debugLog", null);
        setField(term216198, term216198.getClass(), "defaultCodingConvention", null);
        setField(term216198, term216198.getClass(), "typeRegistry", null);
        setField(term216198, term216198.getClass(), "parserConfig", null);
        setField(term216198, term216198.getClass(), "abstractInterpreter", null);
        setField(term216198, term216198.getClass(), "typeValidator", null);
        setField(term216198, term216198.getClass(), "tracker", null);
        setField(term216198, term216198.getClass(), "oldErrorReporter", null);
        setField(term216198, term216198.getClass(), "defaultErrorReporter", null);
        setField(term216198, term216198.getClass(), "compilerThread", null);
        setBooleanField(term216198, term216198.getClass(), "useThreads", false);
        setField(term216198, term216198.getClass(), "outStream", null);
        setField(term216198, term216198.getClass(), "globalRefMap", null);
        setDoubleField(term216198, term216198.getClass(), "progress", 0.0);
        setField(term216198, term216198.getClass(), "lastPassName", null);
        setField(term216198, term216198.getClass(), "sanityCheck", null);
        setField(term216198, term216198.getClass(), "currentTracer", null);
        setField(term216198, term216198.getClass(), "currentPassName", null);
        setIntField(term216198, term216198.getClass(), "syntheticCodeId", 0);
        setField(term216198, term216198.getClass(), "recentChange", null);
        setField(term216198, term216198.getClass(), "codeChangeHandlers", null);
        setField(term216198, term216198.getClass(), "synthesizedExternsInput", null);
        setField(term216198, term216198.getClass(), "stage", null);
        setField(term216197, term216197.getClass(), "compiler", term216198);
        setField(term216197, term216197.getClass(), "filenamePrefix", null);
        setBooleanField(term216197, term216197.getClass(), "reportDependencies", false);
        setField(term216197, term216197.getClass(), "module", null);
        term216199 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term216199, term216199.getClass(), "number", 0.0);
        setIntField(term216199, term216199.getClass(), "type", 0);
        setField(term216199, term216199.getClass(), "next", null);
        setDoubleField(term216200, term216200.getClass(), "number", 0.0);
        setIntField(term216200, term216200.getClass(), "type", 33);
        setIntField(term216201, term216201.getClass(), "type", 0);
        setField(term216201, term216201.getClass(), "next", null);
        setField(term216201, term216201.getClass(), "first", null);
        setField(term216201, term216201.getClass(), "last", null);
        setField(term216201, term216201.getClass(), "propListHead", null);
        setIntField(term216201, term216201.getClass(), "sourcePosition", 0);
        setField(term216201, term216201.getClass(), "jsType", null);
        setField(term216201, term216201.getClass(), "parent", null);
        setField(term216200, term216200.getClass(), "next", term216201);
        setDoubleField(term216202, term216202.getClass(), "number", 0.0);
        setIntField(term216202, term216202.getClass(), "type", 0);
        setDoubleField(term216203, term216203.getClass(), "number", 0.0);
        setIntField(term216203, term216203.getClass(), "type", 0);
        setField(term216203, term216203.getClass(), "next", null);
        setField(term216203, term216203.getClass(), "first", null);
        setField(term216203, term216203.getClass(), "last", null);
        setField(term216203, term216203.getClass(), "propListHead", null);
        setIntField(term216203, term216203.getClass(), "sourcePosition", 0);
        setField(term216203, term216203.getClass(), "jsType", null);
        setField(term216203, term216203.getClass(), "parent", null);
        setField(term216202, term216202.getClass(), "next", term216203);
        setField(term216202, term216202.getClass(), "first", null);
        setField(term216202, term216202.getClass(), "last", null);
        setField(term216202, term216202.getClass(), "propListHead", null);
        setIntField(term216202, term216202.getClass(), "sourcePosition", 0);
        setField(term216202, term216202.getClass(), "jsType", null);
        setField(term216202, term216202.getClass(), "parent", null);
        setField(term216200, term216200.getClass(), "first", term216202);
        setField(term216200, term216200.getClass(), "last", null);
        setField(term216200, term216200.getClass(), "propListHead", null);
        setIntField(term216200, term216200.getClass(), "sourcePosition", 0);
        setField(term216200, term216200.getClass(), "jsType", null);
        setField(term216200, term216200.getClass(), "parent", null);
        setField(term216199, term216199.getClass(), "first", term216200);
        setField(term216199, term216199.getClass(), "last", null);
        setField(term216199, term216199.getClass(), "propListHead", null);
        setIntField(term216199, term216199.getClass(), "sourcePosition", 0);
        setField(term216199, term216199.getClass(), "jsType", null);
        setField(term216199, term216199.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term214523;
        callMethod(klass, "process", argTypes, term214351, args);
        assertTrue(recursiveEquals(term214351, term216197));
        assertTrue(recursiveEquals(term214523, null));
    }

};


