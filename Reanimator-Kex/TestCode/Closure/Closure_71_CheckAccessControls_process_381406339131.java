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

public class CheckAccessControls_process_381406339131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35067;
     Object term35217;
     Object term36478;
     Object term36480;

    public CheckAccessControls_process_381406339131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35067 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term35147 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term35067, term35067.getClass(), "compiler", term35147);
        term35217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setIntField(term35217, term35217.getClass(), "type", 30);
        setField(term35287, term35287.getClass(), "next", null);
        setIntField(term35287, term35287.getClass(), "type", 0);
        setField(term35287, term35287.getClass(), "first", null);
        setField(term35217, term35217.getClass(), "first", term35287);
        setField(term35217, term35217.getClass(), "jsType", term35381);
        term36478 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term36479 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term36479, term36479.getClass(), "options", null);
        setField(term36479, term36479.getClass(), "passes", null);
        setField(term36479, term36479.getClass(), "externs", null);
        setField(term36479, term36479.getClass(), "modules", null);
        setField(term36479, term36479.getClass(), "moduleGraph", null);
        setField(term36479, term36479.getClass(), "inputs", null);
        setField(term36479, term36479.getClass(), "errorManager", null);
        setField(term36479, term36479.getClass(), "warningsGuard", null);
        setField(term36479, term36479.getClass(), "externsRoot", null);
        setField(term36479, term36479.getClass(), "jsRoot", null);
        setField(term36479, term36479.getClass(), "externAndJsRoot", null);
        setField(term36479, term36479.getClass(), "inputsByName", null);
        setField(term36479, term36479.getClass(), "sourceMap", null);
        setField(term36479, term36479.getClass(), "externExports", null);
        setIntField(term36479, term36479.getClass(), "uniqueNameId", 0);
        setBooleanField(term36479, term36479.getClass(), "useThreads", false);
        setBooleanField(term36479, term36479.getClass(), "hasRegExpGlobalReferences", false);
        setField(term36479, term36479.getClass(), "functionInformationMap", null);
        setField(term36479, term36479.getClass(), "debugLog", null);
        setField(term36479, term36479.getClass(), "defaultCodingConvention", null);
        setField(term36479, term36479.getClass(), "typeRegistry", null);
        setField(term36479, term36479.getClass(), "parserConfig", null);
        setField(term36479, term36479.getClass(), "abstractInterpreter", null);
        setField(term36479, term36479.getClass(), "typeValidator", null);
        setField(term36479, term36479.getClass(), "tracker", null);
        setField(term36479, term36479.getClass(), "oldErrorReporter", null);
        setField(term36479, term36479.getClass(), "defaultErrorReporter", null);
        setField(term36479, term36479.getClass(), "outStream", null);
        setField(term36479, term36479.getClass(), "sanityCheck", null);
        setField(term36479, term36479.getClass(), "currentTracer", null);
        setField(term36479, term36479.getClass(), "currentPassName", null);
        setField(term36479, term36479.getClass(), "recentChange", null);
        setField(term36479, term36479.getClass(), "codeChangeHandlers", null);
        setField(term36479, term36479.getClass(), "stage", null);
        setField(term36478, term36478.getClass(), "compiler", term36479);
        setField(term36478, term36478.getClass(), "validator", null);
        setIntField(term36478, term36478.getClass(), "deprecatedDepth", 0);
        setIntField(term36478, term36478.getClass(), "methodDepth", 0);
        setField(term36478, term36478.getClass(), "currentClass", null);
        setField(term36478, term36478.getClass(), "initializedConstantProperties", null);
        term36480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setIntField(term36480, term36480.getClass(), "type", 30);
        setField(term36480, term36480.getClass(), "next", null);
        setIntField(term36481, term36481.getClass(), "type", 0);
        setField(term36481, term36481.getClass(), "next", null);
        setField(term36481, term36481.getClass(), "first", null);
        setField(term36481, term36481.getClass(), "last", null);
        setField(term36481, term36481.getClass(), "propListHead", null);
        setIntField(term36481, term36481.getClass(), "sourcePosition", 0);
        setField(term36481, term36481.getClass(), "jsType", null);
        setField(term36481, term36481.getClass(), "parent", null);
        setField(term36480, term36480.getClass(), "first", term36481);
        setField(term36480, term36480.getClass(), "last", null);
        setField(term36480, term36480.getClass(), "propListHead", null);
        setIntField(term36480, term36480.getClass(), "sourcePosition", 0);
        setField(term36482, term36482.getClass(), "alternates", null);
        setIntField(term36482, term36482.getClass(), "hashcode", 0);
        setBooleanField(term36482, term36482.getClass(), "resolved", false);
        setField(term36482, term36482.getClass(), "resolveResult", null);
        setField(term36482, term36482.getClass(), "registry", null);
        setField(term36480, term36480.getClass(), "jsType", term36482);
        setField(term36480, term36480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term35217;
        callMethod(klass, "process", argTypes, term35067, args);
        assertTrue(recursiveEquals(term35067, term36478));
        assertTrue(recursiveEquals(term35217, null));
    }

};


