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

public class CheckAccessControls_hotSwapScript_73948618065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14694;
     Object term14844;
     Object term15594;
     Object term15596;

    public CheckAccessControls_hotSwapScript_73948618065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14694 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term14774 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14694, term14694.getClass(), "compiler", term14774);
        term14844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14844, term14844.getClass(), "type", 30);
        setField(term14914, term14914.getClass(), "next", null);
        setIntField(term14914, term14914.getClass(), "type", 0);
        setField(term14914, term14914.getClass(), "first", null);
        setField(term14844, term14844.getClass(), "first", term14914);
        term15594 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term15595 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15595, term15595.getClass(), "options", null);
        setField(term15595, term15595.getClass(), "passes", null);
        setField(term15595, term15595.getClass(), "externs", null);
        setField(term15595, term15595.getClass(), "modules", null);
        setField(term15595, term15595.getClass(), "moduleGraph", null);
        setField(term15595, term15595.getClass(), "inputs", null);
        setField(term15595, term15595.getClass(), "errorManager", null);
        setField(term15595, term15595.getClass(), "warningsGuard", null);
        setField(term15595, term15595.getClass(), "externsRoot", null);
        setField(term15595, term15595.getClass(), "jsRoot", null);
        setField(term15595, term15595.getClass(), "externAndJsRoot", null);
        setField(term15595, term15595.getClass(), "inputsByName", null);
        setField(term15595, term15595.getClass(), "sourceMap", null);
        setField(term15595, term15595.getClass(), "externExports", null);
        setIntField(term15595, term15595.getClass(), "uniqueNameId", 0);
        setBooleanField(term15595, term15595.getClass(), "useThreads", false);
        setBooleanField(term15595, term15595.getClass(), "hasRegExpGlobalReferences", false);
        setField(term15595, term15595.getClass(), "functionInformationMap", null);
        setField(term15595, term15595.getClass(), "debugLog", null);
        setField(term15595, term15595.getClass(), "defaultCodingConvention", null);
        setField(term15595, term15595.getClass(), "typeRegistry", null);
        setField(term15595, term15595.getClass(), "parserConfig", null);
        setField(term15595, term15595.getClass(), "abstractInterpreter", null);
        setField(term15595, term15595.getClass(), "typeValidator", null);
        setField(term15595, term15595.getClass(), "tracker", null);
        setField(term15595, term15595.getClass(), "oldErrorReporter", null);
        setField(term15595, term15595.getClass(), "defaultErrorReporter", null);
        setField(term15595, term15595.getClass(), "outStream", null);
        setField(term15595, term15595.getClass(), "sanityCheck", null);
        setField(term15595, term15595.getClass(), "currentTracer", null);
        setField(term15595, term15595.getClass(), "currentPassName", null);
        setField(term15595, term15595.getClass(), "recentChange", null);
        setField(term15595, term15595.getClass(), "codeChangeHandlers", null);
        setField(term15595, term15595.getClass(), "stage", null);
        setField(term15594, term15594.getClass(), "compiler", term15595);
        setField(term15594, term15594.getClass(), "validator", null);
        setIntField(term15594, term15594.getClass(), "deprecatedDepth", 0);
        setIntField(term15594, term15594.getClass(), "methodDepth", 0);
        setField(term15594, term15594.getClass(), "currentClass", null);
        setField(term15594, term15594.getClass(), "initializedConstantProperties", null);
        term15596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15596, term15596.getClass(), "type", 30);
        setField(term15596, term15596.getClass(), "next", null);
        setIntField(term15597, term15597.getClass(), "type", 0);
        setField(term15597, term15597.getClass(), "next", null);
        setField(term15597, term15597.getClass(), "first", null);
        setField(term15597, term15597.getClass(), "last", null);
        setField(term15597, term15597.getClass(), "propListHead", null);
        setIntField(term15597, term15597.getClass(), "sourcePosition", 0);
        setField(term15597, term15597.getClass(), "jsType", null);
        setField(term15597, term15597.getClass(), "parent", null);
        setField(term15596, term15596.getClass(), "first", term15597);
        setField(term15596, term15596.getClass(), "last", null);
        setField(term15596, term15596.getClass(), "propListHead", null);
        setIntField(term15596, term15596.getClass(), "sourcePosition", 0);
        setField(term15596, term15596.getClass(), "jsType", null);
        setField(term15596, term15596.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14844;
        callMethod(klass, "hotSwapScript", argTypes, term14694, args);
        assertTrue(recursiveEquals(term14694, term15594));
        assertTrue(recursiveEquals(term14844, term15596));
    }

};


