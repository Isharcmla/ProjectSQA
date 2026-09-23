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
import java.lang.Object;

public class IR_script_91876311881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190;

    public IR_script_91876311881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190 = (Object[]) newArray("com.google.javascript.rhino.Node", 4);
        Object term191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191, term191.getClass(), "type", 287287233);
        setIntField(term193, term193.getClass(), "type", 962840079);
        setIntField(term195, term195.getClass(), "type", 1540719661);
        setIntField(term197, term197.getClass(), "type", 1265463001);
        setField(term197, term197.getClass(), "next", null);
        setField(term197, term197.getClass(), "first", null);
        setField(term197, term197.getClass(), "last", term195);
        setField(term197, term197.getClass(), "propListHead", null);
        setIntField(term197, term197.getClass(), "sourcePosition", 0);
        setField(term197, term197.getClass(), "jsType", null);
        setField(term197, term197.getClass(), "parent", null);
        setField(term195, term195.getClass(), "next", term197);
        setIntField(term200, term200.getClass(), "type", 335112684);
        setField(term200, term200.getClass(), "next", null);
        setField(term200, term200.getClass(), "first", null);
        setField(term200, term200.getClass(), "last", null);
        setField(term200, term200.getClass(), "propListHead", null);
        setIntField(term200, term200.getClass(), "sourcePosition", 0);
        setField(term200, term200.getClass(), "jsType", null);
        setField(term200, term200.getClass(), "parent", null);
        setField(term195, term195.getClass(), "first", term200);
        setIntField(term203, term203.getClass(), "type", 1063420942);
        setField(term203, term203.getClass(), "next", null);
        setField(term203, term203.getClass(), "first", term193);
        setField(term203, term203.getClass(), "last", term193);
        setField(term203, term203.getClass(), "propListHead", null);
        setIntField(term203, term203.getClass(), "sourcePosition", 0);
        setField(term203, term203.getClass(), "jsType", null);
        setField(term203, term203.getClass(), "parent", null);
        setField(term195, term195.getClass(), "last", term203);
        setField(term195, term195.getClass(), "propListHead", null);
        setIntField(term195, term195.getClass(), "sourcePosition", 0);
        setField(term195, term195.getClass(), "jsType", null);
        setField(term195, term195.getClass(), "parent", null);
        setField(term193, term193.getClass(), "next", term195);
        setIntField(term207, term207.getClass(), "type", -478195677);
        setField(term207, term207.getClass(), "next", term203);
        setIntField(term209, term209.getClass(), "type", 1375330971);
        setField(term209, term209.getClass(), "next", term207);
        setField(term209, term209.getClass(), "first", null);
        setField(term209, term209.getClass(), "last", term197);
        setField(term209, term209.getClass(), "propListHead", null);
        setIntField(term209, term209.getClass(), "sourcePosition", 0);
        setField(term209, term209.getClass(), "jsType", null);
        setField(term209, term209.getClass(), "parent", null);
        setField(term207, term207.getClass(), "first", term209);
        setField(term207, term207.getClass(), "last", term191);
        setField(term207, term207.getClass(), "propListHead", null);
        setIntField(term207, term207.getClass(), "sourcePosition", 0);
        setField(term207, term207.getClass(), "jsType", null);
        setField(term207, term207.getClass(), "parent", null);
        setField(term193, term193.getClass(), "first", term207);
        setField(term193, term193.getClass(), "last", term207);
        setField(term193, term193.getClass(), "propListHead", null);
        setIntField(term193, term193.getClass(), "sourcePosition", 0);
        setField(term193, term193.getClass(), "jsType", null);
        setField(term193, term193.getClass(), "parent", null);
        setField(term191, term191.getClass(), "next", term193);
        setField(term191, term191.getClass(), "first", term197);
        setField(term191, term191.getClass(), "last", term200);
        setField(term191, term191.getClass(), "propListHead", null);
        setIntField(term191, term191.getClass(), "sourcePosition", 0);
        setField(term191, term191.getClass(), "jsType", null);
        setField(term191, term191.getClass(), "parent", null);
        setElement(term190, 0, term191);
        setElement(term190, 1, term200);
        setElement(term190, 2, term193);
        setIntField(term215, term215.getClass(), "type", -2027534003);
        setField(term215, term215.getClass(), "next", term203);
        setField(term215, term215.getClass(), "first", term207);
        setField(term215, term215.getClass(), "last", term203);
        setField(term215, term215.getClass(), "propListHead", null);
        setIntField(term215, term215.getClass(), "sourcePosition", 0);
        setField(term215, term215.getClass(), "jsType", null);
        setField(term215, term215.getClass(), "parent", null);
        setElement(term190, 3, term215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term190;
        try {
            callMethod(klass, "script", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


