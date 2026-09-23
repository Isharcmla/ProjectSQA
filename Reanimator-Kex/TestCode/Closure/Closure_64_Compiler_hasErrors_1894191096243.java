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

public class Compiler_hasErrors_1894191096243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978042;

    public Compiler_hasErrors_1894191096243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978042 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978042, term978042.getClass(), "options", null);
        setField(term978042, term978042.getClass(), "passes", null);
        setField(term978042, term978042.getClass(), "externs", null);
        setField(term978042, term978042.getClass(), "modules", null);
        setField(term978042, term978042.getClass(), "moduleGraph", null);
        setField(term978042, term978042.getClass(), "inputs", null);
        setField(term978042, term978042.getClass(), "errorManager", null);
        setField(term978042, term978042.getClass(), "warningsGuard", null);
        setField(term978042, term978042.getClass(), "externsRoot", null);
        setField(term978042, term978042.getClass(), "jsRoot", null);
        setField(term978042, term978042.getClass(), "externAndJsRoot", null);
        setField(term978042, term978042.getClass(), "inputsByName", null);
        setField(term978042, term978042.getClass(), "sourceMap", null);
        setField(term978042, term978042.getClass(), "externExports", null);
        setIntField(term978042, term978042.getClass(), "uniqueNameId", 0);
        setBooleanField(term978042, term978042.getClass(), "useThreads", false);
        setBooleanField(term978042, term978042.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978042, term978042.getClass(), "functionInformationMap", null);
        setField(term978042, term978042.getClass(), "debugLog", null);
        setField(term978042, term978042.getClass(), "defaultCodingConvention", null);
        setField(term978042, term978042.getClass(), "typeRegistry", null);
        setField(term978042, term978042.getClass(), "parserConfig", null);
        setField(term978042, term978042.getClass(), "abstractInterpreter", null);
        setField(term978042, term978042.getClass(), "typeValidator", null);
        setField(term978042, term978042.getClass(), "tracker", null);
        setField(term978042, term978042.getClass(), "oldErrorReporter", null);
        setField(term978042, term978042.getClass(), "defaultErrorReporter", null);
        setField(term978042, term978042.getClass(), "outStream", null);
        setField(term978042, term978042.getClass(), "globalRefMap", null);
        setField(term978042, term978042.getClass(), "sanityCheck", null);
        setField(term978042, term978042.getClass(), "currentTracer", null);
        setField(term978042, term978042.getClass(), "currentPassName", null);
        setField(term978042, term978042.getClass(), "recentChange", null);
        setField(term978042, term978042.getClass(), "codeChangeHandlers", null);
        setField(term978042, term978042.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasErrors", argTypes, term978042, args);
    }

};


