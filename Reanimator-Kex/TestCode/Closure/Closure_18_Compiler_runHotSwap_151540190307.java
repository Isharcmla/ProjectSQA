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

public class Compiler_runHotSwap_151540190307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997564;

    public Compiler_runHotSwap_151540190307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997564 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997564, term997564.getClass(), "options", null);
        setField(term997564, term997564.getClass(), "passes", null);
        setField(term997564, term997564.getClass(), "externs", null);
        setField(term997564, term997564.getClass(), "modules", null);
        setField(term997564, term997564.getClass(), "moduleGraph", null);
        setField(term997564, term997564.getClass(), "inputs", null);
        setField(term997564, term997564.getClass(), "errorManager", null);
        setField(term997564, term997564.getClass(), "warningsGuard", null);
        setField(term997564, term997564.getClass(), "injectedLibraries", null);
        setField(term997564, term997564.getClass(), "externsRoot", null);
        setField(term997564, term997564.getClass(), "jsRoot", null);
        setField(term997564, term997564.getClass(), "externAndJsRoot", null);
        setField(term997564, term997564.getClass(), "inputsById", null);
        setField(term997564, term997564.getClass(), "sourceMap", null);
        setField(term997564, term997564.getClass(), "externExports", null);
        setIntField(term997564, term997564.getClass(), "uniqueNameId", 0);
        setBooleanField(term997564, term997564.getClass(), "useThreads", false);
        setBooleanField(term997564, term997564.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997564, term997564.getClass(), "functionInformationMap", null);
        setField(term997564, term997564.getClass(), "debugLog", null);
        setField(term997564, term997564.getClass(), "defaultCodingConvention", null);
        setField(term997564, term997564.getClass(), "typeRegistry", null);
        setField(term997564, term997564.getClass(), "parserConfig", null);
        setField(term997564, term997564.getClass(), "abstractInterpreter", null);
        setField(term997564, term997564.getClass(), "typeValidator", null);
        setField(term997564, term997564.getClass(), "tracker", null);
        setField(term997564, term997564.getClass(), "oldErrorReporter", null);
        setField(term997564, term997564.getClass(), "defaultErrorReporter", null);
        setField(term997564, term997564.getClass(), "outStream", null);
        setField(term997564, term997564.getClass(), "globalRefMap", null);
        setDoubleField(term997564, term997564.getClass(), "progress", 0.0);
        setField(term997564, term997564.getClass(), "sanityCheck", null);
        setField(term997564, term997564.getClass(), "currentTracer", null);
        setField(term997564, term997564.getClass(), "currentPassName", null);
        setIntField(term997564, term997564.getClass(), "syntheticCodeId", 0);
        setField(term997564, term997564.getClass(), "recentChange", null);
        setField(term997564, term997564.getClass(), "codeChangeHandlers", null);
        setField(term997564, term997564.getClass(), "synthesizedExternsInput", null);
        setField(term997564, term997564.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.PassConfig");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "runHotSwap", argTypes, term997564, args);
    }

};


