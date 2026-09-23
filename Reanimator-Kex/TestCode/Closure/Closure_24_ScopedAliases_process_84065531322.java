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

public class ScopedAliases_process_84065531322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11275;
     Object term11425;
     Object term12434;
     Object term12436;

    public ScopedAliases_process_84065531322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11275 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term11355 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11275, term11275.getClass(), "compiler", term11355);
        term11425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11425, term11425.getClass(), "type", 0);
        setIntField(term11495, term11495.getClass(), "type", 0);
        setField(term11495, term11495.getClass(), "parent", null);
        setField(term11425, term11425.getClass(), "parent", term11495);
        setField(term11425, term11425.getClass(), "first", null);
        term12434 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term12435 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12435, term12435.getClass(), "options", null);
        setField(term12435, term12435.getClass(), "passes", null);
        setField(term12435, term12435.getClass(), "externs", null);
        setField(term12435, term12435.getClass(), "modules", null);
        setField(term12435, term12435.getClass(), "moduleGraph", null);
        setField(term12435, term12435.getClass(), "inputs", null);
        setField(term12435, term12435.getClass(), "errorManager", null);
        setField(term12435, term12435.getClass(), "warningsGuard", null);
        setField(term12435, term12435.getClass(), "injectedLibraries", null);
        setField(term12435, term12435.getClass(), "externsRoot", null);
        setField(term12435, term12435.getClass(), "jsRoot", null);
        setField(term12435, term12435.getClass(), "externAndJsRoot", null);
        setField(term12435, term12435.getClass(), "inputsById", null);
        setField(term12435, term12435.getClass(), "sourceMap", null);
        setField(term12435, term12435.getClass(), "externExports", null);
        setIntField(term12435, term12435.getClass(), "uniqueNameId", 0);
        setBooleanField(term12435, term12435.getClass(), "useThreads", false);
        setBooleanField(term12435, term12435.getClass(), "hasRegExpGlobalReferences", false);
        setField(term12435, term12435.getClass(), "functionInformationMap", null);
        setField(term12435, term12435.getClass(), "debugLog", null);
        setField(term12435, term12435.getClass(), "defaultCodingConvention", null);
        setField(term12435, term12435.getClass(), "typeRegistry", null);
        setField(term12435, term12435.getClass(), "parserConfig", null);
        setField(term12435, term12435.getClass(), "abstractInterpreter", null);
        setField(term12435, term12435.getClass(), "typeValidator", null);
        setField(term12435, term12435.getClass(), "tracker", null);
        setField(term12435, term12435.getClass(), "oldErrorReporter", null);
        setField(term12435, term12435.getClass(), "defaultErrorReporter", null);
        setField(term12435, term12435.getClass(), "outStream", null);
        setField(term12435, term12435.getClass(), "globalRefMap", null);
        setDoubleField(term12435, term12435.getClass(), "progress", 0.0);
        setField(term12435, term12435.getClass(), "sanityCheck", null);
        setField(term12435, term12435.getClass(), "currentTracer", null);
        setField(term12435, term12435.getClass(), "currentPassName", null);
        setIntField(term12435, term12435.getClass(), "syntheticCodeId", 0);
        setField(term12435, term12435.getClass(), "recentChange", null);
        setField(term12435, term12435.getClass(), "codeChangeHandlers", null);
        setField(term12435, term12435.getClass(), "synthesizedExternsInput", null);
        setField(term12435, term12435.getClass(), "stage", null);
        setField(term12434, term12434.getClass(), "compiler", term12435);
        setField(term12434, term12434.getClass(), "preprocessorSymbolTable", null);
        setField(term12434, term12434.getClass(), "transformationHandler", null);
        term12436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12436, term12436.getClass(), "type", 0);
        setField(term12436, term12436.getClass(), "next", null);
        setField(term12436, term12436.getClass(), "first", null);
        setField(term12436, term12436.getClass(), "last", null);
        setField(term12436, term12436.getClass(), "propListHead", null);
        setIntField(term12436, term12436.getClass(), "sourcePosition", 0);
        setField(term12436, term12436.getClass(), "jsType", null);
        setIntField(term12437, term12437.getClass(), "type", 0);
        setField(term12437, term12437.getClass(), "next", null);
        setField(term12437, term12437.getClass(), "first", null);
        setField(term12437, term12437.getClass(), "last", null);
        setField(term12437, term12437.getClass(), "propListHead", null);
        setIntField(term12437, term12437.getClass(), "sourcePosition", 0);
        setField(term12437, term12437.getClass(), "jsType", null);
        setField(term12437, term12437.getClass(), "parent", null);
        setField(term12436, term12436.getClass(), "parent", term12437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11425;
        callMethod(klass, "process", argTypes, term11275, args);
        assertTrue(recursiveEquals(term11275, term12434));
        assertTrue(recursiveEquals(term11425, null));
    }

};


