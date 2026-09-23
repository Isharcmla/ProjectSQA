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

public class Node_newString_1355050547223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11722;

    public Node_newString_1355050547223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11722, term11722.getClass(), "str", "PAEBtnZtTD");
        setIntField(term11722, term11722.getClass(), "type", 40);
        setField(term11722, term11722.getClass(), "next", null);
        setField(term11722, term11722.getClass(), "first", null);
        setField(term11722, term11722.getClass(), "last", null);
        setField(term11722, term11722.getClass(), "propListHead", null);
        setIntField(term11722, term11722.getClass(), "sourcePosition", -1);
        setField(term11722, term11722.getClass(), "jsType", null);
        setField(term11722, term11722.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object retValue = callMethod(klass, "newString", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term11722));
    }

};


