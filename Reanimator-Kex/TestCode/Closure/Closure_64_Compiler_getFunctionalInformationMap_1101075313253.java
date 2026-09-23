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

public class Compiler_getFunctionalInformationMap_1101075313253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978086;

    public Compiler_getFunctionalInformationMap_1101075313253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978086 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978086, term978086.getClass(), "options", null);
        setField(term978086, term978086.getClass(), "passes", null);
        setField(term978086, term978086.getClass(), "externs", null);
        setField(term978086, term978086.getClass(), "modules", null);
        setField(term978086, term978086.getClass(), "moduleGraph", null);
        setField(term978086, term978086.getClass(), "inputs", null);
        setField(term978086, term978086.getClass(), "errorManager", null);
        setField(term978086, term978086.getClass(), "warningsGuard", null);
        setField(term978086, term978086.getClass(), "externsRoot", null);
        setField(term978086, term978086.getClass(), "jsRoot", null);
        setField(term978086, term978086.getClass(), "externAndJsRoot", null);
        setField(term978086, term978086.getClass(), "inputsByName", null);
        setField(term978086, term978086.getClass(), "sourceMap", null);
        setField(term978086, term978086.getClass(), "externExports", null);
        setIntField(term978086, term978086.getClass(), "uniqueNameId", 0);
        setBooleanField(term978086, term978086.getClass(), "useThreads", false);
        setBooleanField(term978086, term978086.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978086, term978086.getClass(), "functionInformationMap", null);
        setField(term978086, term978086.getClass(), "debugLog", null);
        setField(term978086, term978086.getClass(), "defaultCodingConvention", null);
        setField(term978086, term978086.getClass(), "typeRegistry", null);
        setField(term978086, term978086.getClass(), "parserConfig", null);
        setField(term978086, term978086.getClass(), "abstractInterpreter", null);
        setField(term978086, term978086.getClass(), "typeValidator", null);
        setField(term978086, term978086.getClass(), "tracker", null);
        setField(term978086, term978086.getClass(), "oldErrorReporter", null);
        setField(term978086, term978086.getClass(), "defaultErrorReporter", null);
        setField(term978086, term978086.getClass(), "outStream", null);
        setField(term978086, term978086.getClass(), "globalRefMap", null);
        setField(term978086, term978086.getClass(), "sanityCheck", null);
        setField(term978086, term978086.getClass(), "currentTracer", null);
        setField(term978086, term978086.getClass(), "currentPassName", null);
        setField(term978086, term978086.getClass(), "recentChange", null);
        setField(term978086, term978086.getClass(), "codeChangeHandlers", null);
        setField(term978086, term978086.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFunctionalInformationMap", argTypes, term978086, args);
    }

};


