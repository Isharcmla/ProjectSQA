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

public class ArrowType_hashCode_152993979058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12977;

    public ArrowType_hashCode_152993979058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term12977, term12977.getClass(), "returnType", null);
        setBooleanField(term12977, term12977.getClass(), "returnTypeInferred", false);
        setField(term13117, term13117.getClass(), "jsType", term13215);
        setField(term13047, term13047.getClass(), "first", term13117);
        setField(term12977, term12977.getClass(), "parameters", term13047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12977, args);
    }

};


