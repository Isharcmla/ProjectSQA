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

public class Compiler_getErrorLevel_722145682266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890377;

    public Compiler_getErrorLevel_722145682266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890377 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890377, term890377.getClass(), "options", null);
        setField(term890377, term890377.getClass(), "passes", null);
        setField(term890377, term890377.getClass(), "externs", null);
        setField(term890377, term890377.getClass(), "modules", null);
        setField(term890377, term890377.getClass(), "moduleGraph", null);
        setField(term890377, term890377.getClass(), "inputs", null);
        setField(term890377, term890377.getClass(), "errorManager", null);
        setField(term890377, term890377.getClass(), "warningsGuard", null);
        setField(term890377, term890377.getClass(), "injectedLibraries", null);
        setField(term890377, term890377.getClass(), "externsRoot", null);
        setField(term890377, term890377.getClass(), "jsRoot", null);
        setField(term890377, term890377.getClass(), "externAndJsRoot", null);
        setField(term890377, term890377.getClass(), "inputsById", null);
        setField(term890377, term890377.getClass(), "sourceMap", null);
        setField(term890377, term890377.getClass(), "externExports", null);
        setIntField(term890377, term890377.getClass(), "uniqueNameId", 0);
        setBooleanField(term890377, term890377.getClass(), "useThreads", false);
        setBooleanField(term890377, term890377.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890377, term890377.getClass(), "functionInformationMap", null);
        setField(term890377, term890377.getClass(), "debugLog", null);
        setField(term890377, term890377.getClass(), "defaultCodingConvention", null);
        setField(term890377, term890377.getClass(), "typeRegistry", null);
        setField(term890377, term890377.getClass(), "parserConfig", null);
        setField(term890377, term890377.getClass(), "abstractInterpreter", null);
        setField(term890377, term890377.getClass(), "typeValidator", null);
        setField(term890377, term890377.getClass(), "tracker", null);
        setField(term890377, term890377.getClass(), "oldErrorReporter", null);
        setField(term890377, term890377.getClass(), "defaultErrorReporter", null);
        setField(term890377, term890377.getClass(), "outStream", null);
        setField(term890377, term890377.getClass(), "globalRefMap", null);
        setDoubleField(term890377, term890377.getClass(), "progress", 0.0);
        setField(term890377, term890377.getClass(), "sanityCheck", null);
        setField(term890377, term890377.getClass(), "currentTracer", null);
        setField(term890377, term890377.getClass(), "currentPassName", null);
        setIntField(term890377, term890377.getClass(), "syntheticCodeId", 0);
        setField(term890377, term890377.getClass(), "recentChange", null);
        setField(term890377, term890377.getClass(), "codeChangeHandlers", null);
        setField(term890377, term890377.getClass(), "synthesizedExternsInput", null);
        setField(term890377, term890377.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getErrorLevel", argTypes, term890377, args);
    }

};


