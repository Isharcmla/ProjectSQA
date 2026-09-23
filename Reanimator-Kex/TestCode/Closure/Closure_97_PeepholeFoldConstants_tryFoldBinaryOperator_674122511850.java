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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242527;
     Object term242619;
     Object term242887;
     Object term242888;
     Object term242851;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242527 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term242619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term242711, term242711.getClass(), "next", term242803);
        setIntField(term242711, term242711.getClass(), "type", 39);
        setField(term242619, term242619.getClass(), "first", term242711);
        setIntField(term242619, term242619.getClass(), "type", 20);
        term242887 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term242887, term242887.getClass(), "currentTraversal", null);
        term242888 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242889 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term242888, term242888.getClass(), "number", 0.0);
        setIntField(term242888, term242888.getClass(), "type", 20);
        setField(term242888, term242888.getClass(), "next", null);
        setDoubleField(term242889, term242889.getClass(), "number", 0.0);
        setIntField(term242889, term242889.getClass(), "type", 39);
        setDoubleField(term242890, term242890.getClass(), "number", 0.0);
        setIntField(term242890, term242890.getClass(), "type", 0);
        setField(term242890, term242890.getClass(), "next", null);
        setField(term242890, term242890.getClass(), "first", null);
        setField(term242890, term242890.getClass(), "last", null);
        setField(term242890, term242890.getClass(), "propListHead", null);
        setIntField(term242890, term242890.getClass(), "sourcePosition", 0);
        setField(term242890, term242890.getClass(), "jsType", null);
        setField(term242890, term242890.getClass(), "parent", null);
        setField(term242889, term242889.getClass(), "next", term242890);
        setField(term242889, term242889.getClass(), "first", null);
        setField(term242889, term242889.getClass(), "last", null);
        setField(term242889, term242889.getClass(), "propListHead", null);
        setIntField(term242889, term242889.getClass(), "sourcePosition", 0);
        setField(term242889, term242889.getClass(), "jsType", null);
        setField(term242889, term242889.getClass(), "parent", null);
        setField(term242888, term242888.getClass(), "first", term242889);
        setField(term242888, term242888.getClass(), "last", null);
        setField(term242888, term242888.getClass(), "propListHead", null);
        setIntField(term242888, term242888.getClass(), "sourcePosition", 0);
        setField(term242888, term242888.getClass(), "jsType", null);
        setField(term242888, term242888.getClass(), "parent", null);
        term242851 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242857 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term242851, term242851.getClass(), "number", 0.0);
        setIntField(term242851, term242851.getClass(), "type", 20);
        setField(term242851, term242851.getClass(), "next", null);
        setDoubleField(term242854, term242854.getClass(), "number", 0.0);
        setIntField(term242854, term242854.getClass(), "type", 39);
        setDoubleField(term242857, term242857.getClass(), "number", 0.0);
        setIntField(term242857, term242857.getClass(), "type", 0);
        setField(term242857, term242857.getClass(), "next", null);
        setField(term242857, term242857.getClass(), "first", null);
        setField(term242857, term242857.getClass(), "last", null);
        setField(term242857, term242857.getClass(), "propListHead", null);
        setIntField(term242857, term242857.getClass(), "sourcePosition", 0);
        setField(term242857, term242857.getClass(), "jsType", null);
        setField(term242857, term242857.getClass(), "parent", null);
        setField(term242854, term242854.getClass(), "next", term242857);
        setField(term242854, term242854.getClass(), "first", null);
        setField(term242854, term242854.getClass(), "last", null);
        setField(term242854, term242854.getClass(), "propListHead", null);
        setIntField(term242854, term242854.getClass(), "sourcePosition", 0);
        setField(term242854, term242854.getClass(), "jsType", null);
        setField(term242854, term242854.getClass(), "parent", null);
        setField(term242851, term242851.getClass(), "first", term242854);
        setField(term242851, term242851.getClass(), "last", null);
        setField(term242851, term242851.getClass(), "propListHead", null);
        setIntField(term242851, term242851.getClass(), "sourcePosition", 0);
        setField(term242851, term242851.getClass(), "jsType", null);
        setField(term242851, term242851.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term242619;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term242527, args);
        assertTrue(recursiveEquals(term242527, term242887));
        assertTrue(recursiveEquals(term242619, term242888));
        assertTrue(recursiveEquals(retValue, term242851));
    }

};


