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

public class Compiler_parseSyntheticCode_823448345210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854815;

    public Compiler_parseSyntheticCode_823448345210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854815 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854815, term854815.getClass(), "options", null);
        setField(term854815, term854815.getClass(), "passes", null);
        setField(term854815, term854815.getClass(), "externs", null);
        setField(term854815, term854815.getClass(), "modules", null);
        setField(term854815, term854815.getClass(), "moduleGraph", null);
        setField(term854815, term854815.getClass(), "inputs", null);
        setField(term854815, term854815.getClass(), "errorManager", null);
        setField(term854815, term854815.getClass(), "warningsGuard", null);
        setField(term854815, term854815.getClass(), "externsRoot", null);
        setField(term854815, term854815.getClass(), "jsRoot", null);
        setField(term854815, term854815.getClass(), "externAndJsRoot", null);
        setField(term854815, term854815.getClass(), "inputsByName", null);
        setField(term854815, term854815.getClass(), "sourceMap", null);
        setField(term854815, term854815.getClass(), "externExports", null);
        setIntField(term854815, term854815.getClass(), "uniqueNameId", 0);
        setBooleanField(term854815, term854815.getClass(), "useThreads", false);
        setBooleanField(term854815, term854815.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854815, term854815.getClass(), "functionInformationMap", null);
        setField(term854815, term854815.getClass(), "debugLog", null);
        setField(term854815, term854815.getClass(), "defaultCodingConvention", null);
        setField(term854815, term854815.getClass(), "typeRegistry", null);
        setField(term854815, term854815.getClass(), "parserConfig", null);
        setField(term854815, term854815.getClass(), "abstractInterpreter", null);
        setField(term854815, term854815.getClass(), "typeValidator", null);
        setField(term854815, term854815.getClass(), "tracker", null);
        setField(term854815, term854815.getClass(), "oldErrorReporter", null);
        setField(term854815, term854815.getClass(), "defaultErrorReporter", null);
        setField(term854815, term854815.getClass(), "outStream", null);
        setField(term854815, term854815.getClass(), "globalRefMap", null);
        setField(term854815, term854815.getClass(), "sanityCheck", null);
        setField(term854815, term854815.getClass(), "currentTracer", null);
        setField(term854815, term854815.getClass(), "currentPassName", null);
        setField(term854815, term854815.getClass(), "recentChange", null);
        setField(term854815, term854815.getClass(), "codeChangeHandlers", null);
        setField(term854815, term854815.getClass(), "stage", null);
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
        callMethod(klass, "parseSyntheticCode", argTypes, term854815, args);
    }

};


