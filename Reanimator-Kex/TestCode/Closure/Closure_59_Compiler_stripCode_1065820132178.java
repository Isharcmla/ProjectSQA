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

public class Compiler_stripCode_1065820132178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854687;

    public Compiler_stripCode_1065820132178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854687 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854687, term854687.getClass(), "options", null);
        setField(term854687, term854687.getClass(), "passes", null);
        setField(term854687, term854687.getClass(), "externs", null);
        setField(term854687, term854687.getClass(), "modules", null);
        setField(term854687, term854687.getClass(), "moduleGraph", null);
        setField(term854687, term854687.getClass(), "inputs", null);
        setField(term854687, term854687.getClass(), "errorManager", null);
        setField(term854687, term854687.getClass(), "warningsGuard", null);
        setField(term854687, term854687.getClass(), "externsRoot", null);
        setField(term854687, term854687.getClass(), "jsRoot", null);
        setField(term854687, term854687.getClass(), "externAndJsRoot", null);
        setField(term854687, term854687.getClass(), "inputsByName", null);
        setField(term854687, term854687.getClass(), "sourceMap", null);
        setField(term854687, term854687.getClass(), "externExports", null);
        setIntField(term854687, term854687.getClass(), "uniqueNameId", 0);
        setBooleanField(term854687, term854687.getClass(), "useThreads", false);
        setBooleanField(term854687, term854687.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854687, term854687.getClass(), "functionInformationMap", null);
        setField(term854687, term854687.getClass(), "debugLog", null);
        setField(term854687, term854687.getClass(), "defaultCodingConvention", null);
        setField(term854687, term854687.getClass(), "typeRegistry", null);
        setField(term854687, term854687.getClass(), "parserConfig", null);
        setField(term854687, term854687.getClass(), "abstractInterpreter", null);
        setField(term854687, term854687.getClass(), "typeValidator", null);
        setField(term854687, term854687.getClass(), "tracker", null);
        setField(term854687, term854687.getClass(), "oldErrorReporter", null);
        setField(term854687, term854687.getClass(), "defaultErrorReporter", null);
        setField(term854687, term854687.getClass(), "outStream", null);
        setField(term854687, term854687.getClass(), "globalRefMap", null);
        setField(term854687, term854687.getClass(), "sanityCheck", null);
        setField(term854687, term854687.getClass(), "currentTracer", null);
        setField(term854687, term854687.getClass(), "currentPassName", null);
        setField(term854687, term854687.getClass(), "recentChange", null);
        setField(term854687, term854687.getClass(), "codeChangeHandlers", null);
        setField(term854687, term854687.getClass(), "stage", null);
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
        callMethod(klass, "stripCode", argTypes, term854687, args);
    }

};


