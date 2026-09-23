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

public class CheckAccessControls_process_381406339188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52346;
     Object term52496;
     Object term53119;
     Object term53121;

    public CheckAccessControls_process_381406339188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52346 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term52426 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term52346, term52346.getClass(), "compiler", term52426);
        term52496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term52496, term52496.getClass(), "type", 30);
        setField(term52566, term52566.getClass(), "next", null);
        setIntField(term52566, term52566.getClass(), "type", 0);
        setField(term52566, term52566.getClass(), "first", null);
        setField(term52496, term52496.getClass(), "first", term52566);
        setField(term52496, term52496.getClass(), "jsType", term52672);
        term53119 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term53120 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term53120, term53120.getClass(), "options", null);
        setField(term53120, term53120.getClass(), "passes", null);
        setField(term53120, term53120.getClass(), "externs", null);
        setField(term53120, term53120.getClass(), "modules", null);
        setField(term53120, term53120.getClass(), "moduleGraph", null);
        setField(term53120, term53120.getClass(), "inputs", null);
        setField(term53120, term53120.getClass(), "errorManager", null);
        setField(term53120, term53120.getClass(), "warningsGuard", null);
        setField(term53120, term53120.getClass(), "externsRoot", null);
        setField(term53120, term53120.getClass(), "jsRoot", null);
        setField(term53120, term53120.getClass(), "externAndJsRoot", null);
        setField(term53120, term53120.getClass(), "inputsByName", null);
        setField(term53120, term53120.getClass(), "sourceMap", null);
        setField(term53120, term53120.getClass(), "externExports", null);
        setIntField(term53120, term53120.getClass(), "uniqueNameId", 0);
        setBooleanField(term53120, term53120.getClass(), "useThreads", false);
        setBooleanField(term53120, term53120.getClass(), "hasRegExpGlobalReferences", false);
        setField(term53120, term53120.getClass(), "functionInformationMap", null);
        setField(term53120, term53120.getClass(), "debugLog", null);
        setField(term53120, term53120.getClass(), "defaultCodingConvention", null);
        setField(term53120, term53120.getClass(), "typeRegistry", null);
        setField(term53120, term53120.getClass(), "parserConfig", null);
        setField(term53120, term53120.getClass(), "abstractInterpreter", null);
        setField(term53120, term53120.getClass(), "typeValidator", null);
        setField(term53120, term53120.getClass(), "tracker", null);
        setField(term53120, term53120.getClass(), "oldErrorReporter", null);
        setField(term53120, term53120.getClass(), "defaultErrorReporter", null);
        setField(term53120, term53120.getClass(), "outStream", null);
        setField(term53120, term53120.getClass(), "sanityCheck", null);
        setField(term53120, term53120.getClass(), "currentTracer", null);
        setField(term53120, term53120.getClass(), "currentPassName", null);
        setField(term53120, term53120.getClass(), "recentChange", null);
        setField(term53120, term53120.getClass(), "codeChangeHandlers", null);
        setField(term53120, term53120.getClass(), "stage", null);
        setField(term53119, term53119.getClass(), "compiler", term53120);
        setField(term53119, term53119.getClass(), "validator", null);
        setIntField(term53119, term53119.getClass(), "deprecatedDepth", 0);
        setIntField(term53119, term53119.getClass(), "methodDepth", 0);
        setField(term53119, term53119.getClass(), "currentClass", null);
        setField(term53119, term53119.getClass(), "initializedConstantProperties", null);
        term53121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term53121, term53121.getClass(), "type", 30);
        setField(term53121, term53121.getClass(), "next", null);
        setIntField(term53122, term53122.getClass(), "type", 0);
        setField(term53122, term53122.getClass(), "next", null);
        setField(term53122, term53122.getClass(), "first", null);
        setField(term53122, term53122.getClass(), "last", null);
        setField(term53122, term53122.getClass(), "propListHead", null);
        setIntField(term53122, term53122.getClass(), "sourcePosition", 0);
        setField(term53122, term53122.getClass(), "jsType", null);
        setField(term53122, term53122.getClass(), "parent", null);
        setField(term53121, term53121.getClass(), "first", term53122);
        setField(term53121, term53121.getClass(), "last", null);
        setField(term53121, term53121.getClass(), "propListHead", null);
        setIntField(term53121, term53121.getClass(), "sourcePosition", 0);
        setField(term53123, term53123.getClass(), "primitiveType", null);
        setField(term53123, term53123.getClass(), "primitiveObjectType", null);
        setField(term53123, term53123.getClass(), "name", null);
        setBooleanField(term53123, term53123.getClass(), "visited", false);
        setField(term53123, term53123.getClass(), "docInfo", null);
        setBooleanField(term53123, term53123.getClass(), "unknown", false);
        setBooleanField(term53123, term53123.getClass(), "resolved", false);
        setField(term53123, term53123.getClass(), "resolveResult", null);
        setField(term53123, term53123.getClass(), "registry", null);
        setField(term53121, term53121.getClass(), "jsType", term53123);
        setField(term53121, term53121.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term52496;
        callMethod(klass, "process", argTypes, term52346, args);
        assertTrue(recursiveEquals(term52346, term53119));
        assertTrue(recursiveEquals(term52496, null));
    }

};


