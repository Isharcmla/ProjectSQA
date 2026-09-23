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

public class NodeUtil_anyResultsMatch_1581944667196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1026;

    public NodeUtil_anyResultsMatch_1581944667196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1026, term1026.getClass(), "type", -868676396);
        setIntField(term1028, term1028.getClass(), "type", 1922684808);
        setIntField(term1030, term1030.getClass(), "type", -2005784375);
        setIntField(term1032, term1032.getClass(), "type", -288604325);
        setIntField(term1034, term1034.getClass(), "type", -1268314569);
        setField(term1034, term1034.getClass(), "next", null);
        setField(term1034, term1034.getClass(), "first", null);
        setField(term1034, term1034.getClass(), "last", null);
        setField(term1034, term1034.getClass(), "propListHead", null);
        setIntField(term1034, term1034.getClass(), "sourcePosition", 0);
        setField(term1034, term1034.getClass(), "jsType", null);
        setField(term1034, term1034.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "next", term1034);
        setIntField(term1037, term1037.getClass(), "type", 877649659);
        setField(term1037, term1037.getClass(), "next", null);
        setField(term1037, term1037.getClass(), "first", null);
        setField(term1037, term1037.getClass(), "last", term1034);
        setField(term1037, term1037.getClass(), "propListHead", null);
        setIntField(term1037, term1037.getClass(), "sourcePosition", 0);
        setField(term1037, term1037.getClass(), "jsType", null);
        setField(term1037, term1037.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "first", term1037);
        setField(term1032, term1032.getClass(), "last", term1030);
        setField(term1032, term1032.getClass(), "propListHead", null);
        setIntField(term1032, term1032.getClass(), "sourcePosition", 0);
        setField(term1032, term1032.getClass(), "jsType", null);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "next", term1032);
        setField(term1030, term1030.getClass(), "first", term1034);
        setIntField(term1041, term1041.getClass(), "type", 1774507971);
        setIntField(term1043, term1043.getClass(), "type", -1420269858);
        setField(term1043, term1043.getClass(), "next", null);
        setField(term1043, term1043.getClass(), "first", term1037);
        setField(term1043, term1043.getClass(), "last", term1032);
        setField(term1043, term1043.getClass(), "propListHead", null);
        setIntField(term1043, term1043.getClass(), "sourcePosition", 0);
        setField(term1043, term1043.getClass(), "jsType", null);
        setField(term1043, term1043.getClass(), "parent", null);
        setField(term1041, term1041.getClass(), "next", term1043);
        setField(term1041, term1041.getClass(), "first", term1028);
        setField(term1041, term1041.getClass(), "last", term1028);
        setField(term1041, term1041.getClass(), "propListHead", null);
        setIntField(term1041, term1041.getClass(), "sourcePosition", 0);
        setField(term1041, term1041.getClass(), "jsType", null);
        setField(term1041, term1041.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "last", term1041);
        setField(term1030, term1030.getClass(), "propListHead", null);
        setIntField(term1030, term1030.getClass(), "sourcePosition", 0);
        setField(term1030, term1030.getClass(), "jsType", null);
        setField(term1030, term1030.getClass(), "parent", null);
        setField(term1028, term1028.getClass(), "next", term1030);
        setIntField(term1048, term1048.getClass(), "type", -2119545015);
        setField(term1048, term1048.getClass(), "next", term1041);
        setField(term1048, term1048.getClass(), "first", term1043);
        setField(term1048, term1048.getClass(), "last", term1026);
        setField(term1048, term1048.getClass(), "propListHead", null);
        setIntField(term1048, term1048.getClass(), "sourcePosition", 0);
        setField(term1048, term1048.getClass(), "jsType", null);
        setField(term1048, term1048.getClass(), "parent", null);
        setField(term1028, term1028.getClass(), "first", term1048);
        setField(term1028, term1028.getClass(), "last", term1048);
        setField(term1028, term1028.getClass(), "propListHead", null);
        setIntField(term1028, term1028.getClass(), "sourcePosition", 0);
        setField(term1028, term1028.getClass(), "jsType", null);
        setField(term1028, term1028.getClass(), "parent", null);
        setField(term1026, term1026.getClass(), "next", term1028);
        setField(term1026, term1026.getClass(), "first", term1032);
        setField(term1026, term1026.getClass(), "last", term1034);
        setField(term1026, term1026.getClass(), "propListHead", null);
        setIntField(term1026, term1026.getClass(), "sourcePosition", 0);
        setField(term1026, term1026.getClass(), "jsType", null);
        setField(term1026, term1026.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term1026;
        args[1] = null;
        try {
            callMethod(klass, "anyResultsMatch", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


