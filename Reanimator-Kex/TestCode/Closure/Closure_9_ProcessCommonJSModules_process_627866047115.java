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

public class ProcessCommonJSModules_process_627866047115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51515;
     Object term51687;
     Object term52474;
     Object term52476;

    public ProcessCommonJSModules_process_627866047115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51515 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term51595 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term51515, term51515.getClass(), "compiler", term51595);
        term51687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51871 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term51687, term51687.getClass(), "type", 0);
        setField(term51687, term51687.getClass(), "parent", null);
        setField(term51871, term51871.getClass(), "next", null);
        setIntField(term51871, term51871.getClass(), "type", 37);
        setField(term51871, term51871.getClass(), "first", null);
        setField(term51779, term51779.getClass(), "next", term51871);
        setIntField(term51779, term51779.getClass(), "type", 0);
        setField(term51779, term51779.getClass(), "first", null);
        setField(term51687, term51687.getClass(), "first", term51779);
        term52474 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term52475 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term52475, term52475.getClass(), "options", null);
        setField(term52475, term52475.getClass(), "passes", null);
        setField(term52475, term52475.getClass(), "externs", null);
        setField(term52475, term52475.getClass(), "modules", null);
        setField(term52475, term52475.getClass(), "moduleGraph", null);
        setField(term52475, term52475.getClass(), "inputs", null);
        setField(term52475, term52475.getClass(), "errorManager", null);
        setField(term52475, term52475.getClass(), "warningsGuard", null);
        setField(term52475, term52475.getClass(), "injectedLibraries", null);
        setField(term52475, term52475.getClass(), "externsRoot", null);
        setField(term52475, term52475.getClass(), "jsRoot", null);
        setField(term52475, term52475.getClass(), "externAndJsRoot", null);
        setField(term52475, term52475.getClass(), "inputsById", null);
        setField(term52475, term52475.getClass(), "sourceMap", null);
        setField(term52475, term52475.getClass(), "externExports", null);
        setIntField(term52475, term52475.getClass(), "uniqueNameId", 0);
        setBooleanField(term52475, term52475.getClass(), "hasRegExpGlobalReferences", false);
        setField(term52475, term52475.getClass(), "functionInformationMap", null);
        setField(term52475, term52475.getClass(), "debugLog", null);
        setField(term52475, term52475.getClass(), "defaultCodingConvention", null);
        setField(term52475, term52475.getClass(), "typeRegistry", null);
        setField(term52475, term52475.getClass(), "parserConfig", null);
        setField(term52475, term52475.getClass(), "abstractInterpreter", null);
        setField(term52475, term52475.getClass(), "typeValidator", null);
        setField(term52475, term52475.getClass(), "tracker", null);
        setField(term52475, term52475.getClass(), "oldErrorReporter", null);
        setField(term52475, term52475.getClass(), "defaultErrorReporter", null);
        setField(term52475, term52475.getClass(), "compilerThread", null);
        setBooleanField(term52475, term52475.getClass(), "useThreads", false);
        setField(term52475, term52475.getClass(), "outStream", null);
        setField(term52475, term52475.getClass(), "globalRefMap", null);
        setDoubleField(term52475, term52475.getClass(), "progress", 0.0);
        setField(term52475, term52475.getClass(), "lastPassName", null);
        setField(term52475, term52475.getClass(), "sanityCheck", null);
        setField(term52475, term52475.getClass(), "currentTracer", null);
        setField(term52475, term52475.getClass(), "currentPassName", null);
        setIntField(term52475, term52475.getClass(), "syntheticCodeId", 0);
        setField(term52475, term52475.getClass(), "recentChange", null);
        setField(term52475, term52475.getClass(), "codeChangeHandlers", null);
        setField(term52475, term52475.getClass(), "synthesizedExternsInput", null);
        setField(term52475, term52475.getClass(), "stage", null);
        setField(term52474, term52474.getClass(), "compiler", term52475);
        setField(term52474, term52474.getClass(), "filenamePrefix", null);
        setBooleanField(term52474, term52474.getClass(), "reportDependencies", false);
        setField(term52474, term52474.getClass(), "module", null);
        term52476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term52476, term52476.getClass(), "number", 0.0);
        setIntField(term52476, term52476.getClass(), "type", 0);
        setField(term52476, term52476.getClass(), "next", null);
        setDoubleField(term52477, term52477.getClass(), "number", 0.0);
        setIntField(term52477, term52477.getClass(), "type", 0);
        setDoubleField(term52478, term52478.getClass(), "number", 0.0);
        setIntField(term52478, term52478.getClass(), "type", 37);
        setField(term52478, term52478.getClass(), "next", null);
        setField(term52478, term52478.getClass(), "first", null);
        setField(term52478, term52478.getClass(), "last", null);
        setField(term52478, term52478.getClass(), "propListHead", null);
        setIntField(term52478, term52478.getClass(), "sourcePosition", 0);
        setField(term52478, term52478.getClass(), "jsType", null);
        setField(term52478, term52478.getClass(), "parent", null);
        setField(term52477, term52477.getClass(), "next", term52478);
        setField(term52477, term52477.getClass(), "first", null);
        setField(term52477, term52477.getClass(), "last", null);
        setField(term52477, term52477.getClass(), "propListHead", null);
        setIntField(term52477, term52477.getClass(), "sourcePosition", 0);
        setField(term52477, term52477.getClass(), "jsType", null);
        setField(term52477, term52477.getClass(), "parent", null);
        setField(term52476, term52476.getClass(), "first", term52477);
        setField(term52476, term52476.getClass(), "last", null);
        setField(term52476, term52476.getClass(), "propListHead", null);
        setIntField(term52476, term52476.getClass(), "sourcePosition", 0);
        setField(term52476, term52476.getClass(), "jsType", null);
        setField(term52476, term52476.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term51687;
        callMethod(klass, "process", argTypes, term51515, args);
        assertTrue(recursiveEquals(term51515, term52474));
        assertTrue(recursiveEquals(term51687, null));
    }

};


