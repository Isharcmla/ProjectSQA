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

public class PeepholeFoldConstants_tryFoldAndOr_425870290268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51340;
     Object term51432;
     Object term51524;
     Object term51616;
     Object term51741;
     Object term51742;
     Object term51743;
     Object term51744;
     Object term51700;

    public PeepholeFoldConstants_tryFoldAndOr_425870290268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51340 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term51432 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term51432, term51432.getClass(), "parent", null);
        setIntField(term51432, term51432.getClass(), "type", 0);
        term51524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term51524, term51524.getClass(), "type", 0);
        term51616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term51741 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term51741, term51741.getClass(), "currentTraversal", null);
        term51742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51742, term51742.getClass(), "number", 0.0);
        setIntField(term51742, term51742.getClass(), "type", 0);
        setField(term51742, term51742.getClass(), "next", null);
        setField(term51742, term51742.getClass(), "first", null);
        setField(term51742, term51742.getClass(), "last", null);
        setField(term51742, term51742.getClass(), "propListHead", null);
        setIntField(term51742, term51742.getClass(), "sourcePosition", 0);
        setField(term51742, term51742.getClass(), "jsType", null);
        setField(term51742, term51742.getClass(), "parent", null);
        term51743 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51743, term51743.getClass(), "number", 0.0);
        setIntField(term51743, term51743.getClass(), "type", 0);
        setField(term51743, term51743.getClass(), "next", null);
        setField(term51743, term51743.getClass(), "first", null);
        setField(term51743, term51743.getClass(), "last", null);
        setField(term51743, term51743.getClass(), "propListHead", null);
        setIntField(term51743, term51743.getClass(), "sourcePosition", 0);
        setField(term51743, term51743.getClass(), "jsType", null);
        setField(term51743, term51743.getClass(), "parent", null);
        term51744 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51744, term51744.getClass(), "number", 0.0);
        setIntField(term51744, term51744.getClass(), "type", 0);
        setField(term51744, term51744.getClass(), "next", null);
        setField(term51744, term51744.getClass(), "first", null);
        setField(term51744, term51744.getClass(), "last", null);
        setField(term51744, term51744.getClass(), "propListHead", null);
        setIntField(term51744, term51744.getClass(), "sourcePosition", 0);
        setField(term51744, term51744.getClass(), "jsType", null);
        setField(term51744, term51744.getClass(), "parent", null);
        term51700 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51700, term51700.getClass(), "number", 0.0);
        setIntField(term51700, term51700.getClass(), "type", 0);
        setField(term51700, term51700.getClass(), "next", null);
        setField(term51700, term51700.getClass(), "first", null);
        setField(term51700, term51700.getClass(), "last", null);
        setField(term51700, term51700.getClass(), "propListHead", null);
        setIntField(term51700, term51700.getClass(), "sourcePosition", 0);
        setField(term51700, term51700.getClass(), "jsType", null);
        setField(term51700, term51700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term51432;
        args[1] = term51524;
        args[2] = term51616;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term51340, args);
        assertTrue(recursiveEquals(term51340, term51741));
        assertTrue(recursiveEquals(term51432, term51742));
        assertTrue(recursiveEquals(term51524, term51743));
        assertTrue(recursiveEquals(term51616, term51744));
        assertTrue(recursiveEquals(retValue, term51700));
    }

};


