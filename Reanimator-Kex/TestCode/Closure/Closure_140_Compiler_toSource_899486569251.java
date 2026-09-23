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

public class Compiler_toSource_899486569251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228887;

    public Compiler_toSource_899486569251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228887 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term228887, term228887.getClass(), "options", null);
        setField(term228887, term228887.getClass(), "passes", null);
        setField(term228887, term228887.getClass(), "externs", null);
        setField(term228887, term228887.getClass(), "modules", null);
        setField(term228887, term228887.getClass(), "moduleGraph", null);
        setField(term228887, term228887.getClass(), "inputs", null);
        setField(term228887, term228887.getClass(), "errorManager", null);
        setField(term228887, term228887.getClass(), "symbolTable", null);
        setField(term228887, term228887.getClass(), "externsRoot", null);
        setField(term228887, term228887.getClass(), "jsRoot", null);
        setField(term228887, term228887.getClass(), "externAndJsRoot", null);
        setField(term228887, term228887.getClass(), "inputsByName", null);
        setField(term228887, term228887.getClass(), "sourceMap", null);
        setField(term228887, term228887.getClass(), "externExports", null);
        setIntField(term228887, term228887.getClass(), "uniqueNameId", 0);
        setBooleanField(term228887, term228887.getClass(), "normalized", false);
        setBooleanField(term228887, term228887.getClass(), "useThreads", false);
        setField(term228887, term228887.getClass(), "functionInformationMap", null);
        setField(term228887, term228887.getClass(), "debugLog", null);
        setField(term228887, term228887.getClass(), "defaultCodingConvention", null);
        setField(term228887, term228887.getClass(), "typeRegistry", null);
        setField(term228887, term228887.getClass(), "parserConfig", null);
        setField(term228887, term228887.getClass(), "abstractInterpreter", null);
        setField(term228887, term228887.getClass(), "typeValidator", null);
        setField(term228887, term228887.getClass(), "tracker", null);
        setField(term228887, term228887.getClass(), "oldErrorReporter", null);
        setField(term228887, term228887.getClass(), "defaultErrorReporter", null);
        setField(term228887, term228887.getClass(), "outStream", null);
        setField(term228887, term228887.getClass(), "sanityCheck", null);
        setField(term228887, term228887.getClass(), "currentTracer", null);
        setField(term228887, term228887.getClass(), "currentPassName", null);
        setField(term228887, term228887.getClass(), "recentChange", null);
        setField(term228887, term228887.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "toSource", argTypes, term228887, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


