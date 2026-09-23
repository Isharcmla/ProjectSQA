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

public class Compiler_processNewScript_542828984300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890587;

    public Compiler_processNewScript_542828984300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890587 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890587, term890587.getClass(), "options", null);
        setField(term890587, term890587.getClass(), "passes", null);
        setField(term890587, term890587.getClass(), "externs", null);
        setField(term890587, term890587.getClass(), "modules", null);
        setField(term890587, term890587.getClass(), "moduleGraph", null);
        setField(term890587, term890587.getClass(), "inputs", null);
        setField(term890587, term890587.getClass(), "errorManager", null);
        setField(term890587, term890587.getClass(), "warningsGuard", null);
        setField(term890587, term890587.getClass(), "injectedLibraries", null);
        setField(term890587, term890587.getClass(), "externsRoot", null);
        setField(term890587, term890587.getClass(), "jsRoot", null);
        setField(term890587, term890587.getClass(), "externAndJsRoot", null);
        setField(term890587, term890587.getClass(), "inputsById", null);
        setField(term890587, term890587.getClass(), "sourceMap", null);
        setField(term890587, term890587.getClass(), "externExports", null);
        setIntField(term890587, term890587.getClass(), "uniqueNameId", 0);
        setBooleanField(term890587, term890587.getClass(), "useThreads", false);
        setBooleanField(term890587, term890587.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890587, term890587.getClass(), "functionInformationMap", null);
        setField(term890587, term890587.getClass(), "debugLog", null);
        setField(term890587, term890587.getClass(), "defaultCodingConvention", null);
        setField(term890587, term890587.getClass(), "typeRegistry", null);
        setField(term890587, term890587.getClass(), "parserConfig", null);
        setField(term890587, term890587.getClass(), "abstractInterpreter", null);
        setField(term890587, term890587.getClass(), "typeValidator", null);
        setField(term890587, term890587.getClass(), "tracker", null);
        setField(term890587, term890587.getClass(), "oldErrorReporter", null);
        setField(term890587, term890587.getClass(), "defaultErrorReporter", null);
        setField(term890587, term890587.getClass(), "outStream", null);
        setField(term890587, term890587.getClass(), "globalRefMap", null);
        setDoubleField(term890587, term890587.getClass(), "progress", 0.0);
        setField(term890587, term890587.getClass(), "sanityCheck", null);
        setField(term890587, term890587.getClass(), "currentTracer", null);
        setField(term890587, term890587.getClass(), "currentPassName", null);
        setIntField(term890587, term890587.getClass(), "syntheticCodeId", 0);
        setField(term890587, term890587.getClass(), "recentChange", null);
        setField(term890587, term890587.getClass(), "codeChangeHandlers", null);
        setField(term890587, term890587.getClass(), "synthesizedExternsInput", null);
        setField(term890587, term890587.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "processNewScript", argTypes, term890587, args);
    }

};


