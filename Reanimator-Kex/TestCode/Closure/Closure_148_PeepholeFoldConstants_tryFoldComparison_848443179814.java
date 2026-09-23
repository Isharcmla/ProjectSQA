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

public class PeepholeFoldConstants_tryFoldComparison_848443179814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184824;
     Object term184894;
     Object term184964;
     Object term185034;
     Object term185118;
     Object term185119;
     Object term185120;
     Object term185121;
     Object term185098;

    public PeepholeFoldConstants_tryFoldComparison_848443179814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184824 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term184894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184894, term184894.getClass(), "type", 14);
        term184964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184964, term184964.getClass(), "type", 14);
        term185034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term185118 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term185118, term185118.getClass(), "currentTraversal", null);
        term185119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term185119, term185119.getClass(), "type", 14);
        setField(term185119, term185119.getClass(), "next", null);
        setField(term185119, term185119.getClass(), "first", null);
        setField(term185119, term185119.getClass(), "last", null);
        setField(term185119, term185119.getClass(), "propListHead", null);
        setIntField(term185119, term185119.getClass(), "sourcePosition", 0);
        setField(term185119, term185119.getClass(), "jsType", null);
        setField(term185119, term185119.getClass(), "parent", null);
        term185120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term185120, term185120.getClass(), "type", 14);
        setField(term185120, term185120.getClass(), "next", null);
        setField(term185120, term185120.getClass(), "first", null);
        setField(term185120, term185120.getClass(), "last", null);
        setField(term185120, term185120.getClass(), "propListHead", null);
        setIntField(term185120, term185120.getClass(), "sourcePosition", 0);
        setField(term185120, term185120.getClass(), "jsType", null);
        setField(term185120, term185120.getClass(), "parent", null);
        term185121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term185121, term185121.getClass(), "type", 0);
        setField(term185121, term185121.getClass(), "next", null);
        setField(term185121, term185121.getClass(), "first", null);
        setField(term185121, term185121.getClass(), "last", null);
        setField(term185121, term185121.getClass(), "propListHead", null);
        setIntField(term185121, term185121.getClass(), "sourcePosition", 0);
        setField(term185121, term185121.getClass(), "jsType", null);
        setField(term185121, term185121.getClass(), "parent", null);
        term185098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term185098, term185098.getClass(), "type", 14);
        setField(term185098, term185098.getClass(), "next", null);
        setField(term185098, term185098.getClass(), "first", null);
        setField(term185098, term185098.getClass(), "last", null);
        setField(term185098, term185098.getClass(), "propListHead", null);
        setIntField(term185098, term185098.getClass(), "sourcePosition", 0);
        setField(term185098, term185098.getClass(), "jsType", null);
        setField(term185098, term185098.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term184894;
        args[1] = term184964;
        args[2] = term185034;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term184824, args);
        assertTrue(recursiveEquals(term184824, term185118));
        assertTrue(recursiveEquals(term184894, term185119));
        assertTrue(recursiveEquals(term184964, term185120));
        assertTrue(recursiveEquals(term185034, term185121));
        assertTrue(recursiveEquals(retValue, term185098));
    }

};


