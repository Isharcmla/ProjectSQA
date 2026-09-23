package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class Node_useSourceInfoIfMissingFromForTree_1338661614475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37157;
     Object term37507;
     Object term37849;
     Object term37854;
     Object term37702;

    public Node_useSourceInfoIfMissingFromForTree_1338661614475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37157, term37157.getClass(), "propListHead", null);
        setIntField(term37157, term37157.getClass(), "sourcePosition", 0);
        setField(term37227, term37227.getClass(), "propListHead", null);
        setIntField(term37227, term37227.getClass(), "sourcePosition", 0);
        setField(term37297, term37297.getClass(), "propListHead", null);
        setIntField(term37297, term37297.getClass(), "sourcePosition", 0);
        setField(term37297, term37297.getClass(), "first", null);
        setField(term37297, term37297.getClass(), "next", null);
        setField(term37227, term37227.getClass(), "first", term37297);
        setField(term37367, term37367.getClass(), "propListHead", null);
        setIntField(term37367, term37367.getClass(), "sourcePosition", 0);
        setField(term37367, term37367.getClass(), "first", null);
        setField(term37367, term37367.getClass(), "next", term37437);
        setField(term37227, term37227.getClass(), "next", term37367);
        setField(term37157, term37157.getClass(), "first", term37227);
        term37507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37507, term37507.getClass(), "propListHead", null);
        setIntField(term37507, term37507.getClass(), "sourcePosition", 0);
        term37849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37849, term37849.getClass(), "type", 0);
        setField(term37849, term37849.getClass(), "next", null);
        setIntField(term37850, term37850.getClass(), "type", 0);
        setIntField(term37851, term37851.getClass(), "type", 0);
        setIntField(term37852, term37852.getClass(), "type", 0);
        setField(term37852, term37852.getClass(), "next", null);
        setField(term37852, term37852.getClass(), "first", null);
        setField(term37852, term37852.getClass(), "last", null);
        setField(term37852, term37852.getClass(), "propListHead", null);
        setIntField(term37852, term37852.getClass(), "sourcePosition", 0);
        setField(term37852, term37852.getClass(), "jsType", null);
        setField(term37852, term37852.getClass(), "parent", null);
        setField(term37851, term37851.getClass(), "next", term37852);
        setField(term37851, term37851.getClass(), "first", null);
        setField(term37851, term37851.getClass(), "last", null);
        setField(term37851, term37851.getClass(), "propListHead", null);
        setIntField(term37851, term37851.getClass(), "sourcePosition", 0);
        setField(term37851, term37851.getClass(), "jsType", null);
        setField(term37851, term37851.getClass(), "parent", null);
        setField(term37850, term37850.getClass(), "next", term37851);
        setIntField(term37853, term37853.getClass(), "type", 0);
        setField(term37853, term37853.getClass(), "next", null);
        setField(term37853, term37853.getClass(), "first", null);
        setField(term37853, term37853.getClass(), "last", null);
        setField(term37853, term37853.getClass(), "propListHead", null);
        setIntField(term37853, term37853.getClass(), "sourcePosition", 0);
        setField(term37853, term37853.getClass(), "jsType", null);
        setField(term37853, term37853.getClass(), "parent", null);
        setField(term37850, term37850.getClass(), "first", term37853);
        setField(term37850, term37850.getClass(), "last", null);
        setField(term37850, term37850.getClass(), "propListHead", null);
        setIntField(term37850, term37850.getClass(), "sourcePosition", 0);
        setField(term37850, term37850.getClass(), "jsType", null);
        setField(term37850, term37850.getClass(), "parent", null);
        setField(term37849, term37849.getClass(), "first", term37850);
        setField(term37849, term37849.getClass(), "last", null);
        setField(term37849, term37849.getClass(), "propListHead", null);
        setIntField(term37849, term37849.getClass(), "sourcePosition", 0);
        setField(term37849, term37849.getClass(), "jsType", null);
        setField(term37849, term37849.getClass(), "parent", null);
        term37854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37854, term37854.getClass(), "type", 0);
        setField(term37854, term37854.getClass(), "next", null);
        setField(term37854, term37854.getClass(), "first", null);
        setField(term37854, term37854.getClass(), "last", null);
        setField(term37854, term37854.getClass(), "propListHead", null);
        setIntField(term37854, term37854.getClass(), "sourcePosition", 0);
        setField(term37854, term37854.getClass(), "jsType", null);
        setField(term37854, term37854.getClass(), "parent", null);
        term37702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37702, term37702.getClass(), "type", 0);
        setField(term37702, term37702.getClass(), "next", null);
        setIntField(term37704, term37704.getClass(), "type", 0);
        setIntField(term37706, term37706.getClass(), "type", 0);
        setIntField(term37708, term37708.getClass(), "type", 0);
        setField(term37708, term37708.getClass(), "next", null);
        setField(term37708, term37708.getClass(), "first", null);
        setField(term37708, term37708.getClass(), "last", null);
        setField(term37708, term37708.getClass(), "propListHead", null);
        setIntField(term37708, term37708.getClass(), "sourcePosition", 0);
        setField(term37708, term37708.getClass(), "jsType", null);
        setField(term37708, term37708.getClass(), "parent", null);
        setField(term37706, term37706.getClass(), "next", term37708);
        setField(term37706, term37706.getClass(), "first", null);
        setField(term37706, term37706.getClass(), "last", null);
        setField(term37706, term37706.getClass(), "propListHead", null);
        setIntField(term37706, term37706.getClass(), "sourcePosition", 0);
        setField(term37706, term37706.getClass(), "jsType", null);
        setField(term37706, term37706.getClass(), "parent", null);
        setField(term37704, term37704.getClass(), "next", term37706);
        setIntField(term37712, term37712.getClass(), "type", 0);
        setField(term37712, term37712.getClass(), "next", null);
        setField(term37712, term37712.getClass(), "first", null);
        setField(term37712, term37712.getClass(), "last", null);
        setField(term37712, term37712.getClass(), "propListHead", null);
        setIntField(term37712, term37712.getClass(), "sourcePosition", 0);
        setField(term37712, term37712.getClass(), "jsType", null);
        setField(term37712, term37712.getClass(), "parent", null);
        setField(term37704, term37704.getClass(), "first", term37712);
        setField(term37704, term37704.getClass(), "last", null);
        setField(term37704, term37704.getClass(), "propListHead", null);
        setIntField(term37704, term37704.getClass(), "sourcePosition", 0);
        setField(term37704, term37704.getClass(), "jsType", null);
        setField(term37704, term37704.getClass(), "parent", null);
        setField(term37702, term37702.getClass(), "first", term37704);
        setField(term37702, term37702.getClass(), "last", null);
        setField(term37702, term37702.getClass(), "propListHead", null);
        setIntField(term37702, term37702.getClass(), "sourcePosition", 0);
        setField(term37702, term37702.getClass(), "jsType", null);
        setField(term37702, term37702.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37507;
        Object retValue = callMethod(klass, "useSourceInfoIfMissingFromForTree", argTypes, term37157, args);
        assertTrue(recursiveEquals(term37157, term37849));
        assertTrue(recursiveEquals(term37507, term37854));
        assertTrue(recursiveEquals(retValue, term37702));
    }

};


