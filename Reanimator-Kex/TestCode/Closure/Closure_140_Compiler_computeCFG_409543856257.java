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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Compiler_computeCFG_409543856257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247177;

    public Compiler_computeCFG_409543856257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247177 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term247177, term247177.getClass(), "options", null);
        setField(term247177, term247177.getClass(), "passes", null);
        setField(term247177, term247177.getClass(), "externs", null);
        setField(term247177, term247177.getClass(), "modules", null);
        setField(term247177, term247177.getClass(), "moduleGraph", null);
        setField(term247177, term247177.getClass(), "inputs", null);
        setField(term247177, term247177.getClass(), "errorManager", null);
        setField(term247177, term247177.getClass(), "symbolTable", null);
        setField(term247177, term247177.getClass(), "externsRoot", null);
        setField(term247177, term247177.getClass(), "jsRoot", null);
        setField(term247177, term247177.getClass(), "externAndJsRoot", null);
        setField(term247177, term247177.getClass(), "inputsByName", null);
        setField(term247177, term247177.getClass(), "sourceMap", null);
        setField(term247177, term247177.getClass(), "externExports", null);
        setIntField(term247177, term247177.getClass(), "uniqueNameId", 0);
        setBooleanField(term247177, term247177.getClass(), "normalized", false);
        setBooleanField(term247177, term247177.getClass(), "useThreads", false);
        setField(term247177, term247177.getClass(), "functionInformationMap", null);
        setField(term247177, term247177.getClass(), "debugLog", null);
        setField(term247177, term247177.getClass(), "defaultCodingConvention", null);
        setField(term247177, term247177.getClass(), "typeRegistry", null);
        setField(term247177, term247177.getClass(), "parserConfig", null);
        setField(term247177, term247177.getClass(), "abstractInterpreter", null);
        setField(term247177, term247177.getClass(), "typeValidator", null);
        setField(term247177, term247177.getClass(), "tracker", null);
        setField(term247177, term247177.getClass(), "oldErrorReporter", null);
        setField(term247177, term247177.getClass(), "defaultErrorReporter", null);
        setField(term247177, term247177.getClass(), "outStream", null);
        setField(term247177, term247177.getClass(), "sanityCheck", null);
        setField(term247177, term247177.getClass(), "currentTracer", null);
        setField(term247177, term247177.getClass(), "currentPassName", null);
        setField(term247177, term247177.getClass(), "recentChange", null);
        setField(term247177, term247177.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "computeCFG", argTypes, term247177, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


