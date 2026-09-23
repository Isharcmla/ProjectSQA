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

public class Compiler_toSource_1869889745216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977934;

    public Compiler_toSource_1869889745216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977934 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977934, term977934.getClass(), "options", null);
        setField(term977934, term977934.getClass(), "passes", null);
        setField(term977934, term977934.getClass(), "externs", null);
        setField(term977934, term977934.getClass(), "modules", null);
        setField(term977934, term977934.getClass(), "moduleGraph", null);
        setField(term977934, term977934.getClass(), "inputs", null);
        setField(term977934, term977934.getClass(), "errorManager", null);
        setField(term977934, term977934.getClass(), "warningsGuard", null);
        setField(term977934, term977934.getClass(), "externsRoot", null);
        setField(term977934, term977934.getClass(), "jsRoot", null);
        setField(term977934, term977934.getClass(), "externAndJsRoot", null);
        setField(term977934, term977934.getClass(), "inputsByName", null);
        setField(term977934, term977934.getClass(), "sourceMap", null);
        setField(term977934, term977934.getClass(), "externExports", null);
        setIntField(term977934, term977934.getClass(), "uniqueNameId", 0);
        setBooleanField(term977934, term977934.getClass(), "useThreads", false);
        setBooleanField(term977934, term977934.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977934, term977934.getClass(), "functionInformationMap", null);
        setField(term977934, term977934.getClass(), "debugLog", null);
        setField(term977934, term977934.getClass(), "defaultCodingConvention", null);
        setField(term977934, term977934.getClass(), "typeRegistry", null);
        setField(term977934, term977934.getClass(), "parserConfig", null);
        setField(term977934, term977934.getClass(), "abstractInterpreter", null);
        setField(term977934, term977934.getClass(), "typeValidator", null);
        setField(term977934, term977934.getClass(), "tracker", null);
        setField(term977934, term977934.getClass(), "oldErrorReporter", null);
        setField(term977934, term977934.getClass(), "defaultErrorReporter", null);
        setField(term977934, term977934.getClass(), "outStream", null);
        setField(term977934, term977934.getClass(), "globalRefMap", null);
        setField(term977934, term977934.getClass(), "sanityCheck", null);
        setField(term977934, term977934.getClass(), "currentTracer", null);
        setField(term977934, term977934.getClass(), "currentPassName", null);
        setField(term977934, term977934.getClass(), "recentChange", null);
        setField(term977934, term977934.getClass(), "codeChangeHandlers", null);
        setField(term977934, term977934.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.SourceMap");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "toSource", argTypes, term977934, args);
    }

};


