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

public class ProcessCommonJSModules_process_62786604793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38846;
     Object term39018;
     Object term40562;
     Object term40564;

    public ProcessCommonJSModules_process_62786604793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38846 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term38926 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38846, term38846.getClass(), "compiler", term38926);
        term39018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term39018, term39018.getClass(), "type", 0);
        setField(term39018, term39018.getClass(), "parent", null);
        setField(term39110, term39110.getClass(), "next", term39202);
        setIntField(term39110, term39110.getClass(), "type", 37);
        setField(term39110, term39110.getClass(), "first", null);
        setField(term39018, term39018.getClass(), "first", term39110);
        term40562 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term40563 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term40563, term40563.getClass(), "options", null);
        setField(term40563, term40563.getClass(), "passes", null);
        setField(term40563, term40563.getClass(), "externs", null);
        setField(term40563, term40563.getClass(), "modules", null);
        setField(term40563, term40563.getClass(), "moduleGraph", null);
        setField(term40563, term40563.getClass(), "inputs", null);
        setField(term40563, term40563.getClass(), "errorManager", null);
        setField(term40563, term40563.getClass(), "warningsGuard", null);
        setField(term40563, term40563.getClass(), "injectedLibraries", null);
        setField(term40563, term40563.getClass(), "externsRoot", null);
        setField(term40563, term40563.getClass(), "jsRoot", null);
        setField(term40563, term40563.getClass(), "externAndJsRoot", null);
        setField(term40563, term40563.getClass(), "inputsById", null);
        setField(term40563, term40563.getClass(), "sourceMap", null);
        setField(term40563, term40563.getClass(), "externExports", null);
        setIntField(term40563, term40563.getClass(), "uniqueNameId", 0);
        setBooleanField(term40563, term40563.getClass(), "hasRegExpGlobalReferences", false);
        setField(term40563, term40563.getClass(), "functionInformationMap", null);
        setField(term40563, term40563.getClass(), "debugLog", null);
        setField(term40563, term40563.getClass(), "defaultCodingConvention", null);
        setField(term40563, term40563.getClass(), "typeRegistry", null);
        setField(term40563, term40563.getClass(), "parserConfig", null);
        setField(term40563, term40563.getClass(), "abstractInterpreter", null);
        setField(term40563, term40563.getClass(), "typeValidator", null);
        setField(term40563, term40563.getClass(), "tracker", null);
        setField(term40563, term40563.getClass(), "oldErrorReporter", null);
        setField(term40563, term40563.getClass(), "defaultErrorReporter", null);
        setField(term40563, term40563.getClass(), "compilerThread", null);
        setBooleanField(term40563, term40563.getClass(), "useThreads", false);
        setField(term40563, term40563.getClass(), "outStream", null);
        setField(term40563, term40563.getClass(), "globalRefMap", null);
        setDoubleField(term40563, term40563.getClass(), "progress", 0.0);
        setField(term40563, term40563.getClass(), "lastPassName", null);
        setField(term40563, term40563.getClass(), "sanityCheck", null);
        setField(term40563, term40563.getClass(), "currentTracer", null);
        setField(term40563, term40563.getClass(), "currentPassName", null);
        setIntField(term40563, term40563.getClass(), "syntheticCodeId", 0);
        setField(term40563, term40563.getClass(), "recentChange", null);
        setField(term40563, term40563.getClass(), "codeChangeHandlers", null);
        setField(term40563, term40563.getClass(), "synthesizedExternsInput", null);
        setField(term40563, term40563.getClass(), "stage", null);
        setField(term40562, term40562.getClass(), "compiler", term40563);
        setField(term40562, term40562.getClass(), "filenamePrefix", null);
        setBooleanField(term40562, term40562.getClass(), "reportDependencies", false);
        setField(term40562, term40562.getClass(), "module", null);
        term40564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term40564, term40564.getClass(), "number", 0.0);
        setIntField(term40564, term40564.getClass(), "type", 0);
        setField(term40564, term40564.getClass(), "next", null);
        setDoubleField(term40565, term40565.getClass(), "number", 0.0);
        setIntField(term40565, term40565.getClass(), "type", 37);
        setDoubleField(term40566, term40566.getClass(), "number", 0.0);
        setIntField(term40566, term40566.getClass(), "type", 0);
        setField(term40566, term40566.getClass(), "next", null);
        setField(term40566, term40566.getClass(), "first", null);
        setField(term40566, term40566.getClass(), "last", null);
        setField(term40566, term40566.getClass(), "propListHead", null);
        setIntField(term40566, term40566.getClass(), "sourcePosition", 0);
        setField(term40566, term40566.getClass(), "jsType", null);
        setField(term40566, term40566.getClass(), "parent", null);
        setField(term40565, term40565.getClass(), "next", term40566);
        setField(term40565, term40565.getClass(), "first", null);
        setField(term40565, term40565.getClass(), "last", null);
        setField(term40565, term40565.getClass(), "propListHead", null);
        setIntField(term40565, term40565.getClass(), "sourcePosition", 0);
        setField(term40565, term40565.getClass(), "jsType", null);
        setField(term40565, term40565.getClass(), "parent", null);
        setField(term40564, term40564.getClass(), "first", term40565);
        setField(term40564, term40564.getClass(), "last", null);
        setField(term40564, term40564.getClass(), "propListHead", null);
        setIntField(term40564, term40564.getClass(), "sourcePosition", 0);
        setField(term40564, term40564.getClass(), "jsType", null);
        setField(term40564, term40564.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term39018;
        callMethod(klass, "process", argTypes, term38846, args);
        assertTrue(recursiveEquals(term38846, term40562));
        assertTrue(recursiveEquals(term39018, null));
    }

};


