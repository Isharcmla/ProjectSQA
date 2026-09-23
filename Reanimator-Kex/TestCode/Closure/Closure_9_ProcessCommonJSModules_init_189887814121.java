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

public class ProcessCommonJSModules_init_189887814121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2480;
     Object term3521;
     Object term3525;

    public ProcessCommonJSModules_init_189887814121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2400 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term2400, term2400.getClass(), "compiler", null);
        term2480 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term3521 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term3522 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3522, term3522.getClass(), "options", null);
        setField(term3522, term3522.getClass(), "passes", null);
        setField(term3522, term3522.getClass(), "externs", null);
        setField(term3522, term3522.getClass(), "modules", null);
        setField(term3522, term3522.getClass(), "moduleGraph", null);
        setField(term3522, term3522.getClass(), "inputs", null);
        setField(term3522, term3522.getClass(), "errorManager", null);
        setField(term3522, term3522.getClass(), "warningsGuard", null);
        setField(term3522, term3522.getClass(), "injectedLibraries", null);
        setField(term3522, term3522.getClass(), "externsRoot", null);
        setField(term3522, term3522.getClass(), "jsRoot", null);
        setField(term3522, term3522.getClass(), "externAndJsRoot", null);
        setField(term3522, term3522.getClass(), "inputsById", null);
        setField(term3522, term3522.getClass(), "sourceMap", null);
        setField(term3522, term3522.getClass(), "externExports", null);
        setIntField(term3522, term3522.getClass(), "uniqueNameId", 0);
        setBooleanField(term3522, term3522.getClass(), "hasRegExpGlobalReferences", false);
        setField(term3522, term3522.getClass(), "functionInformationMap", null);
        setField(term3522, term3522.getClass(), "debugLog", null);
        setField(term3522, term3522.getClass(), "defaultCodingConvention", null);
        setField(term3522, term3522.getClass(), "typeRegistry", null);
        setField(term3522, term3522.getClass(), "parserConfig", null);
        setField(term3522, term3522.getClass(), "abstractInterpreter", null);
        setField(term3522, term3522.getClass(), "typeValidator", null);
        setField(term3522, term3522.getClass(), "tracker", null);
        setField(term3522, term3522.getClass(), "oldErrorReporter", null);
        setField(term3522, term3522.getClass(), "defaultErrorReporter", null);
        setField(term3522, term3522.getClass(), "compilerThread", null);
        setBooleanField(term3522, term3522.getClass(), "useThreads", false);
        setField(term3522, term3522.getClass(), "outStream", null);
        setField(term3522, term3522.getClass(), "globalRefMap", null);
        setDoubleField(term3522, term3522.getClass(), "progress", 0.0);
        setField(term3522, term3522.getClass(), "lastPassName", null);
        setField(term3522, term3522.getClass(), "sanityCheck", null);
        setField(term3522, term3522.getClass(), "currentTracer", null);
        setField(term3522, term3522.getClass(), "currentPassName", null);
        setIntField(term3522, term3522.getClass(), "syntheticCodeId", 0);
        setField(term3522, term3522.getClass(), "recentChange", null);
        setField(term3522, term3522.getClass(), "codeChangeHandlers", null);
        setField(term3522, term3522.getClass(), "synthesizedExternsInput", null);
        setField(term3522, term3522.getClass(), "stage", null);
        setField(term3521, term3521.getClass(), "compiler", term3522);
        setField(term3521, term3521.getClass(), "filenamePrefix", "////////////////////////////////////////////");
        setBooleanField(term3521, term3521.getClass(), "reportDependencies", true);
        setField(term3521, term3521.getClass(), "module", null);
        term3525 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3525, term3525.getClass(), "options", null);
        setField(term3525, term3525.getClass(), "passes", null);
        setField(term3525, term3525.getClass(), "externs", null);
        setField(term3525, term3525.getClass(), "modules", null);
        setField(term3525, term3525.getClass(), "moduleGraph", null);
        setField(term3525, term3525.getClass(), "inputs", null);
        setField(term3525, term3525.getClass(), "errorManager", null);
        setField(term3525, term3525.getClass(), "warningsGuard", null);
        setField(term3525, term3525.getClass(), "injectedLibraries", null);
        setField(term3525, term3525.getClass(), "externsRoot", null);
        setField(term3525, term3525.getClass(), "jsRoot", null);
        setField(term3525, term3525.getClass(), "externAndJsRoot", null);
        setField(term3525, term3525.getClass(), "inputsById", null);
        setField(term3525, term3525.getClass(), "sourceMap", null);
        setField(term3525, term3525.getClass(), "externExports", null);
        setIntField(term3525, term3525.getClass(), "uniqueNameId", 0);
        setBooleanField(term3525, term3525.getClass(), "hasRegExpGlobalReferences", false);
        setField(term3525, term3525.getClass(), "functionInformationMap", null);
        setField(term3525, term3525.getClass(), "debugLog", null);
        setField(term3525, term3525.getClass(), "defaultCodingConvention", null);
        setField(term3525, term3525.getClass(), "typeRegistry", null);
        setField(term3525, term3525.getClass(), "parserConfig", null);
        setField(term3525, term3525.getClass(), "abstractInterpreter", null);
        setField(term3525, term3525.getClass(), "typeValidator", null);
        setField(term3525, term3525.getClass(), "tracker", null);
        setField(term3525, term3525.getClass(), "oldErrorReporter", null);
        setField(term3525, term3525.getClass(), "defaultErrorReporter", null);
        setField(term3525, term3525.getClass(), "compilerThread", null);
        setBooleanField(term3525, term3525.getClass(), "useThreads", false);
        setField(term3525, term3525.getClass(), "outStream", null);
        setField(term3525, term3525.getClass(), "globalRefMap", null);
        setDoubleField(term3525, term3525.getClass(), "progress", 0.0);
        setField(term3525, term3525.getClass(), "lastPassName", null);
        setField(term3525, term3525.getClass(), "sanityCheck", null);
        setField(term3525, term3525.getClass(), "currentTracer", null);
        setField(term3525, term3525.getClass(), "currentPassName", null);
        setIntField(term3525, term3525.getClass(), "syntheticCodeId", 0);
        setField(term3525, term3525.getClass(), "recentChange", null);
        setField(term3525, term3525.getClass(), "codeChangeHandlers", null);
        setField(term3525, term3525.getClass(), "synthesizedExternsInput", null);
        setField(term3525, term3525.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2480;
        args[1] = "////////////////////////////////////////////";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3521));
        assertTrue(recursiveEquals(term2480, term3525));
    }

};


