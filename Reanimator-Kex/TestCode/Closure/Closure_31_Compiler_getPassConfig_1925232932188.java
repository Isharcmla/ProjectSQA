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

public class Compiler_getPassConfig_1925232932188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889905;

    public Compiler_getPassConfig_1925232932188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889905 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889905, term889905.getClass(), "options", null);
        setField(term889905, term889905.getClass(), "passes", null);
        setField(term889905, term889905.getClass(), "externs", null);
        setField(term889905, term889905.getClass(), "modules", null);
        setField(term889905, term889905.getClass(), "moduleGraph", null);
        setField(term889905, term889905.getClass(), "inputs", null);
        setField(term889905, term889905.getClass(), "errorManager", null);
        setField(term889905, term889905.getClass(), "warningsGuard", null);
        setField(term889905, term889905.getClass(), "injectedLibraries", null);
        setField(term889905, term889905.getClass(), "externsRoot", null);
        setField(term889905, term889905.getClass(), "jsRoot", null);
        setField(term889905, term889905.getClass(), "externAndJsRoot", null);
        setField(term889905, term889905.getClass(), "inputsById", null);
        setField(term889905, term889905.getClass(), "sourceMap", null);
        setField(term889905, term889905.getClass(), "externExports", null);
        setIntField(term889905, term889905.getClass(), "uniqueNameId", 0);
        setBooleanField(term889905, term889905.getClass(), "useThreads", false);
        setBooleanField(term889905, term889905.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889905, term889905.getClass(), "functionInformationMap", null);
        setField(term889905, term889905.getClass(), "debugLog", null);
        setField(term889905, term889905.getClass(), "defaultCodingConvention", null);
        setField(term889905, term889905.getClass(), "typeRegistry", null);
        setField(term889905, term889905.getClass(), "parserConfig", null);
        setField(term889905, term889905.getClass(), "abstractInterpreter", null);
        setField(term889905, term889905.getClass(), "typeValidator", null);
        setField(term889905, term889905.getClass(), "tracker", null);
        setField(term889905, term889905.getClass(), "oldErrorReporter", null);
        setField(term889905, term889905.getClass(), "defaultErrorReporter", null);
        setField(term889905, term889905.getClass(), "outStream", null);
        setField(term889905, term889905.getClass(), "globalRefMap", null);
        setDoubleField(term889905, term889905.getClass(), "progress", 0.0);
        setField(term889905, term889905.getClass(), "sanityCheck", null);
        setField(term889905, term889905.getClass(), "currentTracer", null);
        setField(term889905, term889905.getClass(), "currentPassName", null);
        setIntField(term889905, term889905.getClass(), "syntheticCodeId", 0);
        setField(term889905, term889905.getClass(), "recentChange", null);
        setField(term889905, term889905.getClass(), "codeChangeHandlers", null);
        setField(term889905, term889905.getClass(), "synthesizedExternsInput", null);
        setField(term889905, term889905.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassConfig", argTypes, term889905, args);
    }

};


