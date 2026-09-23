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

public class Compiler_toSource_1654439666242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890229;
     Object term890235;

    public Compiler_toSource_1654439666242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890229 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890229, term890229.getClass(), "options", null);
        setField(term890229, term890229.getClass(), "passes", null);
        setField(term890229, term890229.getClass(), "externs", null);
        setField(term890229, term890229.getClass(), "modules", null);
        setField(term890229, term890229.getClass(), "moduleGraph", null);
        setField(term890229, term890229.getClass(), "inputs", null);
        setField(term890229, term890229.getClass(), "errorManager", null);
        setField(term890229, term890229.getClass(), "warningsGuard", null);
        setField(term890229, term890229.getClass(), "injectedLibraries", null);
        setField(term890229, term890229.getClass(), "externsRoot", null);
        setField(term890229, term890229.getClass(), "jsRoot", null);
        setField(term890229, term890229.getClass(), "externAndJsRoot", null);
        setField(term890229, term890229.getClass(), "inputsById", null);
        setField(term890229, term890229.getClass(), "sourceMap", null);
        setField(term890229, term890229.getClass(), "externExports", null);
        setIntField(term890229, term890229.getClass(), "uniqueNameId", 0);
        setBooleanField(term890229, term890229.getClass(), "useThreads", false);
        setBooleanField(term890229, term890229.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890229, term890229.getClass(), "functionInformationMap", null);
        setField(term890229, term890229.getClass(), "debugLog", null);
        setField(term890229, term890229.getClass(), "defaultCodingConvention", null);
        setField(term890229, term890229.getClass(), "typeRegistry", null);
        setField(term890229, term890229.getClass(), "parserConfig", null);
        setField(term890229, term890229.getClass(), "abstractInterpreter", null);
        setField(term890229, term890229.getClass(), "typeValidator", null);
        setField(term890229, term890229.getClass(), "tracker", null);
        setField(term890229, term890229.getClass(), "oldErrorReporter", null);
        setField(term890229, term890229.getClass(), "defaultErrorReporter", null);
        setField(term890229, term890229.getClass(), "outStream", null);
        setField(term890229, term890229.getClass(), "globalRefMap", null);
        setDoubleField(term890229, term890229.getClass(), "progress", 0.0);
        setField(term890229, term890229.getClass(), "sanityCheck", null);
        setField(term890229, term890229.getClass(), "currentTracer", null);
        setField(term890229, term890229.getClass(), "currentPassName", null);
        setIntField(term890229, term890229.getClass(), "syntheticCodeId", 0);
        setField(term890229, term890229.getClass(), "recentChange", null);
        setField(term890229, term890229.getClass(), "codeChangeHandlers", null);
        setField(term890229, term890229.getClass(), "synthesizedExternsInput", null);
        setField(term890229, term890229.getClass(), "stage", null);
        term890235 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Compiler$CodeBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term890235;
        args[2] = null;
        callMethod(klass, "toSource", argTypes, term890229, args);
    }

};


