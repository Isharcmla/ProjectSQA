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

public class TypeCheck_visitAssign_1165544828239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65525;
     Object term65595;

    public TypeCheck_visitAssign_1165544828239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65525 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term65595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65691 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term65761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term65927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65691, term65691.getClass(), "type", -30);
        setField(term65691, term65691.getClass(), "next", null);
        setField(term65595, term65595.getClass(), "propListHead", term65691);
        setIntField(term65761, term65761.getClass(), "type", 0);
        setField(term65761, term65761.getClass(), "jsType", term65857);
        setField(term65595, term65595.getClass(), "first", term65761);
        setField(term65595, term65595.getClass(), "last", term65927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term65595;
        try {
            callMethod(klass, "visitAssign", argTypes, term65525, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


