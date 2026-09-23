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

public class Compiler_precheck_1623370328171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854659;

    public Compiler_precheck_1623370328171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854659 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854659, term854659.getClass(), "options", null);
        setField(term854659, term854659.getClass(), "passes", null);
        setField(term854659, term854659.getClass(), "externs", null);
        setField(term854659, term854659.getClass(), "modules", null);
        setField(term854659, term854659.getClass(), "moduleGraph", null);
        setField(term854659, term854659.getClass(), "inputs", null);
        setField(term854659, term854659.getClass(), "errorManager", null);
        setField(term854659, term854659.getClass(), "warningsGuard", null);
        setField(term854659, term854659.getClass(), "externsRoot", null);
        setField(term854659, term854659.getClass(), "jsRoot", null);
        setField(term854659, term854659.getClass(), "externAndJsRoot", null);
        setField(term854659, term854659.getClass(), "inputsByName", null);
        setField(term854659, term854659.getClass(), "sourceMap", null);
        setField(term854659, term854659.getClass(), "externExports", null);
        setIntField(term854659, term854659.getClass(), "uniqueNameId", 0);
        setBooleanField(term854659, term854659.getClass(), "useThreads", false);
        setBooleanField(term854659, term854659.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854659, term854659.getClass(), "functionInformationMap", null);
        setField(term854659, term854659.getClass(), "debugLog", null);
        setField(term854659, term854659.getClass(), "defaultCodingConvention", null);
        setField(term854659, term854659.getClass(), "typeRegistry", null);
        setField(term854659, term854659.getClass(), "parserConfig", null);
        setField(term854659, term854659.getClass(), "abstractInterpreter", null);
        setField(term854659, term854659.getClass(), "typeValidator", null);
        setField(term854659, term854659.getClass(), "tracker", null);
        setField(term854659, term854659.getClass(), "oldErrorReporter", null);
        setField(term854659, term854659.getClass(), "defaultErrorReporter", null);
        setField(term854659, term854659.getClass(), "outStream", null);
        setField(term854659, term854659.getClass(), "globalRefMap", null);
        setField(term854659, term854659.getClass(), "sanityCheck", null);
        setField(term854659, term854659.getClass(), "currentTracer", null);
        setField(term854659, term854659.getClass(), "currentPassName", null);
        setField(term854659, term854659.getClass(), "recentChange", null);
        setField(term854659, term854659.getClass(), "codeChangeHandlers", null);
        setField(term854659, term854659.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "precheck", argTypes, term854659, args);
    }

};


