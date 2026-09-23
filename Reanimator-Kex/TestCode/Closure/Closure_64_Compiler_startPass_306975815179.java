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

public class Compiler_startPass_306975815179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977784;

    public Compiler_startPass_306975815179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977784 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977784, term977784.getClass(), "options", null);
        setField(term977784, term977784.getClass(), "passes", null);
        setField(term977784, term977784.getClass(), "externs", null);
        setField(term977784, term977784.getClass(), "modules", null);
        setField(term977784, term977784.getClass(), "moduleGraph", null);
        setField(term977784, term977784.getClass(), "inputs", null);
        setField(term977784, term977784.getClass(), "errorManager", null);
        setField(term977784, term977784.getClass(), "warningsGuard", null);
        setField(term977784, term977784.getClass(), "externsRoot", null);
        setField(term977784, term977784.getClass(), "jsRoot", null);
        setField(term977784, term977784.getClass(), "externAndJsRoot", null);
        setField(term977784, term977784.getClass(), "inputsByName", null);
        setField(term977784, term977784.getClass(), "sourceMap", null);
        setField(term977784, term977784.getClass(), "externExports", null);
        setIntField(term977784, term977784.getClass(), "uniqueNameId", 0);
        setBooleanField(term977784, term977784.getClass(), "useThreads", false);
        setBooleanField(term977784, term977784.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977784, term977784.getClass(), "functionInformationMap", null);
        setField(term977784, term977784.getClass(), "debugLog", null);
        setField(term977784, term977784.getClass(), "defaultCodingConvention", null);
        setField(term977784, term977784.getClass(), "typeRegistry", null);
        setField(term977784, term977784.getClass(), "parserConfig", null);
        setField(term977784, term977784.getClass(), "abstractInterpreter", null);
        setField(term977784, term977784.getClass(), "typeValidator", null);
        setField(term977784, term977784.getClass(), "tracker", null);
        setField(term977784, term977784.getClass(), "oldErrorReporter", null);
        setField(term977784, term977784.getClass(), "defaultErrorReporter", null);
        setField(term977784, term977784.getClass(), "outStream", null);
        setField(term977784, term977784.getClass(), "globalRefMap", null);
        setField(term977784, term977784.getClass(), "sanityCheck", null);
        setField(term977784, term977784.getClass(), "currentTracer", null);
        setField(term977784, term977784.getClass(), "currentPassName", null);
        setField(term977784, term977784.getClass(), "recentChange", null);
        setField(term977784, term977784.getClass(), "codeChangeHandlers", null);
        setField(term977784, term977784.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "startPass", argTypes, term977784, args);
    }

};


