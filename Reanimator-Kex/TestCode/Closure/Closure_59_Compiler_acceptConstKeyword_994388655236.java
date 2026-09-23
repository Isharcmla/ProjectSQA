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

public class Compiler_acceptConstKeyword_994388655236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854966;

    public Compiler_acceptConstKeyword_994388655236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854966 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854966, term854966.getClass(), "options", null);
        setField(term854966, term854966.getClass(), "passes", null);
        setField(term854966, term854966.getClass(), "externs", null);
        setField(term854966, term854966.getClass(), "modules", null);
        setField(term854966, term854966.getClass(), "moduleGraph", null);
        setField(term854966, term854966.getClass(), "inputs", null);
        setField(term854966, term854966.getClass(), "errorManager", null);
        setField(term854966, term854966.getClass(), "warningsGuard", null);
        setField(term854966, term854966.getClass(), "externsRoot", null);
        setField(term854966, term854966.getClass(), "jsRoot", null);
        setField(term854966, term854966.getClass(), "externAndJsRoot", null);
        setField(term854966, term854966.getClass(), "inputsByName", null);
        setField(term854966, term854966.getClass(), "sourceMap", null);
        setField(term854966, term854966.getClass(), "externExports", null);
        setIntField(term854966, term854966.getClass(), "uniqueNameId", 0);
        setBooleanField(term854966, term854966.getClass(), "useThreads", false);
        setBooleanField(term854966, term854966.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854966, term854966.getClass(), "functionInformationMap", null);
        setField(term854966, term854966.getClass(), "debugLog", null);
        setField(term854966, term854966.getClass(), "defaultCodingConvention", null);
        setField(term854966, term854966.getClass(), "typeRegistry", null);
        setField(term854966, term854966.getClass(), "parserConfig", null);
        setField(term854966, term854966.getClass(), "abstractInterpreter", null);
        setField(term854966, term854966.getClass(), "typeValidator", null);
        setField(term854966, term854966.getClass(), "tracker", null);
        setField(term854966, term854966.getClass(), "oldErrorReporter", null);
        setField(term854966, term854966.getClass(), "defaultErrorReporter", null);
        setField(term854966, term854966.getClass(), "outStream", null);
        setField(term854966, term854966.getClass(), "globalRefMap", null);
        setField(term854966, term854966.getClass(), "sanityCheck", null);
        setField(term854966, term854966.getClass(), "currentTracer", null);
        setField(term854966, term854966.getClass(), "currentPassName", null);
        setField(term854966, term854966.getClass(), "recentChange", null);
        setField(term854966, term854966.getClass(), "codeChangeHandlers", null);
        setField(term854966, term854966.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "acceptConstKeyword", argTypes, term854966, args);
    }

};


