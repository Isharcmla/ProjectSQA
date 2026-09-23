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

public class Compiler_process_404800763169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896138;

    public Compiler_process_404800763169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896138 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896138, term896138.getClass(), "options", null);
        setField(term896138, term896138.getClass(), "passes", null);
        setField(term896138, term896138.getClass(), "externs", null);
        setField(term896138, term896138.getClass(), "modules", null);
        setField(term896138, term896138.getClass(), "moduleGraph", null);
        setField(term896138, term896138.getClass(), "inputs", null);
        setField(term896138, term896138.getClass(), "errorManager", null);
        setField(term896138, term896138.getClass(), "warningsGuard", null);
        setField(term896138, term896138.getClass(), "externsRoot", null);
        setField(term896138, term896138.getClass(), "jsRoot", null);
        setField(term896138, term896138.getClass(), "externAndJsRoot", null);
        setField(term896138, term896138.getClass(), "inputsByName", null);
        setField(term896138, term896138.getClass(), "sourceMap", null);
        setField(term896138, term896138.getClass(), "externExports", null);
        setIntField(term896138, term896138.getClass(), "uniqueNameId", 0);
        setBooleanField(term896138, term896138.getClass(), "useThreads", false);
        setBooleanField(term896138, term896138.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896138, term896138.getClass(), "functionInformationMap", null);
        setField(term896138, term896138.getClass(), "debugLog", null);
        setField(term896138, term896138.getClass(), "defaultCodingConvention", null);
        setField(term896138, term896138.getClass(), "typeRegistry", null);
        setField(term896138, term896138.getClass(), "parserConfig", null);
        setField(term896138, term896138.getClass(), "abstractInterpreter", null);
        setField(term896138, term896138.getClass(), "typeValidator", null);
        setField(term896138, term896138.getClass(), "tracker", null);
        setField(term896138, term896138.getClass(), "oldErrorReporter", null);
        setField(term896138, term896138.getClass(), "defaultErrorReporter", null);
        setField(term896138, term896138.getClass(), "outStream", null);
        setField(term896138, term896138.getClass(), "globalRefMap", null);
        setField(term896138, term896138.getClass(), "sanityCheck", null);
        setField(term896138, term896138.getClass(), "currentTracer", null);
        setField(term896138, term896138.getClass(), "currentPassName", null);
        setField(term896138, term896138.getClass(), "recentChange", null);
        setField(term896138, term896138.getClass(), "codeChangeHandlers", null);
        setField(term896138, term896138.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerPass");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term896138, args);
    }

};


