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
import java.lang.Object;

public class FoldConstants_makeForwardSlashBracketSafe_25000892974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4067;

    public FoldConstants_makeForwardSlashBracketSafe_25000892974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4080 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4090 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4067, term4067.getClass(), "type", -2063884849);
        setIntField(term4069, term4069.getClass(), "type", 1841493736);
        setIntField(term4071, term4071.getClass(), "type", 0);
        setField(term4071, term4071.getClass(), "next", null);
        setField(term4071, term4071.getClass(), "first", null);
        setField(term4071, term4071.getClass(), "last", null);
        setField(term4071, term4071.getClass(), "propListHead", null);
        setIntField(term4071, term4071.getClass(), "sourcePosition", 0);
        setField(term4071, term4071.getClass(), "jsType", null);
        setField(term4071, term4071.getClass(), "parent", null);
        setField(term4069, term4069.getClass(), "next", term4071);
        setIntField(term4074, term4074.getClass(), "type", 0);
        setField(term4074, term4074.getClass(), "next", null);
        setField(term4074, term4074.getClass(), "first", null);
        setField(term4074, term4074.getClass(), "last", null);
        setField(term4074, term4074.getClass(), "propListHead", null);
        setIntField(term4074, term4074.getClass(), "sourcePosition", 0);
        setField(term4074, term4074.getClass(), "jsType", null);
        setField(term4074, term4074.getClass(), "parent", null);
        setField(term4069, term4069.getClass(), "first", term4074);
        setIntField(term4077, term4077.getClass(), "type", 0);
        setField(term4077, term4077.getClass(), "next", null);
        setField(term4077, term4077.getClass(), "first", null);
        setField(term4077, term4077.getClass(), "last", null);
        setField(term4077, term4077.getClass(), "propListHead", null);
        setIntField(term4077, term4077.getClass(), "sourcePosition", 0);
        setField(term4077, term4077.getClass(), "jsType", null);
        setField(term4077, term4077.getClass(), "parent", null);
        setField(term4069, term4069.getClass(), "last", term4077);
        setField(term4080, term4080.getClass(), "next", null);
        setIntField(term4080, term4080.getClass(), "type", 0);
        setIntField(term4080, term4080.getClass(), "intValue", 0);
        setField(term4080, term4080.getClass(), "objectValue", null);
        setField(term4069, term4069.getClass(), "propListHead", term4080);
        setIntField(term4069, term4069.getClass(), "sourcePosition", -1986366126);
        setField(term4069, term4069.getClass(), "jsType", null);
        setField(term4069, term4069.getClass(), "parent", null);
        setField(term4067, term4067.getClass(), "next", term4069);
        setIntField(term4084, term4084.getClass(), "type", 0);
        setField(term4084, term4084.getClass(), "next", null);
        setField(term4084, term4084.getClass(), "first", null);
        setField(term4084, term4084.getClass(), "last", null);
        setField(term4084, term4084.getClass(), "propListHead", null);
        setIntField(term4084, term4084.getClass(), "sourcePosition", 0);
        setField(term4084, term4084.getClass(), "jsType", null);
        setField(term4084, term4084.getClass(), "parent", null);
        setField(term4067, term4067.getClass(), "first", term4084);
        setIntField(term4087, term4087.getClass(), "type", 0);
        setField(term4087, term4087.getClass(), "next", null);
        setField(term4087, term4087.getClass(), "first", null);
        setField(term4087, term4087.getClass(), "last", null);
        setField(term4087, term4087.getClass(), "propListHead", null);
        setIntField(term4087, term4087.getClass(), "sourcePosition", 0);
        setField(term4087, term4087.getClass(), "jsType", null);
        setField(term4087, term4087.getClass(), "parent", null);
        setField(term4067, term4067.getClass(), "last", term4087);
        setField(term4090, term4090.getClass(), "next", null);
        setIntField(term4090, term4090.getClass(), "type", 0);
        setIntField(term4090, term4090.getClass(), "intValue", 0);
        setField(term4090, term4090.getClass(), "objectValue", null);
        setField(term4067, term4067.getClass(), "propListHead", term4090);
        setIntField(term4067, term4067.getClass(), "sourcePosition", -1963228619);
        setField(term4067, term4067.getClass(), "jsType", null);
        setField(term4067, term4067.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4067;
        try {
            callMethod(klass, "makeForwardSlashBracketSafe", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


