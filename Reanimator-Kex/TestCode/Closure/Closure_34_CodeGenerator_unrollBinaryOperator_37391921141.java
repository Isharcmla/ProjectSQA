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
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_unrollBinaryOperator_37391921141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598;
     Object term609;
     Object term636;
     Object enum10;
     Object enum11;
     Object term689;
     Object term691;

    public CodeGenerator_unrollBinaryOperator_37391921141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term599 = new HashMap();
        term598 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term598, term598.getClass(), "ESCAPED_JS_STRINGS", term599);
        setField(term598, term598.getClass(), "cc", null);
        setField(term598, term598.getClass(), "outputCharsetEncoder", null);
        term609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term609, term609.getClass(), "type", -655067527);
        setIntField(term611, term611.getClass(), "type", -6029667);
        setIntField(term613, term613.getClass(), "type", -2068769794);
        setIntField(term615, term615.getClass(), "type", -117576464);
        setIntField(term617, term617.getClass(), "type", -1007160944);
        setField(term617, term617.getClass(), "next", null);
        setField(term617, term617.getClass(), "first", null);
        setField(term617, term617.getClass(), "last", null);
        setField(term617, term617.getClass(), "propListHead", null);
        setIntField(term617, term617.getClass(), "sourcePosition", 0);
        setField(term617, term617.getClass(), "jsType", null);
        setField(term617, term617.getClass(), "parent", null);
        setField(term615, term615.getClass(), "next", term617);
        setIntField(term620, term620.getClass(), "type", 1135664017);
        setField(term620, term620.getClass(), "next", null);
        setField(term620, term620.getClass(), "first", null);
        setField(term620, term620.getClass(), "last", term617);
        setField(term620, term620.getClass(), "propListHead", null);
        setIntField(term620, term620.getClass(), "sourcePosition", 0);
        setField(term620, term620.getClass(), "jsType", null);
        setField(term620, term620.getClass(), "parent", null);
        setField(term615, term615.getClass(), "first", term620);
        setField(term615, term615.getClass(), "last", term613);
        setField(term615, term615.getClass(), "propListHead", null);
        setIntField(term615, term615.getClass(), "sourcePosition", 0);
        setField(term615, term615.getClass(), "jsType", null);
        setField(term615, term615.getClass(), "parent", null);
        setField(term613, term613.getClass(), "next", term615);
        setField(term613, term613.getClass(), "first", term617);
        setIntField(term624, term624.getClass(), "type", 865208305);
        setIntField(term626, term626.getClass(), "type", -1275173084);
        setField(term626, term626.getClass(), "next", null);
        setField(term626, term626.getClass(), "first", term620);
        setField(term626, term626.getClass(), "last", term615);
        setField(term626, term626.getClass(), "propListHead", null);
        setIntField(term626, term626.getClass(), "sourcePosition", 0);
        setField(term626, term626.getClass(), "jsType", null);
        setField(term626, term626.getClass(), "parent", null);
        setField(term624, term624.getClass(), "next", term626);
        setField(term624, term624.getClass(), "first", term611);
        setField(term624, term624.getClass(), "last", term611);
        setField(term624, term624.getClass(), "propListHead", null);
        setIntField(term624, term624.getClass(), "sourcePosition", 0);
        setField(term624, term624.getClass(), "jsType", null);
        setField(term624, term624.getClass(), "parent", null);
        setField(term613, term613.getClass(), "last", term624);
        setField(term613, term613.getClass(), "propListHead", null);
        setIntField(term613, term613.getClass(), "sourcePosition", 0);
        setField(term613, term613.getClass(), "jsType", null);
        setField(term613, term613.getClass(), "parent", null);
        setField(term611, term611.getClass(), "next", term613);
        setIntField(term631, term631.getClass(), "type", -244121226);
        setField(term631, term631.getClass(), "next", term624);
        setField(term631, term631.getClass(), "first", term626);
        setField(term631, term631.getClass(), "last", term609);
        setField(term631, term631.getClass(), "propListHead", null);
        setIntField(term631, term631.getClass(), "sourcePosition", 0);
        setField(term631, term631.getClass(), "jsType", null);
        setField(term631, term631.getClass(), "parent", null);
        setField(term611, term611.getClass(), "first", term631);
        setField(term611, term611.getClass(), "last", term631);
        setField(term611, term611.getClass(), "propListHead", null);
        setIntField(term611, term611.getClass(), "sourcePosition", 0);
        setField(term611, term611.getClass(), "jsType", null);
        setField(term611, term611.getClass(), "parent", null);
        setField(term609, term609.getClass(), "next", term611);
        setField(term609, term609.getClass(), "first", term615);
        setField(term609, term609.getClass(), "last", term617);
        setField(term609, term609.getClass(), "propListHead", null);
        setIntField(term609, term609.getClass(), "sourcePosition", 0);
        setField(term609, term609.getClass(), "jsType", null);
        setField(term609, term609.getClass(), "parent", null);
        term636 = new Integer(-203030934);
        Class<? extends Object> term5964 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5963 = ((Class) term5964).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term5963).setAccessible(true);
        enum10 = ((Field) term5963).get((Object) null);
        Class<? extends Object> term6260 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term6259 = ((Class) term6260).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term6259).setAccessible(true);
        enum11 = ((Field) term6259).get((Object) null);
        term689 = new Integer(-1179120542);
        term691 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term609;
        args[1] = term636;
        args[2] = "oVcInYnLWB";
        args[3] = enum10;
        args[4] = enum11;
        args[5] = term689;
        args[6] = term691;
        try {
            callMethod(klass, "unrollBinaryOperator", argTypes, term598, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


