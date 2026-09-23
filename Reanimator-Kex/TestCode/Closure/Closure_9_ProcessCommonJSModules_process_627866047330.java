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

public class ProcessCommonJSModules_process_627866047330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172276;
     Object term172426;
     Object term173589;
     Object term173591;

    public ProcessCommonJSModules_process_627866047330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172276 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term172356 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term172276, term172276.getClass(), "compiler", term172356);
        term172426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term172426, term172426.getClass(), "type", 33);
        setField(term172426, term172426.getClass(), "parent", null);
        setField(term172518, term172518.getClass(), "next", null);
        setIntField(term172518, term172518.getClass(), "type", 0);
        setField(term172610, term172610.getClass(), "next", null);
        setIntField(term172610, term172610.getClass(), "type", 0);
        setField(term172610, term172610.getClass(), "first", null);
        setField(term172518, term172518.getClass(), "first", term172610);
        setField(term172426, term172426.getClass(), "first", term172518);
        term173589 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term173590 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term173590, term173590.getClass(), "options", null);
        setField(term173590, term173590.getClass(), "passes", null);
        setField(term173590, term173590.getClass(), "externs", null);
        setField(term173590, term173590.getClass(), "modules", null);
        setField(term173590, term173590.getClass(), "moduleGraph", null);
        setField(term173590, term173590.getClass(), "inputs", null);
        setField(term173590, term173590.getClass(), "errorManager", null);
        setField(term173590, term173590.getClass(), "warningsGuard", null);
        setField(term173590, term173590.getClass(), "injectedLibraries", null);
        setField(term173590, term173590.getClass(), "externsRoot", null);
        setField(term173590, term173590.getClass(), "jsRoot", null);
        setField(term173590, term173590.getClass(), "externAndJsRoot", null);
        setField(term173590, term173590.getClass(), "inputsById", null);
        setField(term173590, term173590.getClass(), "sourceMap", null);
        setField(term173590, term173590.getClass(), "externExports", null);
        setIntField(term173590, term173590.getClass(), "uniqueNameId", 0);
        setBooleanField(term173590, term173590.getClass(), "hasRegExpGlobalReferences", false);
        setField(term173590, term173590.getClass(), "functionInformationMap", null);
        setField(term173590, term173590.getClass(), "debugLog", null);
        setField(term173590, term173590.getClass(), "defaultCodingConvention", null);
        setField(term173590, term173590.getClass(), "typeRegistry", null);
        setField(term173590, term173590.getClass(), "parserConfig", null);
        setField(term173590, term173590.getClass(), "abstractInterpreter", null);
        setField(term173590, term173590.getClass(), "typeValidator", null);
        setField(term173590, term173590.getClass(), "tracker", null);
        setField(term173590, term173590.getClass(), "oldErrorReporter", null);
        setField(term173590, term173590.getClass(), "defaultErrorReporter", null);
        setField(term173590, term173590.getClass(), "compilerThread", null);
        setBooleanField(term173590, term173590.getClass(), "useThreads", false);
        setField(term173590, term173590.getClass(), "outStream", null);
        setField(term173590, term173590.getClass(), "globalRefMap", null);
        setDoubleField(term173590, term173590.getClass(), "progress", 0.0);
        setField(term173590, term173590.getClass(), "lastPassName", null);
        setField(term173590, term173590.getClass(), "sanityCheck", null);
        setField(term173590, term173590.getClass(), "currentTracer", null);
        setField(term173590, term173590.getClass(), "currentPassName", null);
        setIntField(term173590, term173590.getClass(), "syntheticCodeId", 0);
        setField(term173590, term173590.getClass(), "recentChange", null);
        setField(term173590, term173590.getClass(), "codeChangeHandlers", null);
        setField(term173590, term173590.getClass(), "synthesizedExternsInput", null);
        setField(term173590, term173590.getClass(), "stage", null);
        setField(term173589, term173589.getClass(), "compiler", term173590);
        setField(term173589, term173589.getClass(), "filenamePrefix", null);
        setBooleanField(term173589, term173589.getClass(), "reportDependencies", false);
        setField(term173589, term173589.getClass(), "module", null);
        term173591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173592 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term173591, term173591.getClass(), "type", 33);
        setField(term173591, term173591.getClass(), "next", null);
        setDoubleField(term173592, term173592.getClass(), "number", 0.0);
        setIntField(term173592, term173592.getClass(), "type", 0);
        setField(term173592, term173592.getClass(), "next", null);
        setDoubleField(term173593, term173593.getClass(), "number", 0.0);
        setIntField(term173593, term173593.getClass(), "type", 0);
        setField(term173593, term173593.getClass(), "next", null);
        setField(term173593, term173593.getClass(), "first", null);
        setField(term173593, term173593.getClass(), "last", null);
        setField(term173593, term173593.getClass(), "propListHead", null);
        setIntField(term173593, term173593.getClass(), "sourcePosition", 0);
        setField(term173593, term173593.getClass(), "jsType", null);
        setField(term173593, term173593.getClass(), "parent", null);
        setField(term173592, term173592.getClass(), "first", term173593);
        setField(term173592, term173592.getClass(), "last", null);
        setField(term173592, term173592.getClass(), "propListHead", null);
        setIntField(term173592, term173592.getClass(), "sourcePosition", 0);
        setField(term173592, term173592.getClass(), "jsType", null);
        setField(term173592, term173592.getClass(), "parent", null);
        setField(term173591, term173591.getClass(), "first", term173592);
        setField(term173591, term173591.getClass(), "last", null);
        setField(term173591, term173591.getClass(), "propListHead", null);
        setIntField(term173591, term173591.getClass(), "sourcePosition", 0);
        setField(term173591, term173591.getClass(), "jsType", null);
        setField(term173591, term173591.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term172426;
        callMethod(klass, "process", argTypes, term172276, args);
        assertTrue(recursiveEquals(term172276, term173589));
        assertTrue(recursiveEquals(term172426, null));
    }

};


