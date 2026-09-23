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

public class ScopedAliases_hotSwapScript_8834170913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7191;
     Object term7341;
     Object term8232;
     Object term8234;

    public ScopedAliases_hotSwapScript_8834170913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7191 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term7271 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term7191, term7191.getClass(), "compiler", term7271);
        term7341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7341, term7341.getClass(), "type", 0);
        setField(term7341, term7341.getClass(), "parent", null);
        setField(term7481, term7481.getClass(), "next", null);
        setIntField(term7481, term7481.getClass(), "type", 0);
        setField(term7481, term7481.getClass(), "first", null);
        setField(term7411, term7411.getClass(), "next", term7481);
        setIntField(term7411, term7411.getClass(), "type", 0);
        setField(term7551, term7551.getClass(), "next", null);
        setIntField(term7551, term7551.getClass(), "type", 0);
        setField(term7551, term7551.getClass(), "first", null);
        setField(term7411, term7411.getClass(), "first", term7551);
        setField(term7341, term7341.getClass(), "first", term7411);
        term8232 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term8233 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8233, term8233.getClass(), "options", null);
        setField(term8233, term8233.getClass(), "passes", null);
        setField(term8233, term8233.getClass(), "externs", null);
        setField(term8233, term8233.getClass(), "modules", null);
        setField(term8233, term8233.getClass(), "moduleGraph", null);
        setField(term8233, term8233.getClass(), "inputs", null);
        setField(term8233, term8233.getClass(), "errorManager", null);
        setField(term8233, term8233.getClass(), "warningsGuard", null);
        setField(term8233, term8233.getClass(), "injectedLibraries", null);
        setField(term8233, term8233.getClass(), "externsRoot", null);
        setField(term8233, term8233.getClass(), "jsRoot", null);
        setField(term8233, term8233.getClass(), "externAndJsRoot", null);
        setField(term8233, term8233.getClass(), "inputsById", null);
        setField(term8233, term8233.getClass(), "sourceMap", null);
        setField(term8233, term8233.getClass(), "externExports", null);
        setIntField(term8233, term8233.getClass(), "uniqueNameId", 0);
        setBooleanField(term8233, term8233.getClass(), "useThreads", false);
        setBooleanField(term8233, term8233.getClass(), "hasRegExpGlobalReferences", false);
        setField(term8233, term8233.getClass(), "functionInformationMap", null);
        setField(term8233, term8233.getClass(), "debugLog", null);
        setField(term8233, term8233.getClass(), "defaultCodingConvention", null);
        setField(term8233, term8233.getClass(), "typeRegistry", null);
        setField(term8233, term8233.getClass(), "parserConfig", null);
        setField(term8233, term8233.getClass(), "abstractInterpreter", null);
        setField(term8233, term8233.getClass(), "typeValidator", null);
        setField(term8233, term8233.getClass(), "tracker", null);
        setField(term8233, term8233.getClass(), "oldErrorReporter", null);
        setField(term8233, term8233.getClass(), "defaultErrorReporter", null);
        setField(term8233, term8233.getClass(), "outStream", null);
        setField(term8233, term8233.getClass(), "globalRefMap", null);
        setDoubleField(term8233, term8233.getClass(), "progress", 0.0);
        setField(term8233, term8233.getClass(), "sanityCheck", null);
        setField(term8233, term8233.getClass(), "currentTracer", null);
        setField(term8233, term8233.getClass(), "currentPassName", null);
        setIntField(term8233, term8233.getClass(), "syntheticCodeId", 0);
        setField(term8233, term8233.getClass(), "recentChange", null);
        setField(term8233, term8233.getClass(), "codeChangeHandlers", null);
        setField(term8233, term8233.getClass(), "synthesizedExternsInput", null);
        setField(term8233, term8233.getClass(), "stage", null);
        setField(term8232, term8232.getClass(), "compiler", term8233);
        setField(term8232, term8232.getClass(), "preprocessorSymbolTable", null);
        setField(term8232, term8232.getClass(), "transformationHandler", null);
        term8234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8234, term8234.getClass(), "type", 0);
        setField(term8234, term8234.getClass(), "next", null);
        setIntField(term8235, term8235.getClass(), "type", 0);
        setIntField(term8236, term8236.getClass(), "type", 0);
        setField(term8236, term8236.getClass(), "next", null);
        setField(term8236, term8236.getClass(), "first", null);
        setField(term8236, term8236.getClass(), "last", null);
        setField(term8236, term8236.getClass(), "propListHead", null);
        setIntField(term8236, term8236.getClass(), "sourcePosition", 0);
        setField(term8236, term8236.getClass(), "jsType", null);
        setField(term8236, term8236.getClass(), "parent", null);
        setField(term8235, term8235.getClass(), "next", term8236);
        setIntField(term8237, term8237.getClass(), "type", 0);
        setField(term8237, term8237.getClass(), "next", null);
        setField(term8237, term8237.getClass(), "first", null);
        setField(term8237, term8237.getClass(), "last", null);
        setField(term8237, term8237.getClass(), "propListHead", null);
        setIntField(term8237, term8237.getClass(), "sourcePosition", 0);
        setField(term8237, term8237.getClass(), "jsType", null);
        setField(term8237, term8237.getClass(), "parent", null);
        setField(term8235, term8235.getClass(), "first", term8237);
        setField(term8235, term8235.getClass(), "last", null);
        setField(term8235, term8235.getClass(), "propListHead", null);
        setIntField(term8235, term8235.getClass(), "sourcePosition", 0);
        setField(term8235, term8235.getClass(), "jsType", null);
        setField(term8235, term8235.getClass(), "parent", null);
        setField(term8234, term8234.getClass(), "first", term8235);
        setField(term8234, term8234.getClass(), "last", null);
        setField(term8234, term8234.getClass(), "propListHead", null);
        setIntField(term8234, term8234.getClass(), "sourcePosition", 0);
        setField(term8234, term8234.getClass(), "jsType", null);
        setField(term8234, term8234.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term7341;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term7191, args);
        assertTrue(recursiveEquals(term7191, term8232));
        assertTrue(recursiveEquals(term7341, term8234));
    }

};


