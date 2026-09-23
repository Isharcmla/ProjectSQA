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
import java.lang.Integer;

public class NodeUtil_getNodeTypeReferenceCount_1610039189197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2778;
     Object term2805;
     Object term14619;

    public NodeUtil_getNodeTypeReferenceCount_1610039189197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2791 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2801 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2778, term2778.getClass(), "type", 1064185088);
        setIntField(term2780, term2780.getClass(), "type", 793345010);
        setIntField(term2782, term2782.getClass(), "type", 0);
        setField(term2782, term2782.getClass(), "next", null);
        setField(term2782, term2782.getClass(), "first", null);
        setField(term2782, term2782.getClass(), "last", null);
        setField(term2782, term2782.getClass(), "propListHead", null);
        setIntField(term2782, term2782.getClass(), "sourcePosition", 0);
        setField(term2782, term2782.getClass(), "jsType", null);
        setField(term2782, term2782.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "next", term2782);
        setIntField(term2785, term2785.getClass(), "type", 0);
        setField(term2785, term2785.getClass(), "next", null);
        setField(term2785, term2785.getClass(), "first", null);
        setField(term2785, term2785.getClass(), "last", null);
        setField(term2785, term2785.getClass(), "propListHead", null);
        setIntField(term2785, term2785.getClass(), "sourcePosition", 0);
        setField(term2785, term2785.getClass(), "jsType", null);
        setField(term2785, term2785.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "first", term2785);
        setIntField(term2788, term2788.getClass(), "type", 0);
        setField(term2788, term2788.getClass(), "next", null);
        setField(term2788, term2788.getClass(), "first", null);
        setField(term2788, term2788.getClass(), "last", null);
        setField(term2788, term2788.getClass(), "propListHead", null);
        setIntField(term2788, term2788.getClass(), "sourcePosition", 0);
        setField(term2788, term2788.getClass(), "jsType", null);
        setField(term2788, term2788.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "last", term2788);
        setField(term2791, term2791.getClass(), "next", null);
        setIntField(term2791, term2791.getClass(), "type", 0);
        setIntField(term2791, term2791.getClass(), "intValue", 0);
        setField(term2791, term2791.getClass(), "objectValue", null);
        setField(term2780, term2780.getClass(), "propListHead", term2791);
        setIntField(term2780, term2780.getClass(), "sourcePosition", 1523896653);
        setField(term2780, term2780.getClass(), "jsType", null);
        setField(term2780, term2780.getClass(), "parent", null);
        setField(term2778, term2778.getClass(), "next", term2780);
        setIntField(term2795, term2795.getClass(), "type", 0);
        setField(term2795, term2795.getClass(), "next", null);
        setField(term2795, term2795.getClass(), "first", null);
        setField(term2795, term2795.getClass(), "last", null);
        setField(term2795, term2795.getClass(), "propListHead", null);
        setIntField(term2795, term2795.getClass(), "sourcePosition", 0);
        setField(term2795, term2795.getClass(), "jsType", null);
        setField(term2795, term2795.getClass(), "parent", null);
        setField(term2778, term2778.getClass(), "first", term2795);
        setIntField(term2798, term2798.getClass(), "type", 0);
        setField(term2798, term2798.getClass(), "next", null);
        setField(term2798, term2798.getClass(), "first", null);
        setField(term2798, term2798.getClass(), "last", null);
        setField(term2798, term2798.getClass(), "propListHead", null);
        setIntField(term2798, term2798.getClass(), "sourcePosition", 0);
        setField(term2798, term2798.getClass(), "jsType", null);
        setField(term2798, term2798.getClass(), "parent", null);
        setField(term2778, term2778.getClass(), "last", term2798);
        setField(term2801, term2801.getClass(), "next", null);
        setIntField(term2801, term2801.getClass(), "type", 0);
        setIntField(term2801, term2801.getClass(), "intValue", 0);
        setField(term2801, term2801.getClass(), "objectValue", null);
        setField(term2778, term2778.getClass(), "propListHead", term2801);
        setIntField(term2778, term2778.getClass(), "sourcePosition", -1731921726);
        setField(term2778, term2778.getClass(), "jsType", null);
        setField(term2778, term2778.getClass(), "parent", null);
        term2805 = new Integer(919994471);
        term14619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14624 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14627 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14619, term14619.getClass(), "type", 1064185088);
        setIntField(term14620, term14620.getClass(), "type", 793345010);
        setIntField(term14621, term14621.getClass(), "type", 0);
        setField(term14621, term14621.getClass(), "next", null);
        setField(term14621, term14621.getClass(), "first", null);
        setField(term14621, term14621.getClass(), "last", null);
        setField(term14621, term14621.getClass(), "propListHead", null);
        setIntField(term14621, term14621.getClass(), "sourcePosition", 0);
        setField(term14621, term14621.getClass(), "jsType", null);
        setField(term14621, term14621.getClass(), "parent", null);
        setField(term14620, term14620.getClass(), "next", term14621);
        setIntField(term14622, term14622.getClass(), "type", 0);
        setField(term14622, term14622.getClass(), "next", null);
        setField(term14622, term14622.getClass(), "first", null);
        setField(term14622, term14622.getClass(), "last", null);
        setField(term14622, term14622.getClass(), "propListHead", null);
        setIntField(term14622, term14622.getClass(), "sourcePosition", 0);
        setField(term14622, term14622.getClass(), "jsType", null);
        setField(term14622, term14622.getClass(), "parent", null);
        setField(term14620, term14620.getClass(), "first", term14622);
        setIntField(term14623, term14623.getClass(), "type", 0);
        setField(term14623, term14623.getClass(), "next", null);
        setField(term14623, term14623.getClass(), "first", null);
        setField(term14623, term14623.getClass(), "last", null);
        setField(term14623, term14623.getClass(), "propListHead", null);
        setIntField(term14623, term14623.getClass(), "sourcePosition", 0);
        setField(term14623, term14623.getClass(), "jsType", null);
        setField(term14623, term14623.getClass(), "parent", null);
        setField(term14620, term14620.getClass(), "last", term14623);
        setField(term14624, term14624.getClass(), "next", null);
        setIntField(term14624, term14624.getClass(), "type", 0);
        setIntField(term14624, term14624.getClass(), "intValue", 0);
        setField(term14624, term14624.getClass(), "objectValue", null);
        setField(term14620, term14620.getClass(), "propListHead", term14624);
        setIntField(term14620, term14620.getClass(), "sourcePosition", 1523896653);
        setField(term14620, term14620.getClass(), "jsType", null);
        setField(term14620, term14620.getClass(), "parent", null);
        setField(term14619, term14619.getClass(), "next", term14620);
        setIntField(term14625, term14625.getClass(), "type", 0);
        setField(term14625, term14625.getClass(), "next", null);
        setField(term14625, term14625.getClass(), "first", null);
        setField(term14625, term14625.getClass(), "last", null);
        setField(term14625, term14625.getClass(), "propListHead", null);
        setIntField(term14625, term14625.getClass(), "sourcePosition", 0);
        setField(term14625, term14625.getClass(), "jsType", null);
        setField(term14625, term14625.getClass(), "parent", null);
        setField(term14619, term14619.getClass(), "first", term14625);
        setIntField(term14626, term14626.getClass(), "type", 0);
        setField(term14626, term14626.getClass(), "next", null);
        setField(term14626, term14626.getClass(), "first", null);
        setField(term14626, term14626.getClass(), "last", null);
        setField(term14626, term14626.getClass(), "propListHead", null);
        setIntField(term14626, term14626.getClass(), "sourcePosition", 0);
        setField(term14626, term14626.getClass(), "jsType", null);
        setField(term14626, term14626.getClass(), "parent", null);
        setField(term14619, term14619.getClass(), "last", term14626);
        setField(term14627, term14627.getClass(), "next", null);
        setIntField(term14627, term14627.getClass(), "type", 0);
        setIntField(term14627, term14627.getClass(), "intValue", 0);
        setField(term14627, term14627.getClass(), "objectValue", null);
        setField(term14619, term14619.getClass(), "propListHead", term14627);
        setIntField(term14619, term14619.getClass(), "sourcePosition", -1731921726);
        setField(term14619, term14619.getClass(), "jsType", null);
        setField(term14619, term14619.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2778;
        args[1] = term2805;
        Object retValue = callMethod(klass, "getNodeTypeReferenceCount", argTypes, null, args);
        assertTrue(recursiveEquals(term2778, 919994471));
        assertTrue(recursiveEquals(term2805, term14619));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


