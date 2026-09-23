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

public class ScopedAliases_process_84065531341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53027;
     Object term53177;
     Object term53654;
     Object term53656;

    public ScopedAliases_process_84065531341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53027 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term53107 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term53027, term53027.getClass(), "compiler", term53107);
        term53177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53177, term53177.getClass(), "type", 0);
        setField(term53177, term53177.getClass(), "parent", null);
        setField(term53247, term53247.getClass(), "next", null);
        setIntField(term53247, term53247.getClass(), "type", 132);
        setField(term53177, term53177.getClass(), "first", term53247);
        term53654 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term53655 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term53655, term53655.getClass(), "options", null);
        setField(term53655, term53655.getClass(), "passes", null);
        setField(term53655, term53655.getClass(), "externs", null);
        setField(term53655, term53655.getClass(), "modules", null);
        setField(term53655, term53655.getClass(), "moduleGraph", null);
        setField(term53655, term53655.getClass(), "inputs", null);
        setField(term53655, term53655.getClass(), "errorManager", null);
        setField(term53655, term53655.getClass(), "warningsGuard", null);
        setField(term53655, term53655.getClass(), "injectedLibraries", null);
        setField(term53655, term53655.getClass(), "externsRoot", null);
        setField(term53655, term53655.getClass(), "jsRoot", null);
        setField(term53655, term53655.getClass(), "externAndJsRoot", null);
        setField(term53655, term53655.getClass(), "inputsById", null);
        setField(term53655, term53655.getClass(), "sourceMap", null);
        setField(term53655, term53655.getClass(), "externExports", null);
        setIntField(term53655, term53655.getClass(), "uniqueNameId", 0);
        setBooleanField(term53655, term53655.getClass(), "useThreads", false);
        setBooleanField(term53655, term53655.getClass(), "hasRegExpGlobalReferences", false);
        setField(term53655, term53655.getClass(), "functionInformationMap", null);
        setField(term53655, term53655.getClass(), "debugLog", null);
        setField(term53655, term53655.getClass(), "defaultCodingConvention", null);
        setField(term53655, term53655.getClass(), "typeRegistry", null);
        setField(term53655, term53655.getClass(), "parserConfig", null);
        setField(term53655, term53655.getClass(), "abstractInterpreter", null);
        setField(term53655, term53655.getClass(), "typeValidator", null);
        setField(term53655, term53655.getClass(), "tracker", null);
        setField(term53655, term53655.getClass(), "oldErrorReporter", null);
        setField(term53655, term53655.getClass(), "defaultErrorReporter", null);
        setField(term53655, term53655.getClass(), "outStream", null);
        setField(term53655, term53655.getClass(), "globalRefMap", null);
        setDoubleField(term53655, term53655.getClass(), "progress", 0.0);
        setField(term53655, term53655.getClass(), "sanityCheck", null);
        setField(term53655, term53655.getClass(), "currentTracer", null);
        setField(term53655, term53655.getClass(), "currentPassName", null);
        setIntField(term53655, term53655.getClass(), "syntheticCodeId", 0);
        setField(term53655, term53655.getClass(), "recentChange", null);
        setField(term53655, term53655.getClass(), "codeChangeHandlers", null);
        setField(term53655, term53655.getClass(), "synthesizedExternsInput", null);
        setField(term53655, term53655.getClass(), "stage", null);
        setField(term53654, term53654.getClass(), "compiler", term53655);
        setField(term53654, term53654.getClass(), "preprocessorSymbolTable", null);
        setField(term53654, term53654.getClass(), "transformationHandler", null);
        term53656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53656, term53656.getClass(), "type", 0);
        setField(term53656, term53656.getClass(), "next", null);
        setIntField(term53657, term53657.getClass(), "type", 132);
        setField(term53657, term53657.getClass(), "next", null);
        setField(term53657, term53657.getClass(), "first", null);
        setField(term53657, term53657.getClass(), "last", null);
        setField(term53657, term53657.getClass(), "propListHead", null);
        setIntField(term53657, term53657.getClass(), "sourcePosition", 0);
        setField(term53657, term53657.getClass(), "jsType", null);
        setField(term53657, term53657.getClass(), "parent", null);
        setField(term53656, term53656.getClass(), "first", term53657);
        setField(term53656, term53656.getClass(), "last", null);
        setField(term53656, term53656.getClass(), "propListHead", null);
        setIntField(term53656, term53656.getClass(), "sourcePosition", 0);
        setField(term53656, term53656.getClass(), "jsType", null);
        setField(term53656, term53656.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term53177;
        callMethod(klass, "process", argTypes, term53027, args);
        assertTrue(recursiveEquals(term53027, term53654));
        assertTrue(recursiveEquals(term53177, null));
    }

};


