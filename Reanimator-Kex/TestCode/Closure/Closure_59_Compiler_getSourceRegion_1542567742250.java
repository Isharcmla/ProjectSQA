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
import java.lang.Integer;

public class Compiler_getSourceRegion_1542567742250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855024;
     Object term855028;

    public Compiler_getSourceRegion_1542567742250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855024 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855024, term855024.getClass(), "options", null);
        setField(term855024, term855024.getClass(), "passes", null);
        setField(term855024, term855024.getClass(), "externs", null);
        setField(term855024, term855024.getClass(), "modules", null);
        setField(term855024, term855024.getClass(), "moduleGraph", null);
        setField(term855024, term855024.getClass(), "inputs", null);
        setField(term855024, term855024.getClass(), "errorManager", null);
        setField(term855024, term855024.getClass(), "warningsGuard", null);
        setField(term855024, term855024.getClass(), "externsRoot", null);
        setField(term855024, term855024.getClass(), "jsRoot", null);
        setField(term855024, term855024.getClass(), "externAndJsRoot", null);
        setField(term855024, term855024.getClass(), "inputsByName", null);
        setField(term855024, term855024.getClass(), "sourceMap", null);
        setField(term855024, term855024.getClass(), "externExports", null);
        setIntField(term855024, term855024.getClass(), "uniqueNameId", 0);
        setBooleanField(term855024, term855024.getClass(), "useThreads", false);
        setBooleanField(term855024, term855024.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855024, term855024.getClass(), "functionInformationMap", null);
        setField(term855024, term855024.getClass(), "debugLog", null);
        setField(term855024, term855024.getClass(), "defaultCodingConvention", null);
        setField(term855024, term855024.getClass(), "typeRegistry", null);
        setField(term855024, term855024.getClass(), "parserConfig", null);
        setField(term855024, term855024.getClass(), "abstractInterpreter", null);
        setField(term855024, term855024.getClass(), "typeValidator", null);
        setField(term855024, term855024.getClass(), "tracker", null);
        setField(term855024, term855024.getClass(), "oldErrorReporter", null);
        setField(term855024, term855024.getClass(), "defaultErrorReporter", null);
        setField(term855024, term855024.getClass(), "outStream", null);
        setField(term855024, term855024.getClass(), "globalRefMap", null);
        setField(term855024, term855024.getClass(), "sanityCheck", null);
        setField(term855024, term855024.getClass(), "currentTracer", null);
        setField(term855024, term855024.getClass(), "currentPassName", null);
        setField(term855024, term855024.getClass(), "recentChange", null);
        setField(term855024, term855024.getClass(), "codeChangeHandlers", null);
        setField(term855024, term855024.getClass(), "stage", null);
        term855028 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term855028;
        callMethod(klass, "getSourceRegion", argTypes, term855024, args);
    }

};


