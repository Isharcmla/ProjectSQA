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

public class NodeUtil_getCount_725644382285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3917;

    public NodeUtil_getCount_725644382285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3930 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3940 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3917, term3917.getClass(), "type", 2103971768);
        setIntField(term3919, term3919.getClass(), "type", 1795358995);
        setIntField(term3921, term3921.getClass(), "type", 0);
        setField(term3921, term3921.getClass(), "next", null);
        setField(term3921, term3921.getClass(), "first", null);
        setField(term3921, term3921.getClass(), "last", null);
        setField(term3921, term3921.getClass(), "propListHead", null);
        setIntField(term3921, term3921.getClass(), "sourcePosition", 0);
        setField(term3921, term3921.getClass(), "jsType", null);
        setField(term3921, term3921.getClass(), "parent", null);
        setField(term3919, term3919.getClass(), "next", term3921);
        setIntField(term3924, term3924.getClass(), "type", 0);
        setField(term3924, term3924.getClass(), "next", null);
        setField(term3924, term3924.getClass(), "first", null);
        setField(term3924, term3924.getClass(), "last", null);
        setField(term3924, term3924.getClass(), "propListHead", null);
        setIntField(term3924, term3924.getClass(), "sourcePosition", 0);
        setField(term3924, term3924.getClass(), "jsType", null);
        setField(term3924, term3924.getClass(), "parent", null);
        setField(term3919, term3919.getClass(), "first", term3924);
        setIntField(term3927, term3927.getClass(), "type", 0);
        setField(term3927, term3927.getClass(), "next", null);
        setField(term3927, term3927.getClass(), "first", null);
        setField(term3927, term3927.getClass(), "last", null);
        setField(term3927, term3927.getClass(), "propListHead", null);
        setIntField(term3927, term3927.getClass(), "sourcePosition", 0);
        setField(term3927, term3927.getClass(), "jsType", null);
        setField(term3927, term3927.getClass(), "parent", null);
        setField(term3919, term3919.getClass(), "last", term3927);
        setField(term3930, term3930.getClass(), "next", null);
        setIntField(term3930, term3930.getClass(), "type", 0);
        setIntField(term3930, term3930.getClass(), "intValue", 0);
        setField(term3930, term3930.getClass(), "objectValue", null);
        setField(term3919, term3919.getClass(), "propListHead", term3930);
        setIntField(term3919, term3919.getClass(), "sourcePosition", -2061712635);
        setField(term3919, term3919.getClass(), "jsType", null);
        setField(term3919, term3919.getClass(), "parent", null);
        setField(term3917, term3917.getClass(), "next", term3919);
        setIntField(term3934, term3934.getClass(), "type", 0);
        setField(term3934, term3934.getClass(), "next", null);
        setField(term3934, term3934.getClass(), "first", null);
        setField(term3934, term3934.getClass(), "last", null);
        setField(term3934, term3934.getClass(), "propListHead", null);
        setIntField(term3934, term3934.getClass(), "sourcePosition", 0);
        setField(term3934, term3934.getClass(), "jsType", null);
        setField(term3934, term3934.getClass(), "parent", null);
        setField(term3917, term3917.getClass(), "first", term3934);
        setIntField(term3937, term3937.getClass(), "type", 0);
        setField(term3937, term3937.getClass(), "next", null);
        setField(term3937, term3937.getClass(), "first", null);
        setField(term3937, term3937.getClass(), "last", null);
        setField(term3937, term3937.getClass(), "propListHead", null);
        setIntField(term3937, term3937.getClass(), "sourcePosition", 0);
        setField(term3937, term3937.getClass(), "jsType", null);
        setField(term3937, term3937.getClass(), "parent", null);
        setField(term3917, term3917.getClass(), "last", term3937);
        setField(term3940, term3940.getClass(), "next", null);
        setIntField(term3940, term3940.getClass(), "type", 0);
        setIntField(term3940, term3940.getClass(), "intValue", 0);
        setField(term3940, term3940.getClass(), "objectValue", null);
        setField(term3917, term3917.getClass(), "propListHead", term3940);
        setIntField(term3917, term3917.getClass(), "sourcePosition", 1182911731);
        setField(term3917, term3917.getClass(), "jsType", null);
        setField(term3917, term3917.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3917;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "getCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


