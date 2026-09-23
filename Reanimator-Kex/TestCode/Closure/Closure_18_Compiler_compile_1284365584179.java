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

public class Compiler_compile_1284365584179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996780;

    public Compiler_compile_1284365584179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996780 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996780, term996780.getClass(), "options", null);
        setField(term996780, term996780.getClass(), "passes", null);
        setField(term996780, term996780.getClass(), "externs", null);
        setField(term996780, term996780.getClass(), "modules", null);
        setField(term996780, term996780.getClass(), "moduleGraph", null);
        setField(term996780, term996780.getClass(), "inputs", null);
        setField(term996780, term996780.getClass(), "errorManager", null);
        setField(term996780, term996780.getClass(), "warningsGuard", null);
        setField(term996780, term996780.getClass(), "injectedLibraries", null);
        setField(term996780, term996780.getClass(), "externsRoot", null);
        setField(term996780, term996780.getClass(), "jsRoot", null);
        setField(term996780, term996780.getClass(), "externAndJsRoot", null);
        setField(term996780, term996780.getClass(), "inputsById", null);
        setField(term996780, term996780.getClass(), "sourceMap", null);
        setField(term996780, term996780.getClass(), "externExports", null);
        setIntField(term996780, term996780.getClass(), "uniqueNameId", 0);
        setBooleanField(term996780, term996780.getClass(), "useThreads", false);
        setBooleanField(term996780, term996780.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996780, term996780.getClass(), "functionInformationMap", null);
        setField(term996780, term996780.getClass(), "debugLog", null);
        setField(term996780, term996780.getClass(), "defaultCodingConvention", null);
        setField(term996780, term996780.getClass(), "typeRegistry", null);
        setField(term996780, term996780.getClass(), "parserConfig", null);
        setField(term996780, term996780.getClass(), "abstractInterpreter", null);
        setField(term996780, term996780.getClass(), "typeValidator", null);
        setField(term996780, term996780.getClass(), "tracker", null);
        setField(term996780, term996780.getClass(), "oldErrorReporter", null);
        setField(term996780, term996780.getClass(), "defaultErrorReporter", null);
        setField(term996780, term996780.getClass(), "outStream", null);
        setField(term996780, term996780.getClass(), "globalRefMap", null);
        setDoubleField(term996780, term996780.getClass(), "progress", 0.0);
        setField(term996780, term996780.getClass(), "sanityCheck", null);
        setField(term996780, term996780.getClass(), "currentTracer", null);
        setField(term996780, term996780.getClass(), "currentPassName", null);
        setIntField(term996780, term996780.getClass(), "syntheticCodeId", 0);
        setField(term996780, term996780.getClass(), "recentChange", null);
        setField(term996780, term996780.getClass(), "codeChangeHandlers", null);
        setField(term996780, term996780.getClass(), "synthesizedExternsInput", null);
        setField(term996780, term996780.getClass(), "stage", null);
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
        callMethod(klass, "compile", argTypes, term996780, args);
    }

};


