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

public class ProcessCommonJSModules_process_627866047379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204862;
     Object term205012;
     Object term205809;
     Object term205811;

    public ProcessCommonJSModules_process_627866047379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204862 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term204942 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term204862, term204862.getClass(), "compiler", term204942);
        term205012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term205196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term205012, term205012.getClass(), "type", 0);
        setField(term205012, term205012.getClass(), "parent", null);
        setField(term205104, term205104.getClass(), "next", null);
        setIntField(term205104, term205104.getClass(), "type", 33);
        setField(term205196, term205196.getClass(), "next", null);
        setIntField(term205196, term205196.getClass(), "type", 0);
        setField(term205196, term205196.getClass(), "first", null);
        setField(term205104, term205104.getClass(), "first", term205196);
        setField(term205012, term205012.getClass(), "first", term205104);
        term205809 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term205810 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term205810, term205810.getClass(), "options", null);
        setField(term205810, term205810.getClass(), "passes", null);
        setField(term205810, term205810.getClass(), "externs", null);
        setField(term205810, term205810.getClass(), "modules", null);
        setField(term205810, term205810.getClass(), "moduleGraph", null);
        setField(term205810, term205810.getClass(), "inputs", null);
        setField(term205810, term205810.getClass(), "errorManager", null);
        setField(term205810, term205810.getClass(), "warningsGuard", null);
        setField(term205810, term205810.getClass(), "injectedLibraries", null);
        setField(term205810, term205810.getClass(), "externsRoot", null);
        setField(term205810, term205810.getClass(), "jsRoot", null);
        setField(term205810, term205810.getClass(), "externAndJsRoot", null);
        setField(term205810, term205810.getClass(), "inputsById", null);
        setField(term205810, term205810.getClass(), "sourceMap", null);
        setField(term205810, term205810.getClass(), "externExports", null);
        setIntField(term205810, term205810.getClass(), "uniqueNameId", 0);
        setBooleanField(term205810, term205810.getClass(), "hasRegExpGlobalReferences", false);
        setField(term205810, term205810.getClass(), "functionInformationMap", null);
        setField(term205810, term205810.getClass(), "debugLog", null);
        setField(term205810, term205810.getClass(), "defaultCodingConvention", null);
        setField(term205810, term205810.getClass(), "typeRegistry", null);
        setField(term205810, term205810.getClass(), "parserConfig", null);
        setField(term205810, term205810.getClass(), "abstractInterpreter", null);
        setField(term205810, term205810.getClass(), "typeValidator", null);
        setField(term205810, term205810.getClass(), "tracker", null);
        setField(term205810, term205810.getClass(), "oldErrorReporter", null);
        setField(term205810, term205810.getClass(), "defaultErrorReporter", null);
        setField(term205810, term205810.getClass(), "compilerThread", null);
        setBooleanField(term205810, term205810.getClass(), "useThreads", false);
        setField(term205810, term205810.getClass(), "outStream", null);
        setField(term205810, term205810.getClass(), "globalRefMap", null);
        setDoubleField(term205810, term205810.getClass(), "progress", 0.0);
        setField(term205810, term205810.getClass(), "lastPassName", null);
        setField(term205810, term205810.getClass(), "sanityCheck", null);
        setField(term205810, term205810.getClass(), "currentTracer", null);
        setField(term205810, term205810.getClass(), "currentPassName", null);
        setIntField(term205810, term205810.getClass(), "syntheticCodeId", 0);
        setField(term205810, term205810.getClass(), "recentChange", null);
        setField(term205810, term205810.getClass(), "codeChangeHandlers", null);
        setField(term205810, term205810.getClass(), "synthesizedExternsInput", null);
        setField(term205810, term205810.getClass(), "stage", null);
        setField(term205809, term205809.getClass(), "compiler", term205810);
        setField(term205809, term205809.getClass(), "filenamePrefix", null);
        setBooleanField(term205809, term205809.getClass(), "reportDependencies", false);
        setField(term205809, term205809.getClass(), "module", null);
        term205811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term205813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term205811, term205811.getClass(), "type", 0);
        setField(term205811, term205811.getClass(), "next", null);
        setField(term205812, term205812.getClass(), "str", null);
        setIntField(term205812, term205812.getClass(), "type", 33);
        setField(term205812, term205812.getClass(), "next", null);
        setField(term205813, term205813.getClass(), "str", null);
        setIntField(term205813, term205813.getClass(), "type", 0);
        setField(term205813, term205813.getClass(), "next", null);
        setField(term205813, term205813.getClass(), "first", null);
        setField(term205813, term205813.getClass(), "last", null);
        setField(term205813, term205813.getClass(), "propListHead", null);
        setIntField(term205813, term205813.getClass(), "sourcePosition", 0);
        setField(term205813, term205813.getClass(), "jsType", null);
        setField(term205813, term205813.getClass(), "parent", null);
        setField(term205812, term205812.getClass(), "first", term205813);
        setField(term205812, term205812.getClass(), "last", null);
        setField(term205812, term205812.getClass(), "propListHead", null);
        setIntField(term205812, term205812.getClass(), "sourcePosition", 0);
        setField(term205812, term205812.getClass(), "jsType", null);
        setField(term205812, term205812.getClass(), "parent", null);
        setField(term205811, term205811.getClass(), "first", term205812);
        setField(term205811, term205811.getClass(), "last", null);
        setField(term205811, term205811.getClass(), "propListHead", null);
        setIntField(term205811, term205811.getClass(), "sourcePosition", 0);
        setField(term205811, term205811.getClass(), "jsType", null);
        setField(term205811, term205811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term205012;
        callMethod(klass, "process", argTypes, term204862, args);
        assertTrue(recursiveEquals(term204862, term205809));
        assertTrue(recursiveEquals(term205012, null));
    }

};


