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

public class Node_srcrefTree_1549632265743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75555;
     Object term75841;

    public Node_srcrefTree_1549632265743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75663 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term75771 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term75663, term75663.getClass(), "propType", -41);
        setField(term75663, term75663.getClass(), "next", term75771);
        setField(term75555, term75555.getClass(), "propListHead", term75663);
        term75841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75949 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term75949, term75949.getClass(), "propType", -41);
        setField(term75949, term75949.getClass(), "next", null);
        setField(term75841, term75841.getClass(), "propListHead", term75949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term75841;
        callMethod(klass, "srcrefTree", argTypes, term75555, args);
    }

};


