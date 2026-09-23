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

public class Compiler_prepareAst_795891139227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854930;

    public Compiler_prepareAst_795891139227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854930 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854930, term854930.getClass(), "options", null);
        setField(term854930, term854930.getClass(), "passes", null);
        setField(term854930, term854930.getClass(), "externs", null);
        setField(term854930, term854930.getClass(), "modules", null);
        setField(term854930, term854930.getClass(), "moduleGraph", null);
        setField(term854930, term854930.getClass(), "inputs", null);
        setField(term854930, term854930.getClass(), "errorManager", null);
        setField(term854930, term854930.getClass(), "warningsGuard", null);
        setField(term854930, term854930.getClass(), "externsRoot", null);
        setField(term854930, term854930.getClass(), "jsRoot", null);
        setField(term854930, term854930.getClass(), "externAndJsRoot", null);
        setField(term854930, term854930.getClass(), "inputsByName", null);
        setField(term854930, term854930.getClass(), "sourceMap", null);
        setField(term854930, term854930.getClass(), "externExports", null);
        setIntField(term854930, term854930.getClass(), "uniqueNameId", 0);
        setBooleanField(term854930, term854930.getClass(), "useThreads", false);
        setBooleanField(term854930, term854930.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854930, term854930.getClass(), "functionInformationMap", null);
        setField(term854930, term854930.getClass(), "debugLog", null);
        setField(term854930, term854930.getClass(), "defaultCodingConvention", null);
        setField(term854930, term854930.getClass(), "typeRegistry", null);
        setField(term854930, term854930.getClass(), "parserConfig", null);
        setField(term854930, term854930.getClass(), "abstractInterpreter", null);
        setField(term854930, term854930.getClass(), "typeValidator", null);
        setField(term854930, term854930.getClass(), "tracker", null);
        setField(term854930, term854930.getClass(), "oldErrorReporter", null);
        setField(term854930, term854930.getClass(), "defaultErrorReporter", null);
        setField(term854930, term854930.getClass(), "outStream", null);
        setField(term854930, term854930.getClass(), "globalRefMap", null);
        setField(term854930, term854930.getClass(), "sanityCheck", null);
        setField(term854930, term854930.getClass(), "currentTracer", null);
        setField(term854930, term854930.getClass(), "currentPassName", null);
        setField(term854930, term854930.getClass(), "recentChange", null);
        setField(term854930, term854930.getClass(), "codeChangeHandlers", null);
        setField(term854930, term854930.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "prepareAst", argTypes, term854930, args);
    }

};


