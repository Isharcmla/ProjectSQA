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

public class Compiler_check_1123875009167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896130;

    public Compiler_check_1123875009167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896130 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896130, term896130.getClass(), "options", null);
        setField(term896130, term896130.getClass(), "passes", null);
        setField(term896130, term896130.getClass(), "externs", null);
        setField(term896130, term896130.getClass(), "modules", null);
        setField(term896130, term896130.getClass(), "moduleGraph", null);
        setField(term896130, term896130.getClass(), "inputs", null);
        setField(term896130, term896130.getClass(), "errorManager", null);
        setField(term896130, term896130.getClass(), "warningsGuard", null);
        setField(term896130, term896130.getClass(), "externsRoot", null);
        setField(term896130, term896130.getClass(), "jsRoot", null);
        setField(term896130, term896130.getClass(), "externAndJsRoot", null);
        setField(term896130, term896130.getClass(), "inputsByName", null);
        setField(term896130, term896130.getClass(), "sourceMap", null);
        setField(term896130, term896130.getClass(), "externExports", null);
        setIntField(term896130, term896130.getClass(), "uniqueNameId", 0);
        setBooleanField(term896130, term896130.getClass(), "useThreads", false);
        setBooleanField(term896130, term896130.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896130, term896130.getClass(), "functionInformationMap", null);
        setField(term896130, term896130.getClass(), "debugLog", null);
        setField(term896130, term896130.getClass(), "defaultCodingConvention", null);
        setField(term896130, term896130.getClass(), "typeRegistry", null);
        setField(term896130, term896130.getClass(), "parserConfig", null);
        setField(term896130, term896130.getClass(), "abstractInterpreter", null);
        setField(term896130, term896130.getClass(), "typeValidator", null);
        setField(term896130, term896130.getClass(), "tracker", null);
        setField(term896130, term896130.getClass(), "oldErrorReporter", null);
        setField(term896130, term896130.getClass(), "defaultErrorReporter", null);
        setField(term896130, term896130.getClass(), "outStream", null);
        setField(term896130, term896130.getClass(), "globalRefMap", null);
        setField(term896130, term896130.getClass(), "sanityCheck", null);
        setField(term896130, term896130.getClass(), "currentTracer", null);
        setField(term896130, term896130.getClass(), "currentPassName", null);
        setField(term896130, term896130.getClass(), "recentChange", null);
        setField(term896130, term896130.getClass(), "codeChangeHandlers", null);
        setField(term896130, term896130.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "check", argTypes, term896130, args);
    }

};


