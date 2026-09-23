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

public class PeepholeFoldConstants_tryFoldBitAndOr_5871227271236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294655;
     Object term294725;
     Object term294795;
     Object term294865;
     Object term294995;
     Object term294996;
     Object term294997;
     Object term294998;
     Object term294976;

    public PeepholeFoldConstants_tryFoldBitAndOr_5871227271236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294655 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term294725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term294725, term294725.getClass(), "type", 9);
        term294795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term294795, term294795.getClass(), "type", 39);
        term294865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term294995 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term294995, term294995.getClass(), "currentTraversal", null);
        term294996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term294996, term294996.getClass(), "type", 9);
        setField(term294996, term294996.getClass(), "next", null);
        setField(term294996, term294996.getClass(), "first", null);
        setField(term294996, term294996.getClass(), "last", null);
        setField(term294996, term294996.getClass(), "propListHead", null);
        setIntField(term294996, term294996.getClass(), "sourcePosition", 0);
        setField(term294996, term294996.getClass(), "jsType", null);
        setField(term294996, term294996.getClass(), "parent", null);
        term294997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term294997, term294997.getClass(), "type", 39);
        setField(term294997, term294997.getClass(), "next", null);
        setField(term294997, term294997.getClass(), "first", null);
        setField(term294997, term294997.getClass(), "last", null);
        setField(term294997, term294997.getClass(), "propListHead", null);
        setIntField(term294997, term294997.getClass(), "sourcePosition", 0);
        setField(term294997, term294997.getClass(), "jsType", null);
        setField(term294997, term294997.getClass(), "parent", null);
        term294998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term294998, term294998.getClass(), "type", 0);
        setField(term294998, term294998.getClass(), "next", null);
        setField(term294998, term294998.getClass(), "first", null);
        setField(term294998, term294998.getClass(), "last", null);
        setField(term294998, term294998.getClass(), "propListHead", null);
        setIntField(term294998, term294998.getClass(), "sourcePosition", 0);
        setField(term294998, term294998.getClass(), "jsType", null);
        setField(term294998, term294998.getClass(), "parent", null);
        term294976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term294976, term294976.getClass(), "type", 9);
        setField(term294976, term294976.getClass(), "next", null);
        setField(term294976, term294976.getClass(), "first", null);
        setField(term294976, term294976.getClass(), "last", null);
        setField(term294976, term294976.getClass(), "propListHead", null);
        setIntField(term294976, term294976.getClass(), "sourcePosition", 0);
        setField(term294976, term294976.getClass(), "jsType", null);
        setField(term294976, term294976.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term294725;
        args[1] = term294795;
        args[2] = term294865;
        Object retValue = callMethod(klass, "tryFoldBitAndOr", argTypes, term294655, args);
        assertTrue(recursiveEquals(term294655, term294995));
        assertTrue(recursiveEquals(term294725, term294996));
        assertTrue(recursiveEquals(term294795, term294997));
        assertTrue(recursiveEquals(term294865, term294998));
        assertTrue(recursiveEquals(retValue, term294976));
    }

};


