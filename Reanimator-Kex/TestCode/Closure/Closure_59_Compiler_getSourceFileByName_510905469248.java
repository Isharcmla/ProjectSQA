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

public class Compiler_getSourceFileByName_510905469248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855014;

    public Compiler_getSourceFileByName_510905469248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855014 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855014, term855014.getClass(), "options", null);
        setField(term855014, term855014.getClass(), "passes", null);
        setField(term855014, term855014.getClass(), "externs", null);
        setField(term855014, term855014.getClass(), "modules", null);
        setField(term855014, term855014.getClass(), "moduleGraph", null);
        setField(term855014, term855014.getClass(), "inputs", null);
        setField(term855014, term855014.getClass(), "errorManager", null);
        setField(term855014, term855014.getClass(), "warningsGuard", null);
        setField(term855014, term855014.getClass(), "externsRoot", null);
        setField(term855014, term855014.getClass(), "jsRoot", null);
        setField(term855014, term855014.getClass(), "externAndJsRoot", null);
        setField(term855014, term855014.getClass(), "inputsByName", null);
        setField(term855014, term855014.getClass(), "sourceMap", null);
        setField(term855014, term855014.getClass(), "externExports", null);
        setIntField(term855014, term855014.getClass(), "uniqueNameId", 0);
        setBooleanField(term855014, term855014.getClass(), "useThreads", false);
        setBooleanField(term855014, term855014.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855014, term855014.getClass(), "functionInformationMap", null);
        setField(term855014, term855014.getClass(), "debugLog", null);
        setField(term855014, term855014.getClass(), "defaultCodingConvention", null);
        setField(term855014, term855014.getClass(), "typeRegistry", null);
        setField(term855014, term855014.getClass(), "parserConfig", null);
        setField(term855014, term855014.getClass(), "abstractInterpreter", null);
        setField(term855014, term855014.getClass(), "typeValidator", null);
        setField(term855014, term855014.getClass(), "tracker", null);
        setField(term855014, term855014.getClass(), "oldErrorReporter", null);
        setField(term855014, term855014.getClass(), "defaultErrorReporter", null);
        setField(term855014, term855014.getClass(), "outStream", null);
        setField(term855014, term855014.getClass(), "globalRefMap", null);
        setField(term855014, term855014.getClass(), "sanityCheck", null);
        setField(term855014, term855014.getClass(), "currentTracer", null);
        setField(term855014, term855014.getClass(), "currentPassName", null);
        setField(term855014, term855014.getClass(), "recentChange", null);
        setField(term855014, term855014.getClass(), "codeChangeHandlers", null);
        setField(term855014, term855014.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSourceFileByName", argTypes, term855014, args);
    }

};


