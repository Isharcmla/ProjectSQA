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

public class Compiler_stripCode_1065820132200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996910;

    public Compiler_stripCode_1065820132200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996910 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996910, term996910.getClass(), "options", null);
        setField(term996910, term996910.getClass(), "passes", null);
        setField(term996910, term996910.getClass(), "externs", null);
        setField(term996910, term996910.getClass(), "modules", null);
        setField(term996910, term996910.getClass(), "moduleGraph", null);
        setField(term996910, term996910.getClass(), "inputs", null);
        setField(term996910, term996910.getClass(), "errorManager", null);
        setField(term996910, term996910.getClass(), "warningsGuard", null);
        setField(term996910, term996910.getClass(), "injectedLibraries", null);
        setField(term996910, term996910.getClass(), "externsRoot", null);
        setField(term996910, term996910.getClass(), "jsRoot", null);
        setField(term996910, term996910.getClass(), "externAndJsRoot", null);
        setField(term996910, term996910.getClass(), "inputsById", null);
        setField(term996910, term996910.getClass(), "sourceMap", null);
        setField(term996910, term996910.getClass(), "externExports", null);
        setIntField(term996910, term996910.getClass(), "uniqueNameId", 0);
        setBooleanField(term996910, term996910.getClass(), "useThreads", false);
        setBooleanField(term996910, term996910.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996910, term996910.getClass(), "functionInformationMap", null);
        setField(term996910, term996910.getClass(), "debugLog", null);
        setField(term996910, term996910.getClass(), "defaultCodingConvention", null);
        setField(term996910, term996910.getClass(), "typeRegistry", null);
        setField(term996910, term996910.getClass(), "parserConfig", null);
        setField(term996910, term996910.getClass(), "abstractInterpreter", null);
        setField(term996910, term996910.getClass(), "typeValidator", null);
        setField(term996910, term996910.getClass(), "tracker", null);
        setField(term996910, term996910.getClass(), "oldErrorReporter", null);
        setField(term996910, term996910.getClass(), "defaultErrorReporter", null);
        setField(term996910, term996910.getClass(), "outStream", null);
        setField(term996910, term996910.getClass(), "globalRefMap", null);
        setDoubleField(term996910, term996910.getClass(), "progress", 0.0);
        setField(term996910, term996910.getClass(), "sanityCheck", null);
        setField(term996910, term996910.getClass(), "currentTracer", null);
        setField(term996910, term996910.getClass(), "currentPassName", null);
        setIntField(term996910, term996910.getClass(), "syntheticCodeId", 0);
        setField(term996910, term996910.getClass(), "recentChange", null);
        setField(term996910, term996910.getClass(), "codeChangeHandlers", null);
        setField(term996910, term996910.getClass(), "synthesizedExternsInput", null);
        setField(term996910, term996910.getClass(), "stage", null);
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
        callMethod(klass, "stripCode", argTypes, term996910, args);
    }

};


