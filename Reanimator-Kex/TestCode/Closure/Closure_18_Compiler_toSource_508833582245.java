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

public class Compiler_toSource_508833582245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997180;

    public Compiler_toSource_508833582245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997180 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997180, term997180.getClass(), "options", null);
        setField(term997180, term997180.getClass(), "passes", null);
        setField(term997180, term997180.getClass(), "externs", null);
        setField(term997180, term997180.getClass(), "modules", null);
        setField(term997180, term997180.getClass(), "moduleGraph", null);
        setField(term997180, term997180.getClass(), "inputs", null);
        setField(term997180, term997180.getClass(), "errorManager", null);
        setField(term997180, term997180.getClass(), "warningsGuard", null);
        setField(term997180, term997180.getClass(), "injectedLibraries", null);
        setField(term997180, term997180.getClass(), "externsRoot", null);
        setField(term997180, term997180.getClass(), "jsRoot", null);
        setField(term997180, term997180.getClass(), "externAndJsRoot", null);
        setField(term997180, term997180.getClass(), "inputsById", null);
        setField(term997180, term997180.getClass(), "sourceMap", null);
        setField(term997180, term997180.getClass(), "externExports", null);
        setIntField(term997180, term997180.getClass(), "uniqueNameId", 0);
        setBooleanField(term997180, term997180.getClass(), "useThreads", false);
        setBooleanField(term997180, term997180.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997180, term997180.getClass(), "functionInformationMap", null);
        setField(term997180, term997180.getClass(), "debugLog", null);
        setField(term997180, term997180.getClass(), "defaultCodingConvention", null);
        setField(term997180, term997180.getClass(), "typeRegistry", null);
        setField(term997180, term997180.getClass(), "parserConfig", null);
        setField(term997180, term997180.getClass(), "abstractInterpreter", null);
        setField(term997180, term997180.getClass(), "typeValidator", null);
        setField(term997180, term997180.getClass(), "tracker", null);
        setField(term997180, term997180.getClass(), "oldErrorReporter", null);
        setField(term997180, term997180.getClass(), "defaultErrorReporter", null);
        setField(term997180, term997180.getClass(), "outStream", null);
        setField(term997180, term997180.getClass(), "globalRefMap", null);
        setDoubleField(term997180, term997180.getClass(), "progress", 0.0);
        setField(term997180, term997180.getClass(), "sanityCheck", null);
        setField(term997180, term997180.getClass(), "currentTracer", null);
        setField(term997180, term997180.getClass(), "currentPassName", null);
        setIntField(term997180, term997180.getClass(), "syntheticCodeId", 0);
        setField(term997180, term997180.getClass(), "recentChange", null);
        setField(term997180, term997180.getClass(), "codeChangeHandlers", null);
        setField(term997180, term997180.getClass(), "synthesizedExternsInput", null);
        setField(term997180, term997180.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSource", argTypes, term997180, args);
    }

};


