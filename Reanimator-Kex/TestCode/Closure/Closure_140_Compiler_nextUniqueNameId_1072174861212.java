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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class Compiler_nextUniqueNameId_1072174861212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142927;
     Object term883174;

    public Compiler_nextUniqueNameId_1072174861212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142927 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term142927, term142927.getClass(), "options", null);
        setField(term142927, term142927.getClass(), "passes", null);
        setField(term142927, term142927.getClass(), "externs", null);
        setField(term142927, term142927.getClass(), "modules", null);
        setField(term142927, term142927.getClass(), "moduleGraph", null);
        setField(term142927, term142927.getClass(), "inputs", null);
        setField(term142927, term142927.getClass(), "errorManager", null);
        setField(term142927, term142927.getClass(), "symbolTable", null);
        setField(term142927, term142927.getClass(), "externsRoot", null);
        setField(term142927, term142927.getClass(), "jsRoot", null);
        setField(term142927, term142927.getClass(), "externAndJsRoot", null);
        setField(term142927, term142927.getClass(), "inputsByName", null);
        setField(term142927, term142927.getClass(), "sourceMap", null);
        setField(term142927, term142927.getClass(), "externExports", null);
        setIntField(term142927, term142927.getClass(), "uniqueNameId", 0);
        setBooleanField(term142927, term142927.getClass(), "normalized", false);
        setBooleanField(term142927, term142927.getClass(), "useThreads", false);
        setField(term142927, term142927.getClass(), "functionInformationMap", null);
        setField(term142927, term142927.getClass(), "debugLog", null);
        setField(term142927, term142927.getClass(), "defaultCodingConvention", null);
        setField(term142927, term142927.getClass(), "typeRegistry", null);
        setField(term142927, term142927.getClass(), "parserConfig", null);
        setField(term142927, term142927.getClass(), "abstractInterpreter", null);
        setField(term142927, term142927.getClass(), "typeValidator", null);
        setField(term142927, term142927.getClass(), "tracker", null);
        setField(term142927, term142927.getClass(), "oldErrorReporter", null);
        setField(term142927, term142927.getClass(), "defaultErrorReporter", null);
        setField(term142927, term142927.getClass(), "outStream", null);
        setField(term142927, term142927.getClass(), "sanityCheck", null);
        setField(term142927, term142927.getClass(), "currentTracer", null);
        setField(term142927, term142927.getClass(), "currentPassName", null);
        setField(term142927, term142927.getClass(), "recentChange", null);
        setField(term142927, term142927.getClass(), "codeChangeHandlers", null);
        term883174 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term883174, term883174.getClass(), "options", null);
        setField(term883174, term883174.getClass(), "passes", null);
        setField(term883174, term883174.getClass(), "externs", null);
        setField(term883174, term883174.getClass(), "modules", null);
        setField(term883174, term883174.getClass(), "moduleGraph", null);
        setField(term883174, term883174.getClass(), "inputs", null);
        setField(term883174, term883174.getClass(), "errorManager", null);
        setField(term883174, term883174.getClass(), "symbolTable", null);
        setField(term883174, term883174.getClass(), "externsRoot", null);
        setField(term883174, term883174.getClass(), "jsRoot", null);
        setField(term883174, term883174.getClass(), "externAndJsRoot", null);
        setField(term883174, term883174.getClass(), "inputsByName", null);
        setField(term883174, term883174.getClass(), "sourceMap", null);
        setField(term883174, term883174.getClass(), "externExports", null);
        setIntField(term883174, term883174.getClass(), "uniqueNameId", 1);
        setBooleanField(term883174, term883174.getClass(), "normalized", false);
        setBooleanField(term883174, term883174.getClass(), "useThreads", false);
        setField(term883174, term883174.getClass(), "functionInformationMap", null);
        setField(term883174, term883174.getClass(), "debugLog", null);
        setField(term883174, term883174.getClass(), "defaultCodingConvention", null);
        setField(term883174, term883174.getClass(), "typeRegistry", null);
        setField(term883174, term883174.getClass(), "parserConfig", null);
        setField(term883174, term883174.getClass(), "abstractInterpreter", null);
        setField(term883174, term883174.getClass(), "typeValidator", null);
        setField(term883174, term883174.getClass(), "tracker", null);
        setField(term883174, term883174.getClass(), "oldErrorReporter", null);
        setField(term883174, term883174.getClass(), "defaultErrorReporter", null);
        setField(term883174, term883174.getClass(), "outStream", null);
        setField(term883174, term883174.getClass(), "sanityCheck", null);
        setField(term883174, term883174.getClass(), "currentTracer", null);
        setField(term883174, term883174.getClass(), "currentPassName", null);
        setField(term883174, term883174.getClass(), "recentChange", null);
        setField(term883174, term883174.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextUniqueNameId", argTypes, term142927, args);
        assertTrue(recursiveEquals(term142927, term883174));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


