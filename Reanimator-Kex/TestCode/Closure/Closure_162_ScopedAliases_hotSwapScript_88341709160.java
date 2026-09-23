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

public class ScopedAliases_hotSwapScript_88341709160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89503;
     Object term89653;
     Object term90263;
     Object term90265;

    public ScopedAliases_hotSwapScript_88341709160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89503 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term89583 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term89503, term89503.getClass(), "compiler", term89583);
        term89653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89653, term89653.getClass(), "type", 0);
        setField(term89653, term89653.getClass(), "parent", null);
        setField(term89793, term89793.getClass(), "next", null);
        setIntField(term89793, term89793.getClass(), "type", 0);
        setField(term89793, term89793.getClass(), "first", null);
        setField(term89723, term89723.getClass(), "next", term89793);
        setIntField(term89723, term89723.getClass(), "type", 0);
        setField(term89723, term89723.getClass(), "first", null);
        setField(term89653, term89653.getClass(), "first", term89723);
        term90263 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term90264 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term90264, term90264.getClass(), "options", null);
        setField(term90264, term90264.getClass(), "passes", null);
        setField(term90264, term90264.getClass(), "externs", null);
        setField(term90264, term90264.getClass(), "modules", null);
        setField(term90264, term90264.getClass(), "moduleGraph", null);
        setField(term90264, term90264.getClass(), "inputs", null);
        setField(term90264, term90264.getClass(), "errorManager", null);
        setField(term90264, term90264.getClass(), "warningsGuard", null);
        setField(term90264, term90264.getClass(), "externsRoot", null);
        setField(term90264, term90264.getClass(), "jsRoot", null);
        setField(term90264, term90264.getClass(), "externAndJsRoot", null);
        setField(term90264, term90264.getClass(), "inputsById", null);
        setField(term90264, term90264.getClass(), "sourceMap", null);
        setField(term90264, term90264.getClass(), "externExports", null);
        setIntField(term90264, term90264.getClass(), "uniqueNameId", 0);
        setBooleanField(term90264, term90264.getClass(), "useThreads", false);
        setBooleanField(term90264, term90264.getClass(), "hasRegExpGlobalReferences", false);
        setField(term90264, term90264.getClass(), "functionInformationMap", null);
        setField(term90264, term90264.getClass(), "debugLog", null);
        setField(term90264, term90264.getClass(), "defaultCodingConvention", null);
        setField(term90264, term90264.getClass(), "typeRegistry", null);
        setField(term90264, term90264.getClass(), "parserConfig", null);
        setField(term90264, term90264.getClass(), "abstractInterpreter", null);
        setField(term90264, term90264.getClass(), "typeValidator", null);
        setField(term90264, term90264.getClass(), "tracker", null);
        setField(term90264, term90264.getClass(), "oldErrorReporter", null);
        setField(term90264, term90264.getClass(), "defaultErrorReporter", null);
        setField(term90264, term90264.getClass(), "outStream", null);
        setField(term90264, term90264.getClass(), "globalRefMap", null);
        setField(term90264, term90264.getClass(), "sanityCheck", null);
        setField(term90264, term90264.getClass(), "currentTracer", null);
        setField(term90264, term90264.getClass(), "currentPassName", null);
        setIntField(term90264, term90264.getClass(), "syntheticCodeId", 0);
        setField(term90264, term90264.getClass(), "recentChange", null);
        setField(term90264, term90264.getClass(), "codeChangeHandlers", null);
        setField(term90264, term90264.getClass(), "stage", null);
        setField(term90263, term90263.getClass(), "compiler", term90264);
        setField(term90263, term90263.getClass(), "preprocessorSymbolTable", null);
        setField(term90263, term90263.getClass(), "transformationHandler", null);
        term90265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90265, term90265.getClass(), "type", 0);
        setField(term90265, term90265.getClass(), "next", null);
        setIntField(term90266, term90266.getClass(), "type", 0);
        setIntField(term90267, term90267.getClass(), "type", 0);
        setField(term90267, term90267.getClass(), "next", null);
        setField(term90267, term90267.getClass(), "first", null);
        setField(term90267, term90267.getClass(), "last", null);
        setField(term90267, term90267.getClass(), "propListHead", null);
        setIntField(term90267, term90267.getClass(), "sourcePosition", 0);
        setField(term90267, term90267.getClass(), "jsType", null);
        setField(term90267, term90267.getClass(), "parent", null);
        setField(term90266, term90266.getClass(), "next", term90267);
        setField(term90266, term90266.getClass(), "first", null);
        setField(term90266, term90266.getClass(), "last", null);
        setField(term90266, term90266.getClass(), "propListHead", null);
        setIntField(term90266, term90266.getClass(), "sourcePosition", 0);
        setField(term90266, term90266.getClass(), "jsType", null);
        setField(term90266, term90266.getClass(), "parent", null);
        setField(term90265, term90265.getClass(), "first", term90266);
        setField(term90265, term90265.getClass(), "last", null);
        setField(term90265, term90265.getClass(), "propListHead", null);
        setIntField(term90265, term90265.getClass(), "sourcePosition", 0);
        setField(term90265, term90265.getClass(), "jsType", null);
        setField(term90265, term90265.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term89653;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term89503, args);
        assertTrue(recursiveEquals(term89503, term90263));
        assertTrue(recursiveEquals(term89653, term90265));
    }

};


