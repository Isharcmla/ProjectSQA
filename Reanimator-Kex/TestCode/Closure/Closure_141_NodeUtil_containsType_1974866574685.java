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
import java.lang.Object;

public class NodeUtil_containsType_1974866574685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67286;

    public NodeUtil_containsType_1974866574685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67286, term67286.getClass(), "type", 524288);
        setIntField(term67356, term67356.getClass(), "type", 0);
        setField(term67356, term67356.getClass(), "first", null);
        setField(term67356, term67356.getClass(), "next", term67426);
        setField(term67286, term67286.getClass(), "first", term67356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term67286;
        args[1] = 512;
        callMethod(klass, "containsType", argTypes, null, args);
    }

};


