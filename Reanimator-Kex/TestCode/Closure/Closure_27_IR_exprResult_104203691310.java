package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_exprResult_104203691310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41506;
     Object term41923;
     Object term41847;

    public IR_exprResult_104203691310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41506, term41506.getClass(), "type", 13);
        term41923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41923, term41923.getClass(), "type", 13);
        setField(term41923, term41923.getClass(), "next", null);
        setField(term41923, term41923.getClass(), "first", null);
        setField(term41923, term41923.getClass(), "last", null);
        setField(term41923, term41923.getClass(), "propListHead", null);
        setIntField(term41923, term41923.getClass(), "sourcePosition", 0);
        setField(term41923, term41923.getClass(), "jsType", null);
        setIntField(term41924, term41924.getClass(), "type", 130);
        setField(term41924, term41924.getClass(), "next", null);
        setField(term41924, term41924.getClass(), "first", term41923);
        setField(term41924, term41924.getClass(), "last", term41923);
        setField(term41924, term41924.getClass(), "propListHead", null);
        setIntField(term41924, term41924.getClass(), "sourcePosition", -1);
        setField(term41924, term41924.getClass(), "jsType", null);
        setField(term41924, term41924.getClass(), "parent", null);
        setField(term41923, term41923.getClass(), "parent", term41924);
        term41847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41847, term41847.getClass(), "type", 130);
        setField(term41847, term41847.getClass(), "next", null);
        setIntField(term41844, term41844.getClass(), "type", 13);
        setField(term41844, term41844.getClass(), "next", null);
        setField(term41844, term41844.getClass(), "first", null);
        setField(term41844, term41844.getClass(), "last", null);
        setField(term41844, term41844.getClass(), "propListHead", null);
        setIntField(term41844, term41844.getClass(), "sourcePosition", 0);
        setField(term41844, term41844.getClass(), "jsType", null);
        setField(term41844, term41844.getClass(), "parent", term41847);
        setField(term41847, term41847.getClass(), "first", term41844);
        setField(term41847, term41847.getClass(), "last", term41844);
        setField(term41847, term41847.getClass(), "propListHead", null);
        setIntField(term41847, term41847.getClass(), "sourcePosition", -1);
        setField(term41847, term41847.getClass(), "jsType", null);
        setField(term41847, term41847.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41506;
        Object retValue = callMethod(klass, "exprResult", argTypes, null, args);
        assertTrue(recursiveEquals(term41506, term41923));
        assertTrue(recursiveEquals(retValue, term41847));
    }

};


