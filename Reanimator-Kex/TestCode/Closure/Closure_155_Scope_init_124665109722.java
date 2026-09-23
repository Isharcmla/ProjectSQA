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

public class Scope_init_124665109722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;

    public Scope_init_124665109722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term67 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term50, term50.getClass(), "type", 590364439);
        setIntField(term52, term52.getClass(), "type", -203030934);
        setIntField(term54, term54.getClass(), "type", 0);
        setField(term54, term54.getClass(), "next", null);
        setField(term54, term54.getClass(), "first", null);
        setField(term54, term54.getClass(), "last", null);
        setField(term54, term54.getClass(), "propListHead", null);
        setIntField(term54, term54.getClass(), "sourcePosition", 0);
        setField(term54, term54.getClass(), "jsType", null);
        setField(term54, term54.getClass(), "parent", null);
        setField(term52, term52.getClass(), "next", term54);
        setIntField(term57, term57.getClass(), "type", 0);
        setField(term57, term57.getClass(), "next", null);
        setField(term57, term57.getClass(), "first", null);
        setField(term57, term57.getClass(), "last", null);
        setField(term57, term57.getClass(), "propListHead", null);
        setIntField(term57, term57.getClass(), "sourcePosition", 0);
        setField(term57, term57.getClass(), "jsType", null);
        setField(term57, term57.getClass(), "parent", null);
        setField(term52, term52.getClass(), "first", term57);
        setIntField(term60, term60.getClass(), "type", 0);
        setField(term60, term60.getClass(), "next", null);
        setField(term60, term60.getClass(), "first", null);
        setField(term60, term60.getClass(), "last", null);
        setField(term60, term60.getClass(), "propListHead", null);
        setIntField(term60, term60.getClass(), "sourcePosition", 0);
        setField(term60, term60.getClass(), "jsType", null);
        setField(term60, term60.getClass(), "parent", null);
        setField(term52, term52.getClass(), "last", term60);
        setField(term63, term63.getClass(), "next", null);
        setIntField(term63, term63.getClass(), "type", 0);
        setIntField(term63, term63.getClass(), "intValue", 0);
        setField(term63, term63.getClass(), "objectValue", null);
        setField(term52, term52.getClass(), "propListHead", term63);
        setIntField(term52, term52.getClass(), "sourcePosition", -226514366);
        setField(term52, term52.getClass(), "jsType", null);
        setField(term52, term52.getClass(), "parent", null);
        setField(term50, term50.getClass(), "next", term52);
        setIntField(term67, term67.getClass(), "type", 0);
        setField(term67, term67.getClass(), "next", null);
        setField(term67, term67.getClass(), "first", null);
        setField(term67, term67.getClass(), "last", null);
        setField(term67, term67.getClass(), "propListHead", null);
        setIntField(term67, term67.getClass(), "sourcePosition", 0);
        setField(term67, term67.getClass(), "jsType", null);
        setField(term67, term67.getClass(), "parent", null);
        setField(term50, term50.getClass(), "first", term67);
        setIntField(term70, term70.getClass(), "type", 0);
        setField(term70, term70.getClass(), "next", null);
        setField(term70, term70.getClass(), "first", null);
        setField(term70, term70.getClass(), "last", null);
        setField(term70, term70.getClass(), "propListHead", null);
        setIntField(term70, term70.getClass(), "sourcePosition", 0);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term50, term50.getClass(), "last", term70);
        setField(term73, term73.getClass(), "next", null);
        setIntField(term73, term73.getClass(), "type", 0);
        setIntField(term73, term73.getClass(), "intValue", 0);
        setField(term73, term73.getClass(), "objectValue", null);
        setField(term50, term50.getClass(), "propListHead", term73);
        setIntField(term50, term50.getClass(), "sourcePosition", 1193880199);
        setField(term50, term50.getClass(), "jsType", null);
        setField(term50, term50.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term50;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


