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

public class MustBeReachingVariableDef_computeMustDef_1796935056104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27986;
     Object term28078;
     Object term29011;
     Object term29012;

    public MustBeReachingVariableDef_computeMustDef_1796935056104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27986 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term28078 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28170 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term28078, term28078.getClass(), "type", 1265463001);
        setIntField(term28170, term28170.getClass(), "type", -2027534003);
        setIntField(term28262, term28262.getClass(), "type", 1375330971);
        setField(term28262, term28262.getClass(), "first", null);
        setField(term28262, term28262.getClass(), "next", null);
        setField(term28170, term28170.getClass(), "first", term28262);
        setIntField(term28354, term28354.getClass(), "type", 110);
        setField(term28170, term28170.getClass(), "next", term28354);
        setField(term28078, term28078.getClass(), "first", term28170);
        term29011 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term29011, term29011.getClass(), "jsScope", null);
        setField(term29011, term29011.getClass(), "compiler", null);
        setField(term29011, term29011.getClass(), "escaped", null);
        setField(term29011, term29011.getClass(), "cfg", null);
        setField(term29011, term29011.getClass(), "joinOp", null);
        setField(term29011, term29011.getClass(), "orderedWorkSet", null);
        term29012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29013 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29015 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term29012, term29012.getClass(), "str", null);
        setIntField(term29012, term29012.getClass(), "type", 1265463001);
        setField(term29012, term29012.getClass(), "next", null);
        setField(term29013, term29013.getClass(), "str", null);
        setIntField(term29013, term29013.getClass(), "type", -2027534003);
        setField(term29014, term29014.getClass(), "str", null);
        setIntField(term29014, term29014.getClass(), "type", 110);
        setField(term29014, term29014.getClass(), "next", null);
        setField(term29014, term29014.getClass(), "first", null);
        setField(term29014, term29014.getClass(), "last", null);
        setField(term29014, term29014.getClass(), "propListHead", null);
        setIntField(term29014, term29014.getClass(), "sourcePosition", 0);
        setField(term29014, term29014.getClass(), "jsType", null);
        setField(term29014, term29014.getClass(), "parent", null);
        setField(term29013, term29013.getClass(), "next", term29014);
        setField(term29015, term29015.getClass(), "str", null);
        setIntField(term29015, term29015.getClass(), "type", 1375330971);
        setField(term29015, term29015.getClass(), "next", null);
        setField(term29015, term29015.getClass(), "first", null);
        setField(term29015, term29015.getClass(), "last", null);
        setField(term29015, term29015.getClass(), "propListHead", null);
        setIntField(term29015, term29015.getClass(), "sourcePosition", 0);
        setField(term29015, term29015.getClass(), "jsType", null);
        setField(term29015, term29015.getClass(), "parent", null);
        setField(term29013, term29013.getClass(), "first", term29015);
        setField(term29013, term29013.getClass(), "last", null);
        setField(term29013, term29013.getClass(), "propListHead", null);
        setIntField(term29013, term29013.getClass(), "sourcePosition", 0);
        setField(term29013, term29013.getClass(), "jsType", null);
        setField(term29013, term29013.getClass(), "parent", null);
        setField(term29012, term29012.getClass(), "first", term29013);
        setField(term29012, term29012.getClass(), "last", null);
        setField(term29012, term29012.getClass(), "propListHead", null);
        setIntField(term29012, term29012.getClass(), "sourcePosition", 0);
        setField(term29012, term29012.getClass(), "jsType", null);
        setField(term29012, term29012.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term28078;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term27986, args);
        assertTrue(recursiveEquals(term27986, term29011));
        assertTrue(recursiveEquals(term28078, term29012));
    }

};


