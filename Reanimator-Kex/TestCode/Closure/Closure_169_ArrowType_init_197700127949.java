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

public class ArrowType_init_197700127949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9902;
     Object term9994;

    public ArrowType_init_197700127949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term9718, term9718.getClass(), "resolved", false);
        setField(term9718, term9718.getClass(), "resolveResult", term9832);
        setBooleanField(term9718, term9718.getClass(), "inTemplatedCheckVisit", false);
        setField(term9718, term9718.getClass(), "registry", null);
        setField(term9718, term9718.getClass(), "parameters", null);
        term9902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term9994 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term9902;
        args[2] = term9994;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


