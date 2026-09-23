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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Node_init_95027287219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;
     Object term585;
     Object term613;
     Object term615;

    public Node_init_95027287219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term583 = new Integer(982388293);
        term585 = (Object[]) newArray("com.google.javascript.rhino.Node", 5);
        Object term586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term586, term586.getClass(), "type", -159494544);
        setIntField(term588, term588.getClass(), "type", -75206835);
        setIntField(term590, term590.getClass(), "type", -1618206977);
        setIntField(term592, term592.getClass(), "type", -1747406163);
        setField(term592, term592.getClass(), "next", null);
        setField(term592, term592.getClass(), "first", null);
        setField(term592, term592.getClass(), "last", term590);
        setField(term592, term592.getClass(), "propListHead", null);
        setIntField(term592, term592.getClass(), "sourcePosition", 0);
        setField(term592, term592.getClass(), "jsType", null);
        setField(term592, term592.getClass(), "parent", null);
        setField(term590, term590.getClass(), "next", term592);
        setIntField(term595, term595.getClass(), "type", 388157121);
        setField(term595, term595.getClass(), "next", null);
        setField(term595, term595.getClass(), "first", null);
        setField(term595, term595.getClass(), "last", null);
        setField(term595, term595.getClass(), "propListHead", null);
        setIntField(term595, term595.getClass(), "sourcePosition", 0);
        setField(term595, term595.getClass(), "jsType", null);
        setField(term595, term595.getClass(), "parent", null);
        setField(term590, term590.getClass(), "first", term595);
        setIntField(term598, term598.getClass(), "type", 1270666529);
        setField(term598, term598.getClass(), "next", null);
        setField(term598, term598.getClass(), "first", term588);
        setField(term598, term598.getClass(), "last", term588);
        setField(term598, term598.getClass(), "propListHead", null);
        setIntField(term598, term598.getClass(), "sourcePosition", 0);
        setField(term598, term598.getClass(), "jsType", null);
        setField(term598, term598.getClass(), "parent", null);
        setField(term590, term590.getClass(), "last", term598);
        setField(term590, term590.getClass(), "propListHead", null);
        setIntField(term590, term590.getClass(), "sourcePosition", 0);
        setField(term590, term590.getClass(), "jsType", null);
        setField(term590, term590.getClass(), "parent", null);
        setField(term588, term588.getClass(), "next", term590);
        setIntField(term602, term602.getClass(), "type", -860131894);
        setField(term602, term602.getClass(), "next", term598);
        setIntField(term604, term604.getClass(), "type", -1146679443);
        setField(term604, term604.getClass(), "next", term602);
        setField(term604, term604.getClass(), "first", null);
        setField(term604, term604.getClass(), "last", term592);
        setField(term604, term604.getClass(), "propListHead", null);
        setIntField(term604, term604.getClass(), "sourcePosition", 0);
        setField(term604, term604.getClass(), "jsType", null);
        setField(term604, term604.getClass(), "parent", null);
        setField(term602, term602.getClass(), "first", term604);
        setField(term602, term602.getClass(), "last", term586);
        setField(term602, term602.getClass(), "propListHead", null);
        setIntField(term602, term602.getClass(), "sourcePosition", 0);
        setField(term602, term602.getClass(), "jsType", null);
        setField(term602, term602.getClass(), "parent", null);
        setField(term588, term588.getClass(), "first", term602);
        setField(term588, term588.getClass(), "last", term602);
        setField(term588, term588.getClass(), "propListHead", null);
        setIntField(term588, term588.getClass(), "sourcePosition", 0);
        setField(term588, term588.getClass(), "jsType", null);
        setField(term588, term588.getClass(), "parent", null);
        setField(term586, term586.getClass(), "next", term588);
        setField(term586, term586.getClass(), "first", term592);
        setField(term586, term586.getClass(), "last", term595);
        setField(term586, term586.getClass(), "propListHead", null);
        setIntField(term586, term586.getClass(), "sourcePosition", 0);
        setField(term586, term586.getClass(), "jsType", null);
        setField(term586, term586.getClass(), "parent", null);
        setElement(term585, 0, term586);
        setElement(term585, 1, term595);
        setElement(term585, 2, term588);
        setIntField(term610, term610.getClass(), "type", -1476644457);
        setField(term610, term610.getClass(), "next", term598);
        setField(term610, term610.getClass(), "first", term602);
        setField(term610, term610.getClass(), "last", term598);
        setField(term610, term610.getClass(), "propListHead", null);
        setIntField(term610, term610.getClass(), "sourcePosition", 0);
        setField(term610, term610.getClass(), "jsType", null);
        setField(term610, term610.getClass(), "parent", null);
        setElement(term585, 3, term610);
        setElement(term585, 4, term610);
        term613 = new Integer(-1022990421);
        term615 = new Integer(1045547089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term583;
        args[1] = term585;
        args[2] = term613;
        args[3] = term615;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


