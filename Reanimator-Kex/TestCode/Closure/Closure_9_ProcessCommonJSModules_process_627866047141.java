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

public class ProcessCommonJSModules_process_627866047141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66000;
     Object term66172;
     Object term66825;
     Object term66827;

    public ProcessCommonJSModules_process_627866047141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66000 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term66080 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term66000, term66000.getClass(), "compiler", term66080);
        term66172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term66172, term66172.getClass(), "type", 0);
        setField(term66172, term66172.getClass(), "parent", null);
        setField(term66356, term66356.getClass(), "next", null);
        setIntField(term66356, term66356.getClass(), "type", 0);
        setField(term66356, term66356.getClass(), "first", null);
        setField(term66264, term66264.getClass(), "next", term66356);
        setIntField(term66264, term66264.getClass(), "type", 0);
        setField(term66448, term66448.getClass(), "next", null);
        setIntField(term66448, term66448.getClass(), "type", 0);
        setField(term66448, term66448.getClass(), "first", null);
        setField(term66264, term66264.getClass(), "first", term66448);
        setField(term66172, term66172.getClass(), "first", term66264);
        term66825 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term66826 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term66826, term66826.getClass(), "options", null);
        setField(term66826, term66826.getClass(), "passes", null);
        setField(term66826, term66826.getClass(), "externs", null);
        setField(term66826, term66826.getClass(), "modules", null);
        setField(term66826, term66826.getClass(), "moduleGraph", null);
        setField(term66826, term66826.getClass(), "inputs", null);
        setField(term66826, term66826.getClass(), "errorManager", null);
        setField(term66826, term66826.getClass(), "warningsGuard", null);
        setField(term66826, term66826.getClass(), "injectedLibraries", null);
        setField(term66826, term66826.getClass(), "externsRoot", null);
        setField(term66826, term66826.getClass(), "jsRoot", null);
        setField(term66826, term66826.getClass(), "externAndJsRoot", null);
        setField(term66826, term66826.getClass(), "inputsById", null);
        setField(term66826, term66826.getClass(), "sourceMap", null);
        setField(term66826, term66826.getClass(), "externExports", null);
        setIntField(term66826, term66826.getClass(), "uniqueNameId", 0);
        setBooleanField(term66826, term66826.getClass(), "hasRegExpGlobalReferences", false);
        setField(term66826, term66826.getClass(), "functionInformationMap", null);
        setField(term66826, term66826.getClass(), "debugLog", null);
        setField(term66826, term66826.getClass(), "defaultCodingConvention", null);
        setField(term66826, term66826.getClass(), "typeRegistry", null);
        setField(term66826, term66826.getClass(), "parserConfig", null);
        setField(term66826, term66826.getClass(), "abstractInterpreter", null);
        setField(term66826, term66826.getClass(), "typeValidator", null);
        setField(term66826, term66826.getClass(), "tracker", null);
        setField(term66826, term66826.getClass(), "oldErrorReporter", null);
        setField(term66826, term66826.getClass(), "defaultErrorReporter", null);
        setField(term66826, term66826.getClass(), "compilerThread", null);
        setBooleanField(term66826, term66826.getClass(), "useThreads", false);
        setField(term66826, term66826.getClass(), "outStream", null);
        setField(term66826, term66826.getClass(), "globalRefMap", null);
        setDoubleField(term66826, term66826.getClass(), "progress", 0.0);
        setField(term66826, term66826.getClass(), "lastPassName", null);
        setField(term66826, term66826.getClass(), "sanityCheck", null);
        setField(term66826, term66826.getClass(), "currentTracer", null);
        setField(term66826, term66826.getClass(), "currentPassName", null);
        setIntField(term66826, term66826.getClass(), "syntheticCodeId", 0);
        setField(term66826, term66826.getClass(), "recentChange", null);
        setField(term66826, term66826.getClass(), "codeChangeHandlers", null);
        setField(term66826, term66826.getClass(), "synthesizedExternsInput", null);
        setField(term66826, term66826.getClass(), "stage", null);
        setField(term66825, term66825.getClass(), "compiler", term66826);
        setField(term66825, term66825.getClass(), "filenamePrefix", null);
        setBooleanField(term66825, term66825.getClass(), "reportDependencies", false);
        setField(term66825, term66825.getClass(), "module", null);
        term66827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66828 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66829 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term66827, term66827.getClass(), "number", 0.0);
        setIntField(term66827, term66827.getClass(), "type", 0);
        setField(term66827, term66827.getClass(), "next", null);
        setDoubleField(term66828, term66828.getClass(), "number", 0.0);
        setIntField(term66828, term66828.getClass(), "type", 0);
        setDoubleField(term66829, term66829.getClass(), "number", 0.0);
        setIntField(term66829, term66829.getClass(), "type", 0);
        setField(term66829, term66829.getClass(), "next", null);
        setField(term66829, term66829.getClass(), "first", null);
        setField(term66829, term66829.getClass(), "last", null);
        setField(term66829, term66829.getClass(), "propListHead", null);
        setIntField(term66829, term66829.getClass(), "sourcePosition", 0);
        setField(term66829, term66829.getClass(), "jsType", null);
        setField(term66829, term66829.getClass(), "parent", null);
        setField(term66828, term66828.getClass(), "next", term66829);
        setDoubleField(term66830, term66830.getClass(), "number", 0.0);
        setIntField(term66830, term66830.getClass(), "type", 0);
        setField(term66830, term66830.getClass(), "next", null);
        setField(term66830, term66830.getClass(), "first", null);
        setField(term66830, term66830.getClass(), "last", null);
        setField(term66830, term66830.getClass(), "propListHead", null);
        setIntField(term66830, term66830.getClass(), "sourcePosition", 0);
        setField(term66830, term66830.getClass(), "jsType", null);
        setField(term66830, term66830.getClass(), "parent", null);
        setField(term66828, term66828.getClass(), "first", term66830);
        setField(term66828, term66828.getClass(), "last", null);
        setField(term66828, term66828.getClass(), "propListHead", null);
        setIntField(term66828, term66828.getClass(), "sourcePosition", 0);
        setField(term66828, term66828.getClass(), "jsType", null);
        setField(term66828, term66828.getClass(), "parent", null);
        setField(term66827, term66827.getClass(), "first", term66828);
        setField(term66827, term66827.getClass(), "last", null);
        setField(term66827, term66827.getClass(), "propListHead", null);
        setIntField(term66827, term66827.getClass(), "sourcePosition", 0);
        setField(term66827, term66827.getClass(), "jsType", null);
        setField(term66827, term66827.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term66172;
        callMethod(klass, "process", argTypes, term66000, args);
        assertTrue(recursiveEquals(term66000, term66825));
        assertTrue(recursiveEquals(term66172, null));
    }

};


