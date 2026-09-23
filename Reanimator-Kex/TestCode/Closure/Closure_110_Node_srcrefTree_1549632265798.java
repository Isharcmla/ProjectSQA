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

public class Node_srcrefTree_1549632265798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89602;
     Object term89780;

    public Node_srcrefTree_1549632265798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89710 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term89710, term89710.getClass(), "propType", 40);
        setField(term89602, term89602.getClass(), "propListHead", term89710);
        term89780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89888 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term89888, term89888.getClass(), "propType", -41);
        setField(term89888, term89888.getClass(), "next", null);
        setField(term89780, term89780.getClass(), "propListHead", term89888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term89780;
        callMethod(klass, "srcrefTree", argTypes, term89602, args);
    }

};


