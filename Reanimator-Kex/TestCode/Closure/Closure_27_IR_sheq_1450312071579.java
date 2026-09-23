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

public class IR_sheq_1450312071579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86047;
     Object term86745;
     Object term86747;
     Object term86564;

    public IR_sheq_1450312071579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86047, term86047.getClass(), "type", 21);
        term86745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86745, term86745.getClass(), "type", 21);
        setField(term86745, term86745.getClass(), "next", null);
        setField(term86745, term86745.getClass(), "first", null);
        setField(term86745, term86745.getClass(), "last", null);
        setField(term86745, term86745.getClass(), "propListHead", null);
        setIntField(term86745, term86745.getClass(), "sourcePosition", 0);
        setField(term86745, term86745.getClass(), "jsType", null);
        setIntField(term86746, term86746.getClass(), "type", 45);
        setField(term86746, term86746.getClass(), "next", null);
        setField(term86746, term86746.getClass(), "first", term86745);
        setField(term86746, term86746.getClass(), "last", term86745);
        setField(term86746, term86746.getClass(), "propListHead", null);
        setIntField(term86746, term86746.getClass(), "sourcePosition", -1);
        setField(term86746, term86746.getClass(), "jsType", null);
        setField(term86746, term86746.getClass(), "parent", null);
        setField(term86745, term86745.getClass(), "parent", term86746);
        term86747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86747, term86747.getClass(), "type", 21);
        setField(term86747, term86747.getClass(), "next", null);
        setField(term86747, term86747.getClass(), "first", null);
        setField(term86747, term86747.getClass(), "last", null);
        setField(term86747, term86747.getClass(), "propListHead", null);
        setIntField(term86747, term86747.getClass(), "sourcePosition", 0);
        setField(term86747, term86747.getClass(), "jsType", null);
        setIntField(term86748, term86748.getClass(), "type", 45);
        setField(term86748, term86748.getClass(), "next", null);
        setField(term86748, term86748.getClass(), "first", term86747);
        setField(term86748, term86748.getClass(), "last", term86747);
        setField(term86748, term86748.getClass(), "propListHead", null);
        setIntField(term86748, term86748.getClass(), "sourcePosition", -1);
        setField(term86748, term86748.getClass(), "jsType", null);
        setField(term86748, term86748.getClass(), "parent", null);
        setField(term86747, term86747.getClass(), "parent", term86748);
        term86564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86564, term86564.getClass(), "type", 45);
        setField(term86564, term86564.getClass(), "next", null);
        setIntField(term86561, term86561.getClass(), "type", 21);
        setField(term86561, term86561.getClass(), "next", null);
        setField(term86561, term86561.getClass(), "first", null);
        setField(term86561, term86561.getClass(), "last", null);
        setField(term86561, term86561.getClass(), "propListHead", null);
        setIntField(term86561, term86561.getClass(), "sourcePosition", 0);
        setField(term86561, term86561.getClass(), "jsType", null);
        setField(term86561, term86561.getClass(), "parent", term86564);
        setField(term86564, term86564.getClass(), "first", term86561);
        setField(term86564, term86564.getClass(), "last", term86561);
        setField(term86564, term86564.getClass(), "propListHead", null);
        setIntField(term86564, term86564.getClass(), "sourcePosition", -1);
        setField(term86564, term86564.getClass(), "jsType", null);
        setField(term86564, term86564.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term86047;
        args[1] = term86047;
        Object retValue = callMethod(klass, "sheq", argTypes, null, args);
        assertTrue(recursiveEquals(term86047, term86745));
        assertTrue(recursiveEquals(term86047, term86747));
        assertTrue(recursiveEquals(retValue, term86564));
    }

};


