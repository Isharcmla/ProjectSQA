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

public class ProcessCommonJSModules_init_79077230122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2829;
     Object term3769;
     Object term3773;

    public ProcessCommonJSModules_init_79077230122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2749 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term2749, term2749.getClass(), "compiler", null);
        term2829 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term3769 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term3770 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3770, term3770.getClass(), "options", null);
        setField(term3770, term3770.getClass(), "passes", null);
        setField(term3770, term3770.getClass(), "externs", null);
        setField(term3770, term3770.getClass(), "modules", null);
        setField(term3770, term3770.getClass(), "moduleGraph", null);
        setField(term3770, term3770.getClass(), "inputs", null);
        setField(term3770, term3770.getClass(), "errorManager", null);
        setField(term3770, term3770.getClass(), "warningsGuard", null);
        setField(term3770, term3770.getClass(), "injectedLibraries", null);
        setField(term3770, term3770.getClass(), "externsRoot", null);
        setField(term3770, term3770.getClass(), "jsRoot", null);
        setField(term3770, term3770.getClass(), "externAndJsRoot", null);
        setField(term3770, term3770.getClass(), "inputsById", null);
        setField(term3770, term3770.getClass(), "sourceMap", null);
        setField(term3770, term3770.getClass(), "externExports", null);
        setIntField(term3770, term3770.getClass(), "uniqueNameId", 0);
        setBooleanField(term3770, term3770.getClass(), "hasRegExpGlobalReferences", false);
        setField(term3770, term3770.getClass(), "functionInformationMap", null);
        setField(term3770, term3770.getClass(), "debugLog", null);
        setField(term3770, term3770.getClass(), "defaultCodingConvention", null);
        setField(term3770, term3770.getClass(), "typeRegistry", null);
        setField(term3770, term3770.getClass(), "parserConfig", null);
        setField(term3770, term3770.getClass(), "abstractInterpreter", null);
        setField(term3770, term3770.getClass(), "typeValidator", null);
        setField(term3770, term3770.getClass(), "tracker", null);
        setField(term3770, term3770.getClass(), "oldErrorReporter", null);
        setField(term3770, term3770.getClass(), "defaultErrorReporter", null);
        setField(term3770, term3770.getClass(), "compilerThread", null);
        setBooleanField(term3770, term3770.getClass(), "useThreads", false);
        setField(term3770, term3770.getClass(), "outStream", null);
        setField(term3770, term3770.getClass(), "globalRefMap", null);
        setDoubleField(term3770, term3770.getClass(), "progress", 0.0);
        setField(term3770, term3770.getClass(), "lastPassName", null);
        setField(term3770, term3770.getClass(), "sanityCheck", null);
        setField(term3770, term3770.getClass(), "currentTracer", null);
        setField(term3770, term3770.getClass(), "currentPassName", null);
        setIntField(term3770, term3770.getClass(), "syntheticCodeId", 0);
        setField(term3770, term3770.getClass(), "recentChange", null);
        setField(term3770, term3770.getClass(), "codeChangeHandlers", null);
        setField(term3770, term3770.getClass(), "synthesizedExternsInput", null);
        setField(term3770, term3770.getClass(), "stage", null);
        setField(term3769, term3769.getClass(), "compiler", term3770);
        setField(term3769, term3769.getClass(), "filenamePrefix", "////////////////////////////////////////////");
        setBooleanField(term3769, term3769.getClass(), "reportDependencies", false);
        setField(term3769, term3769.getClass(), "module", null);
        term3773 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3773, term3773.getClass(), "options", null);
        setField(term3773, term3773.getClass(), "passes", null);
        setField(term3773, term3773.getClass(), "externs", null);
        setField(term3773, term3773.getClass(), "modules", null);
        setField(term3773, term3773.getClass(), "moduleGraph", null);
        setField(term3773, term3773.getClass(), "inputs", null);
        setField(term3773, term3773.getClass(), "errorManager", null);
        setField(term3773, term3773.getClass(), "warningsGuard", null);
        setField(term3773, term3773.getClass(), "injectedLibraries", null);
        setField(term3773, term3773.getClass(), "externsRoot", null);
        setField(term3773, term3773.getClass(), "jsRoot", null);
        setField(term3773, term3773.getClass(), "externAndJsRoot", null);
        setField(term3773, term3773.getClass(), "inputsById", null);
        setField(term3773, term3773.getClass(), "sourceMap", null);
        setField(term3773, term3773.getClass(), "externExports", null);
        setIntField(term3773, term3773.getClass(), "uniqueNameId", 0);
        setBooleanField(term3773, term3773.getClass(), "hasRegExpGlobalReferences", false);
        setField(term3773, term3773.getClass(), "functionInformationMap", null);
        setField(term3773, term3773.getClass(), "debugLog", null);
        setField(term3773, term3773.getClass(), "defaultCodingConvention", null);
        setField(term3773, term3773.getClass(), "typeRegistry", null);
        setField(term3773, term3773.getClass(), "parserConfig", null);
        setField(term3773, term3773.getClass(), "abstractInterpreter", null);
        setField(term3773, term3773.getClass(), "typeValidator", null);
        setField(term3773, term3773.getClass(), "tracker", null);
        setField(term3773, term3773.getClass(), "oldErrorReporter", null);
        setField(term3773, term3773.getClass(), "defaultErrorReporter", null);
        setField(term3773, term3773.getClass(), "compilerThread", null);
        setBooleanField(term3773, term3773.getClass(), "useThreads", false);
        setField(term3773, term3773.getClass(), "outStream", null);
        setField(term3773, term3773.getClass(), "globalRefMap", null);
        setDoubleField(term3773, term3773.getClass(), "progress", 0.0);
        setField(term3773, term3773.getClass(), "lastPassName", null);
        setField(term3773, term3773.getClass(), "sanityCheck", null);
        setField(term3773, term3773.getClass(), "currentTracer", null);
        setField(term3773, term3773.getClass(), "currentPassName", null);
        setIntField(term3773, term3773.getClass(), "syntheticCodeId", 0);
        setField(term3773, term3773.getClass(), "recentChange", null);
        setField(term3773, term3773.getClass(), "codeChangeHandlers", null);
        setField(term3773, term3773.getClass(), "synthesizedExternsInput", null);
        setField(term3773, term3773.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term2829;
        args[1] = "////////////////////////////////////////////";
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3769));
        assertTrue(recursiveEquals(term2829, term3773));
    }

};


