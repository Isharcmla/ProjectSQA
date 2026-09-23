package com.google.javascript.jscomp;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83011;
     Object term83103;

    public TypeValidator_getReadableJSTypeName_850599436260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83011 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term83103 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83195 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term83411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term83103, term83103.getClass(), "type", 33);
        setField(term83195, term83195.getClass(), "jsType", term83319);
        setField(term83103, term83103.getClass(), "first", term83195);
        setField(term83103, term83103.getClass(), "last", term83411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term83103;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term83011, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


