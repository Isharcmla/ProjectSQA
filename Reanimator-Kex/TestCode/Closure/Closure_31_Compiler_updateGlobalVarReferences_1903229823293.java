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

public class Compiler_updateGlobalVarReferences_1903229823293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890543;

    public Compiler_updateGlobalVarReferences_1903229823293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890543 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890543, term890543.getClass(), "options", null);
        setField(term890543, term890543.getClass(), "passes", null);
        setField(term890543, term890543.getClass(), "externs", null);
        setField(term890543, term890543.getClass(), "modules", null);
        setField(term890543, term890543.getClass(), "moduleGraph", null);
        setField(term890543, term890543.getClass(), "inputs", null);
        setField(term890543, term890543.getClass(), "errorManager", null);
        setField(term890543, term890543.getClass(), "warningsGuard", null);
        setField(term890543, term890543.getClass(), "injectedLibraries", null);
        setField(term890543, term890543.getClass(), "externsRoot", null);
        setField(term890543, term890543.getClass(), "jsRoot", null);
        setField(term890543, term890543.getClass(), "externAndJsRoot", null);
        setField(term890543, term890543.getClass(), "inputsById", null);
        setField(term890543, term890543.getClass(), "sourceMap", null);
        setField(term890543, term890543.getClass(), "externExports", null);
        setIntField(term890543, term890543.getClass(), "uniqueNameId", 0);
        setBooleanField(term890543, term890543.getClass(), "useThreads", false);
        setBooleanField(term890543, term890543.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890543, term890543.getClass(), "functionInformationMap", null);
        setField(term890543, term890543.getClass(), "debugLog", null);
        setField(term890543, term890543.getClass(), "defaultCodingConvention", null);
        setField(term890543, term890543.getClass(), "typeRegistry", null);
        setField(term890543, term890543.getClass(), "parserConfig", null);
        setField(term890543, term890543.getClass(), "abstractInterpreter", null);
        setField(term890543, term890543.getClass(), "typeValidator", null);
        setField(term890543, term890543.getClass(), "tracker", null);
        setField(term890543, term890543.getClass(), "oldErrorReporter", null);
        setField(term890543, term890543.getClass(), "defaultErrorReporter", null);
        setField(term890543, term890543.getClass(), "outStream", null);
        setField(term890543, term890543.getClass(), "globalRefMap", null);
        setDoubleField(term890543, term890543.getClass(), "progress", 0.0);
        setField(term890543, term890543.getClass(), "sanityCheck", null);
        setField(term890543, term890543.getClass(), "currentTracer", null);
        setField(term890543, term890543.getClass(), "currentPassName", null);
        setIntField(term890543, term890543.getClass(), "syntheticCodeId", 0);
        setField(term890543, term890543.getClass(), "recentChange", null);
        setField(term890543, term890543.getClass(), "codeChangeHandlers", null);
        setField(term890543, term890543.getClass(), "synthesizedExternsInput", null);
        setField(term890543, term890543.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "updateGlobalVarReferences", argTypes, term890543, args);
    }

};


