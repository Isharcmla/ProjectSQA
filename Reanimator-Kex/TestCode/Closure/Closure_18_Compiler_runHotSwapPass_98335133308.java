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

public class Compiler_runHotSwapPass_98335133308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997570;

    public Compiler_runHotSwapPass_98335133308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997570 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997570, term997570.getClass(), "options", null);
        setField(term997570, term997570.getClass(), "passes", null);
        setField(term997570, term997570.getClass(), "externs", null);
        setField(term997570, term997570.getClass(), "modules", null);
        setField(term997570, term997570.getClass(), "moduleGraph", null);
        setField(term997570, term997570.getClass(), "inputs", null);
        setField(term997570, term997570.getClass(), "errorManager", null);
        setField(term997570, term997570.getClass(), "warningsGuard", null);
        setField(term997570, term997570.getClass(), "injectedLibraries", null);
        setField(term997570, term997570.getClass(), "externsRoot", null);
        setField(term997570, term997570.getClass(), "jsRoot", null);
        setField(term997570, term997570.getClass(), "externAndJsRoot", null);
        setField(term997570, term997570.getClass(), "inputsById", null);
        setField(term997570, term997570.getClass(), "sourceMap", null);
        setField(term997570, term997570.getClass(), "externExports", null);
        setIntField(term997570, term997570.getClass(), "uniqueNameId", 0);
        setBooleanField(term997570, term997570.getClass(), "useThreads", false);
        setBooleanField(term997570, term997570.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997570, term997570.getClass(), "functionInformationMap", null);
        setField(term997570, term997570.getClass(), "debugLog", null);
        setField(term997570, term997570.getClass(), "defaultCodingConvention", null);
        setField(term997570, term997570.getClass(), "typeRegistry", null);
        setField(term997570, term997570.getClass(), "parserConfig", null);
        setField(term997570, term997570.getClass(), "abstractInterpreter", null);
        setField(term997570, term997570.getClass(), "typeValidator", null);
        setField(term997570, term997570.getClass(), "tracker", null);
        setField(term997570, term997570.getClass(), "oldErrorReporter", null);
        setField(term997570, term997570.getClass(), "defaultErrorReporter", null);
        setField(term997570, term997570.getClass(), "outStream", null);
        setField(term997570, term997570.getClass(), "globalRefMap", null);
        setDoubleField(term997570, term997570.getClass(), "progress", 0.0);
        setField(term997570, term997570.getClass(), "sanityCheck", null);
        setField(term997570, term997570.getClass(), "currentTracer", null);
        setField(term997570, term997570.getClass(), "currentPassName", null);
        setIntField(term997570, term997570.getClass(), "syntheticCodeId", 0);
        setField(term997570, term997570.getClass(), "recentChange", null);
        setField(term997570, term997570.getClass(), "codeChangeHandlers", null);
        setField(term997570, term997570.getClass(), "synthesizedExternsInput", null);
        setField(term997570, term997570.getClass(), "stage", null);
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
        callMethod(klass, "runHotSwapPass", argTypes, term997570, args);
    }

};


