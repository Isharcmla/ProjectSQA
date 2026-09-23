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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279965;
     Object term280057;
     Object term303718;
     Object term303719;
     Object term303661;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279965 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term280057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term280149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term280241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term280149, term280149.getClass(), "next", term280241);
        setIntField(term280149, term280149.getClass(), "type", 0);
        setField(term280057, term280057.getClass(), "first", term280149);
        setIntField(term280057, term280057.getClass(), "type", 101);
        setField(term280057, term280057.getClass(), "parent", null);
        term303718 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303718, term303718.getClass(), "currentTraversal", null);
        term303719 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term303719, term303719.getClass(), "number", 0.0);
        setIntField(term303719, term303719.getClass(), "type", 101);
        setField(term303719, term303719.getClass(), "next", null);
        setDoubleField(term303720, term303720.getClass(), "number", 0.0);
        setIntField(term303720, term303720.getClass(), "type", 0);
        setField(term303721, term303721.getClass(), "str", null);
        setIntField(term303721, term303721.getClass(), "type", 0);
        setField(term303721, term303721.getClass(), "next", null);
        setField(term303721, term303721.getClass(), "first", null);
        setField(term303721, term303721.getClass(), "last", null);
        setField(term303721, term303721.getClass(), "propListHead", null);
        setIntField(term303721, term303721.getClass(), "sourcePosition", 0);
        setField(term303721, term303721.getClass(), "jsType", null);
        setField(term303721, term303721.getClass(), "parent", null);
        setField(term303720, term303720.getClass(), "next", term303721);
        setField(term303720, term303720.getClass(), "first", null);
        setField(term303720, term303720.getClass(), "last", null);
        setField(term303720, term303720.getClass(), "propListHead", null);
        setIntField(term303720, term303720.getClass(), "sourcePosition", 0);
        setField(term303720, term303720.getClass(), "jsType", null);
        setField(term303720, term303720.getClass(), "parent", null);
        setField(term303719, term303719.getClass(), "first", term303720);
        setField(term303719, term303719.getClass(), "last", null);
        setField(term303719, term303719.getClass(), "propListHead", null);
        setIntField(term303719, term303719.getClass(), "sourcePosition", 0);
        setField(term303719, term303719.getClass(), "jsType", null);
        setField(term303719, term303719.getClass(), "parent", null);
        term303661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303664 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term303661, term303661.getClass(), "number", 0.0);
        setIntField(term303661, term303661.getClass(), "type", 101);
        setField(term303661, term303661.getClass(), "next", null);
        setDoubleField(term303664, term303664.getClass(), "number", 0.0);
        setIntField(term303664, term303664.getClass(), "type", 0);
        setField(term303667, term303667.getClass(), "str", null);
        setIntField(term303667, term303667.getClass(), "type", 0);
        setField(term303667, term303667.getClass(), "next", null);
        setField(term303667, term303667.getClass(), "first", null);
        setField(term303667, term303667.getClass(), "last", null);
        setField(term303667, term303667.getClass(), "propListHead", null);
        setIntField(term303667, term303667.getClass(), "sourcePosition", 0);
        setField(term303667, term303667.getClass(), "jsType", null);
        setField(term303667, term303667.getClass(), "parent", null);
        setField(term303664, term303664.getClass(), "next", term303667);
        setField(term303664, term303664.getClass(), "first", null);
        setField(term303664, term303664.getClass(), "last", null);
        setField(term303664, term303664.getClass(), "propListHead", null);
        setIntField(term303664, term303664.getClass(), "sourcePosition", 0);
        setField(term303664, term303664.getClass(), "jsType", null);
        setField(term303664, term303664.getClass(), "parent", null);
        setField(term303661, term303661.getClass(), "first", term303664);
        setField(term303661, term303661.getClass(), "last", null);
        setField(term303661, term303661.getClass(), "propListHead", null);
        setIntField(term303661, term303661.getClass(), "sourcePosition", 0);
        setField(term303661, term303661.getClass(), "jsType", null);
        setField(term303661, term303661.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term280057;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term279965, args);
        assertTrue(recursiveEquals(term279965, term303718));
        assertTrue(recursiveEquals(term280057, term303719));
        assertTrue(recursiveEquals(retValue, term303661));
    }

};


