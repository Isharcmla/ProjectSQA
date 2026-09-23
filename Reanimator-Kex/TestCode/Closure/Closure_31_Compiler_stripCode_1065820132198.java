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

public class Compiler_stripCode_1065820132198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889965;

    public Compiler_stripCode_1065820132198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889965 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889965, term889965.getClass(), "options", null);
        setField(term889965, term889965.getClass(), "passes", null);
        setField(term889965, term889965.getClass(), "externs", null);
        setField(term889965, term889965.getClass(), "modules", null);
        setField(term889965, term889965.getClass(), "moduleGraph", null);
        setField(term889965, term889965.getClass(), "inputs", null);
        setField(term889965, term889965.getClass(), "errorManager", null);
        setField(term889965, term889965.getClass(), "warningsGuard", null);
        setField(term889965, term889965.getClass(), "injectedLibraries", null);
        setField(term889965, term889965.getClass(), "externsRoot", null);
        setField(term889965, term889965.getClass(), "jsRoot", null);
        setField(term889965, term889965.getClass(), "externAndJsRoot", null);
        setField(term889965, term889965.getClass(), "inputsById", null);
        setField(term889965, term889965.getClass(), "sourceMap", null);
        setField(term889965, term889965.getClass(), "externExports", null);
        setIntField(term889965, term889965.getClass(), "uniqueNameId", 0);
        setBooleanField(term889965, term889965.getClass(), "useThreads", false);
        setBooleanField(term889965, term889965.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889965, term889965.getClass(), "functionInformationMap", null);
        setField(term889965, term889965.getClass(), "debugLog", null);
        setField(term889965, term889965.getClass(), "defaultCodingConvention", null);
        setField(term889965, term889965.getClass(), "typeRegistry", null);
        setField(term889965, term889965.getClass(), "parserConfig", null);
        setField(term889965, term889965.getClass(), "abstractInterpreter", null);
        setField(term889965, term889965.getClass(), "typeValidator", null);
        setField(term889965, term889965.getClass(), "tracker", null);
        setField(term889965, term889965.getClass(), "oldErrorReporter", null);
        setField(term889965, term889965.getClass(), "defaultErrorReporter", null);
        setField(term889965, term889965.getClass(), "outStream", null);
        setField(term889965, term889965.getClass(), "globalRefMap", null);
        setDoubleField(term889965, term889965.getClass(), "progress", 0.0);
        setField(term889965, term889965.getClass(), "sanityCheck", null);
        setField(term889965, term889965.getClass(), "currentTracer", null);
        setField(term889965, term889965.getClass(), "currentPassName", null);
        setIntField(term889965, term889965.getClass(), "syntheticCodeId", 0);
        setField(term889965, term889965.getClass(), "recentChange", null);
        setField(term889965, term889965.getClass(), "codeChangeHandlers", null);
        setField(term889965, term889965.getClass(), "synthesizedExternsInput", null);
        setField(term889965, term889965.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("java.util.Set");
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "stripCode", argTypes, term889965, args);
    }

};


