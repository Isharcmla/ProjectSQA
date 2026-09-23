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

public class CheckAccessControls_hotSwapScript_739486180369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113101;
     Object term113251;
     Object term191868;
     Object term191870;

    public CheckAccessControls_hotSwapScript_739486180369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113101 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term113181 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term113101, term113101.getClass(), "compiler", term113181);
        term113251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term113251, term113251.getClass(), "type", 0);
        setField(term113391, term113391.getClass(), "next", term113461);
        setIntField(term113391, term113391.getClass(), "type", 30);
        setField(term113391, term113391.getClass(), "first", null);
        setField(term113321, term113321.getClass(), "next", term113391);
        setIntField(term113321, term113321.getClass(), "type", 30);
        setField(term113321, term113321.getClass(), "first", null);
        setField(term113571, term113571.getClass(), "docInfo", null);
        setField(term113571, term113571.getClass(), "implicitPrototypeFallback", null);
        setField(term113321, term113321.getClass(), "jsType", term113571);
        setField(term113251, term113251.getClass(), "first", term113321);
        term191868 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term191869 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term191869, term191869.getClass(), "options", null);
        setField(term191869, term191869.getClass(), "passes", null);
        setField(term191869, term191869.getClass(), "externs", null);
        setField(term191869, term191869.getClass(), "modules", null);
        setField(term191869, term191869.getClass(), "moduleGraph", null);
        setField(term191869, term191869.getClass(), "inputs", null);
        setField(term191869, term191869.getClass(), "errorManager", null);
        setField(term191869, term191869.getClass(), "warningsGuard", null);
        setField(term191869, term191869.getClass(), "externsRoot", null);
        setField(term191869, term191869.getClass(), "jsRoot", null);
        setField(term191869, term191869.getClass(), "externAndJsRoot", null);
        setField(term191869, term191869.getClass(), "inputsByName", null);
        setField(term191869, term191869.getClass(), "sourceMap", null);
        setField(term191869, term191869.getClass(), "externExports", null);
        setIntField(term191869, term191869.getClass(), "uniqueNameId", 0);
        setBooleanField(term191869, term191869.getClass(), "useThreads", false);
        setBooleanField(term191869, term191869.getClass(), "hasRegExpGlobalReferences", false);
        setField(term191869, term191869.getClass(), "functionInformationMap", null);
        setField(term191869, term191869.getClass(), "debugLog", null);
        setField(term191869, term191869.getClass(), "defaultCodingConvention", null);
        setField(term191869, term191869.getClass(), "typeRegistry", null);
        setField(term191869, term191869.getClass(), "parserConfig", null);
        setField(term191869, term191869.getClass(), "abstractInterpreter", null);
        setField(term191869, term191869.getClass(), "typeValidator", null);
        setField(term191869, term191869.getClass(), "tracker", null);
        setField(term191869, term191869.getClass(), "oldErrorReporter", null);
        setField(term191869, term191869.getClass(), "defaultErrorReporter", null);
        setField(term191869, term191869.getClass(), "outStream", null);
        setField(term191869, term191869.getClass(), "sanityCheck", null);
        setField(term191869, term191869.getClass(), "currentTracer", null);
        setField(term191869, term191869.getClass(), "currentPassName", null);
        setField(term191869, term191869.getClass(), "recentChange", null);
        setField(term191869, term191869.getClass(), "codeChangeHandlers", null);
        setField(term191869, term191869.getClass(), "stage", null);
        setField(term191868, term191868.getClass(), "compiler", term191869);
        setField(term191868, term191868.getClass(), "validator", null);
        setIntField(term191868, term191868.getClass(), "deprecatedDepth", 0);
        setIntField(term191868, term191868.getClass(), "methodDepth", 0);
        setField(term191868, term191868.getClass(), "currentClass", null);
        setField(term191868, term191868.getClass(), "initializedConstantProperties", null);
        term191870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term191870, term191870.getClass(), "type", 0);
        setField(term191870, term191870.getClass(), "next", null);
        setIntField(term191871, term191871.getClass(), "type", 30);
        setIntField(term191872, term191872.getClass(), "type", 30);
        setIntField(term191873, term191873.getClass(), "type", 0);
        setField(term191873, term191873.getClass(), "next", null);
        setField(term191873, term191873.getClass(), "first", null);
        setField(term191873, term191873.getClass(), "last", null);
        setField(term191873, term191873.getClass(), "propListHead", null);
        setIntField(term191873, term191873.getClass(), "sourcePosition", 0);
        setField(term191873, term191873.getClass(), "jsType", null);
        setField(term191873, term191873.getClass(), "parent", null);
        setField(term191872, term191872.getClass(), "next", term191873);
        setField(term191872, term191872.getClass(), "first", null);
        setField(term191872, term191872.getClass(), "last", null);
        setField(term191872, term191872.getClass(), "propListHead", null);
        setIntField(term191872, term191872.getClass(), "sourcePosition", 0);
        setField(term191872, term191872.getClass(), "jsType", null);
        setField(term191872, term191872.getClass(), "parent", null);
        setField(term191871, term191871.getClass(), "next", term191872);
        setField(term191871, term191871.getClass(), "first", null);
        setField(term191871, term191871.getClass(), "last", null);
        setField(term191871, term191871.getClass(), "propListHead", null);
        setIntField(term191871, term191871.getClass(), "sourcePosition", 0);
        setField(term191874, term191874.getClass(), "call", null);
        setField(term191874, term191874.getClass(), "prototype", null);
        setField(term191874, term191874.getClass(), "kind", null);
        setField(term191874, term191874.getClass(), "typeOfThis", null);
        setField(term191874, term191874.getClass(), "source", null);
        setField(term191874, term191874.getClass(), "implementedInterfaces", null);
        setField(term191874, term191874.getClass(), "subTypes", null);
        setField(term191874, term191874.getClass(), "templateTypeName", null);
        setField(term191874, term191874.getClass(), "className", null);
        setField(term191874, term191874.getClass(), "properties", null);
        setBooleanField(term191874, term191874.getClass(), "nativeType", false);
        setField(term191874, term191874.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term191874, term191874.getClass(), "prettyPrint", false);
        setBooleanField(term191874, term191874.getClass(), "visited", false);
        setField(term191874, term191874.getClass(), "docInfo", null);
        setBooleanField(term191874, term191874.getClass(), "unknown", false);
        setBooleanField(term191874, term191874.getClass(), "resolved", false);
        setField(term191874, term191874.getClass(), "resolveResult", null);
        setField(term191874, term191874.getClass(), "registry", null);
        setField(term191871, term191871.getClass(), "jsType", term191874);
        setField(term191871, term191871.getClass(), "parent", null);
        setField(term191870, term191870.getClass(), "first", term191871);
        setField(term191870, term191870.getClass(), "last", null);
        setField(term191870, term191870.getClass(), "propListHead", null);
        setIntField(term191870, term191870.getClass(), "sourcePosition", 0);
        setField(term191870, term191870.getClass(), "jsType", null);
        setField(term191870, term191870.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term113251;
        callMethod(klass, "hotSwapScript", argTypes, term113101, args);
        assertTrue(recursiveEquals(term113101, term191868));
        assertTrue(recursiveEquals(term113251, term191870));
    }

};


