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

public class Compiler_getSourceRegion_1542567742247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978060;
     Object term978064;

    public Compiler_getSourceRegion_1542567742247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978060 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978060, term978060.getClass(), "options", null);
        setField(term978060, term978060.getClass(), "passes", null);
        setField(term978060, term978060.getClass(), "externs", null);
        setField(term978060, term978060.getClass(), "modules", null);
        setField(term978060, term978060.getClass(), "moduleGraph", null);
        setField(term978060, term978060.getClass(), "inputs", null);
        setField(term978060, term978060.getClass(), "errorManager", null);
        setField(term978060, term978060.getClass(), "warningsGuard", null);
        setField(term978060, term978060.getClass(), "externsRoot", null);
        setField(term978060, term978060.getClass(), "jsRoot", null);
        setField(term978060, term978060.getClass(), "externAndJsRoot", null);
        setField(term978060, term978060.getClass(), "inputsByName", null);
        setField(term978060, term978060.getClass(), "sourceMap", null);
        setField(term978060, term978060.getClass(), "externExports", null);
        setIntField(term978060, term978060.getClass(), "uniqueNameId", 0);
        setBooleanField(term978060, term978060.getClass(), "useThreads", false);
        setBooleanField(term978060, term978060.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978060, term978060.getClass(), "functionInformationMap", null);
        setField(term978060, term978060.getClass(), "debugLog", null);
        setField(term978060, term978060.getClass(), "defaultCodingConvention", null);
        setField(term978060, term978060.getClass(), "typeRegistry", null);
        setField(term978060, term978060.getClass(), "parserConfig", null);
        setField(term978060, term978060.getClass(), "abstractInterpreter", null);
        setField(term978060, term978060.getClass(), "typeValidator", null);
        setField(term978060, term978060.getClass(), "tracker", null);
        setField(term978060, term978060.getClass(), "oldErrorReporter", null);
        setField(term978060, term978060.getClass(), "defaultErrorReporter", null);
        setField(term978060, term978060.getClass(), "outStream", null);
        setField(term978060, term978060.getClass(), "globalRefMap", null);
        setField(term978060, term978060.getClass(), "sanityCheck", null);
        setField(term978060, term978060.getClass(), "currentTracer", null);
        setField(term978060, term978060.getClass(), "currentPassName", null);
        setField(term978060, term978060.getClass(), "recentChange", null);
        setField(term978060, term978060.getClass(), "codeChangeHandlers", null);
        setField(term978060, term978060.getClass(), "stage", null);
        term978064 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term978064;
        callMethod(klass, "getSourceRegion", argTypes, term978060, args);
    }

};


