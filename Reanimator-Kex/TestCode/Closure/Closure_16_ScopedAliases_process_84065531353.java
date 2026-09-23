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

public class ScopedAliases_process_84065531353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31578;
     Object term31728;
     Object term32045;
     Object term32047;

    public ScopedAliases_process_84065531353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31578 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term31658 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31578, term31578.getClass(), "compiler", term31658);
        term31728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31728, term31728.getClass(), "type", 105);
        setField(term31728, term31728.getClass(), "parent", null);
        term32045 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term32046 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32046, term32046.getClass(), "options", null);
        setField(term32046, term32046.getClass(), "passes", null);
        setField(term32046, term32046.getClass(), "externs", null);
        setField(term32046, term32046.getClass(), "modules", null);
        setField(term32046, term32046.getClass(), "moduleGraph", null);
        setField(term32046, term32046.getClass(), "inputs", null);
        setField(term32046, term32046.getClass(), "errorManager", null);
        setField(term32046, term32046.getClass(), "warningsGuard", null);
        setField(term32046, term32046.getClass(), "injectedLibraries", null);
        setField(term32046, term32046.getClass(), "externsRoot", null);
        setField(term32046, term32046.getClass(), "jsRoot", null);
        setField(term32046, term32046.getClass(), "externAndJsRoot", null);
        setField(term32046, term32046.getClass(), "inputsById", null);
        setField(term32046, term32046.getClass(), "sourceMap", null);
        setField(term32046, term32046.getClass(), "externExports", null);
        setIntField(term32046, term32046.getClass(), "uniqueNameId", 0);
        setBooleanField(term32046, term32046.getClass(), "useThreads", false);
        setBooleanField(term32046, term32046.getClass(), "hasRegExpGlobalReferences", false);
        setField(term32046, term32046.getClass(), "functionInformationMap", null);
        setField(term32046, term32046.getClass(), "debugLog", null);
        setField(term32046, term32046.getClass(), "defaultCodingConvention", null);
        setField(term32046, term32046.getClass(), "typeRegistry", null);
        setField(term32046, term32046.getClass(), "parserConfig", null);
        setField(term32046, term32046.getClass(), "abstractInterpreter", null);
        setField(term32046, term32046.getClass(), "typeValidator", null);
        setField(term32046, term32046.getClass(), "tracker", null);
        setField(term32046, term32046.getClass(), "oldErrorReporter", null);
        setField(term32046, term32046.getClass(), "defaultErrorReporter", null);
        setField(term32046, term32046.getClass(), "outStream", null);
        setField(term32046, term32046.getClass(), "globalRefMap", null);
        setDoubleField(term32046, term32046.getClass(), "progress", 0.0);
        setField(term32046, term32046.getClass(), "sanityCheck", null);
        setField(term32046, term32046.getClass(), "currentTracer", null);
        setField(term32046, term32046.getClass(), "currentPassName", null);
        setIntField(term32046, term32046.getClass(), "syntheticCodeId", 0);
        setField(term32046, term32046.getClass(), "recentChange", null);
        setField(term32046, term32046.getClass(), "codeChangeHandlers", null);
        setField(term32046, term32046.getClass(), "synthesizedExternsInput", null);
        setField(term32046, term32046.getClass(), "stage", null);
        setField(term32045, term32045.getClass(), "compiler", term32046);
        setField(term32045, term32045.getClass(), "preprocessorSymbolTable", null);
        setField(term32045, term32045.getClass(), "transformationHandler", null);
        term32047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32047, term32047.getClass(), "type", 105);
        setField(term32047, term32047.getClass(), "next", null);
        setField(term32047, term32047.getClass(), "first", null);
        setField(term32047, term32047.getClass(), "last", null);
        setField(term32047, term32047.getClass(), "propListHead", null);
        setIntField(term32047, term32047.getClass(), "sourcePosition", 0);
        setField(term32047, term32047.getClass(), "jsType", null);
        setField(term32047, term32047.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31728;
        callMethod(klass, "process", argTypes, term31578, args);
        assertTrue(recursiveEquals(term31578, term32045));
        assertTrue(recursiveEquals(term31728, null));
    }

};


