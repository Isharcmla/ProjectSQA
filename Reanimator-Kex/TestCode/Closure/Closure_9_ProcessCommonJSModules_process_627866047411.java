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

public class ProcessCommonJSModules_process_627866047411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221761;
     Object term221933;
     Object term290882;
     Object term290884;

    public ProcessCommonJSModules_process_627866047411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221761 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term221841 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term221761, term221761.getClass(), "compiler", term221841);
        term221933 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222025 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222187 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term221933, term221933.getClass(), "type", 0);
        setField(term221933, term221933.getClass(), "parent", null);
        setField(term222095, term222095.getClass(), "next", null);
        setIntField(term222095, term222095.getClass(), "type", 0);
        setField(term222095, term222095.getClass(), "first", null);
        setField(term222025, term222025.getClass(), "next", term222095);
        setIntField(term222025, term222025.getClass(), "type", 37);
        setField(term222187, term222187.getClass(), "next", null);
        setIntField(term222187, term222187.getClass(), "type", 0);
        setField(term222187, term222187.getClass(), "first", null);
        setField(term222025, term222025.getClass(), "first", term222187);
        setField(term221933, term221933.getClass(), "first", term222025);
        term290882 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term290883 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term290883, term290883.getClass(), "options", null);
        setField(term290883, term290883.getClass(), "passes", null);
        setField(term290883, term290883.getClass(), "externs", null);
        setField(term290883, term290883.getClass(), "modules", null);
        setField(term290883, term290883.getClass(), "moduleGraph", null);
        setField(term290883, term290883.getClass(), "inputs", null);
        setField(term290883, term290883.getClass(), "errorManager", null);
        setField(term290883, term290883.getClass(), "warningsGuard", null);
        setField(term290883, term290883.getClass(), "injectedLibraries", null);
        setField(term290883, term290883.getClass(), "externsRoot", null);
        setField(term290883, term290883.getClass(), "jsRoot", null);
        setField(term290883, term290883.getClass(), "externAndJsRoot", null);
        setField(term290883, term290883.getClass(), "inputsById", null);
        setField(term290883, term290883.getClass(), "sourceMap", null);
        setField(term290883, term290883.getClass(), "externExports", null);
        setIntField(term290883, term290883.getClass(), "uniqueNameId", 0);
        setBooleanField(term290883, term290883.getClass(), "hasRegExpGlobalReferences", false);
        setField(term290883, term290883.getClass(), "functionInformationMap", null);
        setField(term290883, term290883.getClass(), "debugLog", null);
        setField(term290883, term290883.getClass(), "defaultCodingConvention", null);
        setField(term290883, term290883.getClass(), "typeRegistry", null);
        setField(term290883, term290883.getClass(), "parserConfig", null);
        setField(term290883, term290883.getClass(), "abstractInterpreter", null);
        setField(term290883, term290883.getClass(), "typeValidator", null);
        setField(term290883, term290883.getClass(), "tracker", null);
        setField(term290883, term290883.getClass(), "oldErrorReporter", null);
        setField(term290883, term290883.getClass(), "defaultErrorReporter", null);
        setField(term290883, term290883.getClass(), "compilerThread", null);
        setBooleanField(term290883, term290883.getClass(), "useThreads", false);
        setField(term290883, term290883.getClass(), "outStream", null);
        setField(term290883, term290883.getClass(), "globalRefMap", null);
        setDoubleField(term290883, term290883.getClass(), "progress", 0.0);
        setField(term290883, term290883.getClass(), "lastPassName", null);
        setField(term290883, term290883.getClass(), "sanityCheck", null);
        setField(term290883, term290883.getClass(), "currentTracer", null);
        setField(term290883, term290883.getClass(), "currentPassName", null);
        setIntField(term290883, term290883.getClass(), "syntheticCodeId", 0);
        setField(term290883, term290883.getClass(), "recentChange", null);
        setField(term290883, term290883.getClass(), "codeChangeHandlers", null);
        setField(term290883, term290883.getClass(), "synthesizedExternsInput", null);
        setField(term290883, term290883.getClass(), "stage", null);
        setField(term290882, term290882.getClass(), "compiler", term290883);
        setField(term290882, term290882.getClass(), "filenamePrefix", null);
        setBooleanField(term290882, term290882.getClass(), "reportDependencies", false);
        setField(term290882, term290882.getClass(), "module", null);
        term290884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term290885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term290886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term290884, term290884.getClass(), "number", 0.0);
        setIntField(term290884, term290884.getClass(), "type", 0);
        setField(term290884, term290884.getClass(), "next", null);
        setDoubleField(term290885, term290885.getClass(), "number", 0.0);
        setIntField(term290885, term290885.getClass(), "type", 37);
        setIntField(term290886, term290886.getClass(), "type", 0);
        setField(term290886, term290886.getClass(), "next", null);
        setField(term290886, term290886.getClass(), "first", null);
        setField(term290886, term290886.getClass(), "last", null);
        setField(term290886, term290886.getClass(), "propListHead", null);
        setIntField(term290886, term290886.getClass(), "sourcePosition", 0);
        setField(term290886, term290886.getClass(), "jsType", null);
        setField(term290886, term290886.getClass(), "parent", null);
        setField(term290885, term290885.getClass(), "next", term290886);
        setDoubleField(term290887, term290887.getClass(), "number", 0.0);
        setIntField(term290887, term290887.getClass(), "type", 0);
        setField(term290887, term290887.getClass(), "next", null);
        setField(term290887, term290887.getClass(), "first", null);
        setField(term290887, term290887.getClass(), "last", null);
        setField(term290887, term290887.getClass(), "propListHead", null);
        setIntField(term290887, term290887.getClass(), "sourcePosition", 0);
        setField(term290887, term290887.getClass(), "jsType", null);
        setField(term290887, term290887.getClass(), "parent", null);
        setField(term290885, term290885.getClass(), "first", term290887);
        setField(term290885, term290885.getClass(), "last", null);
        setField(term290885, term290885.getClass(), "propListHead", null);
        setIntField(term290885, term290885.getClass(), "sourcePosition", 0);
        setField(term290885, term290885.getClass(), "jsType", null);
        setField(term290885, term290885.getClass(), "parent", null);
        setField(term290884, term290884.getClass(), "first", term290885);
        setField(term290884, term290884.getClass(), "last", null);
        setField(term290884, term290884.getClass(), "propListHead", null);
        setIntField(term290884, term290884.getClass(), "sourcePosition", 0);
        setField(term290884, term290884.getClass(), "jsType", null);
        setField(term290884, term290884.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term221933;
        callMethod(klass, "process", argTypes, term221761, args);
        assertTrue(recursiveEquals(term221761, term290882));
        assertTrue(recursiveEquals(term221933, null));
    }

};


