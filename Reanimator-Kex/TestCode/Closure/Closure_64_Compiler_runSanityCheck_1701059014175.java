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

public class Compiler_runSanityCheck_1701059014175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977768;

    public Compiler_runSanityCheck_1701059014175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977768 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977768, term977768.getClass(), "options", null);
        setField(term977768, term977768.getClass(), "passes", null);
        setField(term977768, term977768.getClass(), "externs", null);
        setField(term977768, term977768.getClass(), "modules", null);
        setField(term977768, term977768.getClass(), "moduleGraph", null);
        setField(term977768, term977768.getClass(), "inputs", null);
        setField(term977768, term977768.getClass(), "errorManager", null);
        setField(term977768, term977768.getClass(), "warningsGuard", null);
        setField(term977768, term977768.getClass(), "externsRoot", null);
        setField(term977768, term977768.getClass(), "jsRoot", null);
        setField(term977768, term977768.getClass(), "externAndJsRoot", null);
        setField(term977768, term977768.getClass(), "inputsByName", null);
        setField(term977768, term977768.getClass(), "sourceMap", null);
        setField(term977768, term977768.getClass(), "externExports", null);
        setIntField(term977768, term977768.getClass(), "uniqueNameId", 0);
        setBooleanField(term977768, term977768.getClass(), "useThreads", false);
        setBooleanField(term977768, term977768.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977768, term977768.getClass(), "functionInformationMap", null);
        setField(term977768, term977768.getClass(), "debugLog", null);
        setField(term977768, term977768.getClass(), "defaultCodingConvention", null);
        setField(term977768, term977768.getClass(), "typeRegistry", null);
        setField(term977768, term977768.getClass(), "parserConfig", null);
        setField(term977768, term977768.getClass(), "abstractInterpreter", null);
        setField(term977768, term977768.getClass(), "typeValidator", null);
        setField(term977768, term977768.getClass(), "tracker", null);
        setField(term977768, term977768.getClass(), "oldErrorReporter", null);
        setField(term977768, term977768.getClass(), "defaultErrorReporter", null);
        setField(term977768, term977768.getClass(), "outStream", null);
        setField(term977768, term977768.getClass(), "globalRefMap", null);
        setField(term977768, term977768.getClass(), "sanityCheck", null);
        setField(term977768, term977768.getClass(), "currentTracer", null);
        setField(term977768, term977768.getClass(), "currentPassName", null);
        setField(term977768, term977768.getClass(), "recentChange", null);
        setField(term977768, term977768.getClass(), "codeChangeHandlers", null);
        setField(term977768, term977768.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "runSanityCheck", argTypes, term977768, args);
    }

};


