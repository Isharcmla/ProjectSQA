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
import static com.google.javascript.rhino.EqualityUtils.*;

public class Node_isArrayLit_227871728604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52681;
     Object term52700;

    public Node_isArrayLit_227871728604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52681, term52681.getClass(), "type", 63);
        term52700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52700, term52700.getClass(), "type", 63);
        setField(term52700, term52700.getClass(), "next", null);
        setField(term52700, term52700.getClass(), "first", null);
        setField(term52700, term52700.getClass(), "last", null);
        setField(term52700, term52700.getClass(), "propListHead", null);
        setIntField(term52700, term52700.getClass(), "sourcePosition", 0);
        setField(term52700, term52700.getClass(), "jsType", null);
        setField(term52700, term52700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isArrayLit", argTypes, term52681, args);
        assertTrue(recursiveEquals(term52681, term52700));
        assertTrue(recursiveEquals(retValue, true));
    }

};


