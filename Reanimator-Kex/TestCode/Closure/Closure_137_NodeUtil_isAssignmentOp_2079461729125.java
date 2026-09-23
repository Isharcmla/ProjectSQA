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

public class NodeUtil_isAssignmentOp_2079461729125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517;
     Object term5713;

    public NodeUtil_isAssignmentOp_2079461729125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term540 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term517, term517.getClass(), "type", -1347358701);
        setIntField(term519, term519.getClass(), "type", 1694224101);
        setIntField(term521, term521.getClass(), "type", 0);
        setField(term521, term521.getClass(), "next", null);
        setField(term521, term521.getClass(), "first", null);
        setField(term521, term521.getClass(), "last", null);
        setField(term521, term521.getClass(), "propListHead", null);
        setIntField(term521, term521.getClass(), "sourcePosition", 0);
        setField(term521, term521.getClass(), "jsType", null);
        setField(term521, term521.getClass(), "parent", null);
        setField(term519, term519.getClass(), "next", term521);
        setIntField(term524, term524.getClass(), "type", 0);
        setField(term524, term524.getClass(), "next", null);
        setField(term524, term524.getClass(), "first", null);
        setField(term524, term524.getClass(), "last", null);
        setField(term524, term524.getClass(), "propListHead", null);
        setIntField(term524, term524.getClass(), "sourcePosition", 0);
        setField(term524, term524.getClass(), "jsType", null);
        setField(term524, term524.getClass(), "parent", null);
        setField(term519, term519.getClass(), "first", term524);
        setIntField(term527, term527.getClass(), "type", 0);
        setField(term527, term527.getClass(), "next", null);
        setField(term527, term527.getClass(), "first", null);
        setField(term527, term527.getClass(), "last", null);
        setField(term527, term527.getClass(), "propListHead", null);
        setIntField(term527, term527.getClass(), "sourcePosition", 0);
        setField(term527, term527.getClass(), "jsType", null);
        setField(term527, term527.getClass(), "parent", null);
        setField(term519, term519.getClass(), "last", term527);
        setField(term530, term530.getClass(), "next", null);
        setIntField(term530, term530.getClass(), "type", 0);
        setIntField(term530, term530.getClass(), "intValue", 0);
        setField(term530, term530.getClass(), "objectValue", null);
        setField(term519, term519.getClass(), "propListHead", term530);
        setIntField(term519, term519.getClass(), "sourcePosition", -2131181468);
        setField(term519, term519.getClass(), "jsType", null);
        setField(term519, term519.getClass(), "parent", null);
        setField(term517, term517.getClass(), "next", term519);
        setIntField(term534, term534.getClass(), "type", 0);
        setField(term534, term534.getClass(), "next", null);
        setField(term534, term534.getClass(), "first", null);
        setField(term534, term534.getClass(), "last", null);
        setField(term534, term534.getClass(), "propListHead", null);
        setIntField(term534, term534.getClass(), "sourcePosition", 0);
        setField(term534, term534.getClass(), "jsType", null);
        setField(term534, term534.getClass(), "parent", null);
        setField(term517, term517.getClass(), "first", term534);
        setIntField(term537, term537.getClass(), "type", 0);
        setField(term537, term537.getClass(), "next", null);
        setField(term537, term537.getClass(), "first", null);
        setField(term537, term537.getClass(), "last", null);
        setField(term537, term537.getClass(), "propListHead", null);
        setIntField(term537, term537.getClass(), "sourcePosition", 0);
        setField(term537, term537.getClass(), "jsType", null);
        setField(term537, term537.getClass(), "parent", null);
        setField(term517, term517.getClass(), "last", term537);
        setField(term540, term540.getClass(), "next", null);
        setIntField(term540, term540.getClass(), "type", 0);
        setIntField(term540, term540.getClass(), "intValue", 0);
        setField(term540, term540.getClass(), "objectValue", null);
        setField(term517, term517.getClass(), "propListHead", term540);
        setIntField(term517, term517.getClass(), "sourcePosition", 282916351);
        setField(term517, term517.getClass(), "jsType", null);
        setField(term517, term517.getClass(), "parent", null);
        term5713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5718 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5721 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5713, term5713.getClass(), "type", -1347358701);
        setIntField(term5714, term5714.getClass(), "type", 1694224101);
        setIntField(term5715, term5715.getClass(), "type", 0);
        setField(term5715, term5715.getClass(), "next", null);
        setField(term5715, term5715.getClass(), "first", null);
        setField(term5715, term5715.getClass(), "last", null);
        setField(term5715, term5715.getClass(), "propListHead", null);
        setIntField(term5715, term5715.getClass(), "sourcePosition", 0);
        setField(term5715, term5715.getClass(), "jsType", null);
        setField(term5715, term5715.getClass(), "parent", null);
        setField(term5714, term5714.getClass(), "next", term5715);
        setIntField(term5716, term5716.getClass(), "type", 0);
        setField(term5716, term5716.getClass(), "next", null);
        setField(term5716, term5716.getClass(), "first", null);
        setField(term5716, term5716.getClass(), "last", null);
        setField(term5716, term5716.getClass(), "propListHead", null);
        setIntField(term5716, term5716.getClass(), "sourcePosition", 0);
        setField(term5716, term5716.getClass(), "jsType", null);
        setField(term5716, term5716.getClass(), "parent", null);
        setField(term5714, term5714.getClass(), "first", term5716);
        setIntField(term5717, term5717.getClass(), "type", 0);
        setField(term5717, term5717.getClass(), "next", null);
        setField(term5717, term5717.getClass(), "first", null);
        setField(term5717, term5717.getClass(), "last", null);
        setField(term5717, term5717.getClass(), "propListHead", null);
        setIntField(term5717, term5717.getClass(), "sourcePosition", 0);
        setField(term5717, term5717.getClass(), "jsType", null);
        setField(term5717, term5717.getClass(), "parent", null);
        setField(term5714, term5714.getClass(), "last", term5717);
        setField(term5718, term5718.getClass(), "next", null);
        setIntField(term5718, term5718.getClass(), "type", 0);
        setIntField(term5718, term5718.getClass(), "intValue", 0);
        setField(term5718, term5718.getClass(), "objectValue", null);
        setField(term5714, term5714.getClass(), "propListHead", term5718);
        setIntField(term5714, term5714.getClass(), "sourcePosition", -2131181468);
        setField(term5714, term5714.getClass(), "jsType", null);
        setField(term5714, term5714.getClass(), "parent", null);
        setField(term5713, term5713.getClass(), "next", term5714);
        setIntField(term5719, term5719.getClass(), "type", 0);
        setField(term5719, term5719.getClass(), "next", null);
        setField(term5719, term5719.getClass(), "first", null);
        setField(term5719, term5719.getClass(), "last", null);
        setField(term5719, term5719.getClass(), "propListHead", null);
        setIntField(term5719, term5719.getClass(), "sourcePosition", 0);
        setField(term5719, term5719.getClass(), "jsType", null);
        setField(term5719, term5719.getClass(), "parent", null);
        setField(term5713, term5713.getClass(), "first", term5719);
        setIntField(term5720, term5720.getClass(), "type", 0);
        setField(term5720, term5720.getClass(), "next", null);
        setField(term5720, term5720.getClass(), "first", null);
        setField(term5720, term5720.getClass(), "last", null);
        setField(term5720, term5720.getClass(), "propListHead", null);
        setIntField(term5720, term5720.getClass(), "sourcePosition", 0);
        setField(term5720, term5720.getClass(), "jsType", null);
        setField(term5720, term5720.getClass(), "parent", null);
        setField(term5713, term5713.getClass(), "last", term5720);
        setField(term5721, term5721.getClass(), "next", null);
        setIntField(term5721, term5721.getClass(), "type", 0);
        setIntField(term5721, term5721.getClass(), "intValue", 0);
        setField(term5721, term5721.getClass(), "objectValue", null);
        setField(term5713, term5713.getClass(), "propListHead", term5721);
        setIntField(term5713, term5713.getClass(), "sourcePosition", 282916351);
        setField(term5713, term5713.getClass(), "jsType", null);
        setField(term5713, term5713.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term517;
        Object retValue = callMethod(klass, "isAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term517, term5713));
        assertTrue(recursiveEquals(retValue, false));
    }

};


