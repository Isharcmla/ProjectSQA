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

public class ScopedAliases_process_840655313223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139077;
     Object term139227;
     Object term140039;
     Object term140041;

    public ScopedAliases_process_840655313223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139077 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term139157 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term139077, term139077.getClass(), "compiler", term139157);
        term139227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139227, term139227.getClass(), "type", 0);
        setIntField(term139297, term139297.getClass(), "type", 0);
        setField(term139297, term139297.getClass(), "parent", null);
        setField(term139227, term139227.getClass(), "parent", term139297);
        setField(term139367, term139367.getClass(), "next", null);
        setIntField(term139367, term139367.getClass(), "type", 0);
        setField(term139437, term139437.getClass(), "next", null);
        setIntField(term139437, term139437.getClass(), "type", 0);
        setField(term139437, term139437.getClass(), "first", null);
        setField(term139367, term139367.getClass(), "first", term139437);
        setField(term139227, term139227.getClass(), "first", term139367);
        term140039 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term140040 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term140040, term140040.getClass(), "options", null);
        setField(term140040, term140040.getClass(), "passes", null);
        setField(term140040, term140040.getClass(), "externs", null);
        setField(term140040, term140040.getClass(), "modules", null);
        setField(term140040, term140040.getClass(), "moduleGraph", null);
        setField(term140040, term140040.getClass(), "inputs", null);
        setField(term140040, term140040.getClass(), "errorManager", null);
        setField(term140040, term140040.getClass(), "warningsGuard", null);
        setField(term140040, term140040.getClass(), "injectedLibraries", null);
        setField(term140040, term140040.getClass(), "externsRoot", null);
        setField(term140040, term140040.getClass(), "jsRoot", null);
        setField(term140040, term140040.getClass(), "externAndJsRoot", null);
        setField(term140040, term140040.getClass(), "inputsById", null);
        setField(term140040, term140040.getClass(), "sourceMap", null);
        setField(term140040, term140040.getClass(), "externExports", null);
        setIntField(term140040, term140040.getClass(), "uniqueNameId", 0);
        setBooleanField(term140040, term140040.getClass(), "useThreads", false);
        setBooleanField(term140040, term140040.getClass(), "hasRegExpGlobalReferences", false);
        setField(term140040, term140040.getClass(), "functionInformationMap", null);
        setField(term140040, term140040.getClass(), "debugLog", null);
        setField(term140040, term140040.getClass(), "defaultCodingConvention", null);
        setField(term140040, term140040.getClass(), "typeRegistry", null);
        setField(term140040, term140040.getClass(), "parserConfig", null);
        setField(term140040, term140040.getClass(), "abstractInterpreter", null);
        setField(term140040, term140040.getClass(), "typeValidator", null);
        setField(term140040, term140040.getClass(), "tracker", null);
        setField(term140040, term140040.getClass(), "oldErrorReporter", null);
        setField(term140040, term140040.getClass(), "defaultErrorReporter", null);
        setField(term140040, term140040.getClass(), "outStream", null);
        setField(term140040, term140040.getClass(), "globalRefMap", null);
        setDoubleField(term140040, term140040.getClass(), "progress", 0.0);
        setField(term140040, term140040.getClass(), "sanityCheck", null);
        setField(term140040, term140040.getClass(), "currentTracer", null);
        setField(term140040, term140040.getClass(), "currentPassName", null);
        setIntField(term140040, term140040.getClass(), "syntheticCodeId", 0);
        setField(term140040, term140040.getClass(), "recentChange", null);
        setField(term140040, term140040.getClass(), "codeChangeHandlers", null);
        setField(term140040, term140040.getClass(), "synthesizedExternsInput", null);
        setField(term140040, term140040.getClass(), "stage", null);
        setField(term140039, term140039.getClass(), "compiler", term140040);
        setField(term140039, term140039.getClass(), "preprocessorSymbolTable", null);
        setField(term140039, term140039.getClass(), "transformationHandler", null);
        term140041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140041, term140041.getClass(), "type", 0);
        setField(term140041, term140041.getClass(), "next", null);
        setIntField(term140042, term140042.getClass(), "type", 0);
        setField(term140042, term140042.getClass(), "next", null);
        setIntField(term140043, term140043.getClass(), "type", 0);
        setField(term140043, term140043.getClass(), "next", null);
        setField(term140043, term140043.getClass(), "first", null);
        setField(term140043, term140043.getClass(), "last", null);
        setField(term140043, term140043.getClass(), "propListHead", null);
        setIntField(term140043, term140043.getClass(), "sourcePosition", 0);
        setField(term140043, term140043.getClass(), "jsType", null);
        setField(term140043, term140043.getClass(), "parent", null);
        setField(term140042, term140042.getClass(), "first", term140043);
        setField(term140042, term140042.getClass(), "last", null);
        setField(term140042, term140042.getClass(), "propListHead", null);
        setIntField(term140042, term140042.getClass(), "sourcePosition", 0);
        setField(term140042, term140042.getClass(), "jsType", null);
        setField(term140042, term140042.getClass(), "parent", null);
        setField(term140041, term140041.getClass(), "first", term140042);
        setField(term140041, term140041.getClass(), "last", null);
        setField(term140041, term140041.getClass(), "propListHead", null);
        setIntField(term140041, term140041.getClass(), "sourcePosition", 0);
        setField(term140041, term140041.getClass(), "jsType", null);
        setIntField(term140044, term140044.getClass(), "type", 0);
        setField(term140044, term140044.getClass(), "next", null);
        setField(term140044, term140044.getClass(), "first", null);
        setField(term140044, term140044.getClass(), "last", null);
        setField(term140044, term140044.getClass(), "propListHead", null);
        setIntField(term140044, term140044.getClass(), "sourcePosition", 0);
        setField(term140044, term140044.getClass(), "jsType", null);
        setField(term140044, term140044.getClass(), "parent", null);
        setField(term140041, term140041.getClass(), "parent", term140044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term139227;
        callMethod(klass, "process", argTypes, term139077, args);
        assertTrue(recursiveEquals(term139077, term140039));
        assertTrue(recursiveEquals(term139227, null));
    }

};


