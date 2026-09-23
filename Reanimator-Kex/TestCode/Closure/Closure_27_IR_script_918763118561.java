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

public class IR_script_918763118561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82998;
     Object term83726;
     Object term83699;

    public IR_script_918763118561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82998 = (Object[]) newArray("com.google.javascript.rhino.Node", 1);
        Object term83101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83101, term83101.getClass(), "type", 149);
        setField(term83101, term83101.getClass(), "parent", null);
        setField(term83101, term83101.getClass(), "next", null);
        setElement(term82998, 0, term83101);
        term83726 = (Object[]) newArray("com.google.javascript.rhino.Node", 1);
        Object term83727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83727, term83727.getClass(), "type", 149);
        setField(term83727, term83727.getClass(), "next", null);
        setField(term83727, term83727.getClass(), "first", null);
        setField(term83727, term83727.getClass(), "last", null);
        setField(term83727, term83727.getClass(), "propListHead", null);
        setIntField(term83727, term83727.getClass(), "sourcePosition", 0);
        setField(term83727, term83727.getClass(), "jsType", null);
        setIntField(term83728, term83728.getClass(), "type", 132);
        setField(term83728, term83728.getClass(), "next", null);
        setField(term83728, term83728.getClass(), "first", term83727);
        setField(term83728, term83728.getClass(), "last", term83727);
        setField(term83728, term83728.getClass(), "propListHead", null);
        setIntField(term83728, term83728.getClass(), "sourcePosition", -1);
        setField(term83728, term83728.getClass(), "jsType", null);
        setField(term83728, term83728.getClass(), "parent", null);
        setField(term83727, term83727.getClass(), "parent", term83728);
        setElement(term83726, 0, term83727);
        term83699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83699, term83699.getClass(), "type", 132);
        setField(term83699, term83699.getClass(), "next", null);
        setIntField(term83701, term83701.getClass(), "type", 149);
        setField(term83701, term83701.getClass(), "next", null);
        setField(term83701, term83701.getClass(), "first", null);
        setField(term83701, term83701.getClass(), "last", null);
        setField(term83701, term83701.getClass(), "propListHead", null);
        setIntField(term83701, term83701.getClass(), "sourcePosition", 0);
        setField(term83701, term83701.getClass(), "jsType", null);
        setField(term83701, term83701.getClass(), "parent", term83699);
        setField(term83699, term83699.getClass(), "first", term83701);
        setField(term83699, term83699.getClass(), "last", term83701);
        setField(term83699, term83699.getClass(), "propListHead", null);
        setIntField(term83699, term83699.getClass(), "sourcePosition", -1);
        setField(term83699, term83699.getClass(), "jsType", null);
        setField(term83699, term83699.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term82998;
        Object retValue = callMethod(klass, "script", argTypes, null, args);
        assertTrue(recursiveEquals(term82998, term83726));
        assertTrue(recursiveEquals(retValue, term83699));
    }

};


