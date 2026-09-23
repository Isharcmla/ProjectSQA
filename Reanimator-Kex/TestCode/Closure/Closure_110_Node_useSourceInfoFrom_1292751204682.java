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

public class Node_useSourceInfoFrom_1292751204682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63404;
     Object term63576;

    public Node_useSourceInfoFrom_1292751204682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63506 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term63404, term63404.getClass(), "propListHead", term63506);
        term63576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63576, term63576.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term63576;
        callMethod(klass, "useSourceInfoFrom", argTypes, term63404, args);
    }

};


