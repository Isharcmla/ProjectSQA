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

public class AbstractCommandLineRunner_writeOutput_190951543599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159911;
     Object term159991;
     Object term162371;
     Object term162372;

    public AbstractCommandLineRunner_writeOutput_190951543599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159911 = newInstance(Class.forName("java.io.PrintStream"));
        term159991 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term162371 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term162371, term162371.getClass(), "options", null);
        setField(term162371, term162371.getClass(), "passes", null);
        setField(term162371, term162371.getClass(), "externs", null);
        setField(term162371, term162371.getClass(), "modules", null);
        setField(term162371, term162371.getClass(), "moduleGraph", null);
        setField(term162371, term162371.getClass(), "inputs", null);
        setField(term162371, term162371.getClass(), "errorManager", null);
        setField(term162371, term162371.getClass(), "symbolTable", null);
        setField(term162371, term162371.getClass(), "externsRoot", null);
        setField(term162371, term162371.getClass(), "jsRoot", null);
        setField(term162371, term162371.getClass(), "externAndJsRoot", null);
        setField(term162371, term162371.getClass(), "inputsByName", null);
        setField(term162371, term162371.getClass(), "sourceMap", null);
        setField(term162371, term162371.getClass(), "externExports", null);
        setIntField(term162371, term162371.getClass(), "uniqueNameId", 0);
        setBooleanField(term162371, term162371.getClass(), "normalized", false);
        setBooleanField(term162371, term162371.getClass(), "useThreads", false);
        setField(term162371, term162371.getClass(), "functionInformationMap", null);
        setField(term162371, term162371.getClass(), "debugLog", null);
        setField(term162371, term162371.getClass(), "defaultCodingConvention", null);
        setField(term162371, term162371.getClass(), "typeRegistry", null);
        setField(term162371, term162371.getClass(), "parserConfig", null);
        setField(term162371, term162371.getClass(), "abstractInterpreter", null);
        setField(term162371, term162371.getClass(), "typeValidator", null);
        setField(term162371, term162371.getClass(), "tracker", null);
        setField(term162371, term162371.getClass(), "oldErrorReporter", null);
        setField(term162371, term162371.getClass(), "defaultErrorReporter", null);
        setField(term162371, term162371.getClass(), "outStream", null);
        setField(term162371, term162371.getClass(), "sanityCheck", null);
        setField(term162371, term162371.getClass(), "currentTracer", null);
        setField(term162371, term162371.getClass(), "currentPassName", null);
        setField(term162371, term162371.getClass(), "recentChange", null);
        setField(term162371, term162371.getClass(), "codeChangeHandlers", null);
        term162372 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term162372, term162372.getClass(), "autoFlush", false);
        setBooleanField(term162372, term162372.getClass(), "trouble", true);
        setField(term162372, term162372.getClass(), "formatter", null);
        setField(term162372, term162372.getClass(), "textOut", null);
        setField(term162372, term162372.getClass(), "charOut", null);
        setBooleanField(term162372, term162372.getClass(), "closing", false);
        setField(term162372, term162372.getClass(), "out", null);
        setBooleanField(term162372, term162372.getClass(), "closed", false);
        setField(term162372, term162372.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.io.PrintStream");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term159911;
        args[1] = term159991;
        args[2] = null;
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term159911, term162371));
        assertTrue(recursiveEquals(term159991, term162372));
    }

};


