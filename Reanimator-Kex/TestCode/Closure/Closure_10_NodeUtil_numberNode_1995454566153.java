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
import java.lang.Double;
import java.lang.Object;

public class NodeUtil_numberNode_1995454566153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4368;
     Object term4370;

    public NodeUtil_numberNode_1995454566153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4368 = new Double(0.3455959125047594);
        term4370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4370, term4370.getClass(), "type", -1049546692);
        setIntField(term4372, term4372.getClass(), "type", 1397781598);
        setIntField(term4374, term4374.getClass(), "type", -44720365);
        setIntField(term4376, term4376.getClass(), "type", 1963632911);
        setIntField(term4378, term4378.getClass(), "type", -1100497683);
        setField(term4378, term4378.getClass(), "next", null);
        setField(term4378, term4378.getClass(), "first", null);
        setField(term4378, term4378.getClass(), "last", null);
        setField(term4378, term4378.getClass(), "propListHead", null);
        setIntField(term4378, term4378.getClass(), "sourcePosition", 0);
        setField(term4378, term4378.getClass(), "jsType", null);
        setField(term4378, term4378.getClass(), "parent", null);
        setField(term4376, term4376.getClass(), "next", term4378);
        setIntField(term4381, term4381.getClass(), "type", 155423433);
        setField(term4381, term4381.getClass(), "next", null);
        setField(term4381, term4381.getClass(), "first", null);
        setField(term4381, term4381.getClass(), "last", term4378);
        setField(term4381, term4381.getClass(), "propListHead", null);
        setIntField(term4381, term4381.getClass(), "sourcePosition", 0);
        setField(term4381, term4381.getClass(), "jsType", null);
        setField(term4381, term4381.getClass(), "parent", null);
        setField(term4376, term4376.getClass(), "first", term4381);
        setField(term4376, term4376.getClass(), "last", term4374);
        setField(term4376, term4376.getClass(), "propListHead", null);
        setIntField(term4376, term4376.getClass(), "sourcePosition", 0);
        setField(term4376, term4376.getClass(), "jsType", null);
        setField(term4376, term4376.getClass(), "parent", null);
        setField(term4374, term4374.getClass(), "next", term4376);
        setField(term4374, term4374.getClass(), "first", term4378);
        setIntField(term4385, term4385.getClass(), "type", -1469668708);
        setIntField(term4387, term4387.getClass(), "type", 1796950482);
        setField(term4387, term4387.getClass(), "next", null);
        setField(term4387, term4387.getClass(), "first", term4381);
        setField(term4387, term4387.getClass(), "last", term4376);
        setField(term4387, term4387.getClass(), "propListHead", null);
        setIntField(term4387, term4387.getClass(), "sourcePosition", 0);
        setField(term4387, term4387.getClass(), "jsType", null);
        setField(term4387, term4387.getClass(), "parent", null);
        setField(term4385, term4385.getClass(), "next", term4387);
        setField(term4385, term4385.getClass(), "first", term4372);
        setField(term4385, term4385.getClass(), "last", term4372);
        setField(term4385, term4385.getClass(), "propListHead", null);
        setIntField(term4385, term4385.getClass(), "sourcePosition", 0);
        setField(term4385, term4385.getClass(), "jsType", null);
        setField(term4385, term4385.getClass(), "parent", null);
        setField(term4374, term4374.getClass(), "last", term4385);
        setField(term4374, term4374.getClass(), "propListHead", null);
        setIntField(term4374, term4374.getClass(), "sourcePosition", 0);
        setField(term4374, term4374.getClass(), "jsType", null);
        setField(term4374, term4374.getClass(), "parent", null);
        setField(term4372, term4372.getClass(), "next", term4374);
        setIntField(term4392, term4392.getClass(), "type", -945759470);
        setField(term4392, term4392.getClass(), "next", term4385);
        setField(term4392, term4392.getClass(), "first", term4387);
        setField(term4392, term4392.getClass(), "last", term4370);
        setField(term4392, term4392.getClass(), "propListHead", null);
        setIntField(term4392, term4392.getClass(), "sourcePosition", 0);
        setField(term4392, term4392.getClass(), "jsType", null);
        setField(term4392, term4392.getClass(), "parent", null);
        setField(term4372, term4372.getClass(), "first", term4392);
        setField(term4372, term4372.getClass(), "last", term4392);
        setField(term4372, term4372.getClass(), "propListHead", null);
        setIntField(term4372, term4372.getClass(), "sourcePosition", 0);
        setField(term4372, term4372.getClass(), "jsType", null);
        setField(term4372, term4372.getClass(), "parent", null);
        setField(term4370, term4370.getClass(), "next", term4372);
        setField(term4370, term4370.getClass(), "first", term4376);
        setField(term4370, term4370.getClass(), "last", term4378);
        setField(term4370, term4370.getClass(), "propListHead", null);
        setIntField(term4370, term4370.getClass(), "sourcePosition", 0);
        setField(term4370, term4370.getClass(), "jsType", null);
        setField(term4370, term4370.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term4368;
        args[1] = term4370;
        callMethod(klass, "numberNode", argTypes, null, args);
    }

};


