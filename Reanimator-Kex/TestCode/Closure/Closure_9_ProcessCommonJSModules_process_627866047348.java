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

public class ProcessCommonJSModules_process_627866047348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182712;
     Object term182884;
     Object term184353;
     Object term184355;

    public ProcessCommonJSModules_process_627866047348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182712 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term182792 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term182712, term182712.getClass(), "compiler", term182792);
        term182884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term182976 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183068 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term182884, term182884.getClass(), "type", 37);
        setField(term182884, term182884.getClass(), "parent", null);
        setField(term183068, term183068.getClass(), "next", null);
        setIntField(term183068, term183068.getClass(), "type", 0);
        setField(term183068, term183068.getClass(), "first", null);
        setField(term182976, term182976.getClass(), "next", term183068);
        setIntField(term182976, term182976.getClass(), "type", 0);
        setField(term182976, term182976.getClass(), "first", null);
        setField(term182884, term182884.getClass(), "first", term182976);
        term184353 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term184354 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term184354, term184354.getClass(), "options", null);
        setField(term184354, term184354.getClass(), "passes", null);
        setField(term184354, term184354.getClass(), "externs", null);
        setField(term184354, term184354.getClass(), "modules", null);
        setField(term184354, term184354.getClass(), "moduleGraph", null);
        setField(term184354, term184354.getClass(), "inputs", null);
        setField(term184354, term184354.getClass(), "errorManager", null);
        setField(term184354, term184354.getClass(), "warningsGuard", null);
        setField(term184354, term184354.getClass(), "injectedLibraries", null);
        setField(term184354, term184354.getClass(), "externsRoot", null);
        setField(term184354, term184354.getClass(), "jsRoot", null);
        setField(term184354, term184354.getClass(), "externAndJsRoot", null);
        setField(term184354, term184354.getClass(), "inputsById", null);
        setField(term184354, term184354.getClass(), "sourceMap", null);
        setField(term184354, term184354.getClass(), "externExports", null);
        setIntField(term184354, term184354.getClass(), "uniqueNameId", 0);
        setBooleanField(term184354, term184354.getClass(), "hasRegExpGlobalReferences", false);
        setField(term184354, term184354.getClass(), "functionInformationMap", null);
        setField(term184354, term184354.getClass(), "debugLog", null);
        setField(term184354, term184354.getClass(), "defaultCodingConvention", null);
        setField(term184354, term184354.getClass(), "typeRegistry", null);
        setField(term184354, term184354.getClass(), "parserConfig", null);
        setField(term184354, term184354.getClass(), "abstractInterpreter", null);
        setField(term184354, term184354.getClass(), "typeValidator", null);
        setField(term184354, term184354.getClass(), "tracker", null);
        setField(term184354, term184354.getClass(), "oldErrorReporter", null);
        setField(term184354, term184354.getClass(), "defaultErrorReporter", null);
        setField(term184354, term184354.getClass(), "compilerThread", null);
        setBooleanField(term184354, term184354.getClass(), "useThreads", false);
        setField(term184354, term184354.getClass(), "outStream", null);
        setField(term184354, term184354.getClass(), "globalRefMap", null);
        setDoubleField(term184354, term184354.getClass(), "progress", 0.0);
        setField(term184354, term184354.getClass(), "lastPassName", null);
        setField(term184354, term184354.getClass(), "sanityCheck", null);
        setField(term184354, term184354.getClass(), "currentTracer", null);
        setField(term184354, term184354.getClass(), "currentPassName", null);
        setIntField(term184354, term184354.getClass(), "syntheticCodeId", 0);
        setField(term184354, term184354.getClass(), "recentChange", null);
        setField(term184354, term184354.getClass(), "codeChangeHandlers", null);
        setField(term184354, term184354.getClass(), "synthesizedExternsInput", null);
        setField(term184354, term184354.getClass(), "stage", null);
        setField(term184353, term184353.getClass(), "compiler", term184354);
        setField(term184353, term184353.getClass(), "filenamePrefix", null);
        setBooleanField(term184353, term184353.getClass(), "reportDependencies", false);
        setField(term184353, term184353.getClass(), "module", null);
        term184355 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term184356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term184357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term184355, term184355.getClass(), "number", 0.0);
        setIntField(term184355, term184355.getClass(), "type", 37);
        setField(term184355, term184355.getClass(), "next", null);
        setDoubleField(term184356, term184356.getClass(), "number", 0.0);
        setIntField(term184356, term184356.getClass(), "type", 0);
        setDoubleField(term184357, term184357.getClass(), "number", 0.0);
        setIntField(term184357, term184357.getClass(), "type", 0);
        setField(term184357, term184357.getClass(), "next", null);
        setField(term184357, term184357.getClass(), "first", null);
        setField(term184357, term184357.getClass(), "last", null);
        setField(term184357, term184357.getClass(), "propListHead", null);
        setIntField(term184357, term184357.getClass(), "sourcePosition", 0);
        setField(term184357, term184357.getClass(), "jsType", null);
        setField(term184357, term184357.getClass(), "parent", null);
        setField(term184356, term184356.getClass(), "next", term184357);
        setField(term184356, term184356.getClass(), "first", null);
        setField(term184356, term184356.getClass(), "last", null);
        setField(term184356, term184356.getClass(), "propListHead", null);
        setIntField(term184356, term184356.getClass(), "sourcePosition", 0);
        setField(term184356, term184356.getClass(), "jsType", null);
        setField(term184356, term184356.getClass(), "parent", null);
        setField(term184355, term184355.getClass(), "first", term184356);
        setField(term184355, term184355.getClass(), "last", null);
        setField(term184355, term184355.getClass(), "propListHead", null);
        setIntField(term184355, term184355.getClass(), "sourcePosition", 0);
        setField(term184355, term184355.getClass(), "jsType", null);
        setField(term184355, term184355.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term182884;
        callMethod(klass, "process", argTypes, term182712, args);
        assertTrue(recursiveEquals(term182712, term184353));
        assertTrue(recursiveEquals(term182884, null));
    }

};


