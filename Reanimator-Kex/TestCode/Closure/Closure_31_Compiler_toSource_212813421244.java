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
import java.lang.Boolean;

public class Compiler_toSource_212813421244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890243;
     Object term890249;

    public Compiler_toSource_212813421244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890243 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890243, term890243.getClass(), "options", null);
        setField(term890243, term890243.getClass(), "passes", null);
        setField(term890243, term890243.getClass(), "externs", null);
        setField(term890243, term890243.getClass(), "modules", null);
        setField(term890243, term890243.getClass(), "moduleGraph", null);
        setField(term890243, term890243.getClass(), "inputs", null);
        setField(term890243, term890243.getClass(), "errorManager", null);
        setField(term890243, term890243.getClass(), "warningsGuard", null);
        setField(term890243, term890243.getClass(), "injectedLibraries", null);
        setField(term890243, term890243.getClass(), "externsRoot", null);
        setField(term890243, term890243.getClass(), "jsRoot", null);
        setField(term890243, term890243.getClass(), "externAndJsRoot", null);
        setField(term890243, term890243.getClass(), "inputsById", null);
        setField(term890243, term890243.getClass(), "sourceMap", null);
        setField(term890243, term890243.getClass(), "externExports", null);
        setIntField(term890243, term890243.getClass(), "uniqueNameId", 0);
        setBooleanField(term890243, term890243.getClass(), "useThreads", false);
        setBooleanField(term890243, term890243.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890243, term890243.getClass(), "functionInformationMap", null);
        setField(term890243, term890243.getClass(), "debugLog", null);
        setField(term890243, term890243.getClass(), "defaultCodingConvention", null);
        setField(term890243, term890243.getClass(), "typeRegistry", null);
        setField(term890243, term890243.getClass(), "parserConfig", null);
        setField(term890243, term890243.getClass(), "abstractInterpreter", null);
        setField(term890243, term890243.getClass(), "typeValidator", null);
        setField(term890243, term890243.getClass(), "tracker", null);
        setField(term890243, term890243.getClass(), "oldErrorReporter", null);
        setField(term890243, term890243.getClass(), "defaultErrorReporter", null);
        setField(term890243, term890243.getClass(), "outStream", null);
        setField(term890243, term890243.getClass(), "globalRefMap", null);
        setDoubleField(term890243, term890243.getClass(), "progress", 0.0);
        setField(term890243, term890243.getClass(), "sanityCheck", null);
        setField(term890243, term890243.getClass(), "currentTracer", null);
        setField(term890243, term890243.getClass(), "currentPassName", null);
        setIntField(term890243, term890243.getClass(), "syntheticCodeId", 0);
        setField(term890243, term890243.getClass(), "recentChange", null);
        setField(term890243, term890243.getClass(), "codeChangeHandlers", null);
        setField(term890243, term890243.getClass(), "synthesizedExternsInput", null);
        setField(term890243, term890243.getClass(), "stage", null);
        term890249 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.SourceMap");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term890249;
        callMethod(klass, "toSource", argTypes, term890243, args);
    }

};


