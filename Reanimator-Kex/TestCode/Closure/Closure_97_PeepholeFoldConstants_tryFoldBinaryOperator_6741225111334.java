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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440381;
     Object term440473;
     Object term440695;
     Object term440696;
     Object term440664;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term440381 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term440473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term440565 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term440657 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term440565, term440565.getClass(), "next", term440657);
        setField(term440473, term440473.getClass(), "first", term440565);
        setIntField(term440473, term440473.getClass(), "type", 33);
        term440695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term440695, term440695.getClass(), "currentTraversal", null);
        term440696 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term440697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term440698 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term440696, term440696.getClass(), "str", null);
        setIntField(term440696, term440696.getClass(), "type", 33);
        setField(term440696, term440696.getClass(), "next", null);
        setField(term440697, term440697.getClass(), "str", null);
        setIntField(term440697, term440697.getClass(), "type", 0);
        setField(term440698, term440698.getClass(), "str", null);
        setIntField(term440698, term440698.getClass(), "type", 0);
        setField(term440698, term440698.getClass(), "next", null);
        setField(term440698, term440698.getClass(), "first", null);
        setField(term440698, term440698.getClass(), "last", null);
        setField(term440698, term440698.getClass(), "propListHead", null);
        setIntField(term440698, term440698.getClass(), "sourcePosition", 0);
        setField(term440698, term440698.getClass(), "jsType", null);
        setField(term440698, term440698.getClass(), "parent", null);
        setField(term440697, term440697.getClass(), "next", term440698);
        setField(term440697, term440697.getClass(), "first", null);
        setField(term440697, term440697.getClass(), "last", null);
        setField(term440697, term440697.getClass(), "propListHead", null);
        setIntField(term440697, term440697.getClass(), "sourcePosition", 0);
        setField(term440697, term440697.getClass(), "jsType", null);
        setField(term440697, term440697.getClass(), "parent", null);
        setField(term440696, term440696.getClass(), "first", term440697);
        setField(term440696, term440696.getClass(), "last", null);
        setField(term440696, term440696.getClass(), "propListHead", null);
        setIntField(term440696, term440696.getClass(), "sourcePosition", 0);
        setField(term440696, term440696.getClass(), "jsType", null);
        setField(term440696, term440696.getClass(), "parent", null);
        term440664 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term440666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term440668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term440664, term440664.getClass(), "str", null);
        setIntField(term440664, term440664.getClass(), "type", 33);
        setField(term440664, term440664.getClass(), "next", null);
        setField(term440666, term440666.getClass(), "str", null);
        setIntField(term440666, term440666.getClass(), "type", 0);
        setField(term440668, term440668.getClass(), "str", null);
        setIntField(term440668, term440668.getClass(), "type", 0);
        setField(term440668, term440668.getClass(), "next", null);
        setField(term440668, term440668.getClass(), "first", null);
        setField(term440668, term440668.getClass(), "last", null);
        setField(term440668, term440668.getClass(), "propListHead", null);
        setIntField(term440668, term440668.getClass(), "sourcePosition", 0);
        setField(term440668, term440668.getClass(), "jsType", null);
        setField(term440668, term440668.getClass(), "parent", null);
        setField(term440666, term440666.getClass(), "next", term440668);
        setField(term440666, term440666.getClass(), "first", null);
        setField(term440666, term440666.getClass(), "last", null);
        setField(term440666, term440666.getClass(), "propListHead", null);
        setIntField(term440666, term440666.getClass(), "sourcePosition", 0);
        setField(term440666, term440666.getClass(), "jsType", null);
        setField(term440666, term440666.getClass(), "parent", null);
        setField(term440664, term440664.getClass(), "first", term440666);
        setField(term440664, term440664.getClass(), "last", null);
        setField(term440664, term440664.getClass(), "propListHead", null);
        setIntField(term440664, term440664.getClass(), "sourcePosition", 0);
        setField(term440664, term440664.getClass(), "jsType", null);
        setField(term440664, term440664.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term440473;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term440381, args);
        assertTrue(recursiveEquals(term440381, term440695));
        assertTrue(recursiveEquals(term440473, term440696));
        assertTrue(recursiveEquals(retValue, term440664));
    }

};


