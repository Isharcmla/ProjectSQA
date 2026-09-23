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
     Object term57982;
     Object term58132;
     Object term58406;
     Object term58408;

    public ScopedAliases_process_84065531353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57982 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term58062 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term57982, term57982.getClass(), "compiler", term58062);
        term58132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58132, term58132.getClass(), "type", 105);
        setField(term58132, term58132.getClass(), "parent", null);
        term58406 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term58407 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58407, term58407.getClass(), "options", null);
        setField(term58407, term58407.getClass(), "passes", null);
        setField(term58407, term58407.getClass(), "externs", null);
        setField(term58407, term58407.getClass(), "modules", null);
        setField(term58407, term58407.getClass(), "moduleGraph", null);
        setField(term58407, term58407.getClass(), "inputs", null);
        setField(term58407, term58407.getClass(), "errorManager", null);
        setField(term58407, term58407.getClass(), "warningsGuard", null);
        setField(term58407, term58407.getClass(), "injectedLibraries", null);
        setField(term58407, term58407.getClass(), "externsRoot", null);
        setField(term58407, term58407.getClass(), "jsRoot", null);
        setField(term58407, term58407.getClass(), "externAndJsRoot", null);
        setField(term58407, term58407.getClass(), "inputsById", null);
        setField(term58407, term58407.getClass(), "sourceMap", null);
        setField(term58407, term58407.getClass(), "externExports", null);
        setIntField(term58407, term58407.getClass(), "uniqueNameId", 0);
        setBooleanField(term58407, term58407.getClass(), "useThreads", false);
        setBooleanField(term58407, term58407.getClass(), "hasRegExpGlobalReferences", false);
        setField(term58407, term58407.getClass(), "functionInformationMap", null);
        setField(term58407, term58407.getClass(), "debugLog", null);
        setField(term58407, term58407.getClass(), "defaultCodingConvention", null);
        setField(term58407, term58407.getClass(), "typeRegistry", null);
        setField(term58407, term58407.getClass(), "parserConfig", null);
        setField(term58407, term58407.getClass(), "abstractInterpreter", null);
        setField(term58407, term58407.getClass(), "typeValidator", null);
        setField(term58407, term58407.getClass(), "tracker", null);
        setField(term58407, term58407.getClass(), "oldErrorReporter", null);
        setField(term58407, term58407.getClass(), "defaultErrorReporter", null);
        setField(term58407, term58407.getClass(), "outStream", null);
        setField(term58407, term58407.getClass(), "globalRefMap", null);
        setDoubleField(term58407, term58407.getClass(), "progress", 0.0);
        setField(term58407, term58407.getClass(), "sanityCheck", null);
        setField(term58407, term58407.getClass(), "currentTracer", null);
        setField(term58407, term58407.getClass(), "currentPassName", null);
        setIntField(term58407, term58407.getClass(), "syntheticCodeId", 0);
        setField(term58407, term58407.getClass(), "recentChange", null);
        setField(term58407, term58407.getClass(), "codeChangeHandlers", null);
        setField(term58407, term58407.getClass(), "synthesizedExternsInput", null);
        setField(term58407, term58407.getClass(), "stage", null);
        setField(term58406, term58406.getClass(), "compiler", term58407);
        setField(term58406, term58406.getClass(), "preprocessorSymbolTable", null);
        setField(term58406, term58406.getClass(), "transformationHandler", null);
        term58408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58408, term58408.getClass(), "type", 105);
        setField(term58408, term58408.getClass(), "next", null);
        setField(term58408, term58408.getClass(), "first", null);
        setField(term58408, term58408.getClass(), "last", null);
        setField(term58408, term58408.getClass(), "propListHead", null);
        setIntField(term58408, term58408.getClass(), "sourcePosition", 0);
        setField(term58408, term58408.getClass(), "jsType", null);
        setField(term58408, term58408.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term58132;
        callMethod(klass, "process", argTypes, term57982, args);
        assertTrue(recursiveEquals(term57982, term58406));
        assertTrue(recursiveEquals(term58132, null));
    }

};


