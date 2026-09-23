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

public class PeepholeFoldConstants_inForcedStringContext_1853675303125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21138;
     Object term21208;
     Object term21222;
     Object term21223;

    public PeepholeFoldConstants_inForcedStringContext_1853675303125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21138 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term21208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21208, term21208.getClass(), "parent", term21208);
        term21222 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term21222, term21222.getClass(), "currentTraversal", null);
        term21223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21223, term21223.getClass(), "type", 0);
        setField(term21223, term21223.getClass(), "next", null);
        setField(term21223, term21223.getClass(), "first", null);
        setField(term21223, term21223.getClass(), "last", null);
        setField(term21223, term21223.getClass(), "propListHead", null);
        setIntField(term21223, term21223.getClass(), "sourcePosition", 0);
        setField(term21223, term21223.getClass(), "jsType", null);
        setField(term21223, term21223.getClass(), "parent", term21223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21208;
        Object retValue = callMethod(klass, "inForcedStringContext", argTypes, term21138, args);
        assertTrue(recursiveEquals(term21138, term21222));
        assertTrue(recursiveEquals(term21208, term21223));
        assertTrue(recursiveEquals(retValue, false));
    }

};


