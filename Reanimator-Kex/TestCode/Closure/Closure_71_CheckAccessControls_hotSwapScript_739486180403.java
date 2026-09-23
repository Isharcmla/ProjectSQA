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

public class CheckAccessControls_hotSwapScript_739486180403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202883;
     Object term203033;
     Object term204285;
     Object term204287;

    public CheckAccessControls_hotSwapScript_739486180403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202883 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term202963 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term202883, term202883.getClass(), "compiler", term202963);
        term203033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term203393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term203033, term203033.getClass(), "type", 0);
        setField(term203103, term203103.getClass(), "next", term203173);
        setIntField(term203103, term203103.getClass(), "type", 30);
        setField(term203103, term203103.getClass(), "first", null);
        setField(term203283, term203283.getClass(), "docInfo", null);
        setField(term203283, term203283.getClass(), "implicitPrototypeFallback", term203393);
        setField(term203103, term203103.getClass(), "jsType", term203283);
        setField(term203033, term203033.getClass(), "first", term203103);
        term204285 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term204286 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term204286, term204286.getClass(), "options", null);
        setField(term204286, term204286.getClass(), "passes", null);
        setField(term204286, term204286.getClass(), "externs", null);
        setField(term204286, term204286.getClass(), "modules", null);
        setField(term204286, term204286.getClass(), "moduleGraph", null);
        setField(term204286, term204286.getClass(), "inputs", null);
        setField(term204286, term204286.getClass(), "errorManager", null);
        setField(term204286, term204286.getClass(), "warningsGuard", null);
        setField(term204286, term204286.getClass(), "externsRoot", null);
        setField(term204286, term204286.getClass(), "jsRoot", null);
        setField(term204286, term204286.getClass(), "externAndJsRoot", null);
        setField(term204286, term204286.getClass(), "inputsByName", null);
        setField(term204286, term204286.getClass(), "sourceMap", null);
        setField(term204286, term204286.getClass(), "externExports", null);
        setIntField(term204286, term204286.getClass(), "uniqueNameId", 0);
        setBooleanField(term204286, term204286.getClass(), "useThreads", false);
        setBooleanField(term204286, term204286.getClass(), "hasRegExpGlobalReferences", false);
        setField(term204286, term204286.getClass(), "functionInformationMap", null);
        setField(term204286, term204286.getClass(), "debugLog", null);
        setField(term204286, term204286.getClass(), "defaultCodingConvention", null);
        setField(term204286, term204286.getClass(), "typeRegistry", null);
        setField(term204286, term204286.getClass(), "parserConfig", null);
        setField(term204286, term204286.getClass(), "abstractInterpreter", null);
        setField(term204286, term204286.getClass(), "typeValidator", null);
        setField(term204286, term204286.getClass(), "tracker", null);
        setField(term204286, term204286.getClass(), "oldErrorReporter", null);
        setField(term204286, term204286.getClass(), "defaultErrorReporter", null);
        setField(term204286, term204286.getClass(), "outStream", null);
        setField(term204286, term204286.getClass(), "sanityCheck", null);
        setField(term204286, term204286.getClass(), "currentTracer", null);
        setField(term204286, term204286.getClass(), "currentPassName", null);
        setField(term204286, term204286.getClass(), "recentChange", null);
        setField(term204286, term204286.getClass(), "codeChangeHandlers", null);
        setField(term204286, term204286.getClass(), "stage", null);
        setField(term204285, term204285.getClass(), "compiler", term204286);
        setField(term204285, term204285.getClass(), "validator", null);
        setIntField(term204285, term204285.getClass(), "deprecatedDepth", 0);
        setIntField(term204285, term204285.getClass(), "methodDepth", 0);
        setField(term204285, term204285.getClass(), "currentClass", null);
        setField(term204285, term204285.getClass(), "initializedConstantProperties", null);
        term204287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term204291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term204287, term204287.getClass(), "type", 0);
        setField(term204287, term204287.getClass(), "next", null);
        setIntField(term204288, term204288.getClass(), "type", 30);
        setIntField(term204289, term204289.getClass(), "type", 0);
        setField(term204289, term204289.getClass(), "next", null);
        setField(term204289, term204289.getClass(), "first", null);
        setField(term204289, term204289.getClass(), "last", null);
        setField(term204289, term204289.getClass(), "propListHead", null);
        setIntField(term204289, term204289.getClass(), "sourcePosition", 0);
        setField(term204289, term204289.getClass(), "jsType", null);
        setField(term204289, term204289.getClass(), "parent", null);
        setField(term204288, term204288.getClass(), "next", term204289);
        setField(term204288, term204288.getClass(), "first", null);
        setField(term204288, term204288.getClass(), "last", null);
        setField(term204288, term204288.getClass(), "propListHead", null);
        setIntField(term204288, term204288.getClass(), "sourcePosition", 0);
        setField(term204290, term204290.getClass(), "call", null);
        setField(term204290, term204290.getClass(), "prototype", null);
        setField(term204290, term204290.getClass(), "kind", null);
        setField(term204290, term204290.getClass(), "typeOfThis", null);
        setField(term204290, term204290.getClass(), "source", null);
        setField(term204290, term204290.getClass(), "implementedInterfaces", null);
        setField(term204290, term204290.getClass(), "subTypes", null);
        setField(term204290, term204290.getClass(), "templateTypeName", null);
        setField(term204290, term204290.getClass(), "className", null);
        setField(term204290, term204290.getClass(), "properties", null);
        setBooleanField(term204290, term204290.getClass(), "nativeType", false);
        setField(term204291, term204291.getClass(), "call", null);
        setField(term204291, term204291.getClass(), "prototype", null);
        setField(term204291, term204291.getClass(), "kind", null);
        setField(term204291, term204291.getClass(), "typeOfThis", null);
        setField(term204291, term204291.getClass(), "source", null);
        setField(term204291, term204291.getClass(), "implementedInterfaces", null);
        setField(term204291, term204291.getClass(), "subTypes", null);
        setField(term204291, term204291.getClass(), "templateTypeName", null);
        setField(term204291, term204291.getClass(), "className", null);
        setField(term204291, term204291.getClass(), "properties", null);
        setBooleanField(term204291, term204291.getClass(), "nativeType", false);
        setField(term204291, term204291.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term204291, term204291.getClass(), "prettyPrint", false);
        setBooleanField(term204291, term204291.getClass(), "visited", false);
        setField(term204291, term204291.getClass(), "docInfo", null);
        setBooleanField(term204291, term204291.getClass(), "unknown", false);
        setBooleanField(term204291, term204291.getClass(), "resolved", false);
        setField(term204291, term204291.getClass(), "resolveResult", null);
        setField(term204291, term204291.getClass(), "registry", null);
        setField(term204290, term204290.getClass(), "implicitPrototypeFallback", term204291);
        setBooleanField(term204290, term204290.getClass(), "prettyPrint", false);
        setBooleanField(term204290, term204290.getClass(), "visited", false);
        setField(term204290, term204290.getClass(), "docInfo", null);
        setBooleanField(term204290, term204290.getClass(), "unknown", false);
        setBooleanField(term204290, term204290.getClass(), "resolved", false);
        setField(term204290, term204290.getClass(), "resolveResult", null);
        setField(term204290, term204290.getClass(), "registry", null);
        setField(term204288, term204288.getClass(), "jsType", term204290);
        setField(term204288, term204288.getClass(), "parent", null);
        setField(term204287, term204287.getClass(), "first", term204288);
        setField(term204287, term204287.getClass(), "last", null);
        setField(term204287, term204287.getClass(), "propListHead", null);
        setIntField(term204287, term204287.getClass(), "sourcePosition", 0);
        setField(term204287, term204287.getClass(), "jsType", null);
        setField(term204287, term204287.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term203033;
        callMethod(klass, "hotSwapScript", argTypes, term202883, args);
        assertTrue(recursiveEquals(term202883, term204285));
        assertTrue(recursiveEquals(term203033, term204287));
    }

};


