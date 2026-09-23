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

public class NodeUtil_isExpressionNode_1382466317127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term6058;

    public NodeUtil_isExpressionNode_1382466317127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term584 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term594 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term571, term571.getClass(), "type", -1122880881);
        setIntField(term573, term573.getClass(), "type", -1692331299);
        setIntField(term575, term575.getClass(), "type", 0);
        setField(term575, term575.getClass(), "next", null);
        setField(term575, term575.getClass(), "first", null);
        setField(term575, term575.getClass(), "last", null);
        setField(term575, term575.getClass(), "propListHead", null);
        setIntField(term575, term575.getClass(), "sourcePosition", 0);
        setField(term575, term575.getClass(), "jsType", null);
        setField(term575, term575.getClass(), "parent", null);
        setField(term573, term573.getClass(), "next", term575);
        setIntField(term578, term578.getClass(), "type", 0);
        setField(term578, term578.getClass(), "next", null);
        setField(term578, term578.getClass(), "first", null);
        setField(term578, term578.getClass(), "last", null);
        setField(term578, term578.getClass(), "propListHead", null);
        setIntField(term578, term578.getClass(), "sourcePosition", 0);
        setField(term578, term578.getClass(), "jsType", null);
        setField(term578, term578.getClass(), "parent", null);
        setField(term573, term573.getClass(), "first", term578);
        setIntField(term581, term581.getClass(), "type", 0);
        setField(term581, term581.getClass(), "next", null);
        setField(term581, term581.getClass(), "first", null);
        setField(term581, term581.getClass(), "last", null);
        setField(term581, term581.getClass(), "propListHead", null);
        setIntField(term581, term581.getClass(), "sourcePosition", 0);
        setField(term581, term581.getClass(), "jsType", null);
        setField(term581, term581.getClass(), "parent", null);
        setField(term573, term573.getClass(), "last", term581);
        setField(term584, term584.getClass(), "next", null);
        setIntField(term584, term584.getClass(), "type", 0);
        setIntField(term584, term584.getClass(), "intValue", 0);
        setField(term584, term584.getClass(), "objectValue", null);
        setField(term573, term573.getClass(), "propListHead", term584);
        setIntField(term573, term573.getClass(), "sourcePosition", -130649791);
        setField(term573, term573.getClass(), "jsType", null);
        setField(term573, term573.getClass(), "parent", null);
        setField(term571, term571.getClass(), "next", term573);
        setIntField(term588, term588.getClass(), "type", 0);
        setField(term588, term588.getClass(), "next", null);
        setField(term588, term588.getClass(), "first", null);
        setField(term588, term588.getClass(), "last", null);
        setField(term588, term588.getClass(), "propListHead", null);
        setIntField(term588, term588.getClass(), "sourcePosition", 0);
        setField(term588, term588.getClass(), "jsType", null);
        setField(term588, term588.getClass(), "parent", null);
        setField(term571, term571.getClass(), "first", term588);
        setIntField(term591, term591.getClass(), "type", 0);
        setField(term591, term591.getClass(), "next", null);
        setField(term591, term591.getClass(), "first", null);
        setField(term591, term591.getClass(), "last", null);
        setField(term591, term591.getClass(), "propListHead", null);
        setIntField(term591, term591.getClass(), "sourcePosition", 0);
        setField(term591, term591.getClass(), "jsType", null);
        setField(term591, term591.getClass(), "parent", null);
        setField(term571, term571.getClass(), "last", term591);
        setField(term594, term594.getClass(), "next", null);
        setIntField(term594, term594.getClass(), "type", 0);
        setIntField(term594, term594.getClass(), "intValue", 0);
        setField(term594, term594.getClass(), "objectValue", null);
        setField(term571, term571.getClass(), "propListHead", term594);
        setIntField(term571, term571.getClass(), "sourcePosition", 534834644);
        setField(term571, term571.getClass(), "jsType", null);
        setField(term571, term571.getClass(), "parent", null);
        term6058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6063 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6066 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6058, term6058.getClass(), "type", -1122880881);
        setIntField(term6059, term6059.getClass(), "type", -1692331299);
        setIntField(term6060, term6060.getClass(), "type", 0);
        setField(term6060, term6060.getClass(), "next", null);
        setField(term6060, term6060.getClass(), "first", null);
        setField(term6060, term6060.getClass(), "last", null);
        setField(term6060, term6060.getClass(), "propListHead", null);
        setIntField(term6060, term6060.getClass(), "sourcePosition", 0);
        setField(term6060, term6060.getClass(), "jsType", null);
        setField(term6060, term6060.getClass(), "parent", null);
        setField(term6059, term6059.getClass(), "next", term6060);
        setIntField(term6061, term6061.getClass(), "type", 0);
        setField(term6061, term6061.getClass(), "next", null);
        setField(term6061, term6061.getClass(), "first", null);
        setField(term6061, term6061.getClass(), "last", null);
        setField(term6061, term6061.getClass(), "propListHead", null);
        setIntField(term6061, term6061.getClass(), "sourcePosition", 0);
        setField(term6061, term6061.getClass(), "jsType", null);
        setField(term6061, term6061.getClass(), "parent", null);
        setField(term6059, term6059.getClass(), "first", term6061);
        setIntField(term6062, term6062.getClass(), "type", 0);
        setField(term6062, term6062.getClass(), "next", null);
        setField(term6062, term6062.getClass(), "first", null);
        setField(term6062, term6062.getClass(), "last", null);
        setField(term6062, term6062.getClass(), "propListHead", null);
        setIntField(term6062, term6062.getClass(), "sourcePosition", 0);
        setField(term6062, term6062.getClass(), "jsType", null);
        setField(term6062, term6062.getClass(), "parent", null);
        setField(term6059, term6059.getClass(), "last", term6062);
        setField(term6063, term6063.getClass(), "next", null);
        setIntField(term6063, term6063.getClass(), "type", 0);
        setIntField(term6063, term6063.getClass(), "intValue", 0);
        setField(term6063, term6063.getClass(), "objectValue", null);
        setField(term6059, term6059.getClass(), "propListHead", term6063);
        setIntField(term6059, term6059.getClass(), "sourcePosition", -130649791);
        setField(term6059, term6059.getClass(), "jsType", null);
        setField(term6059, term6059.getClass(), "parent", null);
        setField(term6058, term6058.getClass(), "next", term6059);
        setIntField(term6064, term6064.getClass(), "type", 0);
        setField(term6064, term6064.getClass(), "next", null);
        setField(term6064, term6064.getClass(), "first", null);
        setField(term6064, term6064.getClass(), "last", null);
        setField(term6064, term6064.getClass(), "propListHead", null);
        setIntField(term6064, term6064.getClass(), "sourcePosition", 0);
        setField(term6064, term6064.getClass(), "jsType", null);
        setField(term6064, term6064.getClass(), "parent", null);
        setField(term6058, term6058.getClass(), "first", term6064);
        setIntField(term6065, term6065.getClass(), "type", 0);
        setField(term6065, term6065.getClass(), "next", null);
        setField(term6065, term6065.getClass(), "first", null);
        setField(term6065, term6065.getClass(), "last", null);
        setField(term6065, term6065.getClass(), "propListHead", null);
        setIntField(term6065, term6065.getClass(), "sourcePosition", 0);
        setField(term6065, term6065.getClass(), "jsType", null);
        setField(term6065, term6065.getClass(), "parent", null);
        setField(term6058, term6058.getClass(), "last", term6065);
        setField(term6066, term6066.getClass(), "next", null);
        setIntField(term6066, term6066.getClass(), "type", 0);
        setIntField(term6066, term6066.getClass(), "intValue", 0);
        setField(term6066, term6066.getClass(), "objectValue", null);
        setField(term6058, term6058.getClass(), "propListHead", term6066);
        setIntField(term6058, term6058.getClass(), "sourcePosition", 534834644);
        setField(term6058, term6058.getClass(), "jsType", null);
        setField(term6058, term6058.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term571;
        Object retValue = callMethod(klass, "isExpressionNode", argTypes, null, args);
        assertTrue(recursiveEquals(term571, term6058));
        assertTrue(recursiveEquals(retValue, false));
    }

};


