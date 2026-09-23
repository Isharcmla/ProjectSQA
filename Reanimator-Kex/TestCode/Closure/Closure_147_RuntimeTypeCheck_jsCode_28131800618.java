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

public class RuntimeTypeCheck_jsCode_28131800618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8423;

    public RuntimeTypeCheck_jsCode_28131800618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term8436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term8446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term8423, term8423.getClass(), "type", 33);
        setField(term8423, term8423.getClass(), "next", null);
        setIntField(term8425, term8425.getClass(), "type", 33);
        setField(term8427, term8427.getClass(), "str", "null");
        setIntField(term8427, term8427.getClass(), "type", 40);
        setField(term8427, term8427.getClass(), "next", null);
        setField(term8427, term8427.getClass(), "first", null);
        setField(term8427, term8427.getClass(), "last", null);
        setField(term8427, term8427.getClass(), "propListHead", null);
        setIntField(term8427, term8427.getClass(), "sourcePosition", -1);
        setField(term8427, term8427.getClass(), "jsType", null);
        setField(term8427, term8427.getClass(), "parent", term8423);
        setField(term8425, term8425.getClass(), "next", term8427);
        setField(term8436, term8436.getClass(), "str", "jscomp");
        setIntField(term8436, term8436.getClass(), "type", 38);
        setField(term8446, term8446.getClass(), "str", "");
        setIntField(term8446, term8446.getClass(), "type", 40);
        setField(term8446, term8446.getClass(), "next", null);
        setField(term8446, term8446.getClass(), "first", null);
        setField(term8446, term8446.getClass(), "last", null);
        setField(term8446, term8446.getClass(), "propListHead", null);
        setIntField(term8446, term8446.getClass(), "sourcePosition", -1);
        setField(term8446, term8446.getClass(), "jsType", null);
        setField(term8446, term8446.getClass(), "parent", term8425);
        setField(term8436, term8436.getClass(), "next", term8446);
        setField(term8436, term8436.getClass(), "first", null);
        setField(term8436, term8436.getClass(), "last", null);
        setField(term8436, term8436.getClass(), "propListHead", null);
        setIntField(term8436, term8436.getClass(), "sourcePosition", -1);
        setField(term8436, term8436.getClass(), "jsType", null);
        setField(term8436, term8436.getClass(), "parent", term8425);
        setField(term8425, term8425.getClass(), "first", term8436);
        setField(term8425, term8425.getClass(), "last", term8446);
        setField(term8425, term8425.getClass(), "propListHead", null);
        setIntField(term8425, term8425.getClass(), "sourcePosition", -1);
        setField(term8425, term8425.getClass(), "jsType", null);
        setField(term8425, term8425.getClass(), "parent", term8423);
        setField(term8423, term8423.getClass(), "first", term8425);
        setField(term8423, term8423.getClass(), "last", term8427);
        setField(term8423, term8423.getClass(), "propListHead", null);
        setIntField(term8423, term8423.getClass(), "sourcePosition", -1);
        setField(term8423, term8423.getClass(), "jsType", null);
        setField(term8423, term8423.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "jsCode", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term8423));
    }

};


