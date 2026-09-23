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

public class NodeUtil_isImmutableValue_1118207454167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217;
     Object term6220;

    public NodeUtil_isImmutableValue_1118207454167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term217, term217.getClass(), "type", -1465035361);
        setIntField(term219, term219.getClass(), "type", 1114000454);
        setIntField(term221, term221.getClass(), "type", 0);
        setField(term221, term221.getClass(), "next", null);
        setField(term221, term221.getClass(), "first", null);
        setField(term221, term221.getClass(), "last", null);
        setField(term221, term221.getClass(), "propListHead", null);
        setIntField(term221, term221.getClass(), "sourcePosition", 0);
        setField(term221, term221.getClass(), "jsType", null);
        setField(term221, term221.getClass(), "parent", null);
        setField(term219, term219.getClass(), "next", term221);
        setIntField(term224, term224.getClass(), "type", 0);
        setField(term224, term224.getClass(), "next", null);
        setField(term224, term224.getClass(), "first", null);
        setField(term224, term224.getClass(), "last", null);
        setField(term224, term224.getClass(), "propListHead", null);
        setIntField(term224, term224.getClass(), "sourcePosition", 0);
        setField(term224, term224.getClass(), "jsType", null);
        setField(term224, term224.getClass(), "parent", null);
        setField(term219, term219.getClass(), "first", term224);
        setIntField(term227, term227.getClass(), "type", 0);
        setField(term227, term227.getClass(), "next", null);
        setField(term227, term227.getClass(), "first", null);
        setField(term227, term227.getClass(), "last", null);
        setField(term227, term227.getClass(), "propListHead", null);
        setIntField(term227, term227.getClass(), "sourcePosition", 0);
        setField(term227, term227.getClass(), "jsType", null);
        setField(term227, term227.getClass(), "parent", null);
        setField(term219, term219.getClass(), "last", term227);
        setField(term219, term219.getClass(), "propListHead", null);
        setIntField(term219, term219.getClass(), "sourcePosition", 0);
        setField(term219, term219.getClass(), "jsType", null);
        setField(term219, term219.getClass(), "parent", null);
        setField(term217, term217.getClass(), "next", term219);
        setIntField(term231, term231.getClass(), "type", 0);
        setField(term231, term231.getClass(), "next", null);
        setField(term231, term231.getClass(), "first", null);
        setField(term231, term231.getClass(), "last", null);
        setField(term231, term231.getClass(), "propListHead", null);
        setIntField(term231, term231.getClass(), "sourcePosition", 0);
        setField(term231, term231.getClass(), "jsType", null);
        setField(term231, term231.getClass(), "parent", null);
        setField(term217, term217.getClass(), "first", term231);
        setIntField(term234, term234.getClass(), "type", 0);
        setField(term234, term234.getClass(), "next", null);
        setField(term234, term234.getClass(), "first", null);
        setField(term234, term234.getClass(), "last", null);
        setField(term234, term234.getClass(), "propListHead", null);
        setIntField(term234, term234.getClass(), "sourcePosition", 0);
        setField(term234, term234.getClass(), "jsType", null);
        setField(term234, term234.getClass(), "parent", null);
        setField(term217, term217.getClass(), "last", term234);
        setField(term217, term217.getClass(), "propListHead", null);
        setIntField(term217, term217.getClass(), "sourcePosition", 0);
        setField(term217, term217.getClass(), "jsType", null);
        setField(term217, term217.getClass(), "parent", null);
        term6220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6220, term6220.getClass(), "type", -1465035361);
        setIntField(term6221, term6221.getClass(), "type", 1114000454);
        setIntField(term6222, term6222.getClass(), "type", 0);
        setField(term6222, term6222.getClass(), "next", null);
        setField(term6222, term6222.getClass(), "first", null);
        setField(term6222, term6222.getClass(), "last", null);
        setField(term6222, term6222.getClass(), "propListHead", null);
        setIntField(term6222, term6222.getClass(), "sourcePosition", 0);
        setField(term6222, term6222.getClass(), "jsType", null);
        setField(term6222, term6222.getClass(), "parent", null);
        setField(term6221, term6221.getClass(), "next", term6222);
        setIntField(term6223, term6223.getClass(), "type", 0);
        setField(term6223, term6223.getClass(), "next", null);
        setField(term6223, term6223.getClass(), "first", null);
        setField(term6223, term6223.getClass(), "last", null);
        setField(term6223, term6223.getClass(), "propListHead", null);
        setIntField(term6223, term6223.getClass(), "sourcePosition", 0);
        setField(term6223, term6223.getClass(), "jsType", null);
        setField(term6223, term6223.getClass(), "parent", null);
        setField(term6221, term6221.getClass(), "first", term6223);
        setIntField(term6224, term6224.getClass(), "type", 0);
        setField(term6224, term6224.getClass(), "next", null);
        setField(term6224, term6224.getClass(), "first", null);
        setField(term6224, term6224.getClass(), "last", null);
        setField(term6224, term6224.getClass(), "propListHead", null);
        setIntField(term6224, term6224.getClass(), "sourcePosition", 0);
        setField(term6224, term6224.getClass(), "jsType", null);
        setField(term6224, term6224.getClass(), "parent", null);
        setField(term6221, term6221.getClass(), "last", term6224);
        setField(term6221, term6221.getClass(), "propListHead", null);
        setIntField(term6221, term6221.getClass(), "sourcePosition", 0);
        setField(term6221, term6221.getClass(), "jsType", null);
        setField(term6221, term6221.getClass(), "parent", null);
        setField(term6220, term6220.getClass(), "next", term6221);
        setIntField(term6225, term6225.getClass(), "type", 0);
        setField(term6225, term6225.getClass(), "next", null);
        setField(term6225, term6225.getClass(), "first", null);
        setField(term6225, term6225.getClass(), "last", null);
        setField(term6225, term6225.getClass(), "propListHead", null);
        setIntField(term6225, term6225.getClass(), "sourcePosition", 0);
        setField(term6225, term6225.getClass(), "jsType", null);
        setField(term6225, term6225.getClass(), "parent", null);
        setField(term6220, term6220.getClass(), "first", term6225);
        setIntField(term6226, term6226.getClass(), "type", 0);
        setField(term6226, term6226.getClass(), "next", null);
        setField(term6226, term6226.getClass(), "first", null);
        setField(term6226, term6226.getClass(), "last", null);
        setField(term6226, term6226.getClass(), "propListHead", null);
        setIntField(term6226, term6226.getClass(), "sourcePosition", 0);
        setField(term6226, term6226.getClass(), "jsType", null);
        setField(term6226, term6226.getClass(), "parent", null);
        setField(term6220, term6220.getClass(), "last", term6226);
        setField(term6220, term6220.getClass(), "propListHead", null);
        setIntField(term6220, term6220.getClass(), "sourcePosition", 0);
        setField(term6220, term6220.getClass(), "jsType", null);
        setField(term6220, term6220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term217;
        Object retValue = callMethod(klass, "isImmutableValue", argTypes, null, args);
        assertTrue(recursiveEquals(term217, term6220));
        assertTrue(recursiveEquals(retValue, false));
    }

};


