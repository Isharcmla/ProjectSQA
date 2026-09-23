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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_getNodeTypeReferenceCount_241691030280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3714;
     Object term3741;

    public NodeUtil_getNodeTypeReferenceCount_241691030280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3727 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3737 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3714, term3714.getClass(), "type", -1891353352);
        setIntField(term3716, term3716.getClass(), "type", 840704993);
        setIntField(term3718, term3718.getClass(), "type", 0);
        setField(term3718, term3718.getClass(), "next", null);
        setField(term3718, term3718.getClass(), "first", null);
        setField(term3718, term3718.getClass(), "last", null);
        setField(term3718, term3718.getClass(), "propListHead", null);
        setIntField(term3718, term3718.getClass(), "sourcePosition", 0);
        setField(term3718, term3718.getClass(), "jsType", null);
        setField(term3718, term3718.getClass(), "parent", null);
        setField(term3716, term3716.getClass(), "next", term3718);
        setIntField(term3721, term3721.getClass(), "type", 0);
        setField(term3721, term3721.getClass(), "next", null);
        setField(term3721, term3721.getClass(), "first", null);
        setField(term3721, term3721.getClass(), "last", null);
        setField(term3721, term3721.getClass(), "propListHead", null);
        setIntField(term3721, term3721.getClass(), "sourcePosition", 0);
        setField(term3721, term3721.getClass(), "jsType", null);
        setField(term3721, term3721.getClass(), "parent", null);
        setField(term3716, term3716.getClass(), "first", term3721);
        setIntField(term3724, term3724.getClass(), "type", 0);
        setField(term3724, term3724.getClass(), "next", null);
        setField(term3724, term3724.getClass(), "first", null);
        setField(term3724, term3724.getClass(), "last", null);
        setField(term3724, term3724.getClass(), "propListHead", null);
        setIntField(term3724, term3724.getClass(), "sourcePosition", 0);
        setField(term3724, term3724.getClass(), "jsType", null);
        setField(term3724, term3724.getClass(), "parent", null);
        setField(term3716, term3716.getClass(), "last", term3724);
        setField(term3727, term3727.getClass(), "next", null);
        setIntField(term3727, term3727.getClass(), "type", 0);
        setIntField(term3727, term3727.getClass(), "intValue", 0);
        setField(term3727, term3727.getClass(), "objectValue", null);
        setField(term3716, term3716.getClass(), "propListHead", term3727);
        setIntField(term3716, term3716.getClass(), "sourcePosition", -845551243);
        setField(term3716, term3716.getClass(), "jsType", null);
        setField(term3716, term3716.getClass(), "parent", null);
        setField(term3714, term3714.getClass(), "next", term3716);
        setIntField(term3731, term3731.getClass(), "type", 0);
        setField(term3731, term3731.getClass(), "next", null);
        setField(term3731, term3731.getClass(), "first", null);
        setField(term3731, term3731.getClass(), "last", null);
        setField(term3731, term3731.getClass(), "propListHead", null);
        setIntField(term3731, term3731.getClass(), "sourcePosition", 0);
        setField(term3731, term3731.getClass(), "jsType", null);
        setField(term3731, term3731.getClass(), "parent", null);
        setField(term3714, term3714.getClass(), "first", term3731);
        setIntField(term3734, term3734.getClass(), "type", 0);
        setField(term3734, term3734.getClass(), "next", null);
        setField(term3734, term3734.getClass(), "first", null);
        setField(term3734, term3734.getClass(), "last", null);
        setField(term3734, term3734.getClass(), "propListHead", null);
        setIntField(term3734, term3734.getClass(), "sourcePosition", 0);
        setField(term3734, term3734.getClass(), "jsType", null);
        setField(term3734, term3734.getClass(), "parent", null);
        setField(term3714, term3714.getClass(), "last", term3734);
        setField(term3737, term3737.getClass(), "next", null);
        setIntField(term3737, term3737.getClass(), "type", 0);
        setIntField(term3737, term3737.getClass(), "intValue", 0);
        setField(term3737, term3737.getClass(), "objectValue", null);
        setField(term3714, term3714.getClass(), "propListHead", term3737);
        setIntField(term3714, term3714.getClass(), "sourcePosition", 370671198);
        setField(term3714, term3714.getClass(), "jsType", null);
        setField(term3714, term3714.getClass(), "parent", null);
        term3741 = new Integer(1426800646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3714;
        args[1] = term3741;
        args[2] = null;
        try {
            callMethod(klass, "getNodeTypeReferenceCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


