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

public class ScopedAliases_hotSwapScript_88341709141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86675;
     Object term86825;
     Object term87142;
     Object term87144;

    public ScopedAliases_hotSwapScript_88341709141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86675 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term86755 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term86675, term86675.getClass(), "compiler", term86755);
        term86825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86825, term86825.getClass(), "type", 105);
        setField(term86825, term86825.getClass(), "parent", null);
        term87142 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term87143 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term87143, term87143.getClass(), "options", null);
        setField(term87143, term87143.getClass(), "passes", null);
        setField(term87143, term87143.getClass(), "externs", null);
        setField(term87143, term87143.getClass(), "modules", null);
        setField(term87143, term87143.getClass(), "moduleGraph", null);
        setField(term87143, term87143.getClass(), "inputs", null);
        setField(term87143, term87143.getClass(), "errorManager", null);
        setField(term87143, term87143.getClass(), "warningsGuard", null);
        setField(term87143, term87143.getClass(), "injectedLibraries", null);
        setField(term87143, term87143.getClass(), "externsRoot", null);
        setField(term87143, term87143.getClass(), "jsRoot", null);
        setField(term87143, term87143.getClass(), "externAndJsRoot", null);
        setField(term87143, term87143.getClass(), "inputsById", null);
        setField(term87143, term87143.getClass(), "sourceMap", null);
        setField(term87143, term87143.getClass(), "externExports", null);
        setIntField(term87143, term87143.getClass(), "uniqueNameId", 0);
        setBooleanField(term87143, term87143.getClass(), "useThreads", false);
        setBooleanField(term87143, term87143.getClass(), "hasRegExpGlobalReferences", false);
        setField(term87143, term87143.getClass(), "functionInformationMap", null);
        setField(term87143, term87143.getClass(), "debugLog", null);
        setField(term87143, term87143.getClass(), "defaultCodingConvention", null);
        setField(term87143, term87143.getClass(), "typeRegistry", null);
        setField(term87143, term87143.getClass(), "parserConfig", null);
        setField(term87143, term87143.getClass(), "abstractInterpreter", null);
        setField(term87143, term87143.getClass(), "typeValidator", null);
        setField(term87143, term87143.getClass(), "tracker", null);
        setField(term87143, term87143.getClass(), "oldErrorReporter", null);
        setField(term87143, term87143.getClass(), "defaultErrorReporter", null);
        setField(term87143, term87143.getClass(), "outStream", null);
        setField(term87143, term87143.getClass(), "globalRefMap", null);
        setDoubleField(term87143, term87143.getClass(), "progress", 0.0);
        setField(term87143, term87143.getClass(), "sanityCheck", null);
        setField(term87143, term87143.getClass(), "currentTracer", null);
        setField(term87143, term87143.getClass(), "currentPassName", null);
        setIntField(term87143, term87143.getClass(), "syntheticCodeId", 0);
        setField(term87143, term87143.getClass(), "recentChange", null);
        setField(term87143, term87143.getClass(), "codeChangeHandlers", null);
        setField(term87143, term87143.getClass(), "synthesizedExternsInput", null);
        setField(term87143, term87143.getClass(), "stage", null);
        setField(term87142, term87142.getClass(), "compiler", term87143);
        setField(term87142, term87142.getClass(), "preprocessorSymbolTable", null);
        setField(term87142, term87142.getClass(), "transformationHandler", null);
        term87144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87144, term87144.getClass(), "type", 105);
        setField(term87144, term87144.getClass(), "next", null);
        setField(term87144, term87144.getClass(), "first", null);
        setField(term87144, term87144.getClass(), "last", null);
        setField(term87144, term87144.getClass(), "propListHead", null);
        setIntField(term87144, term87144.getClass(), "sourcePosition", 0);
        setField(term87144, term87144.getClass(), "jsType", null);
        setField(term87144, term87144.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term86825;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term86675, args);
        assertTrue(recursiveEquals(term86675, term87142));
        assertTrue(recursiveEquals(term86825, term87144));
    }

};


