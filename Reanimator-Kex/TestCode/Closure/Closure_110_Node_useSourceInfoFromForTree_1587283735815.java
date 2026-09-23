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

public class Node_useSourceInfoFromForTree_1587283735815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93011;
     Object term93259;

    public Node_useSourceInfoFromForTree_1587283735815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93189 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term93011, term93011.getClass(), "propListHead", null);
        setIntField(term93011, term93011.getClass(), "sourcePosition", 0);
        setField(term93081, term93081.getClass(), "propListHead", term93189);
        setField(term93011, term93011.getClass(), "first", term93081);
        term93259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93259, term93259.getClass(), "propListHead", null);
        setIntField(term93259, term93259.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93259;
        callMethod(klass, "useSourceInfoFromForTree", argTypes, term93011, args);
    }

};


