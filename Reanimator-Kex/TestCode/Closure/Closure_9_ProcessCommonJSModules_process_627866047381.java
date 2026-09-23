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

public class ProcessCommonJSModules_process_627866047381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206135;
     Object term206307;
     Object term207230;
     Object term207232;

    public ProcessCommonJSModules_process_627866047381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206135 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term206215 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term206135, term206135.getClass(), "compiler", term206215);
        term206307 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206399 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term206307, term206307.getClass(), "type", 0);
        setField(term206307, term206307.getClass(), "parent", null);
        setField(term206399, term206399.getClass(), "next", term206469);
        setIntField(term206399, term206399.getClass(), "type", 0);
        setField(term206561, term206561.getClass(), "next", term206631);
        setIntField(term206561, term206561.getClass(), "type", 0);
        setField(term206561, term206561.getClass(), "first", term206701);
        setField(term206399, term206399.getClass(), "first", term206561);
        setField(term206307, term206307.getClass(), "first", term206399);
        term207230 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term207231 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term207231, term207231.getClass(), "options", null);
        setField(term207231, term207231.getClass(), "passes", null);
        setField(term207231, term207231.getClass(), "externs", null);
        setField(term207231, term207231.getClass(), "modules", null);
        setField(term207231, term207231.getClass(), "moduleGraph", null);
        setField(term207231, term207231.getClass(), "inputs", null);
        setField(term207231, term207231.getClass(), "errorManager", null);
        setField(term207231, term207231.getClass(), "warningsGuard", null);
        setField(term207231, term207231.getClass(), "injectedLibraries", null);
        setField(term207231, term207231.getClass(), "externsRoot", null);
        setField(term207231, term207231.getClass(), "jsRoot", null);
        setField(term207231, term207231.getClass(), "externAndJsRoot", null);
        setField(term207231, term207231.getClass(), "inputsById", null);
        setField(term207231, term207231.getClass(), "sourceMap", null);
        setField(term207231, term207231.getClass(), "externExports", null);
        setIntField(term207231, term207231.getClass(), "uniqueNameId", 0);
        setBooleanField(term207231, term207231.getClass(), "hasRegExpGlobalReferences", false);
        setField(term207231, term207231.getClass(), "functionInformationMap", null);
        setField(term207231, term207231.getClass(), "debugLog", null);
        setField(term207231, term207231.getClass(), "defaultCodingConvention", null);
        setField(term207231, term207231.getClass(), "typeRegistry", null);
        setField(term207231, term207231.getClass(), "parserConfig", null);
        setField(term207231, term207231.getClass(), "abstractInterpreter", null);
        setField(term207231, term207231.getClass(), "typeValidator", null);
        setField(term207231, term207231.getClass(), "tracker", null);
        setField(term207231, term207231.getClass(), "oldErrorReporter", null);
        setField(term207231, term207231.getClass(), "defaultErrorReporter", null);
        setField(term207231, term207231.getClass(), "compilerThread", null);
        setBooleanField(term207231, term207231.getClass(), "useThreads", false);
        setField(term207231, term207231.getClass(), "outStream", null);
        setField(term207231, term207231.getClass(), "globalRefMap", null);
        setDoubleField(term207231, term207231.getClass(), "progress", 0.0);
        setField(term207231, term207231.getClass(), "lastPassName", null);
        setField(term207231, term207231.getClass(), "sanityCheck", null);
        setField(term207231, term207231.getClass(), "currentTracer", null);
        setField(term207231, term207231.getClass(), "currentPassName", null);
        setIntField(term207231, term207231.getClass(), "syntheticCodeId", 0);
        setField(term207231, term207231.getClass(), "recentChange", null);
        setField(term207231, term207231.getClass(), "codeChangeHandlers", null);
        setField(term207231, term207231.getClass(), "synthesizedExternsInput", null);
        setField(term207231, term207231.getClass(), "stage", null);
        setField(term207230, term207230.getClass(), "compiler", term207231);
        setField(term207230, term207230.getClass(), "filenamePrefix", null);
        setBooleanField(term207230, term207230.getClass(), "reportDependencies", false);
        setField(term207230, term207230.getClass(), "module", null);
        term207232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term207233 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term207234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term207236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term207232, term207232.getClass(), "number", 0.0);
        setIntField(term207232, term207232.getClass(), "type", 0);
        setField(term207232, term207232.getClass(), "next", null);
        setDoubleField(term207233, term207233.getClass(), "number", 0.0);
        setIntField(term207233, term207233.getClass(), "type", 0);
        setIntField(term207234, term207234.getClass(), "type", 0);
        setField(term207234, term207234.getClass(), "next", null);
        setField(term207234, term207234.getClass(), "first", null);
        setField(term207234, term207234.getClass(), "last", null);
        setField(term207234, term207234.getClass(), "propListHead", null);
        setIntField(term207234, term207234.getClass(), "sourcePosition", 0);
        setField(term207234, term207234.getClass(), "jsType", null);
        setField(term207234, term207234.getClass(), "parent", null);
        setField(term207233, term207233.getClass(), "next", term207234);
        setDoubleField(term207235, term207235.getClass(), "number", 0.0);
        setIntField(term207235, term207235.getClass(), "type", 0);
        setIntField(term207236, term207236.getClass(), "type", 0);
        setField(term207236, term207236.getClass(), "next", null);
        setField(term207236, term207236.getClass(), "first", null);
        setField(term207236, term207236.getClass(), "last", null);
        setField(term207236, term207236.getClass(), "propListHead", null);
        setIntField(term207236, term207236.getClass(), "sourcePosition", 0);
        setField(term207236, term207236.getClass(), "jsType", null);
        setField(term207236, term207236.getClass(), "parent", null);
        setField(term207235, term207235.getClass(), "next", term207236);
        setIntField(term207237, term207237.getClass(), "type", 0);
        setField(term207237, term207237.getClass(), "next", null);
        setField(term207237, term207237.getClass(), "first", null);
        setField(term207237, term207237.getClass(), "last", null);
        setField(term207237, term207237.getClass(), "propListHead", null);
        setIntField(term207237, term207237.getClass(), "sourcePosition", 0);
        setField(term207237, term207237.getClass(), "jsType", null);
        setField(term207237, term207237.getClass(), "parent", null);
        setField(term207235, term207235.getClass(), "first", term207237);
        setField(term207235, term207235.getClass(), "last", null);
        setField(term207235, term207235.getClass(), "propListHead", null);
        setIntField(term207235, term207235.getClass(), "sourcePosition", 0);
        setField(term207235, term207235.getClass(), "jsType", null);
        setField(term207235, term207235.getClass(), "parent", null);
        setField(term207233, term207233.getClass(), "first", term207235);
        setField(term207233, term207233.getClass(), "last", null);
        setField(term207233, term207233.getClass(), "propListHead", null);
        setIntField(term207233, term207233.getClass(), "sourcePosition", 0);
        setField(term207233, term207233.getClass(), "jsType", null);
        setField(term207233, term207233.getClass(), "parent", null);
        setField(term207232, term207232.getClass(), "first", term207233);
        setField(term207232, term207232.getClass(), "last", null);
        setField(term207232, term207232.getClass(), "propListHead", null);
        setIntField(term207232, term207232.getClass(), "sourcePosition", 0);
        setField(term207232, term207232.getClass(), "jsType", null);
        setField(term207232, term207232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term206307;
        callMethod(klass, "process", argTypes, term206135, args);
        assertTrue(recursiveEquals(term206135, term207230));
        assertTrue(recursiveEquals(term206307, null));
    }

};


