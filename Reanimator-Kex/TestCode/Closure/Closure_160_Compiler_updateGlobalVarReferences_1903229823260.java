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

public class Compiler_updateGlobalVarReferences_1903229823260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896510;

    public Compiler_updateGlobalVarReferences_1903229823260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896510 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896510, term896510.getClass(), "options", null);
        setField(term896510, term896510.getClass(), "passes", null);
        setField(term896510, term896510.getClass(), "externs", null);
        setField(term896510, term896510.getClass(), "modules", null);
        setField(term896510, term896510.getClass(), "moduleGraph", null);
        setField(term896510, term896510.getClass(), "inputs", null);
        setField(term896510, term896510.getClass(), "errorManager", null);
        setField(term896510, term896510.getClass(), "warningsGuard", null);
        setField(term896510, term896510.getClass(), "externsRoot", null);
        setField(term896510, term896510.getClass(), "jsRoot", null);
        setField(term896510, term896510.getClass(), "externAndJsRoot", null);
        setField(term896510, term896510.getClass(), "inputsByName", null);
        setField(term896510, term896510.getClass(), "sourceMap", null);
        setField(term896510, term896510.getClass(), "externExports", null);
        setIntField(term896510, term896510.getClass(), "uniqueNameId", 0);
        setBooleanField(term896510, term896510.getClass(), "useThreads", false);
        setBooleanField(term896510, term896510.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896510, term896510.getClass(), "functionInformationMap", null);
        setField(term896510, term896510.getClass(), "debugLog", null);
        setField(term896510, term896510.getClass(), "defaultCodingConvention", null);
        setField(term896510, term896510.getClass(), "typeRegistry", null);
        setField(term896510, term896510.getClass(), "parserConfig", null);
        setField(term896510, term896510.getClass(), "abstractInterpreter", null);
        setField(term896510, term896510.getClass(), "typeValidator", null);
        setField(term896510, term896510.getClass(), "tracker", null);
        setField(term896510, term896510.getClass(), "oldErrorReporter", null);
        setField(term896510, term896510.getClass(), "defaultErrorReporter", null);
        setField(term896510, term896510.getClass(), "outStream", null);
        setField(term896510, term896510.getClass(), "globalRefMap", null);
        setField(term896510, term896510.getClass(), "sanityCheck", null);
        setField(term896510, term896510.getClass(), "currentTracer", null);
        setField(term896510, term896510.getClass(), "currentPassName", null);
        setField(term896510, term896510.getClass(), "recentChange", null);
        setField(term896510, term896510.getClass(), "codeChangeHandlers", null);
        setField(term896510, term896510.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "updateGlobalVarReferences", argTypes, term896510, args);
    }

};


