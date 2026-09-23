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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388149;
     Object term388287;
     Object term388863;
     Object term388864;
     Object term388865;
     Object term388835;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388149 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term388287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term388287, term388287.getClass(), "parent", null);
        setIntField(term388287, term388287.getClass(), "type", 44);
        term388863 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term388863, term388863.getClass(), "currentTraversal", null);
        term388864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term388864, term388864.getClass(), "str", null);
        setIntField(term388864, term388864.getClass(), "type", 44);
        setField(term388864, term388864.getClass(), "next", null);
        setField(term388864, term388864.getClass(), "first", null);
        setField(term388864, term388864.getClass(), "last", null);
        setField(term388864, term388864.getClass(), "propListHead", null);
        setIntField(term388864, term388864.getClass(), "sourcePosition", 0);
        setField(term388864, term388864.getClass(), "jsType", null);
        setField(term388864, term388864.getClass(), "parent", null);
        term388865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term388865, term388865.getClass(), "str", null);
        setIntField(term388865, term388865.getClass(), "type", 44);
        setField(term388865, term388865.getClass(), "next", null);
        setField(term388865, term388865.getClass(), "first", null);
        setField(term388865, term388865.getClass(), "last", null);
        setField(term388865, term388865.getClass(), "propListHead", null);
        setIntField(term388865, term388865.getClass(), "sourcePosition", 0);
        setField(term388865, term388865.getClass(), "jsType", null);
        setField(term388865, term388865.getClass(), "parent", null);
        term388835 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term388835, term388835.getClass(), "str", null);
        setIntField(term388835, term388835.getClass(), "type", 44);
        setField(term388835, term388835.getClass(), "next", null);
        setField(term388835, term388835.getClass(), "first", null);
        setField(term388835, term388835.getClass(), "last", null);
        setField(term388835, term388835.getClass(), "propListHead", null);
        setIntField(term388835, term388835.getClass(), "sourcePosition", 0);
        setField(term388835, term388835.getClass(), "jsType", null);
        setField(term388835, term388835.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term388287;
        args[1] = term388287;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term388149, args);
        assertTrue(recursiveEquals(term388149, term388863));
        assertTrue(recursiveEquals(term388287, term388864));
        assertTrue(recursiveEquals(term388287, term388865));
        assertTrue(recursiveEquals(retValue, term388835));
    }

};


