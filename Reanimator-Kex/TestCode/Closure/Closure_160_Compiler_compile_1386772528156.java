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

public class Compiler_compile_1386772528156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896082;

    public Compiler_compile_1386772528156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896082 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896082, term896082.getClass(), "options", null);
        setField(term896082, term896082.getClass(), "passes", null);
        setField(term896082, term896082.getClass(), "externs", null);
        setField(term896082, term896082.getClass(), "modules", null);
        setField(term896082, term896082.getClass(), "moduleGraph", null);
        setField(term896082, term896082.getClass(), "inputs", null);
        setField(term896082, term896082.getClass(), "errorManager", null);
        setField(term896082, term896082.getClass(), "warningsGuard", null);
        setField(term896082, term896082.getClass(), "externsRoot", null);
        setField(term896082, term896082.getClass(), "jsRoot", null);
        setField(term896082, term896082.getClass(), "externAndJsRoot", null);
        setField(term896082, term896082.getClass(), "inputsByName", null);
        setField(term896082, term896082.getClass(), "sourceMap", null);
        setField(term896082, term896082.getClass(), "externExports", null);
        setIntField(term896082, term896082.getClass(), "uniqueNameId", 0);
        setBooleanField(term896082, term896082.getClass(), "useThreads", false);
        setBooleanField(term896082, term896082.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896082, term896082.getClass(), "functionInformationMap", null);
        setField(term896082, term896082.getClass(), "debugLog", null);
        setField(term896082, term896082.getClass(), "defaultCodingConvention", null);
        setField(term896082, term896082.getClass(), "typeRegistry", null);
        setField(term896082, term896082.getClass(), "parserConfig", null);
        setField(term896082, term896082.getClass(), "abstractInterpreter", null);
        setField(term896082, term896082.getClass(), "typeValidator", null);
        setField(term896082, term896082.getClass(), "tracker", null);
        setField(term896082, term896082.getClass(), "oldErrorReporter", null);
        setField(term896082, term896082.getClass(), "defaultErrorReporter", null);
        setField(term896082, term896082.getClass(), "outStream", null);
        setField(term896082, term896082.getClass(), "globalRefMap", null);
        setField(term896082, term896082.getClass(), "sanityCheck", null);
        setField(term896082, term896082.getClass(), "currentTracer", null);
        setField(term896082, term896082.getClass(), "currentPassName", null);
        setField(term896082, term896082.getClass(), "recentChange", null);
        setField(term896082, term896082.getClass(), "codeChangeHandlers", null);
        setField(term896082, term896082.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compile", argTypes, term896082, args);
    }

};


