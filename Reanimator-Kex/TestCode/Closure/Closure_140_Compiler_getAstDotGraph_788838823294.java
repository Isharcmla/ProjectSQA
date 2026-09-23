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

public class Compiler_getAstDotGraph_788838823294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333542;
     Object term2310825;

    public Compiler_getAstDotGraph_788838823294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333542 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term333542, term333542.getClass(), "options", null);
        setField(term333542, term333542.getClass(), "passes", null);
        setField(term333542, term333542.getClass(), "externs", null);
        setField(term333542, term333542.getClass(), "modules", null);
        setField(term333542, term333542.getClass(), "moduleGraph", null);
        setField(term333542, term333542.getClass(), "inputs", null);
        setField(term333542, term333542.getClass(), "errorManager", null);
        setField(term333542, term333542.getClass(), "symbolTable", null);
        setField(term333542, term333542.getClass(), "externsRoot", null);
        setField(term333542, term333542.getClass(), "jsRoot", null);
        setField(term333542, term333542.getClass(), "externAndJsRoot", null);
        setField(term333542, term333542.getClass(), "inputsByName", null);
        setField(term333542, term333542.getClass(), "sourceMap", null);
        setField(term333542, term333542.getClass(), "externExports", null);
        setIntField(term333542, term333542.getClass(), "uniqueNameId", 0);
        setBooleanField(term333542, term333542.getClass(), "normalized", false);
        setBooleanField(term333542, term333542.getClass(), "useThreads", false);
        setField(term333542, term333542.getClass(), "functionInformationMap", null);
        setField(term333542, term333542.getClass(), "debugLog", null);
        setField(term333542, term333542.getClass(), "defaultCodingConvention", null);
        setField(term333542, term333542.getClass(), "typeRegistry", null);
        setField(term333542, term333542.getClass(), "parserConfig", null);
        setField(term333542, term333542.getClass(), "abstractInterpreter", null);
        setField(term333542, term333542.getClass(), "typeValidator", null);
        setField(term333542, term333542.getClass(), "tracker", null);
        setField(term333542, term333542.getClass(), "oldErrorReporter", null);
        setField(term333542, term333542.getClass(), "defaultErrorReporter", null);
        setField(term333542, term333542.getClass(), "outStream", null);
        setField(term333542, term333542.getClass(), "sanityCheck", null);
        setField(term333542, term333542.getClass(), "currentTracer", null);
        setField(term333542, term333542.getClass(), "currentPassName", null);
        setField(term333542, term333542.getClass(), "recentChange", null);
        setField(term333542, term333542.getClass(), "codeChangeHandlers", null);
        term2310825 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2310825, term2310825.getClass(), "options", null);
        setField(term2310825, term2310825.getClass(), "passes", null);
        setField(term2310825, term2310825.getClass(), "externs", null);
        setField(term2310825, term2310825.getClass(), "modules", null);
        setField(term2310825, term2310825.getClass(), "moduleGraph", null);
        setField(term2310825, term2310825.getClass(), "inputs", null);
        setField(term2310825, term2310825.getClass(), "errorManager", null);
        setField(term2310825, term2310825.getClass(), "symbolTable", null);
        setField(term2310825, term2310825.getClass(), "externsRoot", null);
        setField(term2310825, term2310825.getClass(), "jsRoot", null);
        setField(term2310825, term2310825.getClass(), "externAndJsRoot", null);
        setField(term2310825, term2310825.getClass(), "inputsByName", null);
        setField(term2310825, term2310825.getClass(), "sourceMap", null);
        setField(term2310825, term2310825.getClass(), "externExports", null);
        setIntField(term2310825, term2310825.getClass(), "uniqueNameId", 0);
        setBooleanField(term2310825, term2310825.getClass(), "normalized", false);
        setBooleanField(term2310825, term2310825.getClass(), "useThreads", false);
        setField(term2310825, term2310825.getClass(), "functionInformationMap", null);
        setField(term2310825, term2310825.getClass(), "debugLog", null);
        setField(term2310825, term2310825.getClass(), "defaultCodingConvention", null);
        setField(term2310825, term2310825.getClass(), "typeRegistry", null);
        setField(term2310825, term2310825.getClass(), "parserConfig", null);
        setField(term2310825, term2310825.getClass(), "abstractInterpreter", null);
        setField(term2310825, term2310825.getClass(), "typeValidator", null);
        setField(term2310825, term2310825.getClass(), "tracker", null);
        setField(term2310825, term2310825.getClass(), "oldErrorReporter", null);
        setField(term2310825, term2310825.getClass(), "defaultErrorReporter", null);
        setField(term2310825, term2310825.getClass(), "outStream", null);
        setField(term2310825, term2310825.getClass(), "sanityCheck", null);
        setField(term2310825, term2310825.getClass(), "currentTracer", null);
        setField(term2310825, term2310825.getClass(), "currentPassName", null);
        setField(term2310825, term2310825.getClass(), "recentChange", null);
        setField(term2310825, term2310825.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAstDotGraph", argTypes, term333542, args);
        assertTrue(recursiveEquals(term333542, term2310825));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


