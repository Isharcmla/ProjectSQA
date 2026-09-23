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

public class ClosureCodingConvention_extractClassNameIfGoog_1998914631409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144921;
     Object term145010;

    public ClosureCodingConvention_extractClassNameIfGoog_1998914631409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144921, term144921.getClass(), "type", 130);
        setField(term144921, term144921.getClass(), "first", term144991);
        term145010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145010, term145010.getClass(), "type", 130);
        setField(term145010, term145010.getClass(), "next", null);
        setIntField(term145011, term145011.getClass(), "type", 0);
        setField(term145011, term145011.getClass(), "next", null);
        setField(term145011, term145011.getClass(), "first", null);
        setField(term145011, term145011.getClass(), "last", null);
        setField(term145011, term145011.getClass(), "propListHead", null);
        setIntField(term145011, term145011.getClass(), "sourcePosition", 0);
        setField(term145011, term145011.getClass(), "jsType", null);
        setField(term145011, term145011.getClass(), "parent", null);
        setField(term145010, term145010.getClass(), "first", term145011);
        setField(term145010, term145010.getClass(), "last", null);
        setField(term145010, term145010.getClass(), "propListHead", null);
        setIntField(term145010, term145010.getClass(), "sourcePosition", 0);
        setField(term145010, term145010.getClass(), "jsType", null);
        setField(term145010, term145010.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term144921;
        args[2] = null;
        Object retValue = callMethod(klass, "extractClassNameIfGoog", argTypes, null, args);
        assertTrue(recursiveEquals(term144921, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


