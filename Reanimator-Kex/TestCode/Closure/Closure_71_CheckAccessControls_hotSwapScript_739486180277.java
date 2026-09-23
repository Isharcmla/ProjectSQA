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

public class CheckAccessControls_hotSwapScript_739486180277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83170;
     Object term83320;
     Object term84576;
     Object term84578;

    public CheckAccessControls_hotSwapScript_739486180277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83170 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term83250 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term83170, term83170.getClass(), "compiler", term83250);
        term83320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term83320, term83320.getClass(), "type", 30);
        setField(term83390, term83390.getClass(), "next", null);
        setIntField(term83390, term83390.getClass(), "type", 0);
        setField(term83390, term83390.getClass(), "first", null);
        setField(term83320, term83320.getClass(), "first", term83390);
        setField(term83320, term83320.getClass(), "jsType", term83490);
        term84576 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term84577 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term84577, term84577.getClass(), "options", null);
        setField(term84577, term84577.getClass(), "passes", null);
        setField(term84577, term84577.getClass(), "externs", null);
        setField(term84577, term84577.getClass(), "modules", null);
        setField(term84577, term84577.getClass(), "moduleGraph", null);
        setField(term84577, term84577.getClass(), "inputs", null);
        setField(term84577, term84577.getClass(), "errorManager", null);
        setField(term84577, term84577.getClass(), "warningsGuard", null);
        setField(term84577, term84577.getClass(), "externsRoot", null);
        setField(term84577, term84577.getClass(), "jsRoot", null);
        setField(term84577, term84577.getClass(), "externAndJsRoot", null);
        setField(term84577, term84577.getClass(), "inputsByName", null);
        setField(term84577, term84577.getClass(), "sourceMap", null);
        setField(term84577, term84577.getClass(), "externExports", null);
        setIntField(term84577, term84577.getClass(), "uniqueNameId", 0);
        setBooleanField(term84577, term84577.getClass(), "useThreads", false);
        setBooleanField(term84577, term84577.getClass(), "hasRegExpGlobalReferences", false);
        setField(term84577, term84577.getClass(), "functionInformationMap", null);
        setField(term84577, term84577.getClass(), "debugLog", null);
        setField(term84577, term84577.getClass(), "defaultCodingConvention", null);
        setField(term84577, term84577.getClass(), "typeRegistry", null);
        setField(term84577, term84577.getClass(), "parserConfig", null);
        setField(term84577, term84577.getClass(), "abstractInterpreter", null);
        setField(term84577, term84577.getClass(), "typeValidator", null);
        setField(term84577, term84577.getClass(), "tracker", null);
        setField(term84577, term84577.getClass(), "oldErrorReporter", null);
        setField(term84577, term84577.getClass(), "defaultErrorReporter", null);
        setField(term84577, term84577.getClass(), "outStream", null);
        setField(term84577, term84577.getClass(), "sanityCheck", null);
        setField(term84577, term84577.getClass(), "currentTracer", null);
        setField(term84577, term84577.getClass(), "currentPassName", null);
        setField(term84577, term84577.getClass(), "recentChange", null);
        setField(term84577, term84577.getClass(), "codeChangeHandlers", null);
        setField(term84577, term84577.getClass(), "stage", null);
        setField(term84576, term84576.getClass(), "compiler", term84577);
        setField(term84576, term84576.getClass(), "validator", null);
        setIntField(term84576, term84576.getClass(), "deprecatedDepth", 0);
        setIntField(term84576, term84576.getClass(), "methodDepth", 0);
        setField(term84576, term84576.getClass(), "currentClass", null);
        setField(term84576, term84576.getClass(), "initializedConstantProperties", null);
        term84578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term84578, term84578.getClass(), "type", 30);
        setField(term84578, term84578.getClass(), "next", null);
        setIntField(term84579, term84579.getClass(), "type", 0);
        setField(term84579, term84579.getClass(), "next", null);
        setField(term84579, term84579.getClass(), "first", null);
        setField(term84579, term84579.getClass(), "last", null);
        setField(term84579, term84579.getClass(), "propListHead", null);
        setIntField(term84579, term84579.getClass(), "sourcePosition", 0);
        setField(term84579, term84579.getClass(), "jsType", null);
        setField(term84579, term84579.getClass(), "parent", null);
        setField(term84578, term84578.getClass(), "first", term84579);
        setField(term84578, term84578.getClass(), "last", null);
        setField(term84578, term84578.getClass(), "propListHead", null);
        setIntField(term84578, term84578.getClass(), "sourcePosition", 0);
        setField(term84580, term84580.getClass(), "call", null);
        setField(term84580, term84580.getClass(), "prototype", null);
        setField(term84580, term84580.getClass(), "kind", null);
        setField(term84580, term84580.getClass(), "typeOfThis", null);
        setField(term84580, term84580.getClass(), "source", null);
        setField(term84580, term84580.getClass(), "implementedInterfaces", null);
        setField(term84580, term84580.getClass(), "subTypes", null);
        setField(term84580, term84580.getClass(), "templateTypeName", null);
        setField(term84580, term84580.getClass(), "className", null);
        setField(term84580, term84580.getClass(), "properties", null);
        setBooleanField(term84580, term84580.getClass(), "nativeType", false);
        setField(term84580, term84580.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term84580, term84580.getClass(), "prettyPrint", false);
        setBooleanField(term84580, term84580.getClass(), "visited", false);
        setField(term84580, term84580.getClass(), "docInfo", null);
        setBooleanField(term84580, term84580.getClass(), "unknown", false);
        setBooleanField(term84580, term84580.getClass(), "resolved", false);
        setField(term84580, term84580.getClass(), "resolveResult", null);
        setField(term84580, term84580.getClass(), "registry", null);
        setField(term84578, term84578.getClass(), "jsType", term84580);
        setField(term84578, term84578.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term83320;
        callMethod(klass, "hotSwapScript", argTypes, term83170, args);
        assertTrue(recursiveEquals(term83170, term84576));
        assertTrue(recursiveEquals(term83320, term84578));
    }

};


