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

public class Node_copyInformationFromForTree_136952912609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53090;
     Object term53182;
     Object term53432;
     Object term53433;
     Object term53408;

    public Node_copyInformationFromForTree_136952912609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53090 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term53090, term53090.getClass(), "propListHead", null);
        term53182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term53432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term53432, term53432.getClass(), "str", null);
        setIntField(term53432, term53432.getClass(), "type", 0);
        setField(term53432, term53432.getClass(), "next", null);
        setField(term53432, term53432.getClass(), "first", null);
        setField(term53432, term53432.getClass(), "last", null);
        setField(term53432, term53432.getClass(), "propListHead", null);
        setIntField(term53432, term53432.getClass(), "sourcePosition", 0);
        setField(term53432, term53432.getClass(), "jsType", null);
        setField(term53432, term53432.getClass(), "parent", null);
        term53433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term53433, term53433.getClass(), "str", null);
        setIntField(term53433, term53433.getClass(), "type", 0);
        setField(term53433, term53433.getClass(), "next", null);
        setField(term53433, term53433.getClass(), "first", null);
        setField(term53433, term53433.getClass(), "last", null);
        setField(term53433, term53433.getClass(), "propListHead", null);
        setIntField(term53433, term53433.getClass(), "sourcePosition", 0);
        setField(term53433, term53433.getClass(), "jsType", null);
        setField(term53433, term53433.getClass(), "parent", null);
        term53408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term53408, term53408.getClass(), "str", null);
        setIntField(term53408, term53408.getClass(), "type", 0);
        setField(term53408, term53408.getClass(), "next", null);
        setField(term53408, term53408.getClass(), "first", null);
        setField(term53408, term53408.getClass(), "last", null);
        setField(term53408, term53408.getClass(), "propListHead", null);
        setIntField(term53408, term53408.getClass(), "sourcePosition", 0);
        setField(term53408, term53408.getClass(), "jsType", null);
        setField(term53408, term53408.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53182;
        Object retValue = callMethod(klass, "copyInformationFromForTree", argTypes, term53090, args);
        assertTrue(recursiveEquals(term53090, term53432));
        assertTrue(recursiveEquals(term53182, term53433));
        assertTrue(recursiveEquals(retValue, term53408));
    }

};


