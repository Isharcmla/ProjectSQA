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

public class Compiler_fillEmptyModules_260847624170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889793;

    public Compiler_fillEmptyModules_260847624170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889793 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889793, term889793.getClass(), "options", null);
        setField(term889793, term889793.getClass(), "passes", null);
        setField(term889793, term889793.getClass(), "externs", null);
        setField(term889793, term889793.getClass(), "modules", null);
        setField(term889793, term889793.getClass(), "moduleGraph", null);
        setField(term889793, term889793.getClass(), "inputs", null);
        setField(term889793, term889793.getClass(), "errorManager", null);
        setField(term889793, term889793.getClass(), "warningsGuard", null);
        setField(term889793, term889793.getClass(), "injectedLibraries", null);
        setField(term889793, term889793.getClass(), "externsRoot", null);
        setField(term889793, term889793.getClass(), "jsRoot", null);
        setField(term889793, term889793.getClass(), "externAndJsRoot", null);
        setField(term889793, term889793.getClass(), "inputsById", null);
        setField(term889793, term889793.getClass(), "sourceMap", null);
        setField(term889793, term889793.getClass(), "externExports", null);
        setIntField(term889793, term889793.getClass(), "uniqueNameId", 0);
        setBooleanField(term889793, term889793.getClass(), "useThreads", false);
        setBooleanField(term889793, term889793.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889793, term889793.getClass(), "functionInformationMap", null);
        setField(term889793, term889793.getClass(), "debugLog", null);
        setField(term889793, term889793.getClass(), "defaultCodingConvention", null);
        setField(term889793, term889793.getClass(), "typeRegistry", null);
        setField(term889793, term889793.getClass(), "parserConfig", null);
        setField(term889793, term889793.getClass(), "abstractInterpreter", null);
        setField(term889793, term889793.getClass(), "typeValidator", null);
        setField(term889793, term889793.getClass(), "tracker", null);
        setField(term889793, term889793.getClass(), "oldErrorReporter", null);
        setField(term889793, term889793.getClass(), "defaultErrorReporter", null);
        setField(term889793, term889793.getClass(), "outStream", null);
        setField(term889793, term889793.getClass(), "globalRefMap", null);
        setDoubleField(term889793, term889793.getClass(), "progress", 0.0);
        setField(term889793, term889793.getClass(), "sanityCheck", null);
        setField(term889793, term889793.getClass(), "currentTracer", null);
        setField(term889793, term889793.getClass(), "currentPassName", null);
        setIntField(term889793, term889793.getClass(), "syntheticCodeId", 0);
        setField(term889793, term889793.getClass(), "recentChange", null);
        setField(term889793, term889793.getClass(), "codeChangeHandlers", null);
        setField(term889793, term889793.getClass(), "synthesizedExternsInput", null);
        setField(term889793, term889793.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fillEmptyModules", argTypes, term889793, args);
    }

};


