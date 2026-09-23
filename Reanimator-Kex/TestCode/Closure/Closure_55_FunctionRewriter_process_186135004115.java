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
import java.util.HashMap;

public class FunctionRewriter_process_186135004115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52944;
     Object term53094;
     Object term54313;
     Object term54315;
     Object term54316;

    public FunctionRewriter_process_186135004115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52944 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionRewriter"));
        Object term53024 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term52944, term52944.getClass(), "compiler", term53024);
        term53094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53094, term53094.getClass(), "type", 0);
        setField(term53094, term53094.getClass(), "parent", null);
        term54313 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionRewriter"));
        Object term54314 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term54314, term54314.getClass(), "options", null);
        setField(term54314, term54314.getClass(), "passes", null);
        setField(term54314, term54314.getClass(), "externs", null);
        setField(term54314, term54314.getClass(), "modules", null);
        setField(term54314, term54314.getClass(), "moduleGraph", null);
        setField(term54314, term54314.getClass(), "inputs", null);
        setField(term54314, term54314.getClass(), "errorManager", null);
        setField(term54314, term54314.getClass(), "warningsGuard", null);
        setField(term54314, term54314.getClass(), "externsRoot", null);
        setField(term54314, term54314.getClass(), "jsRoot", null);
        setField(term54314, term54314.getClass(), "externAndJsRoot", null);
        setField(term54314, term54314.getClass(), "inputsById", null);
        setField(term54314, term54314.getClass(), "sourceMap", null);
        setField(term54314, term54314.getClass(), "externExports", null);
        setIntField(term54314, term54314.getClass(), "uniqueNameId", 0);
        setBooleanField(term54314, term54314.getClass(), "useThreads", false);
        setBooleanField(term54314, term54314.getClass(), "hasRegExpGlobalReferences", false);
        setField(term54314, term54314.getClass(), "functionInformationMap", null);
        setField(term54314, term54314.getClass(), "debugLog", null);
        setField(term54314, term54314.getClass(), "defaultCodingConvention", null);
        setField(term54314, term54314.getClass(), "typeRegistry", null);
        setField(term54314, term54314.getClass(), "parserConfig", null);
        setField(term54314, term54314.getClass(), "abstractInterpreter", null);
        setField(term54314, term54314.getClass(), "typeValidator", null);
        setField(term54314, term54314.getClass(), "tracker", null);
        setField(term54314, term54314.getClass(), "oldErrorReporter", null);
        setField(term54314, term54314.getClass(), "defaultErrorReporter", null);
        setField(term54314, term54314.getClass(), "outStream", null);
        setField(term54314, term54314.getClass(), "globalRefMap", null);
        setField(term54314, term54314.getClass(), "sanityCheck", null);
        setField(term54314, term54314.getClass(), "currentTracer", null);
        setField(term54314, term54314.getClass(), "currentPassName", null);
        setIntField(term54314, term54314.getClass(), "syntheticCodeId", 0);
        setField(term54314, term54314.getClass(), "recentChange", null);
        setField(term54314, term54314.getClass(), "codeChangeHandlers", null);
        setField(term54314, term54314.getClass(), "stage", null);
        setField(term54313, term54313.getClass(), "compiler", term54314);
        term54315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54315, term54315.getClass(), "type", 0);
        setField(term54315, term54315.getClass(), "next", null);
        setField(term54315, term54315.getClass(), "first", null);
        setField(term54315, term54315.getClass(), "last", null);
        setField(term54315, term54315.getClass(), "propListHead", null);
        setIntField(term54315, term54315.getClass(), "sourcePosition", 0);
        setField(term54315, term54315.getClass(), "jsType", null);
        setField(term54315, term54315.getClass(), "parent", null);
        HashMap term54317 = new HashMap();
        term54316 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term54316, term54316.getClass(), "expectedValuesPerKey", 8);
        setField(term54316, term54316.getClass(), "map", term54317);
        setIntField(term54316, term54316.getClass(), "totalSize", 0);
        setField(term54316, term54316.getClass(), "keySet", null);
        setField(term54316, term54316.getClass(), "multiset", null);
        setField(term54316, term54316.getClass(), "valuesCollection", null);
        setField(term54316, term54316.getClass(), "entries", null);
        setField(term54316, term54316.getClass(), "asMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term53094;
        callMethod(klass, "process", argTypes, term52944, args);
        assertTrue(recursiveEquals(term52944, term54313));
        assertTrue(recursiveEquals(term53094, term54316));
    }

};


