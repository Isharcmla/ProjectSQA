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
import java.lang.Boolean;

public class Compiler_makeCompilerInput_1525437756167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889773;
     Object term889779;

    public Compiler_makeCompilerInput_1525437756167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889773 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889773, term889773.getClass(), "options", null);
        setField(term889773, term889773.getClass(), "passes", null);
        setField(term889773, term889773.getClass(), "externs", null);
        setField(term889773, term889773.getClass(), "modules", null);
        setField(term889773, term889773.getClass(), "moduleGraph", null);
        setField(term889773, term889773.getClass(), "inputs", null);
        setField(term889773, term889773.getClass(), "errorManager", null);
        setField(term889773, term889773.getClass(), "warningsGuard", null);
        setField(term889773, term889773.getClass(), "injectedLibraries", null);
        setField(term889773, term889773.getClass(), "externsRoot", null);
        setField(term889773, term889773.getClass(), "jsRoot", null);
        setField(term889773, term889773.getClass(), "externAndJsRoot", null);
        setField(term889773, term889773.getClass(), "inputsById", null);
        setField(term889773, term889773.getClass(), "sourceMap", null);
        setField(term889773, term889773.getClass(), "externExports", null);
        setIntField(term889773, term889773.getClass(), "uniqueNameId", 0);
        setBooleanField(term889773, term889773.getClass(), "useThreads", false);
        setBooleanField(term889773, term889773.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889773, term889773.getClass(), "functionInformationMap", null);
        setField(term889773, term889773.getClass(), "debugLog", null);
        setField(term889773, term889773.getClass(), "defaultCodingConvention", null);
        setField(term889773, term889773.getClass(), "typeRegistry", null);
        setField(term889773, term889773.getClass(), "parserConfig", null);
        setField(term889773, term889773.getClass(), "abstractInterpreter", null);
        setField(term889773, term889773.getClass(), "typeValidator", null);
        setField(term889773, term889773.getClass(), "tracker", null);
        setField(term889773, term889773.getClass(), "oldErrorReporter", null);
        setField(term889773, term889773.getClass(), "defaultErrorReporter", null);
        setField(term889773, term889773.getClass(), "outStream", null);
        setField(term889773, term889773.getClass(), "globalRefMap", null);
        setDoubleField(term889773, term889773.getClass(), "progress", 0.0);
        setField(term889773, term889773.getClass(), "sanityCheck", null);
        setField(term889773, term889773.getClass(), "currentTracer", null);
        setField(term889773, term889773.getClass(), "currentPassName", null);
        setIntField(term889773, term889773.getClass(), "syntheticCodeId", 0);
        setField(term889773, term889773.getClass(), "recentChange", null);
        setField(term889773, term889773.getClass(), "codeChangeHandlers", null);
        setField(term889773, term889773.getClass(), "synthesizedExternsInput", null);
        setField(term889773, term889773.getClass(), "stage", null);
        term889779 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term889779;
        callMethod(klass, "makeCompilerInput", argTypes, term889773, args);
    }

};


