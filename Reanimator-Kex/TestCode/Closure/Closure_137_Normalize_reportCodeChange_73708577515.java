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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Normalize_reportCodeChange_73708577515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2997;
     Object term199255;

    public Normalize_reportCodeChange_73708577515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3129 = new ArrayList();
        term2997 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term3077 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term2997, term2997.getClass(), "assertOnChange", false);
        setField(term3077, term3077.getClass(), "codeChangeHandlers", term3129);
        setField(term2997, term2997.getClass(), "compiler", term3077);
        ArrayList term199257 = new ArrayList();
        term199255 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term199256 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term199256, term199256.getClass(), "options_", null);
        setField(term199256, term199256.getClass(), "passes", null);
        setField(term199256, term199256.getClass(), "externs_", null);
        setField(term199256, term199256.getClass(), "modules_", null);
        setField(term199256, term199256.getClass(), "moduleGraph_", null);
        setField(term199256, term199256.getClass(), "inputs_", null);
        setField(term199256, term199256.getClass(), "errorManager", null);
        setField(term199256, term199256.getClass(), "symbolTable", null);
        setField(term199256, term199256.getClass(), "externsRoot", null);
        setField(term199256, term199256.getClass(), "jsRoot", null);
        setField(term199256, term199256.getClass(), "externAndJsRoot", null);
        setField(term199256, term199256.getClass(), "inputsByName_", null);
        setField(term199256, term199256.getClass(), "sourceMap_", null);
        setField(term199256, term199256.getClass(), "externExports_", null);
        setIntField(term199256, term199256.getClass(), "uniqueNameId", 0);
        setBooleanField(term199256, term199256.getClass(), "normalized", false);
        setBooleanField(term199256, term199256.getClass(), "useThreads", false);
        setField(term199256, term199256.getClass(), "functionInformationMap_", null);
        setField(term199256, term199256.getClass(), "debugLog_", null);
        setField(term199256, term199256.getClass(), "defaultCodingConvention", null);
        setField(term199256, term199256.getClass(), "typeRegistry", null);
        setField(term199256, term199256.getClass(), "parserConfig", null);
        setField(term199256, term199256.getClass(), "abstractInterpreter", null);
        setField(term199256, term199256.getClass(), "typeValidator", null);
        setField(term199256, term199256.getClass(), "tracker", null);
        setField(term199256, term199256.getClass(), "oldErrorReporter", null);
        setField(term199256, term199256.getClass(), "defaultErrorReporter", null);
        setField(term199256, term199256.getClass(), "sanityCheck", null);
        setField(term199256, term199256.getClass(), "currentTracer", null);
        setField(term199256, term199256.getClass(), "currentPassName", null);
        setField(term199256, term199256.getClass(), "recentChange", null);
        setField(term199256, term199256.getClass(), "codeChangeHandlers", term199257);
        setField(term199255, term199255.getClass(), "compiler", term199256);
        setBooleanField(term199255, term199255.getClass(), "assertOnChange", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "reportCodeChange", argTypes, term2997, args);
        assertTrue(recursiveEquals(term2997, term199255));
    }

};


