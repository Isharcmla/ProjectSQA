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

public class NodeUtil_isExpressionNode_1382466317128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term6085;

    public NodeUtil_isExpressionNode_1382466317128() {
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
        term6085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6090 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6093 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6085, term6085.getClass(), "type", -1122880881);
        setIntField(term6086, term6086.getClass(), "type", -1692331299);
        setIntField(term6087, term6087.getClass(), "type", 0);
        setField(term6087, term6087.getClass(), "next", null);
        setField(term6087, term6087.getClass(), "first", null);
        setField(term6087, term6087.getClass(), "last", null);
        setField(term6087, term6087.getClass(), "propListHead", null);
        setIntField(term6087, term6087.getClass(), "sourcePosition", 0);
        setField(term6087, term6087.getClass(), "jsType", null);
        setField(term6087, term6087.getClass(), "parent", null);
        setField(term6086, term6086.getClass(), "next", term6087);
        setIntField(term6088, term6088.getClass(), "type", 0);
        setField(term6088, term6088.getClass(), "next", null);
        setField(term6088, term6088.getClass(), "first", null);
        setField(term6088, term6088.getClass(), "last", null);
        setField(term6088, term6088.getClass(), "propListHead", null);
        setIntField(term6088, term6088.getClass(), "sourcePosition", 0);
        setField(term6088, term6088.getClass(), "jsType", null);
        setField(term6088, term6088.getClass(), "parent", null);
        setField(term6086, term6086.getClass(), "first", term6088);
        setIntField(term6089, term6089.getClass(), "type", 0);
        setField(term6089, term6089.getClass(), "next", null);
        setField(term6089, term6089.getClass(), "first", null);
        setField(term6089, term6089.getClass(), "last", null);
        setField(term6089, term6089.getClass(), "propListHead", null);
        setIntField(term6089, term6089.getClass(), "sourcePosition", 0);
        setField(term6089, term6089.getClass(), "jsType", null);
        setField(term6089, term6089.getClass(), "parent", null);
        setField(term6086, term6086.getClass(), "last", term6089);
        setField(term6090, term6090.getClass(), "next", null);
        setIntField(term6090, term6090.getClass(), "type", 0);
        setIntField(term6090, term6090.getClass(), "intValue", 0);
        setField(term6090, term6090.getClass(), "objectValue", null);
        setField(term6086, term6086.getClass(), "propListHead", term6090);
        setIntField(term6086, term6086.getClass(), "sourcePosition", -130649791);
        setField(term6086, term6086.getClass(), "jsType", null);
        setField(term6086, term6086.getClass(), "parent", null);
        setField(term6085, term6085.getClass(), "next", term6086);
        setIntField(term6091, term6091.getClass(), "type", 0);
        setField(term6091, term6091.getClass(), "next", null);
        setField(term6091, term6091.getClass(), "first", null);
        setField(term6091, term6091.getClass(), "last", null);
        setField(term6091, term6091.getClass(), "propListHead", null);
        setIntField(term6091, term6091.getClass(), "sourcePosition", 0);
        setField(term6091, term6091.getClass(), "jsType", null);
        setField(term6091, term6091.getClass(), "parent", null);
        setField(term6085, term6085.getClass(), "first", term6091);
        setIntField(term6092, term6092.getClass(), "type", 0);
        setField(term6092, term6092.getClass(), "next", null);
        setField(term6092, term6092.getClass(), "first", null);
        setField(term6092, term6092.getClass(), "last", null);
        setField(term6092, term6092.getClass(), "propListHead", null);
        setIntField(term6092, term6092.getClass(), "sourcePosition", 0);
        setField(term6092, term6092.getClass(), "jsType", null);
        setField(term6092, term6092.getClass(), "parent", null);
        setField(term6085, term6085.getClass(), "last", term6092);
        setField(term6093, term6093.getClass(), "next", null);
        setIntField(term6093, term6093.getClass(), "type", 0);
        setIntField(term6093, term6093.getClass(), "intValue", 0);
        setField(term6093, term6093.getClass(), "objectValue", null);
        setField(term6085, term6085.getClass(), "propListHead", term6093);
        setIntField(term6085, term6085.getClass(), "sourcePosition", 534834644);
        setField(term6085, term6085.getClass(), "jsType", null);
        setField(term6085, term6085.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term571;
        Object retValue = callMethod(klass, "isExpressionNode", argTypes, null, args);
        assertTrue(recursiveEquals(term571, term6085));
        assertTrue(recursiveEquals(retValue, false));
    }

};


