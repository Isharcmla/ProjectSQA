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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_normalizeLabels_44170224618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;
     Object term458;

    public Normalize_normalizeLabels_44170224618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term456, term456.getClass(), "compiler", null);
        setBooleanField(term456, term456.getClass(), "assertOnChange", true);
        term458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term471 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term481 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term458, term458.getClass(), "type", 1474524152);
        setIntField(term460, term460.getClass(), "type", 1107176718);
        setIntField(term462, term462.getClass(), "type", 0);
        setField(term462, term462.getClass(), "next", null);
        setField(term462, term462.getClass(), "first", null);
        setField(term462, term462.getClass(), "last", null);
        setField(term462, term462.getClass(), "propListHead", null);
        setIntField(term462, term462.getClass(), "sourcePosition", 0);
        setField(term462, term462.getClass(), "jsType", null);
        setField(term462, term462.getClass(), "parent", null);
        setField(term460, term460.getClass(), "next", term462);
        setIntField(term465, term465.getClass(), "type", 0);
        setField(term465, term465.getClass(), "next", null);
        setField(term465, term465.getClass(), "first", null);
        setField(term465, term465.getClass(), "last", null);
        setField(term465, term465.getClass(), "propListHead", null);
        setIntField(term465, term465.getClass(), "sourcePosition", 0);
        setField(term465, term465.getClass(), "jsType", null);
        setField(term465, term465.getClass(), "parent", null);
        setField(term460, term460.getClass(), "first", term465);
        setIntField(term468, term468.getClass(), "type", 0);
        setField(term468, term468.getClass(), "next", null);
        setField(term468, term468.getClass(), "first", null);
        setField(term468, term468.getClass(), "last", null);
        setField(term468, term468.getClass(), "propListHead", null);
        setIntField(term468, term468.getClass(), "sourcePosition", 0);
        setField(term468, term468.getClass(), "jsType", null);
        setField(term468, term468.getClass(), "parent", null);
        setField(term460, term460.getClass(), "last", term468);
        setField(term471, term471.getClass(), "next", null);
        setIntField(term471, term471.getClass(), "type", 0);
        setIntField(term471, term471.getClass(), "intValue", 0);
        setField(term471, term471.getClass(), "objectValue", null);
        setField(term460, term460.getClass(), "propListHead", term471);
        setIntField(term460, term460.getClass(), "sourcePosition", -2015854073);
        setField(term460, term460.getClass(), "jsType", null);
        setField(term460, term460.getClass(), "parent", null);
        setField(term458, term458.getClass(), "next", term460);
        setIntField(term475, term475.getClass(), "type", 0);
        setField(term475, term475.getClass(), "next", null);
        setField(term475, term475.getClass(), "first", null);
        setField(term475, term475.getClass(), "last", null);
        setField(term475, term475.getClass(), "propListHead", null);
        setIntField(term475, term475.getClass(), "sourcePosition", 0);
        setField(term475, term475.getClass(), "jsType", null);
        setField(term475, term475.getClass(), "parent", null);
        setField(term458, term458.getClass(), "first", term475);
        setIntField(term478, term478.getClass(), "type", 0);
        setField(term478, term478.getClass(), "next", null);
        setField(term478, term478.getClass(), "first", null);
        setField(term478, term478.getClass(), "last", null);
        setField(term478, term478.getClass(), "propListHead", null);
        setIntField(term478, term478.getClass(), "sourcePosition", 0);
        setField(term478, term478.getClass(), "jsType", null);
        setField(term478, term478.getClass(), "parent", null);
        setField(term458, term458.getClass(), "last", term478);
        setField(term481, term481.getClass(), "next", null);
        setIntField(term481, term481.getClass(), "type", 0);
        setIntField(term481, term481.getClass(), "intValue", 0);
        setField(term481, term481.getClass(), "objectValue", null);
        setField(term458, term458.getClass(), "propListHead", term481);
        setIntField(term458, term458.getClass(), "sourcePosition", 538259104);
        setField(term458, term458.getClass(), "jsType", null);
        setField(term458, term458.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term458;
        try {
            callMethod(klass, "normalizeLabels", argTypes, term456, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


