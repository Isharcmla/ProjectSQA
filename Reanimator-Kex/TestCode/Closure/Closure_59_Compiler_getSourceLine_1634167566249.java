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

public class Compiler_getSourceLine_1634167566249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855018;
     Object term855022;

    public Compiler_getSourceLine_1634167566249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855018 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855018, term855018.getClass(), "options", null);
        setField(term855018, term855018.getClass(), "passes", null);
        setField(term855018, term855018.getClass(), "externs", null);
        setField(term855018, term855018.getClass(), "modules", null);
        setField(term855018, term855018.getClass(), "moduleGraph", null);
        setField(term855018, term855018.getClass(), "inputs", null);
        setField(term855018, term855018.getClass(), "errorManager", null);
        setField(term855018, term855018.getClass(), "warningsGuard", null);
        setField(term855018, term855018.getClass(), "externsRoot", null);
        setField(term855018, term855018.getClass(), "jsRoot", null);
        setField(term855018, term855018.getClass(), "externAndJsRoot", null);
        setField(term855018, term855018.getClass(), "inputsByName", null);
        setField(term855018, term855018.getClass(), "sourceMap", null);
        setField(term855018, term855018.getClass(), "externExports", null);
        setIntField(term855018, term855018.getClass(), "uniqueNameId", 0);
        setBooleanField(term855018, term855018.getClass(), "useThreads", false);
        setBooleanField(term855018, term855018.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855018, term855018.getClass(), "functionInformationMap", null);
        setField(term855018, term855018.getClass(), "debugLog", null);
        setField(term855018, term855018.getClass(), "defaultCodingConvention", null);
        setField(term855018, term855018.getClass(), "typeRegistry", null);
        setField(term855018, term855018.getClass(), "parserConfig", null);
        setField(term855018, term855018.getClass(), "abstractInterpreter", null);
        setField(term855018, term855018.getClass(), "typeValidator", null);
        setField(term855018, term855018.getClass(), "tracker", null);
        setField(term855018, term855018.getClass(), "oldErrorReporter", null);
        setField(term855018, term855018.getClass(), "defaultErrorReporter", null);
        setField(term855018, term855018.getClass(), "outStream", null);
        setField(term855018, term855018.getClass(), "globalRefMap", null);
        setField(term855018, term855018.getClass(), "sanityCheck", null);
        setField(term855018, term855018.getClass(), "currentTracer", null);
        setField(term855018, term855018.getClass(), "currentPassName", null);
        setField(term855018, term855018.getClass(), "recentChange", null);
        setField(term855018, term855018.getClass(), "codeChangeHandlers", null);
        setField(term855018, term855018.getClass(), "stage", null);
        term855022 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term855022;
        callMethod(klass, "getSourceLine", argTypes, term855018, args);
    }

};


