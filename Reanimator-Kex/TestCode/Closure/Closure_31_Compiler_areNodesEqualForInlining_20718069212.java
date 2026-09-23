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

public class Compiler_areNodesEqualForInlining_20718069212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890049;

    public Compiler_areNodesEqualForInlining_20718069212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890049 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890049, term890049.getClass(), "options", null);
        setField(term890049, term890049.getClass(), "passes", null);
        setField(term890049, term890049.getClass(), "externs", null);
        setField(term890049, term890049.getClass(), "modules", null);
        setField(term890049, term890049.getClass(), "moduleGraph", null);
        setField(term890049, term890049.getClass(), "inputs", null);
        setField(term890049, term890049.getClass(), "errorManager", null);
        setField(term890049, term890049.getClass(), "warningsGuard", null);
        setField(term890049, term890049.getClass(), "injectedLibraries", null);
        setField(term890049, term890049.getClass(), "externsRoot", null);
        setField(term890049, term890049.getClass(), "jsRoot", null);
        setField(term890049, term890049.getClass(), "externAndJsRoot", null);
        setField(term890049, term890049.getClass(), "inputsById", null);
        setField(term890049, term890049.getClass(), "sourceMap", null);
        setField(term890049, term890049.getClass(), "externExports", null);
        setIntField(term890049, term890049.getClass(), "uniqueNameId", 0);
        setBooleanField(term890049, term890049.getClass(), "useThreads", false);
        setBooleanField(term890049, term890049.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890049, term890049.getClass(), "functionInformationMap", null);
        setField(term890049, term890049.getClass(), "debugLog", null);
        setField(term890049, term890049.getClass(), "defaultCodingConvention", null);
        setField(term890049, term890049.getClass(), "typeRegistry", null);
        setField(term890049, term890049.getClass(), "parserConfig", null);
        setField(term890049, term890049.getClass(), "abstractInterpreter", null);
        setField(term890049, term890049.getClass(), "typeValidator", null);
        setField(term890049, term890049.getClass(), "tracker", null);
        setField(term890049, term890049.getClass(), "oldErrorReporter", null);
        setField(term890049, term890049.getClass(), "defaultErrorReporter", null);
        setField(term890049, term890049.getClass(), "outStream", null);
        setField(term890049, term890049.getClass(), "globalRefMap", null);
        setDoubleField(term890049, term890049.getClass(), "progress", 0.0);
        setField(term890049, term890049.getClass(), "sanityCheck", null);
        setField(term890049, term890049.getClass(), "currentTracer", null);
        setField(term890049, term890049.getClass(), "currentPassName", null);
        setIntField(term890049, term890049.getClass(), "syntheticCodeId", 0);
        setField(term890049, term890049.getClass(), "recentChange", null);
        setField(term890049, term890049.getClass(), "codeChangeHandlers", null);
        setField(term890049, term890049.getClass(), "synthesizedExternsInput", null);
        setField(term890049, term890049.getClass(), "stage", null);
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
        callMethod(klass, "areNodesEqualForInlining", argTypes, term890049, args);
    }

};


