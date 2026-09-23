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

public class Compiler_addChangeHandler_1653346594229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854938;

    public Compiler_addChangeHandler_1653346594229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854938 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854938, term854938.getClass(), "options", null);
        setField(term854938, term854938.getClass(), "passes", null);
        setField(term854938, term854938.getClass(), "externs", null);
        setField(term854938, term854938.getClass(), "modules", null);
        setField(term854938, term854938.getClass(), "moduleGraph", null);
        setField(term854938, term854938.getClass(), "inputs", null);
        setField(term854938, term854938.getClass(), "errorManager", null);
        setField(term854938, term854938.getClass(), "warningsGuard", null);
        setField(term854938, term854938.getClass(), "externsRoot", null);
        setField(term854938, term854938.getClass(), "jsRoot", null);
        setField(term854938, term854938.getClass(), "externAndJsRoot", null);
        setField(term854938, term854938.getClass(), "inputsByName", null);
        setField(term854938, term854938.getClass(), "sourceMap", null);
        setField(term854938, term854938.getClass(), "externExports", null);
        setIntField(term854938, term854938.getClass(), "uniqueNameId", 0);
        setBooleanField(term854938, term854938.getClass(), "useThreads", false);
        setBooleanField(term854938, term854938.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854938, term854938.getClass(), "functionInformationMap", null);
        setField(term854938, term854938.getClass(), "debugLog", null);
        setField(term854938, term854938.getClass(), "defaultCodingConvention", null);
        setField(term854938, term854938.getClass(), "typeRegistry", null);
        setField(term854938, term854938.getClass(), "parserConfig", null);
        setField(term854938, term854938.getClass(), "abstractInterpreter", null);
        setField(term854938, term854938.getClass(), "typeValidator", null);
        setField(term854938, term854938.getClass(), "tracker", null);
        setField(term854938, term854938.getClass(), "oldErrorReporter", null);
        setField(term854938, term854938.getClass(), "defaultErrorReporter", null);
        setField(term854938, term854938.getClass(), "outStream", null);
        setField(term854938, term854938.getClass(), "globalRefMap", null);
        setField(term854938, term854938.getClass(), "sanityCheck", null);
        setField(term854938, term854938.getClass(), "currentTracer", null);
        setField(term854938, term854938.getClass(), "currentPassName", null);
        setField(term854938, term854938.getClass(), "recentChange", null);
        setField(term854938, term854938.getClass(), "codeChangeHandlers", null);
        setField(term854938, term854938.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeChangeHandler");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addChangeHandler", argTypes, term854938, args);
    }

};


