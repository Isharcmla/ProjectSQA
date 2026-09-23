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

public class NodeUtil_allResultsMatch_184708688195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999;

    public NodeUtil_allResultsMatch_184708688195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term999, term999.getClass(), "type", -220791533);
        setIntField(term1001, term1001.getClass(), "type", 1741500243);
        setIntField(term1003, term1003.getClass(), "type", -2070466617);
        setIntField(term1005, term1005.getClass(), "type", -1127721881);
        setIntField(term1007, term1007.getClass(), "type", 1074848808);
        setField(term1007, term1007.getClass(), "next", null);
        setField(term1007, term1007.getClass(), "first", null);
        setField(term1007, term1007.getClass(), "last", null);
        setField(term1007, term1007.getClass(), "propListHead", null);
        setIntField(term1007, term1007.getClass(), "sourcePosition", 0);
        setField(term1007, term1007.getClass(), "jsType", null);
        setField(term1007, term1007.getClass(), "parent", null);
        setField(term1005, term1005.getClass(), "next", term1007);
        setIntField(term1010, term1010.getClass(), "type", -146054762);
        setField(term1010, term1010.getClass(), "next", null);
        setField(term1010, term1010.getClass(), "first", null);
        setField(term1010, term1010.getClass(), "last", term1007);
        setField(term1010, term1010.getClass(), "propListHead", null);
        setIntField(term1010, term1010.getClass(), "sourcePosition", 0);
        setField(term1010, term1010.getClass(), "jsType", null);
        setField(term1010, term1010.getClass(), "parent", null);
        setField(term1005, term1005.getClass(), "first", term1010);
        setField(term1005, term1005.getClass(), "last", term1003);
        setField(term1005, term1005.getClass(), "propListHead", null);
        setIntField(term1005, term1005.getClass(), "sourcePosition", 0);
        setField(term1005, term1005.getClass(), "jsType", null);
        setField(term1005, term1005.getClass(), "parent", null);
        setField(term1003, term1003.getClass(), "next", term1005);
        setField(term1003, term1003.getClass(), "first", term1007);
        setIntField(term1014, term1014.getClass(), "type", 533197381);
        setIntField(term1016, term1016.getClass(), "type", 1048271679);
        setField(term1016, term1016.getClass(), "next", null);
        setField(term1016, term1016.getClass(), "first", term1010);
        setField(term1016, term1016.getClass(), "last", term1005);
        setField(term1016, term1016.getClass(), "propListHead", null);
        setIntField(term1016, term1016.getClass(), "sourcePosition", 0);
        setField(term1016, term1016.getClass(), "jsType", null);
        setField(term1016, term1016.getClass(), "parent", null);
        setField(term1014, term1014.getClass(), "next", term1016);
        setField(term1014, term1014.getClass(), "first", term1001);
        setField(term1014, term1014.getClass(), "last", term1001);
        setField(term1014, term1014.getClass(), "propListHead", null);
        setIntField(term1014, term1014.getClass(), "sourcePosition", 0);
        setField(term1014, term1014.getClass(), "jsType", null);
        setField(term1014, term1014.getClass(), "parent", null);
        setField(term1003, term1003.getClass(), "last", term1014);
        setField(term1003, term1003.getClass(), "propListHead", null);
        setIntField(term1003, term1003.getClass(), "sourcePosition", 0);
        setField(term1003, term1003.getClass(), "jsType", null);
        setField(term1003, term1003.getClass(), "parent", null);
        setField(term1001, term1001.getClass(), "next", term1003);
        setIntField(term1021, term1021.getClass(), "type", -1529797673);
        setField(term1021, term1021.getClass(), "next", term1014);
        setField(term1021, term1021.getClass(), "first", term1016);
        setField(term1021, term1021.getClass(), "last", term999);
        setField(term1021, term1021.getClass(), "propListHead", null);
        setIntField(term1021, term1021.getClass(), "sourcePosition", 0);
        setField(term1021, term1021.getClass(), "jsType", null);
        setField(term1021, term1021.getClass(), "parent", null);
        setField(term1001, term1001.getClass(), "first", term1021);
        setField(term1001, term1001.getClass(), "last", term1021);
        setField(term1001, term1001.getClass(), "propListHead", null);
        setIntField(term1001, term1001.getClass(), "sourcePosition", 0);
        setField(term1001, term1001.getClass(), "jsType", null);
        setField(term1001, term1001.getClass(), "parent", null);
        setField(term999, term999.getClass(), "next", term1001);
        setField(term999, term999.getClass(), "first", term1005);
        setField(term999, term999.getClass(), "last", term1007);
        setField(term999, term999.getClass(), "propListHead", null);
        setIntField(term999, term999.getClass(), "sourcePosition", 0);
        setField(term999, term999.getClass(), "jsType", null);
        setField(term999, term999.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term999;
        args[1] = null;
        try {
            callMethod(klass, "allResultsMatch", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


