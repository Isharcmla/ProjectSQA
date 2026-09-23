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

public class AbstractCommandLineRunner_writeOutput_1967611700171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148577;
     Object term148657;
     Object term148754;
     Object term148755;

    public AbstractCommandLineRunner_writeOutput_1967611700171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148577 = newInstance(Class.forName("java.io.PrintStream"));
        term148657 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term148754 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term148754, term148754.getClass(), "options", null);
        setField(term148754, term148754.getClass(), "passes", null);
        setField(term148754, term148754.getClass(), "externs", null);
        setField(term148754, term148754.getClass(), "modules", null);
        setField(term148754, term148754.getClass(), "moduleGraph", null);
        setField(term148754, term148754.getClass(), "inputs", null);
        setField(term148754, term148754.getClass(), "errorManager", null);
        setField(term148754, term148754.getClass(), "warningsGuard", null);
        setField(term148754, term148754.getClass(), "externsRoot", null);
        setField(term148754, term148754.getClass(), "jsRoot", null);
        setField(term148754, term148754.getClass(), "externAndJsRoot", null);
        setField(term148754, term148754.getClass(), "inputsByName", null);
        setField(term148754, term148754.getClass(), "sourceMap", null);
        setField(term148754, term148754.getClass(), "externExports", null);
        setIntField(term148754, term148754.getClass(), "uniqueNameId", 0);
        setBooleanField(term148754, term148754.getClass(), "useThreads", false);
        setBooleanField(term148754, term148754.getClass(), "hasRegExpGlobalReferences", false);
        setField(term148754, term148754.getClass(), "functionInformationMap", null);
        setField(term148754, term148754.getClass(), "debugLog", null);
        setField(term148754, term148754.getClass(), "defaultCodingConvention", null);
        setField(term148754, term148754.getClass(), "typeRegistry", null);
        setField(term148754, term148754.getClass(), "parserConfig", null);
        setField(term148754, term148754.getClass(), "abstractInterpreter", null);
        setField(term148754, term148754.getClass(), "typeValidator", null);
        setField(term148754, term148754.getClass(), "tracker", null);
        setField(term148754, term148754.getClass(), "oldErrorReporter", null);
        setField(term148754, term148754.getClass(), "defaultErrorReporter", null);
        setField(term148754, term148754.getClass(), "outStream", null);
        setField(term148754, term148754.getClass(), "sanityCheck", null);
        setField(term148754, term148754.getClass(), "currentTracer", null);
        setField(term148754, term148754.getClass(), "currentPassName", null);
        setField(term148754, term148754.getClass(), "recentChange", null);
        setField(term148754, term148754.getClass(), "codeChangeHandlers", null);
        setField(term148754, term148754.getClass(), "stage", null);
        term148755 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term148755, term148755.getClass(), "autoFlush", false);
        setBooleanField(term148755, term148755.getClass(), "trouble", true);
        setField(term148755, term148755.getClass(), "formatter", null);
        setField(term148755, term148755.getClass(), "textOut", null);
        setField(term148755, term148755.getClass(), "charOut", null);
        setBooleanField(term148755, term148755.getClass(), "closing", false);
        setField(term148755, term148755.getClass(), "out", null);
        setBooleanField(term148755, term148755.getClass(), "closed", false);
        setField(term148755, term148755.getClass(), "closeLock", null);
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
        args[0] = term148577;
        args[1] = term148657;
        args[2] = null;
        args[3] = "\u0001";
        args[4] = "";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term148577, term148754));
        assertTrue(recursiveEquals(term148657, term148755));
    }

};


