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

public class Node_isNot_897605713530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43254;
     Object term43269;

    public Node_isNot_897605713530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43254, term43254.getClass(), "type", 26);
        term43269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43269, term43269.getClass(), "type", 26);
        setField(term43269, term43269.getClass(), "next", null);
        setField(term43269, term43269.getClass(), "first", null);
        setField(term43269, term43269.getClass(), "last", null);
        setField(term43269, term43269.getClass(), "propListHead", null);
        setIntField(term43269, term43269.getClass(), "sourcePosition", 0);
        setField(term43269, term43269.getClass(), "jsType", null);
        setField(term43269, term43269.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNot", argTypes, term43254, args);
        assertTrue(recursiveEquals(term43254, term43269));
        assertTrue(recursiveEquals(retValue, true));
    }

};


