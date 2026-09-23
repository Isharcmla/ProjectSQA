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

public class Compiler_compile_1454989051154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88217;

    public Compiler_compile_1454989051154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88217 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term88217, term88217.getClass(), "options", null);
        setField(term88217, term88217.getClass(), "passes", null);
        setField(term88217, term88217.getClass(), "externs", null);
        setField(term88217, term88217.getClass(), "modules", null);
        setField(term88217, term88217.getClass(), "moduleGraph", null);
        setField(term88217, term88217.getClass(), "inputs", null);
        setField(term88217, term88217.getClass(), "errorManager", null);
        setField(term88217, term88217.getClass(), "warningsGuard", null);
        setField(term88217, term88217.getClass(), "externsRoot", null);
        setField(term88217, term88217.getClass(), "jsRoot", null);
        setField(term88217, term88217.getClass(), "externAndJsRoot", null);
        setField(term88217, term88217.getClass(), "inputsByName", null);
        setField(term88217, term88217.getClass(), "sourceMap", null);
        setField(term88217, term88217.getClass(), "externExports", null);
        setIntField(term88217, term88217.getClass(), "uniqueNameId", 0);
        setBooleanField(term88217, term88217.getClass(), "useThreads", false);
        setBooleanField(term88217, term88217.getClass(), "hasRegExpGlobalReferences", false);
        setField(term88217, term88217.getClass(), "functionInformationMap", null);
        setField(term88217, term88217.getClass(), "debugLog", null);
        setField(term88217, term88217.getClass(), "defaultCodingConvention", null);
        setField(term88217, term88217.getClass(), "typeRegistry", null);
        setField(term88217, term88217.getClass(), "parserConfig", null);
        setField(term88217, term88217.getClass(), "abstractInterpreter", null);
        setField(term88217, term88217.getClass(), "typeValidator", null);
        setField(term88217, term88217.getClass(), "tracker", null);
        setField(term88217, term88217.getClass(), "oldErrorReporter", null);
        setField(term88217, term88217.getClass(), "defaultErrorReporter", null);
        setField(term88217, term88217.getClass(), "outStream", null);
        setField(term88217, term88217.getClass(), "globalRefMap", null);
        setField(term88217, term88217.getClass(), "sanityCheck", null);
        setField(term88217, term88217.getClass(), "currentTracer", null);
        setField(term88217, term88217.getClass(), "currentPassName", null);
        setField(term88217, term88217.getClass(), "recentChange", null);
        setField(term88217, term88217.getClass(), "codeChangeHandlers", null);
        setField(term88217, term88217.getClass(), "stage", null);
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
            callMethod(klass, "compile", argTypes, term88217, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


