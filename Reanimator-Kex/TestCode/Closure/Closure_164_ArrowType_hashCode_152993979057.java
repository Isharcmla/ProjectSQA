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

public class ArrowType_hashCode_152993979057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12785;

    public ArrowType_hashCode_152993979057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12785, term12785.getClass(), "returnType", null);
        setBooleanField(term12785, term12785.getClass(), "returnTypeInferred", true);
        setField(term12855, term12855.getClass(), "first", term12855);
        setField(term12855, term12855.getClass(), "jsType", term12785);
        setField(term12785, term12785.getClass(), "parameters", term12855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12785, args);
    }

};


