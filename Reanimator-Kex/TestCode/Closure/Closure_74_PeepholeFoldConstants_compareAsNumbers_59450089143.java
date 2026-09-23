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

public class PeepholeFoldConstants_compareAsNumbers_59450089143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25430;
     Object term25500;
     Object term25532;
     Object term25533;

    public PeepholeFoldConstants_compareAsNumbers_59450089143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term25532 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term25532, term25532.getClass(), "currentTraversal", null);
        term25533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25533, term25533.getClass(), "type", 0);
        setField(term25533, term25533.getClass(), "next", null);
        setField(term25533, term25533.getClass(), "first", null);
        setField(term25533, term25533.getClass(), "last", null);
        setField(term25533, term25533.getClass(), "propListHead", null);
        setIntField(term25533, term25533.getClass(), "sourcePosition", 0);
        setField(term25533, term25533.getClass(), "jsType", null);
        setField(term25533, term25533.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term25500;
        args[2] = null;
        Object retValue = callMethod(klass, "compareAsNumbers", argTypes, term25430, args);
        assertTrue(recursiveEquals(term25430, term25532));
        assertTrue(recursiveEquals(term25500, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


