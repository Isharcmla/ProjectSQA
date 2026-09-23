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

public class Compiler_getNodeForCodeInsertion_86081477244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896444;

    public Compiler_getNodeForCodeInsertion_86081477244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896444 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896444, term896444.getClass(), "options", null);
        setField(term896444, term896444.getClass(), "passes", null);
        setField(term896444, term896444.getClass(), "externs", null);
        setField(term896444, term896444.getClass(), "modules", null);
        setField(term896444, term896444.getClass(), "moduleGraph", null);
        setField(term896444, term896444.getClass(), "inputs", null);
        setField(term896444, term896444.getClass(), "errorManager", null);
        setField(term896444, term896444.getClass(), "warningsGuard", null);
        setField(term896444, term896444.getClass(), "externsRoot", null);
        setField(term896444, term896444.getClass(), "jsRoot", null);
        setField(term896444, term896444.getClass(), "externAndJsRoot", null);
        setField(term896444, term896444.getClass(), "inputsByName", null);
        setField(term896444, term896444.getClass(), "sourceMap", null);
        setField(term896444, term896444.getClass(), "externExports", null);
        setIntField(term896444, term896444.getClass(), "uniqueNameId", 0);
        setBooleanField(term896444, term896444.getClass(), "useThreads", false);
        setBooleanField(term896444, term896444.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896444, term896444.getClass(), "functionInformationMap", null);
        setField(term896444, term896444.getClass(), "debugLog", null);
        setField(term896444, term896444.getClass(), "defaultCodingConvention", null);
        setField(term896444, term896444.getClass(), "typeRegistry", null);
        setField(term896444, term896444.getClass(), "parserConfig", null);
        setField(term896444, term896444.getClass(), "abstractInterpreter", null);
        setField(term896444, term896444.getClass(), "typeValidator", null);
        setField(term896444, term896444.getClass(), "tracker", null);
        setField(term896444, term896444.getClass(), "oldErrorReporter", null);
        setField(term896444, term896444.getClass(), "defaultErrorReporter", null);
        setField(term896444, term896444.getClass(), "outStream", null);
        setField(term896444, term896444.getClass(), "globalRefMap", null);
        setField(term896444, term896444.getClass(), "sanityCheck", null);
        setField(term896444, term896444.getClass(), "currentTracer", null);
        setField(term896444, term896444.getClass(), "currentPassName", null);
        setField(term896444, term896444.getClass(), "recentChange", null);
        setField(term896444, term896444.getClass(), "codeChangeHandlers", null);
        setField(term896444, term896444.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNodeForCodeInsertion", argTypes, term896444, args);
    }

};


