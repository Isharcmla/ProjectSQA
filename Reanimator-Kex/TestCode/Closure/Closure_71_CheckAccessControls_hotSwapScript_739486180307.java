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

public class CheckAccessControls_hotSwapScript_739486180307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96592;
     Object term96742;
     Object term98257;
     Object term98259;

    public CheckAccessControls_hotSwapScript_739486180307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96592 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term96672 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term96592, term96592.getClass(), "compiler", term96672);
        term96742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term96742, term96742.getClass(), "type", 0);
        setField(term96812, term96812.getClass(), "next", term96882);
        setIntField(term96812, term96812.getClass(), "type", 30);
        setField(term96812, term96812.getClass(), "first", null);
        setField(term96812, term96812.getClass(), "jsType", term96992);
        setField(term96742, term96742.getClass(), "first", term96812);
        term98257 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term98258 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term98258, term98258.getClass(), "options", null);
        setField(term98258, term98258.getClass(), "passes", null);
        setField(term98258, term98258.getClass(), "externs", null);
        setField(term98258, term98258.getClass(), "modules", null);
        setField(term98258, term98258.getClass(), "moduleGraph", null);
        setField(term98258, term98258.getClass(), "inputs", null);
        setField(term98258, term98258.getClass(), "errorManager", null);
        setField(term98258, term98258.getClass(), "warningsGuard", null);
        setField(term98258, term98258.getClass(), "externsRoot", null);
        setField(term98258, term98258.getClass(), "jsRoot", null);
        setField(term98258, term98258.getClass(), "externAndJsRoot", null);
        setField(term98258, term98258.getClass(), "inputsByName", null);
        setField(term98258, term98258.getClass(), "sourceMap", null);
        setField(term98258, term98258.getClass(), "externExports", null);
        setIntField(term98258, term98258.getClass(), "uniqueNameId", 0);
        setBooleanField(term98258, term98258.getClass(), "useThreads", false);
        setBooleanField(term98258, term98258.getClass(), "hasRegExpGlobalReferences", false);
        setField(term98258, term98258.getClass(), "functionInformationMap", null);
        setField(term98258, term98258.getClass(), "debugLog", null);
        setField(term98258, term98258.getClass(), "defaultCodingConvention", null);
        setField(term98258, term98258.getClass(), "typeRegistry", null);
        setField(term98258, term98258.getClass(), "parserConfig", null);
        setField(term98258, term98258.getClass(), "abstractInterpreter", null);
        setField(term98258, term98258.getClass(), "typeValidator", null);
        setField(term98258, term98258.getClass(), "tracker", null);
        setField(term98258, term98258.getClass(), "oldErrorReporter", null);
        setField(term98258, term98258.getClass(), "defaultErrorReporter", null);
        setField(term98258, term98258.getClass(), "outStream", null);
        setField(term98258, term98258.getClass(), "sanityCheck", null);
        setField(term98258, term98258.getClass(), "currentTracer", null);
        setField(term98258, term98258.getClass(), "currentPassName", null);
        setField(term98258, term98258.getClass(), "recentChange", null);
        setField(term98258, term98258.getClass(), "codeChangeHandlers", null);
        setField(term98258, term98258.getClass(), "stage", null);
        setField(term98257, term98257.getClass(), "compiler", term98258);
        setField(term98257, term98257.getClass(), "validator", null);
        setIntField(term98257, term98257.getClass(), "deprecatedDepth", 0);
        setIntField(term98257, term98257.getClass(), "methodDepth", 0);
        setField(term98257, term98257.getClass(), "currentClass", null);
        setField(term98257, term98257.getClass(), "initializedConstantProperties", null);
        term98259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term98259, term98259.getClass(), "type", 0);
        setField(term98259, term98259.getClass(), "next", null);
        setIntField(term98260, term98260.getClass(), "type", 30);
        setIntField(term98261, term98261.getClass(), "type", 0);
        setField(term98261, term98261.getClass(), "next", null);
        setField(term98261, term98261.getClass(), "first", null);
        setField(term98261, term98261.getClass(), "last", null);
        setField(term98261, term98261.getClass(), "propListHead", null);
        setIntField(term98261, term98261.getClass(), "sourcePosition", 0);
        setField(term98261, term98261.getClass(), "jsType", null);
        setField(term98261, term98261.getClass(), "parent", null);
        setField(term98260, term98260.getClass(), "next", term98261);
        setField(term98260, term98260.getClass(), "first", null);
        setField(term98260, term98260.getClass(), "last", null);
        setField(term98260, term98260.getClass(), "propListHead", null);
        setIntField(term98260, term98260.getClass(), "sourcePosition", 0);
        setField(term98262, term98262.getClass(), "call", null);
        setField(term98262, term98262.getClass(), "prototype", null);
        setField(term98262, term98262.getClass(), "kind", null);
        setField(term98262, term98262.getClass(), "typeOfThis", null);
        setField(term98262, term98262.getClass(), "source", null);
        setField(term98262, term98262.getClass(), "implementedInterfaces", null);
        setField(term98262, term98262.getClass(), "subTypes", null);
        setField(term98262, term98262.getClass(), "templateTypeName", null);
        setField(term98262, term98262.getClass(), "className", null);
        setField(term98262, term98262.getClass(), "properties", null);
        setBooleanField(term98262, term98262.getClass(), "nativeType", false);
        setField(term98262, term98262.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term98262, term98262.getClass(), "prettyPrint", false);
        setBooleanField(term98262, term98262.getClass(), "visited", false);
        setField(term98262, term98262.getClass(), "docInfo", null);
        setBooleanField(term98262, term98262.getClass(), "unknown", false);
        setBooleanField(term98262, term98262.getClass(), "resolved", false);
        setField(term98262, term98262.getClass(), "resolveResult", null);
        setField(term98262, term98262.getClass(), "registry", null);
        setField(term98260, term98260.getClass(), "jsType", term98262);
        setField(term98260, term98260.getClass(), "parent", null);
        setField(term98259, term98259.getClass(), "first", term98260);
        setField(term98259, term98259.getClass(), "last", null);
        setField(term98259, term98259.getClass(), "propListHead", null);
        setIntField(term98259, term98259.getClass(), "sourcePosition", 0);
        setField(term98259, term98259.getClass(), "jsType", null);
        setField(term98259, term98259.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96742;
        callMethod(klass, "hotSwapScript", argTypes, term96592, args);
        assertTrue(recursiveEquals(term96592, term98257));
        assertTrue(recursiveEquals(term96742, term98259));
    }

};


