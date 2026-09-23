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

public class Compiler_addIncrementalSourceAst_981111435196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854759;

    public Compiler_addIncrementalSourceAst_981111435196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854759 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854759, term854759.getClass(), "options", null);
        setField(term854759, term854759.getClass(), "passes", null);
        setField(term854759, term854759.getClass(), "externs", null);
        setField(term854759, term854759.getClass(), "modules", null);
        setField(term854759, term854759.getClass(), "moduleGraph", null);
        setField(term854759, term854759.getClass(), "inputs", null);
        setField(term854759, term854759.getClass(), "errorManager", null);
        setField(term854759, term854759.getClass(), "warningsGuard", null);
        setField(term854759, term854759.getClass(), "externsRoot", null);
        setField(term854759, term854759.getClass(), "jsRoot", null);
        setField(term854759, term854759.getClass(), "externAndJsRoot", null);
        setField(term854759, term854759.getClass(), "inputsByName", null);
        setField(term854759, term854759.getClass(), "sourceMap", null);
        setField(term854759, term854759.getClass(), "externExports", null);
        setIntField(term854759, term854759.getClass(), "uniqueNameId", 0);
        setBooleanField(term854759, term854759.getClass(), "useThreads", false);
        setBooleanField(term854759, term854759.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854759, term854759.getClass(), "functionInformationMap", null);
        setField(term854759, term854759.getClass(), "debugLog", null);
        setField(term854759, term854759.getClass(), "defaultCodingConvention", null);
        setField(term854759, term854759.getClass(), "typeRegistry", null);
        setField(term854759, term854759.getClass(), "parserConfig", null);
        setField(term854759, term854759.getClass(), "abstractInterpreter", null);
        setField(term854759, term854759.getClass(), "typeValidator", null);
        setField(term854759, term854759.getClass(), "tracker", null);
        setField(term854759, term854759.getClass(), "oldErrorReporter", null);
        setField(term854759, term854759.getClass(), "defaultErrorReporter", null);
        setField(term854759, term854759.getClass(), "outStream", null);
        setField(term854759, term854759.getClass(), "globalRefMap", null);
        setField(term854759, term854759.getClass(), "sanityCheck", null);
        setField(term854759, term854759.getClass(), "currentTracer", null);
        setField(term854759, term854759.getClass(), "currentPassName", null);
        setField(term854759, term854759.getClass(), "recentChange", null);
        setField(term854759, term854759.getClass(), "codeChangeHandlers", null);
        setField(term854759, term854759.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addIncrementalSourceAst", argTypes, term854759, args);
    }

};


