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

public class AbstractCommandLineRunner_writeOutput_1909515435109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174001;
     Object term174081;
     Object term177395;
     Object term177396;

    public AbstractCommandLineRunner_writeOutput_1909515435109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174001 = newInstance(Class.forName("java.io.PrintStream"));
        term174081 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term177395 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term177395, term177395.getClass(), "autoFlush", false);
        setBooleanField(term177395, term177395.getClass(), "trouble", true);
        setField(term177395, term177395.getClass(), "formatter", null);
        setField(term177395, term177395.getClass(), "textOut", null);
        setField(term177395, term177395.getClass(), "charOut", null);
        setBooleanField(term177395, term177395.getClass(), "closing", false);
        setField(term177395, term177395.getClass(), "out", null);
        setBooleanField(term177395, term177395.getClass(), "closed", false);
        setField(term177395, term177395.getClass(), "closeLock", null);
        term177396 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term177396, term177396.getClass(), "options", null);
        setField(term177396, term177396.getClass(), "passes", null);
        setField(term177396, term177396.getClass(), "externs", null);
        setField(term177396, term177396.getClass(), "modules", null);
        setField(term177396, term177396.getClass(), "moduleGraph", null);
        setField(term177396, term177396.getClass(), "inputs", null);
        setField(term177396, term177396.getClass(), "errorManager", null);
        setField(term177396, term177396.getClass(), "symbolTable", null);
        setField(term177396, term177396.getClass(), "externsRoot", null);
        setField(term177396, term177396.getClass(), "jsRoot", null);
        setField(term177396, term177396.getClass(), "externAndJsRoot", null);
        setField(term177396, term177396.getClass(), "inputsByName", null);
        setField(term177396, term177396.getClass(), "sourceMap", null);
        setField(term177396, term177396.getClass(), "externExports", null);
        setIntField(term177396, term177396.getClass(), "uniqueNameId", 0);
        setBooleanField(term177396, term177396.getClass(), "normalized", false);
        setBooleanField(term177396, term177396.getClass(), "useThreads", false);
        setField(term177396, term177396.getClass(), "functionInformationMap", null);
        setField(term177396, term177396.getClass(), "debugLog", null);
        setField(term177396, term177396.getClass(), "defaultCodingConvention", null);
        setField(term177396, term177396.getClass(), "typeRegistry", null);
        setField(term177396, term177396.getClass(), "parserConfig", null);
        setField(term177396, term177396.getClass(), "abstractInterpreter", null);
        setField(term177396, term177396.getClass(), "typeValidator", null);
        setField(term177396, term177396.getClass(), "tracker", null);
        setField(term177396, term177396.getClass(), "oldErrorReporter", null);
        setField(term177396, term177396.getClass(), "defaultErrorReporter", null);
        setField(term177396, term177396.getClass(), "outStream", null);
        setField(term177396, term177396.getClass(), "sanityCheck", null);
        setField(term177396, term177396.getClass(), "currentTracer", null);
        setField(term177396, term177396.getClass(), "currentPassName", null);
        setField(term177396, term177396.getClass(), "recentChange", null);
        setField(term177396, term177396.getClass(), "codeChangeHandlers", null);
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
        args[0] = term174001;
        args[1] = term174081;
        args[2] = null;
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    \u0001       ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term174001, term177395));
        assertTrue(recursiveEquals(term174081, term177396));
    }

};


