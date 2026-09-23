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

public class ArrowType_hashCode_152993979060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13170;

    public ArrowType_hashCode_152993979060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13262 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term13170, term13170.getClass(), "returnType", null);
        setBooleanField(term13170, term13170.getClass(), "returnTypeInferred", false);
        setField(term13170, term13170.getClass(), "parameters", term13262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term13170, args);
    }

};


