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

public class Compiler_compile_1284365584177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889835;

    public Compiler_compile_1284365584177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889835 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889835, term889835.getClass(), "options", null);
        setField(term889835, term889835.getClass(), "passes", null);
        setField(term889835, term889835.getClass(), "externs", null);
        setField(term889835, term889835.getClass(), "modules", null);
        setField(term889835, term889835.getClass(), "moduleGraph", null);
        setField(term889835, term889835.getClass(), "inputs", null);
        setField(term889835, term889835.getClass(), "errorManager", null);
        setField(term889835, term889835.getClass(), "warningsGuard", null);
        setField(term889835, term889835.getClass(), "injectedLibraries", null);
        setField(term889835, term889835.getClass(), "externsRoot", null);
        setField(term889835, term889835.getClass(), "jsRoot", null);
        setField(term889835, term889835.getClass(), "externAndJsRoot", null);
        setField(term889835, term889835.getClass(), "inputsById", null);
        setField(term889835, term889835.getClass(), "sourceMap", null);
        setField(term889835, term889835.getClass(), "externExports", null);
        setIntField(term889835, term889835.getClass(), "uniqueNameId", 0);
        setBooleanField(term889835, term889835.getClass(), "useThreads", false);
        setBooleanField(term889835, term889835.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889835, term889835.getClass(), "functionInformationMap", null);
        setField(term889835, term889835.getClass(), "debugLog", null);
        setField(term889835, term889835.getClass(), "defaultCodingConvention", null);
        setField(term889835, term889835.getClass(), "typeRegistry", null);
        setField(term889835, term889835.getClass(), "parserConfig", null);
        setField(term889835, term889835.getClass(), "abstractInterpreter", null);
        setField(term889835, term889835.getClass(), "typeValidator", null);
        setField(term889835, term889835.getClass(), "tracker", null);
        setField(term889835, term889835.getClass(), "oldErrorReporter", null);
        setField(term889835, term889835.getClass(), "defaultErrorReporter", null);
        setField(term889835, term889835.getClass(), "outStream", null);
        setField(term889835, term889835.getClass(), "globalRefMap", null);
        setDoubleField(term889835, term889835.getClass(), "progress", 0.0);
        setField(term889835, term889835.getClass(), "sanityCheck", null);
        setField(term889835, term889835.getClass(), "currentTracer", null);
        setField(term889835, term889835.getClass(), "currentPassName", null);
        setIntField(term889835, term889835.getClass(), "syntheticCodeId", 0);
        setField(term889835, term889835.getClass(), "recentChange", null);
        setField(term889835, term889835.getClass(), "codeChangeHandlers", null);
        setField(term889835, term889835.getClass(), "synthesizedExternsInput", null);
        setField(term889835, term889835.getClass(), "stage", null);
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
        callMethod(klass, "compile", argTypes, term889835, args);
    }

};


