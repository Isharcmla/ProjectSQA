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

public class Compiler_parse_1080477925231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890163;

    public Compiler_parse_1080477925231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890163 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890163, term890163.getClass(), "options", null);
        setField(term890163, term890163.getClass(), "passes", null);
        setField(term890163, term890163.getClass(), "externs", null);
        setField(term890163, term890163.getClass(), "modules", null);
        setField(term890163, term890163.getClass(), "moduleGraph", null);
        setField(term890163, term890163.getClass(), "inputs", null);
        setField(term890163, term890163.getClass(), "errorManager", null);
        setField(term890163, term890163.getClass(), "warningsGuard", null);
        setField(term890163, term890163.getClass(), "injectedLibraries", null);
        setField(term890163, term890163.getClass(), "externsRoot", null);
        setField(term890163, term890163.getClass(), "jsRoot", null);
        setField(term890163, term890163.getClass(), "externAndJsRoot", null);
        setField(term890163, term890163.getClass(), "inputsById", null);
        setField(term890163, term890163.getClass(), "sourceMap", null);
        setField(term890163, term890163.getClass(), "externExports", null);
        setIntField(term890163, term890163.getClass(), "uniqueNameId", 0);
        setBooleanField(term890163, term890163.getClass(), "useThreads", false);
        setBooleanField(term890163, term890163.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890163, term890163.getClass(), "functionInformationMap", null);
        setField(term890163, term890163.getClass(), "debugLog", null);
        setField(term890163, term890163.getClass(), "defaultCodingConvention", null);
        setField(term890163, term890163.getClass(), "typeRegistry", null);
        setField(term890163, term890163.getClass(), "parserConfig", null);
        setField(term890163, term890163.getClass(), "abstractInterpreter", null);
        setField(term890163, term890163.getClass(), "typeValidator", null);
        setField(term890163, term890163.getClass(), "tracker", null);
        setField(term890163, term890163.getClass(), "oldErrorReporter", null);
        setField(term890163, term890163.getClass(), "defaultErrorReporter", null);
        setField(term890163, term890163.getClass(), "outStream", null);
        setField(term890163, term890163.getClass(), "globalRefMap", null);
        setDoubleField(term890163, term890163.getClass(), "progress", 0.0);
        setField(term890163, term890163.getClass(), "sanityCheck", null);
        setField(term890163, term890163.getClass(), "currentTracer", null);
        setField(term890163, term890163.getClass(), "currentPassName", null);
        setIntField(term890163, term890163.getClass(), "syntheticCodeId", 0);
        setField(term890163, term890163.getClass(), "recentChange", null);
        setField(term890163, term890163.getClass(), "codeChangeHandlers", null);
        setField(term890163, term890163.getClass(), "synthesizedExternsInput", null);
        setField(term890163, term890163.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parse", argTypes, term890163, args);
    }

};


