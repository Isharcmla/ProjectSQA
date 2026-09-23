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

public class ScopedAliases_hotSwapScript_88341709252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158808;
     Object term158980;
     Object term160026;
     Object term160028;

    public ScopedAliases_hotSwapScript_88341709252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158808 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term158888 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term158808, term158808.getClass(), "compiler", term158888);
        term158980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term158980, term158980.getClass(), "type", 105);
        setField(term158980, term158980.getClass(), "parent", null);
        term160026 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term160027 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term160027, term160027.getClass(), "options", null);
        setField(term160027, term160027.getClass(), "passes", null);
        setField(term160027, term160027.getClass(), "externs", null);
        setField(term160027, term160027.getClass(), "modules", null);
        setField(term160027, term160027.getClass(), "moduleGraph", null);
        setField(term160027, term160027.getClass(), "inputs", null);
        setField(term160027, term160027.getClass(), "errorManager", null);
        setField(term160027, term160027.getClass(), "warningsGuard", null);
        setField(term160027, term160027.getClass(), "injectedLibraries", null);
        setField(term160027, term160027.getClass(), "externsRoot", null);
        setField(term160027, term160027.getClass(), "jsRoot", null);
        setField(term160027, term160027.getClass(), "externAndJsRoot", null);
        setField(term160027, term160027.getClass(), "inputsById", null);
        setField(term160027, term160027.getClass(), "sourceMap", null);
        setField(term160027, term160027.getClass(), "externExports", null);
        setIntField(term160027, term160027.getClass(), "uniqueNameId", 0);
        setBooleanField(term160027, term160027.getClass(), "useThreads", false);
        setBooleanField(term160027, term160027.getClass(), "hasRegExpGlobalReferences", false);
        setField(term160027, term160027.getClass(), "functionInformationMap", null);
        setField(term160027, term160027.getClass(), "debugLog", null);
        setField(term160027, term160027.getClass(), "defaultCodingConvention", null);
        setField(term160027, term160027.getClass(), "typeRegistry", null);
        setField(term160027, term160027.getClass(), "parserConfig", null);
        setField(term160027, term160027.getClass(), "abstractInterpreter", null);
        setField(term160027, term160027.getClass(), "typeValidator", null);
        setField(term160027, term160027.getClass(), "tracker", null);
        setField(term160027, term160027.getClass(), "oldErrorReporter", null);
        setField(term160027, term160027.getClass(), "defaultErrorReporter", null);
        setField(term160027, term160027.getClass(), "outStream", null);
        setField(term160027, term160027.getClass(), "globalRefMap", null);
        setDoubleField(term160027, term160027.getClass(), "progress", 0.0);
        setField(term160027, term160027.getClass(), "sanityCheck", null);
        setField(term160027, term160027.getClass(), "currentTracer", null);
        setField(term160027, term160027.getClass(), "currentPassName", null);
        setIntField(term160027, term160027.getClass(), "syntheticCodeId", 0);
        setField(term160027, term160027.getClass(), "recentChange", null);
        setField(term160027, term160027.getClass(), "codeChangeHandlers", null);
        setField(term160027, term160027.getClass(), "synthesizedExternsInput", null);
        setField(term160027, term160027.getClass(), "stage", null);
        setField(term160026, term160026.getClass(), "compiler", term160027);
        setField(term160026, term160026.getClass(), "preprocessorSymbolTable", null);
        setField(term160026, term160026.getClass(), "transformationHandler", null);
        term160028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term160028, term160028.getClass(), "number", 0.0);
        setIntField(term160028, term160028.getClass(), "type", 105);
        setField(term160028, term160028.getClass(), "next", null);
        setField(term160028, term160028.getClass(), "first", null);
        setField(term160028, term160028.getClass(), "last", null);
        setField(term160028, term160028.getClass(), "propListHead", null);
        setIntField(term160028, term160028.getClass(), "sourcePosition", 0);
        setField(term160028, term160028.getClass(), "jsType", null);
        setField(term160028, term160028.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term158980;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term158808, args);
        assertTrue(recursiveEquals(term158808, term160026));
        assertTrue(recursiveEquals(term158980, term160028));
    }

};


