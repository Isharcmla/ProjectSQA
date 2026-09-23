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

public class ProcessCommonJSModules_process_627866047205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104107;
     Object term104279;
     Object term104771;
     Object term104773;

    public ProcessCommonJSModules_process_627866047205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104107 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term104187 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term104107, term104107.getClass(), "compiler", term104187);
        term104279 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term104371 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term104441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104533 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term104279, term104279.getClass(), "type", 0);
        setField(term104279, term104279.getClass(), "parent", null);
        setField(term104371, term104371.getClass(), "next", term104441);
        setIntField(term104371, term104371.getClass(), "type", 33);
        setField(term104533, term104533.getClass(), "next", null);
        setIntField(term104533, term104533.getClass(), "type", 37);
        setField(term104533, term104533.getClass(), "first", null);
        setField(term104371, term104371.getClass(), "first", term104533);
        setField(term104279, term104279.getClass(), "first", term104371);
        term104771 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term104772 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term104772, term104772.getClass(), "options", null);
        setField(term104772, term104772.getClass(), "passes", null);
        setField(term104772, term104772.getClass(), "externs", null);
        setField(term104772, term104772.getClass(), "modules", null);
        setField(term104772, term104772.getClass(), "moduleGraph", null);
        setField(term104772, term104772.getClass(), "inputs", null);
        setField(term104772, term104772.getClass(), "errorManager", null);
        setField(term104772, term104772.getClass(), "warningsGuard", null);
        setField(term104772, term104772.getClass(), "injectedLibraries", null);
        setField(term104772, term104772.getClass(), "externsRoot", null);
        setField(term104772, term104772.getClass(), "jsRoot", null);
        setField(term104772, term104772.getClass(), "externAndJsRoot", null);
        setField(term104772, term104772.getClass(), "inputsById", null);
        setField(term104772, term104772.getClass(), "sourceMap", null);
        setField(term104772, term104772.getClass(), "externExports", null);
        setIntField(term104772, term104772.getClass(), "uniqueNameId", 0);
        setBooleanField(term104772, term104772.getClass(), "hasRegExpGlobalReferences", false);
        setField(term104772, term104772.getClass(), "functionInformationMap", null);
        setField(term104772, term104772.getClass(), "debugLog", null);
        setField(term104772, term104772.getClass(), "defaultCodingConvention", null);
        setField(term104772, term104772.getClass(), "typeRegistry", null);
        setField(term104772, term104772.getClass(), "parserConfig", null);
        setField(term104772, term104772.getClass(), "abstractInterpreter", null);
        setField(term104772, term104772.getClass(), "typeValidator", null);
        setField(term104772, term104772.getClass(), "tracker", null);
        setField(term104772, term104772.getClass(), "oldErrorReporter", null);
        setField(term104772, term104772.getClass(), "defaultErrorReporter", null);
        setField(term104772, term104772.getClass(), "compilerThread", null);
        setBooleanField(term104772, term104772.getClass(), "useThreads", false);
        setField(term104772, term104772.getClass(), "outStream", null);
        setField(term104772, term104772.getClass(), "globalRefMap", null);
        setDoubleField(term104772, term104772.getClass(), "progress", 0.0);
        setField(term104772, term104772.getClass(), "lastPassName", null);
        setField(term104772, term104772.getClass(), "sanityCheck", null);
        setField(term104772, term104772.getClass(), "currentTracer", null);
        setField(term104772, term104772.getClass(), "currentPassName", null);
        setIntField(term104772, term104772.getClass(), "syntheticCodeId", 0);
        setField(term104772, term104772.getClass(), "recentChange", null);
        setField(term104772, term104772.getClass(), "codeChangeHandlers", null);
        setField(term104772, term104772.getClass(), "synthesizedExternsInput", null);
        setField(term104772, term104772.getClass(), "stage", null);
        setField(term104771, term104771.getClass(), "compiler", term104772);
        setField(term104771, term104771.getClass(), "filenamePrefix", null);
        setBooleanField(term104771, term104771.getClass(), "reportDependencies", true);
        setField(term104771, term104771.getClass(), "module", null);
        term104773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term104774 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term104775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term104773, term104773.getClass(), "number", 0);
        setIntField(term104773, term104773.getClass(), "type", 0);
        setField(term104773, term104773.getClass(), "next", null);
        setDoubleField(term104774, term104774.getClass(), "number", 0.0);
        setIntField(term104774, term104774.getClass(), "type", 33);
        setIntField(term104775, term104775.getClass(), "type", 0);
        setField(term104775, term104775.getClass(), "next", null);
        setField(term104775, term104775.getClass(), "first", null);
        setField(term104775, term104775.getClass(), "last", null);
        setField(term104775, term104775.getClass(), "propListHead", null);
        setIntField(term104775, term104775.getClass(), "sourcePosition", 0);
        setField(term104775, term104775.getClass(), "jsType", null);
        setField(term104775, term104775.getClass(), "parent", null);
        setField(term104774, term104774.getClass(), "next", term104775);
        setDoubleField(term104776, term104776.getClass(), "number", 0.0);
        setIntField(term104776, term104776.getClass(), "type", 37);
        setField(term104776, term104776.getClass(), "next", null);
        setField(term104776, term104776.getClass(), "first", null);
        setField(term104776, term104776.getClass(), "last", null);
        setField(term104776, term104776.getClass(), "propListHead", null);
        setIntField(term104776, term104776.getClass(), "sourcePosition", 0);
        setField(term104776, term104776.getClass(), "jsType", null);
        setField(term104776, term104776.getClass(), "parent", null);
        setField(term104774, term104774.getClass(), "first", term104776);
        setField(term104774, term104774.getClass(), "last", null);
        setField(term104774, term104774.getClass(), "propListHead", null);
        setIntField(term104774, term104774.getClass(), "sourcePosition", 0);
        setField(term104774, term104774.getClass(), "jsType", null);
        setField(term104774, term104774.getClass(), "parent", null);
        setField(term104773, term104773.getClass(), "first", term104774);
        setField(term104773, term104773.getClass(), "last", null);
        setField(term104773, term104773.getClass(), "propListHead", null);
        setIntField(term104773, term104773.getClass(), "sourcePosition", 0);
        setField(term104773, term104773.getClass(), "jsType", null);
        setField(term104773, term104773.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term104279;
        callMethod(klass, "process", argTypes, term104107, args);
        assertTrue(recursiveEquals(term104107, term104771));
        assertTrue(recursiveEquals(term104279, null));
    }

};


