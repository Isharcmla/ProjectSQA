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
import java.util.ArrayList;

public class CoalesceVariableNames_checkRanges_118307546540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12365;
     Object term12417;
     Object term12503;
     Object term12602;
     Object term12603;
     Object term12605;

    public CoalesceVariableNames_checkRanges_118307546540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12365 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term12365, term12365.getClass(), "compiler", null);
        term12417 = new ArrayList();
        term12503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term12503, term12503.getClass(), "type", 0);
        setField(term12503, term12503.getClass(), "first", null);
        term12602 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term12602, term12602.getClass(), "compiler", null);
        setField(term12602, term12602.getClass(), "colorings", null);
        setBooleanField(term12602, term12602.getClass(), "usePseudoNames", false);
        term12603 = new ArrayList();
        term12605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term12605, term12605.getClass(), "functionName", null);
        setBooleanField(term12605, term12605.getClass(), "itsNeedsActivation", false);
        setIntField(term12605, term12605.getClass(), "itsFunctionType", 0);
        setBooleanField(term12605, term12605.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term12605, term12605.getClass(), "encodedSourceStart", 0);
        setIntField(term12605, term12605.getClass(), "encodedSourceEnd", 0);
        setField(term12605, term12605.getClass(), "sourceName", null);
        setIntField(term12605, term12605.getClass(), "baseLineno", 0);
        setIntField(term12605, term12605.getClass(), "endLineno", 0);
        setField(term12605, term12605.getClass(), "functions", null);
        setField(term12605, term12605.getClass(), "regexps", null);
        setField(term12605, term12605.getClass(), "itsVariables", null);
        setField(term12605, term12605.getClass(), "itsConst", null);
        setField(term12605, term12605.getClass(), "itsVariableNames", null);
        setIntField(term12605, term12605.getClass(), "varStart", 0);
        setField(term12605, term12605.getClass(), "compilerData", null);
        setIntField(term12605, term12605.getClass(), "type", 0);
        setField(term12605, term12605.getClass(), "next", null);
        setField(term12605, term12605.getClass(), "first", null);
        setField(term12605, term12605.getClass(), "last", null);
        setField(term12605, term12605.getClass(), "propListHead", null);
        setIntField(term12605, term12605.getClass(), "sourcePosition", 0);
        setField(term12605, term12605.getClass(), "jsType", null);
        setField(term12605, term12605.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term12417;
        args[1] = term12503;
        callMethod(klass, "checkRanges", argTypes, term12365, args);
        assertTrue(recursiveEquals(term12365, term12602));
        assertTrue(recursiveEquals(term12417, term12603));
        assertTrue(recursiveEquals(term12503, term12605));
    }

};


