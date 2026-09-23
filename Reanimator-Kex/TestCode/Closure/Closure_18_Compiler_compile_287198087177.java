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

public class Compiler_compile_287198087177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996768;

    public Compiler_compile_287198087177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996768 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996768, term996768.getClass(), "options", null);
        setField(term996768, term996768.getClass(), "passes", null);
        setField(term996768, term996768.getClass(), "externs", null);
        setField(term996768, term996768.getClass(), "modules", null);
        setField(term996768, term996768.getClass(), "moduleGraph", null);
        setField(term996768, term996768.getClass(), "inputs", null);
        setField(term996768, term996768.getClass(), "errorManager", null);
        setField(term996768, term996768.getClass(), "warningsGuard", null);
        setField(term996768, term996768.getClass(), "injectedLibraries", null);
        setField(term996768, term996768.getClass(), "externsRoot", null);
        setField(term996768, term996768.getClass(), "jsRoot", null);
        setField(term996768, term996768.getClass(), "externAndJsRoot", null);
        setField(term996768, term996768.getClass(), "inputsById", null);
        setField(term996768, term996768.getClass(), "sourceMap", null);
        setField(term996768, term996768.getClass(), "externExports", null);
        setIntField(term996768, term996768.getClass(), "uniqueNameId", 0);
        setBooleanField(term996768, term996768.getClass(), "useThreads", false);
        setBooleanField(term996768, term996768.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996768, term996768.getClass(), "functionInformationMap", null);
        setField(term996768, term996768.getClass(), "debugLog", null);
        setField(term996768, term996768.getClass(), "defaultCodingConvention", null);
        setField(term996768, term996768.getClass(), "typeRegistry", null);
        setField(term996768, term996768.getClass(), "parserConfig", null);
        setField(term996768, term996768.getClass(), "abstractInterpreter", null);
        setField(term996768, term996768.getClass(), "typeValidator", null);
        setField(term996768, term996768.getClass(), "tracker", null);
        setField(term996768, term996768.getClass(), "oldErrorReporter", null);
        setField(term996768, term996768.getClass(), "defaultErrorReporter", null);
        setField(term996768, term996768.getClass(), "outStream", null);
        setField(term996768, term996768.getClass(), "globalRefMap", null);
        setDoubleField(term996768, term996768.getClass(), "progress", 0.0);
        setField(term996768, term996768.getClass(), "sanityCheck", null);
        setField(term996768, term996768.getClass(), "currentTracer", null);
        setField(term996768, term996768.getClass(), "currentPassName", null);
        setIntField(term996768, term996768.getClass(), "syntheticCodeId", 0);
        setField(term996768, term996768.getClass(), "recentChange", null);
        setField(term996768, term996768.getClass(), "codeChangeHandlers", null);
        setField(term996768, term996768.getClass(), "synthesizedExternsInput", null);
        setField(term996768, term996768.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "compile", argTypes, term996768, args);
    }

};


