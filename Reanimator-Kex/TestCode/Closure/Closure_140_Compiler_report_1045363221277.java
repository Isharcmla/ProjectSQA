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

public class Compiler_report_1045363221277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281200;

    public Compiler_report_1045363221277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281200 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term281200, term281200.getClass(), "options", null);
        setField(term281200, term281200.getClass(), "passes", null);
        setField(term281200, term281200.getClass(), "externs", null);
        setField(term281200, term281200.getClass(), "modules", null);
        setField(term281200, term281200.getClass(), "moduleGraph", null);
        setField(term281200, term281200.getClass(), "inputs", null);
        setField(term281200, term281200.getClass(), "errorManager", null);
        setField(term281200, term281200.getClass(), "symbolTable", null);
        setField(term281200, term281200.getClass(), "externsRoot", null);
        setField(term281200, term281200.getClass(), "jsRoot", null);
        setField(term281200, term281200.getClass(), "externAndJsRoot", null);
        setField(term281200, term281200.getClass(), "inputsByName", null);
        setField(term281200, term281200.getClass(), "sourceMap", null);
        setField(term281200, term281200.getClass(), "externExports", null);
        setIntField(term281200, term281200.getClass(), "uniqueNameId", 0);
        setBooleanField(term281200, term281200.getClass(), "normalized", false);
        setBooleanField(term281200, term281200.getClass(), "useThreads", false);
        setField(term281200, term281200.getClass(), "functionInformationMap", null);
        setField(term281200, term281200.getClass(), "debugLog", null);
        setField(term281200, term281200.getClass(), "defaultCodingConvention", null);
        setField(term281200, term281200.getClass(), "typeRegistry", null);
        setField(term281200, term281200.getClass(), "parserConfig", null);
        setField(term281200, term281200.getClass(), "abstractInterpreter", null);
        setField(term281200, term281200.getClass(), "typeValidator", null);
        setField(term281200, term281200.getClass(), "tracker", null);
        setField(term281200, term281200.getClass(), "oldErrorReporter", null);
        setField(term281200, term281200.getClass(), "defaultErrorReporter", null);
        setField(term281200, term281200.getClass(), "outStream", null);
        setField(term281200, term281200.getClass(), "sanityCheck", null);
        setField(term281200, term281200.getClass(), "currentTracer", null);
        setField(term281200, term281200.getClass(), "currentPassName", null);
        setField(term281200, term281200.getClass(), "recentChange", null);
        setField(term281200, term281200.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "report", argTypes, term281200, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


