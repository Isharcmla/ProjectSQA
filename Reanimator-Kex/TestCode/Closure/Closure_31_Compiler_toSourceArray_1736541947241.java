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

public class Compiler_toSourceArray_1736541947241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890223;

    public Compiler_toSourceArray_1736541947241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890223 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890223, term890223.getClass(), "options", null);
        setField(term890223, term890223.getClass(), "passes", null);
        setField(term890223, term890223.getClass(), "externs", null);
        setField(term890223, term890223.getClass(), "modules", null);
        setField(term890223, term890223.getClass(), "moduleGraph", null);
        setField(term890223, term890223.getClass(), "inputs", null);
        setField(term890223, term890223.getClass(), "errorManager", null);
        setField(term890223, term890223.getClass(), "warningsGuard", null);
        setField(term890223, term890223.getClass(), "injectedLibraries", null);
        setField(term890223, term890223.getClass(), "externsRoot", null);
        setField(term890223, term890223.getClass(), "jsRoot", null);
        setField(term890223, term890223.getClass(), "externAndJsRoot", null);
        setField(term890223, term890223.getClass(), "inputsById", null);
        setField(term890223, term890223.getClass(), "sourceMap", null);
        setField(term890223, term890223.getClass(), "externExports", null);
        setIntField(term890223, term890223.getClass(), "uniqueNameId", 0);
        setBooleanField(term890223, term890223.getClass(), "useThreads", false);
        setBooleanField(term890223, term890223.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890223, term890223.getClass(), "functionInformationMap", null);
        setField(term890223, term890223.getClass(), "debugLog", null);
        setField(term890223, term890223.getClass(), "defaultCodingConvention", null);
        setField(term890223, term890223.getClass(), "typeRegistry", null);
        setField(term890223, term890223.getClass(), "parserConfig", null);
        setField(term890223, term890223.getClass(), "abstractInterpreter", null);
        setField(term890223, term890223.getClass(), "typeValidator", null);
        setField(term890223, term890223.getClass(), "tracker", null);
        setField(term890223, term890223.getClass(), "oldErrorReporter", null);
        setField(term890223, term890223.getClass(), "defaultErrorReporter", null);
        setField(term890223, term890223.getClass(), "outStream", null);
        setField(term890223, term890223.getClass(), "globalRefMap", null);
        setDoubleField(term890223, term890223.getClass(), "progress", 0.0);
        setField(term890223, term890223.getClass(), "sanityCheck", null);
        setField(term890223, term890223.getClass(), "currentTracer", null);
        setField(term890223, term890223.getClass(), "currentPassName", null);
        setIntField(term890223, term890223.getClass(), "syntheticCodeId", 0);
        setField(term890223, term890223.getClass(), "recentChange", null);
        setField(term890223, term890223.getClass(), "codeChangeHandlers", null);
        setField(term890223, term890223.getClass(), "synthesizedExternsInput", null);
        setField(term890223, term890223.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSourceArray", argTypes, term890223, args);
    }

};


