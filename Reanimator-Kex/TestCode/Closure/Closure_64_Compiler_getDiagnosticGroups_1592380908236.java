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

public class Compiler_getDiagnosticGroups_1592380908236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978014;

    public Compiler_getDiagnosticGroups_1592380908236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978014 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978014, term978014.getClass(), "options", null);
        setField(term978014, term978014.getClass(), "passes", null);
        setField(term978014, term978014.getClass(), "externs", null);
        setField(term978014, term978014.getClass(), "modules", null);
        setField(term978014, term978014.getClass(), "moduleGraph", null);
        setField(term978014, term978014.getClass(), "inputs", null);
        setField(term978014, term978014.getClass(), "errorManager", null);
        setField(term978014, term978014.getClass(), "warningsGuard", null);
        setField(term978014, term978014.getClass(), "externsRoot", null);
        setField(term978014, term978014.getClass(), "jsRoot", null);
        setField(term978014, term978014.getClass(), "externAndJsRoot", null);
        setField(term978014, term978014.getClass(), "inputsByName", null);
        setField(term978014, term978014.getClass(), "sourceMap", null);
        setField(term978014, term978014.getClass(), "externExports", null);
        setIntField(term978014, term978014.getClass(), "uniqueNameId", 0);
        setBooleanField(term978014, term978014.getClass(), "useThreads", false);
        setBooleanField(term978014, term978014.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978014, term978014.getClass(), "functionInformationMap", null);
        setField(term978014, term978014.getClass(), "debugLog", null);
        setField(term978014, term978014.getClass(), "defaultCodingConvention", null);
        setField(term978014, term978014.getClass(), "typeRegistry", null);
        setField(term978014, term978014.getClass(), "parserConfig", null);
        setField(term978014, term978014.getClass(), "abstractInterpreter", null);
        setField(term978014, term978014.getClass(), "typeValidator", null);
        setField(term978014, term978014.getClass(), "tracker", null);
        setField(term978014, term978014.getClass(), "oldErrorReporter", null);
        setField(term978014, term978014.getClass(), "defaultErrorReporter", null);
        setField(term978014, term978014.getClass(), "outStream", null);
        setField(term978014, term978014.getClass(), "globalRefMap", null);
        setField(term978014, term978014.getClass(), "sanityCheck", null);
        setField(term978014, term978014.getClass(), "currentTracer", null);
        setField(term978014, term978014.getClass(), "currentPassName", null);
        setField(term978014, term978014.getClass(), "recentChange", null);
        setField(term978014, term978014.getClass(), "codeChangeHandlers", null);
        setField(term978014, term978014.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiagnosticGroups", argTypes, term978014, args);
    }

};


