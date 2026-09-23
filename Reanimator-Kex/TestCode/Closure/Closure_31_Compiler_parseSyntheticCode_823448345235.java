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

public class Compiler_parseSyntheticCode_823448345235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890187;

    public Compiler_parseSyntheticCode_823448345235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890187 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890187, term890187.getClass(), "options", null);
        setField(term890187, term890187.getClass(), "passes", null);
        setField(term890187, term890187.getClass(), "externs", null);
        setField(term890187, term890187.getClass(), "modules", null);
        setField(term890187, term890187.getClass(), "moduleGraph", null);
        setField(term890187, term890187.getClass(), "inputs", null);
        setField(term890187, term890187.getClass(), "errorManager", null);
        setField(term890187, term890187.getClass(), "warningsGuard", null);
        setField(term890187, term890187.getClass(), "injectedLibraries", null);
        setField(term890187, term890187.getClass(), "externsRoot", null);
        setField(term890187, term890187.getClass(), "jsRoot", null);
        setField(term890187, term890187.getClass(), "externAndJsRoot", null);
        setField(term890187, term890187.getClass(), "inputsById", null);
        setField(term890187, term890187.getClass(), "sourceMap", null);
        setField(term890187, term890187.getClass(), "externExports", null);
        setIntField(term890187, term890187.getClass(), "uniqueNameId", 0);
        setBooleanField(term890187, term890187.getClass(), "useThreads", false);
        setBooleanField(term890187, term890187.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890187, term890187.getClass(), "functionInformationMap", null);
        setField(term890187, term890187.getClass(), "debugLog", null);
        setField(term890187, term890187.getClass(), "defaultCodingConvention", null);
        setField(term890187, term890187.getClass(), "typeRegistry", null);
        setField(term890187, term890187.getClass(), "parserConfig", null);
        setField(term890187, term890187.getClass(), "abstractInterpreter", null);
        setField(term890187, term890187.getClass(), "typeValidator", null);
        setField(term890187, term890187.getClass(), "tracker", null);
        setField(term890187, term890187.getClass(), "oldErrorReporter", null);
        setField(term890187, term890187.getClass(), "defaultErrorReporter", null);
        setField(term890187, term890187.getClass(), "outStream", null);
        setField(term890187, term890187.getClass(), "globalRefMap", null);
        setDoubleField(term890187, term890187.getClass(), "progress", 0.0);
        setField(term890187, term890187.getClass(), "sanityCheck", null);
        setField(term890187, term890187.getClass(), "currentTracer", null);
        setField(term890187, term890187.getClass(), "currentPassName", null);
        setIntField(term890187, term890187.getClass(), "syntheticCodeId", 0);
        setField(term890187, term890187.getClass(), "recentChange", null);
        setField(term890187, term890187.getClass(), "codeChangeHandlers", null);
        setField(term890187, term890187.getClass(), "synthesizedExternsInput", null);
        setField(term890187, term890187.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "parseSyntheticCode", argTypes, term890187, args);
    }

};


