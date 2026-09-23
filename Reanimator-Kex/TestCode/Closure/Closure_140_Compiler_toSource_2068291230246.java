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

public class Compiler_toSource_2068291230246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213308;

    public Compiler_toSource_2068291230246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213308 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term213308, term213308.getClass(), "options", null);
        setField(term213308, term213308.getClass(), "passes", null);
        setField(term213308, term213308.getClass(), "externs", null);
        setField(term213308, term213308.getClass(), "modules", null);
        setField(term213308, term213308.getClass(), "moduleGraph", null);
        setField(term213308, term213308.getClass(), "inputs", null);
        setField(term213308, term213308.getClass(), "errorManager", null);
        setField(term213308, term213308.getClass(), "symbolTable", null);
        setField(term213308, term213308.getClass(), "externsRoot", null);
        setField(term213308, term213308.getClass(), "jsRoot", null);
        setField(term213308, term213308.getClass(), "externAndJsRoot", null);
        setField(term213308, term213308.getClass(), "inputsByName", null);
        setField(term213308, term213308.getClass(), "sourceMap", null);
        setField(term213308, term213308.getClass(), "externExports", null);
        setIntField(term213308, term213308.getClass(), "uniqueNameId", 0);
        setBooleanField(term213308, term213308.getClass(), "normalized", false);
        setBooleanField(term213308, term213308.getClass(), "useThreads", false);
        setField(term213308, term213308.getClass(), "functionInformationMap", null);
        setField(term213308, term213308.getClass(), "debugLog", null);
        setField(term213308, term213308.getClass(), "defaultCodingConvention", null);
        setField(term213308, term213308.getClass(), "typeRegistry", null);
        setField(term213308, term213308.getClass(), "parserConfig", null);
        setField(term213308, term213308.getClass(), "abstractInterpreter", null);
        setField(term213308, term213308.getClass(), "typeValidator", null);
        setField(term213308, term213308.getClass(), "tracker", null);
        setField(term213308, term213308.getClass(), "oldErrorReporter", null);
        setField(term213308, term213308.getClass(), "defaultErrorReporter", null);
        setField(term213308, term213308.getClass(), "outStream", null);
        setField(term213308, term213308.getClass(), "sanityCheck", null);
        setField(term213308, term213308.getClass(), "currentTracer", null);
        setField(term213308, term213308.getClass(), "currentPassName", null);
        setField(term213308, term213308.getClass(), "recentChange", null);
        setField(term213308, term213308.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toSource", argTypes, term213308, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


