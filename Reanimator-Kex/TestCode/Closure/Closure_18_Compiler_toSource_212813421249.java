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

public class Compiler_toSource_212813421249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997206;
     Object term997212;

    public Compiler_toSource_212813421249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997206 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997206, term997206.getClass(), "options", null);
        setField(term997206, term997206.getClass(), "passes", null);
        setField(term997206, term997206.getClass(), "externs", null);
        setField(term997206, term997206.getClass(), "modules", null);
        setField(term997206, term997206.getClass(), "moduleGraph", null);
        setField(term997206, term997206.getClass(), "inputs", null);
        setField(term997206, term997206.getClass(), "errorManager", null);
        setField(term997206, term997206.getClass(), "warningsGuard", null);
        setField(term997206, term997206.getClass(), "injectedLibraries", null);
        setField(term997206, term997206.getClass(), "externsRoot", null);
        setField(term997206, term997206.getClass(), "jsRoot", null);
        setField(term997206, term997206.getClass(), "externAndJsRoot", null);
        setField(term997206, term997206.getClass(), "inputsById", null);
        setField(term997206, term997206.getClass(), "sourceMap", null);
        setField(term997206, term997206.getClass(), "externExports", null);
        setIntField(term997206, term997206.getClass(), "uniqueNameId", 0);
        setBooleanField(term997206, term997206.getClass(), "useThreads", false);
        setBooleanField(term997206, term997206.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997206, term997206.getClass(), "functionInformationMap", null);
        setField(term997206, term997206.getClass(), "debugLog", null);
        setField(term997206, term997206.getClass(), "defaultCodingConvention", null);
        setField(term997206, term997206.getClass(), "typeRegistry", null);
        setField(term997206, term997206.getClass(), "parserConfig", null);
        setField(term997206, term997206.getClass(), "abstractInterpreter", null);
        setField(term997206, term997206.getClass(), "typeValidator", null);
        setField(term997206, term997206.getClass(), "tracker", null);
        setField(term997206, term997206.getClass(), "oldErrorReporter", null);
        setField(term997206, term997206.getClass(), "defaultErrorReporter", null);
        setField(term997206, term997206.getClass(), "outStream", null);
        setField(term997206, term997206.getClass(), "globalRefMap", null);
        setDoubleField(term997206, term997206.getClass(), "progress", 0.0);
        setField(term997206, term997206.getClass(), "sanityCheck", null);
        setField(term997206, term997206.getClass(), "currentTracer", null);
        setField(term997206, term997206.getClass(), "currentPassName", null);
        setIntField(term997206, term997206.getClass(), "syntheticCodeId", 0);
        setField(term997206, term997206.getClass(), "recentChange", null);
        setField(term997206, term997206.getClass(), "codeChangeHandlers", null);
        setField(term997206, term997206.getClass(), "synthesizedExternsInput", null);
        setField(term997206, term997206.getClass(), "stage", null);
        term997212 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.SourceMap");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term997212;
        callMethod(klass, "toSource", argTypes, term997206, args);
    }

};


