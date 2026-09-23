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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAdd_838817955517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231032;
     Object term2231102;

    public TypeInference_traverseAdd_838817955517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2231032 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2231102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2232992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2233062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2233132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2231172, term2231172.getClass(), "next", null);
        setIntField(term2231172, term2231172.getClass(), "type", 14);
        setIntField(term2231242, term2231242.getClass(), "type", 14);
        setIntField(term2231312, term2231312.getClass(), "type", 14);
        setIntField(term2231382, term2231382.getClass(), "type", 14);
        setIntField(term2231452, term2231452.getClass(), "type", 14);
        setIntField(term2231522, term2231522.getClass(), "type", 14);
        setIntField(term2231592, term2231592.getClass(), "type", 14);
        setIntField(term2231662, term2231662.getClass(), "type", 14);
        setIntField(term2231732, term2231732.getClass(), "type", 14);
        setIntField(term2231802, term2231802.getClass(), "type", 14);
        setIntField(term2231872, term2231872.getClass(), "type", 14);
        setIntField(term2231942, term2231942.getClass(), "type", 14);
        setIntField(term2232012, term2232012.getClass(), "type", 14);
        setIntField(term2232082, term2232082.getClass(), "type", 14);
        setIntField(term2232152, term2232152.getClass(), "type", 14);
        setIntField(term2232222, term2232222.getClass(), "type", 14);
        setIntField(term2232292, term2232292.getClass(), "type", 14);
        setIntField(term2232362, term2232362.getClass(), "type", 14);
        setIntField(term2232432, term2232432.getClass(), "type", 14);
        setIntField(term2232502, term2232502.getClass(), "type", 14);
        setIntField(term2232572, term2232572.getClass(), "type", 14);
        setIntField(term2232642, term2232642.getClass(), "type", 14);
        setIntField(term2232712, term2232712.getClass(), "type", 14);
        setIntField(term2232782, term2232782.getClass(), "type", 14);
        setIntField(term2232852, term2232852.getClass(), "type", 14);
        setIntField(term2232922, term2232922.getClass(), "type", 14);
        setIntField(term2232992, term2232992.getClass(), "type", 14);
        setIntField(term2233062, term2233062.getClass(), "type", 14);
        setIntField(term2233132, term2233132.getClass(), "type", 155);
        setField(term2233062, term2233062.getClass(), "first", term2233132);
        setField(term2232992, term2232992.getClass(), "first", term2233062);
        setField(term2232922, term2232922.getClass(), "first", term2232992);
        setField(term2232852, term2232852.getClass(), "first", term2232922);
        setField(term2232782, term2232782.getClass(), "first", term2232852);
        setField(term2232712, term2232712.getClass(), "first", term2232782);
        setField(term2232642, term2232642.getClass(), "first", term2232712);
        setField(term2232572, term2232572.getClass(), "first", term2232642);
        setField(term2232502, term2232502.getClass(), "first", term2232572);
        setField(term2232432, term2232432.getClass(), "first", term2232502);
        setField(term2232362, term2232362.getClass(), "first", term2232432);
        setField(term2232292, term2232292.getClass(), "first", term2232362);
        setField(term2232222, term2232222.getClass(), "first", term2232292);
        setField(term2232152, term2232152.getClass(), "first", term2232222);
        setField(term2232082, term2232082.getClass(), "first", term2232152);
        setField(term2232012, term2232012.getClass(), "first", term2232082);
        setField(term2231942, term2231942.getClass(), "first", term2232012);
        setField(term2231872, term2231872.getClass(), "first", term2231942);
        setField(term2231802, term2231802.getClass(), "first", term2231872);
        setField(term2231732, term2231732.getClass(), "first", term2231802);
        setField(term2231662, term2231662.getClass(), "first", term2231732);
        setField(term2231592, term2231592.getClass(), "first", term2231662);
        setField(term2231522, term2231522.getClass(), "first", term2231592);
        setField(term2231452, term2231452.getClass(), "first", term2231522);
        setField(term2231382, term2231382.getClass(), "first", term2231452);
        setField(term2231312, term2231312.getClass(), "first", term2231382);
        setField(term2231242, term2231242.getClass(), "first", term2231312);
        setField(term2231172, term2231172.getClass(), "first", term2231242);
        setField(term2231102, term2231102.getClass(), "first", term2231172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2231102;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term2231032, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


