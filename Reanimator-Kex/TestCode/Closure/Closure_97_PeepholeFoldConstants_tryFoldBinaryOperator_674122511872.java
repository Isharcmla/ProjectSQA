package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247685;
     Object term247777;
     Object term247997;
     Object term247998;
     Object term247968;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247685 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term247777 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term247869, term247869.getClass(), "next", term247961);
        setIntField(term247869, term247869.getClass(), "type", 39);
        setField(term247777, term247777.getClass(), "first", term247869);
        setIntField(term247777, term247777.getClass(), "type", 22);
        term247997 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term247997, term247997.getClass(), "currentTraversal", null);
        term247998 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247999 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term247998, term247998.getClass(), "str", null);
        setIntField(term247998, term247998.getClass(), "type", 22);
        setField(term247998, term247998.getClass(), "next", null);
        setField(term247999, term247999.getClass(), "str", null);
        setIntField(term247999, term247999.getClass(), "type", 39);
        setField(term248000, term248000.getClass(), "str", null);
        setIntField(term248000, term248000.getClass(), "type", 0);
        setField(term248000, term248000.getClass(), "next", null);
        setField(term248000, term248000.getClass(), "first", null);
        setField(term248000, term248000.getClass(), "last", null);
        setField(term248000, term248000.getClass(), "propListHead", null);
        setIntField(term248000, term248000.getClass(), "sourcePosition", 0);
        setField(term248000, term248000.getClass(), "jsType", null);
        setField(term248000, term248000.getClass(), "parent", null);
        setField(term247999, term247999.getClass(), "next", term248000);
        setField(term247999, term247999.getClass(), "first", null);
        setField(term247999, term247999.getClass(), "last", null);
        setField(term247999, term247999.getClass(), "propListHead", null);
        setIntField(term247999, term247999.getClass(), "sourcePosition", 0);
        setField(term247999, term247999.getClass(), "jsType", null);
        setField(term247999, term247999.getClass(), "parent", null);
        setField(term247998, term247998.getClass(), "first", term247999);
        setField(term247998, term247998.getClass(), "last", null);
        setField(term247998, term247998.getClass(), "propListHead", null);
        setIntField(term247998, term247998.getClass(), "sourcePosition", 0);
        setField(term247998, term247998.getClass(), "jsType", null);
        setField(term247998, term247998.getClass(), "parent", null);
        term247968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term247968, term247968.getClass(), "str", null);
        setIntField(term247968, term247968.getClass(), "type", 22);
        setField(term247968, term247968.getClass(), "next", null);
        setField(term247970, term247970.getClass(), "str", null);
        setIntField(term247970, term247970.getClass(), "type", 39);
        setField(term247972, term247972.getClass(), "str", null);
        setIntField(term247972, term247972.getClass(), "type", 0);
        setField(term247972, term247972.getClass(), "next", null);
        setField(term247972, term247972.getClass(), "first", null);
        setField(term247972, term247972.getClass(), "last", null);
        setField(term247972, term247972.getClass(), "propListHead", null);
        setIntField(term247972, term247972.getClass(), "sourcePosition", 0);
        setField(term247972, term247972.getClass(), "jsType", null);
        setField(term247972, term247972.getClass(), "parent", null);
        setField(term247970, term247970.getClass(), "next", term247972);
        setField(term247970, term247970.getClass(), "first", null);
        setField(term247970, term247970.getClass(), "last", null);
        setField(term247970, term247970.getClass(), "propListHead", null);
        setIntField(term247970, term247970.getClass(), "sourcePosition", 0);
        setField(term247970, term247970.getClass(), "jsType", null);
        setField(term247970, term247970.getClass(), "parent", null);
        setField(term247968, term247968.getClass(), "first", term247970);
        setField(term247968, term247968.getClass(), "last", null);
        setField(term247968, term247968.getClass(), "propListHead", null);
        setIntField(term247968, term247968.getClass(), "sourcePosition", 0);
        setField(term247968, term247968.getClass(), "jsType", null);
        setField(term247968, term247968.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term247777;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term247685, args);
        assertTrue(recursiveEquals(term247685, term247997));
        assertTrue(recursiveEquals(term247777, term247998));
        assertTrue(recursiveEquals(retValue, term247968));
    }

};


