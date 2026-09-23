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

public class NodeUtil_newName_29866120269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3351;

    public NodeUtil_newName_29866120269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3364 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3374 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3351, term3351.getClass(), "type", -1929689681);
        setIntField(term3353, term3353.getClass(), "type", -215979293);
        setIntField(term3355, term3355.getClass(), "type", 0);
        setField(term3355, term3355.getClass(), "next", null);
        setField(term3355, term3355.getClass(), "first", null);
        setField(term3355, term3355.getClass(), "last", null);
        setField(term3355, term3355.getClass(), "propListHead", null);
        setIntField(term3355, term3355.getClass(), "sourcePosition", 0);
        setField(term3355, term3355.getClass(), "jsType", null);
        setField(term3355, term3355.getClass(), "parent", null);
        setField(term3353, term3353.getClass(), "next", term3355);
        setIntField(term3358, term3358.getClass(), "type", 0);
        setField(term3358, term3358.getClass(), "next", null);
        setField(term3358, term3358.getClass(), "first", null);
        setField(term3358, term3358.getClass(), "last", null);
        setField(term3358, term3358.getClass(), "propListHead", null);
        setIntField(term3358, term3358.getClass(), "sourcePosition", 0);
        setField(term3358, term3358.getClass(), "jsType", null);
        setField(term3358, term3358.getClass(), "parent", null);
        setField(term3353, term3353.getClass(), "first", term3358);
        setIntField(term3361, term3361.getClass(), "type", 0);
        setField(term3361, term3361.getClass(), "next", null);
        setField(term3361, term3361.getClass(), "first", null);
        setField(term3361, term3361.getClass(), "last", null);
        setField(term3361, term3361.getClass(), "propListHead", null);
        setIntField(term3361, term3361.getClass(), "sourcePosition", 0);
        setField(term3361, term3361.getClass(), "jsType", null);
        setField(term3361, term3361.getClass(), "parent", null);
        setField(term3353, term3353.getClass(), "last", term3361);
        setField(term3364, term3364.getClass(), "next", null);
        setIntField(term3364, term3364.getClass(), "type", 0);
        setIntField(term3364, term3364.getClass(), "intValue", 0);
        setField(term3364, term3364.getClass(), "objectValue", null);
        setField(term3353, term3353.getClass(), "propListHead", term3364);
        setIntField(term3353, term3353.getClass(), "sourcePosition", 1702404702);
        setField(term3353, term3353.getClass(), "jsType", null);
        setField(term3353, term3353.getClass(), "parent", null);
        setField(term3351, term3351.getClass(), "next", term3353);
        setIntField(term3368, term3368.getClass(), "type", 0);
        setField(term3368, term3368.getClass(), "next", null);
        setField(term3368, term3368.getClass(), "first", null);
        setField(term3368, term3368.getClass(), "last", null);
        setField(term3368, term3368.getClass(), "propListHead", null);
        setIntField(term3368, term3368.getClass(), "sourcePosition", 0);
        setField(term3368, term3368.getClass(), "jsType", null);
        setField(term3368, term3368.getClass(), "parent", null);
        setField(term3351, term3351.getClass(), "first", term3368);
        setIntField(term3371, term3371.getClass(), "type", 0);
        setField(term3371, term3371.getClass(), "next", null);
        setField(term3371, term3371.getClass(), "first", null);
        setField(term3371, term3371.getClass(), "last", null);
        setField(term3371, term3371.getClass(), "propListHead", null);
        setIntField(term3371, term3371.getClass(), "sourcePosition", 0);
        setField(term3371, term3371.getClass(), "jsType", null);
        setField(term3371, term3371.getClass(), "parent", null);
        setField(term3351, term3351.getClass(), "last", term3371);
        setField(term3374, term3374.getClass(), "next", null);
        setIntField(term3374, term3374.getClass(), "type", 0);
        setIntField(term3374, term3374.getClass(), "intValue", 0);
        setField(term3374, term3374.getClass(), "objectValue", null);
        setField(term3351, term3351.getClass(), "propListHead", term3374);
        setIntField(term3351, term3351.getClass(), "sourcePosition", 1141592999);
        setField(term3351, term3351.getClass(), "jsType", null);
        setField(term3351, term3351.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "hNxWaHcfhY";
        args[2] = term3351;
        try {
            callMethod(klass, "newName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


