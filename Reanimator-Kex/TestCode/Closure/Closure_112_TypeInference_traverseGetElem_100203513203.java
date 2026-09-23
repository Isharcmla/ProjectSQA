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

public class TypeInference_traverseGetElem_100203513203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103864;
     Object term103934;

    public TypeInference_traverseGetElem_100203513203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103864 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term103934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104004, term104004.getClass(), "type", 98);
        setField(term104074, term104074.getClass(), "next", term104144);
        setIntField(term104074, term104074.getClass(), "type", 98);
        setField(term104214, term104214.getClass(), "next", term104284);
        setIntField(term104214, term104214.getClass(), "type", 98);
        setField(term104354, term104354.getClass(), "next", term104144);
        setIntField(term104354, term104354.getClass(), "type", 98);
        setField(term104424, term104424.getClass(), "next", term104494);
        setIntField(term104424, term104424.getClass(), "type", 98);
        setField(term104564, term104564.getClass(), "next", term104634);
        setIntField(term104564, term104564.getClass(), "type", 90);
        setField(term104424, term104424.getClass(), "first", term104564);
        setField(term104424, term104424.getClass(), "last", term104704);
        setField(term104354, term104354.getClass(), "first", term104424);
        setField(term104354, term104354.getClass(), "last", term104774);
        setField(term104214, term104214.getClass(), "first", term104354);
        setField(term104214, term104214.getClass(), "last", term104844);
        setField(term104074, term104074.getClass(), "first", term104214);
        setField(term104074, term104074.getClass(), "last", term104914);
        setField(term104004, term104004.getClass(), "first", term104074);
        setField(term104004, term104004.getClass(), "last", term104984);
        setField(term103934, term103934.getClass(), "first", term104004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term103934;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term103864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


