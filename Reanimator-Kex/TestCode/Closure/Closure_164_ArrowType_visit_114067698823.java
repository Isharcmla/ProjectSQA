package com.google.javascript.rhino.jstype;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_visit_114067698823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444;

    public ArrowType_visit_114067698823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term445, term445.getClass(), "type", -268815336);
        setIntField(term447, term447.getClass(), "type", -1210583429);
        setIntField(term449, term449.getClass(), "type", -663691365);
        setIntField(term451, term451.getClass(), "type", 339854490);
        setField(term451, term451.getClass(), "next", null);
        setField(term451, term451.getClass(), "first", null);
        setField(term451, term451.getClass(), "last", null);
        setField(term451, term451.getClass(), "propListHead", null);
        setIntField(term451, term451.getClass(), "sourcePosition", 0);
        setField(term451, term451.getClass(), "jsType", null);
        setField(term451, term451.getClass(), "parent", null);
        setField(term449, term449.getClass(), "next", term451);
        setIntField(term454, term454.getClass(), "type", 1532716628);
        setField(term454, term454.getClass(), "next", null);
        setField(term454, term454.getClass(), "first", term445);
        setField(term454, term454.getClass(), "last", null);
        setField(term454, term454.getClass(), "propListHead", null);
        setIntField(term454, term454.getClass(), "sourcePosition", 0);
        setField(term454, term454.getClass(), "jsType", null);
        setField(term454, term454.getClass(), "parent", null);
        setField(term449, term449.getClass(), "first", term454);
        setIntField(term457, term457.getClass(), "type", -1476117762);
        setField(term457, term457.getClass(), "next", null);
        setField(term457, term457.getClass(), "first", term447);
        setField(term457, term457.getClass(), "last", null);
        setField(term457, term457.getClass(), "propListHead", null);
        setIntField(term457, term457.getClass(), "sourcePosition", 0);
        setField(term457, term457.getClass(), "jsType", null);
        setField(term457, term457.getClass(), "parent", null);
        setField(term449, term449.getClass(), "last", term457);
        setField(term449, term449.getClass(), "propListHead", null);
        setIntField(term449, term449.getClass(), "sourcePosition", 0);
        setField(term449, term449.getClass(), "jsType", null);
        setField(term449, term449.getClass(), "parent", null);
        setField(term447, term447.getClass(), "next", term449);
        setField(term447, term447.getClass(), "first", term449);
        setIntField(term461, term461.getClass(), "type", -615654495);
        setField(term461, term461.getClass(), "next", term457);
        setField(term461, term461.getClass(), "first", term454);
        setField(term461, term461.getClass(), "last", term454);
        setField(term461, term461.getClass(), "propListHead", null);
        setIntField(term461, term461.getClass(), "sourcePosition", 0);
        setField(term461, term461.getClass(), "jsType", null);
        setField(term461, term461.getClass(), "parent", null);
        setField(term447, term447.getClass(), "last", term461);
        setField(term447, term447.getClass(), "propListHead", null);
        setIntField(term447, term447.getClass(), "sourcePosition", 0);
        setField(term447, term447.getClass(), "jsType", null);
        setField(term447, term447.getClass(), "parent", null);
        setField(term445, term445.getClass(), "next", term447);
        setField(term445, term445.getClass(), "first", term454);
        setIntField(term465, term465.getClass(), "type", 0);
        setField(term465, term465.getClass(), "next", null);
        setField(term465, term465.getClass(), "first", null);
        setField(term465, term465.getClass(), "last", null);
        setField(term465, term465.getClass(), "propListHead", null);
        setIntField(term465, term465.getClass(), "sourcePosition", 0);
        setField(term465, term465.getClass(), "jsType", null);
        setField(term465, term465.getClass(), "parent", null);
        setField(term445, term445.getClass(), "last", term465);
        setField(term445, term445.getClass(), "propListHead", null);
        setIntField(term445, term445.getClass(), "sourcePosition", 0);
        setField(term445, term445.getClass(), "jsType", null);
        setField(term445, term445.getClass(), "parent", null);
        setField(term444, term444.getClass(), "parameters", term445);
        setField(term444, term444.getClass(), "returnType", null);
        setBooleanField(term444, term444.getClass(), "returnTypeInferred", false);
        setBooleanField(term444, term444.getClass(), "resolved", false);
        setField(term444, term444.getClass(), "resolveResult", null);
        setField(term444, term444.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term444, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


