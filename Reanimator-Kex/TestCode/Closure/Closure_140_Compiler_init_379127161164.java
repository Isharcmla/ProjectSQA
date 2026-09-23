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

public class Compiler_init_379127161164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17578;

    public Compiler_init_379127161164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17578 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17578, term17578.getClass(), "options", null);
        setField(term17578, term17578.getClass(), "passes", null);
        setField(term17578, term17578.getClass(), "externs", null);
        setField(term17578, term17578.getClass(), "modules", null);
        setField(term17578, term17578.getClass(), "moduleGraph", null);
        setField(term17578, term17578.getClass(), "inputs", null);
        setField(term17578, term17578.getClass(), "errorManager", null);
        setField(term17578, term17578.getClass(), "symbolTable", null);
        setField(term17578, term17578.getClass(), "externsRoot", null);
        setField(term17578, term17578.getClass(), "jsRoot", null);
        setField(term17578, term17578.getClass(), "externAndJsRoot", null);
        setField(term17578, term17578.getClass(), "inputsByName", null);
        setField(term17578, term17578.getClass(), "sourceMap", null);
        setField(term17578, term17578.getClass(), "externExports", null);
        setIntField(term17578, term17578.getClass(), "uniqueNameId", 0);
        setBooleanField(term17578, term17578.getClass(), "normalized", false);
        setBooleanField(term17578, term17578.getClass(), "useThreads", false);
        setField(term17578, term17578.getClass(), "functionInformationMap", null);
        setField(term17578, term17578.getClass(), "debugLog", null);
        setField(term17578, term17578.getClass(), "defaultCodingConvention", null);
        setField(term17578, term17578.getClass(), "typeRegistry", null);
        setField(term17578, term17578.getClass(), "parserConfig", null);
        setField(term17578, term17578.getClass(), "abstractInterpreter", null);
        setField(term17578, term17578.getClass(), "typeValidator", null);
        setField(term17578, term17578.getClass(), "tracker", null);
        setField(term17578, term17578.getClass(), "oldErrorReporter", null);
        setField(term17578, term17578.getClass(), "defaultErrorReporter", null);
        setField(term17578, term17578.getClass(), "outStream", null);
        setField(term17578, term17578.getClass(), "sanityCheck", null);
        setField(term17578, term17578.getClass(), "currentTracer", null);
        setField(term17578, term17578.getClass(), "currentPassName", null);
        setField(term17578, term17578.getClass(), "recentChange", null);
        setField(term17578, term17578.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "init", argTypes, term17578, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


