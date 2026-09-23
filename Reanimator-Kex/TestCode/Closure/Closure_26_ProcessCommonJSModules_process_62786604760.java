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

public class ProcessCommonJSModules_process_62786604760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32068;
     Object term32218;
     Object term33094;
     Object term33096;

    public ProcessCommonJSModules_process_62786604760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32068 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term32148 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32068, term32068.getClass(), "compiler", term32148);
        term32218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32218, term32218.getClass(), "type", 0);
        setField(term32218, term32218.getClass(), "parent", null);
        setField(term32288, term32288.getClass(), "next", null);
        setIntField(term32288, term32288.getClass(), "type", 33);
        setField(term32358, term32358.getClass(), "next", null);
        setIntField(term32358, term32358.getClass(), "type", 0);
        setField(term32358, term32358.getClass(), "first", null);
        setField(term32288, term32288.getClass(), "first", term32358);
        setField(term32218, term32218.getClass(), "first", term32288);
        term33094 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term33095 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33095, term33095.getClass(), "options", null);
        setField(term33095, term33095.getClass(), "passes", null);
        setField(term33095, term33095.getClass(), "externs", null);
        setField(term33095, term33095.getClass(), "modules", null);
        setField(term33095, term33095.getClass(), "moduleGraph", null);
        setField(term33095, term33095.getClass(), "inputs", null);
        setField(term33095, term33095.getClass(), "errorManager", null);
        setField(term33095, term33095.getClass(), "warningsGuard", null);
        setField(term33095, term33095.getClass(), "injectedLibraries", null);
        setField(term33095, term33095.getClass(), "externsRoot", null);
        setField(term33095, term33095.getClass(), "jsRoot", null);
        setField(term33095, term33095.getClass(), "externAndJsRoot", null);
        setField(term33095, term33095.getClass(), "inputsById", null);
        setField(term33095, term33095.getClass(), "sourceMap", null);
        setField(term33095, term33095.getClass(), "externExports", null);
        setIntField(term33095, term33095.getClass(), "uniqueNameId", 0);
        setBooleanField(term33095, term33095.getClass(), "useThreads", false);
        setBooleanField(term33095, term33095.getClass(), "hasRegExpGlobalReferences", false);
        setField(term33095, term33095.getClass(), "functionInformationMap", null);
        setField(term33095, term33095.getClass(), "debugLog", null);
        setField(term33095, term33095.getClass(), "defaultCodingConvention", null);
        setField(term33095, term33095.getClass(), "typeRegistry", null);
        setField(term33095, term33095.getClass(), "parserConfig", null);
        setField(term33095, term33095.getClass(), "abstractInterpreter", null);
        setField(term33095, term33095.getClass(), "typeValidator", null);
        setField(term33095, term33095.getClass(), "tracker", null);
        setField(term33095, term33095.getClass(), "oldErrorReporter", null);
        setField(term33095, term33095.getClass(), "defaultErrorReporter", null);
        setField(term33095, term33095.getClass(), "outStream", null);
        setField(term33095, term33095.getClass(), "globalRefMap", null);
        setDoubleField(term33095, term33095.getClass(), "progress", 0.0);
        setField(term33095, term33095.getClass(), "sanityCheck", null);
        setField(term33095, term33095.getClass(), "currentTracer", null);
        setField(term33095, term33095.getClass(), "currentPassName", null);
        setIntField(term33095, term33095.getClass(), "syntheticCodeId", 0);
        setField(term33095, term33095.getClass(), "recentChange", null);
        setField(term33095, term33095.getClass(), "codeChangeHandlers", null);
        setField(term33095, term33095.getClass(), "synthesizedExternsInput", null);
        setField(term33095, term33095.getClass(), "stage", null);
        setField(term33094, term33094.getClass(), "compiler", term33095);
        setField(term33094, term33094.getClass(), "filenamePrefix", null);
        setBooleanField(term33094, term33094.getClass(), "reportDependencies", false);
        setField(term33094, term33094.getClass(), "module", null);
        term33096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33096, term33096.getClass(), "type", 0);
        setField(term33096, term33096.getClass(), "next", null);
        setIntField(term33097, term33097.getClass(), "type", 33);
        setField(term33097, term33097.getClass(), "next", null);
        setIntField(term33098, term33098.getClass(), "type", 0);
        setField(term33098, term33098.getClass(), "next", null);
        setField(term33098, term33098.getClass(), "first", null);
        setField(term33098, term33098.getClass(), "last", null);
        setField(term33098, term33098.getClass(), "propListHead", null);
        setIntField(term33098, term33098.getClass(), "sourcePosition", 0);
        setField(term33098, term33098.getClass(), "jsType", null);
        setField(term33098, term33098.getClass(), "parent", null);
        setField(term33097, term33097.getClass(), "first", term33098);
        setField(term33097, term33097.getClass(), "last", null);
        setField(term33097, term33097.getClass(), "propListHead", null);
        setIntField(term33097, term33097.getClass(), "sourcePosition", 0);
        setField(term33097, term33097.getClass(), "jsType", null);
        setField(term33097, term33097.getClass(), "parent", null);
        setField(term33096, term33096.getClass(), "first", term33097);
        setField(term33096, term33096.getClass(), "last", null);
        setField(term33096, term33096.getClass(), "propListHead", null);
        setIntField(term33096, term33096.getClass(), "sourcePosition", 0);
        setField(term33096, term33096.getClass(), "jsType", null);
        setField(term33096, term33096.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32218;
        callMethod(klass, "process", argTypes, term32068, args);
        assertTrue(recursiveEquals(term32068, term33094));
        assertTrue(recursiveEquals(term32218, null));
    }

};


