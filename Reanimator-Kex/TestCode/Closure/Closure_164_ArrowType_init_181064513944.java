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

public class ArrowType_init_181064513944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7810;

    public ArrowType_init_181064513944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term7706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term7502, term7502.getClass(), "resolved", false);
        setField(term7502, term7502.getClass(), "resolveResult", term7602);
        setField(term7502, term7502.getClass(), "registry", term7706);
        term7810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term7810;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


