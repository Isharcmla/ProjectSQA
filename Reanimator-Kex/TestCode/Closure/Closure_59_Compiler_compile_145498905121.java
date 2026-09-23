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

public class Compiler_compile_145498905121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70888;

    public Compiler_compile_145498905121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70888 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70888, term70888.getClass(), "options", null);
        setField(term70888, term70888.getClass(), "passes", null);
        setField(term70888, term70888.getClass(), "externs", null);
        setField(term70888, term70888.getClass(), "modules", null);
        setField(term70888, term70888.getClass(), "moduleGraph", null);
        setField(term70888, term70888.getClass(), "inputs", null);
        setField(term70888, term70888.getClass(), "errorManager", null);
        setField(term70888, term70888.getClass(), "warningsGuard", null);
        setField(term70888, term70888.getClass(), "externsRoot", null);
        setField(term70888, term70888.getClass(), "jsRoot", null);
        setField(term70888, term70888.getClass(), "externAndJsRoot", null);
        setField(term70888, term70888.getClass(), "inputsByName", null);
        setField(term70888, term70888.getClass(), "sourceMap", null);
        setField(term70888, term70888.getClass(), "externExports", null);
        setIntField(term70888, term70888.getClass(), "uniqueNameId", 0);
        setBooleanField(term70888, term70888.getClass(), "useThreads", false);
        setBooleanField(term70888, term70888.getClass(), "hasRegExpGlobalReferences", false);
        setField(term70888, term70888.getClass(), "functionInformationMap", null);
        setField(term70888, term70888.getClass(), "debugLog", null);
        setField(term70888, term70888.getClass(), "defaultCodingConvention", null);
        setField(term70888, term70888.getClass(), "typeRegistry", null);
        setField(term70888, term70888.getClass(), "parserConfig", null);
        setField(term70888, term70888.getClass(), "abstractInterpreter", null);
        setField(term70888, term70888.getClass(), "typeValidator", null);
        setField(term70888, term70888.getClass(), "tracker", null);
        setField(term70888, term70888.getClass(), "oldErrorReporter", null);
        setField(term70888, term70888.getClass(), "defaultErrorReporter", null);
        setField(term70888, term70888.getClass(), "outStream", null);
        setField(term70888, term70888.getClass(), "globalRefMap", null);
        setField(term70888, term70888.getClass(), "sanityCheck", null);
        setField(term70888, term70888.getClass(), "currentTracer", null);
        setField(term70888, term70888.getClass(), "currentPassName", null);
        setField(term70888, term70888.getClass(), "recentChange", null);
        setField(term70888, term70888.getClass(), "codeChangeHandlers", null);
        setField(term70888, term70888.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "compile", argTypes, term70888, args);
    }

};


