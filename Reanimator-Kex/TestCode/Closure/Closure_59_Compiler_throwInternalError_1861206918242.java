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

public class Compiler_throwInternalError_1861206918242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854990;

    public Compiler_throwInternalError_1861206918242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854990 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854990, term854990.getClass(), "options", null);
        setField(term854990, term854990.getClass(), "passes", null);
        setField(term854990, term854990.getClass(), "externs", null);
        setField(term854990, term854990.getClass(), "modules", null);
        setField(term854990, term854990.getClass(), "moduleGraph", null);
        setField(term854990, term854990.getClass(), "inputs", null);
        setField(term854990, term854990.getClass(), "errorManager", null);
        setField(term854990, term854990.getClass(), "warningsGuard", null);
        setField(term854990, term854990.getClass(), "externsRoot", null);
        setField(term854990, term854990.getClass(), "jsRoot", null);
        setField(term854990, term854990.getClass(), "externAndJsRoot", null);
        setField(term854990, term854990.getClass(), "inputsByName", null);
        setField(term854990, term854990.getClass(), "sourceMap", null);
        setField(term854990, term854990.getClass(), "externExports", null);
        setIntField(term854990, term854990.getClass(), "uniqueNameId", 0);
        setBooleanField(term854990, term854990.getClass(), "useThreads", false);
        setBooleanField(term854990, term854990.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854990, term854990.getClass(), "functionInformationMap", null);
        setField(term854990, term854990.getClass(), "debugLog", null);
        setField(term854990, term854990.getClass(), "defaultCodingConvention", null);
        setField(term854990, term854990.getClass(), "typeRegistry", null);
        setField(term854990, term854990.getClass(), "parserConfig", null);
        setField(term854990, term854990.getClass(), "abstractInterpreter", null);
        setField(term854990, term854990.getClass(), "typeValidator", null);
        setField(term854990, term854990.getClass(), "tracker", null);
        setField(term854990, term854990.getClass(), "oldErrorReporter", null);
        setField(term854990, term854990.getClass(), "defaultErrorReporter", null);
        setField(term854990, term854990.getClass(), "outStream", null);
        setField(term854990, term854990.getClass(), "globalRefMap", null);
        setField(term854990, term854990.getClass(), "sanityCheck", null);
        setField(term854990, term854990.getClass(), "currentTracer", null);
        setField(term854990, term854990.getClass(), "currentPassName", null);
        setField(term854990, term854990.getClass(), "recentChange", null);
        setField(term854990, term854990.getClass(), "codeChangeHandlers", null);
        setField(term854990, term854990.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "throwInternalError", argTypes, term854990, args);
    }

};


