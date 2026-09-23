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

public class ScopedAliases_hotSwapScript_88341709147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89185;
     Object term89335;
     Object term90661;
     Object term90663;

    public ScopedAliases_hotSwapScript_88341709147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89185 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term89265 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term89185, term89185.getClass(), "compiler", term89265);
        term89335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89335, term89335.getClass(), "type", 0);
        setField(term89335, term89335.getClass(), "parent", null);
        setField(term89405, term89405.getClass(), "next", null);
        setIntField(term89405, term89405.getClass(), "type", 0);
        setField(term89545, term89545.getClass(), "next", null);
        setIntField(term89545, term89545.getClass(), "type", 0);
        setField(term89545, term89545.getClass(), "first", null);
        setField(term89475, term89475.getClass(), "next", term89545);
        setIntField(term89475, term89475.getClass(), "type", 105);
        setField(term89405, term89405.getClass(), "first", term89475);
        setField(term89335, term89335.getClass(), "first", term89405);
        term90661 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term90662 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term90662, term90662.getClass(), "options", null);
        setField(term90662, term90662.getClass(), "passes", null);
        setField(term90662, term90662.getClass(), "externs", null);
        setField(term90662, term90662.getClass(), "modules", null);
        setField(term90662, term90662.getClass(), "moduleGraph", null);
        setField(term90662, term90662.getClass(), "inputs", null);
        setField(term90662, term90662.getClass(), "errorManager", null);
        setField(term90662, term90662.getClass(), "warningsGuard", null);
        setField(term90662, term90662.getClass(), "injectedLibraries", null);
        setField(term90662, term90662.getClass(), "externsRoot", null);
        setField(term90662, term90662.getClass(), "jsRoot", null);
        setField(term90662, term90662.getClass(), "externAndJsRoot", null);
        setField(term90662, term90662.getClass(), "inputsById", null);
        setField(term90662, term90662.getClass(), "sourceMap", null);
        setField(term90662, term90662.getClass(), "externExports", null);
        setIntField(term90662, term90662.getClass(), "uniqueNameId", 0);
        setBooleanField(term90662, term90662.getClass(), "useThreads", false);
        setBooleanField(term90662, term90662.getClass(), "hasRegExpGlobalReferences", false);
        setField(term90662, term90662.getClass(), "functionInformationMap", null);
        setField(term90662, term90662.getClass(), "debugLog", null);
        setField(term90662, term90662.getClass(), "defaultCodingConvention", null);
        setField(term90662, term90662.getClass(), "typeRegistry", null);
        setField(term90662, term90662.getClass(), "parserConfig", null);
        setField(term90662, term90662.getClass(), "abstractInterpreter", null);
        setField(term90662, term90662.getClass(), "typeValidator", null);
        setField(term90662, term90662.getClass(), "tracker", null);
        setField(term90662, term90662.getClass(), "oldErrorReporter", null);
        setField(term90662, term90662.getClass(), "defaultErrorReporter", null);
        setField(term90662, term90662.getClass(), "outStream", null);
        setField(term90662, term90662.getClass(), "globalRefMap", null);
        setDoubleField(term90662, term90662.getClass(), "progress", 0.0);
        setField(term90662, term90662.getClass(), "sanityCheck", null);
        setField(term90662, term90662.getClass(), "currentTracer", null);
        setField(term90662, term90662.getClass(), "currentPassName", null);
        setIntField(term90662, term90662.getClass(), "syntheticCodeId", 0);
        setField(term90662, term90662.getClass(), "recentChange", null);
        setField(term90662, term90662.getClass(), "codeChangeHandlers", null);
        setField(term90662, term90662.getClass(), "synthesizedExternsInput", null);
        setField(term90662, term90662.getClass(), "stage", null);
        setField(term90661, term90661.getClass(), "compiler", term90662);
        setField(term90661, term90661.getClass(), "preprocessorSymbolTable", null);
        setField(term90661, term90661.getClass(), "transformationHandler", null);
        term90663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90663, term90663.getClass(), "type", 0);
        setField(term90663, term90663.getClass(), "next", null);
        setIntField(term90664, term90664.getClass(), "type", 0);
        setField(term90664, term90664.getClass(), "next", null);
        setIntField(term90665, term90665.getClass(), "type", 105);
        setIntField(term90666, term90666.getClass(), "type", 0);
        setField(term90666, term90666.getClass(), "next", null);
        setField(term90666, term90666.getClass(), "first", null);
        setField(term90666, term90666.getClass(), "last", null);
        setField(term90666, term90666.getClass(), "propListHead", null);
        setIntField(term90666, term90666.getClass(), "sourcePosition", 0);
        setField(term90666, term90666.getClass(), "jsType", null);
        setField(term90666, term90666.getClass(), "parent", null);
        setField(term90665, term90665.getClass(), "next", term90666);
        setField(term90665, term90665.getClass(), "first", null);
        setField(term90665, term90665.getClass(), "last", null);
        setField(term90665, term90665.getClass(), "propListHead", null);
        setIntField(term90665, term90665.getClass(), "sourcePosition", 0);
        setField(term90665, term90665.getClass(), "jsType", null);
        setField(term90665, term90665.getClass(), "parent", null);
        setField(term90664, term90664.getClass(), "first", term90665);
        setField(term90664, term90664.getClass(), "last", null);
        setField(term90664, term90664.getClass(), "propListHead", null);
        setIntField(term90664, term90664.getClass(), "sourcePosition", 0);
        setField(term90664, term90664.getClass(), "jsType", null);
        setField(term90664, term90664.getClass(), "parent", null);
        setField(term90663, term90663.getClass(), "first", term90664);
        setField(term90663, term90663.getClass(), "last", null);
        setField(term90663, term90663.getClass(), "propListHead", null);
        setIntField(term90663, term90663.getClass(), "sourcePosition", 0);
        setField(term90663, term90663.getClass(), "jsType", null);
        setField(term90663, term90663.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term89335;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term89185, args);
        assertTrue(recursiveEquals(term89185, term90661));
        assertTrue(recursiveEquals(term89335, term90663));
    }

};


