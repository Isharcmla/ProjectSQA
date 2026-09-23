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

public class Compiler_parseInputs_973004842206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854799;

    public Compiler_parseInputs_973004842206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854799 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854799, term854799.getClass(), "options", null);
        setField(term854799, term854799.getClass(), "passes", null);
        setField(term854799, term854799.getClass(), "externs", null);
        setField(term854799, term854799.getClass(), "modules", null);
        setField(term854799, term854799.getClass(), "moduleGraph", null);
        setField(term854799, term854799.getClass(), "inputs", null);
        setField(term854799, term854799.getClass(), "errorManager", null);
        setField(term854799, term854799.getClass(), "warningsGuard", null);
        setField(term854799, term854799.getClass(), "externsRoot", null);
        setField(term854799, term854799.getClass(), "jsRoot", null);
        setField(term854799, term854799.getClass(), "externAndJsRoot", null);
        setField(term854799, term854799.getClass(), "inputsByName", null);
        setField(term854799, term854799.getClass(), "sourceMap", null);
        setField(term854799, term854799.getClass(), "externExports", null);
        setIntField(term854799, term854799.getClass(), "uniqueNameId", 0);
        setBooleanField(term854799, term854799.getClass(), "useThreads", false);
        setBooleanField(term854799, term854799.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854799, term854799.getClass(), "functionInformationMap", null);
        setField(term854799, term854799.getClass(), "debugLog", null);
        setField(term854799, term854799.getClass(), "defaultCodingConvention", null);
        setField(term854799, term854799.getClass(), "typeRegistry", null);
        setField(term854799, term854799.getClass(), "parserConfig", null);
        setField(term854799, term854799.getClass(), "abstractInterpreter", null);
        setField(term854799, term854799.getClass(), "typeValidator", null);
        setField(term854799, term854799.getClass(), "tracker", null);
        setField(term854799, term854799.getClass(), "oldErrorReporter", null);
        setField(term854799, term854799.getClass(), "defaultErrorReporter", null);
        setField(term854799, term854799.getClass(), "outStream", null);
        setField(term854799, term854799.getClass(), "globalRefMap", null);
        setField(term854799, term854799.getClass(), "sanityCheck", null);
        setField(term854799, term854799.getClass(), "currentTracer", null);
        setField(term854799, term854799.getClass(), "currentPassName", null);
        setField(term854799, term854799.getClass(), "recentChange", null);
        setField(term854799, term854799.getClass(), "codeChangeHandlers", null);
        setField(term854799, term854799.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseInputs", argTypes, term854799, args);
    }

};


