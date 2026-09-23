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

public class Compiler_toSource_1654439666217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854843;
     Object term854847;

    public Compiler_toSource_1654439666217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854843 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854843, term854843.getClass(), "options", null);
        setField(term854843, term854843.getClass(), "passes", null);
        setField(term854843, term854843.getClass(), "externs", null);
        setField(term854843, term854843.getClass(), "modules", null);
        setField(term854843, term854843.getClass(), "moduleGraph", null);
        setField(term854843, term854843.getClass(), "inputs", null);
        setField(term854843, term854843.getClass(), "errorManager", null);
        setField(term854843, term854843.getClass(), "warningsGuard", null);
        setField(term854843, term854843.getClass(), "externsRoot", null);
        setField(term854843, term854843.getClass(), "jsRoot", null);
        setField(term854843, term854843.getClass(), "externAndJsRoot", null);
        setField(term854843, term854843.getClass(), "inputsByName", null);
        setField(term854843, term854843.getClass(), "sourceMap", null);
        setField(term854843, term854843.getClass(), "externExports", null);
        setIntField(term854843, term854843.getClass(), "uniqueNameId", 0);
        setBooleanField(term854843, term854843.getClass(), "useThreads", false);
        setBooleanField(term854843, term854843.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854843, term854843.getClass(), "functionInformationMap", null);
        setField(term854843, term854843.getClass(), "debugLog", null);
        setField(term854843, term854843.getClass(), "defaultCodingConvention", null);
        setField(term854843, term854843.getClass(), "typeRegistry", null);
        setField(term854843, term854843.getClass(), "parserConfig", null);
        setField(term854843, term854843.getClass(), "abstractInterpreter", null);
        setField(term854843, term854843.getClass(), "typeValidator", null);
        setField(term854843, term854843.getClass(), "tracker", null);
        setField(term854843, term854843.getClass(), "oldErrorReporter", null);
        setField(term854843, term854843.getClass(), "defaultErrorReporter", null);
        setField(term854843, term854843.getClass(), "outStream", null);
        setField(term854843, term854843.getClass(), "globalRefMap", null);
        setField(term854843, term854843.getClass(), "sanityCheck", null);
        setField(term854843, term854843.getClass(), "currentTracer", null);
        setField(term854843, term854843.getClass(), "currentPassName", null);
        setField(term854843, term854843.getClass(), "recentChange", null);
        setField(term854843, term854843.getClass(), "codeChangeHandlers", null);
        setField(term854843, term854843.getClass(), "stage", null);
        term854847 = new Integer(0);
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
        args[1] = term854847;
        args[2] = null;
        callMethod(klass, "toSource", argTypes, term854843, args);
    }

};


