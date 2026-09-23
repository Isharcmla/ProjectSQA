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

public class Compiler_getPropertyMap_1199768521254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855042;

    public Compiler_getPropertyMap_1199768521254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855042 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855042, term855042.getClass(), "options", null);
        setField(term855042, term855042.getClass(), "passes", null);
        setField(term855042, term855042.getClass(), "externs", null);
        setField(term855042, term855042.getClass(), "modules", null);
        setField(term855042, term855042.getClass(), "moduleGraph", null);
        setField(term855042, term855042.getClass(), "inputs", null);
        setField(term855042, term855042.getClass(), "errorManager", null);
        setField(term855042, term855042.getClass(), "warningsGuard", null);
        setField(term855042, term855042.getClass(), "externsRoot", null);
        setField(term855042, term855042.getClass(), "jsRoot", null);
        setField(term855042, term855042.getClass(), "externAndJsRoot", null);
        setField(term855042, term855042.getClass(), "inputsByName", null);
        setField(term855042, term855042.getClass(), "sourceMap", null);
        setField(term855042, term855042.getClass(), "externExports", null);
        setIntField(term855042, term855042.getClass(), "uniqueNameId", 0);
        setBooleanField(term855042, term855042.getClass(), "useThreads", false);
        setBooleanField(term855042, term855042.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855042, term855042.getClass(), "functionInformationMap", null);
        setField(term855042, term855042.getClass(), "debugLog", null);
        setField(term855042, term855042.getClass(), "defaultCodingConvention", null);
        setField(term855042, term855042.getClass(), "typeRegistry", null);
        setField(term855042, term855042.getClass(), "parserConfig", null);
        setField(term855042, term855042.getClass(), "abstractInterpreter", null);
        setField(term855042, term855042.getClass(), "typeValidator", null);
        setField(term855042, term855042.getClass(), "tracker", null);
        setField(term855042, term855042.getClass(), "oldErrorReporter", null);
        setField(term855042, term855042.getClass(), "defaultErrorReporter", null);
        setField(term855042, term855042.getClass(), "outStream", null);
        setField(term855042, term855042.getClass(), "globalRefMap", null);
        setField(term855042, term855042.getClass(), "sanityCheck", null);
        setField(term855042, term855042.getClass(), "currentTracer", null);
        setField(term855042, term855042.getClass(), "currentPassName", null);
        setField(term855042, term855042.getClass(), "recentChange", null);
        setField(term855042, term855042.getClass(), "codeChangeHandlers", null);
        setField(term855042, term855042.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertyMap", argTypes, term855042, args);
    }

};


