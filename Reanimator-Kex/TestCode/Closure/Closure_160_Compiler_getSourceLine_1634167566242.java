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
import java.lang.Integer;

public class Compiler_getSourceLine_1634167566242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896432;
     Object term896436;

    public Compiler_getSourceLine_1634167566242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896432 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896432, term896432.getClass(), "options", null);
        setField(term896432, term896432.getClass(), "passes", null);
        setField(term896432, term896432.getClass(), "externs", null);
        setField(term896432, term896432.getClass(), "modules", null);
        setField(term896432, term896432.getClass(), "moduleGraph", null);
        setField(term896432, term896432.getClass(), "inputs", null);
        setField(term896432, term896432.getClass(), "errorManager", null);
        setField(term896432, term896432.getClass(), "warningsGuard", null);
        setField(term896432, term896432.getClass(), "externsRoot", null);
        setField(term896432, term896432.getClass(), "jsRoot", null);
        setField(term896432, term896432.getClass(), "externAndJsRoot", null);
        setField(term896432, term896432.getClass(), "inputsByName", null);
        setField(term896432, term896432.getClass(), "sourceMap", null);
        setField(term896432, term896432.getClass(), "externExports", null);
        setIntField(term896432, term896432.getClass(), "uniqueNameId", 0);
        setBooleanField(term896432, term896432.getClass(), "useThreads", false);
        setBooleanField(term896432, term896432.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896432, term896432.getClass(), "functionInformationMap", null);
        setField(term896432, term896432.getClass(), "debugLog", null);
        setField(term896432, term896432.getClass(), "defaultCodingConvention", null);
        setField(term896432, term896432.getClass(), "typeRegistry", null);
        setField(term896432, term896432.getClass(), "parserConfig", null);
        setField(term896432, term896432.getClass(), "abstractInterpreter", null);
        setField(term896432, term896432.getClass(), "typeValidator", null);
        setField(term896432, term896432.getClass(), "tracker", null);
        setField(term896432, term896432.getClass(), "oldErrorReporter", null);
        setField(term896432, term896432.getClass(), "defaultErrorReporter", null);
        setField(term896432, term896432.getClass(), "outStream", null);
        setField(term896432, term896432.getClass(), "globalRefMap", null);
        setField(term896432, term896432.getClass(), "sanityCheck", null);
        setField(term896432, term896432.getClass(), "currentTracer", null);
        setField(term896432, term896432.getClass(), "currentPassName", null);
        setField(term896432, term896432.getClass(), "recentChange", null);
        setField(term896432, term896432.getClass(), "codeChangeHandlers", null);
        setField(term896432, term896432.getClass(), "stage", null);
        term896436 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term896436;
        callMethod(klass, "getSourceLine", argTypes, term896432, args);
    }

};


