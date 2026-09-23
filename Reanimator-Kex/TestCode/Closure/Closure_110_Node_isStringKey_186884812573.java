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

public class Node_isStringKey_186884812573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48553;
     Object term48872;

    public Node_isStringKey_186884812573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48553, term48553.getClass(), "type", 154);
        term48872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48872, term48872.getClass(), "type", 154);
        setField(term48872, term48872.getClass(), "next", null);
        setField(term48872, term48872.getClass(), "first", null);
        setField(term48872, term48872.getClass(), "last", null);
        setField(term48872, term48872.getClass(), "propListHead", null);
        setIntField(term48872, term48872.getClass(), "sourcePosition", 0);
        setField(term48872, term48872.getClass(), "jsType", null);
        setField(term48872, term48872.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isStringKey", argTypes, term48553, args);
        assertTrue(recursiveEquals(term48553, term48872));
        assertTrue(recursiveEquals(retValue, true));
    }

};


