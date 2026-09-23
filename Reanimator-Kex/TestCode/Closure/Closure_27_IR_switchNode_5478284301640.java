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

public class IR_switchNode_5478284301640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281486;
     Object term281389;
     Object term281744;
     Object term281746;
     Object term281666;

    public IR_switchNode_5478284301640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term281486, term281486.getClass(), "type", 101);
        setField(term281486, term281486.getClass(), "parent", null);
        setField(term281486, term281486.getClass(), "next", null);
        term281389 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term281744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term281745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term281744, term281744.getClass(), "type", 101);
        setField(term281744, term281744.getClass(), "next", null);
        setField(term281744, term281744.getClass(), "first", null);
        setField(term281744, term281744.getClass(), "last", null);
        setField(term281744, term281744.getClass(), "propListHead", null);
        setIntField(term281744, term281744.getClass(), "sourcePosition", 0);
        setField(term281744, term281744.getClass(), "jsType", null);
        setIntField(term281745, term281745.getClass(), "type", 110);
        setField(term281745, term281745.getClass(), "next", null);
        setField(term281745, term281745.getClass(), "first", term281744);
        setField(term281745, term281745.getClass(), "last", term281744);
        setField(term281745, term281745.getClass(), "propListHead", null);
        setIntField(term281745, term281745.getClass(), "sourcePosition", -1);
        setField(term281745, term281745.getClass(), "jsType", null);
        setField(term281745, term281745.getClass(), "parent", null);
        setField(term281744, term281744.getClass(), "parent", term281745);
        term281746 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term281666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term281663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term281666, term281666.getClass(), "type", 110);
        setField(term281666, term281666.getClass(), "next", null);
        setIntField(term281663, term281663.getClass(), "type", 101);
        setField(term281663, term281663.getClass(), "next", null);
        setField(term281663, term281663.getClass(), "first", null);
        setField(term281663, term281663.getClass(), "last", null);
        setField(term281663, term281663.getClass(), "propListHead", null);
        setIntField(term281663, term281663.getClass(), "sourcePosition", 0);
        setField(term281663, term281663.getClass(), "jsType", null);
        setField(term281663, term281663.getClass(), "parent", term281666);
        setField(term281666, term281666.getClass(), "first", term281663);
        setField(term281666, term281666.getClass(), "last", term281663);
        setField(term281666, term281666.getClass(), "propListHead", null);
        setIntField(term281666, term281666.getClass(), "sourcePosition", -1);
        setField(term281666, term281666.getClass(), "jsType", null);
        setField(term281666, term281666.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term281486;
        args[1] = term281389;
        Object retValue = callMethod(klass, "switchNode", argTypes, null, args);
        assertTrue(recursiveEquals(term281486, term281744));
        assertTrue(recursiveEquals(term281389, term281746));
        assertTrue(recursiveEquals(retValue, term281666));
    }

};


