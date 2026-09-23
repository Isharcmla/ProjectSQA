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

public class Compiler_stripCode_1065820132177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977776;

    public Compiler_stripCode_1065820132177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977776 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977776, term977776.getClass(), "options", null);
        setField(term977776, term977776.getClass(), "passes", null);
        setField(term977776, term977776.getClass(), "externs", null);
        setField(term977776, term977776.getClass(), "modules", null);
        setField(term977776, term977776.getClass(), "moduleGraph", null);
        setField(term977776, term977776.getClass(), "inputs", null);
        setField(term977776, term977776.getClass(), "errorManager", null);
        setField(term977776, term977776.getClass(), "warningsGuard", null);
        setField(term977776, term977776.getClass(), "externsRoot", null);
        setField(term977776, term977776.getClass(), "jsRoot", null);
        setField(term977776, term977776.getClass(), "externAndJsRoot", null);
        setField(term977776, term977776.getClass(), "inputsByName", null);
        setField(term977776, term977776.getClass(), "sourceMap", null);
        setField(term977776, term977776.getClass(), "externExports", null);
        setIntField(term977776, term977776.getClass(), "uniqueNameId", 0);
        setBooleanField(term977776, term977776.getClass(), "useThreads", false);
        setBooleanField(term977776, term977776.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977776, term977776.getClass(), "functionInformationMap", null);
        setField(term977776, term977776.getClass(), "debugLog", null);
        setField(term977776, term977776.getClass(), "defaultCodingConvention", null);
        setField(term977776, term977776.getClass(), "typeRegistry", null);
        setField(term977776, term977776.getClass(), "parserConfig", null);
        setField(term977776, term977776.getClass(), "abstractInterpreter", null);
        setField(term977776, term977776.getClass(), "typeValidator", null);
        setField(term977776, term977776.getClass(), "tracker", null);
        setField(term977776, term977776.getClass(), "oldErrorReporter", null);
        setField(term977776, term977776.getClass(), "defaultErrorReporter", null);
        setField(term977776, term977776.getClass(), "outStream", null);
        setField(term977776, term977776.getClass(), "globalRefMap", null);
        setField(term977776, term977776.getClass(), "sanityCheck", null);
        setField(term977776, term977776.getClass(), "currentTracer", null);
        setField(term977776, term977776.getClass(), "currentPassName", null);
        setField(term977776, term977776.getClass(), "recentChange", null);
        setField(term977776, term977776.getClass(), "codeChangeHandlers", null);
        setField(term977776, term977776.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("java.util.Set");
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "stripCode", argTypes, term977776, args);
    }

};


