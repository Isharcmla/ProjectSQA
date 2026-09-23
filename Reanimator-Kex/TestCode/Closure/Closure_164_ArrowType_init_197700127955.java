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

public class ArrowType_init_197700127955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12206;
     Object term12276;
     Object term12370;

    public ArrowType_init_197700127955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term12032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term12102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term11836, term11836.getClass(), "resolved", false);
        setField(term11836, term11836.getClass(), "resolveResult", term11928);
        setField(term11836, term11836.getClass(), "registry", term12032);
        setField(term11836, term11836.getClass(), "parameters", term12102);
        term12206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term12276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term12370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = term12206;
        args[1] = term12276;
        args[2] = term12370;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


