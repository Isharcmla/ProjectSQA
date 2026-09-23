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

public class ProcessCommonJSModules_process_627866047114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50931;
     Object term51081;
     Object term52160;
     Object term52162;

    public ProcessCommonJSModules_process_627866047114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50931 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term51011 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term50931, term50931.getClass(), "compiler", term51011);
        term51081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51081, term51081.getClass(), "type", 37);
        setField(term51081, term51081.getClass(), "parent", null);
        setField(term51151, term51151.getClass(), "next", null);
        setIntField(term51151, term51151.getClass(), "type", 0);
        setField(term51221, term51221.getClass(), "next", null);
        setIntField(term51221, term51221.getClass(), "type", 0);
        setField(term51221, term51221.getClass(), "first", null);
        setField(term51151, term51151.getClass(), "first", term51221);
        setField(term51081, term51081.getClass(), "first", term51151);
        term52160 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term52161 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term52161, term52161.getClass(), "options", null);
        setField(term52161, term52161.getClass(), "passes", null);
        setField(term52161, term52161.getClass(), "externs", null);
        setField(term52161, term52161.getClass(), "modules", null);
        setField(term52161, term52161.getClass(), "moduleGraph", null);
        setField(term52161, term52161.getClass(), "inputs", null);
        setField(term52161, term52161.getClass(), "errorManager", null);
        setField(term52161, term52161.getClass(), "warningsGuard", null);
        setField(term52161, term52161.getClass(), "injectedLibraries", null);
        setField(term52161, term52161.getClass(), "externsRoot", null);
        setField(term52161, term52161.getClass(), "jsRoot", null);
        setField(term52161, term52161.getClass(), "externAndJsRoot", null);
        setField(term52161, term52161.getClass(), "inputsById", null);
        setField(term52161, term52161.getClass(), "sourceMap", null);
        setField(term52161, term52161.getClass(), "externExports", null);
        setIntField(term52161, term52161.getClass(), "uniqueNameId", 0);
        setBooleanField(term52161, term52161.getClass(), "hasRegExpGlobalReferences", false);
        setField(term52161, term52161.getClass(), "functionInformationMap", null);
        setField(term52161, term52161.getClass(), "debugLog", null);
        setField(term52161, term52161.getClass(), "defaultCodingConvention", null);
        setField(term52161, term52161.getClass(), "typeRegistry", null);
        setField(term52161, term52161.getClass(), "parserConfig", null);
        setField(term52161, term52161.getClass(), "abstractInterpreter", null);
        setField(term52161, term52161.getClass(), "typeValidator", null);
        setField(term52161, term52161.getClass(), "tracker", null);
        setField(term52161, term52161.getClass(), "oldErrorReporter", null);
        setField(term52161, term52161.getClass(), "defaultErrorReporter", null);
        setField(term52161, term52161.getClass(), "compilerThread", null);
        setBooleanField(term52161, term52161.getClass(), "useThreads", false);
        setField(term52161, term52161.getClass(), "outStream", null);
        setField(term52161, term52161.getClass(), "globalRefMap", null);
        setDoubleField(term52161, term52161.getClass(), "progress", 0.0);
        setField(term52161, term52161.getClass(), "lastPassName", null);
        setField(term52161, term52161.getClass(), "sanityCheck", null);
        setField(term52161, term52161.getClass(), "currentTracer", null);
        setField(term52161, term52161.getClass(), "currentPassName", null);
        setIntField(term52161, term52161.getClass(), "syntheticCodeId", 0);
        setField(term52161, term52161.getClass(), "recentChange", null);
        setField(term52161, term52161.getClass(), "codeChangeHandlers", null);
        setField(term52161, term52161.getClass(), "synthesizedExternsInput", null);
        setField(term52161, term52161.getClass(), "stage", null);
        setField(term52160, term52160.getClass(), "compiler", term52161);
        setField(term52160, term52160.getClass(), "filenamePrefix", null);
        setBooleanField(term52160, term52160.getClass(), "reportDependencies", false);
        setField(term52160, term52160.getClass(), "module", null);
        term52162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52162, term52162.getClass(), "type", 37);
        setField(term52162, term52162.getClass(), "next", null);
        setIntField(term52163, term52163.getClass(), "type", 0);
        setField(term52163, term52163.getClass(), "next", null);
        setIntField(term52164, term52164.getClass(), "type", 0);
        setField(term52164, term52164.getClass(), "next", null);
        setField(term52164, term52164.getClass(), "first", null);
        setField(term52164, term52164.getClass(), "last", null);
        setField(term52164, term52164.getClass(), "propListHead", null);
        setIntField(term52164, term52164.getClass(), "sourcePosition", 0);
        setField(term52164, term52164.getClass(), "jsType", null);
        setField(term52164, term52164.getClass(), "parent", null);
        setField(term52163, term52163.getClass(), "first", term52164);
        setField(term52163, term52163.getClass(), "last", null);
        setField(term52163, term52163.getClass(), "propListHead", null);
        setIntField(term52163, term52163.getClass(), "sourcePosition", 0);
        setField(term52163, term52163.getClass(), "jsType", null);
        setField(term52163, term52163.getClass(), "parent", null);
        setField(term52162, term52162.getClass(), "first", term52163);
        setField(term52162, term52162.getClass(), "last", null);
        setField(term52162, term52162.getClass(), "propListHead", null);
        setIntField(term52162, term52162.getClass(), "sourcePosition", 0);
        setField(term52162, term52162.getClass(), "jsType", null);
        setField(term52162, term52162.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term51081;
        callMethod(klass, "process", argTypes, term50931, args);
        assertTrue(recursiveEquals(term50931, term52160));
        assertTrue(recursiveEquals(term51081, null));
    }

};


