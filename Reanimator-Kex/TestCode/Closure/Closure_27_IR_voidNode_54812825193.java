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

public class IR_voidNode_54812825193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23784;
     Object term24031;
     Object term23949;

    public IR_voidNode_54812825193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23784, term23784.getClass(), "type", 44);
        term24031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24031, term24031.getClass(), "type", 44);
        setField(term24031, term24031.getClass(), "next", null);
        setField(term24031, term24031.getClass(), "first", null);
        setField(term24031, term24031.getClass(), "last", null);
        setField(term24031, term24031.getClass(), "propListHead", null);
        setIntField(term24031, term24031.getClass(), "sourcePosition", 0);
        setField(term24031, term24031.getClass(), "jsType", null);
        setIntField(term24032, term24032.getClass(), "type", 122);
        setField(term24032, term24032.getClass(), "next", null);
        setField(term24032, term24032.getClass(), "first", term24031);
        setField(term24032, term24032.getClass(), "last", term24031);
        setField(term24032, term24032.getClass(), "propListHead", null);
        setIntField(term24032, term24032.getClass(), "sourcePosition", -1);
        setField(term24032, term24032.getClass(), "jsType", null);
        setField(term24032, term24032.getClass(), "parent", null);
        setField(term24031, term24031.getClass(), "parent", term24032);
        term23949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23949, term23949.getClass(), "type", 122);
        setField(term23949, term23949.getClass(), "next", null);
        setIntField(term23946, term23946.getClass(), "type", 44);
        setField(term23946, term23946.getClass(), "next", null);
        setField(term23946, term23946.getClass(), "first", null);
        setField(term23946, term23946.getClass(), "last", null);
        setField(term23946, term23946.getClass(), "propListHead", null);
        setIntField(term23946, term23946.getClass(), "sourcePosition", 0);
        setField(term23946, term23946.getClass(), "jsType", null);
        setField(term23946, term23946.getClass(), "parent", term23949);
        setField(term23949, term23949.getClass(), "first", term23946);
        setField(term23949, term23949.getClass(), "last", term23946);
        setField(term23949, term23949.getClass(), "propListHead", null);
        setIntField(term23949, term23949.getClass(), "sourcePosition", -1);
        setField(term23949, term23949.getClass(), "jsType", null);
        setField(term23949, term23949.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23784;
        Object retValue = callMethod(klass, "voidNode", argTypes, null, args);
        assertTrue(recursiveEquals(term23784, term24031));
        assertTrue(recursiveEquals(retValue, term23949));
    }

};


