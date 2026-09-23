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
import java.util.HashMap;
import java.lang.Object;

public class Scope_getOwnSlot_8743069835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725;
     Object term2832;

    public Scope_getOwnSlot_8743069835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term726 = new HashMap();
        term725 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term739 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term725, term725.getClass(), "vars", term726);
        setField(term739, term739.getClass(), "vars", null);
        setField(term739, term739.getClass(), "parent", null);
        setIntField(term739, term739.getClass(), "depth", 0);
        setField(term739, term739.getClass(), "rootNode", null);
        setField(term739, term739.getClass(), "thisType", null);
        setBooleanField(term739, term739.getClass(), "isBottom", false);
        setField(term725, term725.getClass(), "parent", term739);
        setIntField(term725, term725.getClass(), "depth", -75206835);
        setIntField(term743, term743.getClass(), "type", 0);
        setField(term743, term743.getClass(), "next", null);
        setField(term743, term743.getClass(), "first", null);
        setField(term743, term743.getClass(), "last", null);
        setField(term743, term743.getClass(), "propListHead", null);
        setIntField(term743, term743.getClass(), "sourcePosition", 0);
        setField(term743, term743.getClass(), "jsType", null);
        setField(term743, term743.getClass(), "parent", null);
        setField(term725, term725.getClass(), "rootNode", term743);
        setField(term725, term725.getClass(), "thisType", null);
        setBooleanField(term725, term725.getClass(), "isBottom", false);
        HashMap term2833 = new HashMap();
        term2832 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2834 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2832, term2832.getClass(), "vars", term2833);
        setField(term2834, term2834.getClass(), "vars", null);
        setField(term2834, term2834.getClass(), "parent", null);
        setIntField(term2834, term2834.getClass(), "depth", 0);
        setField(term2834, term2834.getClass(), "rootNode", null);
        setField(term2834, term2834.getClass(), "thisType", null);
        setBooleanField(term2834, term2834.getClass(), "isBottom", false);
        setField(term2832, term2832.getClass(), "parent", term2834);
        setIntField(term2832, term2832.getClass(), "depth", -75206835);
        setIntField(term2835, term2835.getClass(), "type", 0);
        setField(term2835, term2835.getClass(), "next", null);
        setField(term2835, term2835.getClass(), "first", null);
        setField(term2835, term2835.getClass(), "last", null);
        setField(term2835, term2835.getClass(), "propListHead", null);
        setIntField(term2835, term2835.getClass(), "sourcePosition", 0);
        setField(term2835, term2835.getClass(), "jsType", null);
        setField(term2835, term2835.getClass(), "parent", null);
        setField(term2832, term2832.getClass(), "rootNode", term2835);
        setField(term2832, term2832.getClass(), "thisType", null);
        setBooleanField(term2832, term2832.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        Object retValue = callMethod(klass, "getOwnSlot", argTypes, term725, args);
        assertTrue(recursiveEquals(term725, term2832));
        assertTrue(recursiveEquals(retValue, null));
    }

};


