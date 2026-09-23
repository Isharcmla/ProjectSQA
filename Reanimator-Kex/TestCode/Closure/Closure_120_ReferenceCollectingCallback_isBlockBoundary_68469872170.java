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

public class ReferenceCollectingCallback_isBlockBoundary_68469872170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8401;
     Object term8471;
     Object term8775;
     Object term8777;

    public ReferenceCollectingCallback_isBlockBoundary_68469872170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term8471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8471, term8471.getClass(), "type", 101);
        setField(term8471, term8471.getClass(), "first", term8541);
        term8775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8775, term8775.getClass(), "type", 101);
        setField(term8775, term8775.getClass(), "next", null);
        setIntField(term8776, term8776.getClass(), "type", 0);
        setField(term8776, term8776.getClass(), "next", null);
        setField(term8776, term8776.getClass(), "first", null);
        setField(term8776, term8776.getClass(), "last", null);
        setField(term8776, term8776.getClass(), "propListHead", null);
        setIntField(term8776, term8776.getClass(), "sourcePosition", 0);
        setField(term8776, term8776.getClass(), "jsType", null);
        setField(term8776, term8776.getClass(), "parent", null);
        setField(term8775, term8775.getClass(), "first", term8776);
        setField(term8775, term8775.getClass(), "last", null);
        setField(term8775, term8775.getClass(), "propListHead", null);
        setIntField(term8775, term8775.getClass(), "sourcePosition", 0);
        setField(term8775, term8775.getClass(), "jsType", null);
        setField(term8775, term8775.getClass(), "parent", null);
        term8777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8777, term8777.getClass(), "type", 0);
        setField(term8777, term8777.getClass(), "next", null);
        setField(term8777, term8777.getClass(), "first", null);
        setField(term8777, term8777.getClass(), "last", null);
        setField(term8777, term8777.getClass(), "propListHead", null);
        setIntField(term8777, term8777.getClass(), "sourcePosition", 0);
        setField(term8777, term8777.getClass(), "jsType", null);
        setField(term8777, term8777.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term8401;
        args[1] = term8471;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term8401, term8775));
        assertTrue(recursiveEquals(term8471, term8777));
        assertTrue(recursiveEquals(retValue, true));
    }

};


