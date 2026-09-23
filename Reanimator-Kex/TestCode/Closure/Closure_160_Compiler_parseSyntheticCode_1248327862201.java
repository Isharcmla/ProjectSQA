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

public class Compiler_parseSyntheticCode_1248327862201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896266;

    public Compiler_parseSyntheticCode_1248327862201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896266 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896266, term896266.getClass(), "options", null);
        setField(term896266, term896266.getClass(), "passes", null);
        setField(term896266, term896266.getClass(), "externs", null);
        setField(term896266, term896266.getClass(), "modules", null);
        setField(term896266, term896266.getClass(), "moduleGraph", null);
        setField(term896266, term896266.getClass(), "inputs", null);
        setField(term896266, term896266.getClass(), "errorManager", null);
        setField(term896266, term896266.getClass(), "warningsGuard", null);
        setField(term896266, term896266.getClass(), "externsRoot", null);
        setField(term896266, term896266.getClass(), "jsRoot", null);
        setField(term896266, term896266.getClass(), "externAndJsRoot", null);
        setField(term896266, term896266.getClass(), "inputsByName", null);
        setField(term896266, term896266.getClass(), "sourceMap", null);
        setField(term896266, term896266.getClass(), "externExports", null);
        setIntField(term896266, term896266.getClass(), "uniqueNameId", 0);
        setBooleanField(term896266, term896266.getClass(), "useThreads", false);
        setBooleanField(term896266, term896266.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896266, term896266.getClass(), "functionInformationMap", null);
        setField(term896266, term896266.getClass(), "debugLog", null);
        setField(term896266, term896266.getClass(), "defaultCodingConvention", null);
        setField(term896266, term896266.getClass(), "typeRegistry", null);
        setField(term896266, term896266.getClass(), "parserConfig", null);
        setField(term896266, term896266.getClass(), "abstractInterpreter", null);
        setField(term896266, term896266.getClass(), "typeValidator", null);
        setField(term896266, term896266.getClass(), "tracker", null);
        setField(term896266, term896266.getClass(), "oldErrorReporter", null);
        setField(term896266, term896266.getClass(), "defaultErrorReporter", null);
        setField(term896266, term896266.getClass(), "outStream", null);
        setField(term896266, term896266.getClass(), "globalRefMap", null);
        setField(term896266, term896266.getClass(), "sanityCheck", null);
        setField(term896266, term896266.getClass(), "currentTracer", null);
        setField(term896266, term896266.getClass(), "currentPassName", null);
        setField(term896266, term896266.getClass(), "recentChange", null);
        setField(term896266, term896266.getClass(), "codeChangeHandlers", null);
        setField(term896266, term896266.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseSyntheticCode", argTypes, term896266, args);
    }

};


