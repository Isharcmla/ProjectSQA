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

public class Compiler_compileModules_1815939217180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889853;

    public Compiler_compileModules_1815939217180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889853 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889853, term889853.getClass(), "options", null);
        setField(term889853, term889853.getClass(), "passes", null);
        setField(term889853, term889853.getClass(), "externs", null);
        setField(term889853, term889853.getClass(), "modules", null);
        setField(term889853, term889853.getClass(), "moduleGraph", null);
        setField(term889853, term889853.getClass(), "inputs", null);
        setField(term889853, term889853.getClass(), "errorManager", null);
        setField(term889853, term889853.getClass(), "warningsGuard", null);
        setField(term889853, term889853.getClass(), "injectedLibraries", null);
        setField(term889853, term889853.getClass(), "externsRoot", null);
        setField(term889853, term889853.getClass(), "jsRoot", null);
        setField(term889853, term889853.getClass(), "externAndJsRoot", null);
        setField(term889853, term889853.getClass(), "inputsById", null);
        setField(term889853, term889853.getClass(), "sourceMap", null);
        setField(term889853, term889853.getClass(), "externExports", null);
        setIntField(term889853, term889853.getClass(), "uniqueNameId", 0);
        setBooleanField(term889853, term889853.getClass(), "useThreads", false);
        setBooleanField(term889853, term889853.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889853, term889853.getClass(), "functionInformationMap", null);
        setField(term889853, term889853.getClass(), "debugLog", null);
        setField(term889853, term889853.getClass(), "defaultCodingConvention", null);
        setField(term889853, term889853.getClass(), "typeRegistry", null);
        setField(term889853, term889853.getClass(), "parserConfig", null);
        setField(term889853, term889853.getClass(), "abstractInterpreter", null);
        setField(term889853, term889853.getClass(), "typeValidator", null);
        setField(term889853, term889853.getClass(), "tracker", null);
        setField(term889853, term889853.getClass(), "oldErrorReporter", null);
        setField(term889853, term889853.getClass(), "defaultErrorReporter", null);
        setField(term889853, term889853.getClass(), "outStream", null);
        setField(term889853, term889853.getClass(), "globalRefMap", null);
        setDoubleField(term889853, term889853.getClass(), "progress", 0.0);
        setField(term889853, term889853.getClass(), "sanityCheck", null);
        setField(term889853, term889853.getClass(), "currentTracer", null);
        setField(term889853, term889853.getClass(), "currentPassName", null);
        setIntField(term889853, term889853.getClass(), "syntheticCodeId", 0);
        setField(term889853, term889853.getClass(), "recentChange", null);
        setField(term889853, term889853.getClass(), "codeChangeHandlers", null);
        setField(term889853, term889853.getClass(), "synthesizedExternsInput", null);
        setField(term889853, term889853.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "compileModules", argTypes, term889853, args);
    }

};


