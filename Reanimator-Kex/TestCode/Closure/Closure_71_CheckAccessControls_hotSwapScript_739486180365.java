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

public class CheckAccessControls_hotSwapScript_739486180365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111354;
     Object term111504;
     Object term190793;
     Object term190795;

    public CheckAccessControls_hotSwapScript_739486180365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111354 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term111434 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term111354, term111354.getClass(), "compiler", term111434);
        term111504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term111504, term111504.getClass(), "type", 0);
        setField(term111644, term111644.getClass(), "next", term111714);
        setIntField(term111644, term111644.getClass(), "type", 30);
        setField(term111644, term111644.getClass(), "first", null);
        setField(term111574, term111574.getClass(), "next", term111644);
        setIntField(term111574, term111574.getClass(), "type", 30);
        setField(term111574, term111574.getClass(), "first", null);
        setField(term111818, term111818.getClass(), "docInfo", null);
        setField(term111574, term111574.getClass(), "jsType", term111818);
        setField(term111504, term111504.getClass(), "first", term111574);
        term190793 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term190794 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term190794, term190794.getClass(), "options", null);
        setField(term190794, term190794.getClass(), "passes", null);
        setField(term190794, term190794.getClass(), "externs", null);
        setField(term190794, term190794.getClass(), "modules", null);
        setField(term190794, term190794.getClass(), "moduleGraph", null);
        setField(term190794, term190794.getClass(), "inputs", null);
        setField(term190794, term190794.getClass(), "errorManager", null);
        setField(term190794, term190794.getClass(), "warningsGuard", null);
        setField(term190794, term190794.getClass(), "externsRoot", null);
        setField(term190794, term190794.getClass(), "jsRoot", null);
        setField(term190794, term190794.getClass(), "externAndJsRoot", null);
        setField(term190794, term190794.getClass(), "inputsByName", null);
        setField(term190794, term190794.getClass(), "sourceMap", null);
        setField(term190794, term190794.getClass(), "externExports", null);
        setIntField(term190794, term190794.getClass(), "uniqueNameId", 0);
        setBooleanField(term190794, term190794.getClass(), "useThreads", false);
        setBooleanField(term190794, term190794.getClass(), "hasRegExpGlobalReferences", false);
        setField(term190794, term190794.getClass(), "functionInformationMap", null);
        setField(term190794, term190794.getClass(), "debugLog", null);
        setField(term190794, term190794.getClass(), "defaultCodingConvention", null);
        setField(term190794, term190794.getClass(), "typeRegistry", null);
        setField(term190794, term190794.getClass(), "parserConfig", null);
        setField(term190794, term190794.getClass(), "abstractInterpreter", null);
        setField(term190794, term190794.getClass(), "typeValidator", null);
        setField(term190794, term190794.getClass(), "tracker", null);
        setField(term190794, term190794.getClass(), "oldErrorReporter", null);
        setField(term190794, term190794.getClass(), "defaultErrorReporter", null);
        setField(term190794, term190794.getClass(), "outStream", null);
        setField(term190794, term190794.getClass(), "sanityCheck", null);
        setField(term190794, term190794.getClass(), "currentTracer", null);
        setField(term190794, term190794.getClass(), "currentPassName", null);
        setField(term190794, term190794.getClass(), "recentChange", null);
        setField(term190794, term190794.getClass(), "codeChangeHandlers", null);
        setField(term190794, term190794.getClass(), "stage", null);
        setField(term190793, term190793.getClass(), "compiler", term190794);
        setField(term190793, term190793.getClass(), "validator", null);
        setIntField(term190793, term190793.getClass(), "deprecatedDepth", 0);
        setIntField(term190793, term190793.getClass(), "methodDepth", 0);
        setField(term190793, term190793.getClass(), "currentClass", null);
        setField(term190793, term190793.getClass(), "initializedConstantProperties", null);
        term190795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term190795, term190795.getClass(), "type", 0);
        setField(term190795, term190795.getClass(), "next", null);
        setIntField(term190796, term190796.getClass(), "type", 30);
        setIntField(term190797, term190797.getClass(), "type", 30);
        setIntField(term190798, term190798.getClass(), "type", 0);
        setField(term190798, term190798.getClass(), "next", null);
        setField(term190798, term190798.getClass(), "first", null);
        setField(term190798, term190798.getClass(), "last", null);
        setField(term190798, term190798.getClass(), "propListHead", null);
        setIntField(term190798, term190798.getClass(), "sourcePosition", 0);
        setField(term190798, term190798.getClass(), "jsType", null);
        setField(term190798, term190798.getClass(), "parent", null);
        setField(term190797, term190797.getClass(), "next", term190798);
        setField(term190797, term190797.getClass(), "first", null);
        setField(term190797, term190797.getClass(), "last", null);
        setField(term190797, term190797.getClass(), "propListHead", null);
        setIntField(term190797, term190797.getClass(), "sourcePosition", 0);
        setField(term190797, term190797.getClass(), "jsType", null);
        setField(term190797, term190797.getClass(), "parent", null);
        setField(term190796, term190796.getClass(), "next", term190797);
        setField(term190796, term190796.getClass(), "first", null);
        setField(term190796, term190796.getClass(), "last", null);
        setField(term190796, term190796.getClass(), "propListHead", null);
        setIntField(term190796, term190796.getClass(), "sourcePosition", 0);
        setField(term190799, term190799.getClass(), "call", null);
        setField(term190799, term190799.getClass(), "prototype", null);
        setField(term190799, term190799.getClass(), "kind", null);
        setField(term190799, term190799.getClass(), "typeOfThis", null);
        setField(term190799, term190799.getClass(), "source", null);
        setField(term190799, term190799.getClass(), "implementedInterfaces", null);
        setField(term190799, term190799.getClass(), "subTypes", null);
        setField(term190799, term190799.getClass(), "templateTypeName", null);
        setField(term190799, term190799.getClass(), "className", null);
        setField(term190799, term190799.getClass(), "properties", null);
        setBooleanField(term190799, term190799.getClass(), "nativeType", false);
        setField(term190799, term190799.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term190799, term190799.getClass(), "prettyPrint", false);
        setBooleanField(term190799, term190799.getClass(), "visited", false);
        setField(term190799, term190799.getClass(), "docInfo", null);
        setBooleanField(term190799, term190799.getClass(), "unknown", false);
        setBooleanField(term190799, term190799.getClass(), "resolved", false);
        setField(term190799, term190799.getClass(), "resolveResult", null);
        setField(term190799, term190799.getClass(), "registry", null);
        setField(term190796, term190796.getClass(), "jsType", term190799);
        setField(term190796, term190796.getClass(), "parent", null);
        setField(term190795, term190795.getClass(), "first", term190796);
        setField(term190795, term190795.getClass(), "last", null);
        setField(term190795, term190795.getClass(), "propListHead", null);
        setIntField(term190795, term190795.getClass(), "sourcePosition", 0);
        setField(term190795, term190795.getClass(), "jsType", null);
        setField(term190795, term190795.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term111504;
        callMethod(klass, "hotSwapScript", argTypes, term111354, args);
        assertTrue(recursiveEquals(term111354, term190793));
        assertTrue(recursiveEquals(term111504, term190795));
    }

};


