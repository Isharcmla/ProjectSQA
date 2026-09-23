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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366673;
     Object term366765;
     Object term367036;
     Object term367037;
     Object term366996;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366673 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term366765 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term366857 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term366949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term366949, term366949.getClass(), "type", 40);
        setField(term366949, term366949.getClass(), "str", "");
        setField(term366857, term366857.getClass(), "next", term366949);
        setField(term366765, term366765.getClass(), "first", term366857);
        setIntField(term366765, term366765.getClass(), "type", 33);
        term367036 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term367036, term367036.getClass(), "currentTraversal", null);
        term367037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term367037, term367037.getClass(), "str", null);
        setIntField(term367037, term367037.getClass(), "type", 33);
        setField(term367037, term367037.getClass(), "next", null);
        setField(term367038, term367038.getClass(), "str", null);
        setIntField(term367038, term367038.getClass(), "type", 0);
        setField(term367039, term367039.getClass(), "str", "");
        setIntField(term367039, term367039.getClass(), "type", 40);
        setField(term367039, term367039.getClass(), "next", null);
        setField(term367039, term367039.getClass(), "first", null);
        setField(term367039, term367039.getClass(), "last", null);
        setField(term367039, term367039.getClass(), "propListHead", null);
        setIntField(term367039, term367039.getClass(), "sourcePosition", 0);
        setField(term367039, term367039.getClass(), "jsType", null);
        setField(term367039, term367039.getClass(), "parent", null);
        setField(term367038, term367038.getClass(), "next", term367039);
        setField(term367038, term367038.getClass(), "first", null);
        setField(term367038, term367038.getClass(), "last", null);
        setField(term367038, term367038.getClass(), "propListHead", null);
        setIntField(term367038, term367038.getClass(), "sourcePosition", 0);
        setField(term367038, term367038.getClass(), "jsType", null);
        setField(term367038, term367038.getClass(), "parent", null);
        setField(term367037, term367037.getClass(), "first", term367038);
        setField(term367037, term367037.getClass(), "last", null);
        setField(term367037, term367037.getClass(), "propListHead", null);
        setIntField(term367037, term367037.getClass(), "sourcePosition", 0);
        setField(term367037, term367037.getClass(), "jsType", null);
        setField(term367037, term367037.getClass(), "parent", null);
        term366996 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term366998 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term366996, term366996.getClass(), "str", null);
        setIntField(term366996, term366996.getClass(), "type", 33);
        setField(term366996, term366996.getClass(), "next", null);
        setField(term366998, term366998.getClass(), "str", null);
        setIntField(term366998, term366998.getClass(), "type", 0);
        setField(term367000, term367000.getClass(), "str", "");
        setIntField(term367000, term367000.getClass(), "type", 40);
        setField(term367000, term367000.getClass(), "next", null);
        setField(term367000, term367000.getClass(), "first", null);
        setField(term367000, term367000.getClass(), "last", null);
        setField(term367000, term367000.getClass(), "propListHead", null);
        setIntField(term367000, term367000.getClass(), "sourcePosition", 0);
        setField(term367000, term367000.getClass(), "jsType", null);
        setField(term367000, term367000.getClass(), "parent", null);
        setField(term366998, term366998.getClass(), "next", term367000);
        setField(term366998, term366998.getClass(), "first", null);
        setField(term366998, term366998.getClass(), "last", null);
        setField(term366998, term366998.getClass(), "propListHead", null);
        setIntField(term366998, term366998.getClass(), "sourcePosition", 0);
        setField(term366998, term366998.getClass(), "jsType", null);
        setField(term366998, term366998.getClass(), "parent", null);
        setField(term366996, term366996.getClass(), "first", term366998);
        setField(term366996, term366996.getClass(), "last", null);
        setField(term366996, term366996.getClass(), "propListHead", null);
        setIntField(term366996, term366996.getClass(), "sourcePosition", 0);
        setField(term366996, term366996.getClass(), "jsType", null);
        setField(term366996, term366996.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term366765;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term366673, args);
        assertTrue(recursiveEquals(term366673, term367036));
        assertTrue(recursiveEquals(term366765, term367037));
        assertTrue(recursiveEquals(retValue, term366996));
    }

};


