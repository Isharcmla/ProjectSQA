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

public class CheckAccessControls_process_38140633992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25054;
     Object term25204;
     Object term25804;
     Object term25806;

    public CheckAccessControls_process_38140633992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25054 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term25134 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25054, term25054.getClass(), "compiler", term25134);
        term25204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25204, term25204.getClass(), "type", 30);
        setField(term25274, term25274.getClass(), "next", null);
        setIntField(term25274, term25274.getClass(), "type", 0);
        setField(term25274, term25274.getClass(), "first", null);
        setField(term25204, term25204.getClass(), "first", term25274);
        term25804 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term25805 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25805, term25805.getClass(), "options", null);
        setField(term25805, term25805.getClass(), "passes", null);
        setField(term25805, term25805.getClass(), "externs", null);
        setField(term25805, term25805.getClass(), "modules", null);
        setField(term25805, term25805.getClass(), "moduleGraph", null);
        setField(term25805, term25805.getClass(), "inputs", null);
        setField(term25805, term25805.getClass(), "errorManager", null);
        setField(term25805, term25805.getClass(), "warningsGuard", null);
        setField(term25805, term25805.getClass(), "externsRoot", null);
        setField(term25805, term25805.getClass(), "jsRoot", null);
        setField(term25805, term25805.getClass(), "externAndJsRoot", null);
        setField(term25805, term25805.getClass(), "inputsByName", null);
        setField(term25805, term25805.getClass(), "sourceMap", null);
        setField(term25805, term25805.getClass(), "externExports", null);
        setIntField(term25805, term25805.getClass(), "uniqueNameId", 0);
        setBooleanField(term25805, term25805.getClass(), "useThreads", false);
        setBooleanField(term25805, term25805.getClass(), "hasRegExpGlobalReferences", false);
        setField(term25805, term25805.getClass(), "functionInformationMap", null);
        setField(term25805, term25805.getClass(), "debugLog", null);
        setField(term25805, term25805.getClass(), "defaultCodingConvention", null);
        setField(term25805, term25805.getClass(), "typeRegistry", null);
        setField(term25805, term25805.getClass(), "parserConfig", null);
        setField(term25805, term25805.getClass(), "abstractInterpreter", null);
        setField(term25805, term25805.getClass(), "typeValidator", null);
        setField(term25805, term25805.getClass(), "tracker", null);
        setField(term25805, term25805.getClass(), "oldErrorReporter", null);
        setField(term25805, term25805.getClass(), "defaultErrorReporter", null);
        setField(term25805, term25805.getClass(), "outStream", null);
        setField(term25805, term25805.getClass(), "sanityCheck", null);
        setField(term25805, term25805.getClass(), "currentTracer", null);
        setField(term25805, term25805.getClass(), "currentPassName", null);
        setField(term25805, term25805.getClass(), "recentChange", null);
        setField(term25805, term25805.getClass(), "codeChangeHandlers", null);
        setField(term25805, term25805.getClass(), "stage", null);
        setField(term25804, term25804.getClass(), "compiler", term25805);
        setField(term25804, term25804.getClass(), "validator", null);
        setIntField(term25804, term25804.getClass(), "deprecatedDepth", 0);
        setIntField(term25804, term25804.getClass(), "methodDepth", 0);
        setField(term25804, term25804.getClass(), "currentClass", null);
        setField(term25804, term25804.getClass(), "initializedConstantProperties", null);
        term25806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25806, term25806.getClass(), "type", 30);
        setField(term25806, term25806.getClass(), "next", null);
        setIntField(term25807, term25807.getClass(), "type", 0);
        setField(term25807, term25807.getClass(), "next", null);
        setField(term25807, term25807.getClass(), "first", null);
        setField(term25807, term25807.getClass(), "last", null);
        setField(term25807, term25807.getClass(), "propListHead", null);
        setIntField(term25807, term25807.getClass(), "sourcePosition", 0);
        setField(term25807, term25807.getClass(), "jsType", null);
        setField(term25807, term25807.getClass(), "parent", null);
        setField(term25806, term25806.getClass(), "first", term25807);
        setField(term25806, term25806.getClass(), "last", null);
        setField(term25806, term25806.getClass(), "propListHead", null);
        setIntField(term25806, term25806.getClass(), "sourcePosition", 0);
        setField(term25806, term25806.getClass(), "jsType", null);
        setField(term25806, term25806.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25204;
        callMethod(klass, "process", argTypes, term25054, args);
        assertTrue(recursiveEquals(term25054, term25804));
        assertTrue(recursiveEquals(term25204, null));
    }

};


