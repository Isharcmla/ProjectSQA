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

public class ScopedAliases_process_84065531315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7313;
     Object term7463;
     Object term8856;
     Object term8858;

    public ScopedAliases_process_84065531315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7313 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term7393 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term7313, term7313.getClass(), "compiler", term7393);
        term7463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7463, term7463.getClass(), "type", 0);
        setField(term7463, term7463.getClass(), "parent", null);
        setField(term7603, term7603.getClass(), "next", null);
        setIntField(term7603, term7603.getClass(), "type", 0);
        setField(term7603, term7603.getClass(), "first", null);
        setField(term7533, term7533.getClass(), "next", term7603);
        setIntField(term7533, term7533.getClass(), "type", 0);
        setField(term7673, term7673.getClass(), "next", null);
        setIntField(term7673, term7673.getClass(), "type", 0);
        setField(term7673, term7673.getClass(), "first", null);
        setField(term7533, term7533.getClass(), "first", term7673);
        setField(term7463, term7463.getClass(), "first", term7533);
        term8856 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term8857 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8857, term8857.getClass(), "options", null);
        setField(term8857, term8857.getClass(), "passes", null);
        setField(term8857, term8857.getClass(), "externs", null);
        setField(term8857, term8857.getClass(), "modules", null);
        setField(term8857, term8857.getClass(), "moduleGraph", null);
        setField(term8857, term8857.getClass(), "inputs", null);
        setField(term8857, term8857.getClass(), "errorManager", null);
        setField(term8857, term8857.getClass(), "warningsGuard", null);
        setField(term8857, term8857.getClass(), "injectedLibraries", null);
        setField(term8857, term8857.getClass(), "externsRoot", null);
        setField(term8857, term8857.getClass(), "jsRoot", null);
        setField(term8857, term8857.getClass(), "externAndJsRoot", null);
        setField(term8857, term8857.getClass(), "inputsById", null);
        setField(term8857, term8857.getClass(), "sourceMap", null);
        setField(term8857, term8857.getClass(), "externExports", null);
        setIntField(term8857, term8857.getClass(), "uniqueNameId", 0);
        setBooleanField(term8857, term8857.getClass(), "useThreads", false);
        setBooleanField(term8857, term8857.getClass(), "hasRegExpGlobalReferences", false);
        setField(term8857, term8857.getClass(), "functionInformationMap", null);
        setField(term8857, term8857.getClass(), "debugLog", null);
        setField(term8857, term8857.getClass(), "defaultCodingConvention", null);
        setField(term8857, term8857.getClass(), "typeRegistry", null);
        setField(term8857, term8857.getClass(), "parserConfig", null);
        setField(term8857, term8857.getClass(), "abstractInterpreter", null);
        setField(term8857, term8857.getClass(), "typeValidator", null);
        setField(term8857, term8857.getClass(), "tracker", null);
        setField(term8857, term8857.getClass(), "oldErrorReporter", null);
        setField(term8857, term8857.getClass(), "defaultErrorReporter", null);
        setField(term8857, term8857.getClass(), "outStream", null);
        setField(term8857, term8857.getClass(), "globalRefMap", null);
        setDoubleField(term8857, term8857.getClass(), "progress", 0.0);
        setField(term8857, term8857.getClass(), "sanityCheck", null);
        setField(term8857, term8857.getClass(), "currentTracer", null);
        setField(term8857, term8857.getClass(), "currentPassName", null);
        setIntField(term8857, term8857.getClass(), "syntheticCodeId", 0);
        setField(term8857, term8857.getClass(), "recentChange", null);
        setField(term8857, term8857.getClass(), "codeChangeHandlers", null);
        setField(term8857, term8857.getClass(), "synthesizedExternsInput", null);
        setField(term8857, term8857.getClass(), "stage", null);
        setField(term8856, term8856.getClass(), "compiler", term8857);
        setField(term8856, term8856.getClass(), "preprocessorSymbolTable", null);
        setField(term8856, term8856.getClass(), "transformationHandler", null);
        term8858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8858, term8858.getClass(), "type", 0);
        setField(term8858, term8858.getClass(), "next", null);
        setIntField(term8859, term8859.getClass(), "type", 0);
        setIntField(term8860, term8860.getClass(), "type", 0);
        setField(term8860, term8860.getClass(), "next", null);
        setField(term8860, term8860.getClass(), "first", null);
        setField(term8860, term8860.getClass(), "last", null);
        setField(term8860, term8860.getClass(), "propListHead", null);
        setIntField(term8860, term8860.getClass(), "sourcePosition", 0);
        setField(term8860, term8860.getClass(), "jsType", null);
        setField(term8860, term8860.getClass(), "parent", null);
        setField(term8859, term8859.getClass(), "next", term8860);
        setIntField(term8861, term8861.getClass(), "type", 0);
        setField(term8861, term8861.getClass(), "next", null);
        setField(term8861, term8861.getClass(), "first", null);
        setField(term8861, term8861.getClass(), "last", null);
        setField(term8861, term8861.getClass(), "propListHead", null);
        setIntField(term8861, term8861.getClass(), "sourcePosition", 0);
        setField(term8861, term8861.getClass(), "jsType", null);
        setField(term8861, term8861.getClass(), "parent", null);
        setField(term8859, term8859.getClass(), "first", term8861);
        setField(term8859, term8859.getClass(), "last", null);
        setField(term8859, term8859.getClass(), "propListHead", null);
        setIntField(term8859, term8859.getClass(), "sourcePosition", 0);
        setField(term8859, term8859.getClass(), "jsType", null);
        setField(term8859, term8859.getClass(), "parent", null);
        setField(term8858, term8858.getClass(), "first", term8859);
        setField(term8858, term8858.getClass(), "last", null);
        setField(term8858, term8858.getClass(), "propListHead", null);
        setIntField(term8858, term8858.getClass(), "sourcePosition", 0);
        setField(term8858, term8858.getClass(), "jsType", null);
        setField(term8858, term8858.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7463;
        callMethod(klass, "process", argTypes, term7313, args);
        assertTrue(recursiveEquals(term7313, term8856));
        assertTrue(recursiveEquals(term7463, null));
    }

};


