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

public class NodeUtil_getInfoForNameNode_2009241699208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3170;
     Object term17453;

    public NodeUtil_getInfoForNameNode_2009241699208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3183 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3193 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3170, term3170.getClass(), "type", 932810106);
        setIntField(term3172, term3172.getClass(), "type", -2024983877);
        setIntField(term3174, term3174.getClass(), "type", 0);
        setField(term3174, term3174.getClass(), "next", null);
        setField(term3174, term3174.getClass(), "first", null);
        setField(term3174, term3174.getClass(), "last", null);
        setField(term3174, term3174.getClass(), "propListHead", null);
        setIntField(term3174, term3174.getClass(), "sourcePosition", 0);
        setField(term3174, term3174.getClass(), "jsType", null);
        setField(term3174, term3174.getClass(), "parent", null);
        setField(term3172, term3172.getClass(), "next", term3174);
        setIntField(term3177, term3177.getClass(), "type", 0);
        setField(term3177, term3177.getClass(), "next", null);
        setField(term3177, term3177.getClass(), "first", null);
        setField(term3177, term3177.getClass(), "last", null);
        setField(term3177, term3177.getClass(), "propListHead", null);
        setIntField(term3177, term3177.getClass(), "sourcePosition", 0);
        setField(term3177, term3177.getClass(), "jsType", null);
        setField(term3177, term3177.getClass(), "parent", null);
        setField(term3172, term3172.getClass(), "first", term3177);
        setIntField(term3180, term3180.getClass(), "type", 0);
        setField(term3180, term3180.getClass(), "next", null);
        setField(term3180, term3180.getClass(), "first", null);
        setField(term3180, term3180.getClass(), "last", null);
        setField(term3180, term3180.getClass(), "propListHead", null);
        setIntField(term3180, term3180.getClass(), "sourcePosition", 0);
        setField(term3180, term3180.getClass(), "jsType", null);
        setField(term3180, term3180.getClass(), "parent", null);
        setField(term3172, term3172.getClass(), "last", term3180);
        setField(term3183, term3183.getClass(), "next", null);
        setIntField(term3183, term3183.getClass(), "type", 0);
        setIntField(term3183, term3183.getClass(), "intValue", 0);
        setField(term3183, term3183.getClass(), "objectValue", null);
        setField(term3172, term3172.getClass(), "propListHead", term3183);
        setIntField(term3172, term3172.getClass(), "sourcePosition", -132005524);
        setField(term3172, term3172.getClass(), "jsType", null);
        setField(term3172, term3172.getClass(), "parent", null);
        setField(term3170, term3170.getClass(), "next", term3172);
        setIntField(term3187, term3187.getClass(), "type", 0);
        setField(term3187, term3187.getClass(), "next", null);
        setField(term3187, term3187.getClass(), "first", null);
        setField(term3187, term3187.getClass(), "last", null);
        setField(term3187, term3187.getClass(), "propListHead", null);
        setIntField(term3187, term3187.getClass(), "sourcePosition", 0);
        setField(term3187, term3187.getClass(), "jsType", null);
        setField(term3187, term3187.getClass(), "parent", null);
        setField(term3170, term3170.getClass(), "first", term3187);
        setIntField(term3190, term3190.getClass(), "type", 0);
        setField(term3190, term3190.getClass(), "next", null);
        setField(term3190, term3190.getClass(), "first", null);
        setField(term3190, term3190.getClass(), "last", null);
        setField(term3190, term3190.getClass(), "propListHead", null);
        setIntField(term3190, term3190.getClass(), "sourcePosition", 0);
        setField(term3190, term3190.getClass(), "jsType", null);
        setField(term3190, term3190.getClass(), "parent", null);
        setField(term3170, term3170.getClass(), "last", term3190);
        setField(term3193, term3193.getClass(), "next", null);
        setIntField(term3193, term3193.getClass(), "type", 0);
        setIntField(term3193, term3193.getClass(), "intValue", 0);
        setField(term3193, term3193.getClass(), "objectValue", null);
        setField(term3170, term3170.getClass(), "propListHead", term3193);
        setIntField(term3170, term3170.getClass(), "sourcePosition", -1235127374);
        setField(term3170, term3170.getClass(), "jsType", null);
        setField(term3170, term3170.getClass(), "parent", null);
        term17453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17458 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17461 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17453, term17453.getClass(), "type", 932810106);
        setIntField(term17454, term17454.getClass(), "type", -2024983877);
        setIntField(term17455, term17455.getClass(), "type", 0);
        setField(term17455, term17455.getClass(), "next", null);
        setField(term17455, term17455.getClass(), "first", null);
        setField(term17455, term17455.getClass(), "last", null);
        setField(term17455, term17455.getClass(), "propListHead", null);
        setIntField(term17455, term17455.getClass(), "sourcePosition", 0);
        setField(term17455, term17455.getClass(), "jsType", null);
        setField(term17455, term17455.getClass(), "parent", null);
        setField(term17454, term17454.getClass(), "next", term17455);
        setIntField(term17456, term17456.getClass(), "type", 0);
        setField(term17456, term17456.getClass(), "next", null);
        setField(term17456, term17456.getClass(), "first", null);
        setField(term17456, term17456.getClass(), "last", null);
        setField(term17456, term17456.getClass(), "propListHead", null);
        setIntField(term17456, term17456.getClass(), "sourcePosition", 0);
        setField(term17456, term17456.getClass(), "jsType", null);
        setField(term17456, term17456.getClass(), "parent", null);
        setField(term17454, term17454.getClass(), "first", term17456);
        setIntField(term17457, term17457.getClass(), "type", 0);
        setField(term17457, term17457.getClass(), "next", null);
        setField(term17457, term17457.getClass(), "first", null);
        setField(term17457, term17457.getClass(), "last", null);
        setField(term17457, term17457.getClass(), "propListHead", null);
        setIntField(term17457, term17457.getClass(), "sourcePosition", 0);
        setField(term17457, term17457.getClass(), "jsType", null);
        setField(term17457, term17457.getClass(), "parent", null);
        setField(term17454, term17454.getClass(), "last", term17457);
        setField(term17458, term17458.getClass(), "next", null);
        setIntField(term17458, term17458.getClass(), "type", 0);
        setIntField(term17458, term17458.getClass(), "intValue", 0);
        setField(term17458, term17458.getClass(), "objectValue", null);
        setField(term17454, term17454.getClass(), "propListHead", term17458);
        setIntField(term17454, term17454.getClass(), "sourcePosition", -132005524);
        setField(term17454, term17454.getClass(), "jsType", null);
        setField(term17454, term17454.getClass(), "parent", null);
        setField(term17453, term17453.getClass(), "next", term17454);
        setIntField(term17459, term17459.getClass(), "type", 0);
        setField(term17459, term17459.getClass(), "next", null);
        setField(term17459, term17459.getClass(), "first", null);
        setField(term17459, term17459.getClass(), "last", null);
        setField(term17459, term17459.getClass(), "propListHead", null);
        setIntField(term17459, term17459.getClass(), "sourcePosition", 0);
        setField(term17459, term17459.getClass(), "jsType", null);
        setField(term17459, term17459.getClass(), "parent", null);
        setField(term17453, term17453.getClass(), "first", term17459);
        setIntField(term17460, term17460.getClass(), "type", 0);
        setField(term17460, term17460.getClass(), "next", null);
        setField(term17460, term17460.getClass(), "first", null);
        setField(term17460, term17460.getClass(), "last", null);
        setField(term17460, term17460.getClass(), "propListHead", null);
        setIntField(term17460, term17460.getClass(), "sourcePosition", 0);
        setField(term17460, term17460.getClass(), "jsType", null);
        setField(term17460, term17460.getClass(), "parent", null);
        setField(term17453, term17453.getClass(), "last", term17460);
        setField(term17461, term17461.getClass(), "next", null);
        setIntField(term17461, term17461.getClass(), "type", 0);
        setIntField(term17461, term17461.getClass(), "intValue", 0);
        setField(term17461, term17461.getClass(), "objectValue", null);
        setField(term17453, term17453.getClass(), "propListHead", term17461);
        setIntField(term17453, term17453.getClass(), "sourcePosition", -1235127374);
        setField(term17453, term17453.getClass(), "jsType", null);
        setField(term17453, term17453.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3170;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term3170, term17453));
        assertTrue(recursiveEquals(retValue, null));
    }

};


