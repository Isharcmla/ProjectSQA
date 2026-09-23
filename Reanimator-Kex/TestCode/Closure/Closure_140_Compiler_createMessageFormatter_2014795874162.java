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

public class Compiler_createMessageFormatter_2014795874162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9839;

    public Compiler_createMessageFormatter_2014795874162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9839 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9839, term9839.getClass(), "options", null);
        setField(term9839, term9839.getClass(), "passes", null);
        setField(term9839, term9839.getClass(), "externs", null);
        setField(term9839, term9839.getClass(), "modules", null);
        setField(term9839, term9839.getClass(), "moduleGraph", null);
        setField(term9839, term9839.getClass(), "inputs", null);
        setField(term9839, term9839.getClass(), "errorManager", null);
        setField(term9839, term9839.getClass(), "symbolTable", null);
        setField(term9839, term9839.getClass(), "externsRoot", null);
        setField(term9839, term9839.getClass(), "jsRoot", null);
        setField(term9839, term9839.getClass(), "externAndJsRoot", null);
        setField(term9839, term9839.getClass(), "inputsByName", null);
        setField(term9839, term9839.getClass(), "sourceMap", null);
        setField(term9839, term9839.getClass(), "externExports", null);
        setIntField(term9839, term9839.getClass(), "uniqueNameId", 0);
        setBooleanField(term9839, term9839.getClass(), "normalized", false);
        setBooleanField(term9839, term9839.getClass(), "useThreads", false);
        setField(term9839, term9839.getClass(), "functionInformationMap", null);
        setField(term9839, term9839.getClass(), "debugLog", null);
        setField(term9839, term9839.getClass(), "defaultCodingConvention", null);
        setField(term9839, term9839.getClass(), "typeRegistry", null);
        setField(term9839, term9839.getClass(), "parserConfig", null);
        setField(term9839, term9839.getClass(), "abstractInterpreter", null);
        setField(term9839, term9839.getClass(), "typeValidator", null);
        setField(term9839, term9839.getClass(), "tracker", null);
        setField(term9839, term9839.getClass(), "oldErrorReporter", null);
        setField(term9839, term9839.getClass(), "defaultErrorReporter", null);
        setField(term9839, term9839.getClass(), "outStream", null);
        setField(term9839, term9839.getClass(), "sanityCheck", null);
        setField(term9839, term9839.getClass(), "currentTracer", null);
        setField(term9839, term9839.getClass(), "currentPassName", null);
        setField(term9839, term9839.getClass(), "recentChange", null);
        setField(term9839, term9839.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createMessageFormatter", argTypes, term9839, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


