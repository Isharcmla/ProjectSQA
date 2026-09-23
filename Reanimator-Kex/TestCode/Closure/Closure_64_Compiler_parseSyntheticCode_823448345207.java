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

public class Compiler_parseSyntheticCode_823448345207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977896;

    public Compiler_parseSyntheticCode_823448345207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977896 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977896, term977896.getClass(), "options", null);
        setField(term977896, term977896.getClass(), "passes", null);
        setField(term977896, term977896.getClass(), "externs", null);
        setField(term977896, term977896.getClass(), "modules", null);
        setField(term977896, term977896.getClass(), "moduleGraph", null);
        setField(term977896, term977896.getClass(), "inputs", null);
        setField(term977896, term977896.getClass(), "errorManager", null);
        setField(term977896, term977896.getClass(), "warningsGuard", null);
        setField(term977896, term977896.getClass(), "externsRoot", null);
        setField(term977896, term977896.getClass(), "jsRoot", null);
        setField(term977896, term977896.getClass(), "externAndJsRoot", null);
        setField(term977896, term977896.getClass(), "inputsByName", null);
        setField(term977896, term977896.getClass(), "sourceMap", null);
        setField(term977896, term977896.getClass(), "externExports", null);
        setIntField(term977896, term977896.getClass(), "uniqueNameId", 0);
        setBooleanField(term977896, term977896.getClass(), "useThreads", false);
        setBooleanField(term977896, term977896.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977896, term977896.getClass(), "functionInformationMap", null);
        setField(term977896, term977896.getClass(), "debugLog", null);
        setField(term977896, term977896.getClass(), "defaultCodingConvention", null);
        setField(term977896, term977896.getClass(), "typeRegistry", null);
        setField(term977896, term977896.getClass(), "parserConfig", null);
        setField(term977896, term977896.getClass(), "abstractInterpreter", null);
        setField(term977896, term977896.getClass(), "typeValidator", null);
        setField(term977896, term977896.getClass(), "tracker", null);
        setField(term977896, term977896.getClass(), "oldErrorReporter", null);
        setField(term977896, term977896.getClass(), "defaultErrorReporter", null);
        setField(term977896, term977896.getClass(), "outStream", null);
        setField(term977896, term977896.getClass(), "globalRefMap", null);
        setField(term977896, term977896.getClass(), "sanityCheck", null);
        setField(term977896, term977896.getClass(), "currentTracer", null);
        setField(term977896, term977896.getClass(), "currentPassName", null);
        setField(term977896, term977896.getClass(), "recentChange", null);
        setField(term977896, term977896.getClass(), "codeChangeHandlers", null);
        setField(term977896, term977896.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "parseSyntheticCode", argTypes, term977896, args);
    }

};


