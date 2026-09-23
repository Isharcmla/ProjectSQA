package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290364;

    public StdValueInstantiator_init_1394365189269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term290260 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term291637 = Class.forName((String) "com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class term291628 = Array.newInstance(term291637, 0).getClass();
        Class term291613 = Array.newInstance(term291628, 0).getClass();
        Class term290400 = Array.newInstance(term291613, 0).getClass();
        Class<? extends Object> term290578 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        Class term290744 = char.class;
        Class<? extends Object> term290922 = Class.forName((String) "com.fasterxml.jackson.core.format.DataFormatMatcher");
        term290364 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term290542 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term290708 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term290886 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term290364, term290364.getClass(), "_class", term290400);
        setField(term290542, term290542.getClass(), "_canonicalName", null);
        setField(term290542, term290542.getClass(), "_class", term290578);
        setField(term290708, term290708.getClass(), "_canonicalName", null);
        setField(term290708, term290708.getClass(), "_class", term290744);
        setField(term290886, term290886.getClass(), "_canonicalName", null);
        setField(term290886, term290886.getClass(), "_class", term290922);
        setField(term290708, term290708.getClass(), "_keyType", term290886);
        setField(term290542, term290542.getClass(), "_referencedType", term290708);
        setField(term290364, term290364.getClass(), "_referencedType", term290542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term290364;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


