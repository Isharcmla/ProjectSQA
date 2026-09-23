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

public class Node_setDirectives_2093488318844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57087;
     Object term97068;

    public Node_setDirectives_2093488318844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term97068 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term97068, term97068.getClass(), "number", 0.0);
        setIntField(term97068, term97068.getClass(), "type", 0);
        setField(term97068, term97068.getClass(), "next", null);
        setField(term97068, term97068.getClass(), "first", null);
        setField(term97068, term97068.getClass(), "last", null);
        setField(term97068, term97068.getClass(), "propListHead", null);
        setIntField(term97068, term97068.getClass(), "sourcePosition", 0);
        setField(term97068, term97068.getClass(), "jsType", null);
        setField(term97068, term97068.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDirectives", argTypes, term57087, args);
        assertTrue(recursiveEquals(term57087, term97068));
    }

};


