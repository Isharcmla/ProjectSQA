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

public class Compiler_parseTestCode_534226295211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854819;

    public Compiler_parseTestCode_534226295211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854819 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854819, term854819.getClass(), "options", null);
        setField(term854819, term854819.getClass(), "passes", null);
        setField(term854819, term854819.getClass(), "externs", null);
        setField(term854819, term854819.getClass(), "modules", null);
        setField(term854819, term854819.getClass(), "moduleGraph", null);
        setField(term854819, term854819.getClass(), "inputs", null);
        setField(term854819, term854819.getClass(), "errorManager", null);
        setField(term854819, term854819.getClass(), "warningsGuard", null);
        setField(term854819, term854819.getClass(), "externsRoot", null);
        setField(term854819, term854819.getClass(), "jsRoot", null);
        setField(term854819, term854819.getClass(), "externAndJsRoot", null);
        setField(term854819, term854819.getClass(), "inputsByName", null);
        setField(term854819, term854819.getClass(), "sourceMap", null);
        setField(term854819, term854819.getClass(), "externExports", null);
        setIntField(term854819, term854819.getClass(), "uniqueNameId", 0);
        setBooleanField(term854819, term854819.getClass(), "useThreads", false);
        setBooleanField(term854819, term854819.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854819, term854819.getClass(), "functionInformationMap", null);
        setField(term854819, term854819.getClass(), "debugLog", null);
        setField(term854819, term854819.getClass(), "defaultCodingConvention", null);
        setField(term854819, term854819.getClass(), "typeRegistry", null);
        setField(term854819, term854819.getClass(), "parserConfig", null);
        setField(term854819, term854819.getClass(), "abstractInterpreter", null);
        setField(term854819, term854819.getClass(), "typeValidator", null);
        setField(term854819, term854819.getClass(), "tracker", null);
        setField(term854819, term854819.getClass(), "oldErrorReporter", null);
        setField(term854819, term854819.getClass(), "defaultErrorReporter", null);
        setField(term854819, term854819.getClass(), "outStream", null);
        setField(term854819, term854819.getClass(), "globalRefMap", null);
        setField(term854819, term854819.getClass(), "sanityCheck", null);
        setField(term854819, term854819.getClass(), "currentTracer", null);
        setField(term854819, term854819.getClass(), "currentPassName", null);
        setField(term854819, term854819.getClass(), "recentChange", null);
        setField(term854819, term854819.getClass(), "codeChangeHandlers", null);
        setField(term854819, term854819.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseTestCode", argTypes, term854819, args);
    }

};


