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

public class ScopedAliases_process_840655313193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108683;
     Object term108833;
     Object term110052;
     Object term110054;

    public ScopedAliases_process_840655313193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108683 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term108763 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term108683, term108683.getClass(), "compiler", term108763);
        term108833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108833, term108833.getClass(), "type", 0);
        setField(term108833, term108833.getClass(), "parent", null);
        setField(term108903, term108903.getClass(), "next", term108973);
        setIntField(term108903, term108903.getClass(), "type", 0);
        setField(term108903, term108903.getClass(), "first", term109043);
        setField(term108833, term108833.getClass(), "first", term108903);
        term110052 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term110053 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term110053, term110053.getClass(), "options", null);
        setField(term110053, term110053.getClass(), "passes", null);
        setField(term110053, term110053.getClass(), "externs", null);
        setField(term110053, term110053.getClass(), "modules", null);
        setField(term110053, term110053.getClass(), "moduleGraph", null);
        setField(term110053, term110053.getClass(), "inputs", null);
        setField(term110053, term110053.getClass(), "errorManager", null);
        setField(term110053, term110053.getClass(), "warningsGuard", null);
        setField(term110053, term110053.getClass(), "externsRoot", null);
        setField(term110053, term110053.getClass(), "jsRoot", null);
        setField(term110053, term110053.getClass(), "externAndJsRoot", null);
        setField(term110053, term110053.getClass(), "inputsById", null);
        setField(term110053, term110053.getClass(), "sourceMap", null);
        setField(term110053, term110053.getClass(), "externExports", null);
        setIntField(term110053, term110053.getClass(), "uniqueNameId", 0);
        setBooleanField(term110053, term110053.getClass(), "useThreads", false);
        setBooleanField(term110053, term110053.getClass(), "hasRegExpGlobalReferences", false);
        setField(term110053, term110053.getClass(), "functionInformationMap", null);
        setField(term110053, term110053.getClass(), "debugLog", null);
        setField(term110053, term110053.getClass(), "defaultCodingConvention", null);
        setField(term110053, term110053.getClass(), "typeRegistry", null);
        setField(term110053, term110053.getClass(), "parserConfig", null);
        setField(term110053, term110053.getClass(), "abstractInterpreter", null);
        setField(term110053, term110053.getClass(), "typeValidator", null);
        setField(term110053, term110053.getClass(), "tracker", null);
        setField(term110053, term110053.getClass(), "oldErrorReporter", null);
        setField(term110053, term110053.getClass(), "defaultErrorReporter", null);
        setField(term110053, term110053.getClass(), "outStream", null);
        setField(term110053, term110053.getClass(), "globalRefMap", null);
        setField(term110053, term110053.getClass(), "sanityCheck", null);
        setField(term110053, term110053.getClass(), "currentTracer", null);
        setField(term110053, term110053.getClass(), "currentPassName", null);
        setIntField(term110053, term110053.getClass(), "syntheticCodeId", 0);
        setField(term110053, term110053.getClass(), "recentChange", null);
        setField(term110053, term110053.getClass(), "codeChangeHandlers", null);
        setField(term110053, term110053.getClass(), "stage", null);
        setField(term110052, term110052.getClass(), "compiler", term110053);
        setField(term110052, term110052.getClass(), "preprocessorSymbolTable", null);
        setField(term110052, term110052.getClass(), "transformationHandler", null);
        term110054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110054, term110054.getClass(), "type", 0);
        setField(term110054, term110054.getClass(), "next", null);
        setIntField(term110055, term110055.getClass(), "type", 0);
        setIntField(term110056, term110056.getClass(), "type", 0);
        setField(term110056, term110056.getClass(), "next", null);
        setField(term110056, term110056.getClass(), "first", null);
        setField(term110056, term110056.getClass(), "last", null);
        setField(term110056, term110056.getClass(), "propListHead", null);
        setIntField(term110056, term110056.getClass(), "sourcePosition", 0);
        setField(term110056, term110056.getClass(), "jsType", null);
        setField(term110056, term110056.getClass(), "parent", null);
        setField(term110055, term110055.getClass(), "next", term110056);
        setIntField(term110057, term110057.getClass(), "type", 0);
        setField(term110057, term110057.getClass(), "next", null);
        setField(term110057, term110057.getClass(), "first", null);
        setField(term110057, term110057.getClass(), "last", null);
        setField(term110057, term110057.getClass(), "propListHead", null);
        setIntField(term110057, term110057.getClass(), "sourcePosition", 0);
        setField(term110057, term110057.getClass(), "jsType", null);
        setField(term110057, term110057.getClass(), "parent", null);
        setField(term110055, term110055.getClass(), "first", term110057);
        setField(term110055, term110055.getClass(), "last", null);
        setField(term110055, term110055.getClass(), "propListHead", null);
        setIntField(term110055, term110055.getClass(), "sourcePosition", 0);
        setField(term110055, term110055.getClass(), "jsType", null);
        setField(term110055, term110055.getClass(), "parent", null);
        setField(term110054, term110054.getClass(), "first", term110055);
        setField(term110054, term110054.getClass(), "last", null);
        setField(term110054, term110054.getClass(), "propListHead", null);
        setIntField(term110054, term110054.getClass(), "sourcePosition", 0);
        setField(term110054, term110054.getClass(), "jsType", null);
        setField(term110054, term110054.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term108833;
        callMethod(klass, "process", argTypes, term108683, args);
        assertTrue(recursiveEquals(term108683, term110052));
        assertTrue(recursiveEquals(term108833, null));
    }

};


