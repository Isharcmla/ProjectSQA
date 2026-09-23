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

public class ArrowType_hasEqualParameters_207327133148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9161;
     Object term9395;

    public ArrowType_hasEqualParameters_207327133148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9301, term9301.getClass(), "jsType", null);
        setField(term9301, term9301.getClass(), "next", null);
        setField(term9231, term9231.getClass(), "first", term9301);
        setField(term9161, term9161.getClass(), "parameters", term9231);
        term9395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9535, term9535.getClass(), "jsType", null);
        setField(term9535, term9535.getClass(), "next", term9605);
        setField(term9465, term9465.getClass(), "first", term9535);
        setField(term9395, term9395.getClass(), "parameters", term9465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term9395;
        args[1] = false;
        callMethod(klass, "hasEqualParameters", argTypes, term9161, args);
    }

};


