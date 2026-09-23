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

public class Compiler_reportCodeChange_308902984231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854946;

    public Compiler_reportCodeChange_308902984231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854946 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854946, term854946.getClass(), "options", null);
        setField(term854946, term854946.getClass(), "passes", null);
        setField(term854946, term854946.getClass(), "externs", null);
        setField(term854946, term854946.getClass(), "modules", null);
        setField(term854946, term854946.getClass(), "moduleGraph", null);
        setField(term854946, term854946.getClass(), "inputs", null);
        setField(term854946, term854946.getClass(), "errorManager", null);
        setField(term854946, term854946.getClass(), "warningsGuard", null);
        setField(term854946, term854946.getClass(), "externsRoot", null);
        setField(term854946, term854946.getClass(), "jsRoot", null);
        setField(term854946, term854946.getClass(), "externAndJsRoot", null);
        setField(term854946, term854946.getClass(), "inputsByName", null);
        setField(term854946, term854946.getClass(), "sourceMap", null);
        setField(term854946, term854946.getClass(), "externExports", null);
        setIntField(term854946, term854946.getClass(), "uniqueNameId", 0);
        setBooleanField(term854946, term854946.getClass(), "useThreads", false);
        setBooleanField(term854946, term854946.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854946, term854946.getClass(), "functionInformationMap", null);
        setField(term854946, term854946.getClass(), "debugLog", null);
        setField(term854946, term854946.getClass(), "defaultCodingConvention", null);
        setField(term854946, term854946.getClass(), "typeRegistry", null);
        setField(term854946, term854946.getClass(), "parserConfig", null);
        setField(term854946, term854946.getClass(), "abstractInterpreter", null);
        setField(term854946, term854946.getClass(), "typeValidator", null);
        setField(term854946, term854946.getClass(), "tracker", null);
        setField(term854946, term854946.getClass(), "oldErrorReporter", null);
        setField(term854946, term854946.getClass(), "defaultErrorReporter", null);
        setField(term854946, term854946.getClass(), "outStream", null);
        setField(term854946, term854946.getClass(), "globalRefMap", null);
        setField(term854946, term854946.getClass(), "sanityCheck", null);
        setField(term854946, term854946.getClass(), "currentTracer", null);
        setField(term854946, term854946.getClass(), "currentPassName", null);
        setField(term854946, term854946.getClass(), "recentChange", null);
        setField(term854946, term854946.getClass(), "codeChangeHandlers", null);
        setField(term854946, term854946.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportCodeChange", argTypes, term854946, args);
    }

};


