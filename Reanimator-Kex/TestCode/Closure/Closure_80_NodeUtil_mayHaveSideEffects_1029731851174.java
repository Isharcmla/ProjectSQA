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

public class NodeUtil_mayHaveSideEffects_1029731851174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534;
     Object term7496;

    public NodeUtil_mayHaveSideEffects_1029731851174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term534, term534.getClass(), "type", -165587447);
        setIntField(term536, term536.getClass(), "type", -749861210);
        setIntField(term538, term538.getClass(), "type", 0);
        setField(term538, term538.getClass(), "next", null);
        setField(term538, term538.getClass(), "first", null);
        setField(term538, term538.getClass(), "last", null);
        setField(term538, term538.getClass(), "propListHead", null);
        setIntField(term538, term538.getClass(), "sourcePosition", 0);
        setField(term538, term538.getClass(), "jsType", null);
        setField(term538, term538.getClass(), "parent", null);
        setField(term536, term536.getClass(), "next", term538);
        setIntField(term541, term541.getClass(), "type", 0);
        setField(term541, term541.getClass(), "next", null);
        setField(term541, term541.getClass(), "first", null);
        setField(term541, term541.getClass(), "last", null);
        setField(term541, term541.getClass(), "propListHead", null);
        setIntField(term541, term541.getClass(), "sourcePosition", 0);
        setField(term541, term541.getClass(), "jsType", null);
        setField(term541, term541.getClass(), "parent", null);
        setField(term536, term536.getClass(), "first", term541);
        setIntField(term544, term544.getClass(), "type", 0);
        setField(term544, term544.getClass(), "next", null);
        setField(term544, term544.getClass(), "first", null);
        setField(term544, term544.getClass(), "last", null);
        setField(term544, term544.getClass(), "propListHead", null);
        setIntField(term544, term544.getClass(), "sourcePosition", 0);
        setField(term544, term544.getClass(), "jsType", null);
        setField(term544, term544.getClass(), "parent", null);
        setField(term536, term536.getClass(), "last", term544);
        setField(term547, term547.getClass(), "next", null);
        setIntField(term547, term547.getClass(), "type", 0);
        setIntField(term547, term547.getClass(), "intValue", 0);
        setField(term547, term547.getClass(), "objectValue", null);
        setField(term536, term536.getClass(), "propListHead", term547);
        setIntField(term536, term536.getClass(), "sourcePosition", -916584829);
        setField(term536, term536.getClass(), "jsType", null);
        setField(term536, term536.getClass(), "parent", null);
        setField(term534, term534.getClass(), "next", term536);
        setIntField(term551, term551.getClass(), "type", 0);
        setField(term551, term551.getClass(), "next", null);
        setField(term551, term551.getClass(), "first", null);
        setField(term551, term551.getClass(), "last", null);
        setField(term551, term551.getClass(), "propListHead", null);
        setIntField(term551, term551.getClass(), "sourcePosition", 0);
        setField(term551, term551.getClass(), "jsType", null);
        setField(term551, term551.getClass(), "parent", null);
        setField(term534, term534.getClass(), "first", term551);
        setIntField(term554, term554.getClass(), "type", 0);
        setField(term554, term554.getClass(), "next", null);
        setField(term554, term554.getClass(), "first", null);
        setField(term554, term554.getClass(), "last", null);
        setField(term554, term554.getClass(), "propListHead", null);
        setIntField(term554, term554.getClass(), "sourcePosition", 0);
        setField(term554, term554.getClass(), "jsType", null);
        setField(term554, term554.getClass(), "parent", null);
        setField(term534, term534.getClass(), "last", term554);
        setField(term557, term557.getClass(), "next", null);
        setIntField(term557, term557.getClass(), "type", 0);
        setIntField(term557, term557.getClass(), "intValue", 0);
        setField(term557, term557.getClass(), "objectValue", null);
        setField(term534, term534.getClass(), "propListHead", term557);
        setIntField(term534, term534.getClass(), "sourcePosition", -2131181468);
        setField(term534, term534.getClass(), "jsType", null);
        setField(term534, term534.getClass(), "parent", null);
        term7496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7501 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7504 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7496, term7496.getClass(), "type", -165587447);
        setIntField(term7497, term7497.getClass(), "type", -749861210);
        setIntField(term7498, term7498.getClass(), "type", 0);
        setField(term7498, term7498.getClass(), "next", null);
        setField(term7498, term7498.getClass(), "first", null);
        setField(term7498, term7498.getClass(), "last", null);
        setField(term7498, term7498.getClass(), "propListHead", null);
        setIntField(term7498, term7498.getClass(), "sourcePosition", 0);
        setField(term7498, term7498.getClass(), "jsType", null);
        setField(term7498, term7498.getClass(), "parent", null);
        setField(term7497, term7497.getClass(), "next", term7498);
        setIntField(term7499, term7499.getClass(), "type", 0);
        setField(term7499, term7499.getClass(), "next", null);
        setField(term7499, term7499.getClass(), "first", null);
        setField(term7499, term7499.getClass(), "last", null);
        setField(term7499, term7499.getClass(), "propListHead", null);
        setIntField(term7499, term7499.getClass(), "sourcePosition", 0);
        setField(term7499, term7499.getClass(), "jsType", null);
        setField(term7499, term7499.getClass(), "parent", null);
        setField(term7497, term7497.getClass(), "first", term7499);
        setIntField(term7500, term7500.getClass(), "type", 0);
        setField(term7500, term7500.getClass(), "next", null);
        setField(term7500, term7500.getClass(), "first", null);
        setField(term7500, term7500.getClass(), "last", null);
        setField(term7500, term7500.getClass(), "propListHead", null);
        setIntField(term7500, term7500.getClass(), "sourcePosition", 0);
        setField(term7500, term7500.getClass(), "jsType", null);
        setField(term7500, term7500.getClass(), "parent", null);
        setField(term7497, term7497.getClass(), "last", term7500);
        setField(term7501, term7501.getClass(), "next", null);
        setIntField(term7501, term7501.getClass(), "type", 0);
        setIntField(term7501, term7501.getClass(), "intValue", 0);
        setField(term7501, term7501.getClass(), "objectValue", null);
        setField(term7497, term7497.getClass(), "propListHead", term7501);
        setIntField(term7497, term7497.getClass(), "sourcePosition", -916584829);
        setField(term7497, term7497.getClass(), "jsType", null);
        setField(term7497, term7497.getClass(), "parent", null);
        setField(term7496, term7496.getClass(), "next", term7497);
        setIntField(term7502, term7502.getClass(), "type", 0);
        setField(term7502, term7502.getClass(), "next", null);
        setField(term7502, term7502.getClass(), "first", null);
        setField(term7502, term7502.getClass(), "last", null);
        setField(term7502, term7502.getClass(), "propListHead", null);
        setIntField(term7502, term7502.getClass(), "sourcePosition", 0);
        setField(term7502, term7502.getClass(), "jsType", null);
        setField(term7502, term7502.getClass(), "parent", null);
        setField(term7496, term7496.getClass(), "first", term7502);
        setIntField(term7503, term7503.getClass(), "type", 0);
        setField(term7503, term7503.getClass(), "next", null);
        setField(term7503, term7503.getClass(), "first", null);
        setField(term7503, term7503.getClass(), "last", null);
        setField(term7503, term7503.getClass(), "propListHead", null);
        setIntField(term7503, term7503.getClass(), "sourcePosition", 0);
        setField(term7503, term7503.getClass(), "jsType", null);
        setField(term7503, term7503.getClass(), "parent", null);
        setField(term7496, term7496.getClass(), "last", term7503);
        setField(term7504, term7504.getClass(), "next", null);
        setIntField(term7504, term7504.getClass(), "type", 0);
        setIntField(term7504, term7504.getClass(), "intValue", 0);
        setField(term7504, term7504.getClass(), "objectValue", null);
        setField(term7496, term7496.getClass(), "propListHead", term7504);
        setIntField(term7496, term7496.getClass(), "sourcePosition", -2131181468);
        setField(term7496, term7496.getClass(), "jsType", null);
        setField(term7496, term7496.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term534;
        args[1] = null;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term534, term7496));
    }

};


