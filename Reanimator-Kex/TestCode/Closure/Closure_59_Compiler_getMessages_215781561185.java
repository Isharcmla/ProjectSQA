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

public class Compiler_getMessages_215781561185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854715;

    public Compiler_getMessages_215781561185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854715 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854715, term854715.getClass(), "options", null);
        setField(term854715, term854715.getClass(), "passes", null);
        setField(term854715, term854715.getClass(), "externs", null);
        setField(term854715, term854715.getClass(), "modules", null);
        setField(term854715, term854715.getClass(), "moduleGraph", null);
        setField(term854715, term854715.getClass(), "inputs", null);
        setField(term854715, term854715.getClass(), "errorManager", null);
        setField(term854715, term854715.getClass(), "warningsGuard", null);
        setField(term854715, term854715.getClass(), "externsRoot", null);
        setField(term854715, term854715.getClass(), "jsRoot", null);
        setField(term854715, term854715.getClass(), "externAndJsRoot", null);
        setField(term854715, term854715.getClass(), "inputsByName", null);
        setField(term854715, term854715.getClass(), "sourceMap", null);
        setField(term854715, term854715.getClass(), "externExports", null);
        setIntField(term854715, term854715.getClass(), "uniqueNameId", 0);
        setBooleanField(term854715, term854715.getClass(), "useThreads", false);
        setBooleanField(term854715, term854715.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854715, term854715.getClass(), "functionInformationMap", null);
        setField(term854715, term854715.getClass(), "debugLog", null);
        setField(term854715, term854715.getClass(), "defaultCodingConvention", null);
        setField(term854715, term854715.getClass(), "typeRegistry", null);
        setField(term854715, term854715.getClass(), "parserConfig", null);
        setField(term854715, term854715.getClass(), "abstractInterpreter", null);
        setField(term854715, term854715.getClass(), "typeValidator", null);
        setField(term854715, term854715.getClass(), "tracker", null);
        setField(term854715, term854715.getClass(), "oldErrorReporter", null);
        setField(term854715, term854715.getClass(), "defaultErrorReporter", null);
        setField(term854715, term854715.getClass(), "outStream", null);
        setField(term854715, term854715.getClass(), "globalRefMap", null);
        setField(term854715, term854715.getClass(), "sanityCheck", null);
        setField(term854715, term854715.getClass(), "currentTracer", null);
        setField(term854715, term854715.getClass(), "currentPassName", null);
        setField(term854715, term854715.getClass(), "recentChange", null);
        setField(term854715, term854715.getClass(), "codeChangeHandlers", null);
        setField(term854715, term854715.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessages", argTypes, term854715, args);
    }

};


