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

public class Compiler_parseSyntheticCode_823448345203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896274;

    public Compiler_parseSyntheticCode_823448345203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896274 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896274, term896274.getClass(), "options", null);
        setField(term896274, term896274.getClass(), "passes", null);
        setField(term896274, term896274.getClass(), "externs", null);
        setField(term896274, term896274.getClass(), "modules", null);
        setField(term896274, term896274.getClass(), "moduleGraph", null);
        setField(term896274, term896274.getClass(), "inputs", null);
        setField(term896274, term896274.getClass(), "errorManager", null);
        setField(term896274, term896274.getClass(), "warningsGuard", null);
        setField(term896274, term896274.getClass(), "externsRoot", null);
        setField(term896274, term896274.getClass(), "jsRoot", null);
        setField(term896274, term896274.getClass(), "externAndJsRoot", null);
        setField(term896274, term896274.getClass(), "inputsByName", null);
        setField(term896274, term896274.getClass(), "sourceMap", null);
        setField(term896274, term896274.getClass(), "externExports", null);
        setIntField(term896274, term896274.getClass(), "uniqueNameId", 0);
        setBooleanField(term896274, term896274.getClass(), "useThreads", false);
        setBooleanField(term896274, term896274.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896274, term896274.getClass(), "functionInformationMap", null);
        setField(term896274, term896274.getClass(), "debugLog", null);
        setField(term896274, term896274.getClass(), "defaultCodingConvention", null);
        setField(term896274, term896274.getClass(), "typeRegistry", null);
        setField(term896274, term896274.getClass(), "parserConfig", null);
        setField(term896274, term896274.getClass(), "abstractInterpreter", null);
        setField(term896274, term896274.getClass(), "typeValidator", null);
        setField(term896274, term896274.getClass(), "tracker", null);
        setField(term896274, term896274.getClass(), "oldErrorReporter", null);
        setField(term896274, term896274.getClass(), "defaultErrorReporter", null);
        setField(term896274, term896274.getClass(), "outStream", null);
        setField(term896274, term896274.getClass(), "globalRefMap", null);
        setField(term896274, term896274.getClass(), "sanityCheck", null);
        setField(term896274, term896274.getClass(), "currentTracer", null);
        setField(term896274, term896274.getClass(), "currentPassName", null);
        setField(term896274, term896274.getClass(), "recentChange", null);
        setField(term896274, term896274.getClass(), "codeChangeHandlers", null);
        setField(term896274, term896274.getClass(), "stage", null);
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
        callMethod(klass, "parseSyntheticCode", argTypes, term896274, args);
    }

};


