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

public class Compiler_getCssRenamingMap_133087986247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890263;

    public Compiler_getCssRenamingMap_133087986247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890263 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890263, term890263.getClass(), "options", null);
        setField(term890263, term890263.getClass(), "passes", null);
        setField(term890263, term890263.getClass(), "externs", null);
        setField(term890263, term890263.getClass(), "modules", null);
        setField(term890263, term890263.getClass(), "moduleGraph", null);
        setField(term890263, term890263.getClass(), "inputs", null);
        setField(term890263, term890263.getClass(), "errorManager", null);
        setField(term890263, term890263.getClass(), "warningsGuard", null);
        setField(term890263, term890263.getClass(), "injectedLibraries", null);
        setField(term890263, term890263.getClass(), "externsRoot", null);
        setField(term890263, term890263.getClass(), "jsRoot", null);
        setField(term890263, term890263.getClass(), "externAndJsRoot", null);
        setField(term890263, term890263.getClass(), "inputsById", null);
        setField(term890263, term890263.getClass(), "sourceMap", null);
        setField(term890263, term890263.getClass(), "externExports", null);
        setIntField(term890263, term890263.getClass(), "uniqueNameId", 0);
        setBooleanField(term890263, term890263.getClass(), "useThreads", false);
        setBooleanField(term890263, term890263.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890263, term890263.getClass(), "functionInformationMap", null);
        setField(term890263, term890263.getClass(), "debugLog", null);
        setField(term890263, term890263.getClass(), "defaultCodingConvention", null);
        setField(term890263, term890263.getClass(), "typeRegistry", null);
        setField(term890263, term890263.getClass(), "parserConfig", null);
        setField(term890263, term890263.getClass(), "abstractInterpreter", null);
        setField(term890263, term890263.getClass(), "typeValidator", null);
        setField(term890263, term890263.getClass(), "tracker", null);
        setField(term890263, term890263.getClass(), "oldErrorReporter", null);
        setField(term890263, term890263.getClass(), "defaultErrorReporter", null);
        setField(term890263, term890263.getClass(), "outStream", null);
        setField(term890263, term890263.getClass(), "globalRefMap", null);
        setDoubleField(term890263, term890263.getClass(), "progress", 0.0);
        setField(term890263, term890263.getClass(), "sanityCheck", null);
        setField(term890263, term890263.getClass(), "currentTracer", null);
        setField(term890263, term890263.getClass(), "currentPassName", null);
        setIntField(term890263, term890263.getClass(), "syntheticCodeId", 0);
        setField(term890263, term890263.getClass(), "recentChange", null);
        setField(term890263, term890263.getClass(), "codeChangeHandlers", null);
        setField(term890263, term890263.getClass(), "synthesizedExternsInput", null);
        setField(term890263, term890263.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCssRenamingMap", argTypes, term890263, args);
    }

};


