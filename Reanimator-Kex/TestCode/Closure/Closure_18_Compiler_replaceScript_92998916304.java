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

public class Compiler_replaceScript_92998916304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997546;

    public Compiler_replaceScript_92998916304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997546 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997546, term997546.getClass(), "options", null);
        setField(term997546, term997546.getClass(), "passes", null);
        setField(term997546, term997546.getClass(), "externs", null);
        setField(term997546, term997546.getClass(), "modules", null);
        setField(term997546, term997546.getClass(), "moduleGraph", null);
        setField(term997546, term997546.getClass(), "inputs", null);
        setField(term997546, term997546.getClass(), "errorManager", null);
        setField(term997546, term997546.getClass(), "warningsGuard", null);
        setField(term997546, term997546.getClass(), "injectedLibraries", null);
        setField(term997546, term997546.getClass(), "externsRoot", null);
        setField(term997546, term997546.getClass(), "jsRoot", null);
        setField(term997546, term997546.getClass(), "externAndJsRoot", null);
        setField(term997546, term997546.getClass(), "inputsById", null);
        setField(term997546, term997546.getClass(), "sourceMap", null);
        setField(term997546, term997546.getClass(), "externExports", null);
        setIntField(term997546, term997546.getClass(), "uniqueNameId", 0);
        setBooleanField(term997546, term997546.getClass(), "useThreads", false);
        setBooleanField(term997546, term997546.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997546, term997546.getClass(), "functionInformationMap", null);
        setField(term997546, term997546.getClass(), "debugLog", null);
        setField(term997546, term997546.getClass(), "defaultCodingConvention", null);
        setField(term997546, term997546.getClass(), "typeRegistry", null);
        setField(term997546, term997546.getClass(), "parserConfig", null);
        setField(term997546, term997546.getClass(), "abstractInterpreter", null);
        setField(term997546, term997546.getClass(), "typeValidator", null);
        setField(term997546, term997546.getClass(), "tracker", null);
        setField(term997546, term997546.getClass(), "oldErrorReporter", null);
        setField(term997546, term997546.getClass(), "defaultErrorReporter", null);
        setField(term997546, term997546.getClass(), "outStream", null);
        setField(term997546, term997546.getClass(), "globalRefMap", null);
        setDoubleField(term997546, term997546.getClass(), "progress", 0.0);
        setField(term997546, term997546.getClass(), "sanityCheck", null);
        setField(term997546, term997546.getClass(), "currentTracer", null);
        setField(term997546, term997546.getClass(), "currentPassName", null);
        setIntField(term997546, term997546.getClass(), "syntheticCodeId", 0);
        setField(term997546, term997546.getClass(), "recentChange", null);
        setField(term997546, term997546.getClass(), "codeChangeHandlers", null);
        setField(term997546, term997546.getClass(), "synthesizedExternsInput", null);
        setField(term997546, term997546.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "replaceScript", argTypes, term997546, args);
    }

};


