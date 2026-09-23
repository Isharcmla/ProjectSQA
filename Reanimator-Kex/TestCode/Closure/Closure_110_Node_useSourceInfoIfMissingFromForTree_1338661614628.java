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

public class Node_useSourceInfoIfMissingFromForTree_1338661614628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55691;
     Object term55875;

    public Node_useSourceInfoIfMissingFromForTree_1338661614628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55691 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term55691, term55691.getClass(), "propListHead", null);
        setIntField(term55691, term55691.getClass(), "sourcePosition", 0);
        setField(term55783, term55783.getClass(), "propListHead", null);
        setIntField(term55783, term55783.getClass(), "sourcePosition", 0);
        setField(term55783, term55783.getClass(), "first", term55783);
        setField(term55691, term55691.getClass(), "first", term55783);
        term55875 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term55875, term55875.getClass(), "propListHead", null);
        setIntField(term55875, term55875.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term55875;
        callMethod(klass, "useSourceInfoIfMissingFromForTree", argTypes, term55691, args);
    }

};


