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

public class NodeUtil_isExpressionResultUsed_27795707319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4993;

    public NodeUtil_isExpressionResultUsed_27795707319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4993, term4993.getClass(), "type", -1042022818);
        setIntField(term4995, term4995.getClass(), "type", 317372051);
        setIntField(term4997, term4997.getClass(), "type", 892170444);
        setIntField(term4999, term4999.getClass(), "type", -82417507);
        setIntField(term5001, term5001.getClass(), "type", -511400358);
        setField(term5001, term5001.getClass(), "next", null);
        setField(term5001, term5001.getClass(), "first", null);
        setField(term5001, term5001.getClass(), "last", null);
        setField(term5001, term5001.getClass(), "propListHead", null);
        setIntField(term5001, term5001.getClass(), "sourcePosition", 0);
        setField(term5001, term5001.getClass(), "jsType", null);
        setField(term5001, term5001.getClass(), "parent", null);
        setField(term4999, term4999.getClass(), "next", term5001);
        setIntField(term5004, term5004.getClass(), "type", -742178468);
        setField(term5004, term5004.getClass(), "next", null);
        setField(term5004, term5004.getClass(), "first", null);
        setField(term5004, term5004.getClass(), "last", term5001);
        setField(term5004, term5004.getClass(), "propListHead", null);
        setIntField(term5004, term5004.getClass(), "sourcePosition", 0);
        setField(term5004, term5004.getClass(), "jsType", null);
        setField(term5004, term5004.getClass(), "parent", null);
        setField(term4999, term4999.getClass(), "first", term5004);
        setField(term4999, term4999.getClass(), "last", term4997);
        setField(term4999, term4999.getClass(), "propListHead", null);
        setIntField(term4999, term4999.getClass(), "sourcePosition", 0);
        setField(term4999, term4999.getClass(), "jsType", null);
        setField(term4999, term4999.getClass(), "parent", null);
        setField(term4997, term4997.getClass(), "next", term4999);
        setField(term4997, term4997.getClass(), "first", term5001);
        setIntField(term5008, term5008.getClass(), "type", -65504209);
        setIntField(term5010, term5010.getClass(), "type", 1745199030);
        setField(term5010, term5010.getClass(), "next", null);
        setField(term5010, term5010.getClass(), "first", term5004);
        setField(term5010, term5010.getClass(), "last", term4999);
        setField(term5010, term5010.getClass(), "propListHead", null);
        setIntField(term5010, term5010.getClass(), "sourcePosition", 0);
        setField(term5010, term5010.getClass(), "jsType", null);
        setField(term5010, term5010.getClass(), "parent", null);
        setField(term5008, term5008.getClass(), "next", term5010);
        setField(term5008, term5008.getClass(), "first", term4995);
        setField(term5008, term5008.getClass(), "last", term4995);
        setField(term5008, term5008.getClass(), "propListHead", null);
        setIntField(term5008, term5008.getClass(), "sourcePosition", 0);
        setField(term5008, term5008.getClass(), "jsType", null);
        setField(term5008, term5008.getClass(), "parent", null);
        setField(term4997, term4997.getClass(), "last", term5008);
        setField(term4997, term4997.getClass(), "propListHead", null);
        setIntField(term4997, term4997.getClass(), "sourcePosition", 0);
        setField(term4997, term4997.getClass(), "jsType", null);
        setField(term4997, term4997.getClass(), "parent", null);
        setField(term4995, term4995.getClass(), "next", term4997);
        setIntField(term5015, term5015.getClass(), "type", -1440013173);
        setField(term5015, term5015.getClass(), "next", term5008);
        setField(term5015, term5015.getClass(), "first", term5010);
        setField(term5015, term5015.getClass(), "last", term4993);
        setField(term5015, term5015.getClass(), "propListHead", null);
        setIntField(term5015, term5015.getClass(), "sourcePosition", 0);
        setField(term5015, term5015.getClass(), "jsType", null);
        setField(term5015, term5015.getClass(), "parent", null);
        setField(term4995, term4995.getClass(), "first", term5015);
        setField(term4995, term4995.getClass(), "last", term5015);
        setField(term4995, term4995.getClass(), "propListHead", null);
        setIntField(term4995, term4995.getClass(), "sourcePosition", 0);
        setField(term4995, term4995.getClass(), "jsType", null);
        setField(term4995, term4995.getClass(), "parent", null);
        setField(term4993, term4993.getClass(), "next", term4995);
        setField(term4993, term4993.getClass(), "first", term4999);
        setField(term4993, term4993.getClass(), "last", term5001);
        setField(term4993, term4993.getClass(), "propListHead", null);
        setIntField(term4993, term4993.getClass(), "sourcePosition", 0);
        setField(term4993, term4993.getClass(), "jsType", null);
        setField(term4993, term4993.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4993;
        try {
            callMethod(klass, "isExpressionResultUsed", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


