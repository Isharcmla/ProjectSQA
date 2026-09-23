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

public class Compiler_runHotSwapPass_98335133302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890599;

    public Compiler_runHotSwapPass_98335133302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890599 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890599, term890599.getClass(), "options", null);
        setField(term890599, term890599.getClass(), "passes", null);
        setField(term890599, term890599.getClass(), "externs", null);
        setField(term890599, term890599.getClass(), "modules", null);
        setField(term890599, term890599.getClass(), "moduleGraph", null);
        setField(term890599, term890599.getClass(), "inputs", null);
        setField(term890599, term890599.getClass(), "errorManager", null);
        setField(term890599, term890599.getClass(), "warningsGuard", null);
        setField(term890599, term890599.getClass(), "injectedLibraries", null);
        setField(term890599, term890599.getClass(), "externsRoot", null);
        setField(term890599, term890599.getClass(), "jsRoot", null);
        setField(term890599, term890599.getClass(), "externAndJsRoot", null);
        setField(term890599, term890599.getClass(), "inputsById", null);
        setField(term890599, term890599.getClass(), "sourceMap", null);
        setField(term890599, term890599.getClass(), "externExports", null);
        setIntField(term890599, term890599.getClass(), "uniqueNameId", 0);
        setBooleanField(term890599, term890599.getClass(), "useThreads", false);
        setBooleanField(term890599, term890599.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890599, term890599.getClass(), "functionInformationMap", null);
        setField(term890599, term890599.getClass(), "debugLog", null);
        setField(term890599, term890599.getClass(), "defaultCodingConvention", null);
        setField(term890599, term890599.getClass(), "typeRegistry", null);
        setField(term890599, term890599.getClass(), "parserConfig", null);
        setField(term890599, term890599.getClass(), "abstractInterpreter", null);
        setField(term890599, term890599.getClass(), "typeValidator", null);
        setField(term890599, term890599.getClass(), "tracker", null);
        setField(term890599, term890599.getClass(), "oldErrorReporter", null);
        setField(term890599, term890599.getClass(), "defaultErrorReporter", null);
        setField(term890599, term890599.getClass(), "outStream", null);
        setField(term890599, term890599.getClass(), "globalRefMap", null);
        setDoubleField(term890599, term890599.getClass(), "progress", 0.0);
        setField(term890599, term890599.getClass(), "sanityCheck", null);
        setField(term890599, term890599.getClass(), "currentTracer", null);
        setField(term890599, term890599.getClass(), "currentPassName", null);
        setIntField(term890599, term890599.getClass(), "syntheticCodeId", 0);
        setField(term890599, term890599.getClass(), "recentChange", null);
        setField(term890599, term890599.getClass(), "codeChangeHandlers", null);
        setField(term890599, term890599.getClass(), "synthesizedExternsInput", null);
        setField(term890599, term890599.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.PassFactory");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "runHotSwapPass", argTypes, term890599, args);
    }

};


