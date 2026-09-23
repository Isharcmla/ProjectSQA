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

public class Node_removeChild_392226657757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79660;
     Object term79835;

    public Node_removeChild_392226657757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term79835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79835, term79835.getClass(), "next", term79870);
        setField(term79660, term79660.getClass(), "first", term79835);
        setField(term79660, term79660.getClass(), "last", term79835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term79835;
        callMethod(klass, "removeChild", argTypes, term79660, args);
    }

};


