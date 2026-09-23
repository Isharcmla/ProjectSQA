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

public class TypeInference_traverseAdd_838817955393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076542;
     Object term1076612;

    public TypeInference_traverseAdd_838817955393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1076542 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1076612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1076682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1076752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1076822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1076892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1076962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1076682, term1076682.getClass(), "next", null);
        setIntField(term1076682, term1076682.getClass(), "type", 14);
        setIntField(term1076752, term1076752.getClass(), "type", 14);
        setIntField(term1076822, term1076822.getClass(), "type", 14);
        setIntField(term1076892, term1076892.getClass(), "type", 14);
        setIntField(term1076962, term1076962.getClass(), "type", 14);
        setIntField(term1077032, term1077032.getClass(), "type", 14);
        setIntField(term1077102, term1077102.getClass(), "type", 14);
        setIntField(term1077172, term1077172.getClass(), "type", 14);
        setIntField(term1077242, term1077242.getClass(), "type", 14);
        setIntField(term1077312, term1077312.getClass(), "type", 14);
        setIntField(term1077382, term1077382.getClass(), "type", 14);
        setIntField(term1077452, term1077452.getClass(), "type", 14);
        setIntField(term1077522, term1077522.getClass(), "type", 14);
        setIntField(term1077592, term1077592.getClass(), "type", 14);
        setIntField(term1077662, term1077662.getClass(), "type", 14);
        setIntField(term1077732, term1077732.getClass(), "type", 14);
        setIntField(term1077802, term1077802.getClass(), "type", 14);
        setIntField(term1077872, term1077872.getClass(), "type", 14);
        setIntField(term1077942, term1077942.getClass(), "type", 14);
        setIntField(term1078012, term1078012.getClass(), "type", 14);
        setIntField(term1078082, term1078082.getClass(), "type", 14);
        setIntField(term1078152, term1078152.getClass(), "type", 14);
        setIntField(term1078222, term1078222.getClass(), "type", 14);
        setIntField(term1078292, term1078292.getClass(), "type", 14);
        setIntField(term1078362, term1078362.getClass(), "type", 14);
        setIntField(term1078432, term1078432.getClass(), "type", 14);
        setIntField(term1078502, term1078502.getClass(), "type", 14);
        setIntField(term1078572, term1078572.getClass(), "type", 14);
        setIntField(term1078642, term1078642.getClass(), "type", 14);
        setIntField(term1078712, term1078712.getClass(), "type", 14);
        setIntField(term1078782, term1078782.getClass(), "type", 14);
        setIntField(term1078852, term1078852.getClass(), "type", 14);
        setIntField(term1078922, term1078922.getClass(), "type", 14);
        setIntField(term1078992, term1078992.getClass(), "type", 14);
        setIntField(term1079062, term1079062.getClass(), "type", 14);
        setIntField(term1079132, term1079132.getClass(), "type", 14);
        setIntField(term1079202, term1079202.getClass(), "type", 14);
        setIntField(term1079272, term1079272.getClass(), "type", 14);
        setIntField(term1079342, term1079342.getClass(), "type", 112);
        setField(term1079272, term1079272.getClass(), "first", term1079342);
        setField(term1079202, term1079202.getClass(), "first", term1079272);
        setField(term1079132, term1079132.getClass(), "first", term1079202);
        setField(term1079062, term1079062.getClass(), "first", term1079132);
        setField(term1078992, term1078992.getClass(), "first", term1079062);
        setField(term1078922, term1078922.getClass(), "first", term1078992);
        setField(term1078852, term1078852.getClass(), "first", term1078922);
        setField(term1078782, term1078782.getClass(), "first", term1078852);
        setField(term1078712, term1078712.getClass(), "first", term1078782);
        setField(term1078642, term1078642.getClass(), "first", term1078712);
        setField(term1078572, term1078572.getClass(), "first", term1078642);
        setField(term1078502, term1078502.getClass(), "first", term1078572);
        setField(term1078432, term1078432.getClass(), "first", term1078502);
        setField(term1078362, term1078362.getClass(), "first", term1078432);
        setField(term1078292, term1078292.getClass(), "first", term1078362);
        setField(term1078222, term1078222.getClass(), "first", term1078292);
        setField(term1078152, term1078152.getClass(), "first", term1078222);
        setField(term1078082, term1078082.getClass(), "first", term1078152);
        setField(term1078012, term1078012.getClass(), "first", term1078082);
        setField(term1077942, term1077942.getClass(), "first", term1078012);
        setField(term1077872, term1077872.getClass(), "first", term1077942);
        setField(term1077802, term1077802.getClass(), "first", term1077872);
        setField(term1077732, term1077732.getClass(), "first", term1077802);
        setField(term1077662, term1077662.getClass(), "first", term1077732);
        setField(term1077592, term1077592.getClass(), "first", term1077662);
        setField(term1077522, term1077522.getClass(), "first", term1077592);
        setField(term1077452, term1077452.getClass(), "first", term1077522);
        setField(term1077382, term1077382.getClass(), "first", term1077452);
        setField(term1077312, term1077312.getClass(), "first", term1077382);
        setField(term1077242, term1077242.getClass(), "first", term1077312);
        setField(term1077172, term1077172.getClass(), "first", term1077242);
        setField(term1077102, term1077102.getClass(), "first", term1077172);
        setField(term1077032, term1077032.getClass(), "first", term1077102);
        setField(term1076962, term1076962.getClass(), "first", term1077032);
        setField(term1076892, term1076892.getClass(), "first", term1076962);
        setField(term1076822, term1076822.getClass(), "first", term1076892);
        setField(term1076752, term1076752.getClass(), "first", term1076822);
        setField(term1076682, term1076682.getClass(), "first", term1076752);
        setField(term1076612, term1076612.getClass(), "first", term1076682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1076612;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1076542, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


