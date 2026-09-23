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

public class ArrowType_hashCode_152993979053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10850;

    public ArrowType_hashCode_152993979053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term10850, term10850.getClass(), "returnType", null);
        setBooleanField(term10850, term10850.getClass(), "returnTypeInferred", false);
        setField(term10990, term10990.getClass(), "jsType", term11086);
        setField(term10920, term10920.getClass(), "first", term10990);
        setField(term10850, term10850.getClass(), "parameters", term10920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10850, args);
    }

};


