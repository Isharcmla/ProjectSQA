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

public class Compiler_toSource_508833582240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890217;

    public Compiler_toSource_508833582240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890217 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890217, term890217.getClass(), "options", null);
        setField(term890217, term890217.getClass(), "passes", null);
        setField(term890217, term890217.getClass(), "externs", null);
        setField(term890217, term890217.getClass(), "modules", null);
        setField(term890217, term890217.getClass(), "moduleGraph", null);
        setField(term890217, term890217.getClass(), "inputs", null);
        setField(term890217, term890217.getClass(), "errorManager", null);
        setField(term890217, term890217.getClass(), "warningsGuard", null);
        setField(term890217, term890217.getClass(), "injectedLibraries", null);
        setField(term890217, term890217.getClass(), "externsRoot", null);
        setField(term890217, term890217.getClass(), "jsRoot", null);
        setField(term890217, term890217.getClass(), "externAndJsRoot", null);
        setField(term890217, term890217.getClass(), "inputsById", null);
        setField(term890217, term890217.getClass(), "sourceMap", null);
        setField(term890217, term890217.getClass(), "externExports", null);
        setIntField(term890217, term890217.getClass(), "uniqueNameId", 0);
        setBooleanField(term890217, term890217.getClass(), "useThreads", false);
        setBooleanField(term890217, term890217.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890217, term890217.getClass(), "functionInformationMap", null);
        setField(term890217, term890217.getClass(), "debugLog", null);
        setField(term890217, term890217.getClass(), "defaultCodingConvention", null);
        setField(term890217, term890217.getClass(), "typeRegistry", null);
        setField(term890217, term890217.getClass(), "parserConfig", null);
        setField(term890217, term890217.getClass(), "abstractInterpreter", null);
        setField(term890217, term890217.getClass(), "typeValidator", null);
        setField(term890217, term890217.getClass(), "tracker", null);
        setField(term890217, term890217.getClass(), "oldErrorReporter", null);
        setField(term890217, term890217.getClass(), "defaultErrorReporter", null);
        setField(term890217, term890217.getClass(), "outStream", null);
        setField(term890217, term890217.getClass(), "globalRefMap", null);
        setDoubleField(term890217, term890217.getClass(), "progress", 0.0);
        setField(term890217, term890217.getClass(), "sanityCheck", null);
        setField(term890217, term890217.getClass(), "currentTracer", null);
        setField(term890217, term890217.getClass(), "currentPassName", null);
        setIntField(term890217, term890217.getClass(), "syntheticCodeId", 0);
        setField(term890217, term890217.getClass(), "recentChange", null);
        setField(term890217, term890217.getClass(), "codeChangeHandlers", null);
        setField(term890217, term890217.getClass(), "synthesizedExternsInput", null);
        setField(term890217, term890217.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSource", argTypes, term890217, args);
    }

};


