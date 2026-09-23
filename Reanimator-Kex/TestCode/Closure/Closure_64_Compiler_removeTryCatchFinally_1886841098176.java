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

public class Compiler_removeTryCatchFinally_1886841098176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977772;

    public Compiler_removeTryCatchFinally_1886841098176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977772 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977772, term977772.getClass(), "options", null);
        setField(term977772, term977772.getClass(), "passes", null);
        setField(term977772, term977772.getClass(), "externs", null);
        setField(term977772, term977772.getClass(), "modules", null);
        setField(term977772, term977772.getClass(), "moduleGraph", null);
        setField(term977772, term977772.getClass(), "inputs", null);
        setField(term977772, term977772.getClass(), "errorManager", null);
        setField(term977772, term977772.getClass(), "warningsGuard", null);
        setField(term977772, term977772.getClass(), "externsRoot", null);
        setField(term977772, term977772.getClass(), "jsRoot", null);
        setField(term977772, term977772.getClass(), "externAndJsRoot", null);
        setField(term977772, term977772.getClass(), "inputsByName", null);
        setField(term977772, term977772.getClass(), "sourceMap", null);
        setField(term977772, term977772.getClass(), "externExports", null);
        setIntField(term977772, term977772.getClass(), "uniqueNameId", 0);
        setBooleanField(term977772, term977772.getClass(), "useThreads", false);
        setBooleanField(term977772, term977772.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977772, term977772.getClass(), "functionInformationMap", null);
        setField(term977772, term977772.getClass(), "debugLog", null);
        setField(term977772, term977772.getClass(), "defaultCodingConvention", null);
        setField(term977772, term977772.getClass(), "typeRegistry", null);
        setField(term977772, term977772.getClass(), "parserConfig", null);
        setField(term977772, term977772.getClass(), "abstractInterpreter", null);
        setField(term977772, term977772.getClass(), "typeValidator", null);
        setField(term977772, term977772.getClass(), "tracker", null);
        setField(term977772, term977772.getClass(), "oldErrorReporter", null);
        setField(term977772, term977772.getClass(), "defaultErrorReporter", null);
        setField(term977772, term977772.getClass(), "outStream", null);
        setField(term977772, term977772.getClass(), "globalRefMap", null);
        setField(term977772, term977772.getClass(), "sanityCheck", null);
        setField(term977772, term977772.getClass(), "currentTracer", null);
        setField(term977772, term977772.getClass(), "currentPassName", null);
        setField(term977772, term977772.getClass(), "recentChange", null);
        setField(term977772, term977772.getClass(), "codeChangeHandlers", null);
        setField(term977772, term977772.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeTryCatchFinally", argTypes, term977772, args);
    }

};


