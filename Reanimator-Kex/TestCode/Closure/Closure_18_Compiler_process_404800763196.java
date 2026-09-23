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

public class Compiler_process_404800763196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996886;

    public Compiler_process_404800763196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996886 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996886, term996886.getClass(), "options", null);
        setField(term996886, term996886.getClass(), "passes", null);
        setField(term996886, term996886.getClass(), "externs", null);
        setField(term996886, term996886.getClass(), "modules", null);
        setField(term996886, term996886.getClass(), "moduleGraph", null);
        setField(term996886, term996886.getClass(), "inputs", null);
        setField(term996886, term996886.getClass(), "errorManager", null);
        setField(term996886, term996886.getClass(), "warningsGuard", null);
        setField(term996886, term996886.getClass(), "injectedLibraries", null);
        setField(term996886, term996886.getClass(), "externsRoot", null);
        setField(term996886, term996886.getClass(), "jsRoot", null);
        setField(term996886, term996886.getClass(), "externAndJsRoot", null);
        setField(term996886, term996886.getClass(), "inputsById", null);
        setField(term996886, term996886.getClass(), "sourceMap", null);
        setField(term996886, term996886.getClass(), "externExports", null);
        setIntField(term996886, term996886.getClass(), "uniqueNameId", 0);
        setBooleanField(term996886, term996886.getClass(), "useThreads", false);
        setBooleanField(term996886, term996886.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996886, term996886.getClass(), "functionInformationMap", null);
        setField(term996886, term996886.getClass(), "debugLog", null);
        setField(term996886, term996886.getClass(), "defaultCodingConvention", null);
        setField(term996886, term996886.getClass(), "typeRegistry", null);
        setField(term996886, term996886.getClass(), "parserConfig", null);
        setField(term996886, term996886.getClass(), "abstractInterpreter", null);
        setField(term996886, term996886.getClass(), "typeValidator", null);
        setField(term996886, term996886.getClass(), "tracker", null);
        setField(term996886, term996886.getClass(), "oldErrorReporter", null);
        setField(term996886, term996886.getClass(), "defaultErrorReporter", null);
        setField(term996886, term996886.getClass(), "outStream", null);
        setField(term996886, term996886.getClass(), "globalRefMap", null);
        setDoubleField(term996886, term996886.getClass(), "progress", 0.0);
        setField(term996886, term996886.getClass(), "sanityCheck", null);
        setField(term996886, term996886.getClass(), "currentTracer", null);
        setField(term996886, term996886.getClass(), "currentPassName", null);
        setIntField(term996886, term996886.getClass(), "syntheticCodeId", 0);
        setField(term996886, term996886.getClass(), "recentChange", null);
        setField(term996886, term996886.getClass(), "codeChangeHandlers", null);
        setField(term996886, term996886.getClass(), "synthesizedExternsInput", null);
        setField(term996886, term996886.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerPass");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term996886, args);
    }

};


