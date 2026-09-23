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

public class Compiler_isIdeMode_1554584378233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854954;

    public Compiler_isIdeMode_1554584378233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854954 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854954, term854954.getClass(), "options", null);
        setField(term854954, term854954.getClass(), "passes", null);
        setField(term854954, term854954.getClass(), "externs", null);
        setField(term854954, term854954.getClass(), "modules", null);
        setField(term854954, term854954.getClass(), "moduleGraph", null);
        setField(term854954, term854954.getClass(), "inputs", null);
        setField(term854954, term854954.getClass(), "errorManager", null);
        setField(term854954, term854954.getClass(), "warningsGuard", null);
        setField(term854954, term854954.getClass(), "externsRoot", null);
        setField(term854954, term854954.getClass(), "jsRoot", null);
        setField(term854954, term854954.getClass(), "externAndJsRoot", null);
        setField(term854954, term854954.getClass(), "inputsByName", null);
        setField(term854954, term854954.getClass(), "sourceMap", null);
        setField(term854954, term854954.getClass(), "externExports", null);
        setIntField(term854954, term854954.getClass(), "uniqueNameId", 0);
        setBooleanField(term854954, term854954.getClass(), "useThreads", false);
        setBooleanField(term854954, term854954.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854954, term854954.getClass(), "functionInformationMap", null);
        setField(term854954, term854954.getClass(), "debugLog", null);
        setField(term854954, term854954.getClass(), "defaultCodingConvention", null);
        setField(term854954, term854954.getClass(), "typeRegistry", null);
        setField(term854954, term854954.getClass(), "parserConfig", null);
        setField(term854954, term854954.getClass(), "abstractInterpreter", null);
        setField(term854954, term854954.getClass(), "typeValidator", null);
        setField(term854954, term854954.getClass(), "tracker", null);
        setField(term854954, term854954.getClass(), "oldErrorReporter", null);
        setField(term854954, term854954.getClass(), "defaultErrorReporter", null);
        setField(term854954, term854954.getClass(), "outStream", null);
        setField(term854954, term854954.getClass(), "globalRefMap", null);
        setField(term854954, term854954.getClass(), "sanityCheck", null);
        setField(term854954, term854954.getClass(), "currentTracer", null);
        setField(term854954, term854954.getClass(), "currentPassName", null);
        setField(term854954, term854954.getClass(), "recentChange", null);
        setField(term854954, term854954.getClass(), "codeChangeHandlers", null);
        setField(term854954, term854954.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isIdeMode", argTypes, term854954, args);
    }

};


