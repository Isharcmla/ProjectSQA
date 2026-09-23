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

public class Compiler_compile_1284365584153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896070;

    public Compiler_compile_1284365584153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896070 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896070, term896070.getClass(), "options", null);
        setField(term896070, term896070.getClass(), "passes", null);
        setField(term896070, term896070.getClass(), "externs", null);
        setField(term896070, term896070.getClass(), "modules", null);
        setField(term896070, term896070.getClass(), "moduleGraph", null);
        setField(term896070, term896070.getClass(), "inputs", null);
        setField(term896070, term896070.getClass(), "errorManager", null);
        setField(term896070, term896070.getClass(), "warningsGuard", null);
        setField(term896070, term896070.getClass(), "externsRoot", null);
        setField(term896070, term896070.getClass(), "jsRoot", null);
        setField(term896070, term896070.getClass(), "externAndJsRoot", null);
        setField(term896070, term896070.getClass(), "inputsByName", null);
        setField(term896070, term896070.getClass(), "sourceMap", null);
        setField(term896070, term896070.getClass(), "externExports", null);
        setIntField(term896070, term896070.getClass(), "uniqueNameId", 0);
        setBooleanField(term896070, term896070.getClass(), "useThreads", false);
        setBooleanField(term896070, term896070.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896070, term896070.getClass(), "functionInformationMap", null);
        setField(term896070, term896070.getClass(), "debugLog", null);
        setField(term896070, term896070.getClass(), "defaultCodingConvention", null);
        setField(term896070, term896070.getClass(), "typeRegistry", null);
        setField(term896070, term896070.getClass(), "parserConfig", null);
        setField(term896070, term896070.getClass(), "abstractInterpreter", null);
        setField(term896070, term896070.getClass(), "typeValidator", null);
        setField(term896070, term896070.getClass(), "tracker", null);
        setField(term896070, term896070.getClass(), "oldErrorReporter", null);
        setField(term896070, term896070.getClass(), "defaultErrorReporter", null);
        setField(term896070, term896070.getClass(), "outStream", null);
        setField(term896070, term896070.getClass(), "globalRefMap", null);
        setField(term896070, term896070.getClass(), "sanityCheck", null);
        setField(term896070, term896070.getClass(), "currentTracer", null);
        setField(term896070, term896070.getClass(), "currentPassName", null);
        setField(term896070, term896070.getClass(), "recentChange", null);
        setField(term896070, term896070.getClass(), "codeChangeHandlers", null);
        setField(term896070, term896070.getClass(), "stage", null);
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
        callMethod(klass, "compile", argTypes, term896070, args);
    }

};


