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

public class ProcessCommonJSModules_process_62786604739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21649;
     Object term21799;
     Object term22177;
     Object term22179;

    public ProcessCommonJSModules_process_62786604739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21649 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term21729 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21649, term21649.getClass(), "compiler", term21729);
        term21799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21799, term21799.getClass(), "type", 0);
        setField(term21799, term21799.getClass(), "parent", null);
        setField(term21869, term21869.getClass(), "next", term21939);
        setIntField(term21869, term21869.getClass(), "type", 0);
        setField(term21869, term21869.getClass(), "first", null);
        setField(term21799, term21799.getClass(), "first", term21869);
        term22177 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term22178 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22178, term22178.getClass(), "options", null);
        setField(term22178, term22178.getClass(), "passes", null);
        setField(term22178, term22178.getClass(), "externs", null);
        setField(term22178, term22178.getClass(), "modules", null);
        setField(term22178, term22178.getClass(), "moduleGraph", null);
        setField(term22178, term22178.getClass(), "inputs", null);
        setField(term22178, term22178.getClass(), "errorManager", null);
        setField(term22178, term22178.getClass(), "warningsGuard", null);
        setField(term22178, term22178.getClass(), "injectedLibraries", null);
        setField(term22178, term22178.getClass(), "externsRoot", null);
        setField(term22178, term22178.getClass(), "jsRoot", null);
        setField(term22178, term22178.getClass(), "externAndJsRoot", null);
        setField(term22178, term22178.getClass(), "inputsById", null);
        setField(term22178, term22178.getClass(), "sourceMap", null);
        setField(term22178, term22178.getClass(), "externExports", null);
        setIntField(term22178, term22178.getClass(), "uniqueNameId", 0);
        setBooleanField(term22178, term22178.getClass(), "useThreads", false);
        setBooleanField(term22178, term22178.getClass(), "hasRegExpGlobalReferences", false);
        setField(term22178, term22178.getClass(), "functionInformationMap", null);
        setField(term22178, term22178.getClass(), "debugLog", null);
        setField(term22178, term22178.getClass(), "defaultCodingConvention", null);
        setField(term22178, term22178.getClass(), "typeRegistry", null);
        setField(term22178, term22178.getClass(), "parserConfig", null);
        setField(term22178, term22178.getClass(), "abstractInterpreter", null);
        setField(term22178, term22178.getClass(), "typeValidator", null);
        setField(term22178, term22178.getClass(), "tracker", null);
        setField(term22178, term22178.getClass(), "oldErrorReporter", null);
        setField(term22178, term22178.getClass(), "defaultErrorReporter", null);
        setField(term22178, term22178.getClass(), "outStream", null);
        setField(term22178, term22178.getClass(), "globalRefMap", null);
        setDoubleField(term22178, term22178.getClass(), "progress", 0.0);
        setField(term22178, term22178.getClass(), "sanityCheck", null);
        setField(term22178, term22178.getClass(), "currentTracer", null);
        setField(term22178, term22178.getClass(), "currentPassName", null);
        setIntField(term22178, term22178.getClass(), "syntheticCodeId", 0);
        setField(term22178, term22178.getClass(), "recentChange", null);
        setField(term22178, term22178.getClass(), "codeChangeHandlers", null);
        setField(term22178, term22178.getClass(), "synthesizedExternsInput", null);
        setField(term22178, term22178.getClass(), "stage", null);
        setField(term22177, term22177.getClass(), "compiler", term22178);
        setField(term22177, term22177.getClass(), "filenamePrefix", null);
        setBooleanField(term22177, term22177.getClass(), "reportDependencies", false);
        setField(term22177, term22177.getClass(), "module", null);
        term22179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22179, term22179.getClass(), "type", 0);
        setField(term22179, term22179.getClass(), "next", null);
        setIntField(term22180, term22180.getClass(), "type", 0);
        setIntField(term22181, term22181.getClass(), "type", 0);
        setField(term22181, term22181.getClass(), "next", null);
        setField(term22181, term22181.getClass(), "first", null);
        setField(term22181, term22181.getClass(), "last", null);
        setField(term22181, term22181.getClass(), "propListHead", null);
        setIntField(term22181, term22181.getClass(), "sourcePosition", 0);
        setField(term22181, term22181.getClass(), "jsType", null);
        setField(term22181, term22181.getClass(), "parent", null);
        setField(term22180, term22180.getClass(), "next", term22181);
        setField(term22180, term22180.getClass(), "first", null);
        setField(term22180, term22180.getClass(), "last", null);
        setField(term22180, term22180.getClass(), "propListHead", null);
        setIntField(term22180, term22180.getClass(), "sourcePosition", 0);
        setField(term22180, term22180.getClass(), "jsType", null);
        setField(term22180, term22180.getClass(), "parent", null);
        setField(term22179, term22179.getClass(), "first", term22180);
        setField(term22179, term22179.getClass(), "last", null);
        setField(term22179, term22179.getClass(), "propListHead", null);
        setIntField(term22179, term22179.getClass(), "sourcePosition", 0);
        setField(term22179, term22179.getClass(), "jsType", null);
        setField(term22179, term22179.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21799;
        callMethod(klass, "process", argTypes, term21649, args);
        assertTrue(recursiveEquals(term21649, term22177));
        assertTrue(recursiveEquals(term21799, null));
    }

};


