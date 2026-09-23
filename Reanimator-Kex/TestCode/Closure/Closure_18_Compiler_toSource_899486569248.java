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

public class Compiler_toSource_899486569248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997200;

    public Compiler_toSource_899486569248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997200 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997200, term997200.getClass(), "options", null);
        setField(term997200, term997200.getClass(), "passes", null);
        setField(term997200, term997200.getClass(), "externs", null);
        setField(term997200, term997200.getClass(), "modules", null);
        setField(term997200, term997200.getClass(), "moduleGraph", null);
        setField(term997200, term997200.getClass(), "inputs", null);
        setField(term997200, term997200.getClass(), "errorManager", null);
        setField(term997200, term997200.getClass(), "warningsGuard", null);
        setField(term997200, term997200.getClass(), "injectedLibraries", null);
        setField(term997200, term997200.getClass(), "externsRoot", null);
        setField(term997200, term997200.getClass(), "jsRoot", null);
        setField(term997200, term997200.getClass(), "externAndJsRoot", null);
        setField(term997200, term997200.getClass(), "inputsById", null);
        setField(term997200, term997200.getClass(), "sourceMap", null);
        setField(term997200, term997200.getClass(), "externExports", null);
        setIntField(term997200, term997200.getClass(), "uniqueNameId", 0);
        setBooleanField(term997200, term997200.getClass(), "useThreads", false);
        setBooleanField(term997200, term997200.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997200, term997200.getClass(), "functionInformationMap", null);
        setField(term997200, term997200.getClass(), "debugLog", null);
        setField(term997200, term997200.getClass(), "defaultCodingConvention", null);
        setField(term997200, term997200.getClass(), "typeRegistry", null);
        setField(term997200, term997200.getClass(), "parserConfig", null);
        setField(term997200, term997200.getClass(), "abstractInterpreter", null);
        setField(term997200, term997200.getClass(), "typeValidator", null);
        setField(term997200, term997200.getClass(), "tracker", null);
        setField(term997200, term997200.getClass(), "oldErrorReporter", null);
        setField(term997200, term997200.getClass(), "defaultErrorReporter", null);
        setField(term997200, term997200.getClass(), "outStream", null);
        setField(term997200, term997200.getClass(), "globalRefMap", null);
        setDoubleField(term997200, term997200.getClass(), "progress", 0.0);
        setField(term997200, term997200.getClass(), "sanityCheck", null);
        setField(term997200, term997200.getClass(), "currentTracer", null);
        setField(term997200, term997200.getClass(), "currentPassName", null);
        setIntField(term997200, term997200.getClass(), "syntheticCodeId", 0);
        setField(term997200, term997200.getClass(), "recentChange", null);
        setField(term997200, term997200.getClass(), "codeChangeHandlers", null);
        setField(term997200, term997200.getClass(), "synthesizedExternsInput", null);
        setField(term997200, term997200.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSource", argTypes, term997200, args);
    }

};


