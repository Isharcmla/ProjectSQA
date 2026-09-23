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
import java.lang.Integer;

public class Compiler_getSourceLine_1634167566246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978054;
     Object term978058;

    public Compiler_getSourceLine_1634167566246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978054 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978054, term978054.getClass(), "options", null);
        setField(term978054, term978054.getClass(), "passes", null);
        setField(term978054, term978054.getClass(), "externs", null);
        setField(term978054, term978054.getClass(), "modules", null);
        setField(term978054, term978054.getClass(), "moduleGraph", null);
        setField(term978054, term978054.getClass(), "inputs", null);
        setField(term978054, term978054.getClass(), "errorManager", null);
        setField(term978054, term978054.getClass(), "warningsGuard", null);
        setField(term978054, term978054.getClass(), "externsRoot", null);
        setField(term978054, term978054.getClass(), "jsRoot", null);
        setField(term978054, term978054.getClass(), "externAndJsRoot", null);
        setField(term978054, term978054.getClass(), "inputsByName", null);
        setField(term978054, term978054.getClass(), "sourceMap", null);
        setField(term978054, term978054.getClass(), "externExports", null);
        setIntField(term978054, term978054.getClass(), "uniqueNameId", 0);
        setBooleanField(term978054, term978054.getClass(), "useThreads", false);
        setBooleanField(term978054, term978054.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978054, term978054.getClass(), "functionInformationMap", null);
        setField(term978054, term978054.getClass(), "debugLog", null);
        setField(term978054, term978054.getClass(), "defaultCodingConvention", null);
        setField(term978054, term978054.getClass(), "typeRegistry", null);
        setField(term978054, term978054.getClass(), "parserConfig", null);
        setField(term978054, term978054.getClass(), "abstractInterpreter", null);
        setField(term978054, term978054.getClass(), "typeValidator", null);
        setField(term978054, term978054.getClass(), "tracker", null);
        setField(term978054, term978054.getClass(), "oldErrorReporter", null);
        setField(term978054, term978054.getClass(), "defaultErrorReporter", null);
        setField(term978054, term978054.getClass(), "outStream", null);
        setField(term978054, term978054.getClass(), "globalRefMap", null);
        setField(term978054, term978054.getClass(), "sanityCheck", null);
        setField(term978054, term978054.getClass(), "currentTracer", null);
        setField(term978054, term978054.getClass(), "currentPassName", null);
        setField(term978054, term978054.getClass(), "recentChange", null);
        setField(term978054, term978054.getClass(), "codeChangeHandlers", null);
        setField(term978054, term978054.getClass(), "stage", null);
        term978058 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term978058;
        callMethod(klass, "getSourceLine", argTypes, term978054, args);
    }

};


