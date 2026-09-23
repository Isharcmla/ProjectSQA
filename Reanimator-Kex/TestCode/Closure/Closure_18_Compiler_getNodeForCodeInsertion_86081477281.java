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

public class Compiler_getNodeForCodeInsertion_86081477281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997404;

    public Compiler_getNodeForCodeInsertion_86081477281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997404 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997404, term997404.getClass(), "options", null);
        setField(term997404, term997404.getClass(), "passes", null);
        setField(term997404, term997404.getClass(), "externs", null);
        setField(term997404, term997404.getClass(), "modules", null);
        setField(term997404, term997404.getClass(), "moduleGraph", null);
        setField(term997404, term997404.getClass(), "inputs", null);
        setField(term997404, term997404.getClass(), "errorManager", null);
        setField(term997404, term997404.getClass(), "warningsGuard", null);
        setField(term997404, term997404.getClass(), "injectedLibraries", null);
        setField(term997404, term997404.getClass(), "externsRoot", null);
        setField(term997404, term997404.getClass(), "jsRoot", null);
        setField(term997404, term997404.getClass(), "externAndJsRoot", null);
        setField(term997404, term997404.getClass(), "inputsById", null);
        setField(term997404, term997404.getClass(), "sourceMap", null);
        setField(term997404, term997404.getClass(), "externExports", null);
        setIntField(term997404, term997404.getClass(), "uniqueNameId", 0);
        setBooleanField(term997404, term997404.getClass(), "useThreads", false);
        setBooleanField(term997404, term997404.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997404, term997404.getClass(), "functionInformationMap", null);
        setField(term997404, term997404.getClass(), "debugLog", null);
        setField(term997404, term997404.getClass(), "defaultCodingConvention", null);
        setField(term997404, term997404.getClass(), "typeRegistry", null);
        setField(term997404, term997404.getClass(), "parserConfig", null);
        setField(term997404, term997404.getClass(), "abstractInterpreter", null);
        setField(term997404, term997404.getClass(), "typeValidator", null);
        setField(term997404, term997404.getClass(), "tracker", null);
        setField(term997404, term997404.getClass(), "oldErrorReporter", null);
        setField(term997404, term997404.getClass(), "defaultErrorReporter", null);
        setField(term997404, term997404.getClass(), "outStream", null);
        setField(term997404, term997404.getClass(), "globalRefMap", null);
        setDoubleField(term997404, term997404.getClass(), "progress", 0.0);
        setField(term997404, term997404.getClass(), "sanityCheck", null);
        setField(term997404, term997404.getClass(), "currentTracer", null);
        setField(term997404, term997404.getClass(), "currentPassName", null);
        setIntField(term997404, term997404.getClass(), "syntheticCodeId", 0);
        setField(term997404, term997404.getClass(), "recentChange", null);
        setField(term997404, term997404.getClass(), "codeChangeHandlers", null);
        setField(term997404, term997404.getClass(), "synthesizedExternsInput", null);
        setField(term997404, term997404.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNodeForCodeInsertion", argTypes, term997404, args);
    }

};


