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
import java.lang.Integer;

public class NodeUtil_getNodeTypeReferenceCount_241691030288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4030;
     Object term4057;

    public NodeUtil_getNodeTypeReferenceCount_241691030288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4030, term4030.getClass(), "type", 1594426218);
        setIntField(term4032, term4032.getClass(), "type", -2060535464);
        setIntField(term4034, term4034.getClass(), "type", -1242946317);
        setIntField(term4036, term4036.getClass(), "type", -1541566235);
        setIntField(term4038, term4038.getClass(), "type", -189738995);
        setField(term4038, term4038.getClass(), "next", null);
        setField(term4038, term4038.getClass(), "first", null);
        setField(term4038, term4038.getClass(), "last", null);
        setField(term4038, term4038.getClass(), "propListHead", null);
        setIntField(term4038, term4038.getClass(), "sourcePosition", 0);
        setField(term4038, term4038.getClass(), "jsType", null);
        setField(term4038, term4038.getClass(), "parent", null);
        setField(term4036, term4036.getClass(), "next", term4038);
        setIntField(term4041, term4041.getClass(), "type", 1943019963);
        setField(term4041, term4041.getClass(), "next", null);
        setField(term4041, term4041.getClass(), "first", null);
        setField(term4041, term4041.getClass(), "last", term4038);
        setField(term4041, term4041.getClass(), "propListHead", null);
        setIntField(term4041, term4041.getClass(), "sourcePosition", 0);
        setField(term4041, term4041.getClass(), "jsType", null);
        setField(term4041, term4041.getClass(), "parent", null);
        setField(term4036, term4036.getClass(), "first", term4041);
        setField(term4036, term4036.getClass(), "last", term4034);
        setField(term4036, term4036.getClass(), "propListHead", null);
        setIntField(term4036, term4036.getClass(), "sourcePosition", 0);
        setField(term4036, term4036.getClass(), "jsType", null);
        setField(term4036, term4036.getClass(), "parent", null);
        setField(term4034, term4034.getClass(), "next", term4036);
        setField(term4034, term4034.getClass(), "first", term4038);
        setIntField(term4045, term4045.getClass(), "type", 279675992);
        setIntField(term4047, term4047.getClass(), "type", -1626074989);
        setField(term4047, term4047.getClass(), "next", null);
        setField(term4047, term4047.getClass(), "first", term4041);
        setField(term4047, term4047.getClass(), "last", term4036);
        setField(term4047, term4047.getClass(), "propListHead", null);
        setIntField(term4047, term4047.getClass(), "sourcePosition", 0);
        setField(term4047, term4047.getClass(), "jsType", null);
        setField(term4047, term4047.getClass(), "parent", null);
        setField(term4045, term4045.getClass(), "next", term4047);
        setField(term4045, term4045.getClass(), "first", term4032);
        setField(term4045, term4045.getClass(), "last", term4032);
        setField(term4045, term4045.getClass(), "propListHead", null);
        setIntField(term4045, term4045.getClass(), "sourcePosition", 0);
        setField(term4045, term4045.getClass(), "jsType", null);
        setField(term4045, term4045.getClass(), "parent", null);
        setField(term4034, term4034.getClass(), "last", term4045);
        setField(term4034, term4034.getClass(), "propListHead", null);
        setIntField(term4034, term4034.getClass(), "sourcePosition", 0);
        setField(term4034, term4034.getClass(), "jsType", null);
        setField(term4034, term4034.getClass(), "parent", null);
        setField(term4032, term4032.getClass(), "next", term4034);
        setIntField(term4052, term4052.getClass(), "type", -552272253);
        setField(term4052, term4052.getClass(), "next", term4045);
        setField(term4052, term4052.getClass(), "first", term4047);
        setField(term4052, term4052.getClass(), "last", term4030);
        setField(term4052, term4052.getClass(), "propListHead", null);
        setIntField(term4052, term4052.getClass(), "sourcePosition", 0);
        setField(term4052, term4052.getClass(), "jsType", null);
        setField(term4052, term4052.getClass(), "parent", null);
        setField(term4032, term4032.getClass(), "first", term4052);
        setField(term4032, term4032.getClass(), "last", term4052);
        setField(term4032, term4032.getClass(), "propListHead", null);
        setIntField(term4032, term4032.getClass(), "sourcePosition", 0);
        setField(term4032, term4032.getClass(), "jsType", null);
        setField(term4032, term4032.getClass(), "parent", null);
        setField(term4030, term4030.getClass(), "next", term4032);
        setField(term4030, term4030.getClass(), "first", term4036);
        setField(term4030, term4030.getClass(), "last", term4038);
        setField(term4030, term4030.getClass(), "propListHead", null);
        setIntField(term4030, term4030.getClass(), "sourcePosition", 0);
        setField(term4030, term4030.getClass(), "jsType", null);
        setField(term4030, term4030.getClass(), "parent", null);
        term4057 = new Integer(-633523956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4030;
        args[1] = term4057;
        args[2] = null;
        try {
            callMethod(klass, "getNodeTypeReferenceCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


