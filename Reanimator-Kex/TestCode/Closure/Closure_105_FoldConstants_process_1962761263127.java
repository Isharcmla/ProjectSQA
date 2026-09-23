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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FoldConstants_process_1962761263127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19876;
     Object term20026;
     Object term30434;
     Object term30436;

    public FoldConstants_process_1962761263127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19876 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        Object term19956 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19876, term19876.getClass(), "compiler", term19956);
        term20026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20026, term20026.getClass(), "type", 0);
        setField(term20026, term20026.getClass(), "first", null);
        term30434 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        Object term30435 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30435, term30435.getClass(), "options_", null);
        setField(term30435, term30435.getClass(), "passes", null);
        setField(term30435, term30435.getClass(), "externs_", null);
        setField(term30435, term30435.getClass(), "modules_", null);
        setField(term30435, term30435.getClass(), "moduleGraph_", null);
        setField(term30435, term30435.getClass(), "inputs_", null);
        setField(term30435, term30435.getClass(), "errorManager", null);
        setField(term30435, term30435.getClass(), "symbolTable", null);
        setField(term30435, term30435.getClass(), "externsRoot", null);
        setField(term30435, term30435.getClass(), "jsRoot", null);
        setField(term30435, term30435.getClass(), "externAndJsRoot", null);
        setField(term30435, term30435.getClass(), "inputsByName_", null);
        setField(term30435, term30435.getClass(), "sourceMap_", null);
        setField(term30435, term30435.getClass(), "externExports_", null);
        setIntField(term30435, term30435.getClass(), "uniqueNameId", 0);
        setBooleanField(term30435, term30435.getClass(), "normalized", false);
        setBooleanField(term30435, term30435.getClass(), "useThreads", false);
        setField(term30435, term30435.getClass(), "functionInformationMap_", null);
        setField(term30435, term30435.getClass(), "debugLog_", null);
        setField(term30435, term30435.getClass(), "defaultCodingConvention", null);
        setField(term30435, term30435.getClass(), "typeRegistry", null);
        setField(term30435, term30435.getClass(), "abstractInterpreter", null);
        setField(term30435, term30435.getClass(), "typeValidator", null);
        setField(term30435, term30435.getClass(), "tracker", null);
        setField(term30435, term30435.getClass(), "oldErrorReporter", null);
        setField(term30435, term30435.getClass(), "defaultErrorReporter", null);
        setField(term30435, term30435.getClass(), "sanityCheck", null);
        setField(term30435, term30435.getClass(), "currentTracer", null);
        setField(term30435, term30435.getClass(), "currentPassName", null);
        setField(term30435, term30435.getClass(), "recentChange", null);
        setField(term30435, term30435.getClass(), "codeChangeHandlers", null);
        setField(term30434, term30434.getClass(), "compiler", term30435);
        term30436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30436, term30436.getClass(), "type", 0);
        setField(term30436, term30436.getClass(), "next", null);
        setField(term30436, term30436.getClass(), "first", null);
        setField(term30436, term30436.getClass(), "last", null);
        setField(term30436, term30436.getClass(), "propListHead", null);
        setIntField(term30436, term30436.getClass(), "sourcePosition", 0);
        setField(term30436, term30436.getClass(), "jsType", null);
        setField(term30436, term30436.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20026;
        callMethod(klass, "process", argTypes, term19876, args);
        assertTrue(recursiveEquals(term19876, term30434));
        assertTrue(recursiveEquals(term20026, null));
    }

};


