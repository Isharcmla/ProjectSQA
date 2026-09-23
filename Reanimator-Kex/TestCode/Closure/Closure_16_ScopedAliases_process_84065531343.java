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

public class ScopedAliases_process_84065531343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24570;
     Object term24742;
     Object term25838;
     Object term25840;

    public ScopedAliases_process_84065531343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24570 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term24650 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term24570, term24570.getClass(), "compiler", term24650);
        term24742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24742, term24742.getClass(), "type", 0);
        setField(term24742, term24742.getClass(), "parent", null);
        setField(term24742, term24742.getClass(), "first", null);
        term25838 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term25839 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25839, term25839.getClass(), "options", null);
        setField(term25839, term25839.getClass(), "passes", null);
        setField(term25839, term25839.getClass(), "externs", null);
        setField(term25839, term25839.getClass(), "modules", null);
        setField(term25839, term25839.getClass(), "moduleGraph", null);
        setField(term25839, term25839.getClass(), "inputs", null);
        setField(term25839, term25839.getClass(), "errorManager", null);
        setField(term25839, term25839.getClass(), "warningsGuard", null);
        setField(term25839, term25839.getClass(), "injectedLibraries", null);
        setField(term25839, term25839.getClass(), "externsRoot", null);
        setField(term25839, term25839.getClass(), "jsRoot", null);
        setField(term25839, term25839.getClass(), "externAndJsRoot", null);
        setField(term25839, term25839.getClass(), "inputsById", null);
        setField(term25839, term25839.getClass(), "sourceMap", null);
        setField(term25839, term25839.getClass(), "externExports", null);
        setIntField(term25839, term25839.getClass(), "uniqueNameId", 0);
        setBooleanField(term25839, term25839.getClass(), "useThreads", false);
        setBooleanField(term25839, term25839.getClass(), "hasRegExpGlobalReferences", false);
        setField(term25839, term25839.getClass(), "functionInformationMap", null);
        setField(term25839, term25839.getClass(), "debugLog", null);
        setField(term25839, term25839.getClass(), "defaultCodingConvention", null);
        setField(term25839, term25839.getClass(), "typeRegistry", null);
        setField(term25839, term25839.getClass(), "parserConfig", null);
        setField(term25839, term25839.getClass(), "abstractInterpreter", null);
        setField(term25839, term25839.getClass(), "typeValidator", null);
        setField(term25839, term25839.getClass(), "tracker", null);
        setField(term25839, term25839.getClass(), "oldErrorReporter", null);
        setField(term25839, term25839.getClass(), "defaultErrorReporter", null);
        setField(term25839, term25839.getClass(), "outStream", null);
        setField(term25839, term25839.getClass(), "globalRefMap", null);
        setDoubleField(term25839, term25839.getClass(), "progress", 0.0);
        setField(term25839, term25839.getClass(), "sanityCheck", null);
        setField(term25839, term25839.getClass(), "currentTracer", null);
        setField(term25839, term25839.getClass(), "currentPassName", null);
        setIntField(term25839, term25839.getClass(), "syntheticCodeId", 0);
        setField(term25839, term25839.getClass(), "recentChange", null);
        setField(term25839, term25839.getClass(), "codeChangeHandlers", null);
        setField(term25839, term25839.getClass(), "synthesizedExternsInput", null);
        setField(term25839, term25839.getClass(), "stage", null);
        setField(term25838, term25838.getClass(), "compiler", term25839);
        setField(term25838, term25838.getClass(), "preprocessorSymbolTable", null);
        setField(term25838, term25838.getClass(), "transformationHandler", null);
        term25840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term25840, term25840.getClass(), "number", 0.0);
        setIntField(term25840, term25840.getClass(), "type", 0);
        setField(term25840, term25840.getClass(), "next", null);
        setField(term25840, term25840.getClass(), "first", null);
        setField(term25840, term25840.getClass(), "last", null);
        setField(term25840, term25840.getClass(), "propListHead", null);
        setIntField(term25840, term25840.getClass(), "sourcePosition", 0);
        setField(term25840, term25840.getClass(), "jsType", null);
        setField(term25840, term25840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24742;
        callMethod(klass, "process", argTypes, term24570, args);
        assertTrue(recursiveEquals(term24570, term25838));
        assertTrue(recursiveEquals(term24742, null));
    }

};


