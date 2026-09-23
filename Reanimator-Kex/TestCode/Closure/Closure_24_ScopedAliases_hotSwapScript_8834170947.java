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

public class ScopedAliases_hotSwapScript_8834170947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55579;
     Object term55729;
     Object term56003;
     Object term56005;

    public ScopedAliases_hotSwapScript_8834170947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55579 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term55659 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term55579, term55579.getClass(), "compiler", term55659);
        term55729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55729, term55729.getClass(), "type", 105);
        setField(term55729, term55729.getClass(), "parent", null);
        term56003 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term56004 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term56004, term56004.getClass(), "options", null);
        setField(term56004, term56004.getClass(), "passes", null);
        setField(term56004, term56004.getClass(), "externs", null);
        setField(term56004, term56004.getClass(), "modules", null);
        setField(term56004, term56004.getClass(), "moduleGraph", null);
        setField(term56004, term56004.getClass(), "inputs", null);
        setField(term56004, term56004.getClass(), "errorManager", null);
        setField(term56004, term56004.getClass(), "warningsGuard", null);
        setField(term56004, term56004.getClass(), "injectedLibraries", null);
        setField(term56004, term56004.getClass(), "externsRoot", null);
        setField(term56004, term56004.getClass(), "jsRoot", null);
        setField(term56004, term56004.getClass(), "externAndJsRoot", null);
        setField(term56004, term56004.getClass(), "inputsById", null);
        setField(term56004, term56004.getClass(), "sourceMap", null);
        setField(term56004, term56004.getClass(), "externExports", null);
        setIntField(term56004, term56004.getClass(), "uniqueNameId", 0);
        setBooleanField(term56004, term56004.getClass(), "useThreads", false);
        setBooleanField(term56004, term56004.getClass(), "hasRegExpGlobalReferences", false);
        setField(term56004, term56004.getClass(), "functionInformationMap", null);
        setField(term56004, term56004.getClass(), "debugLog", null);
        setField(term56004, term56004.getClass(), "defaultCodingConvention", null);
        setField(term56004, term56004.getClass(), "typeRegistry", null);
        setField(term56004, term56004.getClass(), "parserConfig", null);
        setField(term56004, term56004.getClass(), "abstractInterpreter", null);
        setField(term56004, term56004.getClass(), "typeValidator", null);
        setField(term56004, term56004.getClass(), "tracker", null);
        setField(term56004, term56004.getClass(), "oldErrorReporter", null);
        setField(term56004, term56004.getClass(), "defaultErrorReporter", null);
        setField(term56004, term56004.getClass(), "outStream", null);
        setField(term56004, term56004.getClass(), "globalRefMap", null);
        setDoubleField(term56004, term56004.getClass(), "progress", 0.0);
        setField(term56004, term56004.getClass(), "sanityCheck", null);
        setField(term56004, term56004.getClass(), "currentTracer", null);
        setField(term56004, term56004.getClass(), "currentPassName", null);
        setIntField(term56004, term56004.getClass(), "syntheticCodeId", 0);
        setField(term56004, term56004.getClass(), "recentChange", null);
        setField(term56004, term56004.getClass(), "codeChangeHandlers", null);
        setField(term56004, term56004.getClass(), "synthesizedExternsInput", null);
        setField(term56004, term56004.getClass(), "stage", null);
        setField(term56003, term56003.getClass(), "compiler", term56004);
        setField(term56003, term56003.getClass(), "preprocessorSymbolTable", null);
        setField(term56003, term56003.getClass(), "transformationHandler", null);
        term56005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56005, term56005.getClass(), "type", 105);
        setField(term56005, term56005.getClass(), "next", null);
        setField(term56005, term56005.getClass(), "first", null);
        setField(term56005, term56005.getClass(), "last", null);
        setField(term56005, term56005.getClass(), "propListHead", null);
        setIntField(term56005, term56005.getClass(), "sourcePosition", 0);
        setField(term56005, term56005.getClass(), "jsType", null);
        setField(term56005, term56005.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term55729;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term55579, args);
        assertTrue(recursiveEquals(term55579, term56003));
        assertTrue(recursiveEquals(term55729, term56005));
    }

};


