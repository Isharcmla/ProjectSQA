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

public class ScopedAliases_process_84065531398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58035;
     Object term58185;
     Object term59438;
     Object term59440;

    public ScopedAliases_process_84065531398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58035 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term58115 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58035, term58035.getClass(), "compiler", term58115);
        term58185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58185, term58185.getClass(), "type", 105);
        setIntField(term58255, term58255.getClass(), "type", 0);
        setField(term58255, term58255.getClass(), "parent", null);
        setField(term58185, term58185.getClass(), "parent", term58255);
        term59438 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term59439 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term59439, term59439.getClass(), "options", null);
        setField(term59439, term59439.getClass(), "passes", null);
        setField(term59439, term59439.getClass(), "externs", null);
        setField(term59439, term59439.getClass(), "modules", null);
        setField(term59439, term59439.getClass(), "moduleGraph", null);
        setField(term59439, term59439.getClass(), "inputs", null);
        setField(term59439, term59439.getClass(), "errorManager", null);
        setField(term59439, term59439.getClass(), "warningsGuard", null);
        setField(term59439, term59439.getClass(), "injectedLibraries", null);
        setField(term59439, term59439.getClass(), "externsRoot", null);
        setField(term59439, term59439.getClass(), "jsRoot", null);
        setField(term59439, term59439.getClass(), "externAndJsRoot", null);
        setField(term59439, term59439.getClass(), "inputsById", null);
        setField(term59439, term59439.getClass(), "sourceMap", null);
        setField(term59439, term59439.getClass(), "externExports", null);
        setIntField(term59439, term59439.getClass(), "uniqueNameId", 0);
        setBooleanField(term59439, term59439.getClass(), "useThreads", false);
        setBooleanField(term59439, term59439.getClass(), "hasRegExpGlobalReferences", false);
        setField(term59439, term59439.getClass(), "functionInformationMap", null);
        setField(term59439, term59439.getClass(), "debugLog", null);
        setField(term59439, term59439.getClass(), "defaultCodingConvention", null);
        setField(term59439, term59439.getClass(), "typeRegistry", null);
        setField(term59439, term59439.getClass(), "parserConfig", null);
        setField(term59439, term59439.getClass(), "abstractInterpreter", null);
        setField(term59439, term59439.getClass(), "typeValidator", null);
        setField(term59439, term59439.getClass(), "tracker", null);
        setField(term59439, term59439.getClass(), "oldErrorReporter", null);
        setField(term59439, term59439.getClass(), "defaultErrorReporter", null);
        setField(term59439, term59439.getClass(), "outStream", null);
        setField(term59439, term59439.getClass(), "globalRefMap", null);
        setDoubleField(term59439, term59439.getClass(), "progress", 0.0);
        setField(term59439, term59439.getClass(), "sanityCheck", null);
        setField(term59439, term59439.getClass(), "currentTracer", null);
        setField(term59439, term59439.getClass(), "currentPassName", null);
        setIntField(term59439, term59439.getClass(), "syntheticCodeId", 0);
        setField(term59439, term59439.getClass(), "recentChange", null);
        setField(term59439, term59439.getClass(), "codeChangeHandlers", null);
        setField(term59439, term59439.getClass(), "synthesizedExternsInput", null);
        setField(term59439, term59439.getClass(), "stage", null);
        setField(term59438, term59438.getClass(), "compiler", term59439);
        setField(term59438, term59438.getClass(), "preprocessorSymbolTable", null);
        setField(term59438, term59438.getClass(), "transformationHandler", null);
        term59440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59440, term59440.getClass(), "type", 105);
        setField(term59440, term59440.getClass(), "next", null);
        setField(term59440, term59440.getClass(), "first", null);
        setField(term59440, term59440.getClass(), "last", null);
        setField(term59440, term59440.getClass(), "propListHead", null);
        setIntField(term59440, term59440.getClass(), "sourcePosition", 0);
        setField(term59440, term59440.getClass(), "jsType", null);
        setIntField(term59441, term59441.getClass(), "type", 0);
        setField(term59441, term59441.getClass(), "next", null);
        setField(term59441, term59441.getClass(), "first", null);
        setField(term59441, term59441.getClass(), "last", null);
        setField(term59441, term59441.getClass(), "propListHead", null);
        setIntField(term59441, term59441.getClass(), "sourcePosition", 0);
        setField(term59441, term59441.getClass(), "jsType", null);
        setField(term59441, term59441.getClass(), "parent", null);
        setField(term59440, term59440.getClass(), "parent", term59441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term58185;
        callMethod(klass, "process", argTypes, term58035, args);
        assertTrue(recursiveEquals(term58035, term59438));
        assertTrue(recursiveEquals(term58185, null));
    }

};


