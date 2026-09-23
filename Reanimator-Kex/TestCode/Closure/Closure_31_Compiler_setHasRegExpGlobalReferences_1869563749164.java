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

public class Compiler_setHasRegExpGlobalReferences_1869563749164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889753;
     Object term889759;

    public Compiler_setHasRegExpGlobalReferences_1869563749164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889753 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889753, term889753.getClass(), "options", null);
        setField(term889753, term889753.getClass(), "passes", null);
        setField(term889753, term889753.getClass(), "externs", null);
        setField(term889753, term889753.getClass(), "modules", null);
        setField(term889753, term889753.getClass(), "moduleGraph", null);
        setField(term889753, term889753.getClass(), "inputs", null);
        setField(term889753, term889753.getClass(), "errorManager", null);
        setField(term889753, term889753.getClass(), "warningsGuard", null);
        setField(term889753, term889753.getClass(), "injectedLibraries", null);
        setField(term889753, term889753.getClass(), "externsRoot", null);
        setField(term889753, term889753.getClass(), "jsRoot", null);
        setField(term889753, term889753.getClass(), "externAndJsRoot", null);
        setField(term889753, term889753.getClass(), "inputsById", null);
        setField(term889753, term889753.getClass(), "sourceMap", null);
        setField(term889753, term889753.getClass(), "externExports", null);
        setIntField(term889753, term889753.getClass(), "uniqueNameId", 0);
        setBooleanField(term889753, term889753.getClass(), "useThreads", false);
        setBooleanField(term889753, term889753.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889753, term889753.getClass(), "functionInformationMap", null);
        setField(term889753, term889753.getClass(), "debugLog", null);
        setField(term889753, term889753.getClass(), "defaultCodingConvention", null);
        setField(term889753, term889753.getClass(), "typeRegistry", null);
        setField(term889753, term889753.getClass(), "parserConfig", null);
        setField(term889753, term889753.getClass(), "abstractInterpreter", null);
        setField(term889753, term889753.getClass(), "typeValidator", null);
        setField(term889753, term889753.getClass(), "tracker", null);
        setField(term889753, term889753.getClass(), "oldErrorReporter", null);
        setField(term889753, term889753.getClass(), "defaultErrorReporter", null);
        setField(term889753, term889753.getClass(), "outStream", null);
        setField(term889753, term889753.getClass(), "globalRefMap", null);
        setDoubleField(term889753, term889753.getClass(), "progress", 0.0);
        setField(term889753, term889753.getClass(), "sanityCheck", null);
        setField(term889753, term889753.getClass(), "currentTracer", null);
        setField(term889753, term889753.getClass(), "currentPassName", null);
        setIntField(term889753, term889753.getClass(), "syntheticCodeId", 0);
        setField(term889753, term889753.getClass(), "recentChange", null);
        setField(term889753, term889753.getClass(), "codeChangeHandlers", null);
        setField(term889753, term889753.getClass(), "synthesizedExternsInput", null);
        setField(term889753, term889753.getClass(), "stage", null);
        term889759 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term889759;
        callMethod(klass, "setHasRegExpGlobalReferences", argTypes, term889753, args);
    }

};


