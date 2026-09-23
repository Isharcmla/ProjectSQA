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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733814;
     Object term733906;
     Object term734266;
     Object term734267;
     Object term734190;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term733814 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term733906 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term733998 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term734090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term734182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term734090, term734090.getClass(), "type", 44);
        setField(term733998, term733998.getClass(), "next", term734090);
        setIntField(term733998, term733998.getClass(), "type", 0);
        setField(term733906, term733906.getClass(), "first", term733998);
        setIntField(term733906, term733906.getClass(), "type", 101);
        setIntField(term734182, term734182.getClass(), "type", 98);
        setField(term733906, term733906.getClass(), "parent", term734182);
        term734266 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term734266, term734266.getClass(), "currentTraversal", null);
        term734267 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term734268 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term734269 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term734270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term734267, term734267.getClass(), "str", null);
        setIntField(term734267, term734267.getClass(), "type", 101);
        setField(term734267, term734267.getClass(), "next", null);
        setField(term734268, term734268.getClass(), "str", null);
        setIntField(term734268, term734268.getClass(), "type", 0);
        setDoubleField(term734269, term734269.getClass(), "number", 0.0);
        setIntField(term734269, term734269.getClass(), "type", 44);
        setField(term734269, term734269.getClass(), "next", null);
        setField(term734269, term734269.getClass(), "first", null);
        setField(term734269, term734269.getClass(), "last", null);
        setField(term734269, term734269.getClass(), "propListHead", null);
        setIntField(term734269, term734269.getClass(), "sourcePosition", 0);
        setField(term734269, term734269.getClass(), "jsType", null);
        setField(term734269, term734269.getClass(), "parent", null);
        setField(term734268, term734268.getClass(), "next", term734269);
        setField(term734268, term734268.getClass(), "first", null);
        setField(term734268, term734268.getClass(), "last", null);
        setField(term734268, term734268.getClass(), "propListHead", null);
        setIntField(term734268, term734268.getClass(), "sourcePosition", 0);
        setField(term734268, term734268.getClass(), "jsType", null);
        setField(term734268, term734268.getClass(), "parent", null);
        setField(term734267, term734267.getClass(), "first", term734268);
        setField(term734267, term734267.getClass(), "last", null);
        setField(term734267, term734267.getClass(), "propListHead", null);
        setIntField(term734267, term734267.getClass(), "sourcePosition", 0);
        setField(term734267, term734267.getClass(), "jsType", null);
        setDoubleField(term734270, term734270.getClass(), "number", 0.0);
        setIntField(term734270, term734270.getClass(), "type", 98);
        setField(term734270, term734270.getClass(), "next", null);
        setField(term734270, term734270.getClass(), "first", null);
        setField(term734270, term734270.getClass(), "last", null);
        setField(term734270, term734270.getClass(), "propListHead", null);
        setIntField(term734270, term734270.getClass(), "sourcePosition", 0);
        setField(term734270, term734270.getClass(), "jsType", null);
        setField(term734270, term734270.getClass(), "parent", null);
        setField(term734267, term734267.getClass(), "parent", term734270);
        term734190 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term734192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term734194 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term734200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term734190, term734190.getClass(), "str", null);
        setIntField(term734190, term734190.getClass(), "type", 101);
        setField(term734190, term734190.getClass(), "next", null);
        setField(term734192, term734192.getClass(), "str", null);
        setIntField(term734192, term734192.getClass(), "type", 0);
        setDoubleField(term734194, term734194.getClass(), "number", 0.0);
        setIntField(term734194, term734194.getClass(), "type", 44);
        setField(term734194, term734194.getClass(), "next", null);
        setField(term734194, term734194.getClass(), "first", null);
        setField(term734194, term734194.getClass(), "last", null);
        setField(term734194, term734194.getClass(), "propListHead", null);
        setIntField(term734194, term734194.getClass(), "sourcePosition", 0);
        setField(term734194, term734194.getClass(), "jsType", null);
        setField(term734194, term734194.getClass(), "parent", null);
        setField(term734192, term734192.getClass(), "next", term734194);
        setField(term734192, term734192.getClass(), "first", null);
        setField(term734192, term734192.getClass(), "last", null);
        setField(term734192, term734192.getClass(), "propListHead", null);
        setIntField(term734192, term734192.getClass(), "sourcePosition", 0);
        setField(term734192, term734192.getClass(), "jsType", null);
        setField(term734192, term734192.getClass(), "parent", null);
        setField(term734190, term734190.getClass(), "first", term734192);
        setField(term734190, term734190.getClass(), "last", null);
        setField(term734190, term734190.getClass(), "propListHead", null);
        setIntField(term734190, term734190.getClass(), "sourcePosition", 0);
        setField(term734190, term734190.getClass(), "jsType", null);
        setDoubleField(term734200, term734200.getClass(), "number", 0.0);
        setIntField(term734200, term734200.getClass(), "type", 98);
        setField(term734200, term734200.getClass(), "next", null);
        setField(term734200, term734200.getClass(), "first", null);
        setField(term734200, term734200.getClass(), "last", null);
        setField(term734200, term734200.getClass(), "propListHead", null);
        setIntField(term734200, term734200.getClass(), "sourcePosition", 0);
        setField(term734200, term734200.getClass(), "jsType", null);
        setField(term734200, term734200.getClass(), "parent", null);
        setField(term734190, term734190.getClass(), "parent", term734200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term733906;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term733814, args);
        assertTrue(recursiveEquals(term733814, term734266));
        assertTrue(recursiveEquals(term733906, term734267));
        assertTrue(recursiveEquals(retValue, term734190));
    }

};


