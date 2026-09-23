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

public class Compiler_setPassConfig_624963202170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854655;

    public Compiler_setPassConfig_624963202170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854655 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854655, term854655.getClass(), "options", null);
        setField(term854655, term854655.getClass(), "passes", null);
        setField(term854655, term854655.getClass(), "externs", null);
        setField(term854655, term854655.getClass(), "modules", null);
        setField(term854655, term854655.getClass(), "moduleGraph", null);
        setField(term854655, term854655.getClass(), "inputs", null);
        setField(term854655, term854655.getClass(), "errorManager", null);
        setField(term854655, term854655.getClass(), "warningsGuard", null);
        setField(term854655, term854655.getClass(), "externsRoot", null);
        setField(term854655, term854655.getClass(), "jsRoot", null);
        setField(term854655, term854655.getClass(), "externAndJsRoot", null);
        setField(term854655, term854655.getClass(), "inputsByName", null);
        setField(term854655, term854655.getClass(), "sourceMap", null);
        setField(term854655, term854655.getClass(), "externExports", null);
        setIntField(term854655, term854655.getClass(), "uniqueNameId", 0);
        setBooleanField(term854655, term854655.getClass(), "useThreads", false);
        setBooleanField(term854655, term854655.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854655, term854655.getClass(), "functionInformationMap", null);
        setField(term854655, term854655.getClass(), "debugLog", null);
        setField(term854655, term854655.getClass(), "defaultCodingConvention", null);
        setField(term854655, term854655.getClass(), "typeRegistry", null);
        setField(term854655, term854655.getClass(), "parserConfig", null);
        setField(term854655, term854655.getClass(), "abstractInterpreter", null);
        setField(term854655, term854655.getClass(), "typeValidator", null);
        setField(term854655, term854655.getClass(), "tracker", null);
        setField(term854655, term854655.getClass(), "oldErrorReporter", null);
        setField(term854655, term854655.getClass(), "defaultErrorReporter", null);
        setField(term854655, term854655.getClass(), "outStream", null);
        setField(term854655, term854655.getClass(), "globalRefMap", null);
        setField(term854655, term854655.getClass(), "sanityCheck", null);
        setField(term854655, term854655.getClass(), "currentTracer", null);
        setField(term854655, term854655.getClass(), "currentPassName", null);
        setField(term854655, term854655.getClass(), "recentChange", null);
        setField(term854655, term854655.getClass(), "codeChangeHandlers", null);
        setField(term854655, term854655.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.PassConfig");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPassConfig", argTypes, term854655, args);
    }

};


