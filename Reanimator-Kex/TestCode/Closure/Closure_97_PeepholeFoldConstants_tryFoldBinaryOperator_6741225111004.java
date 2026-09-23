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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315383;
     Object term315475;
     Object term315733;
     Object term315734;
     Object term315675;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term315475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term315545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term315637 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term315545, term315545.getClass(), "next", term315637);
        setIntField(term315545, term315545.getClass(), "type", 0);
        setField(term315475, term315475.getClass(), "first", term315545);
        setIntField(term315475, term315475.getClass(), "type", 101);
        setField(term315475, term315475.getClass(), "parent", null);
        term315733 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term315733, term315733.getClass(), "currentTraversal", null);
        term315734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term315735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term315736 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term315734, term315734.getClass(), "number", 0.0);
        setIntField(term315734, term315734.getClass(), "type", 101);
        setField(term315734, term315734.getClass(), "next", null);
        setIntField(term315735, term315735.getClass(), "type", 0);
        setDoubleField(term315736, term315736.getClass(), "number", 0.0);
        setIntField(term315736, term315736.getClass(), "type", 0);
        setField(term315736, term315736.getClass(), "next", null);
        setField(term315736, term315736.getClass(), "first", null);
        setField(term315736, term315736.getClass(), "last", null);
        setField(term315736, term315736.getClass(), "propListHead", null);
        setIntField(term315736, term315736.getClass(), "sourcePosition", 0);
        setField(term315736, term315736.getClass(), "jsType", null);
        setField(term315736, term315736.getClass(), "parent", null);
        setField(term315735, term315735.getClass(), "next", term315736);
        setField(term315735, term315735.getClass(), "first", null);
        setField(term315735, term315735.getClass(), "last", null);
        setField(term315735, term315735.getClass(), "propListHead", null);
        setIntField(term315735, term315735.getClass(), "sourcePosition", 0);
        setField(term315735, term315735.getClass(), "jsType", null);
        setField(term315735, term315735.getClass(), "parent", null);
        setField(term315734, term315734.getClass(), "first", term315735);
        setField(term315734, term315734.getClass(), "last", null);
        setField(term315734, term315734.getClass(), "propListHead", null);
        setIntField(term315734, term315734.getClass(), "sourcePosition", 0);
        setField(term315734, term315734.getClass(), "jsType", null);
        setField(term315734, term315734.getClass(), "parent", null);
        term315675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term315678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term315680 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term315675, term315675.getClass(), "number", 0.0);
        setIntField(term315675, term315675.getClass(), "type", 101);
        setField(term315675, term315675.getClass(), "next", null);
        setIntField(term315678, term315678.getClass(), "type", 0);
        setDoubleField(term315680, term315680.getClass(), "number", 0.0);
        setIntField(term315680, term315680.getClass(), "type", 0);
        setField(term315680, term315680.getClass(), "next", null);
        setField(term315680, term315680.getClass(), "first", null);
        setField(term315680, term315680.getClass(), "last", null);
        setField(term315680, term315680.getClass(), "propListHead", null);
        setIntField(term315680, term315680.getClass(), "sourcePosition", 0);
        setField(term315680, term315680.getClass(), "jsType", null);
        setField(term315680, term315680.getClass(), "parent", null);
        setField(term315678, term315678.getClass(), "next", term315680);
        setField(term315678, term315678.getClass(), "first", null);
        setField(term315678, term315678.getClass(), "last", null);
        setField(term315678, term315678.getClass(), "propListHead", null);
        setIntField(term315678, term315678.getClass(), "sourcePosition", 0);
        setField(term315678, term315678.getClass(), "jsType", null);
        setField(term315678, term315678.getClass(), "parent", null);
        setField(term315675, term315675.getClass(), "first", term315678);
        setField(term315675, term315675.getClass(), "last", null);
        setField(term315675, term315675.getClass(), "propListHead", null);
        setIntField(term315675, term315675.getClass(), "sourcePosition", 0);
        setField(term315675, term315675.getClass(), "jsType", null);
        setField(term315675, term315675.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term315475;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term315383, args);
        assertTrue(recursiveEquals(term315383, term315733));
        assertTrue(recursiveEquals(term315475, term315734));
        assertTrue(recursiveEquals(retValue, term315675));
    }

};


