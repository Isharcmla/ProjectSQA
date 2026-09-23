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

public class ProcessCommonJSModules_process_62786604769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25491;
     Object term25641;
     Object term26304;
     Object term26306;

    public ProcessCommonJSModules_process_62786604769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25491 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term25571 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25491, term25491.getClass(), "compiler", term25571);
        term25641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term25641, term25641.getClass(), "type", 37);
        setField(term25641, term25641.getClass(), "parent", null);
        setField(term25803, term25803.getClass(), "next", null);
        setIntField(term25803, term25803.getClass(), "type", 0);
        setField(term25803, term25803.getClass(), "first", null);
        setField(term25733, term25733.getClass(), "next", term25803);
        setIntField(term25733, term25733.getClass(), "type", 37);
        setField(term25895, term25895.getClass(), "next", null);
        setIntField(term25895, term25895.getClass(), "type", 0);
        setField(term25895, term25895.getClass(), "first", null);
        setField(term25733, term25733.getClass(), "first", term25895);
        setField(term25641, term25641.getClass(), "first", term25733);
        term26304 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term26305 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26305, term26305.getClass(), "options", null);
        setField(term26305, term26305.getClass(), "passes", null);
        setField(term26305, term26305.getClass(), "externs", null);
        setField(term26305, term26305.getClass(), "modules", null);
        setField(term26305, term26305.getClass(), "moduleGraph", null);
        setField(term26305, term26305.getClass(), "inputs", null);
        setField(term26305, term26305.getClass(), "errorManager", null);
        setField(term26305, term26305.getClass(), "warningsGuard", null);
        setField(term26305, term26305.getClass(), "injectedLibraries", null);
        setField(term26305, term26305.getClass(), "externsRoot", null);
        setField(term26305, term26305.getClass(), "jsRoot", null);
        setField(term26305, term26305.getClass(), "externAndJsRoot", null);
        setField(term26305, term26305.getClass(), "inputsById", null);
        setField(term26305, term26305.getClass(), "sourceMap", null);
        setField(term26305, term26305.getClass(), "externExports", null);
        setIntField(term26305, term26305.getClass(), "uniqueNameId", 0);
        setBooleanField(term26305, term26305.getClass(), "hasRegExpGlobalReferences", false);
        setField(term26305, term26305.getClass(), "functionInformationMap", null);
        setField(term26305, term26305.getClass(), "debugLog", null);
        setField(term26305, term26305.getClass(), "defaultCodingConvention", null);
        setField(term26305, term26305.getClass(), "typeRegistry", null);
        setField(term26305, term26305.getClass(), "parserConfig", null);
        setField(term26305, term26305.getClass(), "abstractInterpreter", null);
        setField(term26305, term26305.getClass(), "typeValidator", null);
        setField(term26305, term26305.getClass(), "tracker", null);
        setField(term26305, term26305.getClass(), "oldErrorReporter", null);
        setField(term26305, term26305.getClass(), "defaultErrorReporter", null);
        setField(term26305, term26305.getClass(), "compilerThread", null);
        setBooleanField(term26305, term26305.getClass(), "useThreads", false);
        setField(term26305, term26305.getClass(), "outStream", null);
        setField(term26305, term26305.getClass(), "globalRefMap", null);
        setDoubleField(term26305, term26305.getClass(), "progress", 0.0);
        setField(term26305, term26305.getClass(), "lastPassName", null);
        setField(term26305, term26305.getClass(), "sanityCheck", null);
        setField(term26305, term26305.getClass(), "currentTracer", null);
        setField(term26305, term26305.getClass(), "currentPassName", null);
        setIntField(term26305, term26305.getClass(), "syntheticCodeId", 0);
        setField(term26305, term26305.getClass(), "recentChange", null);
        setField(term26305, term26305.getClass(), "codeChangeHandlers", null);
        setField(term26305, term26305.getClass(), "synthesizedExternsInput", null);
        setField(term26305, term26305.getClass(), "stage", null);
        setField(term26304, term26304.getClass(), "compiler", term26305);
        setField(term26304, term26304.getClass(), "filenamePrefix", null);
        setBooleanField(term26304, term26304.getClass(), "reportDependencies", false);
        setField(term26304, term26304.getClass(), "module", null);
        term26306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26307 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term26308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term26306, term26306.getClass(), "type", 37);
        setField(term26306, term26306.getClass(), "next", null);
        setDoubleField(term26307, term26307.getClass(), "number", 0.0);
        setIntField(term26307, term26307.getClass(), "type", 37);
        setIntField(term26308, term26308.getClass(), "type", 0);
        setField(term26308, term26308.getClass(), "next", null);
        setField(term26308, term26308.getClass(), "first", null);
        setField(term26308, term26308.getClass(), "last", null);
        setField(term26308, term26308.getClass(), "propListHead", null);
        setIntField(term26308, term26308.getClass(), "sourcePosition", 0);
        setField(term26308, term26308.getClass(), "jsType", null);
        setField(term26308, term26308.getClass(), "parent", null);
        setField(term26307, term26307.getClass(), "next", term26308);
        setDoubleField(term26309, term26309.getClass(), "number", 0.0);
        setIntField(term26309, term26309.getClass(), "type", 0);
        setField(term26309, term26309.getClass(), "next", null);
        setField(term26309, term26309.getClass(), "first", null);
        setField(term26309, term26309.getClass(), "last", null);
        setField(term26309, term26309.getClass(), "propListHead", null);
        setIntField(term26309, term26309.getClass(), "sourcePosition", 0);
        setField(term26309, term26309.getClass(), "jsType", null);
        setField(term26309, term26309.getClass(), "parent", null);
        setField(term26307, term26307.getClass(), "first", term26309);
        setField(term26307, term26307.getClass(), "last", null);
        setField(term26307, term26307.getClass(), "propListHead", null);
        setIntField(term26307, term26307.getClass(), "sourcePosition", 0);
        setField(term26307, term26307.getClass(), "jsType", null);
        setField(term26307, term26307.getClass(), "parent", null);
        setField(term26306, term26306.getClass(), "first", term26307);
        setField(term26306, term26306.getClass(), "last", null);
        setField(term26306, term26306.getClass(), "propListHead", null);
        setIntField(term26306, term26306.getClass(), "sourcePosition", 0);
        setField(term26306, term26306.getClass(), "jsType", null);
        setField(term26306, term26306.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25641;
        callMethod(klass, "process", argTypes, term25491, args);
        assertTrue(recursiveEquals(term25491, term26304));
        assertTrue(recursiveEquals(term25641, null));
    }

};


