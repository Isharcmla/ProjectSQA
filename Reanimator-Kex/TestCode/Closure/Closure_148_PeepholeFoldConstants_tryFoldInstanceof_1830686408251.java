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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47808;
     Object term47900;
     Object term47992;
     Object term48382;
     Object term48383;
     Object term48384;
     Object term48365;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47808 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term47900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term47900, term47900.getClass(), "type", 52);
        term47992 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term48382 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term48382, term48382.getClass(), "currentTraversal", null);
        term48383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term48383, term48383.getClass(), "number", 0.0);
        setIntField(term48383, term48383.getClass(), "type", 52);
        setField(term48383, term48383.getClass(), "next", null);
        setField(term48383, term48383.getClass(), "first", null);
        setField(term48383, term48383.getClass(), "last", null);
        setField(term48383, term48383.getClass(), "propListHead", null);
        setIntField(term48383, term48383.getClass(), "sourcePosition", 0);
        setField(term48383, term48383.getClass(), "jsType", null);
        setField(term48383, term48383.getClass(), "parent", null);
        term48384 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term48384, term48384.getClass(), "number", 0.0);
        setIntField(term48384, term48384.getClass(), "type", 0);
        setField(term48384, term48384.getClass(), "next", null);
        setField(term48384, term48384.getClass(), "first", null);
        setField(term48384, term48384.getClass(), "last", null);
        setField(term48384, term48384.getClass(), "propListHead", null);
        setIntField(term48384, term48384.getClass(), "sourcePosition", 0);
        setField(term48384, term48384.getClass(), "jsType", null);
        setField(term48384, term48384.getClass(), "parent", null);
        term48365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term48365, term48365.getClass(), "number", 0.0);
        setIntField(term48365, term48365.getClass(), "type", 52);
        setField(term48365, term48365.getClass(), "next", null);
        setField(term48365, term48365.getClass(), "first", null);
        setField(term48365, term48365.getClass(), "last", null);
        setField(term48365, term48365.getClass(), "propListHead", null);
        setIntField(term48365, term48365.getClass(), "sourcePosition", 0);
        setField(term48365, term48365.getClass(), "jsType", null);
        setField(term48365, term48365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term47900;
        args[1] = term47992;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term47808, args);
        assertTrue(recursiveEquals(term47808, term48382));
        assertTrue(recursiveEquals(term47900, term48383));
        assertTrue(recursiveEquals(term47992, term48384));
        assertTrue(recursiveEquals(retValue, term48365));
    }

};


