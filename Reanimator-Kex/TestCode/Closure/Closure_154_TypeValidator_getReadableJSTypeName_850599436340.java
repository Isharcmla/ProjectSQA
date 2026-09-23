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

public class TypeValidator_getReadableJSTypeName_850599436340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123959;
     Object term124051;

    public TypeValidator_getReadableJSTypeName_850599436340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123959 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term124051 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term124143 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term124267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term124353 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term124051, term124051.getClass(), "type", 33);
        setField(term124143, term124143.getClass(), "jsType", term124267);
        setField(term124051, term124051.getClass(), "first", term124143);
        setField(term124051, term124051.getClass(), "last", term124353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term124051;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term123959, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


