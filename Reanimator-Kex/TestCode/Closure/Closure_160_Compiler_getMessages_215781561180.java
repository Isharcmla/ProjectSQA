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

public class Compiler_getMessages_215781561180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896182;

    public Compiler_getMessages_215781561180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896182 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896182, term896182.getClass(), "options", null);
        setField(term896182, term896182.getClass(), "passes", null);
        setField(term896182, term896182.getClass(), "externs", null);
        setField(term896182, term896182.getClass(), "modules", null);
        setField(term896182, term896182.getClass(), "moduleGraph", null);
        setField(term896182, term896182.getClass(), "inputs", null);
        setField(term896182, term896182.getClass(), "errorManager", null);
        setField(term896182, term896182.getClass(), "warningsGuard", null);
        setField(term896182, term896182.getClass(), "externsRoot", null);
        setField(term896182, term896182.getClass(), "jsRoot", null);
        setField(term896182, term896182.getClass(), "externAndJsRoot", null);
        setField(term896182, term896182.getClass(), "inputsByName", null);
        setField(term896182, term896182.getClass(), "sourceMap", null);
        setField(term896182, term896182.getClass(), "externExports", null);
        setIntField(term896182, term896182.getClass(), "uniqueNameId", 0);
        setBooleanField(term896182, term896182.getClass(), "useThreads", false);
        setBooleanField(term896182, term896182.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896182, term896182.getClass(), "functionInformationMap", null);
        setField(term896182, term896182.getClass(), "debugLog", null);
        setField(term896182, term896182.getClass(), "defaultCodingConvention", null);
        setField(term896182, term896182.getClass(), "typeRegistry", null);
        setField(term896182, term896182.getClass(), "parserConfig", null);
        setField(term896182, term896182.getClass(), "abstractInterpreter", null);
        setField(term896182, term896182.getClass(), "typeValidator", null);
        setField(term896182, term896182.getClass(), "tracker", null);
        setField(term896182, term896182.getClass(), "oldErrorReporter", null);
        setField(term896182, term896182.getClass(), "defaultErrorReporter", null);
        setField(term896182, term896182.getClass(), "outStream", null);
        setField(term896182, term896182.getClass(), "globalRefMap", null);
        setField(term896182, term896182.getClass(), "sanityCheck", null);
        setField(term896182, term896182.getClass(), "currentTracer", null);
        setField(term896182, term896182.getClass(), "currentPassName", null);
        setField(term896182, term896182.getClass(), "recentChange", null);
        setField(term896182, term896182.getClass(), "codeChangeHandlers", null);
        setField(term896182, term896182.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessages", argTypes, term896182, args);
    }

};


