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

public class IR_voidNode_54812825205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25736;
     Object term26080;
     Object term25998;

    public IR_voidNode_54812825205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25736, term25736.getClass(), "type", 96);
        term26080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26080, term26080.getClass(), "type", 96);
        setField(term26080, term26080.getClass(), "next", null);
        setField(term26080, term26080.getClass(), "first", null);
        setField(term26080, term26080.getClass(), "last", null);
        setField(term26080, term26080.getClass(), "propListHead", null);
        setIntField(term26080, term26080.getClass(), "sourcePosition", 0);
        setField(term26080, term26080.getClass(), "jsType", null);
        setIntField(term26081, term26081.getClass(), "type", 122);
        setField(term26081, term26081.getClass(), "next", null);
        setField(term26081, term26081.getClass(), "first", term26080);
        setField(term26081, term26081.getClass(), "last", term26080);
        setField(term26081, term26081.getClass(), "propListHead", null);
        setIntField(term26081, term26081.getClass(), "sourcePosition", -1);
        setField(term26081, term26081.getClass(), "jsType", null);
        setField(term26081, term26081.getClass(), "parent", null);
        setField(term26080, term26080.getClass(), "parent", term26081);
        term25998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25998, term25998.getClass(), "type", 122);
        setField(term25998, term25998.getClass(), "next", null);
        setIntField(term25995, term25995.getClass(), "type", 96);
        setField(term25995, term25995.getClass(), "next", null);
        setField(term25995, term25995.getClass(), "first", null);
        setField(term25995, term25995.getClass(), "last", null);
        setField(term25995, term25995.getClass(), "propListHead", null);
        setIntField(term25995, term25995.getClass(), "sourcePosition", 0);
        setField(term25995, term25995.getClass(), "jsType", null);
        setField(term25995, term25995.getClass(), "parent", term25998);
        setField(term25998, term25998.getClass(), "first", term25995);
        setField(term25998, term25998.getClass(), "last", term25995);
        setField(term25998, term25998.getClass(), "propListHead", null);
        setIntField(term25998, term25998.getClass(), "sourcePosition", -1);
        setField(term25998, term25998.getClass(), "jsType", null);
        setField(term25998, term25998.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25736;
        Object retValue = callMethod(klass, "voidNode", argTypes, null, args);
        assertTrue(recursiveEquals(term25736, term26080));
        assertTrue(recursiveEquals(retValue, term25998));
    }

};


