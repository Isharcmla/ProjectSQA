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

public class Compiler_toSource_508833582212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977916;

    public Compiler_toSource_508833582212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977916 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977916, term977916.getClass(), "options", null);
        setField(term977916, term977916.getClass(), "passes", null);
        setField(term977916, term977916.getClass(), "externs", null);
        setField(term977916, term977916.getClass(), "modules", null);
        setField(term977916, term977916.getClass(), "moduleGraph", null);
        setField(term977916, term977916.getClass(), "inputs", null);
        setField(term977916, term977916.getClass(), "errorManager", null);
        setField(term977916, term977916.getClass(), "warningsGuard", null);
        setField(term977916, term977916.getClass(), "externsRoot", null);
        setField(term977916, term977916.getClass(), "jsRoot", null);
        setField(term977916, term977916.getClass(), "externAndJsRoot", null);
        setField(term977916, term977916.getClass(), "inputsByName", null);
        setField(term977916, term977916.getClass(), "sourceMap", null);
        setField(term977916, term977916.getClass(), "externExports", null);
        setIntField(term977916, term977916.getClass(), "uniqueNameId", 0);
        setBooleanField(term977916, term977916.getClass(), "useThreads", false);
        setBooleanField(term977916, term977916.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977916, term977916.getClass(), "functionInformationMap", null);
        setField(term977916, term977916.getClass(), "debugLog", null);
        setField(term977916, term977916.getClass(), "defaultCodingConvention", null);
        setField(term977916, term977916.getClass(), "typeRegistry", null);
        setField(term977916, term977916.getClass(), "parserConfig", null);
        setField(term977916, term977916.getClass(), "abstractInterpreter", null);
        setField(term977916, term977916.getClass(), "typeValidator", null);
        setField(term977916, term977916.getClass(), "tracker", null);
        setField(term977916, term977916.getClass(), "oldErrorReporter", null);
        setField(term977916, term977916.getClass(), "defaultErrorReporter", null);
        setField(term977916, term977916.getClass(), "outStream", null);
        setField(term977916, term977916.getClass(), "globalRefMap", null);
        setField(term977916, term977916.getClass(), "sanityCheck", null);
        setField(term977916, term977916.getClass(), "currentTracer", null);
        setField(term977916, term977916.getClass(), "currentPassName", null);
        setField(term977916, term977916.getClass(), "recentChange", null);
        setField(term977916, term977916.getClass(), "codeChangeHandlers", null);
        setField(term977916, term977916.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSource", argTypes, term977916, args);
    }

};


