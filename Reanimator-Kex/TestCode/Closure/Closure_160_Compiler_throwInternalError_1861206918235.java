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

public class Compiler_throwInternalError_1861206918235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896404;

    public Compiler_throwInternalError_1861206918235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896404 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896404, term896404.getClass(), "options", null);
        setField(term896404, term896404.getClass(), "passes", null);
        setField(term896404, term896404.getClass(), "externs", null);
        setField(term896404, term896404.getClass(), "modules", null);
        setField(term896404, term896404.getClass(), "moduleGraph", null);
        setField(term896404, term896404.getClass(), "inputs", null);
        setField(term896404, term896404.getClass(), "errorManager", null);
        setField(term896404, term896404.getClass(), "warningsGuard", null);
        setField(term896404, term896404.getClass(), "externsRoot", null);
        setField(term896404, term896404.getClass(), "jsRoot", null);
        setField(term896404, term896404.getClass(), "externAndJsRoot", null);
        setField(term896404, term896404.getClass(), "inputsByName", null);
        setField(term896404, term896404.getClass(), "sourceMap", null);
        setField(term896404, term896404.getClass(), "externExports", null);
        setIntField(term896404, term896404.getClass(), "uniqueNameId", 0);
        setBooleanField(term896404, term896404.getClass(), "useThreads", false);
        setBooleanField(term896404, term896404.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896404, term896404.getClass(), "functionInformationMap", null);
        setField(term896404, term896404.getClass(), "debugLog", null);
        setField(term896404, term896404.getClass(), "defaultCodingConvention", null);
        setField(term896404, term896404.getClass(), "typeRegistry", null);
        setField(term896404, term896404.getClass(), "parserConfig", null);
        setField(term896404, term896404.getClass(), "abstractInterpreter", null);
        setField(term896404, term896404.getClass(), "typeValidator", null);
        setField(term896404, term896404.getClass(), "tracker", null);
        setField(term896404, term896404.getClass(), "oldErrorReporter", null);
        setField(term896404, term896404.getClass(), "defaultErrorReporter", null);
        setField(term896404, term896404.getClass(), "outStream", null);
        setField(term896404, term896404.getClass(), "globalRefMap", null);
        setField(term896404, term896404.getClass(), "sanityCheck", null);
        setField(term896404, term896404.getClass(), "currentTracer", null);
        setField(term896404, term896404.getClass(), "currentPassName", null);
        setField(term896404, term896404.getClass(), "recentChange", null);
        setField(term896404, term896404.getClass(), "codeChangeHandlers", null);
        setField(term896404, term896404.getClass(), "stage", null);
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
        callMethod(klass, "throwInternalError", argTypes, term896404, args);
    }

};


