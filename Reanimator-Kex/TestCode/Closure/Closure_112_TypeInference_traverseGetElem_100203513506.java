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
import java.lang.Object;

public class TypeInference_traverseGetElem_100203513506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2847961;
     Object term2848031;

    public TypeInference_traverseGetElem_100203513506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2847961 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2848031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2848941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2848101, term2848101.getClass(), "type", 98);
        setField(term2848171, term2848171.getClass(), "next", null);
        setIntField(term2848171, term2848171.getClass(), "type", 98);
        setField(term2848241, term2848241.getClass(), "next", null);
        setIntField(term2848241, term2848241.getClass(), "type", 98);
        setField(term2848311, term2848311.getClass(), "next", null);
        setIntField(term2848311, term2848311.getClass(), "type", 98);
        setField(term2848381, term2848381.getClass(), "next", null);
        setIntField(term2848381, term2848381.getClass(), "type", 98);
        setField(term2848451, term2848451.getClass(), "next", null);
        setIntField(term2848451, term2848451.getClass(), "type", 98);
        setField(term2848521, term2848521.getClass(), "next", null);
        setIntField(term2848521, term2848521.getClass(), "type", 98);
        setField(term2848591, term2848591.getClass(), "next", null);
        setIntField(term2848591, term2848591.getClass(), "type", 98);
        setField(term2848661, term2848661.getClass(), "next", null);
        setIntField(term2848661, term2848661.getClass(), "type", 98);
        setField(term2848731, term2848731.getClass(), "next", null);
        setIntField(term2848731, term2848731.getClass(), "type", 98);
        setField(term2848801, term2848801.getClass(), "next", null);
        setIntField(term2848801, term2848801.getClass(), "type", 98);
        setField(term2848871, term2848871.getClass(), "next", null);
        setIntField(term2848871, term2848871.getClass(), "type", 98);
        setField(term2848941, term2848941.getClass(), "next", null);
        setIntField(term2848941, term2848941.getClass(), "type", 98);
        setField(term2849011, term2849011.getClass(), "next", null);
        setIntField(term2849011, term2849011.getClass(), "type", 98);
        setField(term2849081, term2849081.getClass(), "next", null);
        setIntField(term2849081, term2849081.getClass(), "type", 98);
        setField(term2849151, term2849151.getClass(), "next", null);
        setIntField(term2849151, term2849151.getClass(), "type", 98);
        setField(term2849221, term2849221.getClass(), "next", null);
        setIntField(term2849221, term2849221.getClass(), "type", 98);
        setField(term2849291, term2849291.getClass(), "next", null);
        setIntField(term2849291, term2849291.getClass(), "type", 98);
        setField(term2849361, term2849361.getClass(), "next", null);
        setIntField(term2849361, term2849361.getClass(), "type", 98);
        setField(term2849431, term2849431.getClass(), "next", null);
        setIntField(term2849431, term2849431.getClass(), "type", 98);
        setField(term2849501, term2849501.getClass(), "next", null);
        setIntField(term2849501, term2849501.getClass(), "type", 98);
        setField(term2849571, term2849571.getClass(), "next", null);
        setIntField(term2849571, term2849571.getClass(), "type", 98);
        setField(term2849641, term2849641.getClass(), "next", null);
        setIntField(term2849641, term2849641.getClass(), "type", 98);
        setField(term2849711, term2849711.getClass(), "next", null);
        setIntField(term2849711, term2849711.getClass(), "type", 98);
        setField(term2849781, term2849781.getClass(), "next", null);
        setIntField(term2849781, term2849781.getClass(), "type", 98);
        setField(term2849851, term2849851.getClass(), "next", null);
        setIntField(term2849851, term2849851.getClass(), "type", 98);
        setField(term2849921, term2849921.getClass(), "next", null);
        setIntField(term2849921, term2849921.getClass(), "type", 98);
        setField(term2849991, term2849991.getClass(), "next", null);
        setIntField(term2849991, term2849991.getClass(), "type", 77);
        setField(term2849921, term2849921.getClass(), "first", term2849991);
        setField(term2849921, term2849921.getClass(), "last", null);
        setField(term2849851, term2849851.getClass(), "first", term2849921);
        setField(term2849851, term2849851.getClass(), "last", null);
        setField(term2849781, term2849781.getClass(), "first", term2849851);
        setField(term2849781, term2849781.getClass(), "last", null);
        setField(term2849711, term2849711.getClass(), "first", term2849781);
        setField(term2849711, term2849711.getClass(), "last", null);
        setField(term2849641, term2849641.getClass(), "first", term2849711);
        setField(term2849641, term2849641.getClass(), "last", null);
        setField(term2849571, term2849571.getClass(), "first", term2849641);
        setField(term2849571, term2849571.getClass(), "last", null);
        setField(term2849501, term2849501.getClass(), "first", term2849571);
        setField(term2849501, term2849501.getClass(), "last", null);
        setField(term2849431, term2849431.getClass(), "first", term2849501);
        setField(term2849431, term2849431.getClass(), "last", null);
        setField(term2849361, term2849361.getClass(), "first", term2849431);
        setField(term2849361, term2849361.getClass(), "last", null);
        setField(term2849291, term2849291.getClass(), "first", term2849361);
        setField(term2849291, term2849291.getClass(), "last", null);
        setField(term2849221, term2849221.getClass(), "first", term2849291);
        setField(term2849221, term2849221.getClass(), "last", null);
        setField(term2849151, term2849151.getClass(), "first", term2849221);
        setField(term2849151, term2849151.getClass(), "last", null);
        setField(term2849081, term2849081.getClass(), "first", term2849151);
        setField(term2849081, term2849081.getClass(), "last", null);
        setField(term2849011, term2849011.getClass(), "first", term2849081);
        setField(term2849011, term2849011.getClass(), "last", null);
        setField(term2848941, term2848941.getClass(), "first", term2849011);
        setField(term2848941, term2848941.getClass(), "last", null);
        setField(term2848871, term2848871.getClass(), "first", term2848941);
        setField(term2848871, term2848871.getClass(), "last", null);
        setField(term2848801, term2848801.getClass(), "first", term2848871);
        setField(term2848801, term2848801.getClass(), "last", null);
        setField(term2848731, term2848731.getClass(), "first", term2848801);
        setField(term2848731, term2848731.getClass(), "last", null);
        setField(term2848661, term2848661.getClass(), "first", term2848731);
        setField(term2848661, term2848661.getClass(), "last", null);
        setField(term2848591, term2848591.getClass(), "first", term2848661);
        setField(term2848591, term2848591.getClass(), "last", null);
        setField(term2848521, term2848521.getClass(), "first", term2848591);
        setField(term2848521, term2848521.getClass(), "last", null);
        setField(term2848451, term2848451.getClass(), "first", term2848521);
        setField(term2848451, term2848451.getClass(), "last", null);
        setField(term2848381, term2848381.getClass(), "first", term2848451);
        setField(term2848381, term2848381.getClass(), "last", null);
        setField(term2848311, term2848311.getClass(), "first", term2848381);
        setField(term2848311, term2848311.getClass(), "last", null);
        setField(term2848241, term2848241.getClass(), "first", term2848311);
        setField(term2848241, term2848241.getClass(), "last", null);
        setField(term2848171, term2848171.getClass(), "first", term2848241);
        setField(term2848171, term2848171.getClass(), "last", null);
        setField(term2848101, term2848101.getClass(), "first", term2848171);
        setField(term2848101, term2848101.getClass(), "last", null);
        setField(term2848031, term2848031.getClass(), "first", term2848101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2848031;
        args[1] = null;
        callMethod(klass, "traverseGetElem", argTypes, term2847961, args);
    }

};


