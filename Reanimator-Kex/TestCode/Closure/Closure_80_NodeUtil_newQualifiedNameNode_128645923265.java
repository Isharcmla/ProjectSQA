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

public class NodeUtil_newQualifiedNameNode_128645923265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3151;

    public NodeUtil_newQualifiedNameNode_128645923265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3164 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3174 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3151, term3151.getClass(), "type", -2072469750);
        setIntField(term3153, term3153.getClass(), "type", -1445089135);
        setIntField(term3155, term3155.getClass(), "type", 0);
        setField(term3155, term3155.getClass(), "next", null);
        setField(term3155, term3155.getClass(), "first", null);
        setField(term3155, term3155.getClass(), "last", null);
        setField(term3155, term3155.getClass(), "propListHead", null);
        setIntField(term3155, term3155.getClass(), "sourcePosition", 0);
        setField(term3155, term3155.getClass(), "jsType", null);
        setField(term3155, term3155.getClass(), "parent", null);
        setField(term3153, term3153.getClass(), "next", term3155);
        setIntField(term3158, term3158.getClass(), "type", 0);
        setField(term3158, term3158.getClass(), "next", null);
        setField(term3158, term3158.getClass(), "first", null);
        setField(term3158, term3158.getClass(), "last", null);
        setField(term3158, term3158.getClass(), "propListHead", null);
        setIntField(term3158, term3158.getClass(), "sourcePosition", 0);
        setField(term3158, term3158.getClass(), "jsType", null);
        setField(term3158, term3158.getClass(), "parent", null);
        setField(term3153, term3153.getClass(), "first", term3158);
        setIntField(term3161, term3161.getClass(), "type", 0);
        setField(term3161, term3161.getClass(), "next", null);
        setField(term3161, term3161.getClass(), "first", null);
        setField(term3161, term3161.getClass(), "last", null);
        setField(term3161, term3161.getClass(), "propListHead", null);
        setIntField(term3161, term3161.getClass(), "sourcePosition", 0);
        setField(term3161, term3161.getClass(), "jsType", null);
        setField(term3161, term3161.getClass(), "parent", null);
        setField(term3153, term3153.getClass(), "last", term3161);
        setField(term3164, term3164.getClass(), "next", null);
        setIntField(term3164, term3164.getClass(), "type", 0);
        setIntField(term3164, term3164.getClass(), "intValue", 0);
        setField(term3164, term3164.getClass(), "objectValue", null);
        setField(term3153, term3153.getClass(), "propListHead", term3164);
        setIntField(term3153, term3153.getClass(), "sourcePosition", 584949609);
        setField(term3153, term3153.getClass(), "jsType", null);
        setField(term3153, term3153.getClass(), "parent", null);
        setField(term3151, term3151.getClass(), "next", term3153);
        setIntField(term3168, term3168.getClass(), "type", 0);
        setField(term3168, term3168.getClass(), "next", null);
        setField(term3168, term3168.getClass(), "first", null);
        setField(term3168, term3168.getClass(), "last", null);
        setField(term3168, term3168.getClass(), "propListHead", null);
        setIntField(term3168, term3168.getClass(), "sourcePosition", 0);
        setField(term3168, term3168.getClass(), "jsType", null);
        setField(term3168, term3168.getClass(), "parent", null);
        setField(term3151, term3151.getClass(), "first", term3168);
        setIntField(term3171, term3171.getClass(), "type", 0);
        setField(term3171, term3171.getClass(), "next", null);
        setField(term3171, term3171.getClass(), "first", null);
        setField(term3171, term3171.getClass(), "last", null);
        setField(term3171, term3171.getClass(), "propListHead", null);
        setIntField(term3171, term3171.getClass(), "sourcePosition", 0);
        setField(term3171, term3171.getClass(), "jsType", null);
        setField(term3171, term3171.getClass(), "parent", null);
        setField(term3151, term3151.getClass(), "last", term3171);
        setField(term3174, term3174.getClass(), "next", null);
        setIntField(term3174, term3174.getClass(), "type", 0);
        setIntField(term3174, term3174.getClass(), "intValue", 0);
        setField(term3174, term3174.getClass(), "objectValue", null);
        setField(term3151, term3151.getClass(), "propListHead", term3174);
        setIntField(term3151, term3151.getClass(), "sourcePosition", 879795058);
        setField(term3151, term3151.getClass(), "jsType", null);
        setField(term3151, term3151.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "ZiaGIbnzTs";
        args[2] = term3151;
        args[3] = "tbcdzjIfER";
        try {
            callMethod(klass, "newQualifiedNameNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


