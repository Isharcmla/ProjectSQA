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

public class AbstractCommandLineRunner_writeOutput_1967611700167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141962;
     Object term142042;
     Object term145333;
     Object term145334;

    public AbstractCommandLineRunner_writeOutput_1967611700167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141962 = newInstance(Class.forName("java.io.PrintStream"));
        term142042 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term145333 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term145333, term145333.getClass(), "autoFlush", false);
        setBooleanField(term145333, term145333.getClass(), "trouble", true);
        setField(term145333, term145333.getClass(), "formatter", null);
        setField(term145333, term145333.getClass(), "textOut", null);
        setField(term145333, term145333.getClass(), "charOut", null);
        setBooleanField(term145333, term145333.getClass(), "closing", false);
        setField(term145333, term145333.getClass(), "out", null);
        setBooleanField(term145333, term145333.getClass(), "closed", false);
        setField(term145333, term145333.getClass(), "closeLock", null);
        term145334 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term145334, term145334.getClass(), "options", null);
        setField(term145334, term145334.getClass(), "passes", null);
        setField(term145334, term145334.getClass(), "externs", null);
        setField(term145334, term145334.getClass(), "modules", null);
        setField(term145334, term145334.getClass(), "moduleGraph", null);
        setField(term145334, term145334.getClass(), "inputs", null);
        setField(term145334, term145334.getClass(), "errorManager", null);
        setField(term145334, term145334.getClass(), "warningsGuard", null);
        setField(term145334, term145334.getClass(), "externsRoot", null);
        setField(term145334, term145334.getClass(), "jsRoot", null);
        setField(term145334, term145334.getClass(), "externAndJsRoot", null);
        setField(term145334, term145334.getClass(), "inputsByName", null);
        setField(term145334, term145334.getClass(), "sourceMap", null);
        setField(term145334, term145334.getClass(), "externExports", null);
        setIntField(term145334, term145334.getClass(), "uniqueNameId", 0);
        setBooleanField(term145334, term145334.getClass(), "useThreads", false);
        setBooleanField(term145334, term145334.getClass(), "hasRegExpGlobalReferences", false);
        setField(term145334, term145334.getClass(), "functionInformationMap", null);
        setField(term145334, term145334.getClass(), "debugLog", null);
        setField(term145334, term145334.getClass(), "defaultCodingConvention", null);
        setField(term145334, term145334.getClass(), "typeRegistry", null);
        setField(term145334, term145334.getClass(), "parserConfig", null);
        setField(term145334, term145334.getClass(), "abstractInterpreter", null);
        setField(term145334, term145334.getClass(), "typeValidator", null);
        setField(term145334, term145334.getClass(), "tracker", null);
        setField(term145334, term145334.getClass(), "oldErrorReporter", null);
        setField(term145334, term145334.getClass(), "defaultErrorReporter", null);
        setField(term145334, term145334.getClass(), "outStream", null);
        setField(term145334, term145334.getClass(), "sanityCheck", null);
        setField(term145334, term145334.getClass(), "currentTracer", null);
        setField(term145334, term145334.getClass(), "currentPassName", null);
        setField(term145334, term145334.getClass(), "recentChange", null);
        setField(term145334, term145334.getClass(), "codeChangeHandlers", null);
        setField(term145334, term145334.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term141962;
        args[1] = term142042;
        args[2] = null;
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term141962, term145333));
        assertTrue(recursiveEquals(term142042, term145334));
    }

};


