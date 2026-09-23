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

public class Compiler_addNewSourceAst_1765611407219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890091;

    public Compiler_addNewSourceAst_1765611407219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890091 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890091, term890091.getClass(), "options", null);
        setField(term890091, term890091.getClass(), "passes", null);
        setField(term890091, term890091.getClass(), "externs", null);
        setField(term890091, term890091.getClass(), "modules", null);
        setField(term890091, term890091.getClass(), "moduleGraph", null);
        setField(term890091, term890091.getClass(), "inputs", null);
        setField(term890091, term890091.getClass(), "errorManager", null);
        setField(term890091, term890091.getClass(), "warningsGuard", null);
        setField(term890091, term890091.getClass(), "injectedLibraries", null);
        setField(term890091, term890091.getClass(), "externsRoot", null);
        setField(term890091, term890091.getClass(), "jsRoot", null);
        setField(term890091, term890091.getClass(), "externAndJsRoot", null);
        setField(term890091, term890091.getClass(), "inputsById", null);
        setField(term890091, term890091.getClass(), "sourceMap", null);
        setField(term890091, term890091.getClass(), "externExports", null);
        setIntField(term890091, term890091.getClass(), "uniqueNameId", 0);
        setBooleanField(term890091, term890091.getClass(), "useThreads", false);
        setBooleanField(term890091, term890091.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890091, term890091.getClass(), "functionInformationMap", null);
        setField(term890091, term890091.getClass(), "debugLog", null);
        setField(term890091, term890091.getClass(), "defaultCodingConvention", null);
        setField(term890091, term890091.getClass(), "typeRegistry", null);
        setField(term890091, term890091.getClass(), "parserConfig", null);
        setField(term890091, term890091.getClass(), "abstractInterpreter", null);
        setField(term890091, term890091.getClass(), "typeValidator", null);
        setField(term890091, term890091.getClass(), "tracker", null);
        setField(term890091, term890091.getClass(), "oldErrorReporter", null);
        setField(term890091, term890091.getClass(), "defaultErrorReporter", null);
        setField(term890091, term890091.getClass(), "outStream", null);
        setField(term890091, term890091.getClass(), "globalRefMap", null);
        setDoubleField(term890091, term890091.getClass(), "progress", 0.0);
        setField(term890091, term890091.getClass(), "sanityCheck", null);
        setField(term890091, term890091.getClass(), "currentTracer", null);
        setField(term890091, term890091.getClass(), "currentPassName", null);
        setIntField(term890091, term890091.getClass(), "syntheticCodeId", 0);
        setField(term890091, term890091.getClass(), "recentChange", null);
        setField(term890091, term890091.getClass(), "codeChangeHandlers", null);
        setField(term890091, term890091.getClass(), "synthesizedExternsInput", null);
        setField(term890091, term890091.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addNewSourceAst", argTypes, term890091, args);
    }

};


