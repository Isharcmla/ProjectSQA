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

public class Compiler_startPass_306975815175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896162;

    public Compiler_startPass_306975815175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896162 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896162, term896162.getClass(), "options", null);
        setField(term896162, term896162.getClass(), "passes", null);
        setField(term896162, term896162.getClass(), "externs", null);
        setField(term896162, term896162.getClass(), "modules", null);
        setField(term896162, term896162.getClass(), "moduleGraph", null);
        setField(term896162, term896162.getClass(), "inputs", null);
        setField(term896162, term896162.getClass(), "errorManager", null);
        setField(term896162, term896162.getClass(), "warningsGuard", null);
        setField(term896162, term896162.getClass(), "externsRoot", null);
        setField(term896162, term896162.getClass(), "jsRoot", null);
        setField(term896162, term896162.getClass(), "externAndJsRoot", null);
        setField(term896162, term896162.getClass(), "inputsByName", null);
        setField(term896162, term896162.getClass(), "sourceMap", null);
        setField(term896162, term896162.getClass(), "externExports", null);
        setIntField(term896162, term896162.getClass(), "uniqueNameId", 0);
        setBooleanField(term896162, term896162.getClass(), "useThreads", false);
        setBooleanField(term896162, term896162.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896162, term896162.getClass(), "functionInformationMap", null);
        setField(term896162, term896162.getClass(), "debugLog", null);
        setField(term896162, term896162.getClass(), "defaultCodingConvention", null);
        setField(term896162, term896162.getClass(), "typeRegistry", null);
        setField(term896162, term896162.getClass(), "parserConfig", null);
        setField(term896162, term896162.getClass(), "abstractInterpreter", null);
        setField(term896162, term896162.getClass(), "typeValidator", null);
        setField(term896162, term896162.getClass(), "tracker", null);
        setField(term896162, term896162.getClass(), "oldErrorReporter", null);
        setField(term896162, term896162.getClass(), "defaultErrorReporter", null);
        setField(term896162, term896162.getClass(), "outStream", null);
        setField(term896162, term896162.getClass(), "globalRefMap", null);
        setField(term896162, term896162.getClass(), "sanityCheck", null);
        setField(term896162, term896162.getClass(), "currentTracer", null);
        setField(term896162, term896162.getClass(), "currentPassName", null);
        setField(term896162, term896162.getClass(), "recentChange", null);
        setField(term896162, term896162.getClass(), "codeChangeHandlers", null);
        setField(term896162, term896162.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "startPass", argTypes, term896162, args);
    }

};


