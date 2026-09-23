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

public class ScopedAliases_hotSwapScript_88341709274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175107;
     Object term175257;
     Object term177547;
     Object term177549;

    public ScopedAliases_hotSwapScript_88341709274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175107 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term175187 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term175107, term175107.getClass(), "compiler", term175187);
        term175257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term175257, term175257.getClass(), "type", 0);
        setField(term175257, term175257.getClass(), "parent", null);
        setField(term175397, term175397.getClass(), "next", term175467);
        setIntField(term175397, term175397.getClass(), "type", 0);
        setField(term175397, term175397.getClass(), "first", null);
        setField(term175327, term175327.getClass(), "next", term175397);
        setIntField(term175327, term175327.getClass(), "type", 0);
        setField(term175677, term175677.getClass(), "next", null);
        setIntField(term175677, term175677.getClass(), "type", 0);
        setField(term175677, term175677.getClass(), "first", null);
        setField(term175607, term175607.getClass(), "next", term175677);
        setIntField(term175607, term175607.getClass(), "type", 105);
        setField(term175537, term175537.getClass(), "next", term175607);
        setIntField(term175537, term175537.getClass(), "type", 105);
        setField(term175327, term175327.getClass(), "first", term175537);
        setField(term175257, term175257.getClass(), "first", term175327);
        term177547 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term177548 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term177548, term177548.getClass(), "options", null);
        setField(term177548, term177548.getClass(), "passes", null);
        setField(term177548, term177548.getClass(), "externs", null);
        setField(term177548, term177548.getClass(), "modules", null);
        setField(term177548, term177548.getClass(), "moduleGraph", null);
        setField(term177548, term177548.getClass(), "inputs", null);
        setField(term177548, term177548.getClass(), "errorManager", null);
        setField(term177548, term177548.getClass(), "warningsGuard", null);
        setField(term177548, term177548.getClass(), "injectedLibraries", null);
        setField(term177548, term177548.getClass(), "externsRoot", null);
        setField(term177548, term177548.getClass(), "jsRoot", null);
        setField(term177548, term177548.getClass(), "externAndJsRoot", null);
        setField(term177548, term177548.getClass(), "inputsById", null);
        setField(term177548, term177548.getClass(), "sourceMap", null);
        setField(term177548, term177548.getClass(), "externExports", null);
        setIntField(term177548, term177548.getClass(), "uniqueNameId", 0);
        setBooleanField(term177548, term177548.getClass(), "useThreads", false);
        setBooleanField(term177548, term177548.getClass(), "hasRegExpGlobalReferences", false);
        setField(term177548, term177548.getClass(), "functionInformationMap", null);
        setField(term177548, term177548.getClass(), "debugLog", null);
        setField(term177548, term177548.getClass(), "defaultCodingConvention", null);
        setField(term177548, term177548.getClass(), "typeRegistry", null);
        setField(term177548, term177548.getClass(), "parserConfig", null);
        setField(term177548, term177548.getClass(), "abstractInterpreter", null);
        setField(term177548, term177548.getClass(), "typeValidator", null);
        setField(term177548, term177548.getClass(), "tracker", null);
        setField(term177548, term177548.getClass(), "oldErrorReporter", null);
        setField(term177548, term177548.getClass(), "defaultErrorReporter", null);
        setField(term177548, term177548.getClass(), "outStream", null);
        setField(term177548, term177548.getClass(), "globalRefMap", null);
        setDoubleField(term177548, term177548.getClass(), "progress", 0.0);
        setField(term177548, term177548.getClass(), "sanityCheck", null);
        setField(term177548, term177548.getClass(), "currentTracer", null);
        setField(term177548, term177548.getClass(), "currentPassName", null);
        setIntField(term177548, term177548.getClass(), "syntheticCodeId", 0);
        setField(term177548, term177548.getClass(), "recentChange", null);
        setField(term177548, term177548.getClass(), "codeChangeHandlers", null);
        setField(term177548, term177548.getClass(), "synthesizedExternsInput", null);
        setField(term177548, term177548.getClass(), "stage", null);
        setField(term177547, term177547.getClass(), "compiler", term177548);
        setField(term177547, term177547.getClass(), "preprocessorSymbolTable", null);
        setField(term177547, term177547.getClass(), "transformationHandler", null);
        term177549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term177549, term177549.getClass(), "type", 0);
        setField(term177549, term177549.getClass(), "next", null);
        setIntField(term177550, term177550.getClass(), "type", 0);
        setIntField(term177551, term177551.getClass(), "type", 0);
        setIntField(term177552, term177552.getClass(), "type", 0);
        setField(term177552, term177552.getClass(), "next", null);
        setField(term177552, term177552.getClass(), "first", null);
        setField(term177552, term177552.getClass(), "last", null);
        setField(term177552, term177552.getClass(), "propListHead", null);
        setIntField(term177552, term177552.getClass(), "sourcePosition", 0);
        setField(term177552, term177552.getClass(), "jsType", null);
        setField(term177552, term177552.getClass(), "parent", null);
        setField(term177551, term177551.getClass(), "next", term177552);
        setField(term177551, term177551.getClass(), "first", null);
        setField(term177551, term177551.getClass(), "last", null);
        setField(term177551, term177551.getClass(), "propListHead", null);
        setIntField(term177551, term177551.getClass(), "sourcePosition", 0);
        setField(term177551, term177551.getClass(), "jsType", null);
        setField(term177551, term177551.getClass(), "parent", null);
        setField(term177550, term177550.getClass(), "next", term177551);
        setIntField(term177553, term177553.getClass(), "type", 105);
        setIntField(term177554, term177554.getClass(), "type", 105);
        setIntField(term177555, term177555.getClass(), "type", 0);
        setField(term177555, term177555.getClass(), "next", null);
        setField(term177555, term177555.getClass(), "first", null);
        setField(term177555, term177555.getClass(), "last", null);
        setField(term177555, term177555.getClass(), "propListHead", null);
        setIntField(term177555, term177555.getClass(), "sourcePosition", 0);
        setField(term177555, term177555.getClass(), "jsType", null);
        setField(term177555, term177555.getClass(), "parent", null);
        setField(term177554, term177554.getClass(), "next", term177555);
        setField(term177554, term177554.getClass(), "first", null);
        setField(term177554, term177554.getClass(), "last", null);
        setField(term177554, term177554.getClass(), "propListHead", null);
        setIntField(term177554, term177554.getClass(), "sourcePosition", 0);
        setField(term177554, term177554.getClass(), "jsType", null);
        setField(term177554, term177554.getClass(), "parent", null);
        setField(term177553, term177553.getClass(), "next", term177554);
        setField(term177553, term177553.getClass(), "first", null);
        setField(term177553, term177553.getClass(), "last", null);
        setField(term177553, term177553.getClass(), "propListHead", null);
        setIntField(term177553, term177553.getClass(), "sourcePosition", 0);
        setField(term177553, term177553.getClass(), "jsType", null);
        setField(term177553, term177553.getClass(), "parent", null);
        setField(term177550, term177550.getClass(), "first", term177553);
        setField(term177550, term177550.getClass(), "last", null);
        setField(term177550, term177550.getClass(), "propListHead", null);
        setIntField(term177550, term177550.getClass(), "sourcePosition", 0);
        setField(term177550, term177550.getClass(), "jsType", null);
        setField(term177550, term177550.getClass(), "parent", null);
        setField(term177549, term177549.getClass(), "first", term177550);
        setField(term177549, term177549.getClass(), "last", null);
        setField(term177549, term177549.getClass(), "propListHead", null);
        setIntField(term177549, term177549.getClass(), "sourcePosition", 0);
        setField(term177549, term177549.getClass(), "jsType", null);
        setField(term177549, term177549.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term175257;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term175107, args);
        assertTrue(recursiveEquals(term175107, term177547));
        assertTrue(recursiveEquals(term175257, term177549));
    }

};


