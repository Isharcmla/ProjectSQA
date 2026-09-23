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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getOpFromAssignmentOp_1833167928149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762;

    public NodeUtil_getOpFromAssignmentOp_1833167928149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term775 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term762, term762.getClass(), "type", 954660603);
        setIntField(term764, term764.getClass(), "type", -648200466);
        setIntField(term766, term766.getClass(), "type", 0);
        setField(term766, term766.getClass(), "next", null);
        setField(term766, term766.getClass(), "first", null);
        setField(term766, term766.getClass(), "last", null);
        setField(term766, term766.getClass(), "propListHead", null);
        setIntField(term766, term766.getClass(), "sourcePosition", 0);
        setField(term766, term766.getClass(), "jsType", null);
        setField(term766, term766.getClass(), "parent", null);
        setField(term764, term764.getClass(), "next", term766);
        setIntField(term769, term769.getClass(), "type", 0);
        setField(term769, term769.getClass(), "next", null);
        setField(term769, term769.getClass(), "first", null);
        setField(term769, term769.getClass(), "last", null);
        setField(term769, term769.getClass(), "propListHead", null);
        setIntField(term769, term769.getClass(), "sourcePosition", 0);
        setField(term769, term769.getClass(), "jsType", null);
        setField(term769, term769.getClass(), "parent", null);
        setField(term764, term764.getClass(), "first", term769);
        setIntField(term772, term772.getClass(), "type", 0);
        setField(term772, term772.getClass(), "next", null);
        setField(term772, term772.getClass(), "first", null);
        setField(term772, term772.getClass(), "last", null);
        setField(term772, term772.getClass(), "propListHead", null);
        setIntField(term772, term772.getClass(), "sourcePosition", 0);
        setField(term772, term772.getClass(), "jsType", null);
        setField(term772, term772.getClass(), "parent", null);
        setField(term764, term764.getClass(), "last", term772);
        setField(term775, term775.getClass(), "next", null);
        setIntField(term775, term775.getClass(), "type", 0);
        setIntField(term775, term775.getClass(), "intValue", 0);
        setField(term775, term775.getClass(), "objectValue", null);
        setField(term764, term764.getClass(), "propListHead", term775);
        setIntField(term764, term764.getClass(), "sourcePosition", -765191335);
        setField(term764, term764.getClass(), "jsType", null);
        setField(term764, term764.getClass(), "parent", null);
        setField(term762, term762.getClass(), "next", term764);
        setIntField(term779, term779.getClass(), "type", 0);
        setField(term779, term779.getClass(), "next", null);
        setField(term779, term779.getClass(), "first", null);
        setField(term779, term779.getClass(), "last", null);
        setField(term779, term779.getClass(), "propListHead", null);
        setIntField(term779, term779.getClass(), "sourcePosition", 0);
        setField(term779, term779.getClass(), "jsType", null);
        setField(term779, term779.getClass(), "parent", null);
        setField(term762, term762.getClass(), "first", term779);
        setIntField(term782, term782.getClass(), "type", 0);
        setField(term782, term782.getClass(), "next", null);
        setField(term782, term782.getClass(), "first", null);
        setField(term782, term782.getClass(), "last", null);
        setField(term782, term782.getClass(), "propListHead", null);
        setIntField(term782, term782.getClass(), "sourcePosition", 0);
        setField(term782, term782.getClass(), "jsType", null);
        setField(term782, term782.getClass(), "parent", null);
        setField(term762, term762.getClass(), "last", term782);
        setField(term785, term785.getClass(), "next", null);
        setIntField(term785, term785.getClass(), "type", 0);
        setIntField(term785, term785.getClass(), "intValue", 0);
        setField(term785, term785.getClass(), "objectValue", null);
        setField(term762, term762.getClass(), "propListHead", term785);
        setIntField(term762, term762.getClass(), "sourcePosition", -1697741155);
        setField(term762, term762.getClass(), "jsType", null);
        setField(term762, term762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term762;
        try {
            callMethod(klass, "getOpFromAssignmentOp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


