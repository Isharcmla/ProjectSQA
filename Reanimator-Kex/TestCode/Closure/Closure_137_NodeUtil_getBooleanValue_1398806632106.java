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
import java.lang.Object;

public class NodeUtil_getBooleanValue_1398806632106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public NodeUtil_getBooleanValue_1398806632106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1, term1.getClass(), "type", 391863371);
        setIntField(term3, term3.getClass(), "type", -2038273078);
        setIntField(term5, term5.getClass(), "type", 0);
        setField(term5, term5.getClass(), "next", null);
        setField(term5, term5.getClass(), "first", null);
        setField(term5, term5.getClass(), "last", null);
        setField(term5, term5.getClass(), "propListHead", null);
        setIntField(term5, term5.getClass(), "sourcePosition", 0);
        setField(term5, term5.getClass(), "jsType", null);
        setField(term5, term5.getClass(), "parent", null);
        setField(term3, term3.getClass(), "next", term5);
        setIntField(term8, term8.getClass(), "type", 0);
        setField(term8, term8.getClass(), "next", null);
        setField(term8, term8.getClass(), "first", null);
        setField(term8, term8.getClass(), "last", null);
        setField(term8, term8.getClass(), "propListHead", null);
        setIntField(term8, term8.getClass(), "sourcePosition", 0);
        setField(term8, term8.getClass(), "jsType", null);
        setField(term8, term8.getClass(), "parent", null);
        setField(term3, term3.getClass(), "first", term8);
        setIntField(term11, term11.getClass(), "type", 0);
        setField(term11, term11.getClass(), "next", null);
        setField(term11, term11.getClass(), "first", null);
        setField(term11, term11.getClass(), "last", null);
        setField(term11, term11.getClass(), "propListHead", null);
        setIntField(term11, term11.getClass(), "sourcePosition", 0);
        setField(term11, term11.getClass(), "jsType", null);
        setField(term11, term11.getClass(), "parent", null);
        setField(term3, term3.getClass(), "last", term11);
        setField(term14, term14.getClass(), "next", null);
        setIntField(term14, term14.getClass(), "type", 0);
        setIntField(term14, term14.getClass(), "intValue", 0);
        setField(term14, term14.getClass(), "objectValue", null);
        setField(term3, term3.getClass(), "propListHead", term14);
        setIntField(term3, term3.getClass(), "sourcePosition", 1725571209);
        setField(term3, term3.getClass(), "jsType", null);
        setField(term3, term3.getClass(), "parent", null);
        setField(term1, term1.getClass(), "next", term3);
        setIntField(term18, term18.getClass(), "type", 0);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", null);
        setField(term18, term18.getClass(), "last", null);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term1, term1.getClass(), "first", term18);
        setIntField(term21, term21.getClass(), "type", 0);
        setField(term21, term21.getClass(), "next", null);
        setField(term21, term21.getClass(), "first", null);
        setField(term21, term21.getClass(), "last", null);
        setField(term21, term21.getClass(), "propListHead", null);
        setIntField(term21, term21.getClass(), "sourcePosition", 0);
        setField(term21, term21.getClass(), "jsType", null);
        setField(term21, term21.getClass(), "parent", null);
        setField(term1, term1.getClass(), "last", term21);
        setField(term24, term24.getClass(), "next", null);
        setIntField(term24, term24.getClass(), "type", 0);
        setIntField(term24, term24.getClass(), "intValue", 0);
        setField(term24, term24.getClass(), "objectValue", null);
        setField(term1, term1.getClass(), "propListHead", term24);
        setIntField(term1, term1.getClass(), "sourcePosition", -522618178);
        setField(term1, term1.getClass(), "jsType", null);
        setField(term1, term1.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1;
        try {
            callMethod(klass, "getBooleanValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


