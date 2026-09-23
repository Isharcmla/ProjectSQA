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

public class ScopedAliases_process_840655313289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185938;
     Object term186088;
     Object term187541;
     Object term187543;

    public ScopedAliases_process_840655313289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185938 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term186018 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term185938, term185938.getClass(), "compiler", term186018);
        term186088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term186088, term186088.getClass(), "type", 37);
        setField(term186088, term186088.getClass(), "parent", null);
        setField(term186298, term186298.getClass(), "next", null);
        setIntField(term186298, term186298.getClass(), "type", 0);
        setField(term186298, term186298.getClass(), "first", null);
        setField(term186228, term186228.getClass(), "next", term186298);
        setIntField(term186228, term186228.getClass(), "type", 0);
        setField(term186228, term186228.getClass(), "first", null);
        setField(term186158, term186158.getClass(), "next", term186228);
        setIntField(term186158, term186158.getClass(), "type", 0);
        setField(term186368, term186368.getClass(), "next", null);
        setIntField(term186368, term186368.getClass(), "type", 0);
        setField(term186368, term186368.getClass(), "first", null);
        setField(term186158, term186158.getClass(), "first", term186368);
        setField(term186088, term186088.getClass(), "first", term186158);
        term187541 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term187542 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term187542, term187542.getClass(), "options", null);
        setField(term187542, term187542.getClass(), "passes", null);
        setField(term187542, term187542.getClass(), "externs", null);
        setField(term187542, term187542.getClass(), "modules", null);
        setField(term187542, term187542.getClass(), "moduleGraph", null);
        setField(term187542, term187542.getClass(), "inputs", null);
        setField(term187542, term187542.getClass(), "errorManager", null);
        setField(term187542, term187542.getClass(), "warningsGuard", null);
        setField(term187542, term187542.getClass(), "injectedLibraries", null);
        setField(term187542, term187542.getClass(), "externsRoot", null);
        setField(term187542, term187542.getClass(), "jsRoot", null);
        setField(term187542, term187542.getClass(), "externAndJsRoot", null);
        setField(term187542, term187542.getClass(), "inputsById", null);
        setField(term187542, term187542.getClass(), "sourceMap", null);
        setField(term187542, term187542.getClass(), "externExports", null);
        setIntField(term187542, term187542.getClass(), "uniqueNameId", 0);
        setBooleanField(term187542, term187542.getClass(), "useThreads", false);
        setBooleanField(term187542, term187542.getClass(), "hasRegExpGlobalReferences", false);
        setField(term187542, term187542.getClass(), "functionInformationMap", null);
        setField(term187542, term187542.getClass(), "debugLog", null);
        setField(term187542, term187542.getClass(), "defaultCodingConvention", null);
        setField(term187542, term187542.getClass(), "typeRegistry", null);
        setField(term187542, term187542.getClass(), "parserConfig", null);
        setField(term187542, term187542.getClass(), "abstractInterpreter", null);
        setField(term187542, term187542.getClass(), "typeValidator", null);
        setField(term187542, term187542.getClass(), "tracker", null);
        setField(term187542, term187542.getClass(), "oldErrorReporter", null);
        setField(term187542, term187542.getClass(), "defaultErrorReporter", null);
        setField(term187542, term187542.getClass(), "outStream", null);
        setField(term187542, term187542.getClass(), "globalRefMap", null);
        setDoubleField(term187542, term187542.getClass(), "progress", 0.0);
        setField(term187542, term187542.getClass(), "sanityCheck", null);
        setField(term187542, term187542.getClass(), "currentTracer", null);
        setField(term187542, term187542.getClass(), "currentPassName", null);
        setIntField(term187542, term187542.getClass(), "syntheticCodeId", 0);
        setField(term187542, term187542.getClass(), "recentChange", null);
        setField(term187542, term187542.getClass(), "codeChangeHandlers", null);
        setField(term187542, term187542.getClass(), "synthesizedExternsInput", null);
        setField(term187542, term187542.getClass(), "stage", null);
        setField(term187541, term187541.getClass(), "compiler", term187542);
        setField(term187541, term187541.getClass(), "preprocessorSymbolTable", null);
        setField(term187541, term187541.getClass(), "transformationHandler", null);
        term187543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term187543, term187543.getClass(), "type", 37);
        setField(term187543, term187543.getClass(), "next", null);
        setIntField(term187544, term187544.getClass(), "type", 0);
        setIntField(term187545, term187545.getClass(), "type", 0);
        setIntField(term187546, term187546.getClass(), "type", 0);
        setField(term187546, term187546.getClass(), "next", null);
        setField(term187546, term187546.getClass(), "first", null);
        setField(term187546, term187546.getClass(), "last", null);
        setField(term187546, term187546.getClass(), "propListHead", null);
        setIntField(term187546, term187546.getClass(), "sourcePosition", 0);
        setField(term187546, term187546.getClass(), "jsType", null);
        setField(term187546, term187546.getClass(), "parent", null);
        setField(term187545, term187545.getClass(), "next", term187546);
        setField(term187545, term187545.getClass(), "first", null);
        setField(term187545, term187545.getClass(), "last", null);
        setField(term187545, term187545.getClass(), "propListHead", null);
        setIntField(term187545, term187545.getClass(), "sourcePosition", 0);
        setField(term187545, term187545.getClass(), "jsType", null);
        setField(term187545, term187545.getClass(), "parent", null);
        setField(term187544, term187544.getClass(), "next", term187545);
        setIntField(term187547, term187547.getClass(), "type", 0);
        setField(term187547, term187547.getClass(), "next", null);
        setField(term187547, term187547.getClass(), "first", null);
        setField(term187547, term187547.getClass(), "last", null);
        setField(term187547, term187547.getClass(), "propListHead", null);
        setIntField(term187547, term187547.getClass(), "sourcePosition", 0);
        setField(term187547, term187547.getClass(), "jsType", null);
        setField(term187547, term187547.getClass(), "parent", null);
        setField(term187544, term187544.getClass(), "first", term187547);
        setField(term187544, term187544.getClass(), "last", null);
        setField(term187544, term187544.getClass(), "propListHead", null);
        setIntField(term187544, term187544.getClass(), "sourcePosition", 0);
        setField(term187544, term187544.getClass(), "jsType", null);
        setField(term187544, term187544.getClass(), "parent", null);
        setField(term187543, term187543.getClass(), "first", term187544);
        setField(term187543, term187543.getClass(), "last", null);
        setField(term187543, term187543.getClass(), "propListHead", null);
        setIntField(term187543, term187543.getClass(), "sourcePosition", 0);
        setField(term187543, term187543.getClass(), "jsType", null);
        setField(term187543, term187543.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term186088;
        callMethod(klass, "process", argTypes, term185938, args);
        assertTrue(recursiveEquals(term185938, term187541));
        assertTrue(recursiveEquals(term186088, null));
    }

};


