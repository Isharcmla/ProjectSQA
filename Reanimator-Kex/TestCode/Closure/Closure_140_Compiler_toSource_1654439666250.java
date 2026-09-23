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
import java.lang.Integer;

public class Compiler_toSource_1654439666250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225697;
     Object term225701;

    public Compiler_toSource_1654439666250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225697 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term225697, term225697.getClass(), "options", null);
        setField(term225697, term225697.getClass(), "passes", null);
        setField(term225697, term225697.getClass(), "externs", null);
        setField(term225697, term225697.getClass(), "modules", null);
        setField(term225697, term225697.getClass(), "moduleGraph", null);
        setField(term225697, term225697.getClass(), "inputs", null);
        setField(term225697, term225697.getClass(), "errorManager", null);
        setField(term225697, term225697.getClass(), "symbolTable", null);
        setField(term225697, term225697.getClass(), "externsRoot", null);
        setField(term225697, term225697.getClass(), "jsRoot", null);
        setField(term225697, term225697.getClass(), "externAndJsRoot", null);
        setField(term225697, term225697.getClass(), "inputsByName", null);
        setField(term225697, term225697.getClass(), "sourceMap", null);
        setField(term225697, term225697.getClass(), "externExports", null);
        setIntField(term225697, term225697.getClass(), "uniqueNameId", 0);
        setBooleanField(term225697, term225697.getClass(), "normalized", false);
        setBooleanField(term225697, term225697.getClass(), "useThreads", false);
        setField(term225697, term225697.getClass(), "functionInformationMap", null);
        setField(term225697, term225697.getClass(), "debugLog", null);
        setField(term225697, term225697.getClass(), "defaultCodingConvention", null);
        setField(term225697, term225697.getClass(), "typeRegistry", null);
        setField(term225697, term225697.getClass(), "parserConfig", null);
        setField(term225697, term225697.getClass(), "abstractInterpreter", null);
        setField(term225697, term225697.getClass(), "typeValidator", null);
        setField(term225697, term225697.getClass(), "tracker", null);
        setField(term225697, term225697.getClass(), "oldErrorReporter", null);
        setField(term225697, term225697.getClass(), "defaultErrorReporter", null);
        setField(term225697, term225697.getClass(), "outStream", null);
        setField(term225697, term225697.getClass(), "sanityCheck", null);
        setField(term225697, term225697.getClass(), "currentTracer", null);
        setField(term225697, term225697.getClass(), "currentPassName", null);
        setField(term225697, term225697.getClass(), "recentChange", null);
        setField(term225697, term225697.getClass(), "codeChangeHandlers", null);
        term225701 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Compiler$CodeBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term225701;
        args[2] = null;
        try {
            callMethod(klass, "toSource", argTypes, term225697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


