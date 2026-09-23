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

public class ArrowType_hashCode_152993979035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5747;

    public ArrowType_hashCode_152993979035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5747, term5747.getClass(), "returnType", null);
        setBooleanField(term5747, term5747.getClass(), "returnTypeInferred", false);
        setField(term5817, term5817.getClass(), "first", term5817);
        setField(term5817, term5817.getClass(), "jsType", null);
        setField(term5817, term5817.getClass(), "next", term5817);
        setField(term5747, term5747.getClass(), "parameters", term5817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5747, args);
    }

};


