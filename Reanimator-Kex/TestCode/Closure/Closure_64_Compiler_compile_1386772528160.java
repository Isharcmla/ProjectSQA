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

public class Compiler_compile_1386772528160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977704;

    public Compiler_compile_1386772528160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977704 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977704, term977704.getClass(), "options", null);
        setField(term977704, term977704.getClass(), "passes", null);
        setField(term977704, term977704.getClass(), "externs", null);
        setField(term977704, term977704.getClass(), "modules", null);
        setField(term977704, term977704.getClass(), "moduleGraph", null);
        setField(term977704, term977704.getClass(), "inputs", null);
        setField(term977704, term977704.getClass(), "errorManager", null);
        setField(term977704, term977704.getClass(), "warningsGuard", null);
        setField(term977704, term977704.getClass(), "externsRoot", null);
        setField(term977704, term977704.getClass(), "jsRoot", null);
        setField(term977704, term977704.getClass(), "externAndJsRoot", null);
        setField(term977704, term977704.getClass(), "inputsByName", null);
        setField(term977704, term977704.getClass(), "sourceMap", null);
        setField(term977704, term977704.getClass(), "externExports", null);
        setIntField(term977704, term977704.getClass(), "uniqueNameId", 0);
        setBooleanField(term977704, term977704.getClass(), "useThreads", false);
        setBooleanField(term977704, term977704.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977704, term977704.getClass(), "functionInformationMap", null);
        setField(term977704, term977704.getClass(), "debugLog", null);
        setField(term977704, term977704.getClass(), "defaultCodingConvention", null);
        setField(term977704, term977704.getClass(), "typeRegistry", null);
        setField(term977704, term977704.getClass(), "parserConfig", null);
        setField(term977704, term977704.getClass(), "abstractInterpreter", null);
        setField(term977704, term977704.getClass(), "typeValidator", null);
        setField(term977704, term977704.getClass(), "tracker", null);
        setField(term977704, term977704.getClass(), "oldErrorReporter", null);
        setField(term977704, term977704.getClass(), "defaultErrorReporter", null);
        setField(term977704, term977704.getClass(), "outStream", null);
        setField(term977704, term977704.getClass(), "globalRefMap", null);
        setField(term977704, term977704.getClass(), "sanityCheck", null);
        setField(term977704, term977704.getClass(), "currentTracer", null);
        setField(term977704, term977704.getClass(), "currentPassName", null);
        setField(term977704, term977704.getClass(), "recentChange", null);
        setField(term977704, term977704.getClass(), "codeChangeHandlers", null);
        setField(term977704, term977704.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compile", argTypes, term977704, args);
    }

};


