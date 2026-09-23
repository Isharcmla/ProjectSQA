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

public class ProcessCommonJSModules_process_627866047368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195962;
     Object term196112;
     Object term198540;
     Object term198542;

    public ProcessCommonJSModules_process_627866047368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195962 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term196042 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term195962, term195962.getClass(), "compiler", term196042);
        term196112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term196112, term196112.getClass(), "type", 33);
        setField(term196112, term196112.getClass(), "parent", null);
        setField(term196182, term196182.getClass(), "next", null);
        setIntField(term196182, term196182.getClass(), "type", 0);
        setField(term196252, term196252.getClass(), "next", null);
        setIntField(term196252, term196252.getClass(), "type", 0);
        setField(term196252, term196252.getClass(), "first", null);
        setField(term196182, term196182.getClass(), "first", term196252);
        setField(term196112, term196112.getClass(), "first", term196182);
        term198540 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term198541 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term198541, term198541.getClass(), "options", null);
        setField(term198541, term198541.getClass(), "passes", null);
        setField(term198541, term198541.getClass(), "externs", null);
        setField(term198541, term198541.getClass(), "modules", null);
        setField(term198541, term198541.getClass(), "moduleGraph", null);
        setField(term198541, term198541.getClass(), "inputs", null);
        setField(term198541, term198541.getClass(), "errorManager", null);
        setField(term198541, term198541.getClass(), "warningsGuard", null);
        setField(term198541, term198541.getClass(), "injectedLibraries", null);
        setField(term198541, term198541.getClass(), "externsRoot", null);
        setField(term198541, term198541.getClass(), "jsRoot", null);
        setField(term198541, term198541.getClass(), "externAndJsRoot", null);
        setField(term198541, term198541.getClass(), "inputsById", null);
        setField(term198541, term198541.getClass(), "sourceMap", null);
        setField(term198541, term198541.getClass(), "externExports", null);
        setIntField(term198541, term198541.getClass(), "uniqueNameId", 0);
        setBooleanField(term198541, term198541.getClass(), "hasRegExpGlobalReferences", false);
        setField(term198541, term198541.getClass(), "functionInformationMap", null);
        setField(term198541, term198541.getClass(), "debugLog", null);
        setField(term198541, term198541.getClass(), "defaultCodingConvention", null);
        setField(term198541, term198541.getClass(), "typeRegistry", null);
        setField(term198541, term198541.getClass(), "parserConfig", null);
        setField(term198541, term198541.getClass(), "abstractInterpreter", null);
        setField(term198541, term198541.getClass(), "typeValidator", null);
        setField(term198541, term198541.getClass(), "tracker", null);
        setField(term198541, term198541.getClass(), "oldErrorReporter", null);
        setField(term198541, term198541.getClass(), "defaultErrorReporter", null);
        setField(term198541, term198541.getClass(), "compilerThread", null);
        setBooleanField(term198541, term198541.getClass(), "useThreads", false);
        setField(term198541, term198541.getClass(), "outStream", null);
        setField(term198541, term198541.getClass(), "globalRefMap", null);
        setDoubleField(term198541, term198541.getClass(), "progress", 0.0);
        setField(term198541, term198541.getClass(), "lastPassName", null);
        setField(term198541, term198541.getClass(), "sanityCheck", null);
        setField(term198541, term198541.getClass(), "currentTracer", null);
        setField(term198541, term198541.getClass(), "currentPassName", null);
        setIntField(term198541, term198541.getClass(), "syntheticCodeId", 0);
        setField(term198541, term198541.getClass(), "recentChange", null);
        setField(term198541, term198541.getClass(), "codeChangeHandlers", null);
        setField(term198541, term198541.getClass(), "synthesizedExternsInput", null);
        setField(term198541, term198541.getClass(), "stage", null);
        setField(term198540, term198540.getClass(), "compiler", term198541);
        setField(term198540, term198540.getClass(), "filenamePrefix", null);
        setBooleanField(term198540, term198540.getClass(), "reportDependencies", false);
        setField(term198540, term198540.getClass(), "module", null);
        term198542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term198542, term198542.getClass(), "type", 33);
        setField(term198542, term198542.getClass(), "next", null);
        setIntField(term198543, term198543.getClass(), "type", 0);
        setField(term198543, term198543.getClass(), "next", null);
        setIntField(term198544, term198544.getClass(), "type", 0);
        setField(term198544, term198544.getClass(), "next", null);
        setField(term198544, term198544.getClass(), "first", null);
        setField(term198544, term198544.getClass(), "last", null);
        setField(term198544, term198544.getClass(), "propListHead", null);
        setIntField(term198544, term198544.getClass(), "sourcePosition", 0);
        setField(term198544, term198544.getClass(), "jsType", null);
        setField(term198544, term198544.getClass(), "parent", null);
        setField(term198543, term198543.getClass(), "first", term198544);
        setField(term198543, term198543.getClass(), "last", null);
        setField(term198543, term198543.getClass(), "propListHead", null);
        setIntField(term198543, term198543.getClass(), "sourcePosition", 0);
        setField(term198543, term198543.getClass(), "jsType", null);
        setField(term198543, term198543.getClass(), "parent", null);
        setField(term198542, term198542.getClass(), "first", term198543);
        setField(term198542, term198542.getClass(), "last", null);
        setField(term198542, term198542.getClass(), "propListHead", null);
        setIntField(term198542, term198542.getClass(), "sourcePosition", 0);
        setField(term198542, term198542.getClass(), "jsType", null);
        setField(term198542, term198542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term196112;
        callMethod(klass, "process", argTypes, term195962, args);
        assertTrue(recursiveEquals(term195962, term198540));
        assertTrue(recursiveEquals(term196112, null));
    }

};


