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
import java.lang.Object;

public class NodeUtil_mayBeStringHelper_1019295344197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1159;
     Object term11167;

    public NodeUtil_mayBeStringHelper_1019295344197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1172 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1182 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1159, term1159.getClass(), "type", 243280944);
        setIntField(term1161, term1161.getClass(), "type", 202214133);
        setIntField(term1163, term1163.getClass(), "type", 0);
        setField(term1163, term1163.getClass(), "next", null);
        setField(term1163, term1163.getClass(), "first", null);
        setField(term1163, term1163.getClass(), "last", null);
        setField(term1163, term1163.getClass(), "propListHead", null);
        setIntField(term1163, term1163.getClass(), "sourcePosition", 0);
        setField(term1163, term1163.getClass(), "jsType", null);
        setField(term1163, term1163.getClass(), "parent", null);
        setField(term1161, term1161.getClass(), "next", term1163);
        setIntField(term1166, term1166.getClass(), "type", 0);
        setField(term1166, term1166.getClass(), "next", null);
        setField(term1166, term1166.getClass(), "first", null);
        setField(term1166, term1166.getClass(), "last", null);
        setField(term1166, term1166.getClass(), "propListHead", null);
        setIntField(term1166, term1166.getClass(), "sourcePosition", 0);
        setField(term1166, term1166.getClass(), "jsType", null);
        setField(term1166, term1166.getClass(), "parent", null);
        setField(term1161, term1161.getClass(), "first", term1166);
        setIntField(term1169, term1169.getClass(), "type", 0);
        setField(term1169, term1169.getClass(), "next", null);
        setField(term1169, term1169.getClass(), "first", null);
        setField(term1169, term1169.getClass(), "last", null);
        setField(term1169, term1169.getClass(), "propListHead", null);
        setIntField(term1169, term1169.getClass(), "sourcePosition", 0);
        setField(term1169, term1169.getClass(), "jsType", null);
        setField(term1169, term1169.getClass(), "parent", null);
        setField(term1161, term1161.getClass(), "last", term1169);
        setField(term1172, term1172.getClass(), "next", null);
        setIntField(term1172, term1172.getClass(), "type", 0);
        setIntField(term1172, term1172.getClass(), "intValue", 0);
        setField(term1172, term1172.getClass(), "objectValue", null);
        setField(term1161, term1161.getClass(), "propListHead", term1172);
        setIntField(term1161, term1161.getClass(), "sourcePosition", -222941705);
        setField(term1161, term1161.getClass(), "jsType", null);
        setField(term1161, term1161.getClass(), "parent", null);
        setField(term1159, term1159.getClass(), "next", term1161);
        setIntField(term1176, term1176.getClass(), "type", 0);
        setField(term1176, term1176.getClass(), "next", null);
        setField(term1176, term1176.getClass(), "first", null);
        setField(term1176, term1176.getClass(), "last", null);
        setField(term1176, term1176.getClass(), "propListHead", null);
        setIntField(term1176, term1176.getClass(), "sourcePosition", 0);
        setField(term1176, term1176.getClass(), "jsType", null);
        setField(term1176, term1176.getClass(), "parent", null);
        setField(term1159, term1159.getClass(), "first", term1176);
        setIntField(term1179, term1179.getClass(), "type", 0);
        setField(term1179, term1179.getClass(), "next", null);
        setField(term1179, term1179.getClass(), "first", null);
        setField(term1179, term1179.getClass(), "last", null);
        setField(term1179, term1179.getClass(), "propListHead", null);
        setIntField(term1179, term1179.getClass(), "sourcePosition", 0);
        setField(term1179, term1179.getClass(), "jsType", null);
        setField(term1179, term1179.getClass(), "parent", null);
        setField(term1159, term1159.getClass(), "last", term1179);
        setField(term1182, term1182.getClass(), "next", null);
        setIntField(term1182, term1182.getClass(), "type", 0);
        setIntField(term1182, term1182.getClass(), "intValue", 0);
        setField(term1182, term1182.getClass(), "objectValue", null);
        setField(term1159, term1159.getClass(), "propListHead", term1182);
        setIntField(term1159, term1159.getClass(), "sourcePosition", 291864719);
        setField(term1159, term1159.getClass(), "jsType", null);
        setField(term1159, term1159.getClass(), "parent", null);
        term11167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11172 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11175 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11167, term11167.getClass(), "type", 243280944);
        setIntField(term11168, term11168.getClass(), "type", 202214133);
        setIntField(term11169, term11169.getClass(), "type", 0);
        setField(term11169, term11169.getClass(), "next", null);
        setField(term11169, term11169.getClass(), "first", null);
        setField(term11169, term11169.getClass(), "last", null);
        setField(term11169, term11169.getClass(), "propListHead", null);
        setIntField(term11169, term11169.getClass(), "sourcePosition", 0);
        setField(term11169, term11169.getClass(), "jsType", null);
        setField(term11169, term11169.getClass(), "parent", null);
        setField(term11168, term11168.getClass(), "next", term11169);
        setIntField(term11170, term11170.getClass(), "type", 0);
        setField(term11170, term11170.getClass(), "next", null);
        setField(term11170, term11170.getClass(), "first", null);
        setField(term11170, term11170.getClass(), "last", null);
        setField(term11170, term11170.getClass(), "propListHead", null);
        setIntField(term11170, term11170.getClass(), "sourcePosition", 0);
        setField(term11170, term11170.getClass(), "jsType", null);
        setField(term11170, term11170.getClass(), "parent", null);
        setField(term11168, term11168.getClass(), "first", term11170);
        setIntField(term11171, term11171.getClass(), "type", 0);
        setField(term11171, term11171.getClass(), "next", null);
        setField(term11171, term11171.getClass(), "first", null);
        setField(term11171, term11171.getClass(), "last", null);
        setField(term11171, term11171.getClass(), "propListHead", null);
        setIntField(term11171, term11171.getClass(), "sourcePosition", 0);
        setField(term11171, term11171.getClass(), "jsType", null);
        setField(term11171, term11171.getClass(), "parent", null);
        setField(term11168, term11168.getClass(), "last", term11171);
        setField(term11172, term11172.getClass(), "next", null);
        setIntField(term11172, term11172.getClass(), "type", 0);
        setIntField(term11172, term11172.getClass(), "intValue", 0);
        setField(term11172, term11172.getClass(), "objectValue", null);
        setField(term11168, term11168.getClass(), "propListHead", term11172);
        setIntField(term11168, term11168.getClass(), "sourcePosition", -222941705);
        setField(term11168, term11168.getClass(), "jsType", null);
        setField(term11168, term11168.getClass(), "parent", null);
        setField(term11167, term11167.getClass(), "next", term11168);
        setIntField(term11173, term11173.getClass(), "type", 0);
        setField(term11173, term11173.getClass(), "next", null);
        setField(term11173, term11173.getClass(), "first", null);
        setField(term11173, term11173.getClass(), "last", null);
        setField(term11173, term11173.getClass(), "propListHead", null);
        setIntField(term11173, term11173.getClass(), "sourcePosition", 0);
        setField(term11173, term11173.getClass(), "jsType", null);
        setField(term11173, term11173.getClass(), "parent", null);
        setField(term11167, term11167.getClass(), "first", term11173);
        setIntField(term11174, term11174.getClass(), "type", 0);
        setField(term11174, term11174.getClass(), "next", null);
        setField(term11174, term11174.getClass(), "first", null);
        setField(term11174, term11174.getClass(), "last", null);
        setField(term11174, term11174.getClass(), "propListHead", null);
        setIntField(term11174, term11174.getClass(), "sourcePosition", 0);
        setField(term11174, term11174.getClass(), "jsType", null);
        setField(term11174, term11174.getClass(), "parent", null);
        setField(term11167, term11167.getClass(), "last", term11174);
        setField(term11175, term11175.getClass(), "next", null);
        setIntField(term11175, term11175.getClass(), "type", 0);
        setIntField(term11175, term11175.getClass(), "intValue", 0);
        setField(term11175, term11175.getClass(), "objectValue", null);
        setField(term11167, term11167.getClass(), "propListHead", term11175);
        setIntField(term11167, term11167.getClass(), "sourcePosition", 291864719);
        setField(term11167, term11167.getClass(), "jsType", null);
        setField(term11167, term11167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1159;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term1159, term11167));
        assertTrue(recursiveEquals(retValue, true));
    }

};


