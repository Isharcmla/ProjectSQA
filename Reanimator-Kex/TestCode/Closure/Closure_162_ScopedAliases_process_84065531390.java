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

public class ScopedAliases_process_84065531390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47266;
     Object term47416;
     Object term48026;
     Object term48028;

    public ScopedAliases_process_84065531390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47266 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term47346 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term47266, term47266.getClass(), "compiler", term47346);
        term47416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47416, term47416.getClass(), "type", 0);
        setField(term47416, term47416.getClass(), "parent", null);
        setField(term47486, term47486.getClass(), "next", term47556);
        setIntField(term47486, term47486.getClass(), "type", 0);
        setField(term47486, term47486.getClass(), "first", null);
        setField(term47416, term47416.getClass(), "first", term47486);
        term48026 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term48027 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term48027, term48027.getClass(), "options", null);
        setField(term48027, term48027.getClass(), "passes", null);
        setField(term48027, term48027.getClass(), "externs", null);
        setField(term48027, term48027.getClass(), "modules", null);
        setField(term48027, term48027.getClass(), "moduleGraph", null);
        setField(term48027, term48027.getClass(), "inputs", null);
        setField(term48027, term48027.getClass(), "errorManager", null);
        setField(term48027, term48027.getClass(), "warningsGuard", null);
        setField(term48027, term48027.getClass(), "externsRoot", null);
        setField(term48027, term48027.getClass(), "jsRoot", null);
        setField(term48027, term48027.getClass(), "externAndJsRoot", null);
        setField(term48027, term48027.getClass(), "inputsById", null);
        setField(term48027, term48027.getClass(), "sourceMap", null);
        setField(term48027, term48027.getClass(), "externExports", null);
        setIntField(term48027, term48027.getClass(), "uniqueNameId", 0);
        setBooleanField(term48027, term48027.getClass(), "useThreads", false);
        setBooleanField(term48027, term48027.getClass(), "hasRegExpGlobalReferences", false);
        setField(term48027, term48027.getClass(), "functionInformationMap", null);
        setField(term48027, term48027.getClass(), "debugLog", null);
        setField(term48027, term48027.getClass(), "defaultCodingConvention", null);
        setField(term48027, term48027.getClass(), "typeRegistry", null);
        setField(term48027, term48027.getClass(), "parserConfig", null);
        setField(term48027, term48027.getClass(), "abstractInterpreter", null);
        setField(term48027, term48027.getClass(), "typeValidator", null);
        setField(term48027, term48027.getClass(), "tracker", null);
        setField(term48027, term48027.getClass(), "oldErrorReporter", null);
        setField(term48027, term48027.getClass(), "defaultErrorReporter", null);
        setField(term48027, term48027.getClass(), "outStream", null);
        setField(term48027, term48027.getClass(), "globalRefMap", null);
        setField(term48027, term48027.getClass(), "sanityCheck", null);
        setField(term48027, term48027.getClass(), "currentTracer", null);
        setField(term48027, term48027.getClass(), "currentPassName", null);
        setIntField(term48027, term48027.getClass(), "syntheticCodeId", 0);
        setField(term48027, term48027.getClass(), "recentChange", null);
        setField(term48027, term48027.getClass(), "codeChangeHandlers", null);
        setField(term48027, term48027.getClass(), "stage", null);
        setField(term48026, term48026.getClass(), "compiler", term48027);
        setField(term48026, term48026.getClass(), "preprocessorSymbolTable", null);
        setField(term48026, term48026.getClass(), "transformationHandler", null);
        term48028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48028, term48028.getClass(), "type", 0);
        setField(term48028, term48028.getClass(), "next", null);
        setIntField(term48029, term48029.getClass(), "type", 0);
        setIntField(term48030, term48030.getClass(), "type", 0);
        setField(term48030, term48030.getClass(), "next", null);
        setField(term48030, term48030.getClass(), "first", null);
        setField(term48030, term48030.getClass(), "last", null);
        setField(term48030, term48030.getClass(), "propListHead", null);
        setIntField(term48030, term48030.getClass(), "sourcePosition", 0);
        setField(term48030, term48030.getClass(), "jsType", null);
        setField(term48030, term48030.getClass(), "parent", null);
        setField(term48029, term48029.getClass(), "next", term48030);
        setField(term48029, term48029.getClass(), "first", null);
        setField(term48029, term48029.getClass(), "last", null);
        setField(term48029, term48029.getClass(), "propListHead", null);
        setIntField(term48029, term48029.getClass(), "sourcePosition", 0);
        setField(term48029, term48029.getClass(), "jsType", null);
        setField(term48029, term48029.getClass(), "parent", null);
        setField(term48028, term48028.getClass(), "first", term48029);
        setField(term48028, term48028.getClass(), "last", null);
        setField(term48028, term48028.getClass(), "propListHead", null);
        setIntField(term48028, term48028.getClass(), "sourcePosition", 0);
        setField(term48028, term48028.getClass(), "jsType", null);
        setField(term48028, term48028.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term47416;
        callMethod(klass, "process", argTypes, term47266, args);
        assertTrue(recursiveEquals(term47266, term48026));
        assertTrue(recursiveEquals(term47416, null));
    }

};


