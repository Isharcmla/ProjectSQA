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

public class Compiler_getModuleGraph_6663115198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854767;

    public Compiler_getModuleGraph_6663115198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854767 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854767, term854767.getClass(), "options", null);
        setField(term854767, term854767.getClass(), "passes", null);
        setField(term854767, term854767.getClass(), "externs", null);
        setField(term854767, term854767.getClass(), "modules", null);
        setField(term854767, term854767.getClass(), "moduleGraph", null);
        setField(term854767, term854767.getClass(), "inputs", null);
        setField(term854767, term854767.getClass(), "errorManager", null);
        setField(term854767, term854767.getClass(), "warningsGuard", null);
        setField(term854767, term854767.getClass(), "externsRoot", null);
        setField(term854767, term854767.getClass(), "jsRoot", null);
        setField(term854767, term854767.getClass(), "externAndJsRoot", null);
        setField(term854767, term854767.getClass(), "inputsByName", null);
        setField(term854767, term854767.getClass(), "sourceMap", null);
        setField(term854767, term854767.getClass(), "externExports", null);
        setIntField(term854767, term854767.getClass(), "uniqueNameId", 0);
        setBooleanField(term854767, term854767.getClass(), "useThreads", false);
        setBooleanField(term854767, term854767.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854767, term854767.getClass(), "functionInformationMap", null);
        setField(term854767, term854767.getClass(), "debugLog", null);
        setField(term854767, term854767.getClass(), "defaultCodingConvention", null);
        setField(term854767, term854767.getClass(), "typeRegistry", null);
        setField(term854767, term854767.getClass(), "parserConfig", null);
        setField(term854767, term854767.getClass(), "abstractInterpreter", null);
        setField(term854767, term854767.getClass(), "typeValidator", null);
        setField(term854767, term854767.getClass(), "tracker", null);
        setField(term854767, term854767.getClass(), "oldErrorReporter", null);
        setField(term854767, term854767.getClass(), "defaultErrorReporter", null);
        setField(term854767, term854767.getClass(), "outStream", null);
        setField(term854767, term854767.getClass(), "globalRefMap", null);
        setField(term854767, term854767.getClass(), "sanityCheck", null);
        setField(term854767, term854767.getClass(), "currentTracer", null);
        setField(term854767, term854767.getClass(), "currentPassName", null);
        setField(term854767, term854767.getClass(), "recentChange", null);
        setField(term854767, term854767.getClass(), "codeChangeHandlers", null);
        setField(term854767, term854767.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModuleGraph", argTypes, term854767, args);
    }

};


