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

public class ArrowType_hashCode_152993979050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9914;

    public ArrowType_hashCode_152993979050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9914, term9914.getClass(), "returnType", term10008);
        setBooleanField(term9914, term9914.getClass(), "returnTypeInferred", false);
        setField(term10078, term10078.getClass(), "first", term10078);
        setField(term10078, term10078.getClass(), "jsType", term9914);
        setField(term9914, term9914.getClass(), "parameters", term10078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term9914, args);
    }

};


