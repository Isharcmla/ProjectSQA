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

public class ProcessCommonJSModules_process_627866047408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219579;
     Object term219729;
     Object term289377;
     Object term289379;

    public ProcessCommonJSModules_process_627866047408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219579 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term219659 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term219579, term219579.getClass(), "compiler", term219659);
        term219729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term219913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term219729, term219729.getClass(), "type", 0);
        setField(term219729, term219729.getClass(), "parent", null);
        setField(term219913, term219913.getClass(), "next", null);
        setIntField(term219913, term219913.getClass(), "type", 0);
        setField(term219913, term219913.getClass(), "first", null);
        setField(term219821, term219821.getClass(), "next", term219913);
        setIntField(term219821, term219821.getClass(), "type", 33);
        setField(term219821, term219821.getClass(), "first", term219913);
        setField(term219729, term219729.getClass(), "first", term219821);
        term289377 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term289378 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term289378, term289378.getClass(), "options", null);
        setField(term289378, term289378.getClass(), "passes", null);
        setField(term289378, term289378.getClass(), "externs", null);
        setField(term289378, term289378.getClass(), "modules", null);
        setField(term289378, term289378.getClass(), "moduleGraph", null);
        setField(term289378, term289378.getClass(), "inputs", null);
        setField(term289378, term289378.getClass(), "errorManager", null);
        setField(term289378, term289378.getClass(), "warningsGuard", null);
        setField(term289378, term289378.getClass(), "injectedLibraries", null);
        setField(term289378, term289378.getClass(), "externsRoot", null);
        setField(term289378, term289378.getClass(), "jsRoot", null);
        setField(term289378, term289378.getClass(), "externAndJsRoot", null);
        setField(term289378, term289378.getClass(), "inputsById", null);
        setField(term289378, term289378.getClass(), "sourceMap", null);
        setField(term289378, term289378.getClass(), "externExports", null);
        setIntField(term289378, term289378.getClass(), "uniqueNameId", 0);
        setBooleanField(term289378, term289378.getClass(), "hasRegExpGlobalReferences", false);
        setField(term289378, term289378.getClass(), "functionInformationMap", null);
        setField(term289378, term289378.getClass(), "debugLog", null);
        setField(term289378, term289378.getClass(), "defaultCodingConvention", null);
        setField(term289378, term289378.getClass(), "typeRegistry", null);
        setField(term289378, term289378.getClass(), "parserConfig", null);
        setField(term289378, term289378.getClass(), "abstractInterpreter", null);
        setField(term289378, term289378.getClass(), "typeValidator", null);
        setField(term289378, term289378.getClass(), "tracker", null);
        setField(term289378, term289378.getClass(), "oldErrorReporter", null);
        setField(term289378, term289378.getClass(), "defaultErrorReporter", null);
        setField(term289378, term289378.getClass(), "compilerThread", null);
        setBooleanField(term289378, term289378.getClass(), "useThreads", false);
        setField(term289378, term289378.getClass(), "outStream", null);
        setField(term289378, term289378.getClass(), "globalRefMap", null);
        setDoubleField(term289378, term289378.getClass(), "progress", 0.0);
        setField(term289378, term289378.getClass(), "lastPassName", null);
        setField(term289378, term289378.getClass(), "sanityCheck", null);
        setField(term289378, term289378.getClass(), "currentTracer", null);
        setField(term289378, term289378.getClass(), "currentPassName", null);
        setIntField(term289378, term289378.getClass(), "syntheticCodeId", 0);
        setField(term289378, term289378.getClass(), "recentChange", null);
        setField(term289378, term289378.getClass(), "codeChangeHandlers", null);
        setField(term289378, term289378.getClass(), "synthesizedExternsInput", null);
        setField(term289378, term289378.getClass(), "stage", null);
        setField(term289377, term289377.getClass(), "compiler", term289378);
        setField(term289377, term289377.getClass(), "filenamePrefix", null);
        setBooleanField(term289377, term289377.getClass(), "reportDependencies", false);
        setField(term289377, term289377.getClass(), "module", null);
        term289379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289380 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term289379, term289379.getClass(), "type", 0);
        setField(term289379, term289379.getClass(), "next", null);
        setDoubleField(term289380, term289380.getClass(), "number", 0.0);
        setIntField(term289380, term289380.getClass(), "type", 33);
        setDoubleField(term289381, term289381.getClass(), "number", 0.0);
        setIntField(term289381, term289381.getClass(), "type", 0);
        setField(term289381, term289381.getClass(), "next", null);
        setField(term289381, term289381.getClass(), "first", null);
        setField(term289381, term289381.getClass(), "last", null);
        setField(term289381, term289381.getClass(), "propListHead", null);
        setIntField(term289381, term289381.getClass(), "sourcePosition", 0);
        setField(term289381, term289381.getClass(), "jsType", null);
        setField(term289381, term289381.getClass(), "parent", null);
        setField(term289380, term289380.getClass(), "next", term289381);
        setField(term289380, term289380.getClass(), "first", term289381);
        setField(term289380, term289380.getClass(), "last", null);
        setField(term289380, term289380.getClass(), "propListHead", null);
        setIntField(term289380, term289380.getClass(), "sourcePosition", 0);
        setField(term289380, term289380.getClass(), "jsType", null);
        setField(term289380, term289380.getClass(), "parent", null);
        setField(term289379, term289379.getClass(), "first", term289380);
        setField(term289379, term289379.getClass(), "last", null);
        setField(term289379, term289379.getClass(), "propListHead", null);
        setIntField(term289379, term289379.getClass(), "sourcePosition", 0);
        setField(term289379, term289379.getClass(), "jsType", null);
        setField(term289379, term289379.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term219729;
        callMethod(klass, "process", argTypes, term219579, args);
        assertTrue(recursiveEquals(term219579, term289377));
        assertTrue(recursiveEquals(term219729, null));
    }

};


