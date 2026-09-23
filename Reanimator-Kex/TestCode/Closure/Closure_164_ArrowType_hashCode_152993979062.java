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

public class ArrowType_hashCode_152993979062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14530;

    public ArrowType_hashCode_152993979062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term14530, term14530.getClass(), "returnType", null);
        setBooleanField(term14530, term14530.getClass(), "returnTypeInferred", false);
        setField(term14670, term14670.getClass(), "jsType", term14764);
        setField(term14600, term14600.getClass(), "first", term14670);
        setField(term14530, term14530.getClass(), "parameters", term14600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14530, args);
    }

};


