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

public class Compiler_getExternsInOrder_366397331287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890507;

    public Compiler_getExternsInOrder_366397331287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890507 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890507, term890507.getClass(), "options", null);
        setField(term890507, term890507.getClass(), "passes", null);
        setField(term890507, term890507.getClass(), "externs", null);
        setField(term890507, term890507.getClass(), "modules", null);
        setField(term890507, term890507.getClass(), "moduleGraph", null);
        setField(term890507, term890507.getClass(), "inputs", null);
        setField(term890507, term890507.getClass(), "errorManager", null);
        setField(term890507, term890507.getClass(), "warningsGuard", null);
        setField(term890507, term890507.getClass(), "injectedLibraries", null);
        setField(term890507, term890507.getClass(), "externsRoot", null);
        setField(term890507, term890507.getClass(), "jsRoot", null);
        setField(term890507, term890507.getClass(), "externAndJsRoot", null);
        setField(term890507, term890507.getClass(), "inputsById", null);
        setField(term890507, term890507.getClass(), "sourceMap", null);
        setField(term890507, term890507.getClass(), "externExports", null);
        setIntField(term890507, term890507.getClass(), "uniqueNameId", 0);
        setBooleanField(term890507, term890507.getClass(), "useThreads", false);
        setBooleanField(term890507, term890507.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890507, term890507.getClass(), "functionInformationMap", null);
        setField(term890507, term890507.getClass(), "debugLog", null);
        setField(term890507, term890507.getClass(), "defaultCodingConvention", null);
        setField(term890507, term890507.getClass(), "typeRegistry", null);
        setField(term890507, term890507.getClass(), "parserConfig", null);
        setField(term890507, term890507.getClass(), "abstractInterpreter", null);
        setField(term890507, term890507.getClass(), "typeValidator", null);
        setField(term890507, term890507.getClass(), "tracker", null);
        setField(term890507, term890507.getClass(), "oldErrorReporter", null);
        setField(term890507, term890507.getClass(), "defaultErrorReporter", null);
        setField(term890507, term890507.getClass(), "outStream", null);
        setField(term890507, term890507.getClass(), "globalRefMap", null);
        setDoubleField(term890507, term890507.getClass(), "progress", 0.0);
        setField(term890507, term890507.getClass(), "sanityCheck", null);
        setField(term890507, term890507.getClass(), "currentTracer", null);
        setField(term890507, term890507.getClass(), "currentPassName", null);
        setIntField(term890507, term890507.getClass(), "syntheticCodeId", 0);
        setField(term890507, term890507.getClass(), "recentChange", null);
        setField(term890507, term890507.getClass(), "codeChangeHandlers", null);
        setField(term890507, term890507.getClass(), "synthesizedExternsInput", null);
        setField(term890507, term890507.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternsInOrder", argTypes, term890507, args);
    }

};


