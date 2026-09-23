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

public class Compiler_runHotSwap_151540190301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890593;

    public Compiler_runHotSwap_151540190301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890593 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890593, term890593.getClass(), "options", null);
        setField(term890593, term890593.getClass(), "passes", null);
        setField(term890593, term890593.getClass(), "externs", null);
        setField(term890593, term890593.getClass(), "modules", null);
        setField(term890593, term890593.getClass(), "moduleGraph", null);
        setField(term890593, term890593.getClass(), "inputs", null);
        setField(term890593, term890593.getClass(), "errorManager", null);
        setField(term890593, term890593.getClass(), "warningsGuard", null);
        setField(term890593, term890593.getClass(), "injectedLibraries", null);
        setField(term890593, term890593.getClass(), "externsRoot", null);
        setField(term890593, term890593.getClass(), "jsRoot", null);
        setField(term890593, term890593.getClass(), "externAndJsRoot", null);
        setField(term890593, term890593.getClass(), "inputsById", null);
        setField(term890593, term890593.getClass(), "sourceMap", null);
        setField(term890593, term890593.getClass(), "externExports", null);
        setIntField(term890593, term890593.getClass(), "uniqueNameId", 0);
        setBooleanField(term890593, term890593.getClass(), "useThreads", false);
        setBooleanField(term890593, term890593.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890593, term890593.getClass(), "functionInformationMap", null);
        setField(term890593, term890593.getClass(), "debugLog", null);
        setField(term890593, term890593.getClass(), "defaultCodingConvention", null);
        setField(term890593, term890593.getClass(), "typeRegistry", null);
        setField(term890593, term890593.getClass(), "parserConfig", null);
        setField(term890593, term890593.getClass(), "abstractInterpreter", null);
        setField(term890593, term890593.getClass(), "typeValidator", null);
        setField(term890593, term890593.getClass(), "tracker", null);
        setField(term890593, term890593.getClass(), "oldErrorReporter", null);
        setField(term890593, term890593.getClass(), "defaultErrorReporter", null);
        setField(term890593, term890593.getClass(), "outStream", null);
        setField(term890593, term890593.getClass(), "globalRefMap", null);
        setDoubleField(term890593, term890593.getClass(), "progress", 0.0);
        setField(term890593, term890593.getClass(), "sanityCheck", null);
        setField(term890593, term890593.getClass(), "currentTracer", null);
        setField(term890593, term890593.getClass(), "currentPassName", null);
        setIntField(term890593, term890593.getClass(), "syntheticCodeId", 0);
        setField(term890593, term890593.getClass(), "recentChange", null);
        setField(term890593, term890593.getClass(), "codeChangeHandlers", null);
        setField(term890593, term890593.getClass(), "synthesizedExternsInput", null);
        setField(term890593, term890593.getClass(), "stage", null);
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
        callMethod(klass, "runHotSwap", argTypes, term890593, args);
    }

};


