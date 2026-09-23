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

public class ProcessCommonJSModules_process_627866047187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92039;
     Object term92109;
     Object term97100;

    public ProcessCommonJSModules_process_627866047187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92039 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term92039, term92039.getClass(), "compiler", null);
        term92109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92201 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92293 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term92109, term92109.getClass(), "type", 0);
        setField(term92109, term92109.getClass(), "parent", null);
        setField(term92201, term92201.getClass(), "next", null);
        setIntField(term92201, term92201.getClass(), "type", 0);
        setField(term92385, term92385.getClass(), "next", null);
        setIntField(term92385, term92385.getClass(), "type", 0);
        setField(term92385, term92385.getClass(), "first", null);
        setField(term92293, term92293.getClass(), "next", term92385);
        setIntField(term92293, term92293.getClass(), "type", 37);
        setField(term92293, term92293.getClass(), "first", null);
        setField(term92201, term92201.getClass(), "first", term92293);
        setField(term92109, term92109.getClass(), "first", term92201);
        term97100 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term97100, term97100.getClass(), "options", null);
        setField(term97100, term97100.getClass(), "passes", null);
        setField(term97100, term97100.getClass(), "externs", null);
        setField(term97100, term97100.getClass(), "modules", null);
        setField(term97100, term97100.getClass(), "moduleGraph", null);
        setField(term97100, term97100.getClass(), "inputs", null);
        setField(term97100, term97100.getClass(), "errorManager", null);
        setField(term97100, term97100.getClass(), "warningsGuard", null);
        setField(term97100, term97100.getClass(), "injectedLibraries", null);
        setField(term97100, term97100.getClass(), "externsRoot", null);
        setField(term97100, term97100.getClass(), "jsRoot", null);
        setField(term97100, term97100.getClass(), "externAndJsRoot", null);
        setField(term97100, term97100.getClass(), "inputsById", null);
        setField(term97100, term97100.getClass(), "sourceMap", null);
        setField(term97100, term97100.getClass(), "externExports", null);
        setIntField(term97100, term97100.getClass(), "uniqueNameId", 0);
        setBooleanField(term97100, term97100.getClass(), "hasRegExpGlobalReferences", false);
        setField(term97100, term97100.getClass(), "functionInformationMap", null);
        setField(term97100, term97100.getClass(), "debugLog", null);
        setField(term97100, term97100.getClass(), "defaultCodingConvention", null);
        setField(term97100, term97100.getClass(), "typeRegistry", null);
        setField(term97100, term97100.getClass(), "parserConfig", null);
        setField(term97100, term97100.getClass(), "abstractInterpreter", null);
        setField(term97100, term97100.getClass(), "typeValidator", null);
        setField(term97100, term97100.getClass(), "tracker", null);
        setField(term97100, term97100.getClass(), "oldErrorReporter", null);
        setField(term97100, term97100.getClass(), "defaultErrorReporter", null);
        setField(term97100, term97100.getClass(), "compilerThread", null);
        setBooleanField(term97100, term97100.getClass(), "useThreads", false);
        setField(term97100, term97100.getClass(), "outStream", null);
        setField(term97100, term97100.getClass(), "globalRefMap", null);
        setDoubleField(term97100, term97100.getClass(), "progress", 0.0);
        setField(term97100, term97100.getClass(), "lastPassName", null);
        setField(term97100, term97100.getClass(), "sanityCheck", null);
        setField(term97100, term97100.getClass(), "currentTracer", null);
        setField(term97100, term97100.getClass(), "currentPassName", null);
        setIntField(term97100, term97100.getClass(), "syntheticCodeId", 0);
        setField(term97100, term97100.getClass(), "recentChange", null);
        setField(term97100, term97100.getClass(), "codeChangeHandlers", null);
        setField(term97100, term97100.getClass(), "synthesizedExternsInput", null);
        setField(term97100, term97100.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term92109;
        callMethod(klass, "process", argTypes, term92039, args);
        assertTrue(recursiveEquals(term92039, term97100));
        assertTrue(recursiveEquals(term92109, null));
    }

};


