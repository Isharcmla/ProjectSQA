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

public class Compiler_replaceIncrementalSourceAst_878355766218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890085;

    public Compiler_replaceIncrementalSourceAst_878355766218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890085 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890085, term890085.getClass(), "options", null);
        setField(term890085, term890085.getClass(), "passes", null);
        setField(term890085, term890085.getClass(), "externs", null);
        setField(term890085, term890085.getClass(), "modules", null);
        setField(term890085, term890085.getClass(), "moduleGraph", null);
        setField(term890085, term890085.getClass(), "inputs", null);
        setField(term890085, term890085.getClass(), "errorManager", null);
        setField(term890085, term890085.getClass(), "warningsGuard", null);
        setField(term890085, term890085.getClass(), "injectedLibraries", null);
        setField(term890085, term890085.getClass(), "externsRoot", null);
        setField(term890085, term890085.getClass(), "jsRoot", null);
        setField(term890085, term890085.getClass(), "externAndJsRoot", null);
        setField(term890085, term890085.getClass(), "inputsById", null);
        setField(term890085, term890085.getClass(), "sourceMap", null);
        setField(term890085, term890085.getClass(), "externExports", null);
        setIntField(term890085, term890085.getClass(), "uniqueNameId", 0);
        setBooleanField(term890085, term890085.getClass(), "useThreads", false);
        setBooleanField(term890085, term890085.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890085, term890085.getClass(), "functionInformationMap", null);
        setField(term890085, term890085.getClass(), "debugLog", null);
        setField(term890085, term890085.getClass(), "defaultCodingConvention", null);
        setField(term890085, term890085.getClass(), "typeRegistry", null);
        setField(term890085, term890085.getClass(), "parserConfig", null);
        setField(term890085, term890085.getClass(), "abstractInterpreter", null);
        setField(term890085, term890085.getClass(), "typeValidator", null);
        setField(term890085, term890085.getClass(), "tracker", null);
        setField(term890085, term890085.getClass(), "oldErrorReporter", null);
        setField(term890085, term890085.getClass(), "defaultErrorReporter", null);
        setField(term890085, term890085.getClass(), "outStream", null);
        setField(term890085, term890085.getClass(), "globalRefMap", null);
        setDoubleField(term890085, term890085.getClass(), "progress", 0.0);
        setField(term890085, term890085.getClass(), "sanityCheck", null);
        setField(term890085, term890085.getClass(), "currentTracer", null);
        setField(term890085, term890085.getClass(), "currentPassName", null);
        setIntField(term890085, term890085.getClass(), "syntheticCodeId", 0);
        setField(term890085, term890085.getClass(), "recentChange", null);
        setField(term890085, term890085.getClass(), "codeChangeHandlers", null);
        setField(term890085, term890085.getClass(), "synthesizedExternsInput", null);
        setField(term890085, term890085.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "replaceIncrementalSourceAst", argTypes, term890085, args);
    }

};


