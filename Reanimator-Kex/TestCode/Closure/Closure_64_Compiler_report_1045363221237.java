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

public class Compiler_report_1045363221237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978018;

    public Compiler_report_1045363221237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978018 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978018, term978018.getClass(), "options", null);
        setField(term978018, term978018.getClass(), "passes", null);
        setField(term978018, term978018.getClass(), "externs", null);
        setField(term978018, term978018.getClass(), "modules", null);
        setField(term978018, term978018.getClass(), "moduleGraph", null);
        setField(term978018, term978018.getClass(), "inputs", null);
        setField(term978018, term978018.getClass(), "errorManager", null);
        setField(term978018, term978018.getClass(), "warningsGuard", null);
        setField(term978018, term978018.getClass(), "externsRoot", null);
        setField(term978018, term978018.getClass(), "jsRoot", null);
        setField(term978018, term978018.getClass(), "externAndJsRoot", null);
        setField(term978018, term978018.getClass(), "inputsByName", null);
        setField(term978018, term978018.getClass(), "sourceMap", null);
        setField(term978018, term978018.getClass(), "externExports", null);
        setIntField(term978018, term978018.getClass(), "uniqueNameId", 0);
        setBooleanField(term978018, term978018.getClass(), "useThreads", false);
        setBooleanField(term978018, term978018.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978018, term978018.getClass(), "functionInformationMap", null);
        setField(term978018, term978018.getClass(), "debugLog", null);
        setField(term978018, term978018.getClass(), "defaultCodingConvention", null);
        setField(term978018, term978018.getClass(), "typeRegistry", null);
        setField(term978018, term978018.getClass(), "parserConfig", null);
        setField(term978018, term978018.getClass(), "abstractInterpreter", null);
        setField(term978018, term978018.getClass(), "typeValidator", null);
        setField(term978018, term978018.getClass(), "tracker", null);
        setField(term978018, term978018.getClass(), "oldErrorReporter", null);
        setField(term978018, term978018.getClass(), "defaultErrorReporter", null);
        setField(term978018, term978018.getClass(), "outStream", null);
        setField(term978018, term978018.getClass(), "globalRefMap", null);
        setField(term978018, term978018.getClass(), "sanityCheck", null);
        setField(term978018, term978018.getClass(), "currentTracer", null);
        setField(term978018, term978018.getClass(), "currentPassName", null);
        setField(term978018, term978018.getClass(), "recentChange", null);
        setField(term978018, term978018.getClass(), "codeChangeHandlers", null);
        setField(term978018, term978018.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "report", argTypes, term978018, args);
    }

};


