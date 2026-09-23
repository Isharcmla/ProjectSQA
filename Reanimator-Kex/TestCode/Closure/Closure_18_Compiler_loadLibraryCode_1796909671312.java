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

public class Compiler_loadLibraryCode_1796909671312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997594;

    public Compiler_loadLibraryCode_1796909671312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997594 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997594, term997594.getClass(), "options", null);
        setField(term997594, term997594.getClass(), "passes", null);
        setField(term997594, term997594.getClass(), "externs", null);
        setField(term997594, term997594.getClass(), "modules", null);
        setField(term997594, term997594.getClass(), "moduleGraph", null);
        setField(term997594, term997594.getClass(), "inputs", null);
        setField(term997594, term997594.getClass(), "errorManager", null);
        setField(term997594, term997594.getClass(), "warningsGuard", null);
        setField(term997594, term997594.getClass(), "injectedLibraries", null);
        setField(term997594, term997594.getClass(), "externsRoot", null);
        setField(term997594, term997594.getClass(), "jsRoot", null);
        setField(term997594, term997594.getClass(), "externAndJsRoot", null);
        setField(term997594, term997594.getClass(), "inputsById", null);
        setField(term997594, term997594.getClass(), "sourceMap", null);
        setField(term997594, term997594.getClass(), "externExports", null);
        setIntField(term997594, term997594.getClass(), "uniqueNameId", 0);
        setBooleanField(term997594, term997594.getClass(), "useThreads", false);
        setBooleanField(term997594, term997594.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997594, term997594.getClass(), "functionInformationMap", null);
        setField(term997594, term997594.getClass(), "debugLog", null);
        setField(term997594, term997594.getClass(), "defaultCodingConvention", null);
        setField(term997594, term997594.getClass(), "typeRegistry", null);
        setField(term997594, term997594.getClass(), "parserConfig", null);
        setField(term997594, term997594.getClass(), "abstractInterpreter", null);
        setField(term997594, term997594.getClass(), "typeValidator", null);
        setField(term997594, term997594.getClass(), "tracker", null);
        setField(term997594, term997594.getClass(), "oldErrorReporter", null);
        setField(term997594, term997594.getClass(), "defaultErrorReporter", null);
        setField(term997594, term997594.getClass(), "outStream", null);
        setField(term997594, term997594.getClass(), "globalRefMap", null);
        setDoubleField(term997594, term997594.getClass(), "progress", 0.0);
        setField(term997594, term997594.getClass(), "sanityCheck", null);
        setField(term997594, term997594.getClass(), "currentTracer", null);
        setField(term997594, term997594.getClass(), "currentPassName", null);
        setIntField(term997594, term997594.getClass(), "syntheticCodeId", 0);
        setField(term997594, term997594.getClass(), "recentChange", null);
        setField(term997594, term997594.getClass(), "codeChangeHandlers", null);
        setField(term997594, term997594.getClass(), "synthesizedExternsInput", null);
        setField(term997594, term997594.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loadLibraryCode", argTypes, term997594, args);
    }

};


