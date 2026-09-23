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

public class Compiler_toSource_1654439666214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977924;
     Object term977928;

    public Compiler_toSource_1654439666214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977924 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977924, term977924.getClass(), "options", null);
        setField(term977924, term977924.getClass(), "passes", null);
        setField(term977924, term977924.getClass(), "externs", null);
        setField(term977924, term977924.getClass(), "modules", null);
        setField(term977924, term977924.getClass(), "moduleGraph", null);
        setField(term977924, term977924.getClass(), "inputs", null);
        setField(term977924, term977924.getClass(), "errorManager", null);
        setField(term977924, term977924.getClass(), "warningsGuard", null);
        setField(term977924, term977924.getClass(), "externsRoot", null);
        setField(term977924, term977924.getClass(), "jsRoot", null);
        setField(term977924, term977924.getClass(), "externAndJsRoot", null);
        setField(term977924, term977924.getClass(), "inputsByName", null);
        setField(term977924, term977924.getClass(), "sourceMap", null);
        setField(term977924, term977924.getClass(), "externExports", null);
        setIntField(term977924, term977924.getClass(), "uniqueNameId", 0);
        setBooleanField(term977924, term977924.getClass(), "useThreads", false);
        setBooleanField(term977924, term977924.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977924, term977924.getClass(), "functionInformationMap", null);
        setField(term977924, term977924.getClass(), "debugLog", null);
        setField(term977924, term977924.getClass(), "defaultCodingConvention", null);
        setField(term977924, term977924.getClass(), "typeRegistry", null);
        setField(term977924, term977924.getClass(), "parserConfig", null);
        setField(term977924, term977924.getClass(), "abstractInterpreter", null);
        setField(term977924, term977924.getClass(), "typeValidator", null);
        setField(term977924, term977924.getClass(), "tracker", null);
        setField(term977924, term977924.getClass(), "oldErrorReporter", null);
        setField(term977924, term977924.getClass(), "defaultErrorReporter", null);
        setField(term977924, term977924.getClass(), "outStream", null);
        setField(term977924, term977924.getClass(), "globalRefMap", null);
        setField(term977924, term977924.getClass(), "sanityCheck", null);
        setField(term977924, term977924.getClass(), "currentTracer", null);
        setField(term977924, term977924.getClass(), "currentPassName", null);
        setField(term977924, term977924.getClass(), "recentChange", null);
        setField(term977924, term977924.getClass(), "codeChangeHandlers", null);
        setField(term977924, term977924.getClass(), "stage", null);
        term977928 = new Integer(0);
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
        args[1] = term977928;
        args[2] = null;
        callMethod(klass, "toSource", argTypes, term977924, args);
    }

};


