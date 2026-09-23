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
import java.lang.Object;

public class TypeInference_traverseReturn_94528842339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1202523;
     Object term1202593;

    public TypeInference_traverseReturn_94528842339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1202523 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1202593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1202663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1202733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1202803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1202873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1202943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1202663, term1202663.getClass(), "type", 9);
        setIntField(term1202733, term1202733.getClass(), "type", 9);
        setIntField(term1202803, term1202803.getClass(), "type", 9);
        setIntField(term1202873, term1202873.getClass(), "type", 9);
        setIntField(term1202943, term1202943.getClass(), "type", 9);
        setIntField(term1203013, term1203013.getClass(), "type", 9);
        setIntField(term1203083, term1203083.getClass(), "type", 9);
        setIntField(term1203153, term1203153.getClass(), "type", 121);
        setField(term1203083, term1203083.getClass(), "first", term1203153);
        setField(term1203013, term1203013.getClass(), "first", term1203083);
        setField(term1202943, term1202943.getClass(), "first", term1203013);
        setField(term1202873, term1202873.getClass(), "first", term1202943);
        setField(term1202803, term1202803.getClass(), "first", term1202873);
        setField(term1202733, term1202733.getClass(), "first", term1202803);
        setField(term1202663, term1202663.getClass(), "first", term1202733);
        setField(term1202593, term1202593.getClass(), "first", term1202663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1202593;
        args[1] = null;
        callMethod(klass, "traverseReturn", argTypes, term1202523, args);
    }

};


