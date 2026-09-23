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
import java.lang.Object;

public class Node_useSourceInfoFromForTree_1587283735754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78465;
     Object term78955;

    public Node_useSourceInfoFromForTree_1587283735754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78783 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term78885 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term78465, term78465.getClass(), "propListHead", null);
        setIntField(term78465, term78465.getClass(), "sourcePosition", 0);
        setField(term78535, term78535.getClass(), "propListHead", null);
        setIntField(term78535, term78535.getClass(), "sourcePosition", 0);
        setField(term78605, term78605.getClass(), "propListHead", null);
        setIntField(term78605, term78605.getClass(), "sourcePosition", 0);
        setField(term78605, term78605.getClass(), "first", null);
        setField(term78605, term78605.getClass(), "next", null);
        setField(term78535, term78535.getClass(), "first", term78605);
        setIntField(term78783, term78783.getClass(), "propType", -41);
        setField(term78783, term78783.getClass(), "next", term78885);
        setField(term78675, term78675.getClass(), "propListHead", term78783);
        setField(term78535, term78535.getClass(), "next", term78675);
        setField(term78465, term78465.getClass(), "first", term78535);
        term78955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78955, term78955.getClass(), "propListHead", null);
        setIntField(term78955, term78955.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term78955;
        callMethod(klass, "useSourceInfoFromForTree", argTypes, term78465, args);
    }

};


