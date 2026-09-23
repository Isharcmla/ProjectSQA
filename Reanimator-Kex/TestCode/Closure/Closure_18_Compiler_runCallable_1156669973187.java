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
import java.lang.Boolean;

public class Compiler_runCallable_1156669973187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996828;
     Object term996834;
     Object term996836;

    public Compiler_runCallable_1156669973187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996828 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996828, term996828.getClass(), "options", null);
        setField(term996828, term996828.getClass(), "passes", null);
        setField(term996828, term996828.getClass(), "externs", null);
        setField(term996828, term996828.getClass(), "modules", null);
        setField(term996828, term996828.getClass(), "moduleGraph", null);
        setField(term996828, term996828.getClass(), "inputs", null);
        setField(term996828, term996828.getClass(), "errorManager", null);
        setField(term996828, term996828.getClass(), "warningsGuard", null);
        setField(term996828, term996828.getClass(), "injectedLibraries", null);
        setField(term996828, term996828.getClass(), "externsRoot", null);
        setField(term996828, term996828.getClass(), "jsRoot", null);
        setField(term996828, term996828.getClass(), "externAndJsRoot", null);
        setField(term996828, term996828.getClass(), "inputsById", null);
        setField(term996828, term996828.getClass(), "sourceMap", null);
        setField(term996828, term996828.getClass(), "externExports", null);
        setIntField(term996828, term996828.getClass(), "uniqueNameId", 0);
        setBooleanField(term996828, term996828.getClass(), "useThreads", false);
        setBooleanField(term996828, term996828.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996828, term996828.getClass(), "functionInformationMap", null);
        setField(term996828, term996828.getClass(), "debugLog", null);
        setField(term996828, term996828.getClass(), "defaultCodingConvention", null);
        setField(term996828, term996828.getClass(), "typeRegistry", null);
        setField(term996828, term996828.getClass(), "parserConfig", null);
        setField(term996828, term996828.getClass(), "abstractInterpreter", null);
        setField(term996828, term996828.getClass(), "typeValidator", null);
        setField(term996828, term996828.getClass(), "tracker", null);
        setField(term996828, term996828.getClass(), "oldErrorReporter", null);
        setField(term996828, term996828.getClass(), "defaultErrorReporter", null);
        setField(term996828, term996828.getClass(), "outStream", null);
        setField(term996828, term996828.getClass(), "globalRefMap", null);
        setDoubleField(term996828, term996828.getClass(), "progress", 0.0);
        setField(term996828, term996828.getClass(), "sanityCheck", null);
        setField(term996828, term996828.getClass(), "currentTracer", null);
        setField(term996828, term996828.getClass(), "currentPassName", null);
        setIntField(term996828, term996828.getClass(), "syntheticCodeId", 0);
        setField(term996828, term996828.getClass(), "recentChange", null);
        setField(term996828, term996828.getClass(), "codeChangeHandlers", null);
        setField(term996828, term996828.getClass(), "synthesizedExternsInput", null);
        setField(term996828, term996828.getClass(), "stage", null);
        term996834 = new Boolean(false);
        term996836 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.concurrent.Callable");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term996834;
        args[2] = term996836;
        callMethod(klass, "runCallable", argTypes, term996828, args);
    }

};


