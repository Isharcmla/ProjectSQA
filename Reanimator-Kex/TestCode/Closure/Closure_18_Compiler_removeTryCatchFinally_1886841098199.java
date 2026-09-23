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

public class Compiler_removeTryCatchFinally_1886841098199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996904;

    public Compiler_removeTryCatchFinally_1886841098199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996904 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996904, term996904.getClass(), "options", null);
        setField(term996904, term996904.getClass(), "passes", null);
        setField(term996904, term996904.getClass(), "externs", null);
        setField(term996904, term996904.getClass(), "modules", null);
        setField(term996904, term996904.getClass(), "moduleGraph", null);
        setField(term996904, term996904.getClass(), "inputs", null);
        setField(term996904, term996904.getClass(), "errorManager", null);
        setField(term996904, term996904.getClass(), "warningsGuard", null);
        setField(term996904, term996904.getClass(), "injectedLibraries", null);
        setField(term996904, term996904.getClass(), "externsRoot", null);
        setField(term996904, term996904.getClass(), "jsRoot", null);
        setField(term996904, term996904.getClass(), "externAndJsRoot", null);
        setField(term996904, term996904.getClass(), "inputsById", null);
        setField(term996904, term996904.getClass(), "sourceMap", null);
        setField(term996904, term996904.getClass(), "externExports", null);
        setIntField(term996904, term996904.getClass(), "uniqueNameId", 0);
        setBooleanField(term996904, term996904.getClass(), "useThreads", false);
        setBooleanField(term996904, term996904.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996904, term996904.getClass(), "functionInformationMap", null);
        setField(term996904, term996904.getClass(), "debugLog", null);
        setField(term996904, term996904.getClass(), "defaultCodingConvention", null);
        setField(term996904, term996904.getClass(), "typeRegistry", null);
        setField(term996904, term996904.getClass(), "parserConfig", null);
        setField(term996904, term996904.getClass(), "abstractInterpreter", null);
        setField(term996904, term996904.getClass(), "typeValidator", null);
        setField(term996904, term996904.getClass(), "tracker", null);
        setField(term996904, term996904.getClass(), "oldErrorReporter", null);
        setField(term996904, term996904.getClass(), "defaultErrorReporter", null);
        setField(term996904, term996904.getClass(), "outStream", null);
        setField(term996904, term996904.getClass(), "globalRefMap", null);
        setDoubleField(term996904, term996904.getClass(), "progress", 0.0);
        setField(term996904, term996904.getClass(), "sanityCheck", null);
        setField(term996904, term996904.getClass(), "currentTracer", null);
        setField(term996904, term996904.getClass(), "currentPassName", null);
        setIntField(term996904, term996904.getClass(), "syntheticCodeId", 0);
        setField(term996904, term996904.getClass(), "recentChange", null);
        setField(term996904, term996904.getClass(), "codeChangeHandlers", null);
        setField(term996904, term996904.getClass(), "synthesizedExternsInput", null);
        setField(term996904, term996904.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeTryCatchFinally", argTypes, term996904, args);
    }

};


