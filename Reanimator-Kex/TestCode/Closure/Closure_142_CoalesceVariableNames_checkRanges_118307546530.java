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

public class CoalesceVariableNames_checkRanges_118307546530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7859;
     Object term8031;
     Object term8186;
     Object term8188;

    public CoalesceVariableNames_checkRanges_118307546530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7859 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term7939 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term7859, term7859.getClass(), "compiler", term7939);
        term8031 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term8031, term8031.getClass(), "type", 132);
        term8186 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term8187 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8187, term8187.getClass(), "options", null);
        setField(term8187, term8187.getClass(), "passes", null);
        setField(term8187, term8187.getClass(), "externs", null);
        setField(term8187, term8187.getClass(), "modules", null);
        setField(term8187, term8187.getClass(), "moduleGraph", null);
        setField(term8187, term8187.getClass(), "inputs", null);
        setField(term8187, term8187.getClass(), "errorManager", null);
        setField(term8187, term8187.getClass(), "symbolTable", null);
        setField(term8187, term8187.getClass(), "externsRoot", null);
        setField(term8187, term8187.getClass(), "jsRoot", null);
        setField(term8187, term8187.getClass(), "externAndJsRoot", null);
        setField(term8187, term8187.getClass(), "inputsByName", null);
        setField(term8187, term8187.getClass(), "sourceMap", null);
        setField(term8187, term8187.getClass(), "externExports", null);
        setIntField(term8187, term8187.getClass(), "uniqueNameId", 0);
        setBooleanField(term8187, term8187.getClass(), "normalized", false);
        setBooleanField(term8187, term8187.getClass(), "useThreads", false);
        setField(term8187, term8187.getClass(), "functionInformationMap", null);
        setField(term8187, term8187.getClass(), "debugLog", null);
        setField(term8187, term8187.getClass(), "defaultCodingConvention", null);
        setField(term8187, term8187.getClass(), "typeRegistry", null);
        setField(term8187, term8187.getClass(), "parserConfig", null);
        setField(term8187, term8187.getClass(), "abstractInterpreter", null);
        setField(term8187, term8187.getClass(), "typeValidator", null);
        setField(term8187, term8187.getClass(), "tracker", null);
        setField(term8187, term8187.getClass(), "oldErrorReporter", null);
        setField(term8187, term8187.getClass(), "defaultErrorReporter", null);
        setField(term8187, term8187.getClass(), "outStream", null);
        setField(term8187, term8187.getClass(), "sanityCheck", null);
        setField(term8187, term8187.getClass(), "currentTracer", null);
        setField(term8187, term8187.getClass(), "currentPassName", null);
        setField(term8187, term8187.getClass(), "recentChange", null);
        setField(term8187, term8187.getClass(), "codeChangeHandlers", null);
        setField(term8186, term8186.getClass(), "compiler", term8187);
        setField(term8186, term8186.getClass(), "colorings", null);
        setBooleanField(term8186, term8186.getClass(), "usePseudoNames", false);
        term8188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term8188, term8188.getClass(), "number", 0.0);
        setIntField(term8188, term8188.getClass(), "type", 132);
        setField(term8188, term8188.getClass(), "next", null);
        setField(term8188, term8188.getClass(), "first", null);
        setField(term8188, term8188.getClass(), "last", null);
        setField(term8188, term8188.getClass(), "propListHead", null);
        setIntField(term8188, term8188.getClass(), "sourcePosition", 0);
        setField(term8188, term8188.getClass(), "jsType", null);
        setField(term8188, term8188.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8031;
        callMethod(klass, "checkRanges", argTypes, term7859, args);
        assertTrue(recursiveEquals(term7859, term8186));
        assertTrue(recursiveEquals(term8031, term8188));
    }

};


