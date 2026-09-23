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

public class Node_getChildBefore_1035714831699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66618;
     Object term66863;

    public Node_getChildBefore_1035714831699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term66863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66758, term66758.getClass(), "next", term66863);
        setField(term66688, term66688.getClass(), "next", term66758);
        setField(term66618, term66618.getClass(), "first", term66688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term66863;
        callMethod(klass, "getChildBefore", argTypes, term66618, args);
    }

};


