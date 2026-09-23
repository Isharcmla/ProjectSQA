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

public class PeepholeFoldConstants_compareToUndefined_1311665781147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25664;
     Object term25734;
     Object term26127;
     Object term26128;

    public PeepholeFoldConstants_compareToUndefined_1311665781147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25734, term25734.getClass(), "type", 0);
        term26127 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26127, term26127.getClass(), "currentTraversal", null);
        term26128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26128, term26128.getClass(), "type", 0);
        setField(term26128, term26128.getClass(), "next", null);
        setField(term26128, term26128.getClass(), "first", null);
        setField(term26128, term26128.getClass(), "last", null);
        setField(term26128, term26128.getClass(), "propListHead", null);
        setIntField(term26128, term26128.getClass(), "sourcePosition", 0);
        setField(term26128, term26128.getClass(), "jsType", null);
        setField(term26128, term26128.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term25734;
        args[1] = 15;
        Object retValue = callMethod(klass, "compareToUndefined", argTypes, term25664, args);
        assertTrue(recursiveEquals(term25664, term26127));
        assertTrue(recursiveEquals(term25734, term26128));
        assertTrue(recursiveEquals(retValue, false));
    }

};


