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
import java.lang.Object;

public class CoalesceVariableNames_checkRanges_118307546574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29133;
     Object term29185;
     Object term29255;
     Object term29674;
     Object term29675;
     Object term29677;

    public CoalesceVariableNames_checkRanges_118307546574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29133 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term29133, term29133.getClass(), "compiler", null);
        term29185 = new ArrayList();
        term29255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29255, term29255.getClass(), "type", 0);
        setField(term29325, term29325.getClass(), "next", null);
        setIntField(term29325, term29325.getClass(), "type", 0);
        setField(term29325, term29325.getClass(), "parent", term29325);
        setField(term29325, term29325.getClass(), "first", null);
        setField(term29255, term29255.getClass(), "first", term29325);
        term29674 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term29674, term29674.getClass(), "compiler", null);
        setField(term29674, term29674.getClass(), "colorings", null);
        setBooleanField(term29674, term29674.getClass(), "usePseudoNames", false);
        term29675 = new ArrayList();
        term29677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29677, term29677.getClass(), "type", 0);
        setField(term29677, term29677.getClass(), "next", null);
        setIntField(term29678, term29678.getClass(), "type", 0);
        setField(term29678, term29678.getClass(), "next", null);
        setField(term29678, term29678.getClass(), "first", null);
        setField(term29678, term29678.getClass(), "last", null);
        setField(term29678, term29678.getClass(), "propListHead", null);
        setIntField(term29678, term29678.getClass(), "sourcePosition", 0);
        setField(term29678, term29678.getClass(), "jsType", null);
        setField(term29678, term29678.getClass(), "parent", term29678);
        setField(term29677, term29677.getClass(), "first", term29678);
        setField(term29677, term29677.getClass(), "last", null);
        setField(term29677, term29677.getClass(), "propListHead", null);
        setIntField(term29677, term29677.getClass(), "sourcePosition", 0);
        setField(term29677, term29677.getClass(), "jsType", null);
        setField(term29677, term29677.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term29185;
        args[1] = term29255;
        callMethod(klass, "checkRanges", argTypes, term29133, args);
        assertTrue(recursiveEquals(term29133, term29674));
        assertTrue(recursiveEquals(term29185, term29675));
        assertTrue(recursiveEquals(term29255, term29677));
    }

};


