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

public class NodeUtil_allArgsUnescapedLocal_847069128200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864;

    public NodeUtil_allArgsUnescapedLocal_847069128200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term864, term864.getClass(), "type", 1166710220);
        setIntField(term866, term866.getClass(), "type", -1070592289);
        setIntField(term868, term868.getClass(), "type", -1464172784);
        setIntField(term870, term870.getClass(), "type", 32185364);
        setIntField(term872, term872.getClass(), "type", 1768204942);
        setField(term872, term872.getClass(), "next", null);
        setField(term872, term872.getClass(), "first", null);
        setField(term872, term872.getClass(), "last", null);
        setField(term872, term872.getClass(), "propListHead", null);
        setIntField(term872, term872.getClass(), "sourcePosition", 0);
        setField(term872, term872.getClass(), "jsType", null);
        setField(term872, term872.getClass(), "parent", null);
        setField(term870, term870.getClass(), "next", term872);
        setIntField(term875, term875.getClass(), "type", 1252951645);
        setField(term875, term875.getClass(), "next", null);
        setField(term875, term875.getClass(), "first", null);
        setField(term875, term875.getClass(), "last", term872);
        setField(term875, term875.getClass(), "propListHead", null);
        setIntField(term875, term875.getClass(), "sourcePosition", 0);
        setField(term875, term875.getClass(), "jsType", null);
        setField(term875, term875.getClass(), "parent", null);
        setField(term870, term870.getClass(), "first", term875);
        setField(term870, term870.getClass(), "last", term868);
        setField(term870, term870.getClass(), "propListHead", null);
        setIntField(term870, term870.getClass(), "sourcePosition", 0);
        setField(term870, term870.getClass(), "jsType", null);
        setField(term870, term870.getClass(), "parent", null);
        setField(term868, term868.getClass(), "next", term870);
        setField(term868, term868.getClass(), "first", term872);
        setIntField(term879, term879.getClass(), "type", -310528004);
        setIntField(term881, term881.getClass(), "type", -634976996);
        setField(term881, term881.getClass(), "next", null);
        setField(term881, term881.getClass(), "first", term875);
        setField(term881, term881.getClass(), "last", term870);
        setField(term881, term881.getClass(), "propListHead", null);
        setIntField(term881, term881.getClass(), "sourcePosition", 0);
        setField(term881, term881.getClass(), "jsType", null);
        setField(term881, term881.getClass(), "parent", null);
        setField(term879, term879.getClass(), "next", term881);
        setField(term879, term879.getClass(), "first", term866);
        setField(term879, term879.getClass(), "last", term866);
        setField(term879, term879.getClass(), "propListHead", null);
        setIntField(term879, term879.getClass(), "sourcePosition", 0);
        setField(term879, term879.getClass(), "jsType", null);
        setField(term879, term879.getClass(), "parent", null);
        setField(term868, term868.getClass(), "last", term879);
        setField(term868, term868.getClass(), "propListHead", null);
        setIntField(term868, term868.getClass(), "sourcePosition", 0);
        setField(term868, term868.getClass(), "jsType", null);
        setField(term868, term868.getClass(), "parent", null);
        setField(term866, term866.getClass(), "next", term868);
        setIntField(term886, term886.getClass(), "type", -1015274146);
        setField(term886, term886.getClass(), "next", term879);
        setField(term886, term886.getClass(), "first", term881);
        setField(term886, term886.getClass(), "last", term864);
        setField(term886, term886.getClass(), "propListHead", null);
        setIntField(term886, term886.getClass(), "sourcePosition", 0);
        setField(term886, term886.getClass(), "jsType", null);
        setField(term886, term886.getClass(), "parent", null);
        setField(term866, term866.getClass(), "first", term886);
        setField(term866, term866.getClass(), "last", term886);
        setField(term866, term866.getClass(), "propListHead", null);
        setIntField(term866, term866.getClass(), "sourcePosition", 0);
        setField(term866, term866.getClass(), "jsType", null);
        setField(term866, term866.getClass(), "parent", null);
        setField(term864, term864.getClass(), "next", term866);
        setField(term864, term864.getClass(), "first", term870);
        setField(term864, term864.getClass(), "last", term872);
        setField(term864, term864.getClass(), "propListHead", null);
        setIntField(term864, term864.getClass(), "sourcePosition", 0);
        setField(term864, term864.getClass(), "jsType", null);
        setField(term864, term864.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term864;
        try {
            callMethod(klass, "allArgsUnescapedLocal", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


