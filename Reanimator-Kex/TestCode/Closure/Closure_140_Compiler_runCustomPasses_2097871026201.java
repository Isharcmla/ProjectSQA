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

public class Compiler_runCustomPasses_2097871026201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112183;

    public Compiler_runCustomPasses_2097871026201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112183 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term112183, term112183.getClass(), "options", null);
        setField(term112183, term112183.getClass(), "passes", null);
        setField(term112183, term112183.getClass(), "externs", null);
        setField(term112183, term112183.getClass(), "modules", null);
        setField(term112183, term112183.getClass(), "moduleGraph", null);
        setField(term112183, term112183.getClass(), "inputs", null);
        setField(term112183, term112183.getClass(), "errorManager", null);
        setField(term112183, term112183.getClass(), "symbolTable", null);
        setField(term112183, term112183.getClass(), "externsRoot", null);
        setField(term112183, term112183.getClass(), "jsRoot", null);
        setField(term112183, term112183.getClass(), "externAndJsRoot", null);
        setField(term112183, term112183.getClass(), "inputsByName", null);
        setField(term112183, term112183.getClass(), "sourceMap", null);
        setField(term112183, term112183.getClass(), "externExports", null);
        setIntField(term112183, term112183.getClass(), "uniqueNameId", 0);
        setBooleanField(term112183, term112183.getClass(), "normalized", false);
        setBooleanField(term112183, term112183.getClass(), "useThreads", false);
        setField(term112183, term112183.getClass(), "functionInformationMap", null);
        setField(term112183, term112183.getClass(), "debugLog", null);
        setField(term112183, term112183.getClass(), "defaultCodingConvention", null);
        setField(term112183, term112183.getClass(), "typeRegistry", null);
        setField(term112183, term112183.getClass(), "parserConfig", null);
        setField(term112183, term112183.getClass(), "abstractInterpreter", null);
        setField(term112183, term112183.getClass(), "typeValidator", null);
        setField(term112183, term112183.getClass(), "tracker", null);
        setField(term112183, term112183.getClass(), "oldErrorReporter", null);
        setField(term112183, term112183.getClass(), "defaultErrorReporter", null);
        setField(term112183, term112183.getClass(), "outStream", null);
        setField(term112183, term112183.getClass(), "sanityCheck", null);
        setField(term112183, term112183.getClass(), "currentTracer", null);
        setField(term112183, term112183.getClass(), "currentPassName", null);
        setField(term112183, term112183.getClass(), "recentChange", null);
        setField(term112183, term112183.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CustomPassExecutionTime");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "runCustomPasses", argTypes, term112183, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


