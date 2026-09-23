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

public class ScopedAliases_hotSwapScript_8834170955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26007;
     Object term26179;
     Object term26751;
     Object term26753;

    public ScopedAliases_hotSwapScript_8834170955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26007 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term26087 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26007, term26007.getClass(), "compiler", term26087);
        term26179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term26179, term26179.getClass(), "type", 0);
        setField(term26179, term26179.getClass(), "parent", null);
        setField(term26179, term26179.getClass(), "first", null);
        term26751 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term26752 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26752, term26752.getClass(), "options", null);
        setField(term26752, term26752.getClass(), "passes", null);
        setField(term26752, term26752.getClass(), "externs", null);
        setField(term26752, term26752.getClass(), "modules", null);
        setField(term26752, term26752.getClass(), "moduleGraph", null);
        setField(term26752, term26752.getClass(), "inputs", null);
        setField(term26752, term26752.getClass(), "errorManager", null);
        setField(term26752, term26752.getClass(), "warningsGuard", null);
        setField(term26752, term26752.getClass(), "externsRoot", null);
        setField(term26752, term26752.getClass(), "jsRoot", null);
        setField(term26752, term26752.getClass(), "externAndJsRoot", null);
        setField(term26752, term26752.getClass(), "inputsById", null);
        setField(term26752, term26752.getClass(), "sourceMap", null);
        setField(term26752, term26752.getClass(), "externExports", null);
        setIntField(term26752, term26752.getClass(), "uniqueNameId", 0);
        setBooleanField(term26752, term26752.getClass(), "useThreads", false);
        setBooleanField(term26752, term26752.getClass(), "hasRegExpGlobalReferences", false);
        setField(term26752, term26752.getClass(), "functionInformationMap", null);
        setField(term26752, term26752.getClass(), "debugLog", null);
        setField(term26752, term26752.getClass(), "defaultCodingConvention", null);
        setField(term26752, term26752.getClass(), "typeRegistry", null);
        setField(term26752, term26752.getClass(), "parserConfig", null);
        setField(term26752, term26752.getClass(), "abstractInterpreter", null);
        setField(term26752, term26752.getClass(), "typeValidator", null);
        setField(term26752, term26752.getClass(), "tracker", null);
        setField(term26752, term26752.getClass(), "oldErrorReporter", null);
        setField(term26752, term26752.getClass(), "defaultErrorReporter", null);
        setField(term26752, term26752.getClass(), "outStream", null);
        setField(term26752, term26752.getClass(), "globalRefMap", null);
        setField(term26752, term26752.getClass(), "sanityCheck", null);
        setField(term26752, term26752.getClass(), "currentTracer", null);
        setField(term26752, term26752.getClass(), "currentPassName", null);
        setIntField(term26752, term26752.getClass(), "syntheticCodeId", 0);
        setField(term26752, term26752.getClass(), "recentChange", null);
        setField(term26752, term26752.getClass(), "codeChangeHandlers", null);
        setField(term26752, term26752.getClass(), "stage", null);
        setField(term26751, term26751.getClass(), "compiler", term26752);
        setField(term26751, term26751.getClass(), "preprocessorSymbolTable", null);
        setField(term26751, term26751.getClass(), "transformationHandler", null);
        term26753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term26753, term26753.getClass(), "number", 0.0);
        setIntField(term26753, term26753.getClass(), "type", 0);
        setField(term26753, term26753.getClass(), "next", null);
        setField(term26753, term26753.getClass(), "first", null);
        setField(term26753, term26753.getClass(), "last", null);
        setField(term26753, term26753.getClass(), "propListHead", null);
        setIntField(term26753, term26753.getClass(), "sourcePosition", 0);
        setField(term26753, term26753.getClass(), "jsType", null);
        setField(term26753, term26753.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term26179;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term26007, args);
        assertTrue(recursiveEquals(term26007, term26751));
        assertTrue(recursiveEquals(term26179, term26753));
    }

};


