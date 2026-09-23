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

public class CheckAccessControls_hotSwapScript_739486180108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28922;
     Object term29072;
     Object term29369;
     Object term29371;

    public CheckAccessControls_hotSwapScript_739486180108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28922 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term29002 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term28922, term28922.getClass(), "compiler", term29002);
        term29072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29072, term29072.getClass(), "type", 0);
        setField(term29072, term29072.getClass(), "first", null);
        term29369 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term29370 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29370, term29370.getClass(), "options", null);
        setField(term29370, term29370.getClass(), "passes", null);
        setField(term29370, term29370.getClass(), "externs", null);
        setField(term29370, term29370.getClass(), "modules", null);
        setField(term29370, term29370.getClass(), "moduleGraph", null);
        setField(term29370, term29370.getClass(), "inputs", null);
        setField(term29370, term29370.getClass(), "errorManager", null);
        setField(term29370, term29370.getClass(), "warningsGuard", null);
        setField(term29370, term29370.getClass(), "externsRoot", null);
        setField(term29370, term29370.getClass(), "jsRoot", null);
        setField(term29370, term29370.getClass(), "externAndJsRoot", null);
        setField(term29370, term29370.getClass(), "inputsByName", null);
        setField(term29370, term29370.getClass(), "sourceMap", null);
        setField(term29370, term29370.getClass(), "externExports", null);
        setIntField(term29370, term29370.getClass(), "uniqueNameId", 0);
        setBooleanField(term29370, term29370.getClass(), "useThreads", false);
        setBooleanField(term29370, term29370.getClass(), "hasRegExpGlobalReferences", false);
        setField(term29370, term29370.getClass(), "functionInformationMap", null);
        setField(term29370, term29370.getClass(), "debugLog", null);
        setField(term29370, term29370.getClass(), "defaultCodingConvention", null);
        setField(term29370, term29370.getClass(), "typeRegistry", null);
        setField(term29370, term29370.getClass(), "parserConfig", null);
        setField(term29370, term29370.getClass(), "abstractInterpreter", null);
        setField(term29370, term29370.getClass(), "typeValidator", null);
        setField(term29370, term29370.getClass(), "tracker", null);
        setField(term29370, term29370.getClass(), "oldErrorReporter", null);
        setField(term29370, term29370.getClass(), "defaultErrorReporter", null);
        setField(term29370, term29370.getClass(), "outStream", null);
        setField(term29370, term29370.getClass(), "sanityCheck", null);
        setField(term29370, term29370.getClass(), "currentTracer", null);
        setField(term29370, term29370.getClass(), "currentPassName", null);
        setField(term29370, term29370.getClass(), "recentChange", null);
        setField(term29370, term29370.getClass(), "codeChangeHandlers", null);
        setField(term29370, term29370.getClass(), "stage", null);
        setField(term29369, term29369.getClass(), "compiler", term29370);
        setField(term29369, term29369.getClass(), "validator", null);
        setIntField(term29369, term29369.getClass(), "deprecatedDepth", 0);
        setIntField(term29369, term29369.getClass(), "methodDepth", 0);
        setField(term29369, term29369.getClass(), "currentClass", null);
        setField(term29369, term29369.getClass(), "initializedConstantProperties", null);
        term29371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29371, term29371.getClass(), "type", 0);
        setField(term29371, term29371.getClass(), "next", null);
        setField(term29371, term29371.getClass(), "first", null);
        setField(term29371, term29371.getClass(), "last", null);
        setField(term29371, term29371.getClass(), "propListHead", null);
        setIntField(term29371, term29371.getClass(), "sourcePosition", 0);
        setField(term29371, term29371.getClass(), "jsType", null);
        setField(term29371, term29371.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29072;
        callMethod(klass, "hotSwapScript", argTypes, term28922, args);
        assertTrue(recursiveEquals(term28922, term29369));
        assertTrue(recursiveEquals(term29072, term29371));
    }

};


