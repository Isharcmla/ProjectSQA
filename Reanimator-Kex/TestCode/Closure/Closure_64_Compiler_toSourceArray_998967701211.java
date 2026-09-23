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

public class Compiler_toSourceArray_998967701211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977912;

    public Compiler_toSourceArray_998967701211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977912 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977912, term977912.getClass(), "options", null);
        setField(term977912, term977912.getClass(), "passes", null);
        setField(term977912, term977912.getClass(), "externs", null);
        setField(term977912, term977912.getClass(), "modules", null);
        setField(term977912, term977912.getClass(), "moduleGraph", null);
        setField(term977912, term977912.getClass(), "inputs", null);
        setField(term977912, term977912.getClass(), "errorManager", null);
        setField(term977912, term977912.getClass(), "warningsGuard", null);
        setField(term977912, term977912.getClass(), "externsRoot", null);
        setField(term977912, term977912.getClass(), "jsRoot", null);
        setField(term977912, term977912.getClass(), "externAndJsRoot", null);
        setField(term977912, term977912.getClass(), "inputsByName", null);
        setField(term977912, term977912.getClass(), "sourceMap", null);
        setField(term977912, term977912.getClass(), "externExports", null);
        setIntField(term977912, term977912.getClass(), "uniqueNameId", 0);
        setBooleanField(term977912, term977912.getClass(), "useThreads", false);
        setBooleanField(term977912, term977912.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977912, term977912.getClass(), "functionInformationMap", null);
        setField(term977912, term977912.getClass(), "debugLog", null);
        setField(term977912, term977912.getClass(), "defaultCodingConvention", null);
        setField(term977912, term977912.getClass(), "typeRegistry", null);
        setField(term977912, term977912.getClass(), "parserConfig", null);
        setField(term977912, term977912.getClass(), "abstractInterpreter", null);
        setField(term977912, term977912.getClass(), "typeValidator", null);
        setField(term977912, term977912.getClass(), "tracker", null);
        setField(term977912, term977912.getClass(), "oldErrorReporter", null);
        setField(term977912, term977912.getClass(), "defaultErrorReporter", null);
        setField(term977912, term977912.getClass(), "outStream", null);
        setField(term977912, term977912.getClass(), "globalRefMap", null);
        setField(term977912, term977912.getClass(), "sanityCheck", null);
        setField(term977912, term977912.getClass(), "currentTracer", null);
        setField(term977912, term977912.getClass(), "currentPassName", null);
        setField(term977912, term977912.getClass(), "recentChange", null);
        setField(term977912, term977912.getClass(), "codeChangeHandlers", null);
        setField(term977912, term977912.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSourceArray", argTypes, term977912, args);
    }

};


