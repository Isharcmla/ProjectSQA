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

public class Compiler_parseSyntheticCode_823448345242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204133;

    public Compiler_parseSyntheticCode_823448345242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204133 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term204133, term204133.getClass(), "options", null);
        setField(term204133, term204133.getClass(), "passes", null);
        setField(term204133, term204133.getClass(), "externs", null);
        setField(term204133, term204133.getClass(), "modules", null);
        setField(term204133, term204133.getClass(), "moduleGraph", null);
        setField(term204133, term204133.getClass(), "inputs", null);
        setField(term204133, term204133.getClass(), "errorManager", null);
        setField(term204133, term204133.getClass(), "symbolTable", null);
        setField(term204133, term204133.getClass(), "externsRoot", null);
        setField(term204133, term204133.getClass(), "jsRoot", null);
        setField(term204133, term204133.getClass(), "externAndJsRoot", null);
        setField(term204133, term204133.getClass(), "inputsByName", null);
        setField(term204133, term204133.getClass(), "sourceMap", null);
        setField(term204133, term204133.getClass(), "externExports", null);
        setIntField(term204133, term204133.getClass(), "uniqueNameId", 0);
        setBooleanField(term204133, term204133.getClass(), "normalized", false);
        setBooleanField(term204133, term204133.getClass(), "useThreads", false);
        setField(term204133, term204133.getClass(), "functionInformationMap", null);
        setField(term204133, term204133.getClass(), "debugLog", null);
        setField(term204133, term204133.getClass(), "defaultCodingConvention", null);
        setField(term204133, term204133.getClass(), "typeRegistry", null);
        setField(term204133, term204133.getClass(), "parserConfig", null);
        setField(term204133, term204133.getClass(), "abstractInterpreter", null);
        setField(term204133, term204133.getClass(), "typeValidator", null);
        setField(term204133, term204133.getClass(), "tracker", null);
        setField(term204133, term204133.getClass(), "oldErrorReporter", null);
        setField(term204133, term204133.getClass(), "defaultErrorReporter", null);
        setField(term204133, term204133.getClass(), "outStream", null);
        setField(term204133, term204133.getClass(), "sanityCheck", null);
        setField(term204133, term204133.getClass(), "currentTracer", null);
        setField(term204133, term204133.getClass(), "currentPassName", null);
        setField(term204133, term204133.getClass(), "recentChange", null);
        setField(term204133, term204133.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "parseSyntheticCode", argTypes, term204133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


