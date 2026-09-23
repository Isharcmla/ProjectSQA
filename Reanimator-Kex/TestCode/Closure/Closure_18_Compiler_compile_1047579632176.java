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

public class Compiler_compile_1047579632176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996762;

    public Compiler_compile_1047579632176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996762 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996762, term996762.getClass(), "options", null);
        setField(term996762, term996762.getClass(), "passes", null);
        setField(term996762, term996762.getClass(), "externs", null);
        setField(term996762, term996762.getClass(), "modules", null);
        setField(term996762, term996762.getClass(), "moduleGraph", null);
        setField(term996762, term996762.getClass(), "inputs", null);
        setField(term996762, term996762.getClass(), "errorManager", null);
        setField(term996762, term996762.getClass(), "warningsGuard", null);
        setField(term996762, term996762.getClass(), "injectedLibraries", null);
        setField(term996762, term996762.getClass(), "externsRoot", null);
        setField(term996762, term996762.getClass(), "jsRoot", null);
        setField(term996762, term996762.getClass(), "externAndJsRoot", null);
        setField(term996762, term996762.getClass(), "inputsById", null);
        setField(term996762, term996762.getClass(), "sourceMap", null);
        setField(term996762, term996762.getClass(), "externExports", null);
        setIntField(term996762, term996762.getClass(), "uniqueNameId", 0);
        setBooleanField(term996762, term996762.getClass(), "useThreads", false);
        setBooleanField(term996762, term996762.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996762, term996762.getClass(), "functionInformationMap", null);
        setField(term996762, term996762.getClass(), "debugLog", null);
        setField(term996762, term996762.getClass(), "defaultCodingConvention", null);
        setField(term996762, term996762.getClass(), "typeRegistry", null);
        setField(term996762, term996762.getClass(), "parserConfig", null);
        setField(term996762, term996762.getClass(), "abstractInterpreter", null);
        setField(term996762, term996762.getClass(), "typeValidator", null);
        setField(term996762, term996762.getClass(), "tracker", null);
        setField(term996762, term996762.getClass(), "oldErrorReporter", null);
        setField(term996762, term996762.getClass(), "defaultErrorReporter", null);
        setField(term996762, term996762.getClass(), "outStream", null);
        setField(term996762, term996762.getClass(), "globalRefMap", null);
        setDoubleField(term996762, term996762.getClass(), "progress", 0.0);
        setField(term996762, term996762.getClass(), "sanityCheck", null);
        setField(term996762, term996762.getClass(), "currentTracer", null);
        setField(term996762, term996762.getClass(), "currentPassName", null);
        setIntField(term996762, term996762.getClass(), "syntheticCodeId", 0);
        setField(term996762, term996762.getClass(), "recentChange", null);
        setField(term996762, term996762.getClass(), "codeChangeHandlers", null);
        setField(term996762, term996762.getClass(), "synthesizedExternsInput", null);
        setField(term996762, term996762.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.SourceFile");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "compile", argTypes, term996762, args);
    }

};


