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

public class ScopedAliases_hotSwapScript_88341709115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67615;
     Object term67765;
     Object term69038;
     Object term69040;

    public ScopedAliases_hotSwapScript_88341709115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67615 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term67695 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term67615, term67615.getClass(), "compiler", term67695);
        term67765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67765, term67765.getClass(), "type", 105);
        setField(term67765, term67765.getClass(), "parent", null);
        term69038 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term69039 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term69039, term69039.getClass(), "options", null);
        setField(term69039, term69039.getClass(), "passes", null);
        setField(term69039, term69039.getClass(), "externs", null);
        setField(term69039, term69039.getClass(), "modules", null);
        setField(term69039, term69039.getClass(), "moduleGraph", null);
        setField(term69039, term69039.getClass(), "inputs", null);
        setField(term69039, term69039.getClass(), "errorManager", null);
        setField(term69039, term69039.getClass(), "warningsGuard", null);
        setField(term69039, term69039.getClass(), "injectedLibraries", null);
        setField(term69039, term69039.getClass(), "externsRoot", null);
        setField(term69039, term69039.getClass(), "jsRoot", null);
        setField(term69039, term69039.getClass(), "externAndJsRoot", null);
        setField(term69039, term69039.getClass(), "inputsById", null);
        setField(term69039, term69039.getClass(), "sourceMap", null);
        setField(term69039, term69039.getClass(), "externExports", null);
        setIntField(term69039, term69039.getClass(), "uniqueNameId", 0);
        setBooleanField(term69039, term69039.getClass(), "useThreads", false);
        setBooleanField(term69039, term69039.getClass(), "hasRegExpGlobalReferences", false);
        setField(term69039, term69039.getClass(), "functionInformationMap", null);
        setField(term69039, term69039.getClass(), "debugLog", null);
        setField(term69039, term69039.getClass(), "defaultCodingConvention", null);
        setField(term69039, term69039.getClass(), "typeRegistry", null);
        setField(term69039, term69039.getClass(), "parserConfig", null);
        setField(term69039, term69039.getClass(), "abstractInterpreter", null);
        setField(term69039, term69039.getClass(), "typeValidator", null);
        setField(term69039, term69039.getClass(), "tracker", null);
        setField(term69039, term69039.getClass(), "oldErrorReporter", null);
        setField(term69039, term69039.getClass(), "defaultErrorReporter", null);
        setField(term69039, term69039.getClass(), "outStream", null);
        setField(term69039, term69039.getClass(), "globalRefMap", null);
        setDoubleField(term69039, term69039.getClass(), "progress", 0.0);
        setField(term69039, term69039.getClass(), "sanityCheck", null);
        setField(term69039, term69039.getClass(), "currentTracer", null);
        setField(term69039, term69039.getClass(), "currentPassName", null);
        setIntField(term69039, term69039.getClass(), "syntheticCodeId", 0);
        setField(term69039, term69039.getClass(), "recentChange", null);
        setField(term69039, term69039.getClass(), "codeChangeHandlers", null);
        setField(term69039, term69039.getClass(), "synthesizedExternsInput", null);
        setField(term69039, term69039.getClass(), "stage", null);
        setField(term69038, term69038.getClass(), "compiler", term69039);
        setField(term69038, term69038.getClass(), "preprocessorSymbolTable", null);
        setField(term69038, term69038.getClass(), "transformationHandler", null);
        term69040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69040, term69040.getClass(), "type", 105);
        setField(term69040, term69040.getClass(), "next", null);
        setField(term69040, term69040.getClass(), "first", null);
        setField(term69040, term69040.getClass(), "last", null);
        setField(term69040, term69040.getClass(), "propListHead", null);
        setIntField(term69040, term69040.getClass(), "sourcePosition", 0);
        setField(term69040, term69040.getClass(), "jsType", null);
        setField(term69040, term69040.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term67765;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term67615, args);
        assertTrue(recursiveEquals(term67615, term69038));
        assertTrue(recursiveEquals(term67765, term69040));
    }

};


