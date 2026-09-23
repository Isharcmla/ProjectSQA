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

public class NodeUtil_isName_1555326690155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term924;
     Object term8653;

    public NodeUtil_isName_1555326690155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term937 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term947 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term924, term924.getClass(), "type", -1702055571);
        setIntField(term926, term926.getClass(), "type", 2143282300);
        setIntField(term928, term928.getClass(), "type", 0);
        setField(term928, term928.getClass(), "next", null);
        setField(term928, term928.getClass(), "first", null);
        setField(term928, term928.getClass(), "last", null);
        setField(term928, term928.getClass(), "propListHead", null);
        setIntField(term928, term928.getClass(), "sourcePosition", 0);
        setField(term928, term928.getClass(), "jsType", null);
        setField(term928, term928.getClass(), "parent", null);
        setField(term926, term926.getClass(), "next", term928);
        setIntField(term931, term931.getClass(), "type", 0);
        setField(term931, term931.getClass(), "next", null);
        setField(term931, term931.getClass(), "first", null);
        setField(term931, term931.getClass(), "last", null);
        setField(term931, term931.getClass(), "propListHead", null);
        setIntField(term931, term931.getClass(), "sourcePosition", 0);
        setField(term931, term931.getClass(), "jsType", null);
        setField(term931, term931.getClass(), "parent", null);
        setField(term926, term926.getClass(), "first", term931);
        setIntField(term934, term934.getClass(), "type", 0);
        setField(term934, term934.getClass(), "next", null);
        setField(term934, term934.getClass(), "first", null);
        setField(term934, term934.getClass(), "last", null);
        setField(term934, term934.getClass(), "propListHead", null);
        setIntField(term934, term934.getClass(), "sourcePosition", 0);
        setField(term934, term934.getClass(), "jsType", null);
        setField(term934, term934.getClass(), "parent", null);
        setField(term926, term926.getClass(), "last", term934);
        setField(term937, term937.getClass(), "next", null);
        setIntField(term937, term937.getClass(), "type", 0);
        setIntField(term937, term937.getClass(), "intValue", 0);
        setField(term937, term937.getClass(), "objectValue", null);
        setField(term926, term926.getClass(), "propListHead", term937);
        setIntField(term926, term926.getClass(), "sourcePosition", 301401782);
        setField(term926, term926.getClass(), "jsType", null);
        setField(term926, term926.getClass(), "parent", null);
        setField(term924, term924.getClass(), "next", term926);
        setIntField(term941, term941.getClass(), "type", 0);
        setField(term941, term941.getClass(), "next", null);
        setField(term941, term941.getClass(), "first", null);
        setField(term941, term941.getClass(), "last", null);
        setField(term941, term941.getClass(), "propListHead", null);
        setIntField(term941, term941.getClass(), "sourcePosition", 0);
        setField(term941, term941.getClass(), "jsType", null);
        setField(term941, term941.getClass(), "parent", null);
        setField(term924, term924.getClass(), "first", term941);
        setIntField(term944, term944.getClass(), "type", 0);
        setField(term944, term944.getClass(), "next", null);
        setField(term944, term944.getClass(), "first", null);
        setField(term944, term944.getClass(), "last", null);
        setField(term944, term944.getClass(), "propListHead", null);
        setIntField(term944, term944.getClass(), "sourcePosition", 0);
        setField(term944, term944.getClass(), "jsType", null);
        setField(term944, term944.getClass(), "parent", null);
        setField(term924, term924.getClass(), "last", term944);
        setField(term947, term947.getClass(), "next", null);
        setIntField(term947, term947.getClass(), "type", 0);
        setIntField(term947, term947.getClass(), "intValue", 0);
        setField(term947, term947.getClass(), "objectValue", null);
        setField(term924, term924.getClass(), "propListHead", term947);
        setIntField(term924, term924.getClass(), "sourcePosition", 1988605357);
        setField(term924, term924.getClass(), "jsType", null);
        setField(term924, term924.getClass(), "parent", null);
        term8653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8689 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8700 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8653, term8653.getClass(), "type", -1702055571);
        setIntField(term8654, term8654.getClass(), "type", 2143282300);
        setIntField(term8655, term8655.getClass(), "type", 0);
        setField(term8655, term8655.getClass(), "next", null);
        setField(term8655, term8655.getClass(), "first", null);
        setField(term8655, term8655.getClass(), "last", null);
        setField(term8655, term8655.getClass(), "propListHead", null);
        setIntField(term8655, term8655.getClass(), "sourcePosition", 0);
        setField(term8655, term8655.getClass(), "jsType", null);
        setField(term8655, term8655.getClass(), "parent", null);
        setField(term8654, term8654.getClass(), "next", term8655);
        setIntField(term8656, term8656.getClass(), "type", 0);
        setField(term8656, term8656.getClass(), "next", null);
        setField(term8656, term8656.getClass(), "first", null);
        setField(term8656, term8656.getClass(), "last", null);
        setField(term8656, term8656.getClass(), "propListHead", null);
        setIntField(term8656, term8656.getClass(), "sourcePosition", 0);
        setField(term8656, term8656.getClass(), "jsType", null);
        setField(term8656, term8656.getClass(), "parent", null);
        setField(term8654, term8654.getClass(), "first", term8656);
        setIntField(term8657, term8657.getClass(), "type", 0);
        setField(term8657, term8657.getClass(), "next", null);
        setField(term8657, term8657.getClass(), "first", null);
        setField(term8657, term8657.getClass(), "last", null);
        setField(term8657, term8657.getClass(), "propListHead", null);
        setIntField(term8657, term8657.getClass(), "sourcePosition", 0);
        setField(term8657, term8657.getClass(), "jsType", null);
        setField(term8657, term8657.getClass(), "parent", null);
        setField(term8654, term8654.getClass(), "last", term8657);
        setField(term8689, term8689.getClass(), "next", null);
        setIntField(term8689, term8689.getClass(), "type", 0);
        setIntField(term8689, term8689.getClass(), "intValue", 0);
        setField(term8689, term8689.getClass(), "objectValue", null);
        setField(term8654, term8654.getClass(), "propListHead", term8689);
        setIntField(term8654, term8654.getClass(), "sourcePosition", 301401782);
        setField(term8654, term8654.getClass(), "jsType", null);
        setField(term8654, term8654.getClass(), "parent", null);
        setField(term8653, term8653.getClass(), "next", term8654);
        setIntField(term8697, term8697.getClass(), "type", 0);
        setField(term8697, term8697.getClass(), "next", null);
        setField(term8697, term8697.getClass(), "first", null);
        setField(term8697, term8697.getClass(), "last", null);
        setField(term8697, term8697.getClass(), "propListHead", null);
        setIntField(term8697, term8697.getClass(), "sourcePosition", 0);
        setField(term8697, term8697.getClass(), "jsType", null);
        setField(term8697, term8697.getClass(), "parent", null);
        setField(term8653, term8653.getClass(), "first", term8697);
        setIntField(term8699, term8699.getClass(), "type", 0);
        setField(term8699, term8699.getClass(), "next", null);
        setField(term8699, term8699.getClass(), "first", null);
        setField(term8699, term8699.getClass(), "last", null);
        setField(term8699, term8699.getClass(), "propListHead", null);
        setIntField(term8699, term8699.getClass(), "sourcePosition", 0);
        setField(term8699, term8699.getClass(), "jsType", null);
        setField(term8699, term8699.getClass(), "parent", null);
        setField(term8653, term8653.getClass(), "last", term8699);
        setField(term8700, term8700.getClass(), "next", null);
        setIntField(term8700, term8700.getClass(), "type", 0);
        setIntField(term8700, term8700.getClass(), "intValue", 0);
        setField(term8700, term8700.getClass(), "objectValue", null);
        setField(term8653, term8653.getClass(), "propListHead", term8700);
        setIntField(term8653, term8653.getClass(), "sourcePosition", 1988605357);
        setField(term8653, term8653.getClass(), "jsType", null);
        setField(term8653, term8653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term924;
        Object retValue = callMethod(klass, "isName", argTypes, null, args);
        assertTrue(recursiveEquals(term924, term8653));
        assertTrue(recursiveEquals(retValue, false));
    }

};


