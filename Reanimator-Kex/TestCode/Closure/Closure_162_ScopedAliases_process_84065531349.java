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

public class ScopedAliases_process_84065531349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23750;
     Object term23900;
     Object term24322;
     Object term24324;

    public ScopedAliases_process_84065531349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23750 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term23830 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term23750, term23750.getClass(), "compiler", term23830);
        term23900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23900, term23900.getClass(), "type", 0);
        setField(term23900, term23900.getClass(), "parent", null);
        setField(term23970, term23970.getClass(), "next", null);
        setIntField(term23970, term23970.getClass(), "type", 105);
        setField(term23900, term23900.getClass(), "first", term23970);
        term24322 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term24323 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term24323, term24323.getClass(), "options", null);
        setField(term24323, term24323.getClass(), "passes", null);
        setField(term24323, term24323.getClass(), "externs", null);
        setField(term24323, term24323.getClass(), "modules", null);
        setField(term24323, term24323.getClass(), "moduleGraph", null);
        setField(term24323, term24323.getClass(), "inputs", null);
        setField(term24323, term24323.getClass(), "errorManager", null);
        setField(term24323, term24323.getClass(), "warningsGuard", null);
        setField(term24323, term24323.getClass(), "externsRoot", null);
        setField(term24323, term24323.getClass(), "jsRoot", null);
        setField(term24323, term24323.getClass(), "externAndJsRoot", null);
        setField(term24323, term24323.getClass(), "inputsById", null);
        setField(term24323, term24323.getClass(), "sourceMap", null);
        setField(term24323, term24323.getClass(), "externExports", null);
        setIntField(term24323, term24323.getClass(), "uniqueNameId", 0);
        setBooleanField(term24323, term24323.getClass(), "useThreads", false);
        setBooleanField(term24323, term24323.getClass(), "hasRegExpGlobalReferences", false);
        setField(term24323, term24323.getClass(), "functionInformationMap", null);
        setField(term24323, term24323.getClass(), "debugLog", null);
        setField(term24323, term24323.getClass(), "defaultCodingConvention", null);
        setField(term24323, term24323.getClass(), "typeRegistry", null);
        setField(term24323, term24323.getClass(), "parserConfig", null);
        setField(term24323, term24323.getClass(), "abstractInterpreter", null);
        setField(term24323, term24323.getClass(), "typeValidator", null);
        setField(term24323, term24323.getClass(), "tracker", null);
        setField(term24323, term24323.getClass(), "oldErrorReporter", null);
        setField(term24323, term24323.getClass(), "defaultErrorReporter", null);
        setField(term24323, term24323.getClass(), "outStream", null);
        setField(term24323, term24323.getClass(), "globalRefMap", null);
        setField(term24323, term24323.getClass(), "sanityCheck", null);
        setField(term24323, term24323.getClass(), "currentTracer", null);
        setField(term24323, term24323.getClass(), "currentPassName", null);
        setIntField(term24323, term24323.getClass(), "syntheticCodeId", 0);
        setField(term24323, term24323.getClass(), "recentChange", null);
        setField(term24323, term24323.getClass(), "codeChangeHandlers", null);
        setField(term24323, term24323.getClass(), "stage", null);
        setField(term24322, term24322.getClass(), "compiler", term24323);
        setField(term24322, term24322.getClass(), "preprocessorSymbolTable", null);
        setField(term24322, term24322.getClass(), "transformationHandler", null);
        term24324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24324, term24324.getClass(), "type", 0);
        setField(term24324, term24324.getClass(), "next", null);
        setIntField(term24325, term24325.getClass(), "type", 105);
        setField(term24325, term24325.getClass(), "next", null);
        setField(term24325, term24325.getClass(), "first", null);
        setField(term24325, term24325.getClass(), "last", null);
        setField(term24325, term24325.getClass(), "propListHead", null);
        setIntField(term24325, term24325.getClass(), "sourcePosition", 0);
        setField(term24325, term24325.getClass(), "jsType", null);
        setField(term24325, term24325.getClass(), "parent", null);
        setField(term24324, term24324.getClass(), "first", term24325);
        setField(term24324, term24324.getClass(), "last", null);
        setField(term24324, term24324.getClass(), "propListHead", null);
        setIntField(term24324, term24324.getClass(), "sourcePosition", 0);
        setField(term24324, term24324.getClass(), "jsType", null);
        setField(term24324, term24324.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23900;
        callMethod(klass, "process", argTypes, term23750, args);
        assertTrue(recursiveEquals(term23750, term24322));
        assertTrue(recursiveEquals(term23900, null));
    }

};


