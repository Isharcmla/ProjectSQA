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
import java.lang.Boolean;

public class NodeUtil_isLiteralValue_918619071168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238;
     Object term259;
     Object term6254;

    public NodeUtil_isLiteralValue_918619071168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term238, term238.getClass(), "type", 941650513);
        setIntField(term240, term240.getClass(), "type", -894662986);
        setIntField(term242, term242.getClass(), "type", 0);
        setField(term242, term242.getClass(), "next", null);
        setField(term242, term242.getClass(), "first", null);
        setField(term242, term242.getClass(), "last", null);
        setField(term242, term242.getClass(), "propListHead", null);
        setIntField(term242, term242.getClass(), "sourcePosition", 0);
        setField(term242, term242.getClass(), "jsType", null);
        setField(term242, term242.getClass(), "parent", null);
        setField(term240, term240.getClass(), "next", term242);
        setIntField(term245, term245.getClass(), "type", 0);
        setField(term245, term245.getClass(), "next", null);
        setField(term245, term245.getClass(), "first", null);
        setField(term245, term245.getClass(), "last", null);
        setField(term245, term245.getClass(), "propListHead", null);
        setIntField(term245, term245.getClass(), "sourcePosition", 0);
        setField(term245, term245.getClass(), "jsType", null);
        setField(term245, term245.getClass(), "parent", null);
        setField(term240, term240.getClass(), "first", term245);
        setIntField(term248, term248.getClass(), "type", 0);
        setField(term248, term248.getClass(), "next", null);
        setField(term248, term248.getClass(), "first", null);
        setField(term248, term248.getClass(), "last", null);
        setField(term248, term248.getClass(), "propListHead", null);
        setIntField(term248, term248.getClass(), "sourcePosition", 0);
        setField(term248, term248.getClass(), "jsType", null);
        setField(term248, term248.getClass(), "parent", null);
        setField(term240, term240.getClass(), "last", term248);
        setField(term240, term240.getClass(), "propListHead", null);
        setIntField(term240, term240.getClass(), "sourcePosition", 0);
        setField(term240, term240.getClass(), "jsType", null);
        setField(term240, term240.getClass(), "parent", null);
        setField(term238, term238.getClass(), "next", term240);
        setIntField(term252, term252.getClass(), "type", 0);
        setField(term252, term252.getClass(), "next", null);
        setField(term252, term252.getClass(), "first", null);
        setField(term252, term252.getClass(), "last", null);
        setField(term252, term252.getClass(), "propListHead", null);
        setIntField(term252, term252.getClass(), "sourcePosition", 0);
        setField(term252, term252.getClass(), "jsType", null);
        setField(term252, term252.getClass(), "parent", null);
        setField(term238, term238.getClass(), "first", term252);
        setIntField(term255, term255.getClass(), "type", 0);
        setField(term255, term255.getClass(), "next", null);
        setField(term255, term255.getClass(), "first", null);
        setField(term255, term255.getClass(), "last", null);
        setField(term255, term255.getClass(), "propListHead", null);
        setIntField(term255, term255.getClass(), "sourcePosition", 0);
        setField(term255, term255.getClass(), "jsType", null);
        setField(term255, term255.getClass(), "parent", null);
        setField(term238, term238.getClass(), "last", term255);
        setField(term238, term238.getClass(), "propListHead", null);
        setIntField(term238, term238.getClass(), "sourcePosition", 0);
        setField(term238, term238.getClass(), "jsType", null);
        setField(term238, term238.getClass(), "parent", null);
        term259 = new Boolean(false);
        term6254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6254, term6254.getClass(), "type", 941650513);
        setIntField(term6255, term6255.getClass(), "type", -894662986);
        setIntField(term6256, term6256.getClass(), "type", 0);
        setField(term6256, term6256.getClass(), "next", null);
        setField(term6256, term6256.getClass(), "first", null);
        setField(term6256, term6256.getClass(), "last", null);
        setField(term6256, term6256.getClass(), "propListHead", null);
        setIntField(term6256, term6256.getClass(), "sourcePosition", 0);
        setField(term6256, term6256.getClass(), "jsType", null);
        setField(term6256, term6256.getClass(), "parent", null);
        setField(term6255, term6255.getClass(), "next", term6256);
        setIntField(term6257, term6257.getClass(), "type", 0);
        setField(term6257, term6257.getClass(), "next", null);
        setField(term6257, term6257.getClass(), "first", null);
        setField(term6257, term6257.getClass(), "last", null);
        setField(term6257, term6257.getClass(), "propListHead", null);
        setIntField(term6257, term6257.getClass(), "sourcePosition", 0);
        setField(term6257, term6257.getClass(), "jsType", null);
        setField(term6257, term6257.getClass(), "parent", null);
        setField(term6255, term6255.getClass(), "first", term6257);
        setIntField(term6258, term6258.getClass(), "type", 0);
        setField(term6258, term6258.getClass(), "next", null);
        setField(term6258, term6258.getClass(), "first", null);
        setField(term6258, term6258.getClass(), "last", null);
        setField(term6258, term6258.getClass(), "propListHead", null);
        setIntField(term6258, term6258.getClass(), "sourcePosition", 0);
        setField(term6258, term6258.getClass(), "jsType", null);
        setField(term6258, term6258.getClass(), "parent", null);
        setField(term6255, term6255.getClass(), "last", term6258);
        setField(term6255, term6255.getClass(), "propListHead", null);
        setIntField(term6255, term6255.getClass(), "sourcePosition", 0);
        setField(term6255, term6255.getClass(), "jsType", null);
        setField(term6255, term6255.getClass(), "parent", null);
        setField(term6254, term6254.getClass(), "next", term6255);
        setIntField(term6259, term6259.getClass(), "type", 0);
        setField(term6259, term6259.getClass(), "next", null);
        setField(term6259, term6259.getClass(), "first", null);
        setField(term6259, term6259.getClass(), "last", null);
        setField(term6259, term6259.getClass(), "propListHead", null);
        setIntField(term6259, term6259.getClass(), "sourcePosition", 0);
        setField(term6259, term6259.getClass(), "jsType", null);
        setField(term6259, term6259.getClass(), "parent", null);
        setField(term6254, term6254.getClass(), "first", term6259);
        setIntField(term6260, term6260.getClass(), "type", 0);
        setField(term6260, term6260.getClass(), "next", null);
        setField(term6260, term6260.getClass(), "first", null);
        setField(term6260, term6260.getClass(), "last", null);
        setField(term6260, term6260.getClass(), "propListHead", null);
        setIntField(term6260, term6260.getClass(), "sourcePosition", 0);
        setField(term6260, term6260.getClass(), "jsType", null);
        setField(term6260, term6260.getClass(), "parent", null);
        setField(term6254, term6254.getClass(), "last", term6260);
        setField(term6254, term6254.getClass(), "propListHead", null);
        setIntField(term6254, term6254.getClass(), "sourcePosition", 0);
        setField(term6254, term6254.getClass(), "jsType", null);
        setField(term6254, term6254.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term238;
        args[1] = term259;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term238, term6254));
        assertTrue(recursiveEquals(term259, false));
        assertTrue(recursiveEquals(retValue, false));
    }

};


