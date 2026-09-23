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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Compiler_compileInternal_1928486329180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71770;

    public Compiler_compileInternal_1928486329180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71770 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71770, term71770.getClass(), "options", null);
        setField(term71770, term71770.getClass(), "passes", null);
        setField(term71770, term71770.getClass(), "externs", null);
        setField(term71770, term71770.getClass(), "modules", null);
        setField(term71770, term71770.getClass(), "moduleGraph", null);
        setField(term71770, term71770.getClass(), "inputs", null);
        setField(term71770, term71770.getClass(), "errorManager", null);
        setField(term71770, term71770.getClass(), "symbolTable", null);
        setField(term71770, term71770.getClass(), "externsRoot", null);
        setField(term71770, term71770.getClass(), "jsRoot", null);
        setField(term71770, term71770.getClass(), "externAndJsRoot", null);
        setField(term71770, term71770.getClass(), "inputsByName", null);
        setField(term71770, term71770.getClass(), "sourceMap", null);
        setField(term71770, term71770.getClass(), "externExports", null);
        setIntField(term71770, term71770.getClass(), "uniqueNameId", 0);
        setBooleanField(term71770, term71770.getClass(), "normalized", false);
        setBooleanField(term71770, term71770.getClass(), "useThreads", false);
        setField(term71770, term71770.getClass(), "functionInformationMap", null);
        setField(term71770, term71770.getClass(), "debugLog", null);
        setField(term71770, term71770.getClass(), "defaultCodingConvention", null);
        setField(term71770, term71770.getClass(), "typeRegistry", null);
        setField(term71770, term71770.getClass(), "parserConfig", null);
        setField(term71770, term71770.getClass(), "abstractInterpreter", null);
        setField(term71770, term71770.getClass(), "typeValidator", null);
        setField(term71770, term71770.getClass(), "tracker", null);
        setField(term71770, term71770.getClass(), "oldErrorReporter", null);
        setField(term71770, term71770.getClass(), "defaultErrorReporter", null);
        setField(term71770, term71770.getClass(), "outStream", null);
        setField(term71770, term71770.getClass(), "sanityCheck", null);
        setField(term71770, term71770.getClass(), "currentTracer", null);
        setField(term71770, term71770.getClass(), "currentPassName", null);
        setField(term71770, term71770.getClass(), "recentChange", null);
        setField(term71770, term71770.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "compileInternal", argTypes, term71770, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


