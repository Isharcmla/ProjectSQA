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

public class Compiler_getModuleGraph_6663115222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173457;
     Object term917552;

    public Compiler_getModuleGraph_6663115222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173457 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term173457, term173457.getClass(), "options", null);
        setField(term173457, term173457.getClass(), "passes", null);
        setField(term173457, term173457.getClass(), "externs", null);
        setField(term173457, term173457.getClass(), "modules", null);
        setField(term173457, term173457.getClass(), "moduleGraph", null);
        setField(term173457, term173457.getClass(), "inputs", null);
        setField(term173457, term173457.getClass(), "errorManager", null);
        setField(term173457, term173457.getClass(), "symbolTable", null);
        setField(term173457, term173457.getClass(), "externsRoot", null);
        setField(term173457, term173457.getClass(), "jsRoot", null);
        setField(term173457, term173457.getClass(), "externAndJsRoot", null);
        setField(term173457, term173457.getClass(), "inputsByName", null);
        setField(term173457, term173457.getClass(), "sourceMap", null);
        setField(term173457, term173457.getClass(), "externExports", null);
        setIntField(term173457, term173457.getClass(), "uniqueNameId", 0);
        setBooleanField(term173457, term173457.getClass(), "normalized", false);
        setBooleanField(term173457, term173457.getClass(), "useThreads", false);
        setField(term173457, term173457.getClass(), "functionInformationMap", null);
        setField(term173457, term173457.getClass(), "debugLog", null);
        setField(term173457, term173457.getClass(), "defaultCodingConvention", null);
        setField(term173457, term173457.getClass(), "typeRegistry", null);
        setField(term173457, term173457.getClass(), "parserConfig", null);
        setField(term173457, term173457.getClass(), "abstractInterpreter", null);
        setField(term173457, term173457.getClass(), "typeValidator", null);
        setField(term173457, term173457.getClass(), "tracker", null);
        setField(term173457, term173457.getClass(), "oldErrorReporter", null);
        setField(term173457, term173457.getClass(), "defaultErrorReporter", null);
        setField(term173457, term173457.getClass(), "outStream", null);
        setField(term173457, term173457.getClass(), "sanityCheck", null);
        setField(term173457, term173457.getClass(), "currentTracer", null);
        setField(term173457, term173457.getClass(), "currentPassName", null);
        setField(term173457, term173457.getClass(), "recentChange", null);
        setField(term173457, term173457.getClass(), "codeChangeHandlers", null);
        term917552 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term917552, term917552.getClass(), "options", null);
        setField(term917552, term917552.getClass(), "passes", null);
        setField(term917552, term917552.getClass(), "externs", null);
        setField(term917552, term917552.getClass(), "modules", null);
        setField(term917552, term917552.getClass(), "moduleGraph", null);
        setField(term917552, term917552.getClass(), "inputs", null);
        setField(term917552, term917552.getClass(), "errorManager", null);
        setField(term917552, term917552.getClass(), "symbolTable", null);
        setField(term917552, term917552.getClass(), "externsRoot", null);
        setField(term917552, term917552.getClass(), "jsRoot", null);
        setField(term917552, term917552.getClass(), "externAndJsRoot", null);
        setField(term917552, term917552.getClass(), "inputsByName", null);
        setField(term917552, term917552.getClass(), "sourceMap", null);
        setField(term917552, term917552.getClass(), "externExports", null);
        setIntField(term917552, term917552.getClass(), "uniqueNameId", 0);
        setBooleanField(term917552, term917552.getClass(), "normalized", false);
        setBooleanField(term917552, term917552.getClass(), "useThreads", false);
        setField(term917552, term917552.getClass(), "functionInformationMap", null);
        setField(term917552, term917552.getClass(), "debugLog", null);
        setField(term917552, term917552.getClass(), "defaultCodingConvention", null);
        setField(term917552, term917552.getClass(), "typeRegistry", null);
        setField(term917552, term917552.getClass(), "parserConfig", null);
        setField(term917552, term917552.getClass(), "abstractInterpreter", null);
        setField(term917552, term917552.getClass(), "typeValidator", null);
        setField(term917552, term917552.getClass(), "tracker", null);
        setField(term917552, term917552.getClass(), "oldErrorReporter", null);
        setField(term917552, term917552.getClass(), "defaultErrorReporter", null);
        setField(term917552, term917552.getClass(), "outStream", null);
        setField(term917552, term917552.getClass(), "sanityCheck", null);
        setField(term917552, term917552.getClass(), "currentTracer", null);
        setField(term917552, term917552.getClass(), "currentPassName", null);
        setField(term917552, term917552.getClass(), "recentChange", null);
        setField(term917552, term917552.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getModuleGraph", argTypes, term173457, args);
        assertTrue(recursiveEquals(term173457, term917552));
        assertTrue(recursiveEquals(retValue, null));
    }

};


