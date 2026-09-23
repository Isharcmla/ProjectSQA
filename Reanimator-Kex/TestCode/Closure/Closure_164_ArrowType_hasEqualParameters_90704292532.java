package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class ArrowType_hasEqualParameters_90704292532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4450;
     Object term4614;
     Object term5501;
     Object term5503;

    public ArrowType_hasEqualParameters_90704292532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term4520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4520, term4520.getClass(), "first", null);
        setField(term4450, term4450.getClass(), "parameters", term4520);
        term4614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term4684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4684, term4684.getClass(), "first", term4754);
        setField(term4614, term4614.getClass(), "parameters", term4684);
        term5501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5502, term5502.getClass(), "type", 0);
        setField(term5502, term5502.getClass(), "next", null);
        setField(term5502, term5502.getClass(), "first", null);
        setField(term5502, term5502.getClass(), "last", null);
        setField(term5502, term5502.getClass(), "propListHead", null);
        setIntField(term5502, term5502.getClass(), "sourcePosition", 0);
        setField(term5502, term5502.getClass(), "jsType", null);
        setField(term5502, term5502.getClass(), "parent", null);
        setField(term5501, term5501.getClass(), "parameters", term5502);
        setField(term5501, term5501.getClass(), "returnType", null);
        setBooleanField(term5501, term5501.getClass(), "returnTypeInferred", false);
        setBooleanField(term5501, term5501.getClass(), "resolved", false);
        setField(term5501, term5501.getClass(), "resolveResult", null);
        setField(term5501, term5501.getClass(), "registry", null);
        term5503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5504, term5504.getClass(), "type", 0);
        setField(term5504, term5504.getClass(), "next", null);
        setIntField(term5505, term5505.getClass(), "type", 0);
        setField(term5505, term5505.getClass(), "next", null);
        setField(term5505, term5505.getClass(), "first", null);
        setField(term5505, term5505.getClass(), "last", null);
        setField(term5505, term5505.getClass(), "propListHead", null);
        setIntField(term5505, term5505.getClass(), "sourcePosition", 0);
        setField(term5505, term5505.getClass(), "jsType", null);
        setField(term5505, term5505.getClass(), "parent", null);
        setField(term5504, term5504.getClass(), "first", term5505);
        setField(term5504, term5504.getClass(), "last", null);
        setField(term5504, term5504.getClass(), "propListHead", null);
        setIntField(term5504, term5504.getClass(), "sourcePosition", 0);
        setField(term5504, term5504.getClass(), "jsType", null);
        setField(term5504, term5504.getClass(), "parent", null);
        setField(term5503, term5503.getClass(), "parameters", term5504);
        setField(term5503, term5503.getClass(), "returnType", null);
        setBooleanField(term5503, term5503.getClass(), "returnTypeInferred", false);
        setBooleanField(term5503, term5503.getClass(), "resolved", false);
        setField(term5503, term5503.getClass(), "resolveResult", null);
        setField(term5503, term5503.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Object[] args = new Object[1];
        args[0] = term4614;
        Object retValue = callMethod(klass, "hasEqualParameters", argTypes, term4450, args);
        assertTrue(recursiveEquals(term4450, term5501));
        assertTrue(recursiveEquals(term4614, term5503));
        assertTrue(recursiveEquals(retValue, false));
    }

};


