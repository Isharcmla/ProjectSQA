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

public class Compiler_init_1176485500143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29465;

    public Compiler_init_1176485500143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29465 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29465, term29465.getClass(), "options", null);
        setField(term29465, term29465.getClass(), "passes", null);
        setField(term29465, term29465.getClass(), "externs", null);
        setField(term29465, term29465.getClass(), "modules", null);
        setField(term29465, term29465.getClass(), "moduleGraph", null);
        setField(term29465, term29465.getClass(), "inputs", null);
        setField(term29465, term29465.getClass(), "errorManager", null);
        setField(term29465, term29465.getClass(), "warningsGuard", null);
        setField(term29465, term29465.getClass(), "externsRoot", null);
        setField(term29465, term29465.getClass(), "jsRoot", null);
        setField(term29465, term29465.getClass(), "externAndJsRoot", null);
        setField(term29465, term29465.getClass(), "inputsByName", null);
        setField(term29465, term29465.getClass(), "sourceMap", null);
        setField(term29465, term29465.getClass(), "externExports", null);
        setIntField(term29465, term29465.getClass(), "uniqueNameId", 0);
        setBooleanField(term29465, term29465.getClass(), "useThreads", false);
        setBooleanField(term29465, term29465.getClass(), "hasRegExpGlobalReferences", false);
        setField(term29465, term29465.getClass(), "functionInformationMap", null);
        setField(term29465, term29465.getClass(), "debugLog", null);
        setField(term29465, term29465.getClass(), "defaultCodingConvention", null);
        setField(term29465, term29465.getClass(), "typeRegistry", null);
        setField(term29465, term29465.getClass(), "parserConfig", null);
        setField(term29465, term29465.getClass(), "abstractInterpreter", null);
        setField(term29465, term29465.getClass(), "typeValidator", null);
        setField(term29465, term29465.getClass(), "tracker", null);
        setField(term29465, term29465.getClass(), "oldErrorReporter", null);
        setField(term29465, term29465.getClass(), "defaultErrorReporter", null);
        setField(term29465, term29465.getClass(), "outStream", null);
        setField(term29465, term29465.getClass(), "globalRefMap", null);
        setField(term29465, term29465.getClass(), "sanityCheck", null);
        setField(term29465, term29465.getClass(), "currentTracer", null);
        setField(term29465, term29465.getClass(), "currentPassName", null);
        setField(term29465, term29465.getClass(), "recentChange", null);
        setField(term29465, term29465.getClass(), "codeChangeHandlers", null);
        setField(term29465, term29465.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "init", argTypes, term29465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


