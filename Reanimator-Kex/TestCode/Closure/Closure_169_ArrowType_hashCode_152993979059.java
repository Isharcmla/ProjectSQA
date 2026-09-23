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
import java.lang.Object;

public class ArrowType_hashCode_152993979059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12823;

    public ArrowType_hashCode_152993979059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term12823, term12823.getClass(), "returnType", null);
        setBooleanField(term12823, term12823.getClass(), "returnTypeInferred", false);
        setField(term12963, term12963.getClass(), "jsType", term13057);
        setField(term12893, term12893.getClass(), "first", term12963);
        setField(term12823, term12823.getClass(), "parameters", term12893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12823, args);
    }

};


