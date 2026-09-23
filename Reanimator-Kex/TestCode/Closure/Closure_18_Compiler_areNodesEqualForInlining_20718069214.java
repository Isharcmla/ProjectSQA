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

public class Compiler_areNodesEqualForInlining_20718069214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996994;

    public Compiler_areNodesEqualForInlining_20718069214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996994 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996994, term996994.getClass(), "options", null);
        setField(term996994, term996994.getClass(), "passes", null);
        setField(term996994, term996994.getClass(), "externs", null);
        setField(term996994, term996994.getClass(), "modules", null);
        setField(term996994, term996994.getClass(), "moduleGraph", null);
        setField(term996994, term996994.getClass(), "inputs", null);
        setField(term996994, term996994.getClass(), "errorManager", null);
        setField(term996994, term996994.getClass(), "warningsGuard", null);
        setField(term996994, term996994.getClass(), "injectedLibraries", null);
        setField(term996994, term996994.getClass(), "externsRoot", null);
        setField(term996994, term996994.getClass(), "jsRoot", null);
        setField(term996994, term996994.getClass(), "externAndJsRoot", null);
        setField(term996994, term996994.getClass(), "inputsById", null);
        setField(term996994, term996994.getClass(), "sourceMap", null);
        setField(term996994, term996994.getClass(), "externExports", null);
        setIntField(term996994, term996994.getClass(), "uniqueNameId", 0);
        setBooleanField(term996994, term996994.getClass(), "useThreads", false);
        setBooleanField(term996994, term996994.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996994, term996994.getClass(), "functionInformationMap", null);
        setField(term996994, term996994.getClass(), "debugLog", null);
        setField(term996994, term996994.getClass(), "defaultCodingConvention", null);
        setField(term996994, term996994.getClass(), "typeRegistry", null);
        setField(term996994, term996994.getClass(), "parserConfig", null);
        setField(term996994, term996994.getClass(), "abstractInterpreter", null);
        setField(term996994, term996994.getClass(), "typeValidator", null);
        setField(term996994, term996994.getClass(), "tracker", null);
        setField(term996994, term996994.getClass(), "oldErrorReporter", null);
        setField(term996994, term996994.getClass(), "defaultErrorReporter", null);
        setField(term996994, term996994.getClass(), "outStream", null);
        setField(term996994, term996994.getClass(), "globalRefMap", null);
        setDoubleField(term996994, term996994.getClass(), "progress", 0.0);
        setField(term996994, term996994.getClass(), "sanityCheck", null);
        setField(term996994, term996994.getClass(), "currentTracer", null);
        setField(term996994, term996994.getClass(), "currentPassName", null);
        setIntField(term996994, term996994.getClass(), "syntheticCodeId", 0);
        setField(term996994, term996994.getClass(), "recentChange", null);
        setField(term996994, term996994.getClass(), "codeChangeHandlers", null);
        setField(term996994, term996994.getClass(), "synthesizedExternsInput", null);
        setField(term996994, term996994.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "areNodesEqualForInlining", argTypes, term996994, args);
    }

};


