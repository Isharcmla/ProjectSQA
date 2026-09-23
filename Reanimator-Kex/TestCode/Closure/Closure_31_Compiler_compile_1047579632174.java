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

public class Compiler_compile_1047579632174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889817;

    public Compiler_compile_1047579632174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889817 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889817, term889817.getClass(), "options", null);
        setField(term889817, term889817.getClass(), "passes", null);
        setField(term889817, term889817.getClass(), "externs", null);
        setField(term889817, term889817.getClass(), "modules", null);
        setField(term889817, term889817.getClass(), "moduleGraph", null);
        setField(term889817, term889817.getClass(), "inputs", null);
        setField(term889817, term889817.getClass(), "errorManager", null);
        setField(term889817, term889817.getClass(), "warningsGuard", null);
        setField(term889817, term889817.getClass(), "injectedLibraries", null);
        setField(term889817, term889817.getClass(), "externsRoot", null);
        setField(term889817, term889817.getClass(), "jsRoot", null);
        setField(term889817, term889817.getClass(), "externAndJsRoot", null);
        setField(term889817, term889817.getClass(), "inputsById", null);
        setField(term889817, term889817.getClass(), "sourceMap", null);
        setField(term889817, term889817.getClass(), "externExports", null);
        setIntField(term889817, term889817.getClass(), "uniqueNameId", 0);
        setBooleanField(term889817, term889817.getClass(), "useThreads", false);
        setBooleanField(term889817, term889817.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889817, term889817.getClass(), "functionInformationMap", null);
        setField(term889817, term889817.getClass(), "debugLog", null);
        setField(term889817, term889817.getClass(), "defaultCodingConvention", null);
        setField(term889817, term889817.getClass(), "typeRegistry", null);
        setField(term889817, term889817.getClass(), "parserConfig", null);
        setField(term889817, term889817.getClass(), "abstractInterpreter", null);
        setField(term889817, term889817.getClass(), "typeValidator", null);
        setField(term889817, term889817.getClass(), "tracker", null);
        setField(term889817, term889817.getClass(), "oldErrorReporter", null);
        setField(term889817, term889817.getClass(), "defaultErrorReporter", null);
        setField(term889817, term889817.getClass(), "outStream", null);
        setField(term889817, term889817.getClass(), "globalRefMap", null);
        setDoubleField(term889817, term889817.getClass(), "progress", 0.0);
        setField(term889817, term889817.getClass(), "sanityCheck", null);
        setField(term889817, term889817.getClass(), "currentTracer", null);
        setField(term889817, term889817.getClass(), "currentPassName", null);
        setIntField(term889817, term889817.getClass(), "syntheticCodeId", 0);
        setField(term889817, term889817.getClass(), "recentChange", null);
        setField(term889817, term889817.getClass(), "codeChangeHandlers", null);
        setField(term889817, term889817.getClass(), "synthesizedExternsInput", null);
        setField(term889817, term889817.getClass(), "stage", null);
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
        callMethod(klass, "compile", argTypes, term889817, args);
    }

};


