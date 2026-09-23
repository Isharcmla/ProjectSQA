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

public class Node_useSourceInfoFrom_1292751204841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56594;
     Object term56686;
     Object term96661;
     Object term96662;
     Object term96649;

    public Node_useSourceInfoFrom_1292751204841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term56686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term96661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term96661, term96661.getClass(), "number", 0.0);
        setIntField(term96661, term96661.getClass(), "type", 0);
        setField(term96661, term96661.getClass(), "next", null);
        setField(term96661, term96661.getClass(), "first", null);
        setField(term96661, term96661.getClass(), "last", null);
        setField(term96661, term96661.getClass(), "propListHead", null);
        setIntField(term96661, term96661.getClass(), "sourcePosition", 0);
        setField(term96661, term96661.getClass(), "jsType", null);
        setField(term96661, term96661.getClass(), "parent", null);
        term96662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term96662, term96662.getClass(), "number", 0.0);
        setIntField(term96662, term96662.getClass(), "type", 0);
        setField(term96662, term96662.getClass(), "next", null);
        setField(term96662, term96662.getClass(), "first", null);
        setField(term96662, term96662.getClass(), "last", null);
        setField(term96662, term96662.getClass(), "propListHead", null);
        setIntField(term96662, term96662.getClass(), "sourcePosition", 0);
        setField(term96662, term96662.getClass(), "jsType", null);
        setField(term96662, term96662.getClass(), "parent", null);
        term96649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term96649, term96649.getClass(), "number", 0.0);
        setIntField(term96649, term96649.getClass(), "type", 0);
        setField(term96649, term96649.getClass(), "next", null);
        setField(term96649, term96649.getClass(), "first", null);
        setField(term96649, term96649.getClass(), "last", null);
        setField(term96649, term96649.getClass(), "propListHead", null);
        setIntField(term96649, term96649.getClass(), "sourcePosition", 0);
        setField(term96649, term96649.getClass(), "jsType", null);
        setField(term96649, term96649.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56686;
        Object retValue = callMethod(klass, "useSourceInfoFrom", argTypes, term56594, args);
        assertTrue(recursiveEquals(term56594, term96661));
        assertTrue(recursiveEquals(term56686, term96662));
        assertTrue(recursiveEquals(retValue, term96649));
    }

};


