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

public class ScopedAliases_process_84065531339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22759;
     Object term22931;
     Object term23290;
     Object term23292;

    public ScopedAliases_process_84065531339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22759 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term22839 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22759, term22759.getClass(), "compiler", term22839);
        term22931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term22931, term22931.getClass(), "type", 0);
        setField(term22931, term22931.getClass(), "parent", null);
        setField(term22931, term22931.getClass(), "first", null);
        term23290 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term23291 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term23291, term23291.getClass(), "options", null);
        setField(term23291, term23291.getClass(), "passes", null);
        setField(term23291, term23291.getClass(), "externs", null);
        setField(term23291, term23291.getClass(), "modules", null);
        setField(term23291, term23291.getClass(), "moduleGraph", null);
        setField(term23291, term23291.getClass(), "inputs", null);
        setField(term23291, term23291.getClass(), "errorManager", null);
        setField(term23291, term23291.getClass(), "warningsGuard", null);
        setField(term23291, term23291.getClass(), "injectedLibraries", null);
        setField(term23291, term23291.getClass(), "externsRoot", null);
        setField(term23291, term23291.getClass(), "jsRoot", null);
        setField(term23291, term23291.getClass(), "externAndJsRoot", null);
        setField(term23291, term23291.getClass(), "inputsById", null);
        setField(term23291, term23291.getClass(), "sourceMap", null);
        setField(term23291, term23291.getClass(), "externExports", null);
        setIntField(term23291, term23291.getClass(), "uniqueNameId", 0);
        setBooleanField(term23291, term23291.getClass(), "useThreads", false);
        setBooleanField(term23291, term23291.getClass(), "hasRegExpGlobalReferences", false);
        setField(term23291, term23291.getClass(), "functionInformationMap", null);
        setField(term23291, term23291.getClass(), "debugLog", null);
        setField(term23291, term23291.getClass(), "defaultCodingConvention", null);
        setField(term23291, term23291.getClass(), "typeRegistry", null);
        setField(term23291, term23291.getClass(), "parserConfig", null);
        setField(term23291, term23291.getClass(), "abstractInterpreter", null);
        setField(term23291, term23291.getClass(), "typeValidator", null);
        setField(term23291, term23291.getClass(), "tracker", null);
        setField(term23291, term23291.getClass(), "oldErrorReporter", null);
        setField(term23291, term23291.getClass(), "defaultErrorReporter", null);
        setField(term23291, term23291.getClass(), "outStream", null);
        setField(term23291, term23291.getClass(), "globalRefMap", null);
        setDoubleField(term23291, term23291.getClass(), "progress", 0.0);
        setField(term23291, term23291.getClass(), "sanityCheck", null);
        setField(term23291, term23291.getClass(), "currentTracer", null);
        setField(term23291, term23291.getClass(), "currentPassName", null);
        setIntField(term23291, term23291.getClass(), "syntheticCodeId", 0);
        setField(term23291, term23291.getClass(), "recentChange", null);
        setField(term23291, term23291.getClass(), "codeChangeHandlers", null);
        setField(term23291, term23291.getClass(), "synthesizedExternsInput", null);
        setField(term23291, term23291.getClass(), "stage", null);
        setField(term23290, term23290.getClass(), "compiler", term23291);
        setField(term23290, term23290.getClass(), "preprocessorSymbolTable", null);
        setField(term23290, term23290.getClass(), "transformationHandler", null);
        term23292 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term23292, term23292.getClass(), "number", 0.0);
        setIntField(term23292, term23292.getClass(), "type", 0);
        setField(term23292, term23292.getClass(), "next", null);
        setField(term23292, term23292.getClass(), "first", null);
        setField(term23292, term23292.getClass(), "last", null);
        setField(term23292, term23292.getClass(), "propListHead", null);
        setIntField(term23292, term23292.getClass(), "sourcePosition", 0);
        setField(term23292, term23292.getClass(), "jsType", null);
        setField(term23292, term23292.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22931;
        callMethod(klass, "process", argTypes, term22759, args);
        assertTrue(recursiveEquals(term22759, term23290));
        assertTrue(recursiveEquals(term22931, null));
    }

};


