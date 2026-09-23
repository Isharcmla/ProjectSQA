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

public class Compiler_toSource_1654439666210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896302;
     Object term896306;

    public Compiler_toSource_1654439666210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896302 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896302, term896302.getClass(), "options", null);
        setField(term896302, term896302.getClass(), "passes", null);
        setField(term896302, term896302.getClass(), "externs", null);
        setField(term896302, term896302.getClass(), "modules", null);
        setField(term896302, term896302.getClass(), "moduleGraph", null);
        setField(term896302, term896302.getClass(), "inputs", null);
        setField(term896302, term896302.getClass(), "errorManager", null);
        setField(term896302, term896302.getClass(), "warningsGuard", null);
        setField(term896302, term896302.getClass(), "externsRoot", null);
        setField(term896302, term896302.getClass(), "jsRoot", null);
        setField(term896302, term896302.getClass(), "externAndJsRoot", null);
        setField(term896302, term896302.getClass(), "inputsByName", null);
        setField(term896302, term896302.getClass(), "sourceMap", null);
        setField(term896302, term896302.getClass(), "externExports", null);
        setIntField(term896302, term896302.getClass(), "uniqueNameId", 0);
        setBooleanField(term896302, term896302.getClass(), "useThreads", false);
        setBooleanField(term896302, term896302.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896302, term896302.getClass(), "functionInformationMap", null);
        setField(term896302, term896302.getClass(), "debugLog", null);
        setField(term896302, term896302.getClass(), "defaultCodingConvention", null);
        setField(term896302, term896302.getClass(), "typeRegistry", null);
        setField(term896302, term896302.getClass(), "parserConfig", null);
        setField(term896302, term896302.getClass(), "abstractInterpreter", null);
        setField(term896302, term896302.getClass(), "typeValidator", null);
        setField(term896302, term896302.getClass(), "tracker", null);
        setField(term896302, term896302.getClass(), "oldErrorReporter", null);
        setField(term896302, term896302.getClass(), "defaultErrorReporter", null);
        setField(term896302, term896302.getClass(), "outStream", null);
        setField(term896302, term896302.getClass(), "globalRefMap", null);
        setField(term896302, term896302.getClass(), "sanityCheck", null);
        setField(term896302, term896302.getClass(), "currentTracer", null);
        setField(term896302, term896302.getClass(), "currentPassName", null);
        setField(term896302, term896302.getClass(), "recentChange", null);
        setField(term896302, term896302.getClass(), "codeChangeHandlers", null);
        setField(term896302, term896302.getClass(), "stage", null);
        term896306 = new Integer(0);
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
        args[1] = term896306;
        args[2] = null;
        callMethod(klass, "toSource", argTypes, term896302, args);
    }

};


