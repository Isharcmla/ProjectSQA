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

public class TypeInference_traverseGetElem_100203513201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101903;
     Object term101973;

    public TypeInference_traverseGetElem_100203513201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101903 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term101973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102043, term102043.getClass(), "type", 98);
        setField(term102113, term102113.getClass(), "next", term102183);
        setIntField(term102113, term102113.getClass(), "type", 98);
        setField(term102253, term102253.getClass(), "next", term102323);
        setIntField(term102253, term102253.getClass(), "type", 98);
        setField(term102393, term102393.getClass(), "next", term102183);
        setIntField(term102393, term102393.getClass(), "type", 98);
        setField(term102463, term102463.getClass(), "next", term102533);
        setIntField(term102463, term102463.getClass(), "type", 98);
        setField(term102603, term102603.getClass(), "next", term102673);
        setIntField(term102603, term102603.getClass(), "type", 153);
        setField(term102463, term102463.getClass(), "first", term102603);
        setField(term102463, term102463.getClass(), "last", term102743);
        setField(term102393, term102393.getClass(), "first", term102463);
        setField(term102393, term102393.getClass(), "last", term102813);
        setField(term102253, term102253.getClass(), "first", term102393);
        setField(term102253, term102253.getClass(), "last", term102883);
        setField(term102113, term102113.getClass(), "first", term102253);
        setField(term102113, term102113.getClass(), "last", term102953);
        setField(term102043, term102043.getClass(), "first", term102113);
        setField(term102043, term102043.getClass(), "last", term103023);
        setField(term101973, term101973.getClass(), "first", term102043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term101973;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term101903, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


