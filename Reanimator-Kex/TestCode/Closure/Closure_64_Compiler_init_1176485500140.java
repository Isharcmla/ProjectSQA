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

public class Compiler_init_1176485500140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30060;

    public Compiler_init_1176485500140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30060 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30060, term30060.getClass(), "options", null);
        setField(term30060, term30060.getClass(), "passes", null);
        setField(term30060, term30060.getClass(), "externs", null);
        setField(term30060, term30060.getClass(), "modules", null);
        setField(term30060, term30060.getClass(), "moduleGraph", null);
        setField(term30060, term30060.getClass(), "inputs", null);
        setField(term30060, term30060.getClass(), "errorManager", null);
        setField(term30060, term30060.getClass(), "warningsGuard", null);
        setField(term30060, term30060.getClass(), "externsRoot", null);
        setField(term30060, term30060.getClass(), "jsRoot", null);
        setField(term30060, term30060.getClass(), "externAndJsRoot", null);
        setField(term30060, term30060.getClass(), "inputsByName", null);
        setField(term30060, term30060.getClass(), "sourceMap", null);
        setField(term30060, term30060.getClass(), "externExports", null);
        setIntField(term30060, term30060.getClass(), "uniqueNameId", 0);
        setBooleanField(term30060, term30060.getClass(), "useThreads", false);
        setBooleanField(term30060, term30060.getClass(), "hasRegExpGlobalReferences", false);
        setField(term30060, term30060.getClass(), "functionInformationMap", null);
        setField(term30060, term30060.getClass(), "debugLog", null);
        setField(term30060, term30060.getClass(), "defaultCodingConvention", null);
        setField(term30060, term30060.getClass(), "typeRegistry", null);
        setField(term30060, term30060.getClass(), "parserConfig", null);
        setField(term30060, term30060.getClass(), "abstractInterpreter", null);
        setField(term30060, term30060.getClass(), "typeValidator", null);
        setField(term30060, term30060.getClass(), "tracker", null);
        setField(term30060, term30060.getClass(), "oldErrorReporter", null);
        setField(term30060, term30060.getClass(), "defaultErrorReporter", null);
        setField(term30060, term30060.getClass(), "outStream", null);
        setField(term30060, term30060.getClass(), "globalRefMap", null);
        setField(term30060, term30060.getClass(), "sanityCheck", null);
        setField(term30060, term30060.getClass(), "currentTracer", null);
        setField(term30060, term30060.getClass(), "currentPassName", null);
        setField(term30060, term30060.getClass(), "recentChange", null);
        setField(term30060, term30060.getClass(), "codeChangeHandlers", null);
        setField(term30060, term30060.getClass(), "stage", null);
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
            callMethod(klass, "init", argTypes, term30060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


