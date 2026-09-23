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

public class ProcessCommonJSModules_process_627866047341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178607;
     Object term178779;
     Object term179880;
     Object term179882;

    public ProcessCommonJSModules_process_627866047341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178607 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term178687 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term178607, term178607.getClass(), "compiler", term178687);
        term178779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178871 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term178779, term178779.getClass(), "type", 33);
        setField(term178779, term178779.getClass(), "parent", null);
        setField(term179033, term179033.getClass(), "next", null);
        setIntField(term179033, term179033.getClass(), "type", 0);
        setField(term179033, term179033.getClass(), "first", null);
        setField(term178963, term178963.getClass(), "next", term179033);
        setIntField(term178963, term178963.getClass(), "type", 37);
        setField(term178963, term178963.getClass(), "first", null);
        setField(term178871, term178871.getClass(), "next", term178963);
        setIntField(term178871, term178871.getClass(), "type", 37);
        setField(term179125, term179125.getClass(), "next", null);
        setIntField(term179125, term179125.getClass(), "type", 0);
        setField(term179125, term179125.getClass(), "first", null);
        setField(term178871, term178871.getClass(), "first", term179125);
        setField(term178779, term178779.getClass(), "first", term178871);
        term179880 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term179881 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term179881, term179881.getClass(), "options", null);
        setField(term179881, term179881.getClass(), "passes", null);
        setField(term179881, term179881.getClass(), "externs", null);
        setField(term179881, term179881.getClass(), "modules", null);
        setField(term179881, term179881.getClass(), "moduleGraph", null);
        setField(term179881, term179881.getClass(), "inputs", null);
        setField(term179881, term179881.getClass(), "errorManager", null);
        setField(term179881, term179881.getClass(), "warningsGuard", null);
        setField(term179881, term179881.getClass(), "injectedLibraries", null);
        setField(term179881, term179881.getClass(), "externsRoot", null);
        setField(term179881, term179881.getClass(), "jsRoot", null);
        setField(term179881, term179881.getClass(), "externAndJsRoot", null);
        setField(term179881, term179881.getClass(), "inputsById", null);
        setField(term179881, term179881.getClass(), "sourceMap", null);
        setField(term179881, term179881.getClass(), "externExports", null);
        setIntField(term179881, term179881.getClass(), "uniqueNameId", 0);
        setBooleanField(term179881, term179881.getClass(), "hasRegExpGlobalReferences", false);
        setField(term179881, term179881.getClass(), "functionInformationMap", null);
        setField(term179881, term179881.getClass(), "debugLog", null);
        setField(term179881, term179881.getClass(), "defaultCodingConvention", null);
        setField(term179881, term179881.getClass(), "typeRegistry", null);
        setField(term179881, term179881.getClass(), "parserConfig", null);
        setField(term179881, term179881.getClass(), "abstractInterpreter", null);
        setField(term179881, term179881.getClass(), "typeValidator", null);
        setField(term179881, term179881.getClass(), "tracker", null);
        setField(term179881, term179881.getClass(), "oldErrorReporter", null);
        setField(term179881, term179881.getClass(), "defaultErrorReporter", null);
        setField(term179881, term179881.getClass(), "compilerThread", null);
        setBooleanField(term179881, term179881.getClass(), "useThreads", false);
        setField(term179881, term179881.getClass(), "outStream", null);
        setField(term179881, term179881.getClass(), "globalRefMap", null);
        setDoubleField(term179881, term179881.getClass(), "progress", 0.0);
        setField(term179881, term179881.getClass(), "lastPassName", null);
        setField(term179881, term179881.getClass(), "sanityCheck", null);
        setField(term179881, term179881.getClass(), "currentTracer", null);
        setField(term179881, term179881.getClass(), "currentPassName", null);
        setIntField(term179881, term179881.getClass(), "syntheticCodeId", 0);
        setField(term179881, term179881.getClass(), "recentChange", null);
        setField(term179881, term179881.getClass(), "codeChangeHandlers", null);
        setField(term179881, term179881.getClass(), "synthesizedExternsInput", null);
        setField(term179881, term179881.getClass(), "stage", null);
        setField(term179880, term179880.getClass(), "compiler", term179881);
        setField(term179880, term179880.getClass(), "filenamePrefix", null);
        setBooleanField(term179880, term179880.getClass(), "reportDependencies", false);
        setField(term179880, term179880.getClass(), "module", null);
        term179882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179886 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term179882, term179882.getClass(), "number", 0.0);
        setIntField(term179882, term179882.getClass(), "type", 33);
        setField(term179882, term179882.getClass(), "next", null);
        setDoubleField(term179883, term179883.getClass(), "number", 0.0);
        setIntField(term179883, term179883.getClass(), "type", 37);
        setDoubleField(term179884, term179884.getClass(), "number", 0.0);
        setIntField(term179884, term179884.getClass(), "type", 37);
        setIntField(term179885, term179885.getClass(), "type", 0);
        setField(term179885, term179885.getClass(), "next", null);
        setField(term179885, term179885.getClass(), "first", null);
        setField(term179885, term179885.getClass(), "last", null);
        setField(term179885, term179885.getClass(), "propListHead", null);
        setIntField(term179885, term179885.getClass(), "sourcePosition", 0);
        setField(term179885, term179885.getClass(), "jsType", null);
        setField(term179885, term179885.getClass(), "parent", null);
        setField(term179884, term179884.getClass(), "next", term179885);
        setField(term179884, term179884.getClass(), "first", null);
        setField(term179884, term179884.getClass(), "last", null);
        setField(term179884, term179884.getClass(), "propListHead", null);
        setIntField(term179884, term179884.getClass(), "sourcePosition", 0);
        setField(term179884, term179884.getClass(), "jsType", null);
        setField(term179884, term179884.getClass(), "parent", null);
        setField(term179883, term179883.getClass(), "next", term179884);
        setDoubleField(term179886, term179886.getClass(), "number", 0.0);
        setIntField(term179886, term179886.getClass(), "type", 0);
        setField(term179886, term179886.getClass(), "next", null);
        setField(term179886, term179886.getClass(), "first", null);
        setField(term179886, term179886.getClass(), "last", null);
        setField(term179886, term179886.getClass(), "propListHead", null);
        setIntField(term179886, term179886.getClass(), "sourcePosition", 0);
        setField(term179886, term179886.getClass(), "jsType", null);
        setField(term179886, term179886.getClass(), "parent", null);
        setField(term179883, term179883.getClass(), "first", term179886);
        setField(term179883, term179883.getClass(), "last", null);
        setField(term179883, term179883.getClass(), "propListHead", null);
        setIntField(term179883, term179883.getClass(), "sourcePosition", 0);
        setField(term179883, term179883.getClass(), "jsType", null);
        setField(term179883, term179883.getClass(), "parent", null);
        setField(term179882, term179882.getClass(), "first", term179883);
        setField(term179882, term179882.getClass(), "last", null);
        setField(term179882, term179882.getClass(), "propListHead", null);
        setIntField(term179882, term179882.getClass(), "sourcePosition", 0);
        setField(term179882, term179882.getClass(), "jsType", null);
        setField(term179882, term179882.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term178779;
        callMethod(klass, "process", argTypes, term178607, args);
        assertTrue(recursiveEquals(term178607, term179880));
        assertTrue(recursiveEquals(term178779, null));
    }

};


