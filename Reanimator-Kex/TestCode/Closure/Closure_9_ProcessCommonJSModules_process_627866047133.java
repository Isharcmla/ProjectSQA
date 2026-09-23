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

public class ProcessCommonJSModules_process_627866047133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61800;
     Object term61972;
     Object term62294;
     Object term62296;

    public ProcessCommonJSModules_process_627866047133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61800 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term61880 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term61800, term61800.getClass(), "compiler", term61880);
        term61972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term61972, term61972.getClass(), "type", 0);
        setField(term61972, term61972.getClass(), "parent", null);
        setField(term62064, term62064.getClass(), "next", null);
        setIntField(term62064, term62064.getClass(), "type", 0);
        setField(term62064, term62064.getClass(), "first", null);
        setField(term61972, term61972.getClass(), "first", term62064);
        term62294 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term62295 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term62295, term62295.getClass(), "options", null);
        setField(term62295, term62295.getClass(), "passes", null);
        setField(term62295, term62295.getClass(), "externs", null);
        setField(term62295, term62295.getClass(), "modules", null);
        setField(term62295, term62295.getClass(), "moduleGraph", null);
        setField(term62295, term62295.getClass(), "inputs", null);
        setField(term62295, term62295.getClass(), "errorManager", null);
        setField(term62295, term62295.getClass(), "warningsGuard", null);
        setField(term62295, term62295.getClass(), "injectedLibraries", null);
        setField(term62295, term62295.getClass(), "externsRoot", null);
        setField(term62295, term62295.getClass(), "jsRoot", null);
        setField(term62295, term62295.getClass(), "externAndJsRoot", null);
        setField(term62295, term62295.getClass(), "inputsById", null);
        setField(term62295, term62295.getClass(), "sourceMap", null);
        setField(term62295, term62295.getClass(), "externExports", null);
        setIntField(term62295, term62295.getClass(), "uniqueNameId", 0);
        setBooleanField(term62295, term62295.getClass(), "hasRegExpGlobalReferences", false);
        setField(term62295, term62295.getClass(), "functionInformationMap", null);
        setField(term62295, term62295.getClass(), "debugLog", null);
        setField(term62295, term62295.getClass(), "defaultCodingConvention", null);
        setField(term62295, term62295.getClass(), "typeRegistry", null);
        setField(term62295, term62295.getClass(), "parserConfig", null);
        setField(term62295, term62295.getClass(), "abstractInterpreter", null);
        setField(term62295, term62295.getClass(), "typeValidator", null);
        setField(term62295, term62295.getClass(), "tracker", null);
        setField(term62295, term62295.getClass(), "oldErrorReporter", null);
        setField(term62295, term62295.getClass(), "defaultErrorReporter", null);
        setField(term62295, term62295.getClass(), "compilerThread", null);
        setBooleanField(term62295, term62295.getClass(), "useThreads", false);
        setField(term62295, term62295.getClass(), "outStream", null);
        setField(term62295, term62295.getClass(), "globalRefMap", null);
        setDoubleField(term62295, term62295.getClass(), "progress", 0.0);
        setField(term62295, term62295.getClass(), "lastPassName", null);
        setField(term62295, term62295.getClass(), "sanityCheck", null);
        setField(term62295, term62295.getClass(), "currentTracer", null);
        setField(term62295, term62295.getClass(), "currentPassName", null);
        setIntField(term62295, term62295.getClass(), "syntheticCodeId", 0);
        setField(term62295, term62295.getClass(), "recentChange", null);
        setField(term62295, term62295.getClass(), "codeChangeHandlers", null);
        setField(term62295, term62295.getClass(), "synthesizedExternsInput", null);
        setField(term62295, term62295.getClass(), "stage", null);
        setField(term62294, term62294.getClass(), "compiler", term62295);
        setField(term62294, term62294.getClass(), "filenamePrefix", null);
        setBooleanField(term62294, term62294.getClass(), "reportDependencies", false);
        setField(term62294, term62294.getClass(), "module", null);
        term62296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62297 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term62296, term62296.getClass(), "number", 0.0);
        setIntField(term62296, term62296.getClass(), "type", 0);
        setField(term62296, term62296.getClass(), "next", null);
        setDoubleField(term62297, term62297.getClass(), "number", 0.0);
        setIntField(term62297, term62297.getClass(), "type", 0);
        setField(term62297, term62297.getClass(), "next", null);
        setField(term62297, term62297.getClass(), "first", null);
        setField(term62297, term62297.getClass(), "last", null);
        setField(term62297, term62297.getClass(), "propListHead", null);
        setIntField(term62297, term62297.getClass(), "sourcePosition", 0);
        setField(term62297, term62297.getClass(), "jsType", null);
        setField(term62297, term62297.getClass(), "parent", null);
        setField(term62296, term62296.getClass(), "first", term62297);
        setField(term62296, term62296.getClass(), "last", null);
        setField(term62296, term62296.getClass(), "propListHead", null);
        setIntField(term62296, term62296.getClass(), "sourcePosition", 0);
        setField(term62296, term62296.getClass(), "jsType", null);
        setField(term62296, term62296.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61972;
        callMethod(klass, "process", argTypes, term61800, args);
        assertTrue(recursiveEquals(term61800, term62294));
        assertTrue(recursiveEquals(term61972, null));
    }

};


