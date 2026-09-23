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

public class ProcessCommonJSModules_process_627866047323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168556;
     Object term168728;
     Object term169216;
     Object term169218;

    public ProcessCommonJSModules_process_627866047323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168556 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term168636 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term168556, term168556.getClass(), "compiler", term168636);
        term168728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168912 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term168728, term168728.getClass(), "type", 0);
        setField(term168728, term168728.getClass(), "parent", null);
        setField(term168820, term168820.getClass(), "next", null);
        setIntField(term168820, term168820.getClass(), "type", 37);
        setField(term168912, term168912.getClass(), "next", null);
        setIntField(term168912, term168912.getClass(), "type", 0);
        setField(term168912, term168912.getClass(), "first", null);
        setField(term168820, term168820.getClass(), "first", term168912);
        setField(term168728, term168728.getClass(), "first", term168820);
        term169216 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term169217 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term169217, term169217.getClass(), "options", null);
        setField(term169217, term169217.getClass(), "passes", null);
        setField(term169217, term169217.getClass(), "externs", null);
        setField(term169217, term169217.getClass(), "modules", null);
        setField(term169217, term169217.getClass(), "moduleGraph", null);
        setField(term169217, term169217.getClass(), "inputs", null);
        setField(term169217, term169217.getClass(), "errorManager", null);
        setField(term169217, term169217.getClass(), "warningsGuard", null);
        setField(term169217, term169217.getClass(), "injectedLibraries", null);
        setField(term169217, term169217.getClass(), "externsRoot", null);
        setField(term169217, term169217.getClass(), "jsRoot", null);
        setField(term169217, term169217.getClass(), "externAndJsRoot", null);
        setField(term169217, term169217.getClass(), "inputsById", null);
        setField(term169217, term169217.getClass(), "sourceMap", null);
        setField(term169217, term169217.getClass(), "externExports", null);
        setIntField(term169217, term169217.getClass(), "uniqueNameId", 0);
        setBooleanField(term169217, term169217.getClass(), "hasRegExpGlobalReferences", false);
        setField(term169217, term169217.getClass(), "functionInformationMap", null);
        setField(term169217, term169217.getClass(), "debugLog", null);
        setField(term169217, term169217.getClass(), "defaultCodingConvention", null);
        setField(term169217, term169217.getClass(), "typeRegistry", null);
        setField(term169217, term169217.getClass(), "parserConfig", null);
        setField(term169217, term169217.getClass(), "abstractInterpreter", null);
        setField(term169217, term169217.getClass(), "typeValidator", null);
        setField(term169217, term169217.getClass(), "tracker", null);
        setField(term169217, term169217.getClass(), "oldErrorReporter", null);
        setField(term169217, term169217.getClass(), "defaultErrorReporter", null);
        setField(term169217, term169217.getClass(), "compilerThread", null);
        setBooleanField(term169217, term169217.getClass(), "useThreads", false);
        setField(term169217, term169217.getClass(), "outStream", null);
        setField(term169217, term169217.getClass(), "globalRefMap", null);
        setDoubleField(term169217, term169217.getClass(), "progress", 0.0);
        setField(term169217, term169217.getClass(), "lastPassName", null);
        setField(term169217, term169217.getClass(), "sanityCheck", null);
        setField(term169217, term169217.getClass(), "currentTracer", null);
        setField(term169217, term169217.getClass(), "currentPassName", null);
        setIntField(term169217, term169217.getClass(), "syntheticCodeId", 0);
        setField(term169217, term169217.getClass(), "recentChange", null);
        setField(term169217, term169217.getClass(), "codeChangeHandlers", null);
        setField(term169217, term169217.getClass(), "synthesizedExternsInput", null);
        setField(term169217, term169217.getClass(), "stage", null);
        setField(term169216, term169216.getClass(), "compiler", term169217);
        setField(term169216, term169216.getClass(), "filenamePrefix", null);
        setBooleanField(term169216, term169216.getClass(), "reportDependencies", false);
        setField(term169216, term169216.getClass(), "module", null);
        term169218 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169219 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term169218, term169218.getClass(), "number", 0.0);
        setIntField(term169218, term169218.getClass(), "type", 0);
        setField(term169218, term169218.getClass(), "next", null);
        setDoubleField(term169219, term169219.getClass(), "number", 0.0);
        setIntField(term169219, term169219.getClass(), "type", 37);
        setField(term169219, term169219.getClass(), "next", null);
        setDoubleField(term169220, term169220.getClass(), "number", 0.0);
        setIntField(term169220, term169220.getClass(), "type", 0);
        setField(term169220, term169220.getClass(), "next", null);
        setField(term169220, term169220.getClass(), "first", null);
        setField(term169220, term169220.getClass(), "last", null);
        setField(term169220, term169220.getClass(), "propListHead", null);
        setIntField(term169220, term169220.getClass(), "sourcePosition", 0);
        setField(term169220, term169220.getClass(), "jsType", null);
        setField(term169220, term169220.getClass(), "parent", null);
        setField(term169219, term169219.getClass(), "first", term169220);
        setField(term169219, term169219.getClass(), "last", null);
        setField(term169219, term169219.getClass(), "propListHead", null);
        setIntField(term169219, term169219.getClass(), "sourcePosition", 0);
        setField(term169219, term169219.getClass(), "jsType", null);
        setField(term169219, term169219.getClass(), "parent", null);
        setField(term169218, term169218.getClass(), "first", term169219);
        setField(term169218, term169218.getClass(), "last", null);
        setField(term169218, term169218.getClass(), "propListHead", null);
        setIntField(term169218, term169218.getClass(), "sourcePosition", 0);
        setField(term169218, term169218.getClass(), "jsType", null);
        setField(term169218, term169218.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term168728;
        callMethod(klass, "process", argTypes, term168556, args);
        assertTrue(recursiveEquals(term168556, term169216));
        assertTrue(recursiveEquals(term168728, null));
    }

};


