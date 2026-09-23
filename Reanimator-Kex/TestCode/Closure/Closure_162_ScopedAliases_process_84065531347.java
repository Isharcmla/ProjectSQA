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

public class ScopedAliases_process_84065531347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22604;
     Object term22754;
     Object term23176;
     Object term23178;

    public ScopedAliases_process_84065531347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22604 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term22684 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22604, term22604.getClass(), "compiler", term22684);
        term22754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22754, term22754.getClass(), "type", 0);
        setField(term22754, term22754.getClass(), "parent", null);
        setField(term22824, term22824.getClass(), "next", null);
        setIntField(term22824, term22824.getClass(), "type", 105);
        setField(term22754, term22754.getClass(), "first", term22824);
        term23176 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term23177 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term23177, term23177.getClass(), "options", null);
        setField(term23177, term23177.getClass(), "passes", null);
        setField(term23177, term23177.getClass(), "externs", null);
        setField(term23177, term23177.getClass(), "modules", null);
        setField(term23177, term23177.getClass(), "moduleGraph", null);
        setField(term23177, term23177.getClass(), "inputs", null);
        setField(term23177, term23177.getClass(), "errorManager", null);
        setField(term23177, term23177.getClass(), "warningsGuard", null);
        setField(term23177, term23177.getClass(), "externsRoot", null);
        setField(term23177, term23177.getClass(), "jsRoot", null);
        setField(term23177, term23177.getClass(), "externAndJsRoot", null);
        setField(term23177, term23177.getClass(), "inputsById", null);
        setField(term23177, term23177.getClass(), "sourceMap", null);
        setField(term23177, term23177.getClass(), "externExports", null);
        setIntField(term23177, term23177.getClass(), "uniqueNameId", 0);
        setBooleanField(term23177, term23177.getClass(), "useThreads", false);
        setBooleanField(term23177, term23177.getClass(), "hasRegExpGlobalReferences", false);
        setField(term23177, term23177.getClass(), "functionInformationMap", null);
        setField(term23177, term23177.getClass(), "debugLog", null);
        setField(term23177, term23177.getClass(), "defaultCodingConvention", null);
        setField(term23177, term23177.getClass(), "typeRegistry", null);
        setField(term23177, term23177.getClass(), "parserConfig", null);
        setField(term23177, term23177.getClass(), "abstractInterpreter", null);
        setField(term23177, term23177.getClass(), "typeValidator", null);
        setField(term23177, term23177.getClass(), "tracker", null);
        setField(term23177, term23177.getClass(), "oldErrorReporter", null);
        setField(term23177, term23177.getClass(), "defaultErrorReporter", null);
        setField(term23177, term23177.getClass(), "outStream", null);
        setField(term23177, term23177.getClass(), "globalRefMap", null);
        setField(term23177, term23177.getClass(), "sanityCheck", null);
        setField(term23177, term23177.getClass(), "currentTracer", null);
        setField(term23177, term23177.getClass(), "currentPassName", null);
        setIntField(term23177, term23177.getClass(), "syntheticCodeId", 0);
        setField(term23177, term23177.getClass(), "recentChange", null);
        setField(term23177, term23177.getClass(), "codeChangeHandlers", null);
        setField(term23177, term23177.getClass(), "stage", null);
        setField(term23176, term23176.getClass(), "compiler", term23177);
        setField(term23176, term23176.getClass(), "preprocessorSymbolTable", null);
        setField(term23176, term23176.getClass(), "transformationHandler", null);
        term23178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23178, term23178.getClass(), "type", 0);
        setField(term23178, term23178.getClass(), "next", null);
        setIntField(term23179, term23179.getClass(), "type", 105);
        setField(term23179, term23179.getClass(), "next", null);
        setField(term23179, term23179.getClass(), "first", null);
        setField(term23179, term23179.getClass(), "last", null);
        setField(term23179, term23179.getClass(), "propListHead", null);
        setIntField(term23179, term23179.getClass(), "sourcePosition", 0);
        setField(term23179, term23179.getClass(), "jsType", null);
        setField(term23179, term23179.getClass(), "parent", null);
        setField(term23178, term23178.getClass(), "first", term23179);
        setField(term23178, term23178.getClass(), "last", null);
        setField(term23178, term23178.getClass(), "propListHead", null);
        setIntField(term23178, term23178.getClass(), "sourcePosition", 0);
        setField(term23178, term23178.getClass(), "jsType", null);
        setField(term23178, term23178.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22754;
        callMethod(klass, "process", argTypes, term22604, args);
        assertTrue(recursiveEquals(term22604, term23176));
        assertTrue(recursiveEquals(term22754, null));
    }

};


