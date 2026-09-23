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

public class Compiler_parseSyntheticCode_1248327862205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977888;

    public Compiler_parseSyntheticCode_1248327862205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977888 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977888, term977888.getClass(), "options", null);
        setField(term977888, term977888.getClass(), "passes", null);
        setField(term977888, term977888.getClass(), "externs", null);
        setField(term977888, term977888.getClass(), "modules", null);
        setField(term977888, term977888.getClass(), "moduleGraph", null);
        setField(term977888, term977888.getClass(), "inputs", null);
        setField(term977888, term977888.getClass(), "errorManager", null);
        setField(term977888, term977888.getClass(), "warningsGuard", null);
        setField(term977888, term977888.getClass(), "externsRoot", null);
        setField(term977888, term977888.getClass(), "jsRoot", null);
        setField(term977888, term977888.getClass(), "externAndJsRoot", null);
        setField(term977888, term977888.getClass(), "inputsByName", null);
        setField(term977888, term977888.getClass(), "sourceMap", null);
        setField(term977888, term977888.getClass(), "externExports", null);
        setIntField(term977888, term977888.getClass(), "uniqueNameId", 0);
        setBooleanField(term977888, term977888.getClass(), "useThreads", false);
        setBooleanField(term977888, term977888.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977888, term977888.getClass(), "functionInformationMap", null);
        setField(term977888, term977888.getClass(), "debugLog", null);
        setField(term977888, term977888.getClass(), "defaultCodingConvention", null);
        setField(term977888, term977888.getClass(), "typeRegistry", null);
        setField(term977888, term977888.getClass(), "parserConfig", null);
        setField(term977888, term977888.getClass(), "abstractInterpreter", null);
        setField(term977888, term977888.getClass(), "typeValidator", null);
        setField(term977888, term977888.getClass(), "tracker", null);
        setField(term977888, term977888.getClass(), "oldErrorReporter", null);
        setField(term977888, term977888.getClass(), "defaultErrorReporter", null);
        setField(term977888, term977888.getClass(), "outStream", null);
        setField(term977888, term977888.getClass(), "globalRefMap", null);
        setField(term977888, term977888.getClass(), "sanityCheck", null);
        setField(term977888, term977888.getClass(), "currentTracer", null);
        setField(term977888, term977888.getClass(), "currentPassName", null);
        setField(term977888, term977888.getClass(), "recentChange", null);
        setField(term977888, term977888.getClass(), "codeChangeHandlers", null);
        setField(term977888, term977888.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseSyntheticCode", argTypes, term977888, args);
    }

};


