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

public class Compiler_replaceIncrementalSourceAst_878355766196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977852;

    public Compiler_replaceIncrementalSourceAst_878355766196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977852 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977852, term977852.getClass(), "options", null);
        setField(term977852, term977852.getClass(), "passes", null);
        setField(term977852, term977852.getClass(), "externs", null);
        setField(term977852, term977852.getClass(), "modules", null);
        setField(term977852, term977852.getClass(), "moduleGraph", null);
        setField(term977852, term977852.getClass(), "inputs", null);
        setField(term977852, term977852.getClass(), "errorManager", null);
        setField(term977852, term977852.getClass(), "warningsGuard", null);
        setField(term977852, term977852.getClass(), "externsRoot", null);
        setField(term977852, term977852.getClass(), "jsRoot", null);
        setField(term977852, term977852.getClass(), "externAndJsRoot", null);
        setField(term977852, term977852.getClass(), "inputsByName", null);
        setField(term977852, term977852.getClass(), "sourceMap", null);
        setField(term977852, term977852.getClass(), "externExports", null);
        setIntField(term977852, term977852.getClass(), "uniqueNameId", 0);
        setBooleanField(term977852, term977852.getClass(), "useThreads", false);
        setBooleanField(term977852, term977852.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977852, term977852.getClass(), "functionInformationMap", null);
        setField(term977852, term977852.getClass(), "debugLog", null);
        setField(term977852, term977852.getClass(), "defaultCodingConvention", null);
        setField(term977852, term977852.getClass(), "typeRegistry", null);
        setField(term977852, term977852.getClass(), "parserConfig", null);
        setField(term977852, term977852.getClass(), "abstractInterpreter", null);
        setField(term977852, term977852.getClass(), "typeValidator", null);
        setField(term977852, term977852.getClass(), "tracker", null);
        setField(term977852, term977852.getClass(), "oldErrorReporter", null);
        setField(term977852, term977852.getClass(), "defaultErrorReporter", null);
        setField(term977852, term977852.getClass(), "outStream", null);
        setField(term977852, term977852.getClass(), "globalRefMap", null);
        setField(term977852, term977852.getClass(), "sanityCheck", null);
        setField(term977852, term977852.getClass(), "currentTracer", null);
        setField(term977852, term977852.getClass(), "currentPassName", null);
        setField(term977852, term977852.getClass(), "recentChange", null);
        setField(term977852, term977852.getClass(), "codeChangeHandlers", null);
        setField(term977852, term977852.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "replaceIncrementalSourceAst", argTypes, term977852, args);
    }

};


