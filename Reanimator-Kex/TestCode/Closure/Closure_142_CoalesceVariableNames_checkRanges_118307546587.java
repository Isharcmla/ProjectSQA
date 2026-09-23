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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoalesceVariableNames_checkRanges_118307546587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32986;
     Object term33072;

    public CoalesceVariableNames_checkRanges_118307546587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32986 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term32986, term32986.getClass(), "compiler", null);
        term33072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term33158 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term33244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term33330 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term33416 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term33072, term33072.getClass(), "type", 0);
        setField(term33244, term33244.getClass(), "next", term33330);
        setIntField(term33244, term33244.getClass(), "type", 0);
        setField(term33244, term33244.getClass(), "parent", term33330);
        setField(term33158, term33158.getClass(), "next", term33244);
        setIntField(term33158, term33158.getClass(), "type", 0);
        setIntField(term33416, term33416.getClass(), "type", 0);
        setField(term33158, term33158.getClass(), "parent", term33416);
        setField(term33158, term33158.getClass(), "first", null);
        setField(term33072, term33072.getClass(), "first", term33158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33072;
        try {
            callMethod(klass, "checkRanges", argTypes, term32986, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


