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

public class Compiler_addNewScript_1275096711299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890581;

    public Compiler_addNewScript_1275096711299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890581 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890581, term890581.getClass(), "options", null);
        setField(term890581, term890581.getClass(), "passes", null);
        setField(term890581, term890581.getClass(), "externs", null);
        setField(term890581, term890581.getClass(), "modules", null);
        setField(term890581, term890581.getClass(), "moduleGraph", null);
        setField(term890581, term890581.getClass(), "inputs", null);
        setField(term890581, term890581.getClass(), "errorManager", null);
        setField(term890581, term890581.getClass(), "warningsGuard", null);
        setField(term890581, term890581.getClass(), "injectedLibraries", null);
        setField(term890581, term890581.getClass(), "externsRoot", null);
        setField(term890581, term890581.getClass(), "jsRoot", null);
        setField(term890581, term890581.getClass(), "externAndJsRoot", null);
        setField(term890581, term890581.getClass(), "inputsById", null);
        setField(term890581, term890581.getClass(), "sourceMap", null);
        setField(term890581, term890581.getClass(), "externExports", null);
        setIntField(term890581, term890581.getClass(), "uniqueNameId", 0);
        setBooleanField(term890581, term890581.getClass(), "useThreads", false);
        setBooleanField(term890581, term890581.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890581, term890581.getClass(), "functionInformationMap", null);
        setField(term890581, term890581.getClass(), "debugLog", null);
        setField(term890581, term890581.getClass(), "defaultCodingConvention", null);
        setField(term890581, term890581.getClass(), "typeRegistry", null);
        setField(term890581, term890581.getClass(), "parserConfig", null);
        setField(term890581, term890581.getClass(), "abstractInterpreter", null);
        setField(term890581, term890581.getClass(), "typeValidator", null);
        setField(term890581, term890581.getClass(), "tracker", null);
        setField(term890581, term890581.getClass(), "oldErrorReporter", null);
        setField(term890581, term890581.getClass(), "defaultErrorReporter", null);
        setField(term890581, term890581.getClass(), "outStream", null);
        setField(term890581, term890581.getClass(), "globalRefMap", null);
        setDoubleField(term890581, term890581.getClass(), "progress", 0.0);
        setField(term890581, term890581.getClass(), "sanityCheck", null);
        setField(term890581, term890581.getClass(), "currentTracer", null);
        setField(term890581, term890581.getClass(), "currentPassName", null);
        setIntField(term890581, term890581.getClass(), "syntheticCodeId", 0);
        setField(term890581, term890581.getClass(), "recentChange", null);
        setField(term890581, term890581.getClass(), "codeChangeHandlers", null);
        setField(term890581, term890581.getClass(), "synthesizedExternsInput", null);
        setField(term890581, term890581.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addNewScript", argTypes, term890581, args);
    }

};


