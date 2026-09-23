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

public class Compiler_stripCode_1065820132173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896154;

    public Compiler_stripCode_1065820132173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896154 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896154, term896154.getClass(), "options", null);
        setField(term896154, term896154.getClass(), "passes", null);
        setField(term896154, term896154.getClass(), "externs", null);
        setField(term896154, term896154.getClass(), "modules", null);
        setField(term896154, term896154.getClass(), "moduleGraph", null);
        setField(term896154, term896154.getClass(), "inputs", null);
        setField(term896154, term896154.getClass(), "errorManager", null);
        setField(term896154, term896154.getClass(), "warningsGuard", null);
        setField(term896154, term896154.getClass(), "externsRoot", null);
        setField(term896154, term896154.getClass(), "jsRoot", null);
        setField(term896154, term896154.getClass(), "externAndJsRoot", null);
        setField(term896154, term896154.getClass(), "inputsByName", null);
        setField(term896154, term896154.getClass(), "sourceMap", null);
        setField(term896154, term896154.getClass(), "externExports", null);
        setIntField(term896154, term896154.getClass(), "uniqueNameId", 0);
        setBooleanField(term896154, term896154.getClass(), "useThreads", false);
        setBooleanField(term896154, term896154.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896154, term896154.getClass(), "functionInformationMap", null);
        setField(term896154, term896154.getClass(), "debugLog", null);
        setField(term896154, term896154.getClass(), "defaultCodingConvention", null);
        setField(term896154, term896154.getClass(), "typeRegistry", null);
        setField(term896154, term896154.getClass(), "parserConfig", null);
        setField(term896154, term896154.getClass(), "abstractInterpreter", null);
        setField(term896154, term896154.getClass(), "typeValidator", null);
        setField(term896154, term896154.getClass(), "tracker", null);
        setField(term896154, term896154.getClass(), "oldErrorReporter", null);
        setField(term896154, term896154.getClass(), "defaultErrorReporter", null);
        setField(term896154, term896154.getClass(), "outStream", null);
        setField(term896154, term896154.getClass(), "globalRefMap", null);
        setField(term896154, term896154.getClass(), "sanityCheck", null);
        setField(term896154, term896154.getClass(), "currentTracer", null);
        setField(term896154, term896154.getClass(), "currentPassName", null);
        setField(term896154, term896154.getClass(), "recentChange", null);
        setField(term896154, term896154.getClass(), "codeChangeHandlers", null);
        setField(term896154, term896154.getClass(), "stage", null);
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
        callMethod(klass, "stripCode", argTypes, term896154, args);
    }

};


