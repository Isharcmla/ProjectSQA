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

public class Compiler_externExports_691615754172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977756;

    public Compiler_externExports_691615754172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977756 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977756, term977756.getClass(), "options", null);
        setField(term977756, term977756.getClass(), "passes", null);
        setField(term977756, term977756.getClass(), "externs", null);
        setField(term977756, term977756.getClass(), "modules", null);
        setField(term977756, term977756.getClass(), "moduleGraph", null);
        setField(term977756, term977756.getClass(), "inputs", null);
        setField(term977756, term977756.getClass(), "errorManager", null);
        setField(term977756, term977756.getClass(), "warningsGuard", null);
        setField(term977756, term977756.getClass(), "externsRoot", null);
        setField(term977756, term977756.getClass(), "jsRoot", null);
        setField(term977756, term977756.getClass(), "externAndJsRoot", null);
        setField(term977756, term977756.getClass(), "inputsByName", null);
        setField(term977756, term977756.getClass(), "sourceMap", null);
        setField(term977756, term977756.getClass(), "externExports", null);
        setIntField(term977756, term977756.getClass(), "uniqueNameId", 0);
        setBooleanField(term977756, term977756.getClass(), "useThreads", false);
        setBooleanField(term977756, term977756.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977756, term977756.getClass(), "functionInformationMap", null);
        setField(term977756, term977756.getClass(), "debugLog", null);
        setField(term977756, term977756.getClass(), "defaultCodingConvention", null);
        setField(term977756, term977756.getClass(), "typeRegistry", null);
        setField(term977756, term977756.getClass(), "parserConfig", null);
        setField(term977756, term977756.getClass(), "abstractInterpreter", null);
        setField(term977756, term977756.getClass(), "typeValidator", null);
        setField(term977756, term977756.getClass(), "tracker", null);
        setField(term977756, term977756.getClass(), "oldErrorReporter", null);
        setField(term977756, term977756.getClass(), "defaultErrorReporter", null);
        setField(term977756, term977756.getClass(), "outStream", null);
        setField(term977756, term977756.getClass(), "globalRefMap", null);
        setField(term977756, term977756.getClass(), "sanityCheck", null);
        setField(term977756, term977756.getClass(), "currentTracer", null);
        setField(term977756, term977756.getClass(), "currentPassName", null);
        setField(term977756, term977756.getClass(), "recentChange", null);
        setField(term977756, term977756.getClass(), "codeChangeHandlers", null);
        setField(term977756, term977756.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "externExports", argTypes, term977756, args);
    }

};


